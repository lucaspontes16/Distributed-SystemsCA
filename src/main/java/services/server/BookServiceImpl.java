package services.server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.bookservice.Book;
import com.example.bookservice.BookServiceGrpc;
import com.example.bookservice.IndexBookRequest;
import com.example.bookservice.IndexBookResponse;
import com.example.bookservice.SearchBooksRequest;
import com.example.bookservice.SearchBooksResponse;
import com.example.bookservice.UpdateBookRequest;
import com.example.bookservice.UpdateBookResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {

    private final ConcurrentHashMap<String, Book> bookIndex = new ConcurrentHashMap<>();

    @Override
    public void indexBook(IndexBookRequest request, StreamObserver<IndexBookResponse> responseObserver) {
        Book book = Book.newBuilder()
                .setBookID(request.getBookID())
                .setBookTitle(request.getBookTitle())
                .setAuthor(request.getAuthor())
                .setDescription(request.getDescription())
                .build();
        bookIndex.put(book.getBookID(), book);

        IndexBookResponse response = IndexBookResponse.newBuilder()
                .setMessage("Book indexed successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateBook(UpdateBookRequest request, StreamObserver<UpdateBookResponse> responseObserver) {
        Book book = bookIndex.get(request.getBookID());
        if (book != null) {
            book = Book.newBuilder()
                    .setBookID(request.getBookID())
                    .setBookTitle(request.getBookTitle())
                    .setAuthor(request.getAuthor())
                    .setDescription(request.getDescription())
                    .build();
            bookIndex.put(book.getBookID(), book);

            UpdateBookResponse response = UpdateBookResponse.newBuilder()
                    .setMessage("Book information was updated successfully")
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onNext(UpdateBookResponse.newBuilder()
                    .setMessage("Book information was not found")
                    .build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void searchBooks(SearchBooksRequest request, StreamObserver<SearchBooksResponse> responseObserver) {
        List<Book> results = new ArrayList<>();
        for (Book book : bookIndex.values()) {
            if (book.getBookTitle().contains(request.getQuery()) || book.getAuthor().contains(request.getQuery())) {
                results.add(book);
            }
        }
        
        int start = (request.getPageNumber() - 1) * request.getPageSize();
        int end = Math.min(start + request.getPageSize(), results.size());

        for (int i = start; i < end; i++) {
            SearchBooksResponse response = SearchBooksResponse.newBuilder()
                    .addBooks(results.get(i))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new BookServiceImpl())
                .build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}
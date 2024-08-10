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

import client.services.JmDNSManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

//class that implements the BookServiceGrpcinterface
public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {

    private final ConcurrentHashMap<String, Book> bookIndex = new ConcurrentHashMap<>();

    //implementation of the indexBook method
    @Override
    public void indexBook(IndexBookRequest request, StreamObserver<IndexBookResponse> responseObserver) {
        //create a new book
    	Book book = Book.newBuilder()
                .setBookID(request.getBookID())
                .setBookTitle(request.getBookTitle())
                .setAuthor(request.getAuthor())
                .setDescription(request.getDescription())
                .build();
    	//store the book in the index 
        bookIndex.put(book.getBookID(), book);

        //index book succes message 
        IndexBookResponse response = IndexBookResponse.newBuilder()
                .setMessage("Book indexed successfully")
                .build();

        //response to the client 
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Update book implementation 
    @Override
    public void updateBook(UpdateBookRequest request, StreamObserver<UpdateBookResponse> responseObserver) {
       // Retrieve the book from the index map
    	Book book = bookIndex.get(request.getBookID());
        if (book != null) {
           // Update the book fields 
        	book = Book.newBuilder()
                    .setBookID(request.getBookID())
                    .setBookTitle(request.getBookTitle())
                    .setAuthor(request.getAuthor())
                    .setDescription(request.getDescription())
                    .build();
        	//stores the updated book
            bookIndex.put(book.getBookID(), book);

            //succesful update response message  
            UpdateBookResponse response = UpdateBookResponse.newBuilder()
                    .setMessage("Book information was updated successfully")
                    .build();
            responseObserver.onNext(response);
        } else {
        	//update book error message 
            responseObserver.onNext(UpdateBookResponse.newBuilder()
                    .setMessage("Book information was not found")
                    .build());
        }
        responseObserver.onCompleted();
    }

    //Search book implementation method 
    @Override
    public void searchBooks(SearchBooksRequest request, StreamObserver<SearchBooksResponse> responseObserver) {
        //List to search the results 
    	List<Book> results = new ArrayList<>();
    	//Iterates over the bookIndex to search for books 
        for (Book book : bookIndex.values()) {
            if (book.getBookTitle().contains(request.getQuery()) || book.getAuthor().contains(request.getQuery())) {
                results.add(book);
            }
        }
        
        //Calculate the start and end indices for pagination
        int start = (request.getPageNumber() - 1) * request.getPageSize();
        int end = Math.min(start + request.getPageSize(), results.size());

        //Send the search results to the client 
        for (int i = start; i < end; i++) {
            SearchBooksResponse response = SearchBooksResponse.newBuilder()
                    .addBooks(results.get(i))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    //Main method to start the gRPC server 
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new BookServiceImpl())
                .build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
    // create an instance of JmDNS
    private JmDNSManager jmDNSManager;
    public BookServiceImpl() {
        jmDNSManager = new JmDNSManager();
        try {
            jmDNSManager.registerService("BookService", 8080);
        } catch (IOException e) {
            System.out.println("Error registering service with JmDNS: " + e.getMessage());
        }
}

}
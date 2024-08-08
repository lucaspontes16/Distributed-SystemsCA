package client.services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.bookservice.BookServiceGrpc;
import com.example.bookservice.IndexBookRequest;
import com.example.bookservice.IndexBookResponse;
import com.example.bookservice.SearchBooksRequest;
import com.example.bookservice.UpdateBookRequest;
import com.example.bookservice.UpdateBookResponse;

public class BookServiceClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);

        // Index a book
        IndexBookRequest indexBookRequest = IndexBookRequest.newBuilder()
                .setBookID("1")
                .setBookTitle("The Great Gatsby")
                .setAuthor("F. Scott Fitzgerald")
                .setDescription("A novel set in the 1920s")
                .build();
        IndexBookResponse indexBookResponse = stub.indexBook(indexBookRequest);
        System.out.println(indexBookResponse.getMessage());

        // Update a book
        UpdateBookRequest updateBookRequest = UpdateBookRequest.newBuilder()
                .setBookID("1")
                .setBookTitle("The Great Gatsby - Revised")
                .setAuthor("F. Scott Fitzgerald")
                .setDescription("A revised novel set in the 1920s")
                .build();
        UpdateBookResponse updateBookResponse = stub.updateBook(updateBookRequest);
        System.out.println(updateBookResponse.getMessage());

        // Search for books
        SearchBooksRequest searchBooksRequest = SearchBooksRequest.newBuilder()
                .setQuery("Gatsby")
                .setPageNumber(1)
                .setPageSize(10)
                .build();
        
        stub.searchBooks(searchBooksRequest).forEachRemaining(response -> {
            response.getBooksList().forEach(book -> {
                System.out.println("Book found: " + book.getBookTitle());
            });
        });

        channel.shutdown();
    }
}
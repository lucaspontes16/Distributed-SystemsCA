package client.services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

import javax.jmdns.ServiceInfo;

import com.example.bookservice.BookServiceGrpc;
import com.example.bookservice.IndexBookRequest;
import com.example.bookservice.IndexBookResponse;
import com.example.bookservice.SearchBooksRequest;
import com.example.bookservice.UpdateBookRequest;
import com.example.bookservice.UpdateBookResponse;

public class BookServiceClient {

    public static void main(String[] args) throws IOException {
    	//JmDNS manager to discover the service 
    	 JmDNSManager jmDNSManager = new JmDNSManager();
         try {
        	 //Discover the book Service 
             ServiceInfo serviceInfo = jmDNSManager.discoverService("BookService");
             
             if (serviceInfo != null) {
            	 //channel to manager to conects to the service          
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);

        // Index a book
        IndexBookRequest indexBookRequest = IndexBookRequest.newBuilder()
                .setBookID("1")
                .setBookTitle("Harry Potter - ‎Order of the Phoenix")
                .setAuthor("J.K Rowling")
                .setDescription("The novels chronicle the lives of a young wizard")
                .build();
        IndexBookResponse indexBookResponse = stub.indexBook(indexBookRequest);
        System.out.println(indexBookResponse.getMessage());

        // Update a book
        UpdateBookRequest updateBookRequest = UpdateBookRequest.newBuilder()
                .setBookID("1")
                .setBookTitle("Harry Potter - Revised")
                .setAuthor("J.K Rowling")
                .setDescription("The novels chronicle the lives of a young wizard")
                .build();
        UpdateBookResponse updateBookResponse = stub.updateBook(updateBookRequest);
        System.out.println(updateBookResponse.getMessage());

        // Search for books
        SearchBooksRequest searchBooksRequest = SearchBooksRequest.newBuilder()
                .setQuery("Harry")
                .setPageNumber(1)
                .setPageSize(10)
                .build();
        
        stub.searchBooks(searchBooksRequest).forEachRemaining(response -> {
            response.getBooksList().forEach(book -> {
                System.out.println("Book found: " + book.getBookTitle());
            });
        });

        //closes the channel 
        channel.shutdown();
             } else {
                 System.out.println("Service not found.");
             }
         } catch (IOException e) {
             System.out.println("Error discovering service with JmDNS: " + e.getMessage());
         } finally {
        	 //close the JmDNS manager 
             jmDNSManager.close();
         }
    }
}

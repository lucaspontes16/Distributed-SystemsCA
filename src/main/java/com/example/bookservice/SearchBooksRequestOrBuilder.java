// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_service.proto

package com.example.bookservice;

public interface SearchBooksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchBooksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string query = 1;</code>
   */
  java.lang.String getQuery();
  /**
   * <code>string query = 1;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <code>int32 page_number = 2;</code>
   */
  int getPageNumber();

  /**
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();
}

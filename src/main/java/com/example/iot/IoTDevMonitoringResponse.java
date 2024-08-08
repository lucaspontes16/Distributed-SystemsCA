// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iot_integration_service.proto

package com.example.iot;

/**
 * Protobuf type {@code IoTDevMonitoringResponse}
 */
public  final class IoTDevMonitoringResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IoTDevMonitoringResponse)
    IoTDevMonitoringResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IoTDevMonitoringResponse.newBuilder() to construct.
  private IoTDevMonitoringResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IoTDevMonitoringResponse() {
    sensorId_ = "";
    sensorType_ = "";
    sensorStatus_ = "";
    tempValue_ = 0D;
    lightValue_ = 0D;
    noiseLevel_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IoTDevMonitoringResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sensorId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sensorType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sensorStatus_ = s;
            break;
          }
          case 33: {

            tempValue_ = input.readDouble();
            break;
          }
          case 41: {

            lightValue_ = input.readDouble();
            break;
          }
          case 49: {

            noiseLevel_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.iot.IoTIntegrationServiceProto.internal_static_IoTDevMonitoringResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.iot.IoTIntegrationServiceProto.internal_static_IoTDevMonitoringResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.iot.IoTDevMonitoringResponse.class, com.example.iot.IoTDevMonitoringResponse.Builder.class);
  }

  public static final int SENSORID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sensorId_;
  /**
   * <code>string sensorId = 1;</code>
   */
  public java.lang.String getSensorId() {
    java.lang.Object ref = sensorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sensorId_ = s;
      return s;
    }
  }
  /**
   * <code>string sensorId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSensorIdBytes() {
    java.lang.Object ref = sensorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sensorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENSORTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object sensorType_;
  /**
   * <code>string sensorType = 2;</code>
   */
  public java.lang.String getSensorType() {
    java.lang.Object ref = sensorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sensorType_ = s;
      return s;
    }
  }
  /**
   * <code>string sensorType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSensorTypeBytes() {
    java.lang.Object ref = sensorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sensorType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENSORSTATUS_FIELD_NUMBER = 3;
  private volatile java.lang.Object sensorStatus_;
  /**
   * <code>string sensorStatus = 3;</code>
   */
  public java.lang.String getSensorStatus() {
    java.lang.Object ref = sensorStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sensorStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string sensorStatus = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSensorStatusBytes() {
    java.lang.Object ref = sensorStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sensorStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPVALUE_FIELD_NUMBER = 4;
  private double tempValue_;
  /**
   * <code>double tempValue = 4;</code>
   */
  public double getTempValue() {
    return tempValue_;
  }

  public static final int LIGHTVALUE_FIELD_NUMBER = 5;
  private double lightValue_;
  /**
   * <code>double lightValue = 5;</code>
   */
  public double getLightValue() {
    return lightValue_;
  }

  public static final int NOISELEVEL_FIELD_NUMBER = 6;
  private double noiseLevel_;
  /**
   * <code>double noiseLevel = 6;</code>
   */
  public double getNoiseLevel() {
    return noiseLevel_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSensorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sensorId_);
    }
    if (!getSensorTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sensorType_);
    }
    if (!getSensorStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sensorStatus_);
    }
    if (tempValue_ != 0D) {
      output.writeDouble(4, tempValue_);
    }
    if (lightValue_ != 0D) {
      output.writeDouble(5, lightValue_);
    }
    if (noiseLevel_ != 0D) {
      output.writeDouble(6, noiseLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSensorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sensorId_);
    }
    if (!getSensorTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sensorType_);
    }
    if (!getSensorStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sensorStatus_);
    }
    if (tempValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, tempValue_);
    }
    if (lightValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, lightValue_);
    }
    if (noiseLevel_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, noiseLevel_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.iot.IoTDevMonitoringResponse)) {
      return super.equals(obj);
    }
    com.example.iot.IoTDevMonitoringResponse other = (com.example.iot.IoTDevMonitoringResponse) obj;

    boolean result = true;
    result = result && getSensorId()
        .equals(other.getSensorId());
    result = result && getSensorType()
        .equals(other.getSensorType());
    result = result && getSensorStatus()
        .equals(other.getSensorStatus());
    result = result && (
        java.lang.Double.doubleToLongBits(getTempValue())
        == java.lang.Double.doubleToLongBits(
            other.getTempValue()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLightValue())
        == java.lang.Double.doubleToLongBits(
            other.getLightValue()));
    result = result && (
        java.lang.Double.doubleToLongBits(getNoiseLevel())
        == java.lang.Double.doubleToLongBits(
            other.getNoiseLevel()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SENSORID_FIELD_NUMBER;
    hash = (53 * hash) + getSensorId().hashCode();
    hash = (37 * hash) + SENSORTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSensorType().hashCode();
    hash = (37 * hash) + SENSORSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getSensorStatus().hashCode();
    hash = (37 * hash) + TEMPVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTempValue()));
    hash = (37 * hash) + LIGHTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLightValue()));
    hash = (37 * hash) + NOISELEVEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNoiseLevel()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.iot.IoTDevMonitoringResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.iot.IoTDevMonitoringResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code IoTDevMonitoringResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IoTDevMonitoringResponse)
      com.example.iot.IoTDevMonitoringResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.iot.IoTIntegrationServiceProto.internal_static_IoTDevMonitoringResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.iot.IoTIntegrationServiceProto.internal_static_IoTDevMonitoringResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.iot.IoTDevMonitoringResponse.class, com.example.iot.IoTDevMonitoringResponse.Builder.class);
    }

    // Construct using com.example.iot.IoTDevMonitoringResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sensorId_ = "";

      sensorType_ = "";

      sensorStatus_ = "";

      tempValue_ = 0D;

      lightValue_ = 0D;

      noiseLevel_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.iot.IoTIntegrationServiceProto.internal_static_IoTDevMonitoringResponse_descriptor;
    }

    @java.lang.Override
    public com.example.iot.IoTDevMonitoringResponse getDefaultInstanceForType() {
      return com.example.iot.IoTDevMonitoringResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.iot.IoTDevMonitoringResponse build() {
      com.example.iot.IoTDevMonitoringResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.iot.IoTDevMonitoringResponse buildPartial() {
      com.example.iot.IoTDevMonitoringResponse result = new com.example.iot.IoTDevMonitoringResponse(this);
      result.sensorId_ = sensorId_;
      result.sensorType_ = sensorType_;
      result.sensorStatus_ = sensorStatus_;
      result.tempValue_ = tempValue_;
      result.lightValue_ = lightValue_;
      result.noiseLevel_ = noiseLevel_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.iot.IoTDevMonitoringResponse) {
        return mergeFrom((com.example.iot.IoTDevMonitoringResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.iot.IoTDevMonitoringResponse other) {
      if (other == com.example.iot.IoTDevMonitoringResponse.getDefaultInstance()) return this;
      if (!other.getSensorId().isEmpty()) {
        sensorId_ = other.sensorId_;
        onChanged();
      }
      if (!other.getSensorType().isEmpty()) {
        sensorType_ = other.sensorType_;
        onChanged();
      }
      if (!other.getSensorStatus().isEmpty()) {
        sensorStatus_ = other.sensorStatus_;
        onChanged();
      }
      if (other.getTempValue() != 0D) {
        setTempValue(other.getTempValue());
      }
      if (other.getLightValue() != 0D) {
        setLightValue(other.getLightValue());
      }
      if (other.getNoiseLevel() != 0D) {
        setNoiseLevel(other.getNoiseLevel());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.iot.IoTDevMonitoringResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.iot.IoTDevMonitoringResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sensorId_ = "";
    /**
     * <code>string sensorId = 1;</code>
     */
    public java.lang.String getSensorId() {
      java.lang.Object ref = sensorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sensorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sensorId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSensorIdBytes() {
      java.lang.Object ref = sensorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sensorId = 1;</code>
     */
    public Builder setSensorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sensorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sensorId = 1;</code>
     */
    public Builder clearSensorId() {
      
      sensorId_ = getDefaultInstance().getSensorId();
      onChanged();
      return this;
    }
    /**
     * <code>string sensorId = 1;</code>
     */
    public Builder setSensorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sensorId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sensorType_ = "";
    /**
     * <code>string sensorType = 2;</code>
     */
    public java.lang.String getSensorType() {
      java.lang.Object ref = sensorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sensorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sensorType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSensorTypeBytes() {
      java.lang.Object ref = sensorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sensorType = 2;</code>
     */
    public Builder setSensorType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sensorType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sensorType = 2;</code>
     */
    public Builder clearSensorType() {
      
      sensorType_ = getDefaultInstance().getSensorType();
      onChanged();
      return this;
    }
    /**
     * <code>string sensorType = 2;</code>
     */
    public Builder setSensorTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sensorType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sensorStatus_ = "";
    /**
     * <code>string sensorStatus = 3;</code>
     */
    public java.lang.String getSensorStatus() {
      java.lang.Object ref = sensorStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sensorStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sensorStatus = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSensorStatusBytes() {
      java.lang.Object ref = sensorStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sensorStatus = 3;</code>
     */
    public Builder setSensorStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sensorStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sensorStatus = 3;</code>
     */
    public Builder clearSensorStatus() {
      
      sensorStatus_ = getDefaultInstance().getSensorStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string sensorStatus = 3;</code>
     */
    public Builder setSensorStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sensorStatus_ = value;
      onChanged();
      return this;
    }

    private double tempValue_ ;
    /**
     * <code>double tempValue = 4;</code>
     */
    public double getTempValue() {
      return tempValue_;
    }
    /**
     * <code>double tempValue = 4;</code>
     */
    public Builder setTempValue(double value) {
      
      tempValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double tempValue = 4;</code>
     */
    public Builder clearTempValue() {
      
      tempValue_ = 0D;
      onChanged();
      return this;
    }

    private double lightValue_ ;
    /**
     * <code>double lightValue = 5;</code>
     */
    public double getLightValue() {
      return lightValue_;
    }
    /**
     * <code>double lightValue = 5;</code>
     */
    public Builder setLightValue(double value) {
      
      lightValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double lightValue = 5;</code>
     */
    public Builder clearLightValue() {
      
      lightValue_ = 0D;
      onChanged();
      return this;
    }

    private double noiseLevel_ ;
    /**
     * <code>double noiseLevel = 6;</code>
     */
    public double getNoiseLevel() {
      return noiseLevel_;
    }
    /**
     * <code>double noiseLevel = 6;</code>
     */
    public Builder setNoiseLevel(double value) {
      
      noiseLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double noiseLevel = 6;</code>
     */
    public Builder clearNoiseLevel() {
      
      noiseLevel_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:IoTDevMonitoringResponse)
  }

  // @@protoc_insertion_point(class_scope:IoTDevMonitoringResponse)
  private static final com.example.iot.IoTDevMonitoringResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.iot.IoTDevMonitoringResponse();
  }

  public static com.example.iot.IoTDevMonitoringResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IoTDevMonitoringResponse>
      PARSER = new com.google.protobuf.AbstractParser<IoTDevMonitoringResponse>() {
    @java.lang.Override
    public IoTDevMonitoringResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IoTDevMonitoringResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IoTDevMonitoringResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IoTDevMonitoringResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.iot.IoTDevMonitoringResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


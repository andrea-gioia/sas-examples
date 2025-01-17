// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v09-context-semantic-vocabulary.proto
// Protobuf Java Version: 4.29.3

package vcb.sem;

public final class V09ContextSemanticVocabulary {
  private V09ContextSemanticVocabulary() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      V09ContextSemanticVocabulary.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(vcb.sem.V09ContextSemanticVocabulary.sk);
    registry.add(vcb.sem.V09ContextSemanticVocabulary.mk);
    registry.add(vcb.sem.V09ContextSemanticVocabulary.fk);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SemanticContextVocabularyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:vcb.sem.SemanticContextVocabulary)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return Whether the semanticContext field is set.
     */
    boolean hasSemanticContext();
    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return The semanticContext.
     */
    java.lang.String getSemanticContext();
    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return The bytes for semanticContext.
     */
    com.google.protobuf.ByteString
        getSemanticContextBytes();
  }
  /**
   * <pre>
   * *
   * Semantic Context Annotations Vocabulary Proto
   * (Version 1.0.0-DRAFT)
   *
   * The Semantic Context Annotations Vocabulary, defined as an extension of the SAS, provides commonly used metadata 
   * to syntactly contextualize schema element.
   *
   * Vocabulary url: 
   * - https://dpds.opendatamesh.org/specifications/sas/1.0.0-DRAFT/vocab/context-semantic
   *
   * Authors: 
   * - Andrea Gioia
   *
   * LICENCE: 
   * - Apache License Version 2.0 (https://github.com/opendatamesh-initiative/odm-specification-schema-annotations/blob/main/LICENSE)
   * </pre>
   *
   * Protobuf type {@code vcb.sem.SemanticContextVocabulary}
   */
  public static final class SemanticContextVocabulary extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:vcb.sem.SemanticContextVocabulary)
      SemanticContextVocabularyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        SemanticContextVocabulary.class.getName());
    }
    // Use SemanticContextVocabulary.newBuilder() to construct.
    private SemanticContextVocabulary(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SemanticContextVocabulary() {
      semanticContext_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vcb.sem.V09ContextSemanticVocabulary.internal_static_vcb_sem_SemanticContextVocabulary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vcb.sem.V09ContextSemanticVocabulary.internal_static_vcb_sem_SemanticContextVocabulary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.class, vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.Builder.class);
    }

    private int bitField0_;
    public static final int SEMANTICCONTEXT_FIELD_NUMBER = 92000;
    @SuppressWarnings("serial")
    private volatile java.lang.Object semanticContext_ = "";
    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return Whether the semanticContext field is set.
     */
    @java.lang.Override
    public boolean hasSemanticContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return The semanticContext.
     */
    @java.lang.Override
    public java.lang.String getSemanticContext() {
      java.lang.Object ref = semanticContext_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        semanticContext_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Keywords applicable only to schema and objects (starting from x3000)
     * </pre>
     *
     * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
     * @return The bytes for semanticContext.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSemanticContextBytes() {
      java.lang.Object ref = semanticContext_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        semanticContext_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 92000, semanticContext_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(92000, semanticContext_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary)) {
        return super.equals(obj);
      }
      vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary other = (vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary) obj;

      if (hasSemanticContext() != other.hasSemanticContext()) return false;
      if (hasSemanticContext()) {
        if (!getSemanticContext()
            .equals(other.getSemanticContext())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSemanticContext()) {
        hash = (37 * hash) + SEMANTICCONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getSemanticContext().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * *
     * Semantic Context Annotations Vocabulary Proto
     * (Version 1.0.0-DRAFT)
     *
     * The Semantic Context Annotations Vocabulary, defined as an extension of the SAS, provides commonly used metadata 
     * to syntactly contextualize schema element.
     *
     * Vocabulary url: 
     * - https://dpds.opendatamesh.org/specifications/sas/1.0.0-DRAFT/vocab/context-semantic
     *
     * Authors: 
     * - Andrea Gioia
     *
     * LICENCE: 
     * - Apache License Version 2.0 (https://github.com/opendatamesh-initiative/odm-specification-schema-annotations/blob/main/LICENSE)
     * </pre>
     *
     * Protobuf type {@code vcb.sem.SemanticContextVocabulary}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:vcb.sem.SemanticContextVocabulary)
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabularyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return vcb.sem.V09ContextSemanticVocabulary.internal_static_vcb_sem_SemanticContextVocabulary_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return vcb.sem.V09ContextSemanticVocabulary.internal_static_vcb_sem_SemanticContextVocabulary_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.class, vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.Builder.class);
      }

      // Construct using vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        semanticContext_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return vcb.sem.V09ContextSemanticVocabulary.internal_static_vcb_sem_SemanticContextVocabulary_descriptor;
      }

      @java.lang.Override
      public vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary getDefaultInstanceForType() {
        return vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.getDefaultInstance();
      }

      @java.lang.Override
      public vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary build() {
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary buildPartial() {
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary result = new vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.semanticContext_ = semanticContext_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary) {
          return mergeFrom((vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary other) {
        if (other == vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.getDefaultInstance()) return this;
        if (other.hasSemanticContext()) {
          semanticContext_ = other.semanticContext_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 736002: {
                semanticContext_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 736002
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object semanticContext_ = "";
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @return Whether the semanticContext field is set.
       */
      public boolean hasSemanticContext() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @return The semanticContext.
       */
      public java.lang.String getSemanticContext() {
        java.lang.Object ref = semanticContext_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          semanticContext_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @return The bytes for semanticContext.
       */
      public com.google.protobuf.ByteString
          getSemanticContextBytes() {
        java.lang.Object ref = semanticContext_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          semanticContext_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @param value The semanticContext to set.
       * @return This builder for chaining.
       */
      public Builder setSemanticContext(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        semanticContext_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @return This builder for chaining.
       */
      public Builder clearSemanticContext() {
        semanticContext_ = getDefaultInstance().getSemanticContext();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Keywords applicable only to schema and objects (starting from x3000)
       * </pre>
       *
       * <code>optional string semanticContext = 92000 [targets = TARGET_TYPE_MESSAGE];</code>
       * @param value The bytes for semanticContext to set.
       * @return This builder for chaining.
       */
      public Builder setSemanticContextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        semanticContext_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:vcb.sem.SemanticContextVocabulary)
    }

    // @@protoc_insertion_point(class_scope:vcb.sem.SemanticContextVocabulary)
    private static final vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary();
    }

    public static vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SemanticContextVocabulary>
        PARSER = new com.google.protobuf.AbstractParser<SemanticContextVocabulary>() {
      @java.lang.Override
      public SemanticContextVocabulary parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SemanticContextVocabulary> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SemanticContextVocabulary> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int SK_FIELD_NUMBER = 99997;
  /**
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary> sk = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.class,
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.getDefaultInstance());
  public static final int MK_FIELD_NUMBER = 99998;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary> mk = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.class,
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.getDefaultInstance());
  public static final int FK_FIELD_NUMBER = 99999;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary> fk = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.class,
        vcb.sem.V09ContextSemanticVocabulary.SemanticContextVocabulary.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vcb_sem_SemanticContextVocabulary_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_vcb_sem_SemanticContextVocabulary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%v09-context-semantic-vocabulary.proto\022" +
      "\007vcb.sem\032 google/protobuf/descriptor.pro" +
      "to\"T\n\031SemanticContextVocabulary\022#\n\017seman" +
      "ticContext\030\340\316\005 \001(\tB\003\230\001\003H\000\210\001\001B\022\n\020_semanti" +
      "cContext:N\n\002sk\022\034.google.protobuf.FileOpt" +
      "ions\030\235\215\006 \001(\0132\".vcb.sem.SemanticContextVo" +
      "cabulary:Q\n\002mk\022\037.google.protobuf.Message" +
      "Options\030\236\215\006 \001(\0132\".vcb.sem.SemanticContex" +
      "tVocabulary:O\n\002fk\022\035.google.protobuf.Fiel" +
      "dOptions\030\237\215\006 \001(\0132\".vcb.sem.SemanticConte" +
      "xtVocabularyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_vcb_sem_SemanticContextVocabulary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_vcb_sem_SemanticContextVocabulary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_vcb_sem_SemanticContextVocabulary_descriptor,
        new java.lang.String[] { "SemanticContext", });
    sk.internalInit(descriptor.getExtensions().get(0));
    mk.internalInit(descriptor.getExtensions().get(1));
    fk.internalInit(descriptor.getExtensions().get(2));
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/glassfish/hk2/xml/test/pbuf/pc1/ThingTwoBean.proto

package org.glassfish.hk2.xml.test.pbuf.pc1;

public final class ThingTwoBeanOuterClass {
  private ThingTwoBeanOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ThingTwoBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean}
   */
  public  static final class ThingTwoBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean)
      ThingTwoBeanOrBuilder {
    // Use ThingTwoBean.newBuilder() to construct.
    private ThingTwoBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ThingTwoBean() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ThingTwoBean(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.class, org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean)) {
        return super.equals(obj);
      }
      org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean other = (org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean)
        org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.class, org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.Builder.class);
      }

      // Construct using org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor;
      }

      public org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean getDefaultInstanceForType() {
        return org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.getDefaultInstance();
      }

      public org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean build() {
        org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean buildPartial() {
        org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean result = new org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean) {
          return mergeFrom((org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean other) {
        if (other == org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean)
    }

    // @@protoc_insertion_point(class_scope:org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBean)
    private static final org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean();
    }

    public static org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ThingTwoBean>
        PARSER = new com.google.protobuf.AbstractParser<ThingTwoBean>() {
      public ThingTwoBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ThingTwoBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ThingTwoBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ThingTwoBean> getParserForType() {
      return PARSER;
    }

    public org.glassfish.hk2.xml.test.pbuf.pc1.ThingTwoBeanOuterClass.ThingTwoBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6org/glassfish/hk2/xml/test/pbuf/pc1/Th" +
      "ingTwoBean.proto\022#org.glassfish.hk2.xml." +
      "test.pbuf.pc1\"\016\n\014ThingTwoBeanb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_glassfish_hk2_xml_test_pbuf_pc1_ThingTwoBean_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

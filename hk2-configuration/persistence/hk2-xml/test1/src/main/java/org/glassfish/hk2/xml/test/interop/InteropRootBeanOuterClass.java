// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/glassfish/hk2/xml/test/interop/InteropRootBean.proto

package org.glassfish.hk2.xml.test.interop;

public final class InteropRootBeanOuterClass {
  private InteropRootBeanOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InteropRootBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.glassfish.hk2.xml.test.interop.InteropRootBean)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> 
        getChildList();
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean getChild(int index);
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    int getChildCount();
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    java.util.List<? extends org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder> 
        getChildOrBuilderList();
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder getChildOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code org.glassfish.hk2.xml.test.interop.InteropRootBean}
   */
  public  static final class InteropRootBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.glassfish.hk2.xml.test.interop.InteropRootBean)
      InteropRootBeanOrBuilder {
    // Use InteropRootBean.newBuilder() to construct.
    private InteropRootBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InteropRootBean() {
      child_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private InteropRootBean(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                child_ = new java.util.ArrayList<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean>();
                mutable_bitField0_ |= 0x00000001;
              }
              child_.add(
                  input.readMessage(org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          child_ = java.util.Collections.unmodifiableList(child_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.class, org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.Builder.class);
    }

    public static final int CHILD_FIELD_NUMBER = 1;
    private java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> child_;
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    public java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> getChildList() {
      return child_;
    }
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    public java.util.List<? extends org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder> 
        getChildOrBuilderList() {
      return child_;
    }
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    public int getChildCount() {
      return child_.size();
    }
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean getChild(int index) {
      return child_.get(index);
    }
    /**
     * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
     */
    public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder getChildOrBuilder(
        int index) {
      return child_.get(index);
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
      for (int i = 0; i < child_.size(); i++) {
        output.writeMessage(1, child_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < child_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, child_.get(i));
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean)) {
        return super.equals(obj);
      }
      org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean other = (org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean) obj;

      boolean result = true;
      result = result && getChildList()
          .equals(other.getChildList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getChildCount() > 0) {
        hash = (37 * hash) + CHILD_FIELD_NUMBER;
        hash = (53 * hash) + getChildList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parseFrom(
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
    public static Builder newBuilder(org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean prototype) {
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
     * Protobuf type {@code org.glassfish.hk2.xml.test.interop.InteropRootBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.glassfish.hk2.xml.test.interop.InteropRootBean)
        org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.class, org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.Builder.class);
      }

      // Construct using org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.newBuilder()
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
          getChildFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (childBuilder_ == null) {
          child_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          childBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor;
      }

      public org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean getDefaultInstanceForType() {
        return org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.getDefaultInstance();
      }

      public org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean build() {
        org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean buildPartial() {
        org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean result = new org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean(this);
        int from_bitField0_ = bitField0_;
        if (childBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            child_ = java.util.Collections.unmodifiableList(child_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.child_ = child_;
        } else {
          result.child_ = childBuilder_.build();
        }
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
        if (other instanceof org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean) {
          return mergeFrom((org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean other) {
        if (other == org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean.getDefaultInstance()) return this;
        if (childBuilder_ == null) {
          if (!other.child_.isEmpty()) {
            if (child_.isEmpty()) {
              child_ = other.child_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChildIsMutable();
              child_.addAll(other.child_);
            }
            onChanged();
          }
        } else {
          if (!other.child_.isEmpty()) {
            if (childBuilder_.isEmpty()) {
              childBuilder_.dispose();
              childBuilder_ = null;
              child_ = other.child_;
              bitField0_ = (bitField0_ & ~0x00000001);
              childBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChildFieldBuilder() : null;
            } else {
              childBuilder_.addAllMessages(other.child_);
            }
          }
        }
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
        org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> child_ =
        java.util.Collections.emptyList();
      private void ensureChildIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          child_ = new java.util.ArrayList<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean>(child_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder> childBuilder_;

      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> getChildList() {
        if (childBuilder_ == null) {
          return java.util.Collections.unmodifiableList(child_);
        } else {
          return childBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public int getChildCount() {
        if (childBuilder_ == null) {
          return child_.size();
        } else {
          return childBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean getChild(int index) {
        if (childBuilder_ == null) {
          return child_.get(index);
        } else {
          return childBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder setChild(
          int index, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean value) {
        if (childBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildIsMutable();
          child_.set(index, value);
          onChanged();
        } else {
          childBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder setChild(
          int index, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder builderForValue) {
        if (childBuilder_ == null) {
          ensureChildIsMutable();
          child_.set(index, builderForValue.build());
          onChanged();
        } else {
          childBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder addChild(org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean value) {
        if (childBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildIsMutable();
          child_.add(value);
          onChanged();
        } else {
          childBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder addChild(
          int index, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean value) {
        if (childBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildIsMutable();
          child_.add(index, value);
          onChanged();
        } else {
          childBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder addChild(
          org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder builderForValue) {
        if (childBuilder_ == null) {
          ensureChildIsMutable();
          child_.add(builderForValue.build());
          onChanged();
        } else {
          childBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder addChild(
          int index, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder builderForValue) {
        if (childBuilder_ == null) {
          ensureChildIsMutable();
          child_.add(index, builderForValue.build());
          onChanged();
        } else {
          childBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder addAllChild(
          java.lang.Iterable<? extends org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean> values) {
        if (childBuilder_ == null) {
          ensureChildIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, child_);
          onChanged();
        } else {
          childBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder clearChild() {
        if (childBuilder_ == null) {
          child_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          childBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public Builder removeChild(int index) {
        if (childBuilder_ == null) {
          ensureChildIsMutable();
          child_.remove(index);
          onChanged();
        } else {
          childBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder getChildBuilder(
          int index) {
        return getChildFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder getChildOrBuilder(
          int index) {
        if (childBuilder_ == null) {
          return child_.get(index);  } else {
          return childBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public java.util.List<? extends org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder> 
           getChildOrBuilderList() {
        if (childBuilder_ != null) {
          return childBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(child_);
        }
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder addChildBuilder() {
        return getChildFieldBuilder().addBuilder(
            org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.getDefaultInstance());
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder addChildBuilder(
          int index) {
        return getChildFieldBuilder().addBuilder(
            index, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.getDefaultInstance());
      }
      /**
       * <code>repeated .org.glassfish.hk2.xml.test.interop.InteropChildBean child = 1;</code>
       */
      public java.util.List<org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder> 
           getChildBuilderList() {
        return getChildFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder> 
          getChildFieldBuilder() {
        if (childBuilder_ == null) {
          childBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBean.Builder, org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.InteropChildBeanOrBuilder>(
                  child_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          child_ = null;
        }
        return childBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:org.glassfish.hk2.xml.test.interop.InteropRootBean)
    }

    // @@protoc_insertion_point(class_scope:org.glassfish.hk2.xml.test.interop.InteropRootBean)
    private static final org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean();
    }

    public static org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InteropRootBean>
        PARSER = new com.google.protobuf.AbstractParser<InteropRootBean>() {
      public InteropRootBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new InteropRootBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InteropRootBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InteropRootBean> getParserForType() {
      return PARSER;
    }

    public org.glassfish.hk2.xml.test.interop.InteropRootBeanOuterClass.InteropRootBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8org/glassfish/hk2/xml/test/interop/Int" +
      "eropRootBean.proto\022\"org.glassfish.hk2.xm" +
      "l.test.interop\0329org/glassfish/hk2/xml/te" +
      "st/interop/InteropChildBean.proto\"V\n\017Int" +
      "eropRootBean\022C\n\005child\030\001 \003(\01324.org.glassf" +
      "ish.hk2.xml.test.interop.InteropChildBea" +
      "nb\006proto3"
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
          org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.getDescriptor(),
        }, assigner);
    internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_glassfish_hk2_xml_test_interop_InteropRootBean_descriptor,
        new java.lang.String[] { "Child", });
    org.glassfish.hk2.xml.test.interop.InteropChildBeanOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package hxgm30.proto.buf.common;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_GenericData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_GenericData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_HealthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_HealthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_HealthReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_HealthReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_PingReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_PingReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_VersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_VersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_VersionReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_VersionReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\006common\"\033\n\013GenericData\022\014\n" +
      "\004data\030\001 \001(\t\"\035\n\rHealthRequest\022\014\n\004data\030\001 \001" +
      "(\t\"1\n\013HealthReply\022\022\n\ncomponents\030\001 \001(\t\022\016\n" +
      "\006errors\030\002 \001(\t\"\033\n\013PingRequest\022\014\n\004data\030\001 \001" +
      "(\t\"\031\n\tPingReply\022\014\n\004data\030\001 \001(\t\"\036\n\016Version" +
      "Request\022\014\n\004data\030\001 \001(\t\"l\n\014VersionReply\022\017\n" +
      "\007version\030\001 \001(\t\022\021\n\tbuildDate\030\002 \001(\t\022\021\n\tgit" +
      "Commit\030\003 \001(\t\022\021\n\tgitBranch\030\004 \001(\t\022\022\n\ngitSu" +
      "mmary\030\005 \001(\tB(\n\027hxgm30.proto.buf.commonB\013" +
      "CommonProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_common_GenericData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_GenericData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_GenericData_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_common_HealthRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_common_HealthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_HealthRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_common_HealthReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_common_HealthReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_HealthReply_descriptor,
        new java.lang.String[] { "Components", "Errors", });
    internal_static_common_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_common_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_PingRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_common_PingReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_common_PingReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_PingReply_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_common_VersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_common_VersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_VersionRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_common_VersionReply_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_common_VersionReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_VersionReply_descriptor,
        new java.lang.String[] { "Version", "BuildDate", "GitCommit", "GitBranch", "GitSummary", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

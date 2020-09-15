// Code generated by protoc-gen-go. DO NOT EDIT.
// source: shared/status.proto

package pbshared // import "github.com/gisvr/protocode/shared-go"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import any "github.com/golang/protobuf/ptypes/any"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type InvokeType int32

const (
	InvokeType_UNKOWN    InvokeType = 0
	InvokeType_Read      InvokeType = 1
	InvokeType_Write     InvokeType = 2
	InvokeType_Broadcast InvokeType = 3
)

var InvokeType_name = map[int32]string{
	0: "UNKOWN",
	1: "Read",
	2: "Write",
	3: "Broadcast",
}
var InvokeType_value = map[string]int32{
	"UNKOWN":    0,
	"Read":      1,
	"Write":     2,
	"Broadcast": 3,
}

func (x InvokeType) String() string {
	return proto.EnumName(InvokeType_name, int32(x))
}
func (InvokeType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_status_6c9f783e644f2681, []int{0}
}

type Status struct {
	Message              string     `protobuf:"bytes,1,opt,name=message,proto3" json:"message,omitempty"`
	Code                 int32      `protobuf:"varint,2,opt,name=code,proto3" json:"code,omitempty"`
	Details              []*any.Any `protobuf:"bytes,3,rep,name=details,proto3" json:"details,omitempty"`
	XXX_NoUnkeyedLiteral struct{}   `json:"-"`
	XXX_unrecognized     []byte     `json:"-"`
	XXX_sizecache        int32      `json:"-"`
}

func (m *Status) Reset()         { *m = Status{} }
func (m *Status) String() string { return proto.CompactTextString(m) }
func (*Status) ProtoMessage()    {}
func (*Status) Descriptor() ([]byte, []int) {
	return fileDescriptor_status_6c9f783e644f2681, []int{0}
}
func (m *Status) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Status.Unmarshal(m, b)
}
func (m *Status) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Status.Marshal(b, m, deterministic)
}
func (dst *Status) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Status.Merge(dst, src)
}
func (m *Status) XXX_Size() int {
	return xxx_messageInfo_Status.Size(m)
}
func (m *Status) XXX_DiscardUnknown() {
	xxx_messageInfo_Status.DiscardUnknown(m)
}

var xxx_messageInfo_Status proto.InternalMessageInfo

func (m *Status) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *Status) GetCode() int32 {
	if m != nil {
		return m.Code
	}
	return 0
}

func (m *Status) GetDetails() []*any.Any {
	if m != nil {
		return m.Details
	}
	return nil
}

func init() {
	proto.RegisterType((*Status)(nil), "shared.api.Status")
	proto.RegisterEnum("shared.api.InvokeType", InvokeType_name, InvokeType_value)
}

func init() { proto.RegisterFile("shared/status.proto", fileDescriptor_status_6c9f783e644f2681) }

var fileDescriptor_status_6c9f783e644f2681 = []byte{
	// 263 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x34, 0x8f, 0x4f, 0x4b, 0xc4, 0x30,
	0x14, 0xc4, 0xed, 0xfe, 0xb5, 0x6f, 0x11, 0x4a, 0xf4, 0x50, 0xf7, 0x54, 0x3c, 0x15, 0xc1, 0x14,
	0x5c, 0x6f, 0x7a, 0xb1, 0x37, 0x11, 0x56, 0xa9, 0xca, 0x82, 0x07, 0x21, 0x69, 0xde, 0xc6, 0xe0,
	0xb6, 0xaf, 0x34, 0x59, 0xd9, 0x7e, 0x7b, 0xd9, 0xc6, 0xde, 0x26, 0x93, 0xdf, 0x30, 0x6f, 0xe0,
	0xdc, 0x7e, 0x8b, 0x16, 0x55, 0x66, 0x9d, 0x70, 0x7b, 0xcb, 0x9b, 0x96, 0x1c, 0x31, 0xf0, 0x26,
	0x17, 0x8d, 0x59, 0x5e, 0x6a, 0x22, 0xbd, 0xc3, 0xac, 0xff, 0x91, 0xfb, 0x6d, 0x26, 0xea, 0xce,
	0x63, 0x57, 0x5b, 0x98, 0xbd, 0xf5, 0x31, 0x16, 0xc3, 0xbc, 0x42, 0x6b, 0x85, 0xc6, 0x38, 0x48,
	0x82, 0x34, 0x2c, 0x86, 0x27, 0x63, 0x30, 0x29, 0x49, 0x61, 0x3c, 0x4a, 0x82, 0x74, 0x5a, 0xf4,
	0x9a, 0x71, 0x98, 0x2b, 0x74, 0xc2, 0xec, 0x6c, 0x3c, 0x4e, 0xc6, 0xe9, 0xe2, 0xf6, 0x82, 0xfb,
	0x12, 0x3e, 0x94, 0xf0, 0xc7, 0xba, 0x2b, 0x06, 0xe8, 0xfa, 0x01, 0xe0, 0xa9, 0xfe, 0xa5, 0x1f,
	0x7c, 0xef, 0x1a, 0x64, 0x00, 0xb3, 0x8f, 0xf5, 0xf3, 0xcb, 0x66, 0x1d, 0x9d, 0xb0, 0x53, 0x98,
	0x14, 0x28, 0x54, 0x14, 0xb0, 0x10, 0xa6, 0x9b, 0xd6, 0x38, 0x8c, 0x46, 0xec, 0x0c, 0xc2, 0xbc,
	0x25, 0xa1, 0x4a, 0x61, 0x5d, 0x34, 0xce, 0xbf, 0x60, 0x59, 0x52, 0xc5, 0xa5, 0x91, 0x74, 0xe0,
	0x0a, 0x0f, 0xbe, 0x84, 0xfb, 0x89, 0xf9, 0xc2, 0x2f, 0x78, 0x3d, 0x7a, 0x9f, 0x2b, 0x6d, 0xdc,
	0x3f, 0x58, 0x52, 0x95, 0x49, 0xa3, 0xef, 0xfc, 0xee, 0xe3, 0xd9, 0x5c, 0x1b, 0x97, 0xf9, 0xd4,
	0x8d, 0xa6, 0xfb, 0x46, 0x7a, 0x2d, 0x67, 0x3d, 0xb1, 0xfa, 0x0b, 0x00, 0x00, 0xff, 0xff, 0xd6,
	0xfe, 0x69, 0xc9, 0x4a, 0x01, 0x00, 0x00,
}

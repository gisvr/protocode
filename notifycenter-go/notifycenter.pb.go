// Code generated by protoc-gen-go. DO NOT EDIT.
// source: notifycenter/notifycenter.proto

package pbnotifycenter // import "github.com/gisvr/protocode/notifycenter-go"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import shared_go "github.com/gisvr/protocode/shared-go"
import _ "google.golang.org/genproto/googleapis/api/annotations"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Message struct {
	Subject              string   `protobuf:"bytes,1,opt,name=subject,proto3" json:"subject,omitempty"`
	Pomt                 string   `protobuf:"bytes,2,opt,name=pomt,proto3" json:"pomt,omitempty"`
	Body                 string   `protobuf:"bytes,3,opt,name=body,proto3" json:"body,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Message) Reset()         { *m = Message{} }
func (m *Message) String() string { return proto.CompactTextString(m) }
func (*Message) ProtoMessage()    {}
func (*Message) Descriptor() ([]byte, []int) {
	return fileDescriptor_notifycenter_c543f299964bdd45, []int{0}
}
func (m *Message) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Message.Unmarshal(m, b)
}
func (m *Message) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Message.Marshal(b, m, deterministic)
}
func (dst *Message) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Message.Merge(dst, src)
}
func (m *Message) XXX_Size() int {
	return xxx_messageInfo_Message.Size(m)
}
func (m *Message) XXX_DiscardUnknown() {
	xxx_messageInfo_Message.DiscardUnknown(m)
}

var xxx_messageInfo_Message proto.InternalMessageInfo

func (m *Message) GetSubject() string {
	if m != nil {
		return m.Subject
	}
	return ""
}

func (m *Message) GetPomt() string {
	if m != nil {
		return m.Pomt
	}
	return ""
}

func (m *Message) GetBody() string {
	if m != nil {
		return m.Body
	}
	return ""
}

type NotifyRequest struct {
	AuthId               string   `protobuf:"bytes,1,opt,name=AuthId,proto3" json:"AuthId,omitempty"`
	ChId                 string   `protobuf:"bytes,2,opt,name=ChId,proto3" json:"ChId,omitempty"`
	Msg                  *Message `protobuf:"bytes,3,opt,name=Msg,proto3" json:"Msg,omitempty"`
	Param                []string `protobuf:"bytes,4,rep,name=Param,proto3" json:"Param,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *NotifyRequest) Reset()         { *m = NotifyRequest{} }
func (m *NotifyRequest) String() string { return proto.CompactTextString(m) }
func (*NotifyRequest) ProtoMessage()    {}
func (*NotifyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_notifycenter_c543f299964bdd45, []int{1}
}
func (m *NotifyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NotifyRequest.Unmarshal(m, b)
}
func (m *NotifyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NotifyRequest.Marshal(b, m, deterministic)
}
func (dst *NotifyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NotifyRequest.Merge(dst, src)
}
func (m *NotifyRequest) XXX_Size() int {
	return xxx_messageInfo_NotifyRequest.Size(m)
}
func (m *NotifyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_NotifyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_NotifyRequest proto.InternalMessageInfo

func (m *NotifyRequest) GetAuthId() string {
	if m != nil {
		return m.AuthId
	}
	return ""
}

func (m *NotifyRequest) GetChId() string {
	if m != nil {
		return m.ChId
	}
	return ""
}

func (m *NotifyRequest) GetMsg() *Message {
	if m != nil {
		return m.Msg
	}
	return nil
}

func (m *NotifyRequest) GetParam() []string {
	if m != nil {
		return m.Param
	}
	return nil
}

type NotifyReponse struct {
	Status               *shared_go.Status `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *NotifyReponse) Reset()         { *m = NotifyReponse{} }
func (m *NotifyReponse) String() string { return proto.CompactTextString(m) }
func (*NotifyReponse) ProtoMessage()    {}
func (*NotifyReponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_notifycenter_c543f299964bdd45, []int{2}
}
func (m *NotifyReponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NotifyReponse.Unmarshal(m, b)
}
func (m *NotifyReponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NotifyReponse.Marshal(b, m, deterministic)
}
func (dst *NotifyReponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NotifyReponse.Merge(dst, src)
}
func (m *NotifyReponse) XXX_Size() int {
	return xxx_messageInfo_NotifyReponse.Size(m)
}
func (m *NotifyReponse) XXX_DiscardUnknown() {
	xxx_messageInfo_NotifyReponse.DiscardUnknown(m)
}

var xxx_messageInfo_NotifyReponse proto.InternalMessageInfo

func (m *NotifyReponse) GetStatus() *shared_go.Status {
	if m != nil {
		return m.Status
	}
	return nil
}

func init() {
	proto.RegisterType((*Message)(nil), "notifycenter.api.Message")
	proto.RegisterType((*NotifyRequest)(nil), "notifycenter.api.NotifyRequest")
	proto.RegisterType((*NotifyReponse)(nil), "notifycenter.api.NotifyReponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// NotifyCenterClient is the client API for NotifyCenter service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type NotifyCenterClient interface {
	// 发出通知
	Notify(ctx context.Context, in *NotifyRequest, opts ...grpc.CallOption) (*NotifyReponse, error)
}

type notifyCenterClient struct {
	cc *grpc.ClientConn
}

func NewNotifyCenterClient(cc *grpc.ClientConn) NotifyCenterClient {
	return &notifyCenterClient{cc}
}

func (c *notifyCenterClient) Notify(ctx context.Context, in *NotifyRequest, opts ...grpc.CallOption) (*NotifyReponse, error) {
	out := new(NotifyReponse)
	err := c.cc.Invoke(ctx, "/notifycenter.api.NotifyCenter/Notify", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// NotifyCenterServer is the server API for NotifyCenter service.
type NotifyCenterServer interface {
	// 发出通知
	Notify(context.Context, *NotifyRequest) (*NotifyReponse, error)
}

func RegisterNotifyCenterServer(s *grpc.Server, srv NotifyCenterServer) {
	s.RegisterService(&_NotifyCenter_serviceDesc, srv)
}

func _NotifyCenter_Notify_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(NotifyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotifyCenterServer).Notify(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/notifycenter.api.NotifyCenter/Notify",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotifyCenterServer).Notify(ctx, req.(*NotifyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _NotifyCenter_serviceDesc = grpc.ServiceDesc{
	ServiceName: "notifycenter.api.NotifyCenter",
	HandlerType: (*NotifyCenterServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Notify",
			Handler:    _NotifyCenter_Notify_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "notifycenter/notifycenter.proto",
}

func init() {
	proto.RegisterFile("notifycenter/notifycenter.proto", fileDescriptor_notifycenter_c543f299964bdd45)
}

var fileDescriptor_notifycenter_c543f299964bdd45 = []byte{
	// 343 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x51, 0xcd, 0x4e, 0xf3, 0x30,
	0x10, 0x54, 0x7f, 0xbe, 0x54, 0x75, 0x3f, 0x04, 0x32, 0x3f, 0x0a, 0x15, 0x52, 0xab, 0x9c, 0xaa,
	0x22, 0x6c, 0x51, 0x38, 0xd1, 0x03, 0x2a, 0x3d, 0x21, 0x54, 0x84, 0xc2, 0x8d, 0x9b, 0x9d, 0x18,
	0xd7, 0x88, 0x66, 0xd3, 0xd8, 0x41, 0xf4, 0xc2, 0x81, 0x57, 0xe0, 0xd1, 0x78, 0x05, 0x1e, 0x04,
	0xc5, 0x0e, 0xa2, 0x01, 0x89, 0xdb, 0xce, 0x78, 0x76, 0x76, 0xd6, 0x8b, 0x7a, 0x09, 0x18, 0x75,
	0xbf, 0x8a, 0x44, 0x62, 0x44, 0x46, 0xd7, 0x01, 0x49, 0x33, 0x30, 0x80, 0xb7, 0x2a, 0x1c, 0x4b,
	0x55, 0xf7, 0x40, 0x02, 0xc8, 0x47, 0x41, 0x59, 0xaa, 0x28, 0x4b, 0x12, 0x30, 0xcc, 0x28, 0x48,
	0xb4, 0xd3, 0x77, 0xb7, 0xf5, 0x9c, 0x65, 0x22, 0xa6, 0xda, 0x30, 0x93, 0x97, 0x64, 0x70, 0x85,
	0x5a, 0x33, 0xa1, 0x35, 0x93, 0x02, 0xfb, 0xa8, 0xa5, 0x73, 0xfe, 0x20, 0x22, 0xe3, 0xd7, 0xfa,
	0xb5, 0x41, 0x3b, 0xfc, 0x82, 0x18, 0xa3, 0x66, 0x0a, 0x0b, 0xe3, 0xd7, 0x2d, 0x6d, 0xeb, 0x82,
	0xe3, 0x10, 0xaf, 0xfc, 0x86, 0xe3, 0x8a, 0x3a, 0x78, 0x41, 0x1b, 0xd7, 0x36, 0x53, 0x28, 0x96,
	0xb9, 0xd0, 0x06, 0xef, 0x21, 0x6f, 0x92, 0x9b, 0xf9, 0x65, 0x5c, 0x3a, 0x96, 0xa8, 0x68, 0x9e,
	0x16, 0x6c, 0x69, 0x58, 0xd4, 0xf8, 0x10, 0x35, 0x66, 0x5a, 0x5a, 0xbf, 0xce, 0x68, 0x9f, 0xfc,
	0x5c, 0x8e, 0x94, 0x31, 0xc3, 0x42, 0x85, 0x77, 0xd0, 0xbf, 0x1b, 0x96, 0xb1, 0x85, 0xdf, 0xec,
	0x37, 0x06, 0xed, 0xd0, 0x81, 0x60, 0xfc, 0x3d, 0x3f, 0x85, 0x44, 0x0b, 0x3c, 0x44, 0x9e, 0xdb,
	0xd6, 0xce, 0xef, 0x8c, 0x30, 0x71, 0x7f, 0x60, 0x0d, 0x6f, 0xed, 0x4b, 0x58, 0x2a, 0x46, 0x4b,
	0xf4, 0xdf, 0x35, 0x4f, 0xed, 0x4c, 0xcc, 0x90, 0xe7, 0x30, 0xee, 0xfd, 0x0e, 0x53, 0x59, 0xb3,
	0xfb, 0x87, 0xc0, 0xe6, 0x08, 0x76, 0x5f, 0xdf, 0x3f, 0xde, 0xea, 0x9b, 0x01, 0xa2, 0x4f, 0xc7,
	0xd4, 0x3d, 0x9d, 0xd5, 0x86, 0x17, 0x93, 0xbb, 0x73, 0xa9, 0x0c, 0xe1, 0x8a, 0xc3, 0x33, 0x89,
	0x60, 0x41, 0xb9, 0x92, 0xa7, 0xd4, 0x1e, 0x26, 0x82, 0x58, 0x10, 0xa9, 0x4c, 0xe5, 0xf0, 0x47,
	0x12, 0xc6, 0x29, 0x5f, 0x67, 0xb8, 0x67, 0xd5, 0x27, 0x9f, 0x01, 0x00, 0x00, 0xff, 0xff, 0x7d,
	0xdf, 0xd9, 0x3c, 0x2e, 0x02, 0x00, 0x00,
}

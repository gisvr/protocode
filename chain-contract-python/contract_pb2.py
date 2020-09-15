# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: chain-contract/contract.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from shared import status_pb2 as shared_dot_status__pb2
from shared import token_pb2 as shared_dot_token__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='chain-contract/contract.proto',
  package='contract.api',
  syntax='proto3',
  serialized_pb=_b('\n\x1d\x63hain-contract/contract.proto\x12\x0c\x63ontract.api\x1a\x13shared/status.proto\x1a\x12shared/token.proto\"z\n\rInvokeRequest\x12$\n\x05\x63hain\x18\x01 \x01(\x0e\x32\x15.shared.api.ChainType\x12\x15\n\rcontract_addr\x18\x02 \x01(\t\x12\x0f\n\x07op_name\x18\x03 \x01(\t\x12\x0c\n\x04\x61\x64\x64r\x18\x04 \x01(\t\x12\r\n\x05param\x18\x05 \x01(\t\"D\n\x0eInvokeResponse\x12\"\n\x06status\x18\x01 \x01(\x0b\x32\x12.shared.api.Status\x12\x0e\n\x06result\x18\x02 \x01(\t\"q\n\x0fTransferRequest\x12 \n\x05token\x18\x01 \x01(\x0b\x32\x11.shared.api.Token\x12\x0c\n\x04\x61\x64\x64r\x18\x02 \x01(\t\x12\x0e\n\x06toaddr\x18\x03 \x01(\t\x12\x0e\n\x06\x61mount\x18\x04 \x01(\x01\x12\x0e\n\x06remark\x18\x05 \x01(\t\"D\n\x10TransferResponse\x12\"\n\x06status\x18\x01 \x01(\x0b\x32\x12.shared.api.Status\x12\x0c\n\x04txid\x18\x02 \x01(\t\"C\n\x11GetBalanceRequest\x12 \n\x05token\x18\x01 \x01(\x0b\x32\x11.shared.api.Token\x12\x0c\n\x04\x61\x64\x64r\x18\x02 \x01(\t\"[\n\x12GetBalanceResponse\x12\"\n\x06status\x18\x01 \x01(\x0b\x32\x12.shared.api.Status\x12\x0e\n\x06\x61mount\x18\x02 \x01(\x01\x12\x11\n\textension\x18\x03 \x01(\t2\xfd\x01\n\x14\x43hainContractService\x12\x45\n\x06Invoke\x12\x1b.contract.api.InvokeRequest\x1a\x1c.contract.api.InvokeResponse\"\x00\x12K\n\x08Transfer\x12\x1d.contract.api.TransferRequest\x1a\x1e.contract.api.TransferResponse\"\x00\x12Q\n\nGetBalance\x12\x1f.contract.api.GetBalanceRequest\x1a .contract.api.GetBalanceResponse\"\x00\x42q\n\x1c\x63om.bibox.dex.proto.contractB\rContractProtoZBgithub.com/gisvr/protocode/chain-contract-go;pbchaincontractb\x06proto3')
  ,
  dependencies=[shared_dot_status__pb2.DESCRIPTOR,shared_dot_token__pb2.DESCRIPTOR,])




_INVOKEREQUEST = _descriptor.Descriptor(
  name='InvokeRequest',
  full_name='contract.api.InvokeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='chain', full_name='contract.api.InvokeRequest.chain', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='contract_addr', full_name='contract.api.InvokeRequest.contract_addr', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='op_name', full_name='contract.api.InvokeRequest.op_name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='addr', full_name='contract.api.InvokeRequest.addr', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='param', full_name='contract.api.InvokeRequest.param', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=88,
  serialized_end=210,
)


_INVOKERESPONSE = _descriptor.Descriptor(
  name='InvokeResponse',
  full_name='contract.api.InvokeResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='contract.api.InvokeResponse.status', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='result', full_name='contract.api.InvokeResponse.result', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=212,
  serialized_end=280,
)


_TRANSFERREQUEST = _descriptor.Descriptor(
  name='TransferRequest',
  full_name='contract.api.TransferRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='token', full_name='contract.api.TransferRequest.token', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='addr', full_name='contract.api.TransferRequest.addr', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='toaddr', full_name='contract.api.TransferRequest.toaddr', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='amount', full_name='contract.api.TransferRequest.amount', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='remark', full_name='contract.api.TransferRequest.remark', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=282,
  serialized_end=395,
)


_TRANSFERRESPONSE = _descriptor.Descriptor(
  name='TransferResponse',
  full_name='contract.api.TransferResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='contract.api.TransferResponse.status', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='txid', full_name='contract.api.TransferResponse.txid', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=397,
  serialized_end=465,
)


_GETBALANCEREQUEST = _descriptor.Descriptor(
  name='GetBalanceRequest',
  full_name='contract.api.GetBalanceRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='token', full_name='contract.api.GetBalanceRequest.token', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='addr', full_name='contract.api.GetBalanceRequest.addr', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=467,
  serialized_end=534,
)


_GETBALANCERESPONSE = _descriptor.Descriptor(
  name='GetBalanceResponse',
  full_name='contract.api.GetBalanceResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='contract.api.GetBalanceResponse.status', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='amount', full_name='contract.api.GetBalanceResponse.amount', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='extension', full_name='contract.api.GetBalanceResponse.extension', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=536,
  serialized_end=627,
)

_INVOKEREQUEST.fields_by_name['chain'].enum_type = shared_dot_token__pb2._CHAINTYPE
_INVOKERESPONSE.fields_by_name['status'].message_type = shared_dot_status__pb2._STATUS
_TRANSFERREQUEST.fields_by_name['token'].message_type = shared_dot_token__pb2._TOKEN
_TRANSFERRESPONSE.fields_by_name['status'].message_type = shared_dot_status__pb2._STATUS
_GETBALANCEREQUEST.fields_by_name['token'].message_type = shared_dot_token__pb2._TOKEN
_GETBALANCERESPONSE.fields_by_name['status'].message_type = shared_dot_status__pb2._STATUS
DESCRIPTOR.message_types_by_name['InvokeRequest'] = _INVOKEREQUEST
DESCRIPTOR.message_types_by_name['InvokeResponse'] = _INVOKERESPONSE
DESCRIPTOR.message_types_by_name['TransferRequest'] = _TRANSFERREQUEST
DESCRIPTOR.message_types_by_name['TransferResponse'] = _TRANSFERRESPONSE
DESCRIPTOR.message_types_by_name['GetBalanceRequest'] = _GETBALANCEREQUEST
DESCRIPTOR.message_types_by_name['GetBalanceResponse'] = _GETBALANCERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

InvokeRequest = _reflection.GeneratedProtocolMessageType('InvokeRequest', (_message.Message,), dict(
  DESCRIPTOR = _INVOKEREQUEST,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.InvokeRequest)
  ))
_sym_db.RegisterMessage(InvokeRequest)

InvokeResponse = _reflection.GeneratedProtocolMessageType('InvokeResponse', (_message.Message,), dict(
  DESCRIPTOR = _INVOKERESPONSE,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.InvokeResponse)
  ))
_sym_db.RegisterMessage(InvokeResponse)

TransferRequest = _reflection.GeneratedProtocolMessageType('TransferRequest', (_message.Message,), dict(
  DESCRIPTOR = _TRANSFERREQUEST,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.TransferRequest)
  ))
_sym_db.RegisterMessage(TransferRequest)

TransferResponse = _reflection.GeneratedProtocolMessageType('TransferResponse', (_message.Message,), dict(
  DESCRIPTOR = _TRANSFERRESPONSE,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.TransferResponse)
  ))
_sym_db.RegisterMessage(TransferResponse)

GetBalanceRequest = _reflection.GeneratedProtocolMessageType('GetBalanceRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETBALANCEREQUEST,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.GetBalanceRequest)
  ))
_sym_db.RegisterMessage(GetBalanceRequest)

GetBalanceResponse = _reflection.GeneratedProtocolMessageType('GetBalanceResponse', (_message.Message,), dict(
  DESCRIPTOR = _GETBALANCERESPONSE,
  __module__ = 'chain_contract.contract_pb2'
  # @@protoc_insertion_point(class_scope:contract.api.GetBalanceResponse)
  ))
_sym_db.RegisterMessage(GetBalanceResponse)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\034com.bibox.dex.proto.contractB\rContractProtoZBgithub.com/gisvr/protocode/chain-contract-go;pbchaincontract'))

_CHAINCONTRACTSERVICE = _descriptor.ServiceDescriptor(
  name='ChainContractService',
  full_name='contract.api.ChainContractService',
  file=DESCRIPTOR,
  index=0,
  options=None,
  serialized_start=630,
  serialized_end=883,
  methods=[
  _descriptor.MethodDescriptor(
    name='Invoke',
    full_name='contract.api.ChainContractService.Invoke',
    index=0,
    containing_service=None,
    input_type=_INVOKEREQUEST,
    output_type=_INVOKERESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Transfer',
    full_name='contract.api.ChainContractService.Transfer',
    index=1,
    containing_service=None,
    input_type=_TRANSFERREQUEST,
    output_type=_TRANSFERRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetBalance',
    full_name='contract.api.ChainContractService.GetBalance',
    index=2,
    containing_service=None,
    input_type=_GETBALANCEREQUEST,
    output_type=_GETBALANCERESPONSE,
    options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_CHAINCONTRACTSERVICE)

DESCRIPTOR.services_by_name['ChainContractService'] = _CHAINCONTRACTSERVICE

# @@protoc_insertion_point(module_scope)

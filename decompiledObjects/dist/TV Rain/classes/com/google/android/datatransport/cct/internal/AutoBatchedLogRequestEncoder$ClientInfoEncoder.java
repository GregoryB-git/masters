package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$ClientInfoEncoder
  implements ObjectEncoder<ClientInfo>
{
  private static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = FieldDescriptor.of("androidClientInfo");
  private static final FieldDescriptor CLIENTTYPE_DESCRIPTOR;
  public static final ClientInfoEncoder INSTANCE = new ClientInfoEncoder();
  
  static
  {
    CLIENTTYPE_DESCRIPTOR = FieldDescriptor.of("clientType");
  }
  
  public void encode(ClientInfo paramClientInfo, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, paramClientInfo.getClientType());
    paramObjectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, paramClientInfo.getAndroidClientInfo());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
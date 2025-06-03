package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder
  implements ObjectEncoder<NetworkConnectionInfo>
{
  public static final NetworkConnectionInfoEncoder INSTANCE = new NetworkConnectionInfoEncoder();
  private static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = FieldDescriptor.of("mobileSubtype");
  private static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = FieldDescriptor.of("networkType");
  
  public void encode(NetworkConnectionInfo paramNetworkConnectionInfo, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, paramNetworkConnectionInfo.getNetworkType());
    paramObjectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, paramNetworkConnectionInfo.getMobileSubtype());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
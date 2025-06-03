package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.encoders.proto.ProtobufEncoder.Builder;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
public abstract class ProtoEncoderDoNotUse
{
  private static final ProtobufEncoder ENCODER = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();
  
  public static void encode(Object paramObject, OutputStream paramOutputStream)
    throws IOException
  {
    ENCODER.encode(paramObject, paramOutputStream);
  }
  
  public static byte[] encode(Object paramObject)
  {
    return ENCODER.encode(paramObject);
  }
  
  public abstract ClientMetrics getClientMetrics();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.ProtoEncoderDoNotUse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
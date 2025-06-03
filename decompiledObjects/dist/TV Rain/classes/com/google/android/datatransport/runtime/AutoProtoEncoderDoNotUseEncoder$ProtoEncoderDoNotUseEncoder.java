package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder
  implements ObjectEncoder<ProtoEncoderDoNotUse>
{
  private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.of("clientMetrics");
  public static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
  
  public void encode(ProtoEncoderDoNotUse paramProtoEncoderDoNotUse, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, paramProtoEncoderDoNotUse.getClientMetrics());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
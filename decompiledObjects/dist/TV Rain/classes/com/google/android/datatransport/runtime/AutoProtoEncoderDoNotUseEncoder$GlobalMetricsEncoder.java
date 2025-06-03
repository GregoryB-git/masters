package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder
  implements ObjectEncoder<GlobalMetrics>
{
  public static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
  private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = a.e(1, FieldDescriptor.builder("storageMetrics"));
  
  public void encode(GlobalMetrics paramGlobalMetrics, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, paramGlobalMetrics.getStorageMetricsInternal());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder
  implements ObjectEncoder<StorageMetrics>
{
  private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = a.e(1, FieldDescriptor.builder("currentCacheSizeBytes"));
  public static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
  private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = a.e(2, FieldDescriptor.builder("maxCacheSizeBytes"));
  
  public void encode(StorageMetrics paramStorageMetrics, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, paramStorageMetrics.getCurrentCacheSizeBytes());
    paramObjectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, paramStorageMetrics.getMaxCacheSizeBytes());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
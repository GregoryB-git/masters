package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder
  implements ObjectEncoder<LogSourceMetrics>
{
  public static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
  private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = a.e(2, FieldDescriptor.builder("logEventDropped"));
  private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = a.e(1, FieldDescriptor.builder("logSource"));
  
  public void encode(LogSourceMetrics paramLogSourceMetrics, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(LOGSOURCE_DESCRIPTOR, paramLogSourceMetrics.getLogSource());
    paramObjectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, paramLogSourceMetrics.getLogEventDroppedList());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
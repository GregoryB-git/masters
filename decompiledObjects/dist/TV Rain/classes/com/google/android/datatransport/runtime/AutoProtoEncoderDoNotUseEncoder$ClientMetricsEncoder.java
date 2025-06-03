package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder
  implements ObjectEncoder<ClientMetrics>
{
  private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = a.e(4, FieldDescriptor.builder("appNamespace"));
  private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR;
  public static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
  private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR;
  private static final FieldDescriptor WINDOW_DESCRIPTOR = a.e(1, FieldDescriptor.builder("window"));
  
  static
  {
    LOGSOURCEMETRICS_DESCRIPTOR = a.e(2, FieldDescriptor.builder("logSourceMetrics"));
    GLOBALMETRICS_DESCRIPTOR = a.e(3, FieldDescriptor.builder("globalMetrics"));
  }
  
  public void encode(ClientMetrics paramClientMetrics, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(WINDOW_DESCRIPTOR, paramClientMetrics.getWindowInternal());
    paramObjectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, paramClientMetrics.getLogSourceMetricsList());
    paramObjectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, paramClientMetrics.getGlobalMetricsInternal());
    paramObjectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, paramClientMetrics.getAppNamespace());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
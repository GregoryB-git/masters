package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$LogRequestEncoder
  implements ObjectEncoder<LogRequest>
{
  private static final FieldDescriptor CLIENTINFO_DESCRIPTOR;
  public static final LogRequestEncoder INSTANCE = new LogRequestEncoder();
  private static final FieldDescriptor LOGEVENT_DESCRIPTOR = FieldDescriptor.of("logEvent");
  private static final FieldDescriptor LOGSOURCENAME_DESCRIPTOR;
  private static final FieldDescriptor LOGSOURCE_DESCRIPTOR;
  private static final FieldDescriptor QOSTIER_DESCRIPTOR = FieldDescriptor.of("qosTier");
  private static final FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = FieldDescriptor.of("requestTimeMs");
  private static final FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("requestUptimeMs");
  
  static
  {
    CLIENTINFO_DESCRIPTOR = FieldDescriptor.of("clientInfo");
    LOGSOURCE_DESCRIPTOR = FieldDescriptor.of("logSource");
    LOGSOURCENAME_DESCRIPTOR = FieldDescriptor.of("logSourceName");
  }
  
  public void encode(LogRequest paramLogRequest, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(REQUESTTIMEMS_DESCRIPTOR, paramLogRequest.getRequestTimeMs());
    paramObjectEncoderContext.add(REQUESTUPTIMEMS_DESCRIPTOR, paramLogRequest.getRequestUptimeMs());
    paramObjectEncoderContext.add(CLIENTINFO_DESCRIPTOR, paramLogRequest.getClientInfo());
    paramObjectEncoderContext.add(LOGSOURCE_DESCRIPTOR, paramLogRequest.getLogSource());
    paramObjectEncoderContext.add(LOGSOURCENAME_DESCRIPTOR, paramLogRequest.getLogSourceName());
    paramObjectEncoderContext.add(LOGEVENT_DESCRIPTOR, paramLogRequest.getLogEvents());
    paramObjectEncoderContext.add(QOSTIER_DESCRIPTOR, paramLogRequest.getQosTier());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
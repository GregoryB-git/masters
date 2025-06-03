package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$LogEventEncoder
  implements ObjectEncoder<LogEvent>
{
  private static final FieldDescriptor EVENTCODE_DESCRIPTOR;
  private static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR;
  private static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR;
  public static final LogEventEncoder INSTANCE = new LogEventEncoder();
  private static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.of("networkConnectionInfo");
  private static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR;
  private static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR;
  private static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR;
  
  static
  {
    EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventTimeMs");
    EVENTCODE_DESCRIPTOR = FieldDescriptor.of("eventCode");
    EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventUptimeMs");
    SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.of("sourceExtension");
    SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.of("sourceExtensionJsonProto3");
    TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.of("timezoneOffsetSeconds");
  }
  
  public void encode(LogEvent paramLogEvent, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, paramLogEvent.getEventTimeMs());
    paramObjectEncoderContext.add(EVENTCODE_DESCRIPTOR, paramLogEvent.getEventCode());
    paramObjectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, paramLogEvent.getEventUptimeMs());
    paramObjectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, paramLogEvent.getSourceExtension());
    paramObjectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, paramLogEvent.getSourceExtensionJsonProto3());
    paramObjectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, paramLogEvent.getTimezoneOffsetSeconds());
    paramObjectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, paramLogEvent.getNetworkConnectionInfo());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
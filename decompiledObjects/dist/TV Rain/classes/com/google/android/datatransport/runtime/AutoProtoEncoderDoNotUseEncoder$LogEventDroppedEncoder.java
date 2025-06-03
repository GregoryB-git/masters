package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder
  implements ObjectEncoder<LogEventDropped>
{
  private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = a.e(1, FieldDescriptor.builder("eventsDroppedCount"));
  public static final LogEventDroppedEncoder INSTANCE = new LogEventDroppedEncoder();
  private static final FieldDescriptor REASON_DESCRIPTOR = a.e(3, FieldDescriptor.builder("reason"));
  
  public void encode(LogEventDropped paramLogEventDropped, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, paramLogEventDropped.getEventsDroppedCount());
    paramObjectEncoderContext.add(REASON_DESCRIPTOR, paramLogEventDropped.getReason());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
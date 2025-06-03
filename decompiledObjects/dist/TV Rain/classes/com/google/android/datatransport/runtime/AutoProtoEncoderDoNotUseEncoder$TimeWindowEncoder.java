package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder
  implements ObjectEncoder<TimeWindow>
{
  private static final FieldDescriptor ENDMS_DESCRIPTOR = a.e(2, FieldDescriptor.builder("endMs"));
  public static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
  private static final FieldDescriptor STARTMS_DESCRIPTOR = a.e(1, FieldDescriptor.builder("startMs"));
  
  public void encode(TimeWindow paramTimeWindow, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(STARTMS_DESCRIPTOR, paramTimeWindow.getStartMs());
    paramObjectEncoderContext.add(ENDMS_DESCRIPTOR, paramTimeWindow.getEndMs());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
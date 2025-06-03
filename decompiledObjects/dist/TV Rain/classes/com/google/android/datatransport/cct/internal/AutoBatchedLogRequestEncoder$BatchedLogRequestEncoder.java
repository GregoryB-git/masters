package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder
  implements ObjectEncoder<BatchedLogRequest>
{
  public static final BatchedLogRequestEncoder INSTANCE = new BatchedLogRequestEncoder();
  private static final FieldDescriptor LOGREQUEST_DESCRIPTOR = FieldDescriptor.of("logRequest");
  
  public void encode(BatchedLogRequest paramBatchedLogRequest, ObjectEncoderContext paramObjectEncoderContext)
    throws IOException
  {
    paramObjectEncoderContext.add(LOGREQUEST_DESCRIPTOR, paramBatchedLogRequest.getLogRequests());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
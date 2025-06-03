package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

@Encodable
@AutoValue
public abstract class BatchedLogRequest
{
  @NonNull
  public static BatchedLogRequest create(@NonNull List<LogRequest> paramList)
  {
    return new AutoValue_BatchedLogRequest(paramList);
  }
  
  @NonNull
  public static DataEncoder createDataEncoder()
  {
    return new JsonDataEncoderBuilder().configureWith(AutoBatchedLogRequestEncoder.CONFIG).ignoreNullValues(true).build();
  }
  
  @Encodable.Field(name="logRequest")
  @NonNull
  public abstract List<LogRequest> getLogRequests();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.BatchedLogRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
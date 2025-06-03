package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable.Field;
import java.util.List;
import z2;

final class AutoValue_BatchedLogRequest
  extends BatchedLogRequest
{
  private final List<LogRequest> logRequests;
  
  public AutoValue_BatchedLogRequest(List<LogRequest> paramList)
  {
    if (paramList != null)
    {
      logRequests = paramList;
      return;
    }
    throw new NullPointerException("Null logRequests");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof BatchedLogRequest))
    {
      paramObject = (BatchedLogRequest)paramObject;
      return logRequests.equals(((BatchedLogRequest)paramObject).getLogRequests());
    }
    return false;
  }
  
  @Encodable.Field(name="logRequest")
  @NonNull
  public List<LogRequest> getLogRequests()
  {
    return logRequests;
  }
  
  public int hashCode()
  {
    return logRequests.hashCode() ^ 0xF4243;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("BatchedLogRequest{logRequests=");
    localStringBuilder.append(logRequests);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
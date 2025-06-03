package com.google.android.datatransport.runtime.backends;

import z2;

final class AutoValue_BackendResponse
  extends BackendResponse
{
  private final long nextRequestWaitMillis;
  private final BackendResponse.Status status;
  
  public AutoValue_BackendResponse(BackendResponse.Status paramStatus, long paramLong)
  {
    if (paramStatus != null)
    {
      status = paramStatus;
      nextRequestWaitMillis = paramLong;
      return;
    }
    throw new NullPointerException("Null status");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof BackendResponse))
    {
      paramObject = (BackendResponse)paramObject;
      if ((!status.equals(((BackendResponse)paramObject).getStatus())) || (nextRequestWaitMillis != ((BackendResponse)paramObject).getNextRequestWaitMillis())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long getNextRequestWaitMillis()
  {
    return nextRequestWaitMillis;
  }
  
  public BackendResponse.Status getStatus()
  {
    return status;
  }
  
  public int hashCode()
  {
    int i = status.hashCode();
    long l = nextRequestWaitMillis;
    return (i ^ 0xF4243) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("BackendResponse{status=");
    localStringBuilder.append(status);
    localStringBuilder.append(", nextRequestWaitMillis=");
    return z2.r(localStringBuilder, nextRequestWaitMillis, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
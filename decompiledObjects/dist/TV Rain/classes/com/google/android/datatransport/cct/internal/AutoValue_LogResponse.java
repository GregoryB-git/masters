package com.google.android.datatransport.cct.internal;

import z2;

final class AutoValue_LogResponse
  extends LogResponse
{
  private final long nextRequestWaitMillis;
  
  public AutoValue_LogResponse(long paramLong)
  {
    nextRequestWaitMillis = paramLong;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof LogResponse))
    {
      paramObject = (LogResponse)paramObject;
      if (nextRequestWaitMillis != ((LogResponse)paramObject).getNextRequestWaitMillis()) {
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
  
  public int hashCode()
  {
    long l = nextRequestWaitMillis;
    return (int)(l ^ l >>> 32) ^ 0xF4243;
  }
  
  public String toString()
  {
    return z2.r(z2.t("LogResponse{nextRequestWaitMillis="), nextRequestWaitMillis, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_LogResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
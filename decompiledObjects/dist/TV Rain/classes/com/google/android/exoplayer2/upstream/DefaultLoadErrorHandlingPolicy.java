package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

public class DefaultLoadErrorHandlingPolicy
  implements LoadErrorHandlingPolicy
{
  private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
  public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
  public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;
  public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000L;
  private final int minimumLoadableRetryCount;
  
  public DefaultLoadErrorHandlingPolicy()
  {
    this(-1);
  }
  
  public DefaultLoadErrorHandlingPolicy(int paramInt)
  {
    minimumLoadableRetryCount = paramInt;
  }
  
  public long getBlacklistDurationMsFor(int paramInt1, long paramLong, IOException paramIOException, int paramInt2)
  {
    boolean bool = paramIOException instanceof HttpDataSource.InvalidResponseCodeException;
    long l = -9223372036854775807L;
    paramLong = l;
    if (bool)
    {
      paramInt1 = responseCode;
      if (paramInt1 != 404)
      {
        paramLong = l;
        if (paramInt1 != 410) {}
      }
      else
      {
        paramLong = 60000L;
      }
    }
    return paramLong;
  }
  
  public int getMinimumLoadableRetryCount(int paramInt)
  {
    int i = minimumLoadableRetryCount;
    if (i == -1)
    {
      if (paramInt == 7) {
        paramInt = 6;
      } else {
        paramInt = 3;
      }
      return paramInt;
    }
    return i;
  }
  
  public long getRetryDelayMsFor(int paramInt1, long paramLong, IOException paramIOException, int paramInt2)
  {
    if ((paramIOException instanceof ParserException)) {
      paramLong = -9223372036854775807L;
    } else {
      paramLong = Math.min((paramInt2 - 1) * 1000, 5000);
    }
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
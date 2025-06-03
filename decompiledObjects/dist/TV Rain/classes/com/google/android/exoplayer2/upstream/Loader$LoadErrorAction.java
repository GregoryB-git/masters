package com.google.android.exoplayer2.upstream;

public final class Loader$LoadErrorAction
{
  private final long retryDelayMillis;
  private final int type;
  
  private Loader$LoadErrorAction(int paramInt, long paramLong)
  {
    type = paramInt;
    retryDelayMillis = paramLong;
  }
  
  public boolean isRetry()
  {
    int i = type;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 0) {
      if (i == 1) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.Loader.LoadErrorAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
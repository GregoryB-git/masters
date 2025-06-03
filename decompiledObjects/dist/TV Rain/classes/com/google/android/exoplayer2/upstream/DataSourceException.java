package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public final class DataSourceException
  extends IOException
{
  public static final int POSITION_OUT_OF_RANGE = 0;
  public final int reason;
  
  public DataSourceException(int paramInt)
  {
    reason = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DataSourceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
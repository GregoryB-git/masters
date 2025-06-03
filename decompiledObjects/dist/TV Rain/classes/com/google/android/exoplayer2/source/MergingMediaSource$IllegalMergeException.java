package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MergingMediaSource$IllegalMergeException
  extends IOException
{
  public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
  public final int reason;
  
  public MergingMediaSource$IllegalMergeException(int paramInt)
  {
    reason = paramInt;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Reason {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MergingMediaSource.IllegalMergeException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ClippingMediaSource$IllegalClippingException
  extends IOException
{
  public static final int REASON_INVALID_PERIOD_COUNT = 0;
  public static final int REASON_NOT_SEEKABLE_TO_START = 1;
  public static final int REASON_START_EXCEEDS_END = 2;
  public final int reason;
  
  public ClippingMediaSource$IllegalClippingException(int paramInt)
  {
    super(localStringBuilder.toString());
    reason = paramInt;
  }
  
  private static String getReasonDescription(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return "unknown";
        }
        return "start exceeds end";
      }
      return "not seekable to start";
    }
    return "invalid period count";
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Reason {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.drm;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class UnsupportedDrmException
  extends Exception
{
  public static final int REASON_INSTANTIATION_ERROR = 2;
  public static final int REASON_UNSUPPORTED_SCHEME = 1;
  public final int reason;
  
  public UnsupportedDrmException(int paramInt)
  {
    reason = paramInt;
  }
  
  public UnsupportedDrmException(int paramInt, Exception paramException)
  {
    super(paramException);
    reason = paramInt;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Reason {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.UnsupportedDrmException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
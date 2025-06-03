package com.google.android.exoplayer2.source.ads;

import a;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AdsMediaSource$AdLoadException
  extends IOException
{
  public static final int TYPE_AD = 0;
  public static final int TYPE_AD_GROUP = 1;
  public static final int TYPE_ALL_ADS = 2;
  public static final int TYPE_UNEXPECTED = 3;
  public final int type;
  
  private AdsMediaSource$AdLoadException(int paramInt, Exception paramException)
  {
    super(paramException);
    type = paramInt;
  }
  
  public static AdLoadException createForAd(Exception paramException)
  {
    return new AdLoadException(0, paramException);
  }
  
  public static AdLoadException createForAdGroup(Exception paramException, int paramInt)
  {
    return new AdLoadException(1, new IOException(a.f("Failed to load ad group ", paramInt), paramException));
  }
  
  public static AdLoadException createForAllAds(Exception paramException)
  {
    return new AdLoadException(2, paramException);
  }
  
  public static AdLoadException createForUnexpected(RuntimeException paramRuntimeException)
  {
    return new AdLoadException(3, paramRuntimeException);
  }
  
  public RuntimeException getRuntimeExceptionForUnexpected()
  {
    boolean bool;
    if (type == 3) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    return (RuntimeException)getCause();
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Type {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

public final class dg
{
  public static final dg a = new df().a();
  public final int b;
  public final int c;
  private final int d;
  private AudioAttributes e;
  
  private dg(int paramInt1, int paramInt2, int paramInt3)
  {
    b = paramInt1;
    d = paramInt2;
    c = paramInt3;
  }
  
  @TargetApi(21)
  public final AudioAttributes a()
  {
    if (e == null) {
      e = new AudioAttributes.Builder().setContentType(b).setFlags(d).setUsage(c).build();
    }
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (dg.class == paramObject.getClass()))
    {
      paramObject = (dg)paramObject;
      if ((b == b) && (d == d) && (c == c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((b + 527) * 31 + d) * 31 + c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.dg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
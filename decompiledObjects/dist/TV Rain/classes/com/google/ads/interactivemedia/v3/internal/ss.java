package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

final class ss
{
  public final int a;
  public final int b;
  public final String c;
  
  public ss(int paramInt1, int paramInt2, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ss.class == paramObject.getClass()))
    {
      paramObject = (ss)paramObject;
      if ((a == a) && (b == b) && (TextUtils.equals(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    String str = c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return (i * 31 + j) * 31 + k;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ss
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
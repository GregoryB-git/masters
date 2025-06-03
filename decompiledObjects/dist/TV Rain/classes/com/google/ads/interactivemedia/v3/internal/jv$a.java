package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

final class jv$a
{
  public final String a;
  public final boolean b;
  public final boolean c;
  
  public jv$a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramBoolean1;
    c = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == a.class))
    {
      paramObject = (a)paramObject;
      if ((TextUtils.equals(a, a)) && (b == b) && (c == c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    boolean bool = b;
    int j = 1231;
    int k;
    if (bool) {
      k = 1231;
    } else {
      k = 1237;
    }
    if (!c) {
      j = 1237;
    }
    return ((i + 31) * 31 + k) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jv.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
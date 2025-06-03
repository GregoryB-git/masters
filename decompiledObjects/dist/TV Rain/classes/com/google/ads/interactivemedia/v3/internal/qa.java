package com.google.ads.interactivemedia.v3.internal;

public final class qa
{
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  
  public qa(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (qa.class == paramObject.getClass()))
    {
      paramObject = (qa)paramObject;
      if ((wl.a(a, a)) && (wl.a(b, b)) && (wl.a(c, c)) && (wl.a(d, d)) && (wl.a(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = b;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = d;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = e;
    if (str != null) {
      i = str.hashCode();
    }
    return ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
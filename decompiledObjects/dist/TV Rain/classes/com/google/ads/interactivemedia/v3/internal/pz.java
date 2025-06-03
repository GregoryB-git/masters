package com.google.ads.interactivemedia.v3.internal;

public final class pz
{
  public final String a;
  public final String b;
  private final String c;
  
  public pz(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (pz.class == paramObject.getClass()))
    {
      paramObject = (pz)paramObject;
      if ((wl.a(a, a)) && (wl.a(b, b)) && (wl.a(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    String str = b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    if (str != null) {
      j = str.hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
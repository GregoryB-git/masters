package com.google.ads.interactivemedia.v3.internal;

public enum c
{
  private final String d;
  
  static
  {
    c localc1 = new c("NATIVE", 0, "native");
    c = localc1;
    c localc2 = new c("JAVASCRIPT", 1, "javascript");
    a = localc2;
    c localc3 = new c("NONE", 2, "none");
    b = localc3;
    e = new c[] { localc1, localc2, localc3 };
  }
  
  private c(String paramString)
  {
    d = paramString;
  }
  
  public final String toString()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
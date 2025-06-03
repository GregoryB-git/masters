package com.google.ads.interactivemedia.v3.internal;

public final class f
{
  private final String a;
  private final String b;
  
  private f(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public static f a(String paramString1, String paramString2)
  {
    h.a(paramString1, "Name is null or empty");
    h.a(paramString2, "Version is null or empty");
    return new f(paramString1, paramString2);
  }
  
  public final String a()
  {
    return a;
  }
  
  public final String b()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
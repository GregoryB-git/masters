package com.google.ads.interactivemedia.v3.internal;

public final class gg
  implements ge
{
  private final long a;
  private final gh b;
  
  public gg(long paramLong)
  {
    this(paramLong, 0L);
  }
  
  public gg(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    gj localgj;
    if (paramLong2 == 0L) {
      localgj = gj.a;
    } else {
      localgj = new gj(0L, paramLong2);
    }
    b = new gh(localgj);
  }
  
  public final gh a(long paramLong)
  {
    return b;
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final long b()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

public final class ft
{
  public static final ft a = new ft(-3, -9223372036854775807L, -1L);
  private final int b;
  private final long c;
  private final long d;
  
  private ft(int paramInt, long paramLong1, long paramLong2)
  {
    b = paramInt;
    c = paramLong1;
    d = paramLong2;
  }
  
  public static ft a(long paramLong)
  {
    return new ft(0, -9223372036854775807L, paramLong);
  }
  
  public static ft a(long paramLong1, long paramLong2)
  {
    return new ft(-1, paramLong1, paramLong2);
  }
  
  public static ft b(long paramLong1, long paramLong2)
  {
    return new ft(-2, paramLong1, paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
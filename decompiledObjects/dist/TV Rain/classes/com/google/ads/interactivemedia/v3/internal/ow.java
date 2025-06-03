package com.google.ads.interactivemedia.v3.internal;

public abstract class ow
  extends ok
{
  public final long k;
  
  public ow(tt paramtt, tx paramtx, bw parambw, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    super(paramtt, paramtx, 1, parambw, paramInt, paramObject, paramLong1, paramLong2);
    rp.a(parambw);
    k = paramLong3;
  }
  
  public long g()
  {
    long l = k;
    if (l != -1L) {
      return l + 1L;
    }
    return -1L;
  }
  
  public abstract boolean h();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
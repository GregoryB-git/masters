package com.google.ads.interactivemedia.v3.internal;

public abstract class oi
  extends ow
{
  public final long a;
  public final long b;
  private op l;
  private int[] m;
  
  public oi(tt paramtt, tx paramtx, bw parambw, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    super(paramtt, paramtx, parambw, paramInt, paramObject, paramLong1, paramLong2, paramLong5);
    a = paramLong3;
    b = paramLong4;
  }
  
  public final int a(int paramInt)
  {
    return m[paramInt];
  }
  
  public final void a(op paramop)
  {
    l = paramop;
    m = paramop.a();
  }
  
  public final op c()
  {
    return l;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.oi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
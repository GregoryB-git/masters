package com.google.ads.interactivemedia.v3.internal;

public final class oa
  extends cr
{
  private static final Object b = new Object();
  private final long c;
  private final long d;
  private final long e;
  private final long f;
  private final long g;
  private final long h;
  private final boolean i;
  private final boolean j;
  private final Object k;
  private final Object l;
  
  public oa(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean1, boolean paramBoolean2, Object paramObject1, Object paramObject2)
  {
    c = paramLong1;
    d = paramLong2;
    e = paramLong3;
    f = paramLong4;
    g = paramLong5;
    h = paramLong6;
    i = paramBoolean1;
    j = paramBoolean2;
    l = paramObject1;
    k = paramObject2;
  }
  
  private oa(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, Object paramObject1, Object paramObject2)
  {
    this(-9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, 0L, 0L, paramBoolean1, paramBoolean2, paramObject1, paramObject2);
  }
  
  public oa(long paramLong, boolean paramBoolean1, boolean paramBoolean2, Object paramObject1, Object paramObject2)
  {
    this(paramLong, paramLong, 0L, 0L, paramBoolean1, false, null, paramObject2);
  }
  
  public final int a(Object paramObject)
  {
    if (b.equals(paramObject)) {
      return 0;
    }
    return -1;
  }
  
  public final ct a(int paramInt, ct paramct, boolean paramBoolean)
  {
    rp.a(paramInt, 0, 1);
    Object localObject;
    if (paramBoolean) {
      localObject = b;
    } else {
      localObject = null;
    }
    return paramct.a(null, localObject, 0, e, -g);
  }
  
  public final cw a(int paramInt, cw paramcw, long paramLong)
  {
    rp.a(paramInt, 0, 1);
    long l1 = h;
    boolean bool = j;
    long l2 = l1;
    if (bool)
    {
      l2 = l1;
      if (paramLong != 0L)
      {
        long l3 = f;
        if (l3 == -9223372036854775807L) {}
        do
        {
          l2 = -9223372036854775807L;
          break;
          paramLong = l1 + paramLong;
          l2 = paramLong;
        } while (paramLong > l3);
      }
    }
    return paramcw.a(cw.a, k, l, c, d, i, bool, l2, f, 0, 0, g);
  }
  
  public final Object a(int paramInt)
  {
    rp.a(paramInt, 0, 1);
    return b;
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final int c()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.oa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
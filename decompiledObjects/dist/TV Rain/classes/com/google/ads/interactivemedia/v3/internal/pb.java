package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class pb
  extends oi
{
  private final int l;
  private final bw m;
  private long n;
  private boolean o;
  
  public pb(tt paramtt, tx paramtx, bw parambw1, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, bw parambw2)
  {
    super(paramtt, paramtx, parambw1, paramInt1, paramObject, paramLong1, paramLong2, -9223372036854775807L, -9223372036854775807L, paramLong3);
    l = paramInt2;
    m = parambw2;
  }
  
  public final void a() {}
  
  public final void b()
    throws IOException, InterruptedException
  {
    Object localObject1 = c.a(n);
    try
    {
      long l1 = j.a((tx)localObject1);
      long l2 = l1;
      if (l1 != -1L) {
        l2 = l1 + n;
      }
      localObject1 = new com/google/ads/interactivemedia/v3/internal/fz;
      ((fz)localObject1).<init>(j, n, l2);
      Object localObject3 = c();
      ((op)localObject3).a(0L);
      localObject3 = ((op)localObject3).a(l);
      ((gi)localObject3).a(m);
      for (int i = 0; i != -1; i = ((gi)localObject3).a((fz)localObject1, Integer.MAX_VALUE, true)) {
        n += i;
      }
      i = (int)n;
      ((gi)localObject3).a(h, 1, i, 0, null);
      wl.a(j);
      o = true;
      return;
    }
    finally
    {
      wl.a(j);
    }
  }
  
  public final boolean h()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
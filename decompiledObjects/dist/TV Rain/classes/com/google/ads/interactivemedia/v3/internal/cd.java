package com.google.ads.interactivemedia.v3.internal;

final class cd
{
  private static final mt n = new mt(new Object());
  public final cr a;
  public final mt b;
  public final long c;
  public final long d;
  public final int e;
  public final ba f;
  public final boolean g;
  public final of h;
  public final tg i;
  public final mt j;
  public volatile long k;
  public volatile long l;
  public volatile long m;
  
  public cd(cr paramcr, mt parammt1, long paramLong1, long paramLong2, int paramInt, ba paramba, boolean paramBoolean, of paramof, tg paramtg, mt parammt2, long paramLong3, long paramLong4, long paramLong5)
  {
    a = paramcr;
    b = parammt1;
    c = paramLong1;
    d = paramLong2;
    e = paramInt;
    f = paramba;
    g = paramBoolean;
    h = paramof;
    i = paramtg;
    j = parammt2;
    k = paramLong3;
    l = paramLong4;
    m = paramLong5;
  }
  
  public static cd a(long paramLong, tg paramtg)
  {
    cr localcr = cr.a;
    mt localmt = n;
    return new cd(localcr, localmt, paramLong, -9223372036854775807L, 1, null, false, of.a, paramtg, localmt, paramLong, 0L, paramLong);
  }
  
  public final cd a(ba paramba)
  {
    return new cd(a, b, c, d, e, paramba, g, h, i, j, k, l, m);
  }
  
  public final cd a(mt parammt, long paramLong1, long paramLong2, long paramLong3)
  {
    cr localcr = a;
    if (!parammt.a()) {
      paramLong2 = -9223372036854775807L;
    }
    return new cd(localcr, parammt, paramLong1, paramLong2, e, f, g, h, i, j, k, paramLong3, paramLong1);
  }
  
  public final cd a(of paramof, tg paramtg)
  {
    return new cd(a, b, c, d, e, f, g, paramof, paramtg, j, k, l, m);
  }
  
  public final mt a(boolean paramBoolean, cw paramcw, ct paramct)
  {
    if (a.a()) {
      return n;
    }
    int i1 = a.b(paramBoolean);
    int i2 = a.a(i1, paramcw, 0L).e;
    int i3 = a.a(b.a);
    long l1 = -1L;
    long l2 = l1;
    if (i3 != -1)
    {
      l2 = l1;
      if (i1 == a.a(i3, paramct, false).b) {
        l2 = b.d;
      }
    }
    return new mt(a.a(i2), l2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
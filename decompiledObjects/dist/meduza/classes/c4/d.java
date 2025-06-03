package c4;

public class d
  implements t
{
  public final long a;
  public final long b;
  public final int c;
  public final long d;
  public final int e;
  public final long f;
  public final boolean g;
  
  public d(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    a = paramLong1;
    b = paramLong2;
    int i = paramInt2;
    if (paramInt2 == -1) {
      i = 1;
    }
    c = i;
    e = paramInt1;
    g = paramBoolean;
    if (paramLong1 == -1L)
    {
      d = -1L;
      paramLong1 = -9223372036854775807L;
    }
    else
    {
      paramLong1 -= paramLong2;
      d = paramLong1;
      paramLong1 = Math.max(0L, paramLong1) * 8L * 1000000L / paramInt1;
    }
    f = paramLong1;
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((d == -1L) && (!g)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final t.a g(long paramLong)
  {
    long l1 = d;
    boolean bool = l1 < -1L;
    if ((!bool) && (!g))
    {
      localu = new u(0L, b);
      return new t.a(localu, localu);
    }
    long l2 = e * paramLong / 8000000L;
    long l3 = c;
    long l4 = l2 / l3 * l3;
    l2 = l4;
    if (bool) {
      l2 = Math.min(l4, l1 - l3);
    }
    l4 = Math.max(l2, 0L);
    l2 = b;
    l4 += l2;
    int i = e;
    l2 = Math.max(0L, l4 - l2) * 8L * 1000000L / i;
    u localu = new u(l2, l4);
    if ((d != -1L) && (l2 < paramLong))
    {
      paramLong = c + l4;
      if (paramLong < a)
      {
        l2 = b;
        i = e;
        return new t.a(localu, new u(Math.max(0L, paramLong - l2) * 8L * 1000000L / i, paramLong));
      }
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     c4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
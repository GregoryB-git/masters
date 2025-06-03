package F0;

public class i
  implements M
{
  public final long a;
  public final long b;
  public final int c;
  public final long d;
  public final int e;
  public final long f;
  public final boolean g;
  
  public i(long paramLong1, long paramLong2, int paramInt1, int paramInt2, boolean paramBoolean)
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
    if (paramLong1 == -1L) {
      d = -1L;
    }
    for (paramLong1 = -9223372036854775807L;; paramLong1 = d(paramLong1, paramLong2, paramInt1))
    {
      f = paramLong1;
      break;
      d = (paramLong1 - paramLong2);
    }
  }
  
  public static long d(long paramLong1, long paramLong2, int paramInt)
  {
    return Math.max(0L, paramLong1 - paramLong2) * 8000000L / paramInt;
  }
  
  public final long a(long paramLong)
  {
    paramLong = paramLong * e / 8000000L;
    int i = c;
    long l1 = paramLong / i * i;
    long l2 = d;
    paramLong = l1;
    if (l2 != -1L) {
      paramLong = Math.min(l1, l2 - i);
    }
    paramLong = Math.max(paramLong, 0L);
    return b + paramLong;
  }
  
  public long b(long paramLong)
  {
    return d(paramLong, b, e);
  }
  
  public boolean h()
  {
    boolean bool;
    if ((d == -1L) && (!g)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public M.a j(long paramLong)
  {
    if ((d == -1L) && (!g)) {
      return new M.a(new N(0L, b));
    }
    long l1 = a(paramLong);
    long l2 = b(l1);
    N localN = new N(l2, l1);
    if ((d != -1L) && (l2 < paramLong))
    {
      int i = c;
      if (i + l1 < a)
      {
        paramLong = l1 + i;
        return new M.a(localN, new N(b(paramLong), paramLong));
      }
    }
    return new M.a(localN);
  }
  
  public long l()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     F0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
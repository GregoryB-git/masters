package F0;

import g0.M;

public class e$c
{
  public final long a;
  public final long b;
  public final long c;
  public long d;
  public long e;
  public long f;
  public long g;
  public long h;
  
  public e$c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    a = paramLong1;
    b = paramLong2;
    d = paramLong3;
    e = paramLong4;
    f = paramLong5;
    g = paramLong6;
    c = paramLong7;
    h = h(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramLong7);
  }
  
  public static long h(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
    {
      float f1 = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
      paramLong1 = ((float)(paramLong1 - paramLong2) * f1);
      return M.q(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
    }
    return paramLong4;
  }
  
  public final long i()
  {
    return g;
  }
  
  public final long j()
  {
    return f;
  }
  
  public final long k()
  {
    return h;
  }
  
  public final long l()
  {
    return a;
  }
  
  public final long m()
  {
    return b;
  }
  
  public final void n()
  {
    h = h(b, d, e, f, g, c);
  }
  
  public final void o(long paramLong1, long paramLong2)
  {
    e = paramLong1;
    g = paramLong2;
    n();
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    d = paramLong1;
    f = paramLong2;
    n();
  }
}

/* Location:
 * Qualified Name:     F0.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
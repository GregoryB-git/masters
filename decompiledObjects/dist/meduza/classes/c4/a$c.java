package c4;

import v5.e0;

public final class a$c
{
  public final long a;
  public final long b;
  public final long c;
  public long d;
  public long e;
  public long f;
  public long g;
  public long h;
  
  public a$c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    a = paramLong1;
    b = paramLong2;
    d = paramLong3;
    e = paramLong4;
    f = paramLong5;
    g = paramLong6;
    c = paramLong7;
    h = a(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramLong7);
  }
  
  public static long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
    {
      float f1 = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
      paramLong1 = ((float)(paramLong1 - paramLong2) * f1);
      return e0.j(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
    }
    return paramLong4;
  }
}

/* Location:
 * Qualified Name:     c4.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
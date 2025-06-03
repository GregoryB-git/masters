package Y0;

import F0.M.a;
import F0.N;
import g0.M;
import g0.p;
import java.math.RoundingMode;

public final class b
  implements g
{
  public final long a;
  public final p b;
  public final p c;
  public final int d;
  public long e;
  
  public b(long paramLong1, long paramLong2, long paramLong3)
  {
    e = paramLong1;
    a = paramLong3;
    p localp1 = new p();
    b = localp1;
    p localp2 = new p();
    c = localp2;
    localp1.a(0L);
    localp2.a(paramLong2);
    int i = -2147483647;
    int j = i;
    if (paramLong1 != -9223372036854775807L)
    {
      paramLong1 = M.Y0(paramLong2 - paramLong3, 8L, paramLong1, RoundingMode.HALF_UP);
      j = i;
      if (paramLong1 > 0L)
      {
        j = i;
        if (paramLong1 <= 2147483647L) {
          j = (int)paramLong1;
        }
      }
    }
    d = j;
  }
  
  public boolean a(long paramLong)
  {
    p localp = b;
    int i = localp.c();
    boolean bool = true;
    if (paramLong - localp.b(i - 1) >= 100000L) {
      bool = false;
    }
    return bool;
  }
  
  public void b(long paramLong1, long paramLong2)
  {
    if (a(paramLong1)) {
      return;
    }
    b.a(paramLong1);
    c.a(paramLong2);
  }
  
  public long c(long paramLong)
  {
    int i = M.e(c, paramLong, true, true);
    return b.b(i);
  }
  
  public void d(long paramLong)
  {
    e = paramLong;
  }
  
  public long f()
  {
    return a;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    int i = M.e(b, paramLong, true, true);
    N localN = new N(b.b(i), c.b(i));
    if ((a != paramLong) && (i != b.c() - 1))
    {
      p localp = b;
      i++;
      return new M.a(localN, new N(localp.b(i), c.b(i)));
    }
    return new M.a(localN);
  }
  
  public int k()
  {
    return d;
  }
  
  public long l()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     Y0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package c1;

import g0.a;
import j0.j;
import java.util.List;

public abstract class q
  extends j
  implements k
{
  public k s;
  public long t;
  
  public int c(long paramLong)
  {
    return ((k)a.e(s)).c(paramLong - t);
  }
  
  public long e(int paramInt)
  {
    return ((k)a.e(s)).e(paramInt) + t;
  }
  
  public List h(long paramLong)
  {
    return ((k)a.e(s)).h(paramLong - t);
  }
  
  public int j()
  {
    return ((k)a.e(s)).j();
  }
  
  public void m()
  {
    super.m();
    s = null;
  }
  
  public void z(long paramLong1, k paramk, long paramLong2)
  {
    p = paramLong1;
    s = paramk;
    if (paramLong2 != Long.MAX_VALUE) {
      paramLong1 = paramLong2;
    }
    t = paramLong1;
  }
}

/* Location:
 * Qualified Name:     c1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
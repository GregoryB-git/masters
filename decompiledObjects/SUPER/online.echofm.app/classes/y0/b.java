package y0;

import java.util.NoSuchElementException;

public abstract class b
  implements n
{
  public final long b;
  public final long c;
  public long d;
  
  public b(long paramLong1, long paramLong2)
  {
    b = paramLong1;
    c = paramLong2;
    f();
  }
  
  public final void c()
  {
    long l = d;
    if ((l >= b) && (l <= c)) {
      return;
    }
    throw new NoSuchElementException();
  }
  
  public final long d()
  {
    return d;
  }
  
  public boolean e()
  {
    boolean bool;
    if (d > c) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void f()
  {
    d = (b - 1L);
  }
  
  public boolean next()
  {
    d += 1L;
    return e() ^ true;
  }
}

/* Location:
 * Qualified Name:     y0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
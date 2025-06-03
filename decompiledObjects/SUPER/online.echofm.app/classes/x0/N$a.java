package x0;

import B0.b.a;

public final class N$a
  implements b.a
{
  public long a;
  public long b;
  public B0.a c;
  public a d;
  
  public N$a(long paramLong, int paramInt)
  {
    d(paramLong, paramInt);
  }
  
  public B0.a a()
  {
    return (B0.a)g0.a.e(c);
  }
  
  public a b()
  {
    c = null;
    a locala = d;
    d = null;
    return locala;
  }
  
  public void c(B0.a parama, a parama1)
  {
    c = parama;
    d = parama1;
  }
  
  public void d(long paramLong, int paramInt)
  {
    boolean bool;
    if (c == null) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    a = paramLong;
    b = (paramLong + paramInt);
  }
  
  public int e(long paramLong)
  {
    return (int)(paramLong - a) + c.b;
  }
  
  public b.a next()
  {
    a locala = d;
    if ((locala != null) && (c != null)) {
      return locala;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     x0.N.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
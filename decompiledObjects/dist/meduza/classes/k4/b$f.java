package k4;

import v5.u;

public final class b$f
  implements b.c
{
  public final u a;
  public final int b;
  public final int c;
  public int d;
  public int e;
  
  public b$f(a.b paramb)
  {
    paramb = b;
    a = paramb;
    paramb.G(12);
    c = (paramb.y() & 0xFF);
    b = paramb.y();
  }
  
  public final int a()
  {
    return -1;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final int c()
  {
    int i = c;
    if (i == 8) {
      return a.v();
    }
    if (i == 16) {
      return a.A();
    }
    i = d;
    d = (i + 1);
    if (i % 2 == 0)
    {
      i = a.v();
      e = i;
      return (i & 0xF0) >> 4;
    }
    return e & 0xF;
  }
}

/* Location:
 * Qualified Name:     k4.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
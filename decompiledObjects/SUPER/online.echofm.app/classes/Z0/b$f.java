package Z0;

import g0.z;

public final class b$f
  implements b.c
{
  public final z a;
  public final int b;
  public final int c;
  public int d;
  public int e;
  
  public b$f(a.b paramb)
  {
    paramb = b;
    a = paramb;
    paramb.T(12);
    c = (paramb.K() & 0xFF);
    b = paramb.K();
  }
  
  public int a()
  {
    return -1;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    int i = c;
    if (i == 8) {
      return a.G();
    }
    if (i == 16) {
      return a.M();
    }
    i = d;
    d = (i + 1);
    if (i % 2 == 0)
    {
      i = a.G();
      e = i;
      return (i & 0xF0) >> 4;
    }
    return e & 0xF;
  }
}

/* Location:
 * Qualified Name:     Z0.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package F0;

import g0.a;

public final class U
{
  public final byte[] a = new byte[10];
  public boolean b;
  public int c;
  public long d;
  public int e;
  public int f;
  public int g;
  
  public void a(T paramT, T.a parama)
  {
    if (c > 0)
    {
      paramT.b(d, e, f, g, parama);
      c = 0;
    }
  }
  
  public void b()
  {
    b = false;
    c = 0;
  }
  
  public void c(T paramT, long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    boolean bool;
    if (g <= paramInt2 + paramInt3) {
      bool = true;
    } else {
      bool = false;
    }
    a.g(bool, "TrueHD chunk samples must be contiguous in the sample queue.");
    if (!b) {
      return;
    }
    int i = c;
    int j = i + 1;
    c = j;
    if (i == 0)
    {
      d = paramLong;
      e = paramInt1;
      f = 0;
    }
    f += paramInt2;
    g = paramInt3;
    if (j >= 16) {
      a(paramT, parama);
    }
  }
  
  public void d(s params)
  {
    if (b) {
      return;
    }
    params.n(a, 0, 10);
    params.h();
    if (b.j(a) == 0) {
      return;
    }
    b = true;
  }
}

/* Location:
 * Qualified Name:     F0.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
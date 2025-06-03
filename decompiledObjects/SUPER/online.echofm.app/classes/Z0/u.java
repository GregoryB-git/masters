package Z0;

import F0.s;
import g0.z;

public final class u
{
  public d a;
  public long b;
  public long c;
  public long d;
  public int e;
  public int f;
  public long[] g = new long[0];
  public int[] h = new int[0];
  public int[] i = new int[0];
  public long[] j = new long[0];
  public boolean[] k = new boolean[0];
  public boolean l;
  public boolean[] m = new boolean[0];
  public t n;
  public final z o = new z();
  public boolean p;
  public long q;
  public boolean r;
  
  public void a(s params)
  {
    params.readFully(o.e(), 0, o.g());
    o.T(0);
    p = false;
  }
  
  public void b(z paramz)
  {
    paramz.l(o.e(), 0, o.g());
    o.T(0);
    p = false;
  }
  
  public long c(int paramInt)
  {
    return j[paramInt];
  }
  
  public void d(int paramInt)
  {
    o.P(paramInt);
    l = true;
    p = true;
  }
  
  public void e(int paramInt1, int paramInt2)
  {
    e = paramInt1;
    f = paramInt2;
    if (h.length < paramInt1)
    {
      g = new long[paramInt1];
      h = new int[paramInt1];
    }
    if (i.length < paramInt2)
    {
      paramInt1 = paramInt2 * 125 / 100;
      i = new int[paramInt1];
      j = new long[paramInt1];
      k = new boolean[paramInt1];
      m = new boolean[paramInt1];
    }
  }
  
  public void f()
  {
    e = 0;
    q = 0L;
    r = false;
    l = false;
    p = false;
    n = null;
  }
  
  public boolean g(int paramInt)
  {
    boolean bool;
    if ((l) && (m[paramInt] != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     Z0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
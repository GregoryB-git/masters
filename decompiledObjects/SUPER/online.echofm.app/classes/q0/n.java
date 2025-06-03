package q0;

import d0.J;
import d0.q;
import j0.i;
import k0.v0;
import x0.Q;
import x0.Z;

public final class n
  implements Q
{
  public final int o;
  public final s p;
  public int q;
  
  public n(s params, int paramInt)
  {
    p = params;
    o = paramInt;
    q = -1;
  }
  
  public void a()
  {
    int i = q;
    if (i != -2)
    {
      if (i == -1) {
        p.W();
      } else if (i != -3) {
        p.X(i);
      }
      return;
    }
    throw new u(p.n().b(o).a(0).n);
  }
  
  public void b()
  {
    boolean bool;
    if (q == -1) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    q = p.z(o);
  }
  
  public final boolean c()
  {
    int i = q;
    boolean bool;
    if ((i != -1) && (i != -3) && (i != -2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d()
  {
    if (q != -1)
    {
      p.r0(o);
      q = -1;
    }
  }
  
  public boolean e()
  {
    boolean bool;
    if ((q != -3) && ((!c()) || (!p.R(q)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int j(v0 paramv0, i parami, int paramInt)
  {
    int i = q;
    int j = -3;
    if (i == -3)
    {
      parami.l(4);
      return -4;
    }
    if (c()) {
      j = p.g0(q, paramv0, parami, paramInt);
    }
    return j;
  }
  
  public int m(long paramLong)
  {
    int i;
    if (c()) {
      i = p.q0(q, paramLong);
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     q0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
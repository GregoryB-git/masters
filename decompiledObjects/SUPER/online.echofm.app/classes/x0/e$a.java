package x0;

import d0.q;
import d0.q.b;
import j0.i;
import k0.v0;

public final class e$a
  implements Q
{
  public final Q o;
  public boolean p;
  
  public e$a(e parame, Q paramQ)
  {
    o = paramQ;
  }
  
  public void a()
  {
    o.a();
  }
  
  public void b()
  {
    p = false;
  }
  
  public boolean e()
  {
    boolean bool;
    if ((!q.j()) && (o.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int j(v0 paramv0, i parami, int paramInt)
  {
    if (q.j()) {
      return -3;
    }
    if (p)
    {
      parami.w(4);
      return -4;
    }
    long l1 = q.f();
    paramInt = o.j(paramv0, parami, paramInt);
    if (paramInt == -5)
    {
      parami = (q)g0.a.e(b);
      paramInt = E;
      if ((paramInt != 0) || (F != 0))
      {
        e locale = q;
        l1 = s;
        int i = 0;
        if (l1 != 0L) {
          paramInt = 0;
        }
        if (t == Long.MIN_VALUE) {
          i = F;
        }
        b = parami.a().V(paramInt).W(i).K();
      }
      return -5;
    }
    long l2 = q.t;
    if ((l2 != Long.MIN_VALUE) && (((paramInt == -4) && (t >= l2)) || ((paramInt == -3) && (l1 == Long.MIN_VALUE) && (!s))))
    {
      parami.m();
      parami.w(4);
      p = true;
      return -4;
    }
    return paramInt;
  }
  
  public int m(long paramLong)
  {
    if (q.j()) {
      return -3;
    }
    return o.m(paramLong);
  }
}

/* Location:
 * Qualified Name:     x0.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
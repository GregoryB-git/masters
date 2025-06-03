package nb;

import eb.k0;
import eb.k0.e;
import eb.k0.j;
import eb.n;
import x6.b;

public final class f
  extends c
{
  public k0 a;
  
  public f(e parame) {}
  
  public final void f(n paramn, k0.j paramj)
  {
    n localn = n.b;
    k0 localk0 = a;
    e locale = b;
    Object localObject = k;
    if (localk0 == localObject)
    {
      b.I(n, "there's pending lb while current lb has been out of READY");
      localObject = b;
      l = paramn;
      m = paramj;
      if (paramn == localn) {
        ((e)localObject).h();
      }
    }
    else if (localk0 == i)
    {
      boolean bool;
      if (paramn == localn) {
        bool = true;
      } else {
        bool = false;
      }
      n = bool;
      if ((!bool) && (localObject != f)) {
        locale.h();
      } else {
        g.f(paramn, paramj);
      }
    }
  }
  
  public final k0.e g()
  {
    return b.g;
  }
}

/* Location:
 * Qualified Name:     nb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package nb;

import eb.k0.b;
import eb.k0.e;
import eb.k0.i;
import eb.k0.j;
import eb.n;
import eb.u;
import java.util.List;
import o7.p;

public final class i$c
  extends c
{
  public g a;
  
  public i$c(i parami, k0.e parame)
  {
    a = new g(parame);
  }
  
  public final k0.i a(k0.b paramb)
  {
    i.h localh = new i.h(b, paramb, a);
    paramb = a;
    if ((i.g(paramb)) && (b.f.containsKey(get0a.get(0))))
    {
      paramb = (i.a)b.f.get(get0a.get(0));
      paramb.a(localh);
      if (d != null) {
        localh.k();
      }
    }
    return localh;
  }
  
  public final void f(n paramn, k0.j paramj)
  {
    a.f(paramn, new i.g(paramj));
  }
  
  public final k0.e g()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     nb.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
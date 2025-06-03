package nb;

import eb.e1;
import eb.k0;
import eb.k0.c;
import eb.k0.d;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.h;
import eb.k0.j;
import eb.l0;
import eb.n;

public final class e
  extends b
{
  public static final b o = new b();
  public final a f;
  public final k0.e g;
  public k0.c h;
  public k0 i;
  public k0.c j;
  public k0 k;
  public n l;
  public k0.j m;
  public boolean n;
  
  public e(c paramc)
  {
    a locala = new a();
    f = locala;
    i = locala;
    k = locala;
    g = paramc;
  }
  
  public final void f()
  {
    k.f();
    i.f();
  }
  
  public final k0 g()
  {
    k0 localk01 = k;
    k0 localk02 = localk01;
    if (localk01 == f) {
      localk02 = i;
    }
    return localk02;
  }
  
  public final void h()
  {
    g.f(l, m);
    i.f();
    i = k;
    h = j;
    k = f;
    j = null;
  }
  
  public final void i(l0 paraml0)
  {
    x6.b.y(paraml0, "newBalancerFactory");
    if (paraml0.equals(j)) {
      return;
    }
    k.f();
    k = f;
    j = null;
    l = n.a;
    m = o;
    if (paraml0.equals(h)) {
      return;
    }
    f localf = new f(this);
    k0 localk0 = paraml0.a(localf);
    a = localk0;
    k = localk0;
    j = paraml0;
    if (!n) {
      h();
    }
  }
  
  public final class a
    extends k0
  {
    public a() {}
    
    public final void c(e1 parame1)
    {
      g.f(n.c, new k0.d(k0.f.a(parame1)));
    }
    
    public final void d(k0.h paramh)
    {
      throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
    }
    
    public final void f() {}
  }
  
  public final class b
    extends k0.j
  {
    public final k0.f a(k0.g paramg)
    {
      return k0.f.e;
    }
    
    public final String toString()
    {
      return "BUFFER_PICKER";
    }
  }
}

/* Location:
 * Qualified Name:     nb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
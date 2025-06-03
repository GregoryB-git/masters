package gb;

import eb.k0;
import eb.k0.c;
import eb.k0.e;
import eb.l0;
import eb.m0;
import f;
import g;

public final class i$a
{
  public final k0.e a;
  public k0 b;
  public l0 c;
  
  public i$a(i parami, r1.k paramk)
  {
    a = paramk;
    l0 locall0 = a.b(b);
    c = locall0;
    if (locall0 != null)
    {
      b = locall0.a(paramk);
      return;
    }
    throw new IllegalStateException(g.f(f.l("Could not find policy '"), b, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
  }
}

/* Location:
 * Qualified Name:     gb.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
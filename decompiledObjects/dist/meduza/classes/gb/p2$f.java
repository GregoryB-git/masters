package gb;

import b.k;
import eb.h1;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.b;

public final class p2$f
  extends k0.j
{
  public final p2 a;
  public final AtomicBoolean b = new AtomicBoolean(false);
  
  public p2$f(p2 paramp21, p2 paramp22)
  {
    b.y(paramp22, "pickFirstLeafLoadBalancer");
    a = paramp22;
  }
  
  public final k0.f a(k0.g paramg)
  {
    if (b.compareAndSet(false, true))
    {
      h1 localh1 = c.f.d();
      paramg = a;
      Objects.requireNonNull(paramg);
      localh1.execute(new k(paramg, 18));
    }
    return k0.f.e;
  }
}

/* Location:
 * Qualified Name:     gb.p2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
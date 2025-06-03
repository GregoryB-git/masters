package gb;

import eb.d;
import eb.d.a;
import eb.h1;
import eb.n;
import eb.o;
import eb.u;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n7.p;
import x6.b;

public final class d1$e$b
  implements Runnable
{
  public d1$e$b(d1.e parame, eb.e1 parame1) {}
  
  public final void run()
  {
    if (b.c.x.a == n.e) {
      return;
    }
    Object localObject1 = b.c.w;
    Object localObject2 = b;
    Object localObject3 = a;
    if (localObject1 == localObject3)
    {
      c.w = null;
      b.c.m.a();
      d1.b(b.c, n.d);
    }
    else
    {
      localObject1 = c;
      if (v == localObject3)
      {
        localObject1 = x.a;
        localObject3 = n.a;
        boolean bool1 = false;
        boolean bool2;
        if (localObject1 == localObject3) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        b.G(b.c.x.a, "Expected state is CONNECTING, actual state is %s", bool2);
        localObject1 = b.c.m;
        localObject3 = (u)a.get(b);
        int i = c + 1;
        c = i;
        if (i >= a.size())
        {
          b += 1;
          c = 0;
        }
        localObject3 = b.c.m;
        if (b < a.size()) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          localObject3 = b.c;
          v = null;
          m.a();
          localObject3 = b.c;
          localObject1 = a;
          l.d();
          b.s("The error status must not be OK", ((eb.e1)localObject1).e() ^ true);
          ((d1)localObject3).j(new o(n.c, (eb.e1)localObject1));
          if (o == null)
          {
            ((k0.a)d).getClass();
            o = new k0();
          }
          long l = ((k0)o).a();
          p localp = p;
          localObject2 = TimeUnit.NANOSECONDS;
          l -= localp.a((TimeUnit)localObject2);
          j.b(d.a.b, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new Object[] { d1.k((eb.e1)localObject1), Long.valueOf(l) });
          bool2 = bool1;
          if (q == null) {
            bool2 = true;
          }
          b.I(bool2, "previous reconnectTask is not done");
          q = l.c(new e1((d1)localObject3), l, (TimeUnit)localObject2, g);
        }
        else
        {
          d1.i(b.c);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
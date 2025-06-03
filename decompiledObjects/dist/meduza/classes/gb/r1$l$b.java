package gb;

import eb.a;
import eb.a.a;
import eb.d;
import eb.d.a;
import eb.d0;
import eb.e1;
import eb.k0;
import eb.k0.c;
import eb.k0.e;
import eb.k0.h;
import eb.l0;
import eb.u0.b;
import eb.u0.e;
import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import x6.b;

public final class r1$l$b
  implements Runnable
{
  public final void run()
  {
    d.a locala1 = d.a.a;
    d.a locala2 = d.a.b;
    Object localObject1 = b;
    Object localObject3 = c;
    if (w != b) {
      return;
    }
    localObject1 = a;
    List localList = a;
    P.b(locala1, "Resolved address: {0}, config={1}", new Object[] { localList, b });
    localObject3 = b.c;
    if (S != 2)
    {
      P.b(locala2, "Address resolved: {0}", new Object[] { localList });
      b.c.S = 2;
    }
    localObject3 = a;
    Object localObject4 = c;
    c3.b localb = (c3.b)b.a(c3.d);
    Object localObject5 = (d0)a.b.a(d0.a);
    if (localObject4 != null)
    {
      localObject3 = b;
      if (localObject3 != null)
      {
        localObject1 = (g2)localObject3;
        break label194;
      }
    }
    localObject1 = null;
    label194:
    if (localObject4 != null) {
      localObject3 = a;
    } else {
      localObject3 = null;
    }
    Object localObject6 = b.c;
    if (!V)
    {
      if (localObject1 != null) {
        P.a(locala2, "Service config from name resolver discarded by channel settings");
      }
      b.c.getClass();
      localObject3 = r1.j0;
      if (localObject5 != null) {
        b.c.P.a(locala2, "Config selector from name resolver discarded by channel settings");
      }
      b.c.R.D(((g2)localObject3).b());
    }
    else
    {
      if (localObject1 != null)
      {
        if (localObject5 != null)
        {
          R.D((d0)localObject5);
          localObject3 = localObject1;
          if (((g2)localObject1).b() != null)
          {
            b.c.P.a(locala1, "Method configs in service config will be discarded due to presence ofconfig-selector");
            localObject3 = localObject1;
          }
        }
        else
        {
          R.D(((g2)localObject1).b());
          localObject3 = localObject1;
        }
      }
      else if (localObject3 != null)
      {
        if (!U)
        {
          P.a(locala2, "Fallback to error due to invalid first service config without default config");
          b.a(a);
          if (localb != null) {
            localb.a(a);
          }
          return;
        }
        localObject3 = T;
      }
      else
      {
        localObject3 = r1.j0;
        R.D(null);
      }
      if (!((g2)localObject3).equals(b.c.T))
      {
        localObject5 = b.c.P;
        if (localObject3 == r1.j0) {
          localObject1 = " to empty";
        } else {
          localObject1 = "";
        }
        ((n)localObject5).b(locala2, "Service config changed{0}", new Object[] { localObject1 });
        localObject1 = b.c;
        T = ((g2)localObject3);
        c0.a = d;
      }
      try
      {
        b.c.U = true;
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject6 = r1.e0;
        localObject5 = Level.WARNING;
        localObject4 = f.l("[");
        ((StringBuilder)localObject4).append(b.c.b);
        ((StringBuilder)localObject4).append("] Unexpected exception from parsing service config");
        ((Logger)localObject6).log((Level)localObject5, ((StringBuilder)localObject4).toString(), localRuntimeException);
      }
    }
    localObject5 = a.b;
    Object localObject2 = b;
    if (a == c.y)
    {
      localObject5.getClass();
      localObject5 = new a.a((a)localObject5);
      ((a.a)localObject5).b(d0.a);
      localObject2 = f;
      if (localObject2 != null)
      {
        ((a.a)localObject5).c(k0.b, localObject2);
        ((a.a)localObject5).a();
      }
      localObject4 = ((a.a)localObject5).a();
      localObject5 = b.a.a;
      localObject2 = a.b;
      localObject3 = e;
      b.y(localList, "addresses");
      localList = Collections.unmodifiableList(new ArrayList(localList));
      b.y(localObject4, "attributes");
      localObject5.getClass();
      localObject2 = (g3.b)localObject3;
      localObject3 = localObject2;
      if (localObject2 == null) {
        try
        {
          localObject3 = d;
          localObject3 = i.a((i)localObject3, b);
          localObject3 = new g3.b((l0)localObject3, null);
        }
        catch (i.e locale)
        {
          locale1 = e1.m.g(locale.getMessage());
          a.f(eb.n.c, new i.c(locale1));
          b.f();
          c = null;
          b = new i.d();
          locale1 = e1.e;
          break label1056;
        }
      }
      if ((c == null) || (!a.b().equals(c.b())))
      {
        a.f(eb.n.a, new i.b());
        b.f();
        localObject2 = a;
        c = ((l0)localObject2);
        localObject6 = b;
        b = ((k0.c)localObject2).a(a);
        a.b().b(locala2, "Load balancer changed from {0} to {1}", new Object[] { localObject6.getClass().getSimpleName(), b.getClass().getSimpleName() });
      }
      localObject2 = b;
      if (localObject2 != null) {
        a.b().b(locala1, "Load-balancing config: {0}", new Object[] { b });
      }
      e1 locale1 = b.a(new k0.h(localList, (a)localObject4, localObject2));
      label1056:
      if (localb != null) {
        localb.a(locale1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import f2.i;
import f2.i.a;
import g2.e;
import g2.f;
import g2.f.a;
import g2.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import n2.c;
import n2.d;

public class r
{
  public final Context a;
  public final e b;
  public final d c;
  public final x d;
  public final Executor e;
  public final o2.b f;
  public final p2.a g;
  public final p2.a h;
  public final c i;
  
  public r(Context paramContext, e parame, d paramd, x paramx, Executor paramExecutor, o2.b paramb, p2.a parama1, p2.a parama2, c paramc)
  {
    a = paramContext;
    b = parame;
    c = paramd;
    d = paramx;
    e = paramExecutor;
    f = paramb;
    g = parama1;
    h = parama2;
    i = paramc;
  }
  
  public i j(g2.m paramm)
  {
    o2.b localb = f;
    Object localObject = i;
    Objects.requireNonNull(localObject);
    localObject = (i2.a)localb.a(new h((c)localObject));
    return paramm.a(i.a().i(g.a()).k(h.a()).j("GDT_CLIENT_METRICS").h(new f2.h(c2.b.b("proto"), ((i2.a)localObject).f())).d());
  }
  
  public boolean k()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public g2.g u(f2.p paramp, int paramInt)
  {
    g2.m localm = b.a(paramp.b());
    long l1 = 0L;
    Object localObject1 = g2.g.e(0L);
    while (((Boolean)f.a(new k(this, paramp))).booleanValue())
    {
      Object localObject2 = (Iterable)f.a(new l(this, paramp));
      if (!((Iterable)localObject2).iterator().hasNext()) {
        return (g2.g)localObject1;
      }
      if (localm == null) {
        j2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", paramp);
      }
      for (Object localObject3 = g2.g.a();; localObject3 = localm.b(f.a().b((Iterable)localObject1).c(paramp.c()).a()))
      {
        break;
        localObject1 = new ArrayList();
        localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((List)localObject1).add(((n2.k)((Iterator)localObject3).next()).b());
        }
        if (paramp.e()) {
          ((List)localObject1).add(j(localm));
        }
      }
      if (((g2.g)localObject3).c() == g.a.p)
      {
        f.a(new m(this, (Iterable)localObject2, paramp, l1));
        d.b(paramp, paramInt + 1, true);
        return (g2.g)localObject3;
      }
      f.a(new n(this, (Iterable)localObject2));
      if (((g2.g)localObject3).c() == g.a.o)
      {
        long l2 = Math.max(l1, ((g2.g)localObject3).b());
        l1 = l2;
        localObject1 = localObject3;
        if (paramp.e())
        {
          f.a(new o(this));
          l1 = l2;
          localObject1 = localObject3;
        }
      }
      else
      {
        localObject1 = localObject3;
        if (((g2.g)localObject3).c() == g.a.r)
        {
          HashMap localHashMap = new HashMap();
          localObject2 = ((Iterable)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            String str = ((n2.k)((Iterator)localObject2).next()).b().j();
            if (!localHashMap.containsKey(str)) {}
            for (localObject1 = Integer.valueOf(1);; localObject1 = Integer.valueOf(((Integer)localHashMap.get(str)).intValue() + 1))
            {
              localHashMap.put(str, localObject1);
              break;
            }
          }
          f.a(new p(this, localHashMap));
          localObject1 = localObject3;
        }
      }
    }
    f.a(new q(this, paramp, l1));
    return (g2.g)localObject1;
  }
  
  public void v(f2.p paramp, int paramInt, Runnable paramRunnable)
  {
    e.execute(new g(this, paramp, paramInt, paramRunnable));
  }
}

/* Location:
 * Qualified Name:     m2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
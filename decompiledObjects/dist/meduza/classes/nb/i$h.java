package nb;

import eb.a;
import eb.a.b;
import eb.d.a;
import eb.e1;
import eb.k0;
import eb.k0.b;
import eb.k0.b.a;
import eb.k0.i;
import eb.k0.k;
import eb.n;
import eb.o;
import eb.u;
import f;
import java.net.SocketAddress;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import o7.p;
import x6.b;

public final class i$h
  extends d
{
  public final k0.i a;
  public i.a b;
  public boolean c;
  public o d;
  public k0.k e;
  public final eb.d f;
  
  public i$h(i parami, k0.b paramb, g paramg)
  {
    parami = k0.b;
    Object localObject1 = (k0.k)paramb.a();
    parami = paramb;
    if (localObject1 != null)
    {
      e = ((k0.k)localObject1);
      localObject1 = new a((k0.k)localObject1);
      parami = new k0.b.a();
      parami.b(a);
      Object localObject2 = b;
      b.y(localObject2, "attrs");
      b = ((a)localObject2);
      paramb = c;
      localObject2 = new Object[paramb.length][2];
      c = ((Object[][])localObject2);
      System.arraycopy(paramb, 0, localObject2, 0, paramb.length);
      parami.a((k0.k)localObject1);
      parami = new k0.b(a, b, c);
    }
    parami = paramg.a(parami);
    a = parami;
    f = parami.d();
  }
  
  public final a c()
  {
    if (b != null)
    {
      Object localObject1 = a.c();
      localObject1.getClass();
      a.b localb = i.n;
      Object localObject2 = b;
      IdentityHashMap localIdentityHashMap = new IdentityHashMap(1);
      localIdentityHashMap.put(localb, localObject2);
      localObject1 = a.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (!localIdentityHashMap.containsKey(((Map.Entry)localObject2).getKey())) {
          localIdentityHashMap.put((a.b)((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
        }
      }
      return new a(localIdentityHashMap);
    }
    return a.c();
  }
  
  public final void g()
  {
    i.a locala = b;
    if (locala != null)
    {
      b = null;
      f.remove(this);
    }
    super.g();
  }
  
  public final void h(k0.k paramk)
  {
    if (e != null)
    {
      j().h(paramk);
    }
    else
    {
      e = paramk;
      paramk = new a(paramk);
      j().h(paramk);
    }
  }
  
  public final void i(List<u> paramList)
  {
    Object localObject;
    if ((i.g(b())) && (i.g(paramList)))
    {
      if (g.f.containsValue(b))
      {
        localObject = b;
        localObject.getClass();
        b = null;
        f.remove(this);
      }
      localObject = (SocketAddress)get0a.get(0);
      if (!g.f.containsKey(localObject)) {
        break label304;
      }
    }
    else
    {
      if ((i.g(b())) && (!i.g(paramList)))
      {
        if (!g.f.containsKey(aa.get(0))) {
          break label304;
        }
        i.a locala = (i.a)g.f.get(aa.get(0));
        locala.getClass();
        b = null;
        f.remove(this);
        localObject = b;
        a.set(0L);
        b.set(0L);
        localObject = c;
        a.set(0L);
        b.set(0L);
        break label304;
      }
      if ((i.g(b())) || (!i.g(paramList))) {
        break label304;
      }
      localObject = (SocketAddress)get0a.get(0);
      if (!g.f.containsKey(localObject)) {
        break label304;
      }
    }
    ((i.a)g.f.get(localObject)).a(this);
    label304:
    a.i(paramList);
  }
  
  public final k0.i j()
  {
    return a;
  }
  
  public final void k()
  {
    c = true;
    k0.k localk = e;
    e1 locale1 = e1.n;
    b.s("The error status must not be OK", locale1.e() ^ true);
    localk.a(new o(n.c, locale1));
    f.b(d.a.b, "Subchannel ejected: {0}", new Object[] { this });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("OutlierDetectionSubchannel{addresses=");
    localStringBuilder.append(a.b());
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final class a
    implements k0.k
  {
    public final k0.k a;
    
    public a(k0.k paramk)
    {
      a = paramk;
    }
    
    public final void a(o paramo)
    {
      i.h localh = i.h.this;
      d = paramo;
      if (!c) {
        a.a(paramo);
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
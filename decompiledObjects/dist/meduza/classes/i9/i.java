package i9;

import g9.f0;
import g9.k0;
import ia.a.b;
import ia.a.b.c;
import j9.l;
import j9.n;
import j9.o;
import j9.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k9.f;
import ka.a0.b;
import ka.a0.c;
import ka.d0;
import ka.e0.a;
import ka.k;
import ka.p;
import ka.p.b;
import ka.u;
import l9.a.a;
import l9.c;
import l9.e.a;
import ma.h;
import ma.m0;
import ma.n1;
import ma.w.a;

public final class i
{
  public final m9.e0 a;
  
  public i(m9.e0 parame0)
  {
    a = parame0;
  }
  
  public static ArrayList a(ia.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    parama = parama.I().iterator();
    while (parama.hasNext())
    {
      a.b localb = (a.b)parama.next();
      l locall = l.t(localb.J());
      int i = localb.L();
      int j = 2;
      if (q0.g.b(i, 2)) {
        j = 3;
      } else if (localb.K().equals(a.b.c.c)) {
        j = 1;
      }
      localArrayList.add(new j9.d(locall, j));
    }
    return localArrayList;
  }
  
  public final j9.m b(l9.a parama)
  {
    int i = q0.g.c(parama.L());
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          localObject1 = parama.O();
          parama = a.b(((l9.d)localObject1).J());
          localObject2 = a;
          localObject1 = ((l9.d)localObject1).K();
          localObject2.getClass();
          localObject2 = m9.e0.f((n1)localObject1);
          parama = new j9.m(parama);
          d = ((q)localObject2);
          c = 4;
          f = new n();
          g = 2;
          return parama;
        }
        x6.b.T("Unknown MaybeDocument %s", new Object[] { parama });
        throw null;
      }
      localObject2 = parama.K();
      bool = parama.M();
      parama = a.b(((k)localObject2).L());
      m9.e0 locale0 = a;
      localObject1 = ((k)localObject2).M();
      locale0.getClass();
      localObject1 = m9.e0.f((n1)localObject1);
      localObject2 = n.e(((k)localObject2).K());
      parama = new j9.m(parama);
      parama.k((q)localObject1, (n)localObject2);
      if (bool) {
        g = 2;
      }
      return parama;
    }
    Object localObject2 = parama.N();
    boolean bool = parama.M();
    Object localObject1 = a.b(((l9.b)localObject2).J());
    parama = a;
    localObject2 = ((l9.b)localObject2).K();
    parama.getClass();
    parama = j9.m.n((j9.i)localObject1, m9.e0.f((n1)localObject2));
    if (bool) {
      g = 2;
    }
    return parama;
  }
  
  public final k9.g c(l9.e parame)
  {
    int i = parame.M();
    Object localObject1 = a;
    Object localObject2 = parame.N();
    localObject1.getClass();
    long l = ((n1)localObject2).K();
    u7.m localm = new u7.m(((n1)localObject2).J(), l);
    int j = parame.L();
    localObject2 = new ArrayList(j);
    for (int k = 0; k < j; k++) {
      ((ArrayList)localObject2).add(a.c(parame.K(k)));
    }
    localObject1 = new ArrayList(parame.P());
    for (k = 0; k < parame.P(); k++)
    {
      Object localObject3 = parame.O(k);
      int m = k + 1;
      if ((m < parame.P()) && (parame.O(m).V())) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        x6.b.Z("TransformMutation should be preceded by a patch or set mutation", parame.O(k).W(), new Object[0]);
        e0.a locala = ka.e0.Z((ka.e0)localObject3);
        Iterator localIterator = parame.O(m).P().H().iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (p.b)localIterator.next();
          locala.m();
          ka.e0.H((ka.e0)b, (p.b)localObject3);
        }
        ((ArrayList)localObject1).add(a.c((ka.e0)locala.k()));
        k = m;
      }
      else
      {
        ((ArrayList)localObject1).add(a.c((ka.e0)localObject3));
      }
    }
    return new k9.g(i, localm, (ArrayList)localObject2, (List)localObject1);
  }
  
  public final m1 d(c paramc)
  {
    int i = paramc.U();
    Object localObject1 = a;
    Object localObject2 = paramc.T();
    localObject1.getClass();
    localObject1 = m9.e0.f((n1)localObject2);
    localObject2 = a;
    Object localObject3 = paramc.P();
    localObject2.getClass();
    localObject2 = m9.e0.f((n1)localObject3);
    localObject3 = paramc.S();
    long l = paramc.Q();
    int j = paramc.V().ordinal();
    m9.e0 locale0;
    if (j != 0)
    {
      if (j == 1)
      {
        locale0 = a;
        paramc = paramc.O();
        locale0.getClass();
        j = paramc.J();
        boolean bool;
        if (j == 1) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.Z("DocumentsTarget contained other than 1 document %d", bool, new Object[] { Integer.valueOf(j) });
        paramc = o.t(paramc.I());
        x6.b.Z("Tried to deserialize invalid key %s", m9.e0.q(paramc), new Object[] { paramc });
        if (paramc.q() == 4) {
          paramc = o.b;
        } else {
          paramc = m9.e0.p(paramc);
        }
        paramc = new f0(paramc, null).i();
      }
      else
      {
        x6.b.T("Unknown targetType %d", new Object[] { paramc.V() });
        throw null;
      }
    }
    else
    {
      locale0 = a;
      paramc = paramc.R();
      locale0.getClass();
      paramc = m9.e0.e(paramc.J(), paramc.K());
    }
    return new m1(paramc, i, l, e0.a, (q)localObject1, (q)localObject2, (h)localObject3, null);
  }
  
  public final l9.a e(j9.g paramg)
  {
    a.a locala = l9.a.P();
    Object localObject1;
    Object localObject2;
    u7.m localm;
    if (paramg.h())
    {
      localObject1 = l9.b.L();
      localObject2 = a.j(paramg.getKey());
      ((w.a)localObject1).m();
      l9.b.G((l9.b)b, (String)localObject2);
      localObject2 = a;
      localm = ja;
      localObject2.getClass();
      localObject2 = m9.e0.n(localm);
      ((w.a)localObject1).m();
      l9.b.H((l9.b)b, (n1)localObject2);
      localObject1 = (l9.b)((w.a)localObject1).k();
      locala.m();
      l9.a.H((l9.a)b, (l9.b)localObject1);
    }
    else if (paramg.b())
    {
      localObject1 = k.N();
      localObject2 = a.j(paramg.getKey());
      ((w.a)localObject1).m();
      k.G((k)b, (String)localObject2);
      localObject2 = paramg.getData().b().Y().J();
      ((w.a)localObject1).m();
      k.H((k)b).putAll((Map)localObject2);
      localObject2 = ja;
      a.getClass();
      localObject2 = m9.e0.n((u7.m)localObject2);
      ((w.a)localObject1).m();
      k.I((k)b, (n1)localObject2);
      localObject1 = (k)((w.a)localObject1).k();
      locala.m();
      l9.a.I((l9.a)b, (k)localObject1);
    }
    else
    {
      if (!paramg.i()) {
        break label413;
      }
      localObject1 = l9.d.L();
      localObject2 = a.j(paramg.getKey());
      ((w.a)localObject1).m();
      l9.d.G((l9.d)b, (String)localObject2);
      localObject2 = a;
      localm = ja;
      localObject2.getClass();
      localObject2 = m9.e0.n(localm);
      ((w.a)localObject1).m();
      l9.d.H((l9.d)b, (n1)localObject2);
      localObject1 = (l9.d)((w.a)localObject1).k();
      locala.m();
      l9.a.J((l9.a)b, (l9.d)localObject1);
    }
    boolean bool = paramg.c();
    locala.m();
    l9.a.G((l9.a)b, bool);
    return (l9.a)locala.k();
    label413:
    x6.b.T("Cannot encode invalid document %s", new Object[] { paramg });
    throw null;
  }
  
  public final l9.e f(k9.g paramg)
  {
    e.a locala = l9.e.Q();
    int i = a;
    locala.m();
    l9.e.G((l9.e)b, i);
    Object localObject1 = a;
    Object localObject2 = b;
    localObject1.getClass();
    localObject2 = m9.e0.n((u7.m)localObject2);
    locala.m();
    l9.e.J((l9.e)b, (n1)localObject2);
    localObject2 = c.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (f)((Iterator)localObject2).next();
      localObject1 = a.k((f)localObject1);
      locala.m();
      l9.e.H((l9.e)b, (ka.e0)localObject1);
    }
    paramg = d.iterator();
    while (paramg.hasNext())
    {
      localObject2 = (f)paramg.next();
      localObject2 = a.k((f)localObject2);
      locala.m();
      l9.e.I((l9.e)b, (ka.e0)localObject2);
    }
    return (l9.e)locala.k();
  }
  
  public final c g(m1 paramm1)
  {
    Object localObject1 = e0.a;
    x6.b.Z("Only queries with purpose %s may be stored, got %s", localObject1.equals(d), new Object[] { localObject1, d });
    localObject1 = c.W();
    int i = b;
    ((w.a)localObject1).m();
    c.K((c)b, i);
    long l = c;
    ((w.a)localObject1).m();
    c.N((c)b, l);
    Object localObject2 = a;
    Object localObject3 = f;
    localObject2.getClass();
    localObject3 = m9.e0.n(a);
    ((w.a)localObject1).m();
    c.I((c)b, (n1)localObject3);
    localObject3 = a;
    localObject2 = e;
    localObject3.getClass();
    localObject3 = m9.e0.n(a);
    ((w.a)localObject1).m();
    c.L((c)b, (n1)localObject3);
    localObject3 = g;
    ((w.a)localObject1).m();
    c.M((c)b, (h)localObject3);
    localObject2 = a;
    if (((k0)localObject2).e())
    {
      localObject3 = a;
      localObject3.getClass();
      paramm1 = a0.b.K();
      localObject2 = d;
      localObject3 = m9.e0.m(a, (o)localObject2);
      paramm1.m();
      a0.b.G((a0.b)b, (String)localObject3);
      paramm1 = (a0.b)paramm1.k();
      ((w.a)localObject1).m();
      c.H((c)b, paramm1);
    }
    else
    {
      paramm1 = a.l((k0)localObject2);
      ((w.a)localObject1).m();
      c.G((c)b, paramm1);
    }
    return (c)((w.a)localObject1).k();
  }
}

/* Location:
 * Qualified Name:     i9.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
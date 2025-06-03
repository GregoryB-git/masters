package m9;

import g9.k0;
import g9.l.a;
import j9.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k9.a;
import k9.a.a;
import k9.a.b;
import k9.c;
import k9.d;
import ka.a0.c;
import ka.a0.c.a;
import ka.d0;
import ka.e0.a;
import ka.h0;
import ka.k;
import ka.k.a;
import ka.p.b;
import ka.p.b.b;
import ka.u;
import ka.v;
import ka.z;
import ka.z.a;
import ka.z.b;
import ka.z.c;
import ka.z.c.b;
import ka.z.d;
import ka.z.e;
import ka.z.e.b;
import ka.z.f;
import ka.z.f.a;
import ka.z.g;
import ka.z.h;
import ka.z.h.a;
import ka.z.j;
import ka.z.j.b;
import ma.m0;
import ma.n1;
import ma.n1.a;
import ma.w.a;
import ma.x;

public final class e0
{
  public final j9.f a;
  public final String b;
  
  public e0(j9.f paramf)
  {
    a = paramf;
    b = o(paramf).h();
  }
  
  public static g9.m a(z.g paramg)
  {
    Object localObject1 = l.a.e;
    Object localObject2 = l.a.d;
    int i = paramg.M().ordinal();
    int j = 1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          paramg = paramg.N();
          localObject3 = j9.l.t(paramg.J().I());
          j = paramg.K().ordinal();
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 3)
              {
                if (j == 4)
                {
                  paramg = s.b;
                }
                else
                {
                  x6.b.T("Unrecognized UnaryFilter.operator %d", new Object[] { paramg.K() });
                  throw null;
                }
              }
              else {
                paramg = s.a;
              }
              paramg = g9.l.e((j9.l)localObject3, (l.a)localObject1, paramg);
              break label142;
            }
            paramg = s.b;
          }
          else
          {
            paramg = s.a;
          }
          paramg = g9.l.e((j9.l)localObject3, (l.a)localObject2, paramg);
          label142:
          return paramg;
        }
        x6.b.T("Unrecognized Filter.filterType %d", new Object[] { paramg.M() });
        throw null;
      }
      Object localObject3 = paramg.L();
      j9.l locall = j9.l.t(((z.e)localObject3).K().I());
      z.e.b localb = ((z.e)localObject3).L();
      paramg = (z.g)localObject1;
      switch (localb.ordinal())
      {
      default: 
        x6.b.T("Unhandled FieldFilter.operator %d", new Object[] { localb });
        throw null;
      case 10: 
        paramg = l.a.s;
        break;
      case 9: 
        paramg = l.a.q;
        break;
      case 8: 
        paramg = l.a.r;
        break;
      case 7: 
        paramg = l.a.p;
        break;
      case 5: 
        paramg = (z.g)localObject2;
        break;
      case 4: 
        paramg = l.a.o;
        break;
      case 3: 
        paramg = l.a.f;
        break;
      case 2: 
        paramg = l.a.c;
        break;
      case 1: 
        paramg = l.a.b;
      }
      return g9.l.e(locall, paramg, ((z.e)localObject3).M());
    }
    paramg = paramg.J();
    localObject1 = new ArrayList();
    localObject2 = paramg.J().iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((ArrayList)localObject1).add(a((z.g)((Iterator)localObject2).next()));
    }
    i = paramg.K().ordinal();
    if (i != 1) {
      if (i == 2)
      {
        j = 2;
      }
      else
      {
        x6.b.T("Only AND and OR composite filter types are supported.", new Object[0]);
        throw null;
      }
    }
    return new g9.g((List)localObject1, j);
  }
  
  public static k9.i d(h0 paramh0, j9.q paramq)
  {
    Object localObject = f(paramh0.I());
    if (!j9.q.b.equals(localObject)) {
      paramq = (j9.q)localObject;
    }
    int i = paramh0.H();
    localObject = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      ((ArrayList)localObject).add(paramh0.G(j));
    }
    return new k9.i(paramq, (ArrayList)localObject);
  }
  
  public static k0 e(String paramString, z paramz)
  {
    paramString = j9.o.t(paramString);
    x6.b.Z("Tried to deserialize invalid key %s", q(paramString), new Object[] { paramString });
    if (paramString.q() == 4) {
      paramString = j9.o.b;
    } else {
      paramString = p(paramString);
    }
    int i = paramz.P();
    g9.e locale = null;
    Object localObject1 = paramString;
    String str;
    if (i > 0)
    {
      if (i == 1) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("StructuredQuery.from with more than one collection is not supported.", bool, new Object[0]);
      localObject1 = paramz.O();
      boolean bool = ((z.b)localObject1).I();
      str = ((z.b)localObject1).J();
      if (bool) {
        localObject1 = paramString;
      } else {
        localObject1 = (j9.o)paramString.g(str);
      }
    }
    else
    {
      str = null;
    }
    Object localObject2;
    Object localObject3;
    if (paramz.Y())
    {
      localObject2 = a(paramz.U());
      if ((localObject2 instanceof g9.g))
      {
        paramString = (g9.g)localObject2;
        localObject3 = a.iterator();
        while (((Iterator)localObject3).hasNext()) {
          if (((g9.m)((Iterator)localObject3).next() instanceof g9.g))
          {
            i = 0;
            break label198;
          }
        }
        i = 1;
        label198:
        if ((i != 0) && (paramString.e())) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramString = paramString.b();
          break label241;
        }
      }
      paramString = Collections.singletonList(localObject2);
    }
    else
    {
      paramString = Collections.emptyList();
    }
    label241:
    int j = paramz.S();
    if (j > 0)
    {
      localObject3 = new ArrayList(j);
      for (i = 0; i < j; i++)
      {
        z.h localh = paramz.R(i);
        localObject2 = j9.l.t(localh.J().I());
        int k = localh.I().ordinal();
        int m = 2;
        if (k != 1)
        {
          if (k != 2)
          {
            x6.b.T("Unrecognized direction %d", new Object[] { localh.I() });
            throw null;
          }
        }
        else {
          m = 1;
        }
        ((ArrayList)localObject3).add(new g9.e0(m, (j9.l)localObject2));
      }
    }
    else
    {
      localObject3 = Collections.emptyList();
    }
    long l = -1L;
    if (paramz.W()) {
      l = paramz.Q().I();
    }
    if (paramz.X()) {
      localObject2 = new g9.e(paramz.T().h(), paramz.T().I());
    } else {
      localObject2 = null;
    }
    if (paramz.V()) {
      locale = new g9.e(paramz.N().h(), paramz.N().I() ^ true);
    }
    return new k0((j9.o)localObject1, str, paramString, (List)localObject3, l, (g9.e)localObject2, locale);
  }
  
  public static j9.q f(n1 paramn1)
  {
    if ((paramn1.K() == 0L) && (paramn1.J() == 0)) {
      return j9.q.b;
    }
    long l = paramn1.K();
    return new j9.q(new u7.m(paramn1.J(), l));
  }
  
  public static z.f h(j9.l paraml)
  {
    z.f.a locala = z.f.J();
    paraml = paraml.h();
    locala.m();
    z.f.G((z.f)b, paraml);
    return (z.f)locala.k();
  }
  
  public static z.g i(g9.m paramm)
  {
    Object localObject1;
    Object localObject2;
    int i;
    if ((paramm instanceof g9.l))
    {
      localObject1 = (g9.l)paramm;
      localObject2 = a;
      paramm = l.a.d;
      if ((localObject2 == paramm) || (localObject2 == l.a.e))
      {
        localObject2 = z.j.L();
        Object localObject3 = h(c);
        ((w.a)localObject2).m();
        z.j.H((z.j)b, (z.f)localObject3);
        localObject3 = b;
        d0 locald0 = s.a;
        if ((localObject3 != null) && (Double.isNaN(((d0)localObject3).V()))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (a == paramm) {
            paramm = z.j.b.c;
          } else {
            paramm = z.j.b.e;
          }
        }
        else
        {
          localObject3 = b;
          if ((localObject3 != null) && (((d0)localObject3).c0() == 1)) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {
            break label213;
          }
          if (a == paramm) {
            paramm = z.j.b.d;
          } else {
            paramm = z.j.b.f;
          }
        }
        ((w.a)localObject2).m();
        z.j.G((z.j)b, paramm);
        paramm = z.g.O();
        paramm.m();
        z.g.G((z.g)b, (z.j)((w.a)localObject2).k());
        break label447;
      }
      label213:
      localObject2 = z.e.N();
      paramm = h(c);
      ((w.a)localObject2).m();
      z.e.G((z.e)b, paramm);
      paramm = a;
      switch (paramm.ordinal())
      {
      default: 
        x6.b.T("Unknown operator %d", new Object[] { paramm });
        throw null;
      case 9: 
        paramm = z.e.b.t;
        break;
      case 8: 
        paramm = z.e.b.r;
        break;
      case 7: 
        paramm = z.e.b.s;
        break;
      case 6: 
        paramm = z.e.b.q;
        break;
      case 5: 
        paramm = z.e.b.f;
        break;
      case 4: 
        paramm = z.e.b.e;
        break;
      case 3: 
        paramm = z.e.b.p;
        break;
      case 2: 
        paramm = z.e.b.o;
        break;
      case 1: 
        paramm = z.e.b.d;
        break;
      case 0: 
        paramm = z.e.b.c;
      }
      ((w.a)localObject2).m();
      z.e.H((z.e)b, paramm);
      paramm = b;
      ((w.a)localObject2).m();
      z.e.I((z.e)b, paramm);
      paramm = z.g.O();
      paramm.m();
      z.g.F((z.g)b, (z.e)((w.a)localObject2).k());
      label447:
      return (z.g)paramm.k();
    }
    if ((paramm instanceof g9.g))
    {
      paramm = (g9.g)paramm;
      localObject2 = new ArrayList(paramm.b().size());
      localObject1 = paramm.b().iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject2).add(i((g9.m)((Iterator)localObject1).next()));
      }
      if (((ArrayList)localObject2).size() == 1) {}
      for (paramm = ((ArrayList)localObject2).get(0);; paramm = paramm.k())
      {
        paramm = (z.g)paramm;
        break;
        localObject1 = z.c.L();
        i = q0.g.c(b);
        if (i != 0)
        {
          if (i == 1)
          {
            paramm = z.c.b.d;
          }
          else
          {
            x6.b.T("Unrecognized composite filter type.", new Object[0]);
            throw null;
          }
        }
        else {
          paramm = z.c.b.c;
        }
        ((w.a)localObject1).m();
        z.c.G((z.c)b, paramm);
        ((w.a)localObject1).m();
        z.c.H((z.c)b, (ArrayList)localObject2);
        paramm = z.g.O();
        paramm.m();
        z.g.I((z.g)b, (z.c)((w.a)localObject1).k());
      }
      return paramm;
    }
    x6.b.T("Unrecognized filter type %s", new Object[] { paramm.toString() });
    throw null;
  }
  
  public static String m(j9.f paramf, j9.o paramo)
  {
    return ((j9.o)((j9.o)o(paramf).g("documents")).f(paramo)).h();
  }
  
  public static n1 n(u7.m paramm)
  {
    n1.a locala = n1.L();
    locala.p(a);
    int i = b;
    locala.m();
    n1.H((n1)b, i);
    return (n1)locala.k();
  }
  
  public static j9.o o(j9.f paramf)
  {
    List localList = Arrays.asList(new String[] { "projects", a, "databases", b });
    paramf = j9.o.b;
    if (localList.isEmpty()) {
      paramf = j9.o.b;
    } else {
      paramf = new j9.o(localList);
    }
    return paramf;
  }
  
  public static j9.o p(j9.o paramo)
  {
    boolean bool;
    if ((paramo.q() > 4) && (paramo.n(4).equals("documents"))) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Tried to deserialize invalid key %s", bool, new Object[] { paramo });
    return (j9.o)paramo.r();
  }
  
  public static boolean q(j9.o paramo)
  {
    int i = paramo.q();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i >= 4)
    {
      bool2 = bool1;
      if (paramo.n(0).equals("projects"))
      {
        bool2 = bool1;
        if (paramo.n(2).equals("databases")) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final j9.i b(String paramString)
  {
    paramString = j9.o.t(paramString);
    x6.b.Z("Tried to deserialize invalid key %s", q(paramString), new Object[] { paramString });
    x6.b.Z("Tried to deserialize key from different project.", paramString.n(1).equals(a.a), new Object[0]);
    x6.b.Z("Tried to deserialize key from different database.", paramString.n(3).equals(a.b), new Object[0]);
    return new j9.i(p(paramString));
  }
  
  public final k9.f c(ka.e0 parame0)
  {
    boolean bool = parame0.U();
    int i = 0;
    Object localObject1;
    if (bool)
    {
      localObject1 = parame0.M();
      j = q0.g.c(((v)localObject1).I());
      if (j != 0)
      {
        if (j != 1)
        {
          if (j == 2)
          {
            localObject1 = k9.m.c;
          }
          else
          {
            x6.b.T("Unknown precondition", new Object[0]);
            throw null;
          }
        }
        else {
          localObject1 = new k9.m(f(((v)localObject1).L()), null);
        }
      }
      else {
        localObject1 = k9.m.a(((v)localObject1).K());
      }
    }
    else
    {
      localObject1 = k9.m.c;
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = parame0.S().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (p.b)((Iterator)localObject2).next();
      j = q0.g.c(((p.b)localObject3).Q());
      if (j != 0)
      {
        if (j != 1)
        {
          if (j != 4)
          {
            if (j == 5)
            {
              localObject3 = new k9.e(j9.l.t(((p.b)localObject3).M()), new a.a(((p.b)localObject3).O().h()));
            }
            else
            {
              x6.b.T("Unknown FieldTransform proto: %s", new Object[] { localObject3 });
              throw null;
            }
          }
          else {
            localObject3 = new k9.e(j9.l.t(((p.b)localObject3).M()), new a.b(((p.b)localObject3).L().h()));
          }
        }
        else {
          localObject3 = new k9.e(j9.l.t(((p.b)localObject3).M()), new k9.j(((p.b)localObject3).N()));
        }
      }
      else
      {
        if (((p.b)localObject3).P() == p.b.b.c) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.Z("Unknown transform setToServerValue: %s", bool, new Object[] { ((p.b)localObject3).P() });
        localObject3 = new k9.e(j9.l.t(((p.b)localObject3).M()), k9.n.a);
      }
      localArrayList.add(localObject3);
    }
    int j = parame0.O().ordinal();
    if (j != 0)
    {
      if (j != 1)
      {
        if (j == 2) {
          return new k9.q(b(parame0.T()), (k9.m)localObject1);
        }
        x6.b.T("Unknown mutation operation: %d", new Object[] { parame0.O() });
        throw null;
      }
      return new c(b(parame0.N()), (k9.m)localObject1);
    }
    if (parame0.X())
    {
      localObject3 = b(parame0.Q().L());
      localObject2 = j9.n.e(parame0.Q().K());
      parame0 = parame0.R();
      j = parame0.J();
      HashSet localHashSet = new HashSet(j);
      while (i < j)
      {
        localHashSet.add(j9.l.t(parame0.I(i)));
        i++;
      }
      return new k9.l((j9.i)localObject3, (j9.n)localObject2, new d(localHashSet), (k9.m)localObject1, localArrayList);
    }
    return new k9.o(b(parame0.Q().L()), j9.n.e(parame0.Q().K()), (k9.m)localObject1, localArrayList);
  }
  
  public final k g(j9.i parami, j9.n paramn)
  {
    k.a locala = k.N();
    parami = m(a, a);
    locala.m();
    k.G((k)b, parami);
    parami = paramn.b().Y().J();
    locala.m();
    k.H((k)b).putAll(parami);
    return (k)locala.k();
  }
  
  public final String j(j9.i parami)
  {
    return m(a, a);
  }
  
  public final ka.e0 k(k9.f paramf)
  {
    e0.a locala = ka.e0.Y();
    Object localObject3;
    if ((paramf instanceof k9.o))
    {
      localObject1 = g(a, d);
      locala.m();
      ka.e0.I((ka.e0)b, (k)localObject1);
    }
    else if ((paramf instanceof k9.l))
    {
      localObject1 = g(a, d);
      locala.m();
      ka.e0.I((ka.e0)b, (k)localObject1);
      localObject2 = paramf.d();
      localObject1 = ka.n.K();
      localObject2 = a.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((j9.l)((Iterator)localObject2).next()).h();
        ((w.a)localObject1).m();
        ka.n.G((ka.n)b, (String)localObject3);
      }
      localObject1 = (ka.n)((w.a)localObject1).k();
      locala.m();
      ka.e0.G((ka.e0)b, (ka.n)localObject1);
    }
    else if ((paramf instanceof c))
    {
      localObject1 = j(a);
      locala.m();
      ka.e0.K((ka.e0)b, (String)localObject1);
    }
    else
    {
      if (!(paramf instanceof k9.q)) {
        break label832;
      }
      localObject1 = j(a);
      locala.m();
      ka.e0.L((ka.e0)b, (String)localObject1);
    }
    Object localObject2 = c.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (k9.e)((Iterator)localObject2).next();
      localObject1 = b;
      if ((localObject1 instanceof k9.n))
      {
        localObject1 = p.b.R();
        localObject3 = a.h();
        ((w.a)localObject1).m();
        p.b.H((p.b)b, (String)localObject3);
        ((w.a)localObject1).m();
        p.b.J((p.b)b);
        localObject1 = ((w.a)localObject1).k();
      }
      else
      {
        Object localObject4;
        if ((localObject1 instanceof a.b))
        {
          localObject4 = (a.b)localObject1;
          localObject1 = p.b.R();
          localObject3 = a.h();
          ((w.a)localObject1).m();
          p.b.H((p.b)b, (String)localObject3);
          localObject3 = ka.b.M();
          localObject4 = a;
          ((w.a)localObject3).m();
          ka.b.H((ka.b)b, (List)localObject4);
          ((w.a)localObject1).m();
          p.b.G((p.b)b, (ka.b)((w.a)localObject3).k());
        }
        else if ((localObject1 instanceof a.a))
        {
          localObject4 = (a.a)localObject1;
          localObject1 = p.b.R();
          localObject3 = a.h();
          ((w.a)localObject1).m();
          p.b.H((p.b)b, (String)localObject3);
          localObject3 = ka.b.M();
          localObject4 = a;
          ((w.a)localObject3).m();
          ka.b.H((ka.b)b, (List)localObject4);
          ((w.a)localObject1).m();
          p.b.I((p.b)b, (ka.b)((w.a)localObject3).k());
        }
        else
        {
          if (!(localObject1 instanceof k9.j)) {
            break label628;
          }
          localObject4 = (k9.j)localObject1;
          localObject1 = p.b.R();
          localObject3 = a.h();
          ((w.a)localObject1).m();
          p.b.H((p.b)b, (String)localObject3);
          localObject3 = a;
          ((w.a)localObject1).m();
          p.b.K((p.b)b, (d0)localObject3);
        }
        localObject1 = ((w.a)localObject1).k();
      }
      localObject1 = (p.b)localObject1;
      locala.m();
      ka.e0.H((ka.e0)b, (p.b)localObject1);
      continue;
      label628:
      x6.b.T("Unknown transform: %s", new Object[] { localObject1 });
      throw null;
    }
    Object localObject1 = b;
    paramf = a;
    int i;
    if ((paramf == null) && (b == null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      if ((paramf == null) && (b == null)) {
        i = 1;
      } else {
        i = 0;
      }
      x6.b.Z("Can't serialize an empty precondition", i ^ 0x1, new Object[0]);
      paramf = v.M();
      localObject2 = a;
      if (localObject2 != null)
      {
        localObject1 = n(a);
        paramf.m();
        v.H((v)b, (n1)localObject1);
      }
      else
      {
        localObject1 = b;
        if (localObject1 == null) {
          break label812;
        }
        boolean bool = ((Boolean)localObject1).booleanValue();
        paramf.m();
        v.G((v)b, bool);
      }
      paramf = (v)paramf.k();
      locala.m();
      ka.e0.J((ka.e0)b, paramf);
      break label824;
      label812:
      x6.b.T("Unknown Precondition", new Object[0]);
      throw null;
    }
    label824:
    return (ka.e0)locala.k();
    label832:
    x6.b.T("unknown mutation type %s", new Object[] { paramf.getClass() });
    throw null;
  }
  
  public final a0.c l(k0 paramk0)
  {
    a0.c.a locala = a0.c.L();
    z.a locala1 = z.Z();
    Object localObject1 = d;
    Object localObject2 = e;
    int i = 0;
    boolean bool;
    if (localObject2 != null)
    {
      if (((j9.e)localObject1).q() % 2 == 0) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Collection Group queries should be within a document path or root.", bool, new Object[0]);
      localObject1 = m(a, (j9.o)localObject1);
      locala.m();
      a0.c.H((a0.c)b, (String)localObject1);
      localObject2 = z.b.K();
      localObject1 = e;
      ((w.a)localObject2).m();
      z.b.G((z.b)b, (String)localObject1);
      ((w.a)localObject2).m();
      z.b.H((z.b)b);
      locala1.m();
      z.G((z)b, (z.b)((w.a)localObject2).k());
    }
    else
    {
      if (((j9.e)localObject1).q() % 2 != 0) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Document queries with filters are not supported.", bool, new Object[0]);
      localObject2 = (j9.o)((j9.e)localObject1).s();
      localObject2 = m(a, (j9.o)localObject2);
      locala.m();
      a0.c.H((a0.c)b, (String)localObject2);
      localObject2 = z.b.K();
      localObject1 = ((j9.e)localObject1).m();
      ((w.a)localObject2).m();
      z.b.G((z.b)b, (String)localObject1);
      locala1.m();
      z.G((z)b, (z.b)((w.a)localObject2).k());
    }
    if (c.size() > 0)
    {
      localObject1 = i(new g9.g(c, 1));
      locala1.m();
      z.H((z)b, (z.g)localObject1);
    }
    localObject2 = b.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      g9.e0 locale0 = (g9.e0)((Iterator)localObject2).next();
      z.h.a locala2 = z.h.K();
      if (q0.g.b(a, 1)) {}
      for (localObject1 = z.d.c;; localObject1 = z.d.d)
      {
        locala2.m();
        z.h.H((z.h)b, (z.d)localObject1);
        break;
      }
      localObject1 = h(b);
      locala2.m();
      z.h.G((z.h)b, (z.f)localObject1);
      localObject1 = (z.h)locala2.k();
      locala1.m();
      z.I((z)b, (z.h)localObject1);
    }
    if (f != -1L) {
      i = 1;
    }
    if (i != 0)
    {
      localObject1 = x.J();
      i = (int)f;
      ((w.a)localObject1).m();
      x.G((x)b, i);
      locala1.m();
      z.L((z)b, (x)((w.a)localObject1).k());
    }
    if (g != null)
    {
      localObject1 = ka.j.K();
      localObject2 = g.b;
      ((w.a)localObject1).m();
      ka.j.G((ka.j)b, (List)localObject2);
      bool = g.a;
      ((w.a)localObject1).m();
      ka.j.H((ka.j)b, bool);
      locala1.m();
      z.J((z)b, (ka.j)((w.a)localObject1).k());
    }
    if (h != null)
    {
      localObject1 = ka.j.K();
      localObject2 = h.b;
      ((w.a)localObject1).m();
      ka.j.G((ka.j)b, (List)localObject2);
      bool = h.a;
      ((w.a)localObject1).m();
      ka.j.H((ka.j)b, bool ^ true);
      locala1.m();
      z.K((z)b, (ka.j)((w.a)localObject1).k());
    }
    locala.m();
    a0.c.F((a0.c)b, (z)locala1.k());
    return (a0.c)locala.k();
  }
}

/* Location:
 * Qualified Name:     m9.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
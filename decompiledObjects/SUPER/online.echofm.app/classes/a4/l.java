package a4;

import V3.G;
import W3.e;
import W3.f;
import b4.d.a;
import d4.g;
import d4.h;
import d4.i;
import d4.j;
import d4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class l
{
  public static d.a b = new a();
  public final b4.d a;
  
  public l(b4.d paramd)
  {
    a = paramd;
  }
  
  public static boolean g(k paramk, d4.b paramb)
  {
    return paramk.c().c(paramb);
  }
  
  public final k a(k paramk, V3.k paramk1, Y3.d paramd, G paramG, n paramn, b4.a parama)
  {
    if (paramG.i(paramk1) != null) {
      return paramk;
    }
    boolean bool = paramk.d().e();
    Object localObject1 = paramk.d();
    if (paramd.getValue() != null)
    {
      if (((paramk1.isEmpty()) && (((a)localObject1).f())) || (((a)localObject1).d(paramk1))) {
        return d(paramk, paramk1, ((a)localObject1).b().A(paramk1), paramG, paramn, bool, parama);
      }
      paramd = paramk;
      if (paramk1.isEmpty())
      {
        paramd = V3.b.s();
        localObject2 = ((a)localObject1).b().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (d4.m)((Iterator)localObject2).next();
          paramd = paramd.d(((d4.m)localObject1).c(), ((d4.m)localObject1).d());
        }
        paramd = c(paramk, paramk1, paramd, paramG, paramn, bool, parama);
      }
      return paramd;
    }
    Object localObject2 = V3.b.s();
    Iterator localIterator = paramd.iterator();
    paramd = (Y3.d)localObject2;
    while (localIterator.hasNext())
    {
      V3.k localk = (V3.k)((Map.Entry)localIterator.next()).getKey();
      localObject2 = paramk1.T(localk);
      if (((a)localObject1).d((V3.k)localObject2)) {
        paramd = paramd.a(localk, ((a)localObject1).b().A((V3.k)localObject2));
      }
    }
    return c(paramk, paramk1, paramd, paramG, paramn, bool, parama);
  }
  
  public c b(k paramk, W3.d paramd, G paramG, n paramn)
  {
    b4.a locala = new b4.a();
    int i = b.a[paramd.c().ordinal()];
    boolean bool;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4)
          {
            paramd = i(paramk, paramd.a(), paramG, paramn, locala);
          }
          else
          {
            paramk = new StringBuilder();
            paramk.append("Unknown operation: ");
            paramk.append(paramd.c());
            throw new AssertionError(paramk.toString());
          }
        }
        else
        {
          paramd = (W3.a)paramd;
          bool = paramd.f();
          V3.k localk = paramd.a();
          if (!bool) {
            paramd = a(paramk, localk, paramd.e(), paramG, paramn, locala);
          } else {
            paramd = k(paramk, localk, paramG, paramn, locala);
          }
        }
      }
      else
      {
        paramd = (W3.c)paramd;
        if (paramd.b().d())
        {
          paramd = e(paramk, paramd.a(), paramd.e(), paramG, paramn, locala);
        }
        else
        {
          Y3.m.f(paramd.b().c());
          if ((!paramd.b().e()) && (!paramk.d().e())) {
            bool = false;
          } else {
            bool = true;
          }
          paramd = c(paramk, paramd.a(), paramd.e(), paramG, paramn, bool, locala);
        }
      }
    }
    else
    {
      paramd = (f)paramd;
      if (paramd.b().d())
      {
        paramd = f(paramk, paramd.a(), paramd.e(), paramG, paramn, locala);
      }
      else
      {
        Y3.m.f(paramd.b().c());
        if ((!paramd.b().e()) && ((!paramk.d().e()) || (paramd.a().isEmpty()))) {
          bool = false;
        } else {
          bool = true;
        }
        paramd = d(paramk, paramd.a(), paramd.e(), paramG, paramn, bool, locala);
      }
    }
    paramG = new ArrayList(locala.a());
    j(paramk, paramd, paramG);
    return new c(paramd, paramG);
  }
  
  public final k c(k paramk, V3.k paramk1, V3.b paramb, G paramG, n paramn, boolean paramBoolean, b4.a parama)
  {
    if ((paramk.d().b().isEmpty()) && (!paramk.d().f())) {
      return paramk;
    }
    boolean bool;
    if (paramb.X() == null) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.g(bool, "Can't have a merge that is an overwrite");
    if (paramk1.isEmpty()) {
      paramk1 = paramb;
    } else {
      paramk1 = V3.b.s().f(paramk1, paramb);
    }
    paramb = paramk.d().b();
    Object localObject1 = paramk1.q();
    Object localObject2 = ((Map)localObject1).entrySet().iterator();
    paramk1 = paramk;
    Object localObject3;
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (d4.b)localEntry.getKey();
      if (paramb.Q((d4.b)localObject3))
      {
        localObject4 = paramb.v((d4.b)localObject3);
        localObject4 = ((V3.b)localEntry.getValue()).g((n)localObject4);
        paramk1 = d(paramk1, new V3.k(new d4.b[] { localObject3 }), (n)localObject4, paramG, paramn, paramBoolean, parama);
      }
    }
    localObject1 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (d4.b)((Map.Entry)localObject3).getKey();
      localObject4 = (V3.b)((Map.Entry)localObject3).getValue();
      int i;
      if ((!paramk.d().c((d4.b)localObject2)) && (((V3.b)localObject4).X() == null)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((!paramb.Q((d4.b)localObject2)) && (i == 0))
      {
        localObject4 = paramb.v((d4.b)localObject2);
        localObject3 = ((V3.b)((Map.Entry)localObject3).getValue()).g((n)localObject4);
        paramk1 = d(paramk1, new V3.k(new d4.b[] { localObject2 }), (n)localObject3, paramG, paramn, paramBoolean, parama);
      }
    }
    return paramk1;
  }
  
  public final k d(k paramk, V3.k paramk1, n paramn1, G paramG, n paramn2, boolean paramBoolean, b4.a parama)
  {
    a locala = paramk.d();
    b4.d locald = a;
    if (!paramBoolean) {
      locald = locald.b();
    }
    paramBoolean = paramk1.isEmpty();
    boolean bool = true;
    if (paramBoolean)
    {
      localObject = locala.a();
      paramn1 = i.f(paramn1, locald.e());
    }
    for (;;)
    {
      paramn1 = locald.f((i)localObject, paramn1, null);
      break label261;
      if ((!locald.d()) || (locala.e())) {
        break;
      }
      Y3.m.g(paramk1.isEmpty() ^ true, "An empty path should have been caught in the other branch");
      localObject = paramk1.Z();
      localk = paramk1.c0();
      paramn1 = locala.b().v((d4.b)localObject).y(localk, paramn1);
      paramn1 = locala.a().D((d4.b)localObject, paramn1);
      localObject = locala.a();
    }
    Object localObject = paramk1.Z();
    if ((!locala.d(paramk1)) && (paramk1.size() > 1)) {
      return paramk;
    }
    V3.k localk = paramk1.c0();
    paramn1 = locala.b().v((d4.b)localObject).y(localk, paramn1);
    if (((d4.b)localObject).s()) {
      paramn1 = locald.a(locala.a(), paramn1);
    } else {
      paramn1 = locald.c(locala.a(), (d4.b)localObject, paramn1, localk, b, null);
    }
    label261:
    paramBoolean = bool;
    if (!locala.f()) {
      if (paramk1.isEmpty()) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      }
    }
    paramk = paramk.f(paramn1, paramBoolean, locald.d());
    return h(paramk, paramk1, paramG, new d(paramG, paramk, paramn2), parama);
  }
  
  public final k e(k paramk, V3.k paramk1, V3.b paramb, G paramG, n paramn, b4.a parama)
  {
    boolean bool;
    if (paramb.X() == null) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.g(bool, "Can't have a merge that is an overwrite");
    Iterator localIterator = paramb.iterator();
    Object localObject = paramk;
    Map.Entry localEntry;
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      V3.k localk = paramk1.T((V3.k)localEntry.getKey());
      if (g(paramk, localk.Z())) {
        localObject = f((k)localObject, localk, (n)localEntry.getValue(), paramG, paramn, parama);
      }
    }
    localIterator = paramb.iterator();
    paramb = (V3.b)localObject;
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      localObject = paramk1.T((V3.k)localEntry.getKey());
      if (!g(paramk, ((V3.k)localObject).Z())) {
        paramb = f(paramb, (V3.k)localObject, (n)localEntry.getValue(), paramG, paramn, parama);
      }
    }
    return paramb;
  }
  
  public final k f(k paramk, V3.k paramk1, n paramn1, G paramG, n paramn2, b4.a parama)
  {
    a locala = paramk.c();
    paramG = new d(paramG, paramk, paramn2);
    if (paramk1.isEmpty())
    {
      paramk1 = i.f(paramn1, a.e());
      paramk1 = paramk.e(a.f(paramk.c().a(), paramk1, parama), true, a.d());
    }
    else
    {
      paramn2 = paramk1.Z();
      boolean bool1;
      if (paramn2.s())
      {
        paramk1 = a.a(paramk.c().a(), paramn1);
        bool1 = locala.f();
      }
      for (boolean bool2 = locala.e();; bool2 = a.d())
      {
        paramk1 = paramk.e(paramk1, bool1, bool2);
        break;
        V3.k localk = paramk1.c0();
        n localn = locala.b().v(paramn2);
        if (!localk.isEmpty()) {
          for (;;)
          {
            paramk1 = paramG.b(paramn2);
            if (paramk1 != null)
            {
              if ((localk.X().s()) && (paramk1.A(localk.a0()).isEmpty())) {
                paramn1 = paramk1;
              } else {
                paramn1 = paramk1.y(localk, paramn1);
              }
            }
            else {
              paramn1 = g.W();
            }
          }
        }
        paramk1 = paramk;
        if (localn.equals(paramn1)) {
          break;
        }
        paramk1 = a.c(locala.a(), paramn2, paramn1, localk, paramG, parama);
        bool1 = locala.f();
      }
    }
    return paramk1;
  }
  
  public final k h(k paramk, V3.k paramk1, G paramG, d.a parama, b4.a parama1)
  {
    a locala = paramk.c();
    if (paramG.i(paramk1) != null) {
      return paramk;
    }
    boolean bool1 = paramk1.isEmpty();
    boolean bool2 = false;
    if (bool1)
    {
      Y3.m.g(paramk.d().f(), "If change path is empty, we must have complete server data");
      if (paramk.d().e())
      {
        parama = paramk.b();
        if (!(parama instanceof d4.c)) {
          parama = g.W();
        }
        paramG = paramG.e(parama);
      }
      else
      {
        paramG = paramG.b(paramk.b());
      }
      paramG = i.f(paramG, a.e());
      paramG = a.f(paramk.c().a(), paramG, parama1);
    }
    else
    {
      d4.b localb = paramk1.Z();
      if (localb.s())
      {
        if (paramk1.size() == 1) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        Y3.m.g(bool1, "Can't have a priority with additional path components");
        paramG = paramG.f(paramk1, locala.b(), paramk.d().b());
        if (paramG != null)
        {
          paramG = a.a(locala.a(), paramG);
          break label344;
        }
      }
      else
      {
        V3.k localk = paramk1.c0();
        if (locala.c(localb))
        {
          n localn = paramk.d().b();
          paramG = paramG.f(paramk1, locala.b(), localn);
          if (paramG != null) {
            paramG = locala.b().v(localb).y(localk, paramG);
          }
        }
        for (paramG = locala.b().v(localb);; paramG = paramG.a(localb, paramk.d())) {
          break;
        }
        if (paramG != null)
        {
          paramG = a.c(locala.a(), localb, paramG, localk, parama, parama1);
          break label344;
        }
      }
      paramG = locala.a();
    }
    label344:
    if (!locala.f())
    {
      bool1 = bool2;
      if (!paramk1.isEmpty()) {}
    }
    else
    {
      bool1 = true;
    }
    return paramk.e(paramG, bool1, a.d());
  }
  
  public final k i(k paramk, V3.k paramk1, G paramG, n paramn, b4.a parama)
  {
    a locala = paramk.d();
    paramn = locala.a();
    boolean bool;
    if ((!locala.f()) && (!paramk1.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return h(paramk.f(paramn, bool, locala.e()), paramk1, paramG, b, parama);
  }
  
  public final void j(k paramk1, k paramk2, List paramList)
  {
    paramk2 = paramk2.c();
    if (paramk2.f())
    {
      int i;
      if ((!paramk2.b().B()) && (!paramk2.b().isEmpty())) {
        i = 0;
      } else {
        i = 1;
      }
      if ((!paramList.isEmpty()) || (!paramk1.c().f()) || ((i != 0) && (!paramk2.b().equals(paramk1.a()))) || (!paramk2.b().t().equals(paramk1.a().t()))) {
        paramList.add(c.n(paramk2.a()));
      }
    }
  }
  
  public k k(k paramk, V3.k paramk1, G paramG, n paramn, b4.a parama)
  {
    if (paramG.i(paramk1) != null) {
      return paramk;
    }
    d locald = new d(paramG, paramk, paramn);
    Object localObject1 = paramk.c().a();
    if ((!paramk1.isEmpty()) && (!paramk1.Z().s()))
    {
      d4.b localb = paramk1.Z();
      Object localObject2 = paramG.a(localb, paramk.d());
      paramn = (n)localObject2;
      if (localObject2 == null)
      {
        paramn = (n)localObject2;
        if (paramk.d().c(localb)) {
          paramn = ((i)localObject1).k().v(localb);
        }
      }
      localObject2 = paramn;
      if (localObject2 != null) {
        paramn = a;
      }
      for (;;)
      {
        paramn = paramn.c((i)localObject1, localb, (n)localObject2, paramk1.c0(), locald, parama);
        break;
        paramn = (n)localObject1;
        if (localObject2 != null) {
          break;
        }
        paramn = (n)localObject1;
        if (!paramk.c().b().Q(localb)) {
          break;
        }
        paramn = a;
        localObject2 = g.W();
      }
      paramk1 = paramn;
      if (paramn.k().isEmpty())
      {
        paramk1 = paramn;
        if (paramk.d().f())
        {
          localObject1 = paramG.b(paramk.b());
          paramk1 = paramn;
          if (((n)localObject1).B()) {
            paramk1 = (V3.k)localObject1;
          }
        }
      }
    }
    else
    {
      for (;;)
      {
        paramk1 = i.f(paramk1, a.e());
        paramk1 = a.f(paramn, paramk1, parama);
        break;
        if (paramk.d().f())
        {
          paramk1 = paramG.b(paramk.b());
          paramn = (n)localObject1;
        }
        else
        {
          paramk1 = paramG.e(paramk.d().b());
          paramn = (n)localObject1;
        }
      }
    }
    boolean bool;
    if ((!paramk.d().f()) && (paramG.i(V3.k.Y()) == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return paramk.e(paramk1, bool, a.d());
  }
  
  public class a
    implements d.a
  {
    public d4.m a(h paramh, d4.m paramm, boolean paramBoolean)
    {
      return null;
    }
    
    public n b(d4.b paramb)
    {
      return null;
    }
  }
  
  public static class c
  {
    public final k a;
    public final List b;
    
    public c(k paramk, List paramList)
    {
      a = paramk;
      b = paramList;
    }
  }
  
  public static class d
    implements d.a
  {
    public final G a;
    public final k b;
    public final n c;
    
    public d(G paramG, k paramk, n paramn)
    {
      a = paramG;
      b = paramk;
      c = paramn;
    }
    
    public d4.m a(h paramh, d4.m paramm, boolean paramBoolean)
    {
      n localn = c;
      if (localn == null) {
        localn = b.b();
      }
      return a.g(localn, paramm, paramBoolean, paramh);
    }
    
    public n b(d4.b paramb)
    {
      Object localObject = b.c();
      if (((a)localObject).c(paramb)) {
        return ((a)localObject).b().v(paramb);
      }
      localObject = c;
      if (localObject != null) {
        localObject = new a(i.f((n)localObject, j.j()), true, false);
      } else {
        localObject = b.d();
      }
      return a.a(paramb, (a)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     a4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package V3;

import Y3.i;
import a4.a;
import d4.g;
import d4.h;
import d4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class F
{
  public static final i d = new b();
  public b a = b.s();
  public List b = new ArrayList();
  public Long c = Long.valueOf(-1L);
  
  public static b j(List paramList, i parami, k paramk)
  {
    Object localObject1 = b.s();
    Iterator localIterator = paramList.iterator();
    paramList = (List)localObject1;
    while (localIterator.hasNext())
    {
      Object localObject2 = (B)localIterator.next();
      if (parami.a(localObject2))
      {
        localObject1 = ((B)localObject2).c();
        if (((B)localObject2).e()) {
          if (paramk.W((k)localObject1))
          {
            localObject1 = k.b0(paramk, (k)localObject1);
            localObject2 = ((B)localObject2).b();
          }
        }
        for (;;)
        {
          paramList = paramList.a((k)localObject1, (n)localObject2);
          break;
          if (!((k)localObject1).W(paramk)) {
            break;
          }
          paramList = paramList.a(k.Y(), ((B)localObject2).b().A(k.b0((k)localObject1, paramk)));
          break;
          if (paramk.W((k)localObject1)) {}
          for (localObject1 = k.b0(paramk, (k)localObject1);; localObject1 = k.Y())
          {
            paramList = paramList.f((k)localObject1, ((B)localObject2).a());
            break;
            if (!((k)localObject1).W(paramk)) {
              break;
            }
            localObject1 = k.b0((k)localObject1, paramk);
            if (!((k)localObject1).isEmpty()) {
              break label183;
            }
          }
          label183:
          localObject2 = ((B)localObject2).a().T((k)localObject1);
          if (localObject2 == null) {
            break;
          }
          localObject1 = k.Y();
        }
      }
    }
    return paramList;
  }
  
  public void a(k paramk, b paramb, Long paramLong)
  {
    boolean bool;
    if (paramLong.longValue() > c.longValue()) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.f(bool);
    b.add(new B(paramLong.longValue(), paramk, paramb));
    a = a.f(paramk, paramb);
    c = paramLong;
  }
  
  public void b(k paramk, n paramn, Long paramLong, boolean paramBoolean)
  {
    boolean bool;
    if (paramLong.longValue() > c.longValue()) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.f(bool);
    b.add(new B(paramLong.longValue(), paramk, paramn, paramBoolean));
    if (paramBoolean) {
      a = a.a(paramk, paramn);
    }
    c = paramLong;
  }
  
  public n c(k paramk, d4.b paramb, a parama)
  {
    k localk = paramk.U(paramb);
    paramk = a.T(localk);
    if (paramk != null) {
      return paramk;
    }
    if (parama.c(paramb)) {
      return a.k(localk).g(parama.b().v(paramb));
    }
    return null;
  }
  
  public n d(final k paramk, n paramn, final List paramList, final boolean paramBoolean)
  {
    if ((paramList.isEmpty()) && (!paramBoolean))
    {
      paramList = a.T(paramk);
      if (paramList != null) {
        return paramList;
      }
      paramk = a.k(paramk);
      if (paramk.isEmpty()) {
        return paramn;
      }
      if ((paramn == null) && (!paramk.V(k.Y()))) {
        return null;
      }
      if (paramn == null) {
        paramn = g.W();
      }
      return paramk.g(paramn);
    }
    b localb = a.k(paramk);
    if ((!paramBoolean) && (localb.isEmpty())) {
      return paramn;
    }
    if ((!paramBoolean) && (paramn == null) && (!localb.V(k.Y()))) {
      return null;
    }
    paramList = new a(paramBoolean, paramList, paramk);
    paramk = j(b, paramList, paramk);
    if (paramn == null) {
      paramn = g.W();
    }
    return paramk.g(paramn);
  }
  
  public n e(k paramk, n paramn)
  {
    Object localObject = g.W();
    n localn = a.T(paramk);
    if (localn != null)
    {
      paramk = (k)localObject;
      if (!localn.B())
      {
        paramn = localn.iterator();
        for (;;)
        {
          paramk = (k)localObject;
          if (!paramn.hasNext()) {
            break;
          }
          paramk = (d4.m)paramn.next();
          localObject = ((n)localObject).N(paramk.c(), paramk.d());
        }
      }
      return paramk;
    }
    paramk = a.k(paramk);
    paramn = paramn.iterator();
    while (paramn.hasNext())
    {
      d4.m localm = (d4.m)paramn.next();
      localn = paramk.k(new k(new d4.b[] { localm.c() })).g(localm.d());
      localObject = ((n)localObject).N(localm.c(), localn);
    }
    paramk = paramk.S().iterator();
    while (paramk.hasNext())
    {
      paramn = (d4.m)paramk.next();
      localObject = ((n)localObject).N(paramn.c(), paramn.d());
    }
    return (n)localObject;
  }
  
  public n f(k paramk1, k paramk2, n paramn1, n paramn2)
  {
    boolean bool;
    if ((paramn1 == null) && (paramn2 == null)) {
      bool = false;
    } else {
      bool = true;
    }
    Y3.m.g(bool, "Either existingEventSnap or existingServerSnap must exist");
    paramk1 = paramk1.T(paramk2);
    if (a.V(paramk1)) {
      return null;
    }
    paramk1 = a.k(paramk1);
    if (paramk1.isEmpty()) {
      return paramn2.A(paramk2);
    }
    return paramk1.g(paramn2.A(paramk2));
  }
  
  public d4.m g(k paramk, n paramn, d4.m paramm, boolean paramBoolean, h paramh)
  {
    Object localObject1 = a.k(paramk);
    paramk = ((b)localObject1).T(k.Y());
    k localk = null;
    Object localObject2 = null;
    if (paramk == null)
    {
      if (paramn != null) {
        paramk = ((b)localObject1).g(paramn);
      }
    }
    else
    {
      localObject1 = paramk.iterator();
      for (paramk = (k)localObject2;; paramk = paramn) {
        do
        {
          localk = paramk;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          paramn = (d4.m)((Iterator)localObject1).next();
        } while ((paramh.a(paramn, paramm, paramBoolean) <= 0) || ((paramk != null) && (paramh.a(paramn, paramk, paramBoolean) >= 0)));
      }
    }
    return localk;
  }
  
  public G h(k paramk)
  {
    return new G(paramk, this);
  }
  
  public B i(long paramLong)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      B localB = (B)localIterator.next();
      if (localB.d() == paramLong) {
        return localB;
      }
    }
    return null;
  }
  
  public List k()
  {
    ArrayList localArrayList = new ArrayList(b);
    a = b.s();
    b = new ArrayList();
    return localArrayList;
  }
  
  public final boolean l(B paramB, k paramk)
  {
    if (paramB.e()) {
      return paramB.c().W(paramk);
    }
    Iterator localIterator = paramB.a().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramB.c().T((k)localEntry.getKey()).W(paramk)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean m(long paramLong)
  {
    Object localObject = b.iterator();
    for (int i = 0; ((Iterator)localObject).hasNext(); i++)
    {
      localB = (B)((Iterator)localObject).next();
      if (localB.d() == paramLong) {
        break label55;
      }
    }
    B localB = null;
    label55:
    boolean bool1;
    if (localB != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Y3.m.g(bool1, "removeWrite called with nonexistent writeId");
    b.remove(localB);
    boolean bool2 = localB.f();
    int j = b.size() - 1;
    int k = 0;
    while ((bool2) && (j >= 0))
    {
      localObject = (B)b.get(j);
      int m = k;
      bool1 = bool2;
      if (((B)localObject).f()) {
        if ((j >= i) && (l((B)localObject, localB.c())))
        {
          bool1 = false;
          m = k;
        }
        else
        {
          m = k;
          bool1 = bool2;
          if (localB.c().W(((B)localObject).c()))
          {
            m = 1;
            bool1 = bool2;
          }
        }
      }
      j--;
      k = m;
      bool2 = bool1;
    }
    if (!bool2) {
      return false;
    }
    if (k != 0)
    {
      n();
      return true;
    }
    if (localB.e())
    {
      a = a.W(localB.c());
    }
    else
    {
      Iterator localIterator = localB.a().iterator();
      while (localIterator.hasNext())
      {
        localObject = (k)((Map.Entry)localIterator.next()).getKey();
        a = a.W(localB.c().T((k)localObject));
      }
    }
    return true;
  }
  
  public final void n()
  {
    a = j(b, d, k.Y());
    List localList;
    if (b.size() > 0) {
      localList = b;
    }
    for (long l = ((B)localList.get(localList.size() - 1)).d();; l = -1L)
    {
      c = Long.valueOf(l);
      break;
    }
  }
  
  public n o(k paramk)
  {
    return a.T(paramk);
  }
  
  public class a
    implements i
  {
    public a(boolean paramBoolean, List paramList, k paramk) {}
    
    public boolean b(B paramB)
    {
      boolean bool;
      if (((paramB.f()) || (paramBoolean)) && (!paramList.contains(Long.valueOf(paramB.d()))) && ((paramB.c().W(paramk)) || (paramk.W(paramB.c())))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public class b
    implements i
  {
    public boolean b(B paramB)
    {
      return paramB.f();
    }
  }
}

/* Location:
 * Qualified Name:     V3.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
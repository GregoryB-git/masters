package a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class f
{
  public final i a;
  public final d4.h b;
  
  public f(i parami)
  {
    a = parami;
    b = parami.c();
  }
  
  public final Comparator b()
  {
    return new a();
  }
  
  public final d c(c paramc, V3.h paramh, d4.i parami)
  {
    c localc = paramc;
    if (!paramc.j().equals(e.a.s)) {
      if (paramc.j().equals(e.a.o)) {
        localc = paramc;
      } else {
        localc = paramc.a(parami.q(paramc.i(), paramc.k().k(), b));
      }
    }
    return paramh.b(localc, a);
  }
  
  public List d(List paramList1, d4.i parami, List paramList2)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramList1.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if ((localc.j().equals(e.a.r)) && (b.d(localc.l().k(), localc.k().k()))) {
        localArrayList2.add(c.f(localc.i(), localc.k()));
      }
    }
    e(localArrayList1, e.a.o, paramList1, paramList2, parami);
    e(localArrayList1, e.a.p, paramList1, paramList2, parami);
    e(localArrayList1, e.a.q, localArrayList2, paramList2, parami);
    e(localArrayList1, e.a.r, paramList1, paramList2, parami);
    e(localArrayList1, e.a.s, paramList1, paramList2, parami);
    return localArrayList1;
  }
  
  public final void e(List paramList1, e.a parama, List paramList2, List paramList3, d4.i parami)
  {
    Object localObject = new ArrayList();
    Iterator localIterator1 = paramList2.iterator();
    while (localIterator1.hasNext())
    {
      paramList2 = (c)localIterator1.next();
      if (paramList2.j().equals(parama)) {
        ((List)localObject).add(paramList2);
      }
    }
    Collections.sort((List)localObject, b());
    Iterator localIterator2 = ((List)localObject).iterator();
    while (localIterator2.hasNext())
    {
      paramList2 = (c)localIterator2.next();
      localIterator1 = paramList3.iterator();
      while (localIterator1.hasNext())
      {
        localObject = (V3.h)localIterator1.next();
        if (((V3.h)localObject).i(parama)) {
          paramList1.add(c(paramList2, (V3.h)localObject, parami));
        }
      }
    }
  }
  
  public class a
    implements Comparator
  {
    public a() {}
    
    public int a(c paramc1, c paramc2)
    {
      boolean bool;
      if ((paramc1.i() != null) && (paramc2.i() != null)) {
        bool = true;
      } else {
        bool = false;
      }
      Y3.m.f(bool);
      paramc1 = new d4.m(paramc1.i(), paramc1.k().k());
      paramc2 = new d4.m(paramc2.i(), paramc2.k().k());
      return f.a(f.this).compare(paramc1, paramc2);
    }
  }
}

/* Location:
 * Qualified Name:     a4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
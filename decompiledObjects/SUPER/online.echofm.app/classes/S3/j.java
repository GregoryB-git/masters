package S3;

import java.util.Comparator;

public abstract class j
  implements h
{
  public final Object a;
  public final Object b;
  public h c;
  public final h d;
  
  public j(Object paramObject1, Object paramObject2, h paramh1, h paramh2)
  {
    a = paramObject1;
    b = paramObject2;
    paramObject1 = paramh1;
    if (paramh1 == null) {
      paramObject1 = g.j();
    }
    c = ((h)paramObject1);
    paramObject1 = paramh2;
    if (paramh2 == null) {
      paramObject1 = g.j();
    }
    d = ((h)paramObject1);
  }
  
  public static h.a q(h paramh)
  {
    if (paramh.d()) {
      paramh = h.a.p;
    } else {
      paramh = h.a.o;
    }
    return paramh;
  }
  
  public h a()
  {
    return c;
  }
  
  public h b(Object paramObject1, Object paramObject2, Comparator paramComparator)
  {
    int i = paramComparator.compare(paramObject1, a);
    if (i < 0) {
      paramObject1 = l(null, null, c.b(paramObject1, paramObject2, paramComparator), null);
    } else if (i == 0) {
      paramObject1 = l(paramObject1, paramObject2, null, null);
    } else {
      paramObject1 = l(null, null, null, d.b(paramObject1, paramObject2, paramComparator));
    }
    return ((j)paramObject1).m();
  }
  
  public void e(h.b paramb)
  {
    c.e(paramb);
    paramb.a(a, b);
    d.e(paramb);
  }
  
  public h f()
  {
    return d;
  }
  
  public h g(Object paramObject, Comparator paramComparator)
  {
    Object localObject1;
    if (paramComparator.compare(paramObject, a) < 0)
    {
      if ((!c.isEmpty()) && (!c.d()) && (!c).c.d())) {
        localObject1 = o();
      } else {
        localObject1 = this;
      }
      paramObject = ((j)localObject1).l(null, null, c.g(paramObject, paramComparator), null);
    }
    else
    {
      if (c.d()) {
        localObject2 = t();
      } else {
        localObject2 = this;
      }
      localObject1 = localObject2;
      if (!d.isEmpty())
      {
        localObject1 = localObject2;
        if (!d.d())
        {
          localObject1 = localObject2;
          if (!d).c.d()) {
            localObject1 = ((j)localObject2).p();
          }
        }
      }
      Object localObject2 = localObject1;
      if (paramComparator.compare(paramObject, a) == 0)
      {
        if (d.isEmpty()) {
          return g.j();
        }
        localObject2 = d.h();
        localObject2 = ((j)localObject1).l(((h)localObject2).getKey(), ((h)localObject2).getValue(), null, ((j)d).r());
      }
      paramObject = ((j)localObject2).l(null, null, null, d.g(paramObject, paramComparator));
    }
    return ((j)paramObject).m();
  }
  
  public Object getKey()
  {
    return a;
  }
  
  public Object getValue()
  {
    return b;
  }
  
  public h h()
  {
    if (c.isEmpty()) {
      return this;
    }
    return c.h();
  }
  
  public h i()
  {
    if (d.isEmpty()) {
      return this;
    }
    return d.i();
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public final j j()
  {
    h localh1 = c;
    localh1 = localh1.c(null, null, q(localh1), null, null);
    h localh2 = d;
    localh2 = localh2.c(null, null, q(localh2), null, null);
    return k(null, null, q(this), localh1, localh2);
  }
  
  public j k(Object paramObject1, Object paramObject2, h.a parama, h paramh1, h paramh2)
  {
    Object localObject = paramObject1;
    if (paramObject1 == null) {
      localObject = a;
    }
    paramObject1 = paramObject2;
    if (paramObject2 == null) {
      paramObject1 = b;
    }
    paramObject2 = paramh1;
    if (paramh1 == null) {
      paramObject2 = c;
    }
    paramh1 = paramh2;
    if (paramh2 == null) {
      paramh1 = d;
    }
    if (parama == h.a.o) {
      return new i(localObject, paramObject1, (h)paramObject2, paramh1);
    }
    return new f(localObject, paramObject1, (h)paramObject2, paramh1);
  }
  
  public abstract j l(Object paramObject1, Object paramObject2, h paramh1, h paramh2);
  
  public final j m()
  {
    if ((d.d()) && (!c.d())) {
      localObject1 = s();
    } else {
      localObject1 = this;
    }
    Object localObject2 = localObject1;
    if (c.d())
    {
      localObject2 = localObject1;
      if (c).c.d()) {
        localObject2 = ((j)localObject1).t();
      }
    }
    Object localObject1 = localObject2;
    if (c.d())
    {
      localObject1 = localObject2;
      if (d.d()) {
        localObject1 = ((j)localObject2).j();
      }
    }
    return (j)localObject1;
  }
  
  public abstract h.a n();
  
  public final j o()
  {
    j localj1 = j();
    j localj2 = localj1;
    if (localj1.f().a().d()) {
      localj2 = localj1.l(null, null, null, ((j)localj1.f()).t()).s().j();
    }
    return localj2;
  }
  
  public final j p()
  {
    j localj1 = j();
    j localj2 = localj1;
    if (localj1.a().a().d()) {
      localj2 = localj1.t().j();
    }
    return localj2;
  }
  
  public final h r()
  {
    if (c.isEmpty()) {
      return g.j();
    }
    j localj;
    if ((!a().d()) && (!a().a().d())) {
      localj = o();
    } else {
      localj = this;
    }
    return localj.l(null, null, ((j)c).r(), null).m();
  }
  
  public final j s()
  {
    j localj = k(null, null, h.a.o, null, d).c);
    return (j)d.c(null, null, n(), localj, null);
  }
  
  public final j t()
  {
    j localj = k(null, null, h.a.o, c).d, null);
    return (j)c.c(null, null, n(), null, localj);
  }
  
  public void u(h paramh)
  {
    c = paramh;
  }
}

/* Location:
 * Qualified Name:     S3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
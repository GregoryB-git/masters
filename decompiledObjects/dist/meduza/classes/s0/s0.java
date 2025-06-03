package s0;

import java.util.Iterator;
import java.util.Map.Entry;

public final class s0<T>
  implements c1<T>
{
  public final o0 a;
  public final h1<?, ?> b;
  public final boolean c;
  public final o<?> d;
  
  public s0(h1<?, ?> paramh1, o<?> paramo, o0 paramo0)
  {
    b = paramh1;
    c = paramo.e(paramo0);
    d = paramo;
    a = paramo0;
  }
  
  public final void a(T paramT1, T paramT2)
  {
    h1 localh1 = b;
    Class localClass = d1.a;
    localh1.o(paramT1, localh1.k(localh1.g(paramT1), localh1.g(paramT2)));
    if (c) {
      d1.A(d, paramT1, paramT2);
    }
  }
  
  public final void b(T paramT)
  {
    b.j(paramT);
    d.f(paramT);
  }
  
  public final boolean c(T paramT)
  {
    return d.c(paramT).j();
  }
  
  public final boolean d(T paramT1, T paramT2)
  {
    if (!b.g(paramT1).equals(b.g(paramT2))) {
      return false;
    }
    if (c) {
      return d.c(paramT1).equals(d.c(paramT2));
    }
    return true;
  }
  
  public final int e(T paramT)
  {
    h1 localh1 = b;
    int i = localh1.i(localh1.g(paramT));
    int j = 0;
    int k = i + 0;
    i = k;
    if (c)
    {
      paramT = d.c(paramT);
      i = 0;
      while (j < a.e())
      {
        i += r.g(a.d(j));
        j++;
      }
      paramT = a.f().iterator();
      while (paramT.hasNext()) {
        i += r.g((Map.Entry)paramT.next());
      }
      i = k + i;
    }
    return i;
  }
  
  public final T f()
  {
    return a.e().i();
  }
  
  public final int g(T paramT)
  {
    int i = b.g(paramT).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.c(paramT).hashCode();
    }
    return j;
  }
  
  public final void h(Object paramObject, k paramk)
  {
    Iterator localIterator = d.c(paramObject).l();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localObject = (r.a)localEntry.getKey();
      if (((r.a)localObject).d() == o1.r)
      {
        ((r.a)localObject).b();
        ((r.a)localObject).e();
        boolean bool = localEntry instanceof a0.a;
        ((r.a)localObject).a();
        if (bool) {
          localObject = ((a0)a.getValue()).b();
        } else {
          localObject = localEntry.getValue();
        }
        paramk.l(0, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = b;
    ((h1)localObject).r(((h1)localObject).g(paramObject), paramk);
  }
  
  public final void i(T paramT, b1 paramb1, n paramn)
  {
    h1 localh1 = b;
    o localo = d;
    i1 locali1 = localh1.f(paramT);
    r localr = localo.d(paramT);
    try
    {
      boolean bool;
      do
      {
        if (paramb1.A() == Integer.MAX_VALUE) {
          break;
        }
        bool = j(paramb1, paramn, localo, localr, localh1, locali1);
      } while (bool);
      return;
    }
    finally
    {
      localh1.n(paramT, locali1);
    }
  }
  
  public final <UT, UB, ET extends r.a<ET>> boolean j(b1 paramb1, n paramn, o<ET> paramo, r<ET> paramr, h1<UT, UB> paramh1, UB paramUB)
  {
    int i = paramb1.p();
    if (i != 11)
    {
      if ((i & 0x7) == 2)
      {
        paramn = paramo.b(paramn, a, i >>> 3);
        if (paramn != null)
        {
          paramo.h(paramn);
          return true;
        }
        return paramh1.l(paramUB, paramb1);
      }
      return paramb1.H();
    }
    i = 0;
    v.e locale = null;
    paramr = null;
    do
    {
      for (;;)
      {
        if (paramb1.A() == Integer.MAX_VALUE) {
          break label168;
        }
        int j = paramb1.p();
        if (j == 16)
        {
          i = paramb1.n();
          locale = paramo.b(paramn, a, i);
        }
        else
        {
          if (j != 26) {
            break;
          }
          if (locale != null) {
            paramo.h(locale);
          } else {
            paramr = paramb1.E();
          }
        }
      }
    } while (paramb1.H());
    label168:
    if (paramb1.p() == 12)
    {
      if (paramr != null) {
        if (locale != null) {
          paramo.i(locale);
        } else {
          paramh1.d(paramUB, i, paramr);
        }
      }
      return true;
    }
    throw new y("Protocol message end-group tag did not match expected tag.");
  }
}

/* Location:
 * Qualified Name:     s0.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
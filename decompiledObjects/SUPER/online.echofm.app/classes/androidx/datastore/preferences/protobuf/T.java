package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public final class T
  implements e0
{
  public final O a;
  public final l0 b;
  public final boolean c;
  public final p d;
  
  public T(l0 paraml0, p paramp, O paramO)
  {
    b = paraml0;
    c = paramp.e(paramO);
    d = paramp;
    a = paramO;
  }
  
  private int j(l0 paraml0, Object paramObject)
  {
    return paraml0.i(paraml0.g(paramObject));
  }
  
  private void k(l0 paraml0, p paramp, Object paramObject, d0 paramd0, o paramo)
  {
    Object localObject = paraml0.f(paramObject);
    s locals = paramp.d(paramObject);
    try
    {
      boolean bool;
      do
      {
        int i = paramd0.p();
        if (i == Integer.MAX_VALUE) {
          return;
        }
        bool = m(paramd0, paramo, paramp, locals, paraml0, localObject);
      } while (bool);
      return;
    }
    finally
    {
      paraml0.o(paramObject, localObject);
    }
  }
  
  public static T l(l0 paraml0, p paramp, O paramO)
  {
    return new T(paraml0, paramp, paramO);
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    g0.F(b, paramObject1, paramObject2);
    if (c) {
      g0.D(d, paramObject1, paramObject2);
    }
  }
  
  public void b(Object paramObject)
  {
    b.j(paramObject);
    d.f(paramObject);
  }
  
  public final boolean c(Object paramObject)
  {
    return d.c(paramObject).k();
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    if (!b.g(paramObject1).equals(b.g(paramObject2))) {
      return false;
    }
    if (c) {
      return d.c(paramObject1).equals(d.c(paramObject2));
    }
    return true;
  }
  
  public int e(Object paramObject)
  {
    int i = j(b, paramObject);
    int j = i;
    if (c) {
      j = i + d.c(paramObject).f();
    }
    return j;
  }
  
  public Object f()
  {
    return a.d().c();
  }
  
  public int g(Object paramObject)
  {
    int i = b.g(paramObject).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.c(paramObject).hashCode();
    }
    return j;
  }
  
  public void h(Object paramObject, d0 paramd0, o paramo)
  {
    k(b, d, paramObject, paramd0, paramo);
  }
  
  public void i(Object paramObject, s0 params0)
  {
    Iterator localIterator = d.c(paramObject).n();
    if (!localIterator.hasNext())
    {
      n(b, paramObject, params0);
      return;
    }
    a.a(((Map.Entry)localIterator.next()).getKey());
    throw null;
  }
  
  public final boolean m(d0 paramd0, o paramo, p paramp, s params, l0 paraml0, Object paramObject)
  {
    int i = paramd0.e();
    if (i != r0.a)
    {
      if (r0.b(i) == 2)
      {
        localObject1 = paramp.b(paramo, a, r0.a(i));
        if (localObject1 != null)
        {
          paramp.h(paramd0, localObject1, paramo, params);
          return true;
        }
        return paraml0.m(paramObject, paramd0);
      }
      return paramd0.y();
    }
    Object localObject2 = null;
    i = 0;
    Object localObject1 = null;
    do
    {
      for (;;)
      {
        if (paramd0.p() == Integer.MAX_VALUE) {
          break label183;
        }
        int j = paramd0.e();
        if (j == r0.c)
        {
          i = paramd0.w();
          localObject2 = paramp.b(paramo, a, i);
        }
        else
        {
          if (j != r0.d) {
            break;
          }
          if (localObject2 != null) {
            paramp.h(paramd0, localObject2, paramo, params);
          } else {
            localObject1 = paramd0.u();
          }
        }
      }
    } while (paramd0.y());
    label183:
    if (paramd0.e() == r0.b)
    {
      if (localObject1 != null) {
        if (localObject2 != null) {
          paramp.i((g)localObject1, localObject2, paramo, params);
        } else {
          paraml0.d(paramObject, i, (g)localObject1);
        }
      }
      return true;
    }
    throw z.a();
  }
  
  public final void n(l0 paraml0, Object paramObject, s0 params0)
  {
    paraml0.s(paraml0.g(paramObject), params0);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
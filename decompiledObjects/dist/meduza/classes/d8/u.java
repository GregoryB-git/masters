package d8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n7.w;

public final class u
  implements c
{
  public final Set<t<?>> a;
  public final Set<t<?>> b;
  public final Set<t<?>> c;
  public final Set<t<?>> d;
  public final Set<Class<?>> e;
  public final c f;
  
  public u(b paramb, i parami)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    HashSet localHashSet4 = new HashSet();
    HashSet localHashSet5 = new HashSet();
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      int i = c;
      int j = 1;
      int k = 1;
      int m;
      if (i == 0) {
        m = 1;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        if (b == 2) {
          m = k;
        } else {
          m = 0;
        }
        if (m != 0) {
          localHashSet4.add(a);
        } else {
          localHashSet1.add(a);
        }
      }
      else
      {
        if (i == 2) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0)
        {
          localHashSet3.add(a);
        }
        else
        {
          if (b == 2) {
            m = j;
          } else {
            m = 0;
          }
          if (m != 0) {
            localHashSet5.add(a);
          } else {
            localHashSet2.add(a);
          }
        }
      }
    }
    if (!g.isEmpty()) {
      localHashSet1.add(t.a(c9.c.class));
    }
    a = Collections.unmodifiableSet(localHashSet1);
    b = Collections.unmodifiableSet(localHashSet2);
    c = Collections.unmodifiableSet(localHashSet3);
    d = Collections.unmodifiableSet(localHashSet4);
    Collections.unmodifiableSet(localHashSet5);
    e = g;
    f = parami;
  }
  
  public final <T> t9.a<T> a(t<T> paramt)
  {
    if (c.contains(paramt)) {
      return f.a(paramt);
    }
    throw new w(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[] { paramt }));
  }
  
  public final <T> t9.b<T> b(Class<T> paramClass)
  {
    return c(t.a(paramClass));
  }
  
  public final <T> t9.b<T> c(t<T> paramt)
  {
    if (b.contains(paramt)) {
      return f.c(paramt);
    }
    throw new w(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[] { paramt }));
  }
  
  public final <T> Set<T> d(t<T> paramt)
  {
    if (d.contains(paramt)) {
      return f.d(paramt);
    }
    throw new w(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[] { paramt }));
  }
  
  public final <T> T e(t<T> paramt)
  {
    if (a.contains(paramt)) {
      return (T)f.e(paramt);
    }
    throw new w(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramt }));
  }
  
  public final <T> t9.a<T> f(Class<T> paramClass)
  {
    return a(t.a(paramClass));
  }
  
  public final Set g(Class paramClass)
  {
    return d(t.a(paramClass));
  }
  
  public final <T> T get(Class<T> paramClass)
  {
    if (a.contains(t.a(paramClass)))
    {
      Object localObject = f.get(paramClass);
      if (!paramClass.equals(c9.c.class)) {
        return (T)localObject;
      }
      return new a(e, (c9.c)localObject);
    }
    throw new w(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramClass }));
  }
  
  public static final class a
    implements c9.c
  {
    public final Set<Class<?>> a;
    public final c9.c b;
    
    public a(Set<Class<?>> paramSet, c9.c paramc)
    {
      a = paramSet;
      b = paramc;
    }
    
    public final void b(c9.a<?> parama)
    {
      if (a.contains(a))
      {
        b.b(parama);
        return;
      }
      throw new w(String.format("Attempting to publish an undeclared event %s.", new Object[] { parama }));
    }
  }
}

/* Location:
 * Qualified Name:     d8.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
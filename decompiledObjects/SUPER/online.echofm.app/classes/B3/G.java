package B3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import r4.b;

public final class G
  implements e
{
  public final Set a;
  public final Set b;
  public final Set c;
  public final Set d;
  public final Set e;
  public final Set f;
  public final e g;
  
  public G(c paramc, e parame)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    HashSet localHashSet4 = new HashSet();
    HashSet localHashSet5 = new HashSet();
    Iterator localIterator = paramc.g().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (r)localIterator.next();
      boolean bool;
      if (((r)localObject).e())
      {
        bool = ((r)localObject).g();
        localObject = ((r)localObject).c();
        if (bool) {
          localHashSet4.add(localObject);
        } else {
          localHashSet1.add(localObject);
        }
      }
      else if (((r)localObject).d())
      {
        localHashSet3.add(((r)localObject).c());
      }
      else
      {
        bool = ((r)localObject).g();
        localObject = ((r)localObject).c();
        if (bool) {
          localHashSet5.add(localObject);
        } else {
          localHashSet2.add(localObject);
        }
      }
    }
    if (!paramc.k().isEmpty()) {
      localHashSet1.add(F.b(n4.c.class));
    }
    a = Collections.unmodifiableSet(localHashSet1);
    b = Collections.unmodifiableSet(localHashSet2);
    c = Collections.unmodifiableSet(localHashSet3);
    d = Collections.unmodifiableSet(localHashSet4);
    e = Collections.unmodifiableSet(localHashSet5);
    f = paramc.k();
    g = parame;
  }
  
  public Object a(Class paramClass)
  {
    if (a.contains(F.b(paramClass)))
    {
      Object localObject = g.a(paramClass);
      if (!paramClass.equals(n4.c.class)) {
        return localObject;
      }
      return new a(f, (n4.c)localObject);
    }
    throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramClass }));
  }
  
  public b b(F paramF)
  {
    if (b.contains(paramF)) {
      return g.b(paramF);
    }
    throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[] { paramF }));
  }
  
  public r4.a d(F paramF)
  {
    if (c.contains(paramF)) {
      return g.d(paramF);
    }
    throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[] { paramF }));
  }
  
  public Set e(F paramF)
  {
    if (d.contains(paramF)) {
      return g.e(paramF);
    }
    throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[] { paramF }));
  }
  
  public b f(F paramF)
  {
    if (e.contains(paramF)) {
      return g.f(paramF);
    }
    throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[] { paramF }));
  }
  
  public b g(Class paramClass)
  {
    return b(F.b(paramClass));
  }
  
  public Object h(F paramF)
  {
    if (a.contains(paramF)) {
      return g.h(paramF);
    }
    throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramF }));
  }
  
  public r4.a i(Class paramClass)
  {
    return d(F.b(paramClass));
  }
  
  public static class a
    implements n4.c
  {
    public final Set a;
    public final n4.c b;
    
    public a(Set paramSet, n4.c paramc)
    {
      a = paramSet;
      b = paramc;
    }
    
    public void a(n4.a parama)
    {
      if (a.contains(parama.b()))
      {
        b.a(parama);
        return;
      }
      throw new t(String.format("Attempting to publish an undeclared event %s.", new Object[] { parama }));
    }
  }
}

/* Location:
 * Qualified Name:     B3.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
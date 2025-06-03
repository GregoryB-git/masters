package nb;

import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.j;
import eb.n;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import n7.g.a;
import x6.b;

public final class k
  extends h
{
  public final AtomicInteger l = new AtomicInteger(new Random().nextInt());
  public k0.j m = new a();
  
  public k(k0.e parame)
  {
    super(parame);
  }
  
  public final k0.j h()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void i()
  {
    n localn1 = n.a;
    n localn2 = n.b;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = f.values().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (h.b)((Iterator)localObject1).next();
      if ((!g) && (e == localn2)) {
        localArrayList.add(localObject2);
      }
    }
    if (localArrayList.isEmpty())
    {
      int i = 0;
      localObject2 = f.values().iterator();
      do
      {
        j = i;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject1 = nexte;
      } while ((localObject1 != localn1) && (localObject1 != n.d));
      int j = 1;
      if (j != 0)
      {
        localObject1 = new a();
      }
      else
      {
        localn1 = n.c;
        localObject1 = j(f.values());
      }
      k(localn1, (k0.j)localObject1);
    }
    else
    {
      k(localn2, j(localArrayList));
    }
  }
  
  public final b j(Collection paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add(nextf);
    }
    return new b(localArrayList, l);
  }
  
  public final void k(n paramn, k0.j paramj)
  {
    if ((paramn != j) || (!paramj.equals(m)))
    {
      g.f(paramn, paramj);
      j = paramn;
      m = paramj;
    }
  }
  
  public static final class a
    extends k0.j
  {
    public final k0.f a(k0.g paramg)
    {
      return k0.f.e;
    }
    
    public final boolean equals(Object paramObject)
    {
      return paramObject instanceof a;
    }
    
    public final int hashCode()
    {
      return a.class.hashCode();
    }
  }
  
  public static final class b
    extends k0.j
  {
    public final List<k0.j> a;
    public final AtomicInteger b;
    public final int c;
    
    public b(ArrayList paramArrayList, AtomicInteger paramAtomicInteger)
    {
      b.s("empty list", paramArrayList.isEmpty() ^ true);
      a = paramArrayList;
      b.y(paramAtomicInteger, "index");
      b = paramAtomicInteger;
      paramArrayList = paramArrayList.iterator();
      int i = 0;
      while (paramArrayList.hasNext()) {
        i += ((k0.j)paramArrayList.next()).hashCode();
      }
      c = i;
    }
    
    public final k0.f a(k0.g paramg)
    {
      return ((k0.j)a.get((b.getAndIncrement() & 0x7FFFFFFF) % a.size())).a(paramg);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof b;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (b)paramObject;
      if (paramObject == this) {
        return true;
      }
      bool1 = bool2;
      if (c == c)
      {
        bool1 = bool2;
        if (b == b)
        {
          bool1 = bool2;
          if (a.size() == a.size())
          {
            bool1 = bool2;
            if (new HashSet(a).containsAll(a)) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return c;
    }
    
    public final String toString()
    {
      g.a locala = new g.a(b.class.getSimpleName());
      locala.a(a, "subchannelPickers");
      return locala.toString();
    }
  }
}

/* Location:
 * Qualified Name:     nb.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
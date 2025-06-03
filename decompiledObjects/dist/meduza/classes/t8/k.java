package t8;

import e0.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class k<K, V>
  extends c<K, V>
{
  public h<K, V> a;
  public Comparator<K> b;
  
  public k(h<K, V> paramh, Comparator<K> paramComparator)
  {
    a = paramh;
    b = paramComparator;
  }
  
  public final boolean a(K paramK)
  {
    boolean bool;
    if (q(paramK) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final V h(K paramK)
  {
    paramK = q(paramK);
    if (paramK != null) {
      paramK = paramK.getValue();
    } else {
      paramK = null;
    }
    return paramK;
  }
  
  public final Comparator<K> i()
  {
    return b;
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new d(a, null, b);
  }
  
  public final K k()
  {
    return (K)a.h().getKey();
  }
  
  public final K l()
  {
    return (K)a.g().getKey();
  }
  
  public final int m(j9.g paramg)
  {
    h localh = a;
    int i = 0;
    while (!localh.isEmpty())
    {
      int j = b.compare(paramg, localh.getKey());
      if (j == 0) {
        return localh.a().size() + i;
      }
      if (j < 0)
      {
        localh = localh.a();
      }
      else
      {
        i += localh.a().size() + 1;
        localh = localh.f();
      }
    }
    return -1;
  }
  
  public final c<K, V> n(K paramK, V paramV)
  {
    return new k(a.b(paramK, paramV, b).d(h.a.b, null, null), b);
  }
  
  public final Iterator<Map.Entry<K, V>> o(K paramK)
  {
    return new d(a, paramK, b);
  }
  
  public final c<K, V> p(K paramK)
  {
    if (!a(paramK)) {
      return this;
    }
    return new k(a.c(paramK, b).d(h.a.b, null, null), b);
  }
  
  public final h<K, V> q(K paramK)
  {
    h localh = a;
    while (!localh.isEmpty())
    {
      int i = b.compare(paramK, localh.getKey());
      if (i < 0)
      {
        localh = localh.a();
      }
      else
      {
        if (i == 0) {
          return localh;
        }
        localh = localh.f();
      }
    }
    return null;
  }
  
  public final int size()
  {
    return a.size();
  }
  
  public static final class a<A, B, C>
  {
    public final List<A> a;
    public final Map<B, C> b;
    public final c.a.a<A, B> c;
    public j<A, C> d;
    public j<A, C> e;
    
    public a(List paramList, Map paramMap)
    {
      a = paramList;
      b = paramMap;
      c = locale;
    }
    
    public static k b(List paramList, Map paramMap, Comparator paramComparator)
    {
      h.a locala = h.a.b;
      a locala1 = new a(paramList, paramMap);
      Collections.sort(paramList, paramComparator);
      paramMap = new a(paramList.size());
      int i = b - 1;
      int j = paramList.size();
      for (;;)
      {
        boolean bool = true;
        if (i >= 0) {
          k = 1;
        } else {
          k = 0;
        }
        if (k == 0) {
          break;
        }
        long l1 = a;
        long l2 = 1 << i;
        paramList = new b();
        if ((l1 & l2) != 0L) {
          bool = false;
        }
        a = bool;
        int k = (int)Math.pow(2.0D, i);
        b = k;
        i--;
        j -= k;
        bool = a;
        locala1.c(locala, k, j);
        if (!bool)
        {
          k = b;
          j -= k;
          locala1.c(h.a.a, k, j);
        }
      }
      paramMap = d;
      paramList = paramMap;
      if (paramMap == null) {
        paramList = g.a;
      }
      return new k(paramList, paramComparator);
    }
    
    public final h<A, C> a(int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        return g.a;
      }
      if (paramInt2 == 1)
      {
        localObject1 = a.get(paramInt1);
        return new f(localObject1, d(localObject1), null, null);
      }
      int i = paramInt2 / 2;
      paramInt2 = paramInt1 + i;
      Object localObject1 = a(paramInt1, i);
      h localh = a(paramInt2 + 1, i);
      Object localObject2 = a.get(paramInt2);
      return new f(localObject2, d(localObject2), (h)localObject1, localh);
    }
    
    public final void c(h.a parama, int paramInt1, int paramInt2)
    {
      h localh = a(paramInt2 + 1, paramInt1 - 1);
      Object localObject = a.get(paramInt2);
      if (parama == h.a.a) {
        parama = new i(localObject, d(localObject), null, localh);
      } else {
        parama = new f(localObject, d(localObject), null, localh);
      }
      if (d == null) {
        d = parama;
      } else {
        e.r(parama);
      }
      e = parama;
    }
    
    public final C d(A paramA)
    {
      Map localMap = b;
      ((e)c).getClass();
      return (C)localMap.get(paramA);
    }
    
    public static final class a
      implements Iterable<k.a.b>
    {
      public long a;
      public final int b;
      
      public a(int paramInt)
      {
        int i = paramInt + 1;
        paramInt = (int)Math.floor(Math.log(i) / Math.log(2.0D));
        b = paramInt;
        a = (Math.pow(2.0D, paramInt) - 1L & i);
      }
      
      public final Iterator<k.a.b> iterator()
      {
        return new a();
      }
      
      public final class a
        implements Iterator<k.a.b>
      {
        public int a = b - 1;
        
        public a() {}
        
        public final boolean hasNext()
        {
          boolean bool;
          if (a >= 0) {
            bool = true;
          } else {
            bool = false;
          }
          return bool;
        }
        
        public final Object next()
        {
          long l1 = a;
          long l2 = 1 << a;
          k.a.b localb = new k.a.b();
          boolean bool;
          if ((l1 & l2) == 0L) {
            bool = true;
          } else {
            bool = false;
          }
          a = bool;
          b = ((int)Math.pow(2.0D, a));
          a -= 1;
          return localb;
        }
        
        public final void remove() {}
      }
    }
    
    public static final class b
    {
      public boolean a;
      public int b;
    }
  }
}

/* Location:
 * Qualified Name:     t8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package n;

import f;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class b<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  public c<K, V> a;
  public c<K, V> b;
  public final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap();
  public int d = 0;
  
  public c<K, V> a(K paramK)
  {
    for (c localc = a; (localc != null) && (!a.equals(paramK)); localc = c) {}
    return localc;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    Object localObject1 = (b)paramObject;
    if (d != d) {
      return false;
    }
    paramObject = iterator();
    localObject1 = ((b)localObject1).iterator();
    Object localObject2;
    Object localObject3;
    do
    {
      localObject2 = (e)paramObject;
      if (!((e)localObject2).hasNext()) {
        break;
      }
      localObject3 = (e)localObject1;
      if (!((e)localObject3).hasNext()) {
        break;
      }
      localObject2 = (Map.Entry)((e)localObject2).next();
      localObject3 = ((e)localObject3).next();
    } while (((localObject2 != null) || (localObject3 == null)) && ((localObject2 == null) || (((Map.Entry)localObject2).equals(localObject3))));
    return false;
    if ((((e)localObject2).hasNext()) || (((e)localObject1).hasNext())) {
      bool = false;
    }
    return bool;
  }
  
  public V h(K paramK, V paramV)
  {
    c localc = a(paramK);
    if (localc != null) {
      return (V)b;
    }
    paramK = new c(paramK, paramV);
    d += 1;
    paramV = b;
    if (paramV == null)
    {
      a = paramK;
    }
    else
    {
      c = paramK;
      d = paramV;
    }
    b = paramK;
    return null;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = iterator();
    int i = 0;
    for (;;)
    {
      e locale = (e)localIterator;
      if (!locale.hasNext()) {
        break;
      }
      i += ((Map.Entry)locale.next()).hashCode();
    }
    return i;
  }
  
  public V i(K paramK)
  {
    paramK = a(paramK);
    if (paramK == null) {
      return null;
    }
    d -= 1;
    if (!c.isEmpty())
    {
      localObject = c.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((f)((Iterator)localObject).next()).a(paramK);
      }
    }
    Object localObject = d;
    c localc = c;
    if (localObject != null) {
      c = localc;
    } else {
      a = localc;
    }
    localc = c;
    if (localc != null) {
      d = ((c)localObject);
    } else {
      b = ((c)localObject);
    }
    c = null;
    d = null;
    return (V)b;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    a locala = new a(a, b);
    c.put(locala, Boolean.FALSE);
    return locala;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[");
    Iterator localIterator = iterator();
    for (;;)
    {
      e locale = (e)localIterator;
      if (!locale.hasNext()) {
        break;
      }
      localStringBuilder.append(((Map.Entry)locale.next()).toString());
      if (locale.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a<K, V>
    extends b.e<K, V>
  {
    public a(b.c<K, V> paramc1, b.c<K, V> paramc2)
    {
      super(paramc2);
    }
    
    public final b.c<K, V> b(b.c<K, V> paramc)
    {
      return d;
    }
    
    public final b.c<K, V> c(b.c<K, V> paramc)
    {
      return c;
    }
  }
  
  public static final class b<K, V>
    extends b.e<K, V>
  {
    public b(b.c<K, V> paramc1, b.c<K, V> paramc2)
    {
      super(paramc2);
    }
    
    public final b.c<K, V> b(b.c<K, V> paramc)
    {
      return c;
    }
    
    public final b.c<K, V> c(b.c<K, V> paramc)
    {
      return d;
    }
  }
  
  public static final class c<K, V>
    implements Map.Entry<K, V>
  {
    public final K a;
    public final V b;
    public c<K, V> c;
    public c<K, V> d;
    
    public c(K paramK, V paramV)
    {
      a = paramK;
      b = paramV;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    
    public final K getKey()
    {
      return (K)a;
    }
    
    public final V getValue()
    {
      return (V)b;
    }
    
    public final int hashCode()
    {
      return a.hashCode() ^ b.hashCode();
    }
    
    public final V setValue(V paramV)
    {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append("=");
      localStringBuilder.append(b);
      return localStringBuilder.toString();
    }
  }
  
  public final class d
    extends b.f<K, V>
    implements Iterator<Map.Entry<K, V>>
  {
    public b.c<K, V> a;
    public boolean b = true;
    
    public d() {}
    
    public final void a(b.c<K, V> paramc)
    {
      b.c localc = a;
      if (paramc == localc)
      {
        paramc = d;
        a = paramc;
        boolean bool;
        if (paramc == null) {
          bool = true;
        } else {
          bool = false;
        }
        b = bool;
      }
    }
    
    public final boolean hasNext()
    {
      boolean bool1 = b;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (a == null) {
          bool3 = false;
        }
        return bool3;
      }
      b.c localc = a;
      if ((localc != null) && (c != null)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public final Object next()
    {
      b.c localc;
      if (b)
      {
        b = false;
        localc = a;
      }
      else
      {
        localc = a;
        if (localc != null) {
          localc = c;
        } else {
          localc = null;
        }
      }
      a = localc;
      return localc;
    }
  }
  
  public static abstract class e<K, V>
    extends b.f<K, V>
    implements Iterator<Map.Entry<K, V>>
  {
    public b.c<K, V> a;
    public b.c<K, V> b;
    
    public e(b.c<K, V> paramc1, b.c<K, V> paramc2)
    {
      a = paramc2;
      b = paramc1;
    }
    
    public final void a(b.c<K, V> paramc)
    {
      b.c localc1 = a;
      Object localObject = null;
      if ((localc1 == paramc) && (paramc == b))
      {
        b = null;
        a = null;
      }
      localc1 = a;
      if (localc1 == paramc) {
        a = b(localc1);
      }
      localc1 = b;
      if (localc1 == paramc)
      {
        b.c localc2 = a;
        paramc = (b.c<K, V>)localObject;
        if (localc1 != localc2) {
          if (localc2 == null) {
            paramc = (b.c<K, V>)localObject;
          } else {
            paramc = c(localc1);
          }
        }
        b = paramc;
      }
    }
    
    public abstract b.c<K, V> b(b.c<K, V> paramc);
    
    public abstract b.c<K, V> c(b.c<K, V> paramc);
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Object next()
    {
      b.c localc1 = b;
      b.c localc2 = a;
      if ((localc1 != localc2) && (localc2 != null)) {
        localc2 = c(localc1);
      } else {
        localc2 = null;
      }
      b = localc2;
      return localc1;
    }
  }
  
  public static abstract class f<K, V>
  {
    public abstract void a(b.c<K, V> paramc);
  }
}

/* Location:
 * Qualified Name:     n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class zu<K, V>
  extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> d = new zt();
  public int a = 0;
  public int b = 0;
  public final c<K, V> c = new c();
  private Comparator<? super K> e;
  private c<K, V> f;
  private a g;
  private b h;
  
  public zu()
  {
    this(d);
  }
  
  private zu(Comparator<? super K> paramComparator)
  {
    if (paramComparator == null) {
      paramComparator = d;
    }
    e = paramComparator;
  }
  
  private final c<K, V> a(K paramK, boolean paramBoolean)
  {
    Comparator localComparator = e;
    Object localObject = f;
    if (localObject != null)
    {
      Comparable localComparable;
      if (localComparator == d) {
        localComparable = (Comparable)paramK;
      } else {
        localComparable = null;
      }
      for (;;)
      {
        if (localComparable != null) {
          i = localComparable.compareTo(f);
        } else {
          i = localComparator.compare(paramK, f);
        }
        if (i == 0) {
          return (c<K, V>)localObject;
        }
        if (i < 0) {
          localc = b;
        } else {
          localc = c;
        }
        if (localc == null) {
          break;
        }
        localObject = localc;
      }
    }
    int i = 0;
    if (!paramBoolean) {
      return null;
    }
    c localc = c;
    if (localObject == null)
    {
      if ((localComparator == d) && (!(paramK instanceof Comparable)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramK.getClass().getName());
        ((StringBuilder)localObject).append(" is not Comparable");
        throw new ClassCastException(((StringBuilder)localObject).toString());
      }
      paramK = new c((c)localObject, paramK, localc, e);
      f = paramK;
    }
    else
    {
      paramK = new c((c)localObject, paramK, localc, e);
      if (i < 0) {
        b = paramK;
      } else {
        c = paramK;
      }
      b((c)localObject, true);
    }
    a += 1;
    b += 1;
    return paramK;
  }
  
  private final void a(c<K, V> paramc)
  {
    c localc1 = b;
    c localc2 = c;
    c localc3 = b;
    c localc4 = c;
    c = localc3;
    if (localc3 != null) {
      a = paramc;
    }
    a(paramc, localc2);
    b = paramc;
    a = localc2;
    int i = 0;
    if (localc1 != null) {
      j = h;
    } else {
      j = 0;
    }
    if (localc3 != null) {
      k = h;
    } else {
      k = 0;
    }
    int k = Math.max(j, k) + 1;
    h = k;
    int j = i;
    if (localc4 != null) {
      j = h;
    }
    h = (Math.max(k, j) + 1);
  }
  
  private final void a(c<K, V> paramc1, c<K, V> paramc2)
  {
    c localc = a;
    a = null;
    if (paramc2 != null) {
      a = localc;
    }
    if (localc != null)
    {
      if (b == paramc1)
      {
        b = paramc2;
        return;
      }
      c = paramc2;
      return;
    }
    f = paramc2;
  }
  
  private final c<K, V> b(Object paramObject)
  {
    if (paramObject != null) {}
    try
    {
      paramObject = a(paramObject, false);
      return (c<K, V>)paramObject;
    }
    catch (ClassCastException paramObject)
    {
      for (;;) {}
    }
    return null;
  }
  
  private final void b(c<K, V> paramc)
  {
    c localc1 = b;
    c localc2 = c;
    c localc3 = b;
    c localc4 = c;
    b = localc4;
    if (localc4 != null) {
      a = paramc;
    }
    a(paramc, localc1);
    c = paramc;
    a = localc1;
    int i = 0;
    if (localc2 != null) {
      j = h;
    } else {
      j = 0;
    }
    if (localc4 != null) {
      k = h;
    } else {
      k = 0;
    }
    int k = Math.max(j, k) + 1;
    h = k;
    int j = i;
    if (localc3 != null) {
      j = h;
    }
    h = (Math.max(k, j) + 1);
  }
  
  private final void b(c<K, V> paramc, boolean paramBoolean)
  {
    while (paramc != null)
    {
      c localc1 = b;
      c localc2 = c;
      int i = 0;
      int j = 0;
      int k;
      if (localc1 != null) {
        k = h;
      } else {
        k = 0;
      }
      int m;
      if (localc2 != null) {
        m = h;
      } else {
        m = 0;
      }
      int n = k - m;
      c localc3;
      if (n == -2)
      {
        localc1 = b;
        localc3 = c;
        if (localc3 != null) {
          k = h;
        } else {
          k = 0;
        }
        m = j;
        if (localc1 != null) {
          m = h;
        }
        k = m - k;
        if ((k != -1) && ((k != 0) || (paramBoolean)))
        {
          b(localc2);
          a(paramc);
        }
        else
        {
          a(paramc);
        }
        if (paramBoolean) {
          break;
        }
      }
      else if (n == 2)
      {
        localc2 = b;
        localc3 = c;
        if (localc3 != null) {
          k = h;
        } else {
          k = 0;
        }
        m = i;
        if (localc2 != null) {
          m = h;
        }
        k = m - k;
        if ((k != 1) && ((k != 0) || (paramBoolean)))
        {
          a(localc1);
          b(paramc);
        }
        else
        {
          b(paramc);
        }
        if (paramBoolean) {
          break;
        }
      }
      else if (n == 0)
      {
        h = (k + 1);
        if (!paramBoolean) {}
      }
      else
      {
        h = (Math.max(k, m) + 1);
        if (!paramBoolean) {
          break;
        }
      }
      paramc = a;
    }
  }
  
  private final Object writeReplace()
    throws ObjectStreamException
  {
    return new LinkedHashMap(this);
  }
  
  public final c<K, V> a(Object paramObject)
  {
    paramObject = b(paramObject);
    if (paramObject != null) {
      a((c)paramObject, true);
    }
    return (c<K, V>)paramObject;
  }
  
  public final c<K, V> a(Map.Entry<?, ?> paramEntry)
  {
    c localc = b(paramEntry.getKey());
    int i = 1;
    if (localc != null)
    {
      Object localObject = g;
      paramEntry = paramEntry.getValue();
      if ((localObject != paramEntry) && ((localObject == null) || (!localObject.equals(paramEntry)))) {
        j = 0;
      } else {
        j = 1;
      }
      if (j != 0)
      {
        j = i;
        break label76;
      }
    }
    int j = 0;
    label76:
    if (j != 0) {
      return localc;
    }
    return null;
  }
  
  public final void a(c<K, V> paramc, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject1 = e;
      d = d;
      d.e = ((c)localObject1);
    }
    Object localObject1 = b;
    Object localObject2 = c;
    Object localObject3 = a;
    int i = 0;
    if ((localObject1 != null) && (localObject2 != null))
    {
      if (h > h)
      {
        localObject3 = c;
        localObject2 = localObject1;
        for (localObject1 = localObject3;; localObject1 = c)
        {
          localObject3 = localObject2;
          localObject2 = localObject1;
          localObject1 = localObject3;
          if (localObject2 == null) {
            break;
          }
        }
      }
      for (localObject1 = b; localObject1 != null; localObject1 = localObject3)
      {
        localObject3 = b;
        localObject2 = localObject1;
      }
      localObject1 = localObject2;
      a((c)localObject1, false);
      localObject2 = b;
      int j;
      if (localObject2 != null)
      {
        j = h;
        b = ((c)localObject2);
        a = ((c)localObject1);
        b = null;
      }
      else
      {
        j = 0;
      }
      localObject2 = c;
      if (localObject2 != null)
      {
        i = h;
        c = ((c)localObject2);
        a = ((c)localObject1);
        c = null;
      }
      h = (Math.max(j, i) + 1);
      a(paramc, (c)localObject1);
      return;
    }
    if (localObject1 != null)
    {
      a(paramc, (c)localObject1);
      b = null;
    }
    else if (localObject2 != null)
    {
      a(paramc, (c)localObject2);
      c = null;
    }
    else
    {
      a(paramc, null);
    }
    b((c)localObject3, false);
    a -= 1;
    b += 1;
  }
  
  public final void clear()
  {
    f = null;
    a = 0;
    b += 1;
    c localc = c;
    e = localc;
    d = localc;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return b(paramObject) != null;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    a locala = g;
    if (locala != null) {
      return locala;
    }
    locala = new a();
    g = locala;
    return locala;
  }
  
  public final V get(Object paramObject)
  {
    paramObject = b(paramObject);
    if (paramObject != null) {
      return (V)g;
    }
    return null;
  }
  
  public final Set<K> keySet()
  {
    b localb = h;
    if (localb != null) {
      return localb;
    }
    localb = new b();
    h = localb;
    return localb;
  }
  
  public final V put(K paramK, V paramV)
  {
    if (paramK != null)
    {
      paramK = a(paramK, true);
      Object localObject = g;
      g = paramV;
      return (V)localObject;
    }
    throw new NullPointerException("key == null");
  }
  
  public final V remove(Object paramObject)
  {
    paramObject = a(paramObject);
    if (paramObject != null) {
      return (V)g;
    }
    return null;
  }
  
  public final int size()
  {
    return a;
  }
  
  public final class a
    extends AbstractSet<Map.Entry<K, V>>
  {
    public a() {}
    
    public final void clear()
    {
      zu.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return ((paramObject instanceof Map.Entry)) && (a((Map.Entry)paramObject) != null);
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new zv(this);
    }
    
    public final boolean remove(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      paramObject = a((Map.Entry)paramObject);
      if (paramObject == null) {
        return false;
      }
      a((zu.c)paramObject, true);
      return true;
    }
    
    public final int size()
    {
      return a;
    }
  }
  
  public final class b
    extends AbstractSet<K>
  {
    public b() {}
    
    public final void clear()
    {
      zu.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return containsKey(paramObject);
    }
    
    public final Iterator<K> iterator()
    {
      return new zw(this);
    }
    
    public final boolean remove(Object paramObject)
    {
      return a(paramObject) != null;
    }
    
    public final int size()
    {
      return a;
    }
  }
  
  public static final class c<K, V>
    implements Map.Entry<K, V>
  {
    public c<K, V> a;
    public c<K, V> b;
    public c<K, V> c;
    public c<K, V> d;
    public c<K, V> e;
    public final K f;
    public V g;
    public int h;
    
    public c()
    {
      f = null;
      e = this;
      d = this;
    }
    
    public c(c<K, V> paramc1, K paramK, c<K, V> paramc2, c<K, V> paramc3)
    {
      a = paramc1;
      f = paramK;
      h = 1;
      d = paramc2;
      e = paramc3;
      d = this;
      e = this;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof Map.Entry))
      {
        paramObject = (Map.Entry)paramObject;
        Object localObject = f;
        if (localObject == null ? ((Map.Entry)paramObject).getKey() == null : localObject.equals(((Map.Entry)paramObject).getKey()))
        {
          localObject = g;
          if (localObject == null ? ((Map.Entry)paramObject).getValue() == null : localObject.equals(((Map.Entry)paramObject).getValue())) {
            return true;
          }
        }
      }
      return false;
    }
    
    public final K getKey()
    {
      return (K)f;
    }
    
    public final V getValue()
    {
      return (V)g;
    }
    
    public final int hashCode()
    {
      Object localObject = f;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = localObject.hashCode();
      }
      localObject = g;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j ^ i;
    }
    
    public final V setValue(V paramV)
    {
      Object localObject = g;
      g = paramV;
      return (V)localObject;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(f);
      localStringBuilder.append("=");
      localStringBuilder.append(g);
      return localStringBuilder.toString();
    }
  }
  
  public abstract class d<T>
    implements Iterator<T>
  {
    private zu.c<K, V> a = c.d;
    private zu.c<K, V> b = null;
    private int c = b;
    
    public d() {}
    
    public final zu.c<K, V> a()
    {
      zu.c localc = a;
      zu localzu = zu.this;
      if (localc != c)
      {
        if (b == c)
        {
          a = d;
          b = localc;
          return localc;
        }
        throw new ConcurrentModificationException();
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      return a != c;
    }
    
    public final void remove()
    {
      zu.c localc = b;
      if (localc != null)
      {
        a(localc, true);
        b = null;
        c = b;
        return;
      }
      throw new IllegalStateException();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Set;

final class ahr<K, V>
  extends AbstractMap<V, K>
  implements ahk<V, K>, Serializable
{
  private final ahn<K, V> a;
  private transient Set<Map.Entry<V, K>> b;
  
  public ahr(ahn<K, V> paramahn)
  {
    a = paramahn;
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
    throws ClassNotFoundException, IOException
  {
    paramObjectInputStream.defaultReadObject();
    ahn.a(a, this);
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return a.containsValue(paramObject);
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final Set<Map.Entry<V, K>> entrySet()
  {
    Set localSet = b;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new ahq(a);
      b = ((Set)localObject);
    }
    return (Set<Map.Entry<V, K>>)localObject;
  }
  
  public final K get(Object paramObject)
  {
    return (K)a.c(paramObject);
  }
  
  public final Set<V> keySet()
  {
    return a.a();
  }
  
  public final K put(V paramV, K paramK)
  {
    return (K)a.a(paramV, paramK, false);
  }
  
  public final K remove(Object paramObject)
  {
    return (K)a.d(paramObject);
  }
  
  public final int size()
  {
    return a.c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
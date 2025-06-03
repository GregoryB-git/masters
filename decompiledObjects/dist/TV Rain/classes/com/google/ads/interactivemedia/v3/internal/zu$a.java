package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zu$a
  extends AbstractSet<Map.Entry<K, V>>
{
  public zu$a(zu paramzu) {}
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return ((paramObject instanceof Map.Entry)) && (a.a((Map.Entry)paramObject) != null);
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
    paramObject = a.a((Map.Entry)paramObject);
    if (paramObject == null) {
      return false;
    }
    a.a((zu.c)paramObject, true);
    return true;
  }
  
  public final int size()
  {
    return a.a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zu.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
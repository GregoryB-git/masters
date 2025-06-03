package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class zu$b
  extends AbstractSet<K>
{
  public zu$b(zu paramzu) {}
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final Iterator<K> iterator()
  {
    return new zw(this);
  }
  
  public final boolean remove(Object paramObject)
  {
    return a.a(paramObject) != null;
  }
  
  public final int size()
  {
    return a.a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zu.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
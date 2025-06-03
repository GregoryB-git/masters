package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

abstract class ahv<K, V, T>
  extends AbstractSet<T>
{
  public final ahn<K, V> a;
  
  public ahv(ahn<K, V> paramahn)
  {
    a = paramahn;
  }
  
  public abstract T a(int paramInt);
  
  public void clear()
  {
    a.clear();
  }
  
  public Iterator<T> iterator()
  {
    return new ahu(this);
  }
  
  public int size()
  {
    return a.c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
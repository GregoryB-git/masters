package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zu$d<T>
  implements Iterator<T>
{
  private zu.c<K, V> a;
  private zu.c<K, V> b;
  private int c;
  
  public zu$d(zu paramzu)
  {
    a = c.d;
    b = null;
    c = b;
  }
  
  public final zu.c<K, V> a()
  {
    zu.c localc = a;
    zu localzu = d;
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
    return a != d.c;
  }
  
  public final void remove()
  {
    zu.c localc = b;
    if (localc != null)
    {
      d.a(localc, true);
      b = null;
      c = d.b;
      return;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zu.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
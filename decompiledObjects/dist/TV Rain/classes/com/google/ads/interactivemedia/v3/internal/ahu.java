package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class ahu
  implements Iterator
{
  private int a;
  private int b;
  private int c;
  private int d;
  
  public ahu(ahv paramahv)
  {
    a = ahn.a(a);
    b = -1;
    paramahv = a;
    c = d;
    d = c;
  }
  
  private final void a()
  {
    if (e.a.d == c) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean hasNext()
  {
    a();
    return (a != -2) && (d > 0);
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      Object localObject = e.a(a);
      b = a;
      a = ahn.b(e.a)[a];
      d -= 1;
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    a();
    boolean bool;
    if (b != -1) {
      bool = true;
    } else {
      bool = false;
    }
    aim.a(bool);
    e.a.b(b);
    int i = a;
    ahn localahn = e.a;
    if (i == c) {
      a = b;
    }
    b = -1;
    c = d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
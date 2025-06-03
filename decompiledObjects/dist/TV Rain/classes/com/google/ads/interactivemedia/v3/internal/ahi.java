package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.List;
import java.util.NoSuchElementException;

class ahi<E>
  extends air<E>
{
  private final int a;
  private int b;
  private final ahw<E> c;
  
  public ahi(int paramInt1, int paramInt2)
  {
    ahf.b(paramInt2, paramInt1);
    a = paramInt1;
    b = paramInt2;
  }
  
  public ahi(ahw<E> paramahw, int paramInt)
  {
    this(paramahw.size(), paramInt);
    c = paramahw;
  }
  
  public E a(int paramInt)
  {
    return (E)c.get(paramInt);
  }
  
  public final boolean hasNext()
  {
    return b < a;
  }
  
  public final boolean hasPrevious()
  {
    return b > 0;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = b;
      b = (i + 1);
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return b;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = b - 1;
      b = i;
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return b - 1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
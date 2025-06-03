package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

final class aif
  extends aio
{
  private boolean a;
  
  public aif(Object paramObject) {}
  
  public final boolean hasNext()
  {
    return !a;
  }
  
  public final Object next()
  {
    if (!a)
    {
      a = true;
      return b;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aif
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
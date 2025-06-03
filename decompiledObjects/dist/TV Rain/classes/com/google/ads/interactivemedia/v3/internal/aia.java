package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class aia
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  private final Object[] a;
  private final Object[] b;
  
  public aia(aib<?, ?> paramaib)
  {
    a = new Object[paramaib.size()];
    b = new Object[paramaib.size()];
    aio localaio = paramaib.a().b();
    for (int i = 0; localaio.hasNext(); i++)
    {
      paramaib = (Map.Entry)localaio.next();
      a[i] = paramaib.getKey();
      b[i] = paramaib.getValue();
    }
  }
  
  public final Object readResolve()
  {
    aim localaim = new aim(a.length);
    for (int i = 0;; i++)
    {
      Object[] arrayOfObject = a;
      if (i >= arrayOfObject.length) {
        break;
      }
      localaim.b(arrayOfObject[i], b[i]);
    }
    return localaim.a();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aia
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
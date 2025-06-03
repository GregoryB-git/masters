package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class A5
  implements Iterator
{
  public Iterator o;
  
  public A5(y5 paramy5)
  {
    o = y5.a(paramy5).iterator();
  }
  
  public final boolean hasNext()
  {
    return o.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.A5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
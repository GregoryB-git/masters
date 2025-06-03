package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class m4
  implements Iterator
{
  public Iterator o;
  
  public m4(Iterator paramIterator)
  {
    o = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return o.hasNext();
  }
  
  public final void remove()
  {
    o.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.m4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
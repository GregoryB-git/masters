package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.ListIterator;

public final class B5
  implements ListIterator
{
  public ListIterator o;
  
  public B5(y5 paramy5, int paramInt)
  {
    o = y5.a(paramy5).listIterator(paramInt);
  }
  
  public final boolean hasNext()
  {
    return o.hasNext();
  }
  
  public final boolean hasPrevious()
  {
    return o.hasPrevious();
  }
  
  public final int nextIndex()
  {
    return o.nextIndex();
  }
  
  public final int previousIndex()
  {
    return o.previousIndex();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class y5
  extends AbstractList
  implements n4, RandomAccess
{
  public final n4 o;
  
  public y5(n4 paramn4)
  {
    o = paramn4;
  }
  
  public final void K(q3 paramq3)
  {
    throw new UnsupportedOperationException();
  }
  
  public final List b()
  {
    return o.b();
  }
  
  public final Iterator iterator()
  {
    return new A5(this);
  }
  
  public final Object l(int paramInt)
  {
    return o.l(paramInt);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new B5(this, paramInt);
  }
  
  public final int size()
  {
    return o.size();
  }
  
  public final n4 w()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.y5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
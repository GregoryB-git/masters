package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class o4
  extends l3
  implements n4, RandomAccess
{
  public static final o4 q;
  public static final n4 r;
  public final List p;
  
  static
  {
    o4 localo4 = new o4(false);
    q = localo4;
    r = localo4;
  }
  
  public o4(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  public o4(ArrayList paramArrayList)
  {
    p = paramArrayList;
  }
  
  public o4(boolean paramBoolean)
  {
    super(false);
    p = Collections.emptyList();
  }
  
  public static String d(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof q3)) {
      return ((q3)paramObject).V();
    }
    return a4.h((byte[])paramObject);
  }
  
  public final void K(q3 paramq3)
  {
    a();
    p.add(paramq3);
    modCount += 1;
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    a();
    Object localObject = paramCollection;
    if ((paramCollection instanceof n4)) {
      localObject = ((n4)paramCollection).b();
    }
    boolean bool = p.addAll(paramInt, (Collection)localObject);
    modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final List b()
  {
    return Collections.unmodifiableList(p);
  }
  
  public final void clear()
  {
    a();
    p.clear();
    modCount += 1;
  }
  
  public final Object l(int paramInt)
  {
    return p.get(paramInt);
  }
  
  public final int size()
  {
    return p.size();
  }
  
  public final n4 w()
  {
    if (c()) {
      return new y5(this);
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.o4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
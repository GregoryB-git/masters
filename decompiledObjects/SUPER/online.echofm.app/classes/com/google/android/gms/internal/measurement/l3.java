package com.google.android.gms.internal.measurement;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class l3
  extends AbstractList
  implements h4
{
  public boolean o;
  
  public l3()
  {
    this(true);
  }
  
  public l3(boolean paramBoolean)
  {
    o = paramBoolean;
  }
  
  public final void G()
  {
    if (o) {
      o = false;
    }
  }
  
  public final void a()
  {
    if (o) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public boolean add(Object paramObject)
  {
    a();
    return super.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    a();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    a();
    return super.addAll(paramCollection);
  }
  
  public boolean c()
  {
    return o;
  }
  
  public void clear()
  {
    a();
    super.clear();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    if (!(paramObject instanceof RandomAccess)) {
      return super.equals(paramObject);
    }
    paramObject = (List)paramObject;
    int i = size();
    if (i != ((List)paramObject).size()) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      if (!get(j).equals(((List)paramObject).get(j))) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public abstract Object remove(int paramInt);
  
  public boolean remove(Object paramObject)
  {
    a();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    a();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    a();
    return super.retainAll(paramCollection);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.l3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
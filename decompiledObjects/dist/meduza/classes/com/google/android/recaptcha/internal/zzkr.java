package com.google.android.recaptcha.internal;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzkr
  extends AbstractList
  implements zznk
{
  private boolean zza;
  
  public zzkr(boolean paramBoolean)
  {
    zza = paramBoolean;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    zza();
    super.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    zza();
    return super.add(paramObject);
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    zza();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    zza();
    return super.addAll(paramCollection);
  }
  
  public final void clear()
  {
    zza();
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
    if (i == ((List)paramObject).size())
    {
      for (int j = 0; j < i; j++) {
        if (!get(j).equals(((List)paramObject).get(j))) {
          return false;
        }
      }
      return true;
    }
    return false;
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
  
  public Object remove(int paramInt)
  {
    zza();
    return super.remove(paramInt);
  }
  
  public final boolean remove(Object paramObject)
  {
    zza();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    zza();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    zza();
    return super.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    zza();
    return super.set(paramInt, paramObject);
  }
  
  public final void zza()
  {
    if (zza) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzb()
  {
    if (zza) {
      zza = false;
    }
  }
  
  public final boolean zzc()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
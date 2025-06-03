package com.google.android.gms.internal.firebase_auth_api;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzaiq<E>
  extends AbstractList<E>
  implements zzakn<E>
{
  private boolean zza;
  
  public zzaiq(boolean paramBoolean)
  {
    zza = paramBoolean;
  }
  
  public void add(int paramInt, E paramE)
  {
    zza();
    super.add(paramInt, paramE);
  }
  
  public boolean add(E paramE)
  {
    zza();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    zza();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    zza();
    return super.addAll(paramCollection);
  }
  
  public void clear()
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
  
  public E remove(int paramInt)
  {
    zza();
    return (E)super.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    zza();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    zza();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    zza();
    return super.retainAll(paramCollection);
  }
  
  public E set(int paramInt, E paramE)
  {
    zza();
    return (E)super.set(paramInt, paramE);
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaiq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
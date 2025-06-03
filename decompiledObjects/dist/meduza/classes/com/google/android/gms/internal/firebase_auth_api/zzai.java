package com.google.android.gms.internal.firebase_auth_api;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class zzai<E>
  extends AbstractCollection<E>
  implements Serializable
{
  private static final Object[] zza = new Object[0];
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public Spliterator<E> spliterator()
  {
    return Spliterators.spliterator(this, 1296);
  }
  
  public final Object[] toArray()
  {
    return toArray(zza);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    zzw.zza(paramArrayOfT);
    int i = size();
    Object localObject;
    if (paramArrayOfT.length < i)
    {
      localObject = zzf();
      if (localObject != null) {
        return Arrays.copyOfRange((Object[])localObject, zzb(), zza(), paramArrayOfT.getClass());
      }
      if (paramArrayOfT.length != 0) {
        paramArrayOfT = Arrays.copyOf(paramArrayOfT, 0);
      }
      localObject = Arrays.copyOf(paramArrayOfT, i);
    }
    else
    {
      localObject = paramArrayOfT;
      if (paramArrayOfT.length > i)
      {
        paramArrayOfT[i] = null;
        localObject = paramArrayOfT;
      }
    }
    zza((Object[])localObject, 0);
    return (T[])localObject;
  }
  
  int zza()
  {
    throw new UnsupportedOperationException();
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    zzba localzzba = (zzba)iterator();
    while (localzzba.hasNext())
    {
      paramArrayOfObject[paramInt] = localzzba.next();
      paramInt++;
    }
    return paramInt;
  }
  
  int zzb()
  {
    throw new UnsupportedOperationException();
  }
  
  public zzaj<E> zzc()
  {
    if (isEmpty()) {
      return zzaj.zzh();
    }
    return zzaj.zza(toArray());
  }
  
  public abstract zzba<E> zzd();
  
  abstract boolean zze();
  
  public Object[] zzf()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
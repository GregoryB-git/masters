package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzaj<E>
  extends zzai<E>
  implements List<E>, RandomAccess
{
  private static final zzaz<Object> zza = new zzal(zzar.zza, 0);
  
  public static <E> zzaj<E> zza(E paramE1, E paramE2, E paramE3, E paramE4, E paramE5, E paramE6, E paramE7, E paramE8)
  {
    return zzb(new Object[] { paramE1, paramE2, paramE3, paramE4, paramE5, paramE6, paramE7, paramE8 });
  }
  
  public static <E> zzaj<E> zza(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof zzai))
    {
      com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj = ((zzai)paramCollection).zzc();
      paramCollection = localzzaj;
      if (localzzaj.zze())
      {
        paramCollection = localzzaj.toArray();
        paramCollection = zzb(paramCollection, paramCollection.length);
      }
      return paramCollection;
    }
    return zzb(paramCollection.toArray());
  }
  
  public static <E> zzaj<E> zza(Object[] paramArrayOfObject)
  {
    return zzb(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  private static <E> zzaj<E> zzb(Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i) {
      if (paramVarArgs[j] != null) {
        j++;
      } else {
        throw new NullPointerException(j.g("at index ", j));
      }
    }
    return zzb(paramVarArgs, paramVarArgs.length);
  }
  
  public static <E> zzaj<E> zzb(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzar.zza;
    }
    return new zzar(paramArrayOfObject, paramInt);
  }
  
  public static <E> zzam<E> zzg()
  {
    return new zzam();
  }
  
  public static <E> zzaj<E> zzh()
  {
    return zzar.zza;
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == zzw.zza(this)) {
      return true;
    }
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      int i = size();
      if (i == ((List)paramObject).size())
      {
        if ((paramObject instanceof RandomAccess))
        {
          for (j = 0; j < i; j++) {
            if (!zzp.zza(get(j), ((List)paramObject).get(j))) {
              break label151;
            }
          }
          return true;
        }
        i = size();
        Iterator localIterator = ((List)paramObject).iterator();
        int j = 0;
        while (j < i)
        {
          if (!localIterator.hasNext()) {
            break label151;
          }
          paramObject = get(j);
          j++;
          if (!zzp.zza(paramObject, localIterator.next())) {
            break label151;
          }
        }
        if (!localIterator.hasNext()) {
          return true;
        }
      }
    }
    label151:
    return false;
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = get(k).hashCode() + j * 31;
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    int i = size();
    for (int j = 0; j < i; j++) {
      if (paramObject.equals(get(j))) {
        return j;
      }
    }
    return -1;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    for (int i = size() - 1; i >= 0; i--) {
      if (paramObject.equals(get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public int zza(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(paramInt + j)] = get(j);
    }
    return paramInt + i;
  }
  
  public zzaj<E> zza(int paramInt1, int paramInt2)
  {
    zzw.zza(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzar.zza;
    }
    return new zzao(this, paramInt1, paramInt2);
  }
  
  @Deprecated
  public final zzaj<E> zzc()
  {
    return this;
  }
  
  public final zzba<E> zzd()
  {
    return (zzaz)listIterator();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
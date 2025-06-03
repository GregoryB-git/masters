package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzav
  extends AbstractCollection
  implements Serializable
{
  private static final Object[] zzl = new Object[0];
  
  @Deprecated
  public final boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection paramCollection)
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
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(zzl);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    paramArrayOfObject.getClass();
    int i = size();
    int j = paramArrayOfObject.length;
    Object[] arrayOfObject;
    if (j < i)
    {
      arrayOfObject = zze();
      if (arrayOfObject == null)
      {
        arrayOfObject = paramArrayOfObject;
        if (j != 0) {
          arrayOfObject = Arrays.copyOf(paramArrayOfObject, 0);
        }
        arrayOfObject = Arrays.copyOf(arrayOfObject, i);
      }
      else
      {
        return Arrays.copyOfRange(arrayOfObject, zzc(), zzb(), paramArrayOfObject.getClass());
      }
    }
    else
    {
      arrayOfObject = paramArrayOfObject;
      if (j > i)
      {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      }
    }
    zza(arrayOfObject, 0);
    return arrayOfObject;
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    zzcb localzzcb = zzd();
    for (paramInt = 0; localzzcb.hasNext(); paramInt++) {
      paramArrayOfObject[paramInt] = localzzcb.next();
    }
    return paramInt;
  }
  
  int zzb()
  {
    throw new UnsupportedOperationException();
  }
  
  int zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract zzcb zzd();
  
  public Object[] zze()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzav
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
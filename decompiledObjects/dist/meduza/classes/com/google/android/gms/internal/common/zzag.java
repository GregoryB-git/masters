package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import org.jspecify.annotations.NullMarked;

@NullMarked
public abstract class zzag
  extends AbstractCollection
  implements Serializable
{
  private static final Object[] zza = new Object[0];
  
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
  
  public final Spliterator spliterator()
  {
    return Spliterators.spliterator(this, 1296);
  }
  
  public final Object[] toArray()
  {
    return toArray(zza);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    paramArrayOfObject.getClass();
    int i = size();
    int j = paramArrayOfObject.length;
    Object[] arrayOfObject;
    if (j < i)
    {
      arrayOfObject = zzg();
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
    throw null;
  }
  
  int zzb()
  {
    throw null;
  }
  
  int zzc()
  {
    throw null;
  }
  
  public zzak zzd()
  {
    throw null;
  }
  
  public abstract zzan zze();
  
  abstract boolean zzf();
  
  public Object[] zzg()
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
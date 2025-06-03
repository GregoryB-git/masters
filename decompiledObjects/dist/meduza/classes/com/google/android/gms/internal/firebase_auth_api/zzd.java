package com.google.android.gms.internal.firebase_auth_api;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzd<T>
  implements Iterator<T>
{
  private int zza = 2;
  private T zzb;
  
  public final boolean hasNext()
  {
    int i = zza;
    int j;
    if (i != 4) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      j = i - 1;
      if (j != 0)
      {
        if (j != 2)
        {
          zza = 4;
          zzb = zza();
          if (zza != 3)
          {
            zza = 1;
            return true;
          }
        }
        return false;
      }
      return true;
    }
    throw new IllegalStateException();
  }
  
  public final T next()
  {
    if (hasNext())
    {
      zza = 2;
      Object localObject = zzb;
      zzb = null;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract T zza();
  
  public final T zzb()
  {
    zza = 3;
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
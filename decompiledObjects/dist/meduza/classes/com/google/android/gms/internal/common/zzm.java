package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.annotations.NullMarked;

@NullMarked
abstract class zzm
  implements Iterator
{
  private Object zza;
  private int zzb = 2;
  
  public final boolean hasNext()
  {
    int i = zzb;
    if (i != 4)
    {
      int j = i - 1;
      if (i != 0)
      {
        if (j != 0)
        {
          if (j != 2)
          {
            zzb = 4;
            zza = zza();
            if (zzb != 3)
            {
              zzb = 1;
              return true;
            }
          }
          return false;
        }
        return true;
      }
      throw null;
    }
    throw new IllegalStateException();
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      zzb = 2;
      Object localObject = zza;
      zza = null;
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract Object zza();
  
  public final Object zzb()
  {
    zzb = 3;
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import java.util.NoSuchElementException;

abstract class zzad<E>
  extends zzaz<E>
{
  private final int zza;
  private int zzb;
  
  public zzad(int paramInt1, int paramInt2)
  {
    zzw.zzb(paramInt2, paramInt1);
    zza = paramInt1;
    zzb = paramInt2;
  }
  
  public final boolean hasNext()
  {
    return zzb < zza;
  }
  
  public final boolean hasPrevious()
  {
    return zzb > 0;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = zzb;
      zzb = (i + 1);
      return (E)zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return zzb;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = zzb - 1;
      zzb = i;
      return (E)zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return zzb - 1;
  }
  
  public abstract E zza(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

final class zzbl
  extends zzcb
{
  public boolean zza;
  
  public zzbl(Object paramObject) {}
  
  public final boolean hasNext()
  {
    return !zza;
  }
  
  public final Object next()
  {
    if (!zza)
    {
      zza = true;
      return zzb;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
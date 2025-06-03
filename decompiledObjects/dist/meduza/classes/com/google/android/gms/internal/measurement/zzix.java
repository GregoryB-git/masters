package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzix
  extends zziz
{
  private int zza = 0;
  private final int zzb;
  
  public zzix(zziy paramzziy)
  {
    zzb = paramzziy.zzb();
  }
  
  public final boolean hasNext()
  {
    return zza < zzb;
  }
  
  public final byte zza()
  {
    int i = zza;
    if (i < zzb)
    {
      zza = (i + 1);
      return zzc.zzb(i);
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
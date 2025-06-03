package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

final class zzcq
  extends zzcs
{
  private int zzb = 0;
  private final int zzc;
  
  public zzcq(zzcz paramzzcz)
  {
    zzc = paramzzcz.zzd();
  }
  
  public final boolean hasNext()
  {
    return zzb < zzc;
  }
  
  public final byte zza()
  {
    int i = zzb;
    if (i < zzc)
    {
      zzb = (i + 1);
      return zza.zzb(i);
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
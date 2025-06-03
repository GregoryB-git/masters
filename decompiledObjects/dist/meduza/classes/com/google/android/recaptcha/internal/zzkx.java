package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

final class zzkx
  extends zzky
{
  private int zzb = 0;
  private final int zzc;
  
  public zzkx(zzle paramzzle)
  {
    zzc = paramzzle.zzd();
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzkx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
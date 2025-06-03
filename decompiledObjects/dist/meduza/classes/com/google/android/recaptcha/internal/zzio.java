package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

final class zzio
  extends c
{
  public int zzc;
  public zzja zzd;
  public String zze;
  public String zzf;
  
  public zzio(zzja paramzzja, e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zza = paramObject;
    zzc |= 0x80000000;
    return zzja.zzu(zzb, null, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzio
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
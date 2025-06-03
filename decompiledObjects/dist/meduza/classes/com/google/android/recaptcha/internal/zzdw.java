package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

final class zzdw
  extends c
{
  public long zza;
  public int zzd;
  public zzec zze;
  
  public zzdw(zzec paramzzec, e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zzb = paramObject;
    zzd |= 0x80000000;
    return zzec.zzf(zzc, 0L, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
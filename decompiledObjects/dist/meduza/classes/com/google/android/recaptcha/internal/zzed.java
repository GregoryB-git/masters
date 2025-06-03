package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ub.e;
import wb.c;

final class zzed
  extends c
{
  public double zza;
  public int zzd;
  public zzef zze;
  public String zzf;
  public RecaptchaAction zzg;
  
  public zzed(zzef paramzzef, e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zzb = paramObject;
    zzd |= 0x80000000;
    return zzc.zza(null, null, 0L, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
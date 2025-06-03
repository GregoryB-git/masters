package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

final class zzfg
  extends c
{
  public int zzc;
  
  public zzfg(zzfj paramzzfj, e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zza = paramObject;
    zzc |= 0x80000000;
    return zzfj.zzc(zzb, null, null, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
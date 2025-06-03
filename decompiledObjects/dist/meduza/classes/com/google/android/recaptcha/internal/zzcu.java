package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

final class zzcu
  extends c
{
  public int zzc;
  public zzen zzd;
  
  public zzcu(zzcv paramzzcv, e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zza = paramObject;
    zzc |= 0x80000000;
    return zzcv.zzi(zzb, null, 0, null, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzcu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
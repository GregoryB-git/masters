package com.google.android.recaptcha.internal;

import vb.a;
import wb.c;

final class zzir
  extends c
{
  public int zzc;
  
  public zzir(zzja paramzzja, ub.e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    zza = paramObject;
    zzc |= 0x80000000;
    paramObject = zzb.zzh(null, this);
    if (paramObject == a.a) {
      return paramObject;
    }
    return new rb.e(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzir
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
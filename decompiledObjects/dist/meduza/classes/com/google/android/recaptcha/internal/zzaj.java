package com.google.android.recaptcha.internal;

import dc.p;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzaj
  extends i
  implements p
{
  public int zza;
  
  public zzaj(zzan paramzzan, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzaj(zzb, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      zzan.zzh(zzb, zzao.zza);
      paramObject = zzb;
      zza = 1;
      if (((zzan)paramObject).zze(this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
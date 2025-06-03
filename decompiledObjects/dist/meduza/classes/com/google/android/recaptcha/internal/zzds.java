package com.google.android.recaptcha.internal;

import dc.p;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzds
  extends i
  implements p
{
  public int zza;
  
  public zzds(zzdt paramzzdt, zzen paramzzen, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzds(zzb, zzc, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      paramObject = zzb;
      zza = 1;
      localObject = zzdt.zzj((zzdt)paramObject, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    Object localObject = zzc;
    paramObject = (zzsc)paramObject;
    ((zzen)localObject).zza();
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
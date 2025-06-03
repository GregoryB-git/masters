package com.google.android.recaptcha.internal;

import dc.p;
import rb.f;
import vb.a;
import wb.i;

final class zzj
  extends i
  implements p
{
  public int zza;
  
  public zzj(zze paramzze, long paramLong, zzsc paramzzsc, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e create(Object paramObject, ub.e parame)
  {
    return new zzj(zzb, zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i != 0)
    {
      paramObject = a;
    }
    else
    {
      Object localObject = zzb;
      long l = zzc;
      paramObject = zzd;
      zza = 1;
      localObject = ((zze)localObject).zze(l, (zzsc)paramObject, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return new rb.e(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
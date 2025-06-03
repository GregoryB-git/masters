package com.google.android.recaptcha.internal;

import android.app.Application;
import dc.p;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzco
  extends i
  implements p
{
  public int zza;
  
  public zzco(Application paramApplication, String paramString, long paramLong, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzco(zzb, zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      paramObject = zzb;
      Object localObject = zzc;
      long l = zzd;
      zza = 1;
      localObject = zzcq.zzb((Application)paramObject, (String)localObject, l, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzco
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
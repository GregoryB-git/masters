package com.google.android.recaptcha.internal;

import dc.l;
import dc.p;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzeb
  extends i
  implements p
{
  public int zza;
  
  public zzeb(zzec paramzzec, r paramr, long paramLong, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzeb(zzb, zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    if (zza != 0)
    {
      try
      {
        f.b(paramObject);
      }
      catch (zzbd paramObject)
      {
        break label108;
      }
    }
    else
    {
      f.b(paramObject);
      paramObject = zzbq.zza;
      Object localObject = new com/google/android/recaptcha/internal/zzdz;
      ((zzdz)localObject).<init>(zzb);
      zzea localzzea = new com/google/android/recaptcha/internal/zzea;
      localzzea.<init>(zzb, zzd, zzc, null);
      zza = 1;
      localObject = ((zzbq)paramObject).zza((l)localObject, 100L, 1000L, 2.0D, localzzea, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    ((Boolean)paramObject).booleanValue();
    break label129;
    label108:
    zzec.zzj(zzb, zzcm.zza());
    zzc.h0((Throwable)paramObject);
    label129:
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzeb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.recaptcha.internal;

import dc.p;
import java.util.Iterator;
import java.util.List;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

final class zzu
  extends i
  implements p
{
  public Object zza;
  public Object zzb;
  public int zzc;
  
  public zzu(zzsc paramzzsc, zzv paramzzv, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e create(Object paramObject, ub.e parame)
  {
    return new zzu(zzd, zze, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    Object localObject;
    zzse localzzse;
    if (zzc != 0)
    {
      localObject = (Iterator)zzb;
      localzzse = (zzse)zza;
      f.b(paramObject);
      paramObject = localObject;
    }
    else
    {
      f.b(paramObject);
      if (!zzd.zzS()) {
        return new rb.e(f.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
      }
      localzzse = zzd.zzj();
      if (localzzse.zzi().zzd() == 0) {
        break label182;
      }
      zzv.zzp(zze, localzzse.zzi());
      paramObject = zzv.zzn(zze).iterator();
    }
    while (((Iterator)paramObject).hasNext())
    {
      localObject = (zzy)((Iterator)paramObject).next();
      zza = localzzse;
      zzb = paramObject;
      zzc = 1;
      if (((zzy)localObject).zzd(localzzse, this) == locala) {
        return locala;
      }
    }
    return new rb.e(h.a);
    label182:
    return new rb.e(f.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.recaptcha.internal;

import dc.p;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzct
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zzct(zzcv paramzzcv, String paramString, long paramLong, zzcn paramzzcn, zzbi paramzzbi, zzch paramzzch, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    parame = new zzct(zzd, zze, zzf, zzg, zzi, zzh, parame);
    zzc = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    zzcn localzzcn;
    zzek localzzek;
    if (zzb != 0)
    {
      localzzcn = (zzcn)zza;
      localzzek = (zzek)zzc;
      f.b(paramObject);
      paramObject = localzzcn;
    }
    else
    {
      f.b(paramObject);
      localzzek = (zzek)zzc;
      paramObject = zzcv.zza(zzd, zze);
      if (paramObject != null) {
        return paramObject;
      }
      zzcv.zzc(zzd, zzf);
      localzzcn = zzg;
      paramObject = localzzcn;
      if (localzzcn == null) {
        paramObject = zzcv.zze(zzd, zze, zzi, zzh, localzzek);
      }
      long l = zzf;
      zzc = localzzek;
      zza = paramObject;
      zzb = 1;
      if (((zzcn)paramObject).zzb(l, this) == locala) {
        return locala;
      }
    }
    paramObject = new zzdc((zzcn)paramObject, zze, zzi, localzzek);
    zzcv.zzb(zzd, (zzdc)paramObject);
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
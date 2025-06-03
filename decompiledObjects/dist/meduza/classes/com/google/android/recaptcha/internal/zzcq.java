package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import ub.e;
import x6.b;

public final class zzcq
{
  private static zzcv zza;
  
  public static final zzcv zza(Application paramApplication)
  {
    zzcv localzzcv1 = zza;
    zzcv localzzcv2 = localzzcv1;
    if (localzzcv1 == null) {
      localzzcv2 = new zzcv(paramApplication);
    }
    if (zza == null) {
      zza = localzzcv2;
    }
    return localzzcv2;
  }
  
  public static final Object zzb(Application paramApplication, String paramString, long paramLong, e parame)
  {
    return zzcv.zzh(zza(paramApplication), paramString, paramLong, null, null, null, parame, 28, null);
  }
  
  public static final Task zzc(Application paramApplication, String paramString, long paramLong)
  {
    return zzas.zza(b.h(zza(paramApplication).zzd().zza(), new zzco(paramApplication, paramString, paramLong, null)));
  }
  
  public static final Object zzd(Application paramApplication, String paramString, e parame)
  {
    return zzcv.zzf(zza(paramApplication), paramString, null, null, parame, 6, null);
  }
  
  public static final Task zze(Application paramApplication, String paramString)
  {
    return zzas.zza(b.h(zza(paramApplication).zzd().zza(), new zzcp(paramApplication, paramString, null)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzcq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
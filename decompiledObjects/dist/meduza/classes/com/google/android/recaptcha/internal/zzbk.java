package com.google.android.recaptcha.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzbk
{
  private static final ConcurrentHashMap zzb = new ConcurrentHashMap();
  
  public static final void zza(int paramInt, long paramLong)
  {
    ConcurrentHashMap localConcurrentHashMap = zzb;
    Integer localInteger = Integer.valueOf(paramInt);
    Object localObject1 = localConcurrentHashMap.get(localInteger);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new zzbj();
    }
    localObject2 = (zzbj)localObject2;
    ((zzbj)localObject2).zzg(((zzbj)localObject2).zzb() + 1);
    ((zzbj)localObject2).zzf(((zzbj)localObject2).zzd() + paramLong);
    ((zzbj)localObject2).zze(Math.max(paramLong, ((zzbj)localObject2).zzc()));
    localConcurrentHashMap.put(localInteger, localObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
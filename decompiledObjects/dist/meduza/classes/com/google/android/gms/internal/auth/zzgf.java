package com.google.android.gms.internal.auth;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzgf
{
  private static final zzgf zza = new zzgf();
  private final zzgj zzb = new zzfp();
  private final ConcurrentMap zzc = new ConcurrentHashMap();
  
  public static zzgf zza()
  {
    return zza;
  }
  
  public final zzgi zzb(Class paramClass)
  {
    zzfa.zzc(paramClass, "messageType");
    zzgi localzzgi1 = (zzgi)zzc.get(paramClass);
    zzgi localzzgi2 = localzzgi1;
    if (localzzgi1 == null)
    {
      localzzgi2 = zzb.zza(paramClass);
      zzfa.zzc(paramClass, "messageType");
      paramClass = (zzgi)zzc.putIfAbsent(paramClass, localzzgi2);
      if (paramClass != null) {
        return paramClass;
      }
    }
    return localzzgi2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
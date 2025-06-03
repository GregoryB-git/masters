package com.google.android.recaptcha.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzos
{
  private static final zzos zzb = new zzos();
  private final zzox zzc = new zzoa();
  private final ConcurrentMap zzd = new ConcurrentHashMap();
  
  public static zzos zza()
  {
    return zzb;
  }
  
  public final zzow zzb(Class paramClass)
  {
    zznl.zzc(paramClass, "messageType");
    zzow localzzow1 = (zzow)zzd.get(paramClass);
    zzow localzzow2 = localzzow1;
    if (localzzow1 == null)
    {
      localzzow2 = zzc.zza(paramClass);
      zznl.zzc(paramClass, "messageType");
      paramClass = (zzow)zzd.putIfAbsent(paramClass, localzzow2);
      if (paramClass != null) {
        return paramClass;
      }
    }
    return localzzow2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzos
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
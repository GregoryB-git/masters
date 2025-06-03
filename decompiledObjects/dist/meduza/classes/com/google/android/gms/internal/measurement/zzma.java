package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzma
{
  private static final zzma zza = new zzma();
  private final zzmh zzb = new zzla();
  private final ConcurrentMap<Class<?>, zzme<?>> zzc = new ConcurrentHashMap();
  
  public static zzma zza()
  {
    return zza;
  }
  
  public final <T> zzme<T> zza(Class<T> paramClass)
  {
    zzkj.zza(paramClass, "messageType");
    zzme localzzme = (zzme)zzc.get(paramClass);
    Object localObject = localzzme;
    if (localzzme == null)
    {
      localObject = zzb.zza(paramClass);
      zzkj.zza(paramClass, "messageType");
      zzkj.zza(localObject, "schema");
      paramClass = (zzme)zzc.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (zzme<T>)localObject;
  }
  
  public final <T> zzme<T> zza(T paramT)
  {
    return zza(paramT.getClass());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzma
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
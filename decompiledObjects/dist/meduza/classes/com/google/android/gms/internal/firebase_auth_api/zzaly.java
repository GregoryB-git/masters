package com.google.android.gms.internal.firebase_auth_api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzaly
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzaly zza = new zzaly();
  private final com.google.android.gms.internal.firebase-auth-api.zzamf zzb = new zzalb();
  private final ConcurrentMap<Class<?>, zzamc<?>> zzc = new ConcurrentHashMap();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaly zza()
  {
    return zza;
  }
  
  public final <T> zzamc<T> zza(Class<T> paramClass)
  {
    zzaki.zza(paramClass, "messageType");
    zzamc localzzamc = (zzamc)zzc.get(paramClass);
    Object localObject = localzzamc;
    if (localzzamc == null)
    {
      localObject = zzb.zza(paramClass);
      zzaki.zza(paramClass, "messageType");
      zzaki.zza(localObject, "schema");
      paramClass = (zzamc)zzc.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (zzamc<T>)localObject;
  }
  
  public final <T> zzamc<T> zza(T paramT)
  {
    return zza(paramT.getClass());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaly
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
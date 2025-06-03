package com.google.android.gms.internal.firebase_auth_api;

import android.app.Activity;
import b8.f0;
import java.util.Map;
import java.util.concurrent.Executor;
import r.b;

public final class zzafc
{
  private static final Map<String, zzafe> zza = new b();
  
  public static f0 zza(String paramString, f0 paramf0, com.google.android.gms.internal.firebase-auth-api.zzaeg paramzzaeg)
  {
    zza(paramString, paramzzaeg);
    return new zzafb(paramf0, paramString);
  }
  
  public static void zza()
  {
    zza.clear();
  }
  
  private static void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzaeg paramzzaeg)
  {
    zza.put(paramString, new zzafe(paramzzaeg, System.currentTimeMillis()));
  }
  
  public static boolean zza(String paramString, f0 paramf0, Activity paramActivity, Executor paramExecutor)
  {
    Object localObject = zza;
    if (((Map)localObject).containsKey(paramString))
    {
      localObject = (zzafe)((Map)localObject).get(paramString);
      if (System.currentTimeMillis() - zzb < 120000L)
      {
        localObject = zza;
        if (localObject != null) {
          ((zzaeg)localObject).zza(paramf0, paramActivity, paramExecutor, paramString);
        }
        return true;
      }
      zza(paramString, null);
      return false;
    }
    zza(paramString, null);
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
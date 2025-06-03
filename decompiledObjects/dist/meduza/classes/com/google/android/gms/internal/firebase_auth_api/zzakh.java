package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzalk;
import f;

final class zzakh
  implements zzalk
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzakh zza = new zzakh();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakh zza()
  {
    return zza;
  }
  
  public final zzall zza(Class<?> paramClass)
  {
    if (com.google.android.gms.internal.firebase-auth-api.zzakg.class.isAssignableFrom(paramClass)) {
      try
      {
        zzall localzzall = (zzall)zzakg.zza(paramClass.asSubclass(com.google.android.gms.internal.firebase-auth-api.zzakg.class)).zza(zzakg.zze.zzc, null, null);
        return localzzall;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(f.j("Unable to get message info for ", paramClass.getName()), localException);
      }
    }
    throw new IllegalArgumentException(f.j("Unsupported message type: ", paramClass.getName()));
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    return com.google.android.gms.internal.firebase-auth-api.zzakg.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
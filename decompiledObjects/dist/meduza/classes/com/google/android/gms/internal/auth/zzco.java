package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import x6.b;

final class zzco
  implements zzcl
{
  private static zzco zza;
  private final Context zzb;
  private final ContentObserver zzc;
  
  private zzco()
  {
    zzb = null;
    zzc = null;
  }
  
  private zzco(Context paramContext)
  {
    zzb = paramContext;
    zzcn localzzcn = new zzcn(this, null);
    zzc = localzzcn;
    paramContext.getContentResolver().registerContentObserver(zzcb.zza, true, localzzcn);
  }
  
  public static zzco zza(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        if (b.F(paramContext, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0)
        {
          zzco localzzco = new com/google/android/gms/internal/auth/zzco;
          localzzco.<init>(paramContext);
          paramContext = localzzco;
        }
        else
        {
          paramContext = new zzco();
        }
        zza = paramContext;
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public static void zze()
  {
    try
    {
      zzco localzzco = zza;
      if (localzzco != null)
      {
        Context localContext = zzb;
        if ((localContext != null) && (zzc != null)) {
          localContext.getContentResolver().unregisterContentObserver(zzazzc);
        }
      }
      zza = null;
      return;
    }
    finally {}
  }
  
  public final String zzc(String paramString)
  {
    Object localObject = zzb;
    if ((localObject != null) && (!zzcc.zza((Context)localObject)))
    {
      try
      {
        localObject = new com/google/android/gms/internal/auth/zzcm;
        ((zzcm)localObject).<init>(this, paramString);
        localObject = (String)zzcj.zza((zzck)localObject);
        return (String)localObject;
      }
      catch (NullPointerException localNullPointerException) {}catch (SecurityException localSecurityException) {}catch (IllegalStateException localIllegalStateException) {}
      Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(paramString)), localIllegalStateException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzco
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
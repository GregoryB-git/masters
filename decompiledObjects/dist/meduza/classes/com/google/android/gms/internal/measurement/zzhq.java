package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import x6.b;

final class zzhq
  implements zzhl
{
  private static zzhq zza;
  private final Context zzb;
  private final ContentObserver zzc;
  
  private zzhq()
  {
    zzb = null;
    zzc = null;
  }
  
  private zzhq(Context paramContext)
  {
    zzb = paramContext;
    zzhs localzzhs = new zzhs(this, null);
    zzc = localzzhs;
    paramContext.getContentResolver().registerContentObserver(zzgw.zza, true, localzzhs);
  }
  
  public static zzhq zza(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        int i;
        if (b.F(paramContext, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          zzhq localzzhq = new com/google/android/gms/internal/measurement/zzhq;
          localzzhq.<init>(paramContext);
          paramContext = localzzhq;
        }
        else
        {
          paramContext = new zzhq();
        }
        zza = paramContext;
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public static void zza()
  {
    try
    {
      zzhq localzzhq = zza;
      if (localzzhq != null)
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
  
  private final String zzb(String paramString)
  {
    Object localObject = zzb;
    if ((localObject != null) && (!zzhg.zza((Context)localObject)))
    {
      try
      {
        localObject = new com/google/android/gms/internal/measurement/zzhp;
        ((zzhp)localObject).<init>(this, paramString);
        localObject = (String)zzho.zza((zzhn)localObject);
        return (String)localObject;
      }
      catch (NullPointerException localNullPointerException) {}catch (SecurityException localSecurityException) {}catch (IllegalStateException localIllegalStateException) {}
      StringBuilder localStringBuilder = new StringBuilder("Unable to read GServices for: ");
      localStringBuilder.append(paramString);
      Log.e("GservicesLoader", localStringBuilder.toString(), localIllegalStateException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
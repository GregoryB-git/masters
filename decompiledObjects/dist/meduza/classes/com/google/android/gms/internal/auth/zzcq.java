package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;

public final class zzcq
{
  public static volatile zzdh zza = ;
  private static final Object zzb = new Object();
  
  public static boolean zza(Context paramContext, Uri arg1)
  {
    ??? = ???.getAuthority();
    bool1 = "com.google.android.gms.phenotype".equals(???);
    bool2 = false;
    if (!bool1)
    {
      Log.e("PhenotypeClientHelper", String.valueOf(???).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
      return false;
    }
    if (zza.zzb()) {}
    for (;;)
    {
      return ((Boolean)zza.zza()).booleanValue();
      synchronized (zzb)
      {
        if (zza.zzb())
        {
          bool1 = ((Boolean)zza.zza()).booleanValue();
          return bool1;
        }
        if (!"com.google.android.gms".equals(paramContext.getPackageName()))
        {
          Object localObject = paramContext.getPackageManager();
          int i;
          if (Build.VERSION.SDK_INT < 29) {
            i = 0;
          } else {
            i = 268435456;
          }
          localObject = ((PackageManager)localObject).resolveContentProvider("com.google.android.gms.phenotype", i);
          bool1 = bool2;
          if (localObject != null)
          {
            bool1 = bool2;
            if (!"com.google.android.gms".equals(packageName)) {}
          }
        }
        else
        {
          paramContext = paramContext.getPackageManager();
        }
        try
        {
          paramContext = paramContext.getApplicationInfo("com.google.android.gms", 0);
          bool1 = bool2;
          if ((flags & 0x81) != 0) {
            bool1 = true;
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          for (;;)
          {
            bool1 = bool2;
          }
        }
        zza = zzdh.zzd(Boolean.valueOf(bool1));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
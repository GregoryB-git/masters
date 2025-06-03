package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import n7.a;
import n7.h;
import n7.l;

public final class zzhv
{
  private static volatile h<Boolean> zza = a.a;
  private static final Object zzb = new Object();
  
  private static boolean zza(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getApplicationInfo("com.google.android.gms", 0);
      if ((flags & 0x81) != 0) {
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static boolean zza(Context paramContext, Uri arg1)
  {
    ??? = ???.getAuthority();
    boolean bool1 = "com.google.android.gms.phenotype".equals(???);
    boolean bool2 = false;
    if (!bool1)
    {
      paramContext = new StringBuilder();
      paramContext.append(???);
      paramContext.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
      Log.e("PhenotypeClientHelper", paramContext.toString());
      return false;
    }
    if (!zza.b()) {}
    synchronized (zzb)
    {
      if (zza.b())
      {
        bool1 = ((Boolean)zza.a()).booleanValue();
        return bool1;
      }
      if (!"com.google.android.gms".equals(paramContext.getPackageName()))
      {
        localObject = paramContext.getPackageManager();
        if (Build.VERSION.SDK_INT < 29) {
          i = 0;
        } else {
          i = 268435456;
        }
        localObject = ((PackageManager)localObject).resolveContentProvider("com.google.android.gms.phenotype", i);
        if ((localObject == null) || (!"com.google.android.gms".equals(packageName))) {}
      }
      else
      {
        i = 1;
        break label172;
      }
      int i = 0;
      label172:
      bool1 = bool2;
      if (i != 0)
      {
        bool1 = bool2;
        if (zza(paramContext)) {
          bool1 = true;
        }
      }
      Object localObject = Boolean.valueOf(bool1);
      paramContext = new n7/l;
      localObject.getClass();
      paramContext.<init>(localObject);
      zza = paramContext;
      return ((Boolean)zza.a()).booleanValue();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
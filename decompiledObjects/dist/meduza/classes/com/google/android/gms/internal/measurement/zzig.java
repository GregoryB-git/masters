package com.google.android.gms.internal.measurement;

import a0.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;

public final class zzig
  implements zzhl
{
  private static final Map<String, zzig> zza = new b();
  private final SharedPreferences zzb;
  private final Runnable zzc;
  private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
  private final Object zze;
  private volatile Map<String, ?> zzf;
  private final List<zzhj> zzg;
  
  private zzig(SharedPreferences paramSharedPreferences, Runnable paramRunnable)
  {
    zzij localzzij = new zzij(this);
    zzd = localzzij;
    zze = new Object();
    zzg = new ArrayList();
    zzb = paramSharedPreferences;
    zzc = paramRunnable;
    paramSharedPreferences.registerOnSharedPreferenceChangeListener(localzzij);
  }
  
  private static SharedPreferences zza(Context paramContext, String paramString)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      if (paramString.startsWith("direct_boot:"))
      {
        Context localContext = paramContext;
        if (zzhg.zza()) {
          localContext = d.f(paramContext);
        }
        paramContext = zzcw.zza(localContext, paramString.substring(12), 0, zzcs.zza);
        return paramContext;
      }
      paramContext = zzcw.zza(paramContext, paramString, 0, zzcs.zza);
      return paramContext;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  public static zzig zza(Context paramContext, String paramString, Runnable paramRunnable)
  {
    boolean bool;
    if ((zzhg.zza()) && (!paramString.startsWith("direct_boot:"))) {
      bool = zzhg.zzb(paramContext);
    } else {
      bool = true;
    }
    if (!bool) {
      return null;
    }
    try
    {
      Map localMap = zza;
      zzig localzzig1 = (zzig)localMap.get(paramString);
      zzig localzzig2 = localzzig1;
      if (localzzig1 == null)
      {
        localzzig2 = new com/google/android/gms/internal/measurement/zzig;
        localzzig2.<init>(zza(paramContext, paramString), paramRunnable);
        localMap.put(paramString, localzzig2);
      }
      return localzzig2;
    }
    finally {}
  }
  
  public static void zza()
  {
    try
    {
      Iterator localIterator = zza.values().iterator();
      while (localIterator.hasNext())
      {
        zzig localzzig = (zzig)localIterator.next();
        zzb.unregisterOnSharedPreferenceChangeListener(zzd);
      }
      zza.clear();
      return;
    }
    finally {}
  }
  
  public final Object zza(String paramString)
  {
    Object localObject1 = zzf;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      synchronized (zze)
      {
        localObject1 = zzf;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject1 = StrictMode.allowThreadDiskReads();
        }
        try
        {
          localObject2 = zzb.getAll();
          zzf = ((Map)localObject2);
          StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
        }
        finally
        {
          StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
        }
      }
    }
    if (localObject2 != null) {
      return ((Map)localObject2).get(paramString);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
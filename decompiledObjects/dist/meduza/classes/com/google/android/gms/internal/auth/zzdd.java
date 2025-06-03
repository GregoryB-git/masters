package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.StrictMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import r.b;

public final class zzdd
  implements zzcl
{
  private static final Map zza = new b();
  private final SharedPreferences zzb;
  private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
  
  public static zzdd zza(Context paramContext, String paramString, Runnable paramRunnable)
  {
    if (!zzcc.zzb()) {
      try
      {
        paramContext = (zzdd)zza.get(null);
        if (paramContext != null) {
          return paramContext;
        }
        paramString = StrictMode.allowThreadDiskReads();
        try
        {
          throw null;
        }
        finally
        {
          StrictMode.setThreadPolicy(paramString);
        }
        throw null;
      }
      finally {}
    }
  }
  
  public static void zzc()
  {
    try
    {
      Map localMap = zza;
      Object localObject1 = localMap.values().iterator();
      if (!((Iterator)localObject1).hasNext())
      {
        localMap.clear();
        return;
      }
      localObject1 = nextzzb;
      throw null;
    }
    finally {}
  }
  
  public final Object zzb(String paramString)
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
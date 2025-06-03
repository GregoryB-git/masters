package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzcr
  implements SharedPreferences
{
  private final Map<String, Object> zza = new HashMap();
  private final Set<SharedPreferences.OnSharedPreferenceChangeListener> zzb = new HashSet();
  
  private final <T> T zza(String paramString, T paramT)
  {
    paramString = zza.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return paramT;
  }
  
  public final boolean contains(String paramString)
  {
    return zza.containsKey(paramString);
  }
  
  public final SharedPreferences.Editor edit()
  {
    return new zzcu(this, null);
  }
  
  public final Map<String, ?> getAll()
  {
    return zza;
  }
  
  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    return ((Boolean)zza(paramString, Boolean.valueOf(paramBoolean))).booleanValue();
  }
  
  public final float getFloat(String paramString, float paramFloat)
  {
    return ((Float)zza(paramString, Float.valueOf(paramFloat))).floatValue();
  }
  
  public final int getInt(String paramString, int paramInt)
  {
    return ((Integer)zza(paramString, Integer.valueOf(paramInt))).intValue();
  }
  
  public final long getLong(String paramString, long paramLong)
  {
    return ((Long)zza(paramString, Long.valueOf(paramLong))).longValue();
  }
  
  public final String getString(String paramString1, String paramString2)
  {
    return (String)zza(paramString1, paramString2);
  }
  
  public final Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    return (Set)zza(paramString, paramSet);
  }
  
  public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    zzb.add(paramOnSharedPreferenceChangeListener);
  }
  
  public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    zzb.remove(paramOnSharedPreferenceChangeListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
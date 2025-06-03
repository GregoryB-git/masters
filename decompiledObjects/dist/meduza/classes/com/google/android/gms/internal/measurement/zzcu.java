package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o7.q0;
import o7.r0;

final class zzcu
  implements SharedPreferences.Editor
{
  private boolean zza = false;
  private Set<String> zzb = new HashSet();
  private Map<String, Object> zzc = new HashMap();
  
  private zzcu(zzcr paramzzcr) {}
  
  private final void zza(String paramString, Object paramObject)
  {
    if (paramObject != null)
    {
      zzc.put(paramString, paramObject);
      return;
    }
    remove(paramString);
  }
  
  public final void apply()
  {
    commit();
  }
  
  public final SharedPreferences.Editor clear()
  {
    zza = true;
    return this;
  }
  
  public final boolean commit()
  {
    if (zza) {
      zzcr.zza(zzd).clear();
    }
    zzcr.zza(zzd).keySet().removeAll(zzb);
    Iterator localIterator = zzc.entrySet().iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      zzcr.zza(zzd).put((String)((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue());
    }
    localIterator = zzcr.zzb(zzd).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator.next();
      Object localObject2 = zzb;
      Object localObject3 = zzc.keySet();
      x6.b.y(localObject2, "set1");
      x6.b.y(localObject3, "set2");
      localObject3 = new q0(new r0((Set)localObject2, (Set)localObject3));
      while (((o7.b)localObject3).hasNext())
      {
        localObject2 = (String)((o7.b)localObject3).next();
        ((SharedPreferences.OnSharedPreferenceChangeListener)localObject1).onSharedPreferenceChanged(zzd, (String)localObject2);
      }
    }
    return (zza) || (!zzb.isEmpty()) || (!zzc.isEmpty());
  }
  
  public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    zza(paramString, Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    zza(paramString, Float.valueOf(paramFloat));
    return this;
  }
  
  public final SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    zza(paramString, Integer.valueOf(paramInt));
    return this;
  }
  
  public final SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    zza(paramString, Long.valueOf(paramLong));
    return this;
  }
  
  public final SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    zza(paramString1, paramString2);
    return this;
  }
  
  public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    zza(paramString, paramSet);
    return this;
  }
  
  public final SharedPreferences.Editor remove(String paramString)
  {
    zzb.add(paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import o7.r;
import o7.x;

public final class zzad
{
  private static final x<String> zza = x.s("_syn", "_err", "_el");
  private String zzb;
  private long zzc;
  private Map<String, Object> zzd;
  
  public zzad(String paramString, long paramLong, Map<String, Object> paramMap)
  {
    zzb = paramString;
    zzc = paramLong;
    paramString = new HashMap();
    zzd = paramString;
    if (paramMap != null) {
      paramString.putAll(paramMap);
    }
  }
  
  public static Object zza(String paramString, Object paramObject1, Object paramObject2)
  {
    if ((zza.contains(paramString)) && ((paramObject2 instanceof Double))) {}
    do
    {
      return Long.valueOf(Math.round(((Double)paramObject2).doubleValue()));
      if (paramString.startsWith("_"))
      {
        if ((paramObject1 instanceof String)) {
          return paramObject2;
        }
        if (paramObject1 != null) {
          return paramObject1;
        }
        return paramObject2;
      }
      if ((paramObject1 instanceof Double)) {
        return paramObject2;
      }
    } while ((paramObject1 instanceof Long));
    if ((paramObject1 instanceof String)) {
      return paramObject2.toString();
    }
    return paramObject2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzad)) {
      return false;
    }
    paramObject = (zzad)paramObject;
    if (zzc != zzc) {
      return false;
    }
    if (!zzb.equals(zzb)) {
      return false;
    }
    return zzd.equals(zzd);
  }
  
  public final int hashCode()
  {
    int i = zzb.hashCode();
    long l = zzc;
    int j = (int)(l ^ l >>> 32);
    return zzd.hashCode() + (i * 31 + j) * 31;
  }
  
  public final String toString()
  {
    String str1 = zzb;
    long l = zzc;
    String str2 = String.valueOf(zzd);
    StringBuilder localStringBuilder = new StringBuilder("Event{name='");
    localStringBuilder.append(str1);
    localStringBuilder.append("', timestamp=");
    localStringBuilder.append(l);
    localStringBuilder.append(", params=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final long zza()
  {
    return zzc;
  }
  
  public final Object zza(String paramString)
  {
    if (zzd.containsKey(paramString)) {
      return zzd.get(paramString);
    }
    return null;
  }
  
  public final void zza(String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      zzd.remove(paramString);
      return;
    }
    paramObject = zza(paramString, zzd.get(paramString), paramObject);
    zzd.put(paramString, paramObject);
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final void zzb(String paramString)
  {
    zzb = paramString;
  }
  
  public final Map<String, Object> zzc()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
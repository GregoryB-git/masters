package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzap
  implements zzak, zzaq
{
  private final Map<String, zzaq> zza = new HashMap();
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzap)) {
      return false;
    }
    paramObject = (zzap)paramObject;
    return zza.equals(zza);
  }
  
  public int hashCode()
  {
    return zza.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    if (!zza.isEmpty())
    {
      Iterator localIterator = zza.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(String.format("%s: %s,", new Object[] { str, zza.get(str) }));
      }
      localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(","));
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final zzaq zza(String paramString)
  {
    if (zza.containsKey(paramString)) {
      return (zzaq)zza.get(paramString);
    }
    return zzaq.zzc;
  }
  
  public zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    if ("toString".equals(paramString)) {
      return new zzas(toString());
    }
    return zzan.zza(this, new zzas(paramString), paramzzh, paramList);
  }
  
  public final List<String> zza()
  {
    return new ArrayList(zza.keySet());
  }
  
  public final void zza(String paramString, zzaq paramzzaq)
  {
    if (paramzzaq == null)
    {
      zza.remove(paramString);
      return;
    }
    zza.put(paramString, paramzzaq);
  }
  
  public final zzaq zzc()
  {
    zzap localzzap = new zzap();
    Iterator localIterator = zza.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      Map localMap;
      String str;
      if ((((Map.Entry)localObject).getValue() instanceof zzak))
      {
        localMap = zza;
        str = (String)((Map.Entry)localObject).getKey();
        localObject = (zzaq)((Map.Entry)localObject).getValue();
      }
      else
      {
        localMap = zza;
        str = (String)((Map.Entry)localObject).getKey();
        localObject = ((zzaq)((Map.Entry)localObject).getValue()).zzc();
      }
      localMap.put(str, localObject);
    }
    return localzzap;
  }
  
  public final boolean zzc(String paramString)
  {
    return zza.containsKey(paramString);
  }
  
  public final Boolean zzd()
  {
    return Boolean.TRUE;
  }
  
  public final Double zze()
  {
    return Double.valueOf(NaN.0D);
  }
  
  public final String zzf()
  {
    return "[object Object]";
  }
  
  public final Iterator<zzaq> zzh()
  {
    return zzan.zza(zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
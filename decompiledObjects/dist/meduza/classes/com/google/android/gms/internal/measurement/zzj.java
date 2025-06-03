package com.google.android.gms.internal.measurement;

import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzj
{
  public static zzaq zza(zzgr.zzd paramzzd)
  {
    if (paramzzd == null) {
      return zzaq.zzc;
    }
    int i = zzi.zza[paramzzd.zzb().ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5) {
              throw new IllegalStateException(f.j("Invalid entity: ", String.valueOf(paramzzd)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
          }
          Object localObject = paramzzd.zzf();
          ArrayList localArrayList = new ArrayList();
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localArrayList.add(zza((zzgr.zzd)((Iterator)localObject).next()));
          }
          return new zzat(paramzzd.zzd(), localArrayList);
        }
        if (paramzzd.zzh()) {
          return new zzag(Boolean.valueOf(paramzzd.zzg()));
        }
        return new zzag(null);
      }
      if (paramzzd.zzi()) {
        return new zzai(Double.valueOf(paramzzd.zza()));
      }
      return new zzai(null);
    }
    if (paramzzd.zzj()) {
      return new zzas(paramzzd.zze());
    }
    return zzaq.zzj;
  }
  
  public static zzaq zza(Object paramObject)
  {
    if (paramObject == null) {
      return zzaq.zzd;
    }
    if ((paramObject instanceof String)) {
      return new zzas((String)paramObject);
    }
    if ((paramObject instanceof Double)) {
      return new zzai((Double)paramObject);
    }
    if ((paramObject instanceof Long)) {
      return new zzai(Double.valueOf(((Long)paramObject).doubleValue()));
    }
    if ((paramObject instanceof Integer)) {
      return new zzai(Double.valueOf(((Integer)paramObject).doubleValue()));
    }
    if ((paramObject instanceof Boolean)) {
      return new zzag((Boolean)paramObject);
    }
    Object localObject;
    if ((paramObject instanceof Map))
    {
      zzap localzzap = new zzap();
      Map localMap = (Map)paramObject;
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = localIterator.next();
        zzaq localzzaq = zza(localMap.get(localObject));
        if (localObject != null)
        {
          paramObject = localObject;
          if (!(localObject instanceof String)) {
            paramObject = localObject.toString();
          }
          localzzap.zza((String)paramObject, localzzaq);
        }
      }
      return localzzap;
    }
    if ((paramObject instanceof List))
    {
      localObject = new zzaf();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        ((zzaf)localObject).zza(zza(((Iterator)paramObject).next()));
      }
      return (zzaq)localObject;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
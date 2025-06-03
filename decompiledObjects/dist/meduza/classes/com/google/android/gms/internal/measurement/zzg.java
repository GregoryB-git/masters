package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzg
{
  public static double zza(double paramDouble)
  {
    if (Double.isNaN(paramDouble)) {
      return 0.0D;
    }
    double d = paramDouble;
    if (!Double.isInfinite(paramDouble))
    {
      boolean bool = paramDouble < 0.0D;
      d = paramDouble;
      if (bool) {
        if (paramDouble == 0.0D)
        {
          d = paramDouble;
        }
        else
        {
          int i;
          if (bool) {
            bool = true;
          } else {
            i = -1;
          }
          d = i;
          d = Math.floor(Math.abs(paramDouble)) * d;
        }
      }
    }
    return d;
  }
  
  public static int zza(zzh paramzzh)
  {
    int i = zzb(paramzzh.zza("runtime.counter").zze().doubleValue() + 1.0D);
    if (i <= 1000000)
    {
      paramzzh.zzc("runtime.counter", new zzai(Double.valueOf(i)));
      return i;
    }
    throw new IllegalStateException("Instructions allowed exceeded");
  }
  
  public static zzbv zza(String paramString)
  {
    zzbv localzzbv;
    if ((paramString != null) && (!paramString.isEmpty())) {
      localzzbv = zzbv.zza(Integer.parseInt(paramString));
    } else {
      localzzbv = null;
    }
    if (localzzbv != null) {
      return localzzbv;
    }
    throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[] { paramString }));
  }
  
  public static Object zza(zzaq paramzzaq)
  {
    if (zzaq.zzd.equals(paramzzaq)) {
      return null;
    }
    if (zzaq.zzc.equals(paramzzaq)) {
      return "";
    }
    if ((paramzzaq instanceof zzap)) {
      return zza((zzap)paramzzaq);
    }
    if ((paramzzaq instanceof zzaf))
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = ((zzaf)paramzzaq).iterator();
      while (localIterator.hasNext())
      {
        paramzzaq = zza((zzaq)localIterator.next());
        if (paramzzaq != null) {
          localArrayList.add(paramzzaq);
        }
      }
      return localArrayList;
    }
    if (!paramzzaq.zze().isNaN()) {
      return paramzzaq.zze();
    }
    return paramzzaq.zzf();
  }
  
  public static Map<String, Object> zza(zzap paramzzap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramzzap.zza().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = zza(paramzzap.zza(str));
      if (localObject != null) {
        localHashMap.put(str, localObject);
      }
    }
    return localHashMap;
  }
  
  public static void zza(zzbv paramzzbv, int paramInt, List<zzaq> paramList)
  {
    zza(paramzzbv.name(), paramInt, paramList);
  }
  
  public static void zza(String paramString, int paramInt, List<zzaq> paramList)
  {
    if (paramList.size() == paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
  
  public static boolean zza(zzaq paramzzaq1, zzaq paramzzaq2)
  {
    if (!paramzzaq1.getClass().equals(paramzzaq2.getClass())) {
      return false;
    }
    if ((!(paramzzaq1 instanceof zzax)) && (!(paramzzaq1 instanceof zzao)))
    {
      if ((paramzzaq1 instanceof zzai))
      {
        if ((!Double.isNaN(paramzzaq1.zze().doubleValue())) && (!Double.isNaN(paramzzaq2.zze().doubleValue()))) {
          return paramzzaq1.zze().equals(paramzzaq2.zze());
        }
        return false;
      }
      if ((paramzzaq1 instanceof zzas)) {
        return paramzzaq1.zzf().equals(paramzzaq2.zzf());
      }
      if ((paramzzaq1 instanceof zzag)) {
        return paramzzaq1.zzd().equals(paramzzaq2.zzd());
      }
      return paramzzaq1 == paramzzaq2;
    }
    return true;
  }
  
  public static int zzb(double paramDouble)
  {
    if ((!Double.isNaN(paramDouble)) && (!Double.isInfinite(paramDouble)))
    {
      boolean bool = paramDouble < 0.0D;
      if (bool)
      {
        int i;
        if (bool) {
          bool = true;
        } else {
          i = -1;
        }
        double d = i;
        return (int)(Math.floor(Math.abs(paramDouble)) * d % 4.294967296E9D);
      }
    }
    return 0;
  }
  
  public static void zzb(zzbv paramzzbv, int paramInt, List<zzaq> paramList)
  {
    zzb(paramzzbv.name(), paramInt, paramList);
  }
  
  public static void zzb(String paramString, int paramInt, List<zzaq> paramList)
  {
    if (paramList.size() >= paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
  
  public static boolean zzb(zzaq paramzzaq)
  {
    if (paramzzaq == null) {
      return false;
    }
    paramzzaq = paramzzaq.zze();
    return (!paramzzaq.isNaN()) && (paramzzaq.doubleValue() >= 0.0D) && (paramzzaq.equals(Double.valueOf(Math.floor(paramzzaq.doubleValue()))));
  }
  
  public static long zzc(double paramDouble)
  {
    return zzb(paramDouble) & 0xFFFFFFFF;
  }
  
  public static void zzc(String paramString, int paramInt, List<zzaq> paramList)
  {
    if (paramList.size() <= paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
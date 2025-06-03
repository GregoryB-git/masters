package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzjp
  implements zznl
{
  private final zzjn zza;
  
  private zzjp(zzjn paramzzjn)
  {
    paramzzjn = (zzjn)zzkj.zza(paramzzjn, "output");
    zza = paramzzjn;
    zza = this;
  }
  
  public static zzjp zza(zzjn paramzzjn)
  {
    zzjp localzzjp = zza;
    if (localzzjp != null) {
      return localzzjp;
    }
    return new zzjp(paramzzjn);
  }
  
  public final int zza()
  {
    return 1;
  }
  
  @Deprecated
  public final void zza(int paramInt)
  {
    zza.zzj(paramInt, 4);
  }
  
  public final void zza(int paramInt, double paramDouble)
  {
    zza.zzb(paramInt, paramDouble);
  }
  
  public final void zza(int paramInt, float paramFloat)
  {
    zza.zzb(paramInt, paramFloat);
  }
  
  public final void zza(int paramInt1, int paramInt2)
  {
    zza.zzh(paramInt1, paramInt2);
  }
  
  public final void zza(int paramInt, long paramLong)
  {
    zza.zzf(paramInt, paramLong);
  }
  
  public final void zza(int paramInt, zziy paramzziy)
  {
    zza.zzc(paramInt, paramzziy);
  }
  
  public final <K, V> void zza(int paramInt, zzlh<K, V> paramzzlh, Map<K, V> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      zza.zzj(paramInt, 2);
      zza.zzk(zzle.zza(paramzzlh, paramMap.getKey(), paramMap.getValue()));
      zzle.zza(zza, paramzzlh, paramMap.getKey(), paramMap.getValue());
    }
  }
  
  public final void zza(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof zziy))
    {
      zza.zzd(paramInt, (zziy)paramObject);
      return;
    }
    zza.zzb(paramInt, (zzlm)paramObject);
  }
  
  public final void zza(int paramInt, Object paramObject, zzme paramzzme)
  {
    zzjn localzzjn = zza;
    paramObject = (zzlm)paramObject;
    localzzjn.zzj(paramInt, 3);
    paramzzme.zza(paramObject, zza);
    localzzjn.zzj(paramInt, 4);
  }
  
  public final void zza(int paramInt, String paramString)
  {
    zza.zzb(paramInt, paramString);
  }
  
  public final void zza(int paramInt, List<zziy> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zza.zzc(paramInt, (zziy)paramList.get(i));
    }
  }
  
  public final void zza(int paramInt, List<?> paramList, zzme paramzzme)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zza(paramInt, paramList.get(i), paramzzme);
    }
  }
  
  public final void zza(int paramInt, List<Boolean> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zziw;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zziw)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zza(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzb(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzb(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zza(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzb(((Boolean)paramList.get(paramInt)).booleanValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzb(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void zza(int paramInt, boolean paramBoolean)
  {
    zza.zzb(paramInt, paramBoolean);
  }
  
  @Deprecated
  public final void zzb(int paramInt)
  {
    zza.zzj(paramInt, 3);
  }
  
  public final void zzb(int paramInt1, int paramInt2)
  {
    zza.zzg(paramInt1, paramInt2);
  }
  
  public final void zzb(int paramInt, long paramLong)
  {
    zza.zzh(paramInt, paramLong);
  }
  
  public final void zzb(int paramInt, Object paramObject, zzme paramzzme)
  {
    zza.zzc(paramInt, (zzlm)paramObject, paramzzme);
  }
  
  public final void zzb(int paramInt, List<String> paramList)
  {
    boolean bool = paramList instanceof zzkx;
    int i = 0;
    int j = 0;
    if (bool)
    {
      zzkx localzzkx = (zzkx)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localzzkx.zza(i);
        if ((localObject instanceof String)) {
          zza.zzb(paramInt, (String)localObject);
        } else {
          zza.zzc(paramInt, (zziy)localObject);
        }
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzb(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void zzb(int paramInt, List<?> paramList, zzme paramzzme)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zzb(paramInt, paramList.get(i), paramzzme);
    }
  }
  
  public final void zzb(int paramInt, List<Double> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzjs;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzjs)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zza(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzb(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzb(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zza(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzb(((Double)paramList.get(paramInt)).doubleValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzb(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public final void zzc(int paramInt1, int paramInt2)
  {
    zza.zzh(paramInt1, paramInt2);
  }
  
  public final void zzc(int paramInt, long paramLong)
  {
    zza.zzf(paramInt, paramLong);
  }
  
  public final void zzc(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zza(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzi(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzh(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zza(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzi(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzh(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzd(int paramInt1, int paramInt2)
  {
    zza.zzg(paramInt1, paramInt2);
  }
  
  public final void zzd(int paramInt, long paramLong)
  {
    zza.zzg(paramInt, paramLong);
  }
  
  public final void zzd(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzjn.zzb(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzk(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzh(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzg(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += zzjn.zzb(((Integer)paramList.get(i)).intValue());
        i++;
      }
      zza.zzk(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzh(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzg(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zze(int paramInt1, int paramInt2)
  {
    zza.zzi(paramInt1, paramInt2);
  }
  
  public final void zze(int paramInt, long paramLong)
  {
    zza.zzh(paramInt, paramLong);
  }
  
  public final void zze(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzlb;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzlb)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzjn.zza(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzk(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzf(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzf(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zza(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzf(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzf(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzf(int paramInt1, int paramInt2)
  {
    zza.zzk(paramInt1, paramInt2);
  }
  
  public final void zzf(int paramInt, List<Float> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkc;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkc)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zza(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzb(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzb(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zza(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzb(((Float)paramList.get(paramInt)).floatValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzb(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public final void zzg(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zzc(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzi(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzh(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zzc(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzi(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzh(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzh(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzlb;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzlb)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzjn.zzb(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzk(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzh(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzh(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += zzjn.zzb(((Long)paramList.get(i)).longValue());
        i++;
      }
      zza.zzk(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzh(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzh(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzi(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zzd(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzh(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzg(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += zzjn.zzd(((Integer)paramList.get(i)).intValue());
        i++;
      }
      zza.zzk(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzh(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzg(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzj(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzlb;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzlb)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzjn.zzc(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzk(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzf(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzf(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zzc(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzf(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzf(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzk(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzjn.zze(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzk(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzj(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzi(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zze(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzj(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzi(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzl(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzlb;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzlb)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zzd(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzg(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzg(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += zzjn.zzd(((Long)paramList.get(i)).longValue());
        i++;
      }
      zza.zzk(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzg(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzg(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzm(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzkh;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzkh)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zzg(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzk(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzk(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zzg(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzk(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzk(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzn(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzlb;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzlb)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzjn.zze(paramList.zzb(i));
          i++;
        }
        zza.zzk(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzh(paramList.zzb(paramInt));
        }
        return;
      }
      while (i < paramList.size())
      {
        zza.zzh(paramInt, paramList.zzb(i));
        i++;
      }
      return;
    }
    i = k;
    if (paramBoolean)
    {
      zza.zzj(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzjn.zze(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzk(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzh(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      zza.zzh(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
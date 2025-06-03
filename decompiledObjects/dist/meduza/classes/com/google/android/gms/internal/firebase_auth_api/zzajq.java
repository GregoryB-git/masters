package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzanm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzajq
  implements zzanm
{
  private final com.google.android.gms.internal.firebase-auth-api.zzajo zza;
  
  private zzajq(com.google.android.gms.internal.firebase-auth-api.zzajo paramzzajo)
  {
    paramzzajo = (zzajo)zzaki.zza(paramzzajo, "output");
    zza = paramzzajo;
    zza = this;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzajq zza(com.google.android.gms.internal.firebase-auth-api.zzajo paramzzajo)
  {
    com.google.android.gms.internal.firebase-auth-api.zzajq localzzajq = zza;
    if (localzzajq != null) {
      return localzzajq;
    }
    return new zzajq(paramzzajo);
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
  
  public final void zza(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    zza.zzc(paramInt, paramzzaiw);
  }
  
  public final <K, V> void zza(int paramInt, zzale<K, V> paramzzale, Map<K, V> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      zza.zzj(paramInt, 2);
      zza.zzl(zzalf.zza(paramzzale, paramMap.getKey(), paramMap.getValue()));
      zzalf.zza(zza, paramzzale, paramMap.getKey(), paramMap.getValue());
    }
  }
  
  public final void zza(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof zzaiw))
    {
      zza.zzd(paramInt, (zzaiw)paramObject);
      return;
    }
    zza.zzb(paramInt, (zzaln)paramObject);
  }
  
  public final void zza(int paramInt, Object paramObject, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    com.google.android.gms.internal.firebase-auth-api.zzajo localzzajo = zza;
    paramObject = (zzaln)paramObject;
    localzzajo.zzj(paramInt, 3);
    paramzzamc.zza(paramObject, zza);
    localzzajo.zzj(paramInt, 4);
  }
  
  public final void zza(int paramInt, String paramString)
  {
    zza.zzb(paramInt, paramString);
  }
  
  public final void zza(int paramInt, List<zzaiw> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zza.zzc(paramInt, (zzaiw)paramList.get(i));
    }
  }
  
  public final void zza(int paramInt, List<?> paramList, zzamc paramzzamc)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zza(paramInt, paramList.get(i), paramzzamc);
    }
  }
  
  public final void zza(int paramInt, List<Boolean> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzaiu;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaiu)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zza(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
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
        i += zzajo.zza(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      }
      zza.zzl(i);
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
  
  public final void zzb(int paramInt, Object paramObject, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    zza.zzc(paramInt, (zzaln)paramObject, paramzzamc);
  }
  
  public final void zzb(int paramInt, List<String> paramList)
  {
    boolean bool = paramList instanceof zzaku;
    int i = 0;
    int j = 0;
    if (bool)
    {
      zzaku localzzaku = (zzaku)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localzzaku.zza(i);
        if ((localObject instanceof String)) {
          zza.zzb(paramInt, (String)localObject);
        } else {
          zza.zzc(paramInt, (zzaiw)localObject);
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
  
  public final void zzb(int paramInt, List<?> paramList, zzamc paramzzamc)
  {
    for (int i = 0; i < paramList.size(); i++) {
      zzb(paramInt, paramList.get(i), paramzzamc);
    }
  }
  
  public final void zzb(int paramInt, List<Double> paramList, boolean paramBoolean)
  {
    boolean bool = paramList instanceof zzajt;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzajt)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zza(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
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
        i += zzajo.zza(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zza(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzj(paramList.zzb(paramInt));
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
        i += zzajo.zza(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzl(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzj(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zzb(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzi(paramList.zzb(paramInt));
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
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzajo.zzb(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzl(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzi(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzaky;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaky)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zza(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
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
        i += zzajo.zza(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzake;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzake)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zza(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
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
        i += zzajo.zza(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zzc(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzj(paramList.zzb(paramInt));
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
        paramInt += zzajo.zzc(((Integer)paramList.get(i)).intValue());
        i++;
      }
      zza.zzl(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzj(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzaky;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaky)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zzb(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
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
        i += zzajo.zzb(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zze(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzi(paramList.zzb(paramInt));
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
        paramInt += zzajo.zze(((Integer)paramList.get(i)).intValue());
        i++;
      }
      zza.zzl(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzi(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzaky;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaky)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zzc(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
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
        i += zzajo.zzc(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zzf(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzk(paramList.zzb(paramInt));
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
        i += zzajo.zzf(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      zza.zzl(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzk(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzaky;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaky)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += zzajo.zzd(paramList.zzb(paramInt));
          paramInt++;
        }
        zza.zzl(i);
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
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += zzajo.zzd(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzl(i);
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
    boolean bool = paramList instanceof zzakj;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzakj)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zzh(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
        for (paramInt = m; paramInt < paramList.size(); paramInt++) {
          zza.zzl(paramList.zzb(paramInt));
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += zzajo.zzh(((Integer)paramList.get(i)).intValue());
        i++;
      }
      zza.zzl(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        zza.zzl(((Integer)paramList.get(paramInt)).intValue());
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
    boolean bool = paramList instanceof zzaky;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      paramList = (zzaky)paramList;
      if (paramBoolean)
      {
        zza.zzj(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          paramInt += zzajo.zze(paramList.zzb(i));
          i++;
        }
        zza.zzl(paramInt);
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
        i += zzajo.zze(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      zza.zzl(i);
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
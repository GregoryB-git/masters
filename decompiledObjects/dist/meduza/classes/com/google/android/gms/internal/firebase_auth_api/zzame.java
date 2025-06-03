package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzakg;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzame
{
  private static final zzamv<?, ?> zza = new zzamx();
  
  public static int zza(int paramInt, Object paramObject, zzamc<?> paramzzamc)
  {
    if ((paramObject instanceof zzakv)) {
      return zzajo.zzb(paramInt, (zzakv)paramObject);
    }
    return zzajo.zzb(paramInt, (zzaln)paramObject, paramzzamc);
  }
  
  public static int zza(int paramInt, List<zzaiw> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = zzajo.zzg(paramInt) * i;
    while (j < paramList.size())
    {
      paramInt += zzajo.zza((zzaiw)paramList.get(j));
      j++;
    }
    return paramInt;
  }
  
  public static int zza(int paramInt, List<zzaln> paramList, zzamc<?> paramzzamc)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += zzajo.zza(paramInt, (zzaln)paramList.get(j), paramzzamc);
      j++;
    }
    return k;
  }
  
  public static int zza(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzajo.zza(paramInt, true) * i;
  }
  
  public static int zza(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static zzamv<?, ?> zza()
  {
    return zza;
  }
  
  public static <UT, UB> UB zza(Object paramObject, int paramInt1, int paramInt2, UB paramUB, zzamv<UT, UB> paramzzamv)
  {
    Object localObject = paramUB;
    if (paramUB == null) {
      localObject = paramzzamv.zzc(paramObject);
    }
    paramzzamv.zzb(localObject, paramInt1, paramInt2);
    return (UB)localObject;
  }
  
  public static <UT, UB> UB zza(Object paramObject, int paramInt, List<Integer> paramList, zzakk paramzzakk, UB paramUB, zzamv<UT, UB> paramzzamv)
  {
    if (paramzzakk == null) {
      return paramUB;
    }
    int j;
    UB ?;
    if ((paramList instanceof RandomAccess))
    {
      int i = paramList.size();
      j = 0;
      int k = 0;
      while (j < i)
      {
        int m = ((Integer)paramList.get(j)).intValue();
        if (paramzzakk.zza(m))
        {
          if (j != k) {
            paramList.set(k, Integer.valueOf(m));
          }
          k++;
        }
        else
        {
          paramUB = zza(paramObject, paramInt, m, paramUB, paramzzamv);
        }
        j++;
      }
      ? = paramUB;
      if (k != i)
      {
        paramList.subList(k, i).clear();
        ? = paramUB;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        ? = paramUB;
        if (!paramList.hasNext()) {
          break;
        }
        j = ((Integer)paramList.next()).intValue();
        if (!paramzzakk.zza(j))
        {
          paramUB = zza(paramObject, paramInt, j, paramUB, paramzzamv);
          paramList.remove();
        }
      }
    }
    return ?;
  }
  
  public static void zza(int paramInt, List<zzaiw> paramList, zzanm paramzzanm)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zza(paramInt, paramList);
    }
  }
  
  public static void zza(int paramInt, List<?> paramList, zzanm paramzzanm, zzamc<?> paramzzamc)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zza(paramInt, paramList, paramzzamc);
    }
  }
  
  public static void zza(int paramInt, List<Boolean> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zza(paramInt, paramList, paramBoolean);
    }
  }
  
  public static <T, FT extends zzaka<FT>> void zza(zzajx<FT> paramzzajx, T paramT1, T paramT2)
  {
    paramT2 = paramzzajx.zza(paramT2);
    if (!zza.isEmpty()) {
      paramzzajx.zzb(paramT1).zza(paramT2);
    }
  }
  
  public static <T> void zza(zzalg paramzzalg, T paramT1, T paramT2, long paramLong)
  {
    zzana.zza(paramT1, paramLong, paramzzalg.zza(zzana.zze(paramT1, paramLong), zzana.zze(paramT2, paramLong)));
  }
  
  public static <T, UT, UB> void zza(zzamv<UT, UB> paramzzamv, T paramT1, T paramT2)
  {
    paramzzamv.zzc(paramT1, paramzzamv.zza(paramzzamv.zzd(paramT1), paramzzamv.zzd(paramT2)));
  }
  
  public static void zza(Class<?> paramClass)
  {
    zzakg.class.isAssignableFrom(paramClass);
  }
  
  public static boolean zza(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int zzb(int paramInt, List<?> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    int m = zzajo.zzg(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof zzaku))
    {
      localObject = (zzaku)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((zzaku)localObject).zza(j);
        if ((paramList instanceof zzaiw)) {
          m = zzajo.zza((zzaiw)paramList);
        } else {
          m = zzajo.zza((String)paramList);
        }
        paramInt = m + paramInt;
      }
    }
    for (;;)
    {
      m = paramInt;
      if (j >= i) {
        break;
      }
      localObject = paramList.get(j);
      if ((localObject instanceof zzaiw)) {
        m = zzajo.zza((zzaiw)localObject);
      } else {
        m = zzajo.zza((String)localObject);
      }
      paramInt = m + paramInt;
      j++;
    }
    return m;
  }
  
  public static int zzb(int paramInt, List<?> paramList, zzamc<?> paramzzamc)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = zzajo.zzg(paramInt) * i;
    for (paramInt = j; paramInt < i; paramInt++)
    {
      Object localObject = paramList.get(paramInt);
      if ((localObject instanceof zzakv)) {
        j = zzajo.zza((zzakv)localObject);
      } else {
        j = zzajo.zza((zzaln)localObject, paramzzamc);
      }
      k = j + k;
    }
    return k;
  }
  
  public static int zzb(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzb(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zzb(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzakj))
    {
      paramList = (zzakj)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zza(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zza(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzb(int paramInt, List<String> paramList, zzanm paramzzanm)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzb(paramInt, paramList);
    }
  }
  
  public static void zzb(int paramInt, List<?> paramList, zzanm paramzzanm, zzamc<?> paramzzamc)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzb(paramInt, paramList, paramzzamc);
    }
  }
  
  public static void zzb(int paramInt, List<Double> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzb(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzc(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzajo.zzb(paramInt, 0) * i;
  }
  
  public static int zzc(List<?> paramList)
  {
    return paramList.size() << 2;
  }
  
  public static void zzc(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzc(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzd(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzajo.zza(paramInt, 0L) * i;
  }
  
  public static int zzd(List<?> paramList)
  {
    return paramList.size() << 3;
  }
  
  public static void zzd(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzd(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zze(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zze(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zze(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzakj))
    {
      paramList = (zzakj)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zzc(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zzc(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zze(int paramInt, List<Long> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zze(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzf(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    int i = zzf(paramList);
    int j = paramList.size();
    return zzajo.zzg(paramInt) * j + i;
  }
  
  public static int zzf(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzaky))
    {
      paramList = (zzaky)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zzb(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zzb(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzf(int paramInt, List<Float> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzf(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzg(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzg(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zzg(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzakj))
    {
      paramList = (zzakj)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zzf(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zzf(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzg(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzg(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzh(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzh(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zzh(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzaky))
    {
      paramList = (zzaky)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zzd(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zzd(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzh(int paramInt, List<Long> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzh(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzi(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzi(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zzi(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzakj))
    {
      paramList = (zzakj)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zzh(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zzh(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzi(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzi(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzj(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzj(paramList);
    return zzajo.zzg(paramInt) * i + j;
  }
  
  public static int zzj(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzaky))
    {
      paramList = (zzaky)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzajo.zze(paramList.zzb(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += zzajo.zze(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzj(int paramInt, List<Long> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzj(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzk(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzk(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzl(int paramInt, List<Long> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzl(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzm(int paramInt, List<Integer> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzm(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzn(int paramInt, List<Long> paramList, zzanm paramzzanm, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzanm.zzn(paramInt, paramList, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
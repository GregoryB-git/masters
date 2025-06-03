package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzmg
{
  private static final zzmu<?, ?> zza = new zzmw();
  
  public static int zza(int paramInt, Object paramObject, zzme<?> paramzzme)
  {
    if ((paramObject instanceof zzku)) {
      return zzjn.zzb(paramInt, (zzku)paramObject);
    }
    return zzjn.zzb(paramInt, (zzlm)paramObject, paramzzme);
  }
  
  public static int zza(int paramInt, List<zziy> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i = zzjn.zzf(paramInt) * i;
    for (paramInt = j; paramInt < paramList.size(); paramInt++) {
      i += zzjn.zza((zziy)paramList.get(paramInt));
    }
    return i;
  }
  
  public static int zza(int paramInt, List<zzlm> paramList, zzme<?> paramzzme)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += zzjn.zza(paramInt, (zzlm)paramList.get(j), paramzzme);
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
    return zzjn.zza(paramInt, true) * i;
  }
  
  public static int zza(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static zzmu<?, ?> zza()
  {
    return zza;
  }
  
  public static <UT, UB> UB zza(Object paramObject, int paramInt1, int paramInt2, UB paramUB, zzmu<UT, UB> paramzzmu)
  {
    Object localObject = paramUB;
    if (paramUB == null) {
      localObject = paramzzmu.zzc(paramObject);
    }
    paramzzmu.zzb(localObject, paramInt1, paramInt2);
    return (UB)localObject;
  }
  
  public static <UT, UB> UB zza(Object paramObject, int paramInt, List<Integer> paramList, zzkl paramzzkl, UB paramUB, zzmu<UT, UB> paramzzmu)
  {
    if (paramzzkl == null) {
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
        if (paramzzkl.zza(m))
        {
          if (j != k) {
            paramList.set(k, Integer.valueOf(m));
          }
          k++;
        }
        else
        {
          paramUB = zza(paramObject, paramInt, m, paramUB, paramzzmu);
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
        if (!paramzzkl.zza(j))
        {
          paramUB = zza(paramObject, paramInt, j, paramUB, paramzzmu);
          paramList.remove();
        }
      }
    }
    return ?;
  }
  
  public static void zza(int paramInt, List<zziy> paramList, zznl paramzznl)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zza(paramInt, paramList);
    }
  }
  
  public static void zza(int paramInt, List<?> paramList, zznl paramzznl, zzme<?> paramzzme)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zza(paramInt, paramList, paramzzme);
    }
  }
  
  public static void zza(int paramInt, List<Boolean> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zza(paramInt, paramList, paramBoolean);
    }
  }
  
  public static <T, FT extends zzjy<FT>> void zza(zzjv<FT> paramzzjv, T paramT1, T paramT2)
  {
    paramT2 = paramzzjv.zza(paramT2);
    if (!zza.isEmpty()) {
      paramzzjv.zzb(paramT1).zza(paramT2);
    }
  }
  
  public static <T> void zza(zzlj paramzzlj, T paramT1, T paramT2, long paramLong)
  {
    zzmz.zza(paramT1, paramLong, paramzzlj.zza(zzmz.zze(paramT1, paramLong), zzmz.zze(paramT2, paramLong)));
  }
  
  public static <T, UT, UB> void zza(zzmu<UT, UB> paramzzmu, T paramT1, T paramT2)
  {
    paramzzmu.zzc(paramT1, paramzzmu.zza(paramzzmu.zzd(paramT1), paramzzmu.zzd(paramT2)));
  }
  
  public static void zza(Class<?> paramClass)
  {
    zzkg.class.isAssignableFrom(paramClass);
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
    int m = zzjn.zzf(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof zzkx))
    {
      localObject = (zzkx)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((zzkx)localObject).zza(j);
        if ((paramList instanceof zziy)) {
          m = zzjn.zza((zziy)paramList);
        } else {
          m = zzjn.zza((String)paramList);
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
      if ((localObject instanceof zziy)) {
        m = zzjn.zza((zziy)localObject);
      } else {
        m = zzjn.zza((String)localObject);
      }
      paramInt = m + paramInt;
      j++;
    }
    return m;
  }
  
  public static int zzb(int paramInt, List<?> paramList, zzme<?> paramzzme)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = zzjn.zzf(paramInt) * i;
    while (j < i)
    {
      Object localObject = paramList.get(j);
      int k;
      if ((localObject instanceof zzku)) {
        k = zzjn.zza((zzku)localObject);
      } else {
        k = zzjn.zza((zzlm)localObject, paramzzme);
      }
      paramInt = k + paramInt;
      j++;
    }
    return paramInt;
  }
  
  public static int zzb(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzb(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zzb(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zza(paramList.zzb(k));
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
      m += zzjn.zza(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzb(int paramInt, List<String> paramList, zznl paramzznl)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzb(paramInt, paramList);
    }
  }
  
  public static void zzb(int paramInt, List<?> paramList, zznl paramzznl, zzme<?> paramzzme)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzb(paramInt, paramList, paramzzme);
    }
  }
  
  public static void zzb(int paramInt, List<Double> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzb(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzc(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzjn.zzb(paramInt, 0) * i;
  }
  
  public static int zzc(List<?> paramList)
  {
    return paramList.size() << 2;
  }
  
  public static void zzc(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzc(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzd(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzjn.zza(paramInt, 0L) * i;
  }
  
  public static int zzd(List<?> paramList)
  {
    return paramList.size() << 3;
  }
  
  public static void zzd(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzd(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zze(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zze(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zze(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zzc(paramList.zzb(k));
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
      m += zzjn.zzc(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zze(int paramInt, List<Long> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zze(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzf(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    int i = zzf(paramList);
    int j = paramList.size();
    return zzjn.zzf(paramInt) * j + i;
  }
  
  public static int zzf(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zzb(paramList.zzb(k));
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
      m += zzjn.zzb(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzf(int paramInt, List<Float> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzf(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzg(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzg(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zzg(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zze(paramList.zzb(k));
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
      m += zzjn.zze(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzg(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzg(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzh(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzh(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zzh(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zzd(paramList.zzb(k));
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
      m += zzjn.zzd(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzh(int paramInt, List<Long> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzh(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzi(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzi(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zzi(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zzg(paramList.zzb(k));
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
      m += zzjn.zzg(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzi(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzi(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int zzj(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = zzj(paramList);
    return zzjn.zzf(paramInt) * i + j;
  }
  
  public static int zzj(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzjn.zze(paramList.zzb(k));
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
      m += zzjn.zze(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzj(int paramInt, List<Long> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzj(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzk(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzk(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzl(int paramInt, List<Long> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzl(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzm(int paramInt, List<Integer> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzm(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzn(int paramInt, List<Long> paramList, zznl paramzznl, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzznl.zzn(paramInt, paramList, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
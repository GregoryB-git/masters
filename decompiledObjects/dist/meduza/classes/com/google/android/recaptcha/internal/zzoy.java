package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzoy
{
  private static final zzpl zzb = new zzpn();
  
  static
  {
    int i = zzos.zza;
  }
  
  public static void zzA(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzA(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzB(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzC(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzC(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzE(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzD(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzJ(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzE(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzL(paramInt, paramList, paramBoolean);
    }
  }
  
  public static boolean zzF(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public static int zza(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzln.zzB(paramList.zze(k));
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
      m += zzln.zzB(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int zzb(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return (zzln.zzA(paramInt << 3) + 4) * i;
  }
  
  public static int zzc(List paramList)
  {
    return paramList.size() * 4;
  }
  
  public static int zzd(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return (zzln.zzA(paramInt << 3) + 8) * i;
  }
  
  public static int zze(List paramList)
  {
    return paramList.size() * 8;
  }
  
  public static int zzf(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzln.zzB(paramList.zze(k));
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
      m += zzln.zzB(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int zzg(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzln.zzB(paramList.zze(k));
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
      m += zzln.zzB(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static int zzh(int paramInt, Object paramObject, zzow paramzzow)
  {
    paramInt <<= 3;
    if ((paramObject instanceof zznt))
    {
      paramObject = (zznt)paramObject;
      paramInt = zzln.zzA(paramInt);
      int i = ((zznt)paramObject).zza();
      return zzln.zzA(i) + i + paramInt;
    }
    paramObject = (zzoi)paramObject;
    paramInt = zzln.zzA(paramInt);
    return zzln.zzy((zzoi)paramObject, paramzzow) + paramInt;
  }
  
  public static int zzi(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        j = paramList.zze(k);
        m += zzln.zzA(j >> 31 ^ j + j);
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
      j = ((Integer)paramList.get(k)).intValue();
      m += zzln.zzA(j >> 31 ^ j + j);
    }
    return j;
  }
  
  public static int zzj(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    long l;
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        l = paramList.zze(k);
        m += zzln.zzB(l >> 63 ^ l + l);
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
      l = ((Long)paramList.get(k)).longValue();
      m += zzln.zzB(l >> 63 ^ l + l);
    }
    return j;
  }
  
  public static int zzk(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzln.zzA(paramList.zze(k));
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
      m += zzln.zzA(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int zzl(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += zzln.zzB(paramList.zze(k));
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
      m += zzln.zzB(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static zzpl zzm()
  {
    return zzb;
  }
  
  public static Object zzn(Object paramObject1, int paramInt, List paramList, zznh paramzznh, Object paramObject2, zzpl paramzzpl)
  {
    if (paramzznh == null) {
      return paramObject2;
    }
    int j;
    Object localObject;
    if ((paramList instanceof RandomAccess))
    {
      int i = paramList.size();
      j = 0;
      int k = 0;
      while (j < i)
      {
        int m = ((Integer)paramList.get(j)).intValue();
        if (paramzznh.zza(m))
        {
          if (j != k) {
            paramList.set(k, Integer.valueOf(m));
          }
          k++;
        }
        else
        {
          paramObject2 = zzo(paramObject1, paramInt, m, paramObject2, paramzzpl);
        }
        j++;
      }
      localObject = paramObject2;
      if (k != i)
      {
        paramList.subList(k, i).clear();
        return paramObject2;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        localObject = paramObject2;
        if (!paramList.hasNext()) {
          break;
        }
        j = ((Integer)paramList.next()).intValue();
        if (!paramzznh.zza(j))
        {
          paramObject2 = zzo(paramObject1, paramInt, j, paramObject2, paramzzpl);
          paramList.remove();
        }
      }
    }
    return localObject;
  }
  
  public static Object zzo(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, zzpl paramzzpl)
  {
    Object localObject = paramObject2;
    if (paramObject2 == null) {
      localObject = paramzzpl.zza(paramObject1);
    }
    paramzzpl.zzh(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  public static void zzp(zzmp paramzzmp, Object paramObject1, Object paramObject2)
  {
    paramzzmp = zzb;
    if (!zza.isEmpty()) {
      ((zzna)paramObject1).zzi().zzh(paramzzmp);
    }
  }
  
  public static void zzq(zzpl paramzzpl, Object paramObject1, Object paramObject2)
  {
    zznd localzznd = (zznd)paramObject1;
    paramObject1 = zzc;
    paramObject2 = zzc;
    paramzzpl = (zzpl)paramObject1;
    if (!zzpm.zzc().equals(paramObject2)) {
      if (zzpm.zzc().equals(paramObject1))
      {
        paramzzpl = zzpm.zze((zzpm)paramObject1, (zzpm)paramObject2);
      }
      else
      {
        ((zzpm)paramObject1).zzd((zzpm)paramObject2);
        paramzzpl = (zzpl)paramObject1;
      }
    }
    zzc = paramzzpl;
  }
  
  public static void zzr(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzc(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzs(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzg(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzt(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzj(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzu(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzl(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzv(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzn(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzw(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzp(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzx(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzs(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzy(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzu(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzz(int paramInt, List paramList, zzpy paramzzpy, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzpy.zzy(paramInt, paramList, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzoy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
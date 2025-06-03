package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class zzjl
  implements zzmf
{
  private final zzjk zza;
  private int zzb;
  private int zzc;
  private int zzd = 0;
  
  private zzjl(zzjk paramzzjk)
  {
    paramzzjk = (zzjk)zzkj.zza(paramzzjk, "input");
    zza = paramzzjk;
    zzc = this;
  }
  
  public static zzjl zza(zzjk paramzzjk)
  {
    zzjl localzzjl = zzc;
    if (localzzjl != null) {
      return localzzjl;
    }
    return new zzjl(paramzzjk);
  }
  
  private final <T> T zza(zzme<T> paramzzme, zzjt paramzzjt)
  {
    Object localObject = paramzzme.zza();
    zzc(localObject, paramzzme, paramzzjt);
    paramzzme.zzd(localObject);
    return (T)localObject;
  }
  
  private final Object zza(zzng paramzzng, Class<?> paramClass, zzjt paramzzjt)
  {
    switch (zzjo.zza[paramzzng.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("unsupported field type.");
    case 17: 
      return Long.valueOf(zzo());
    case 16: 
      return Integer.valueOf(zzj());
    case 15: 
      return zzr();
    case 14: 
      return Long.valueOf(zzn());
    case 13: 
      return Integer.valueOf(zzi());
    case 12: 
      return Long.valueOf(zzm());
    case 11: 
      return Integer.valueOf(zzh());
    case 10: 
      zzb(2);
      return zzb(zzma.zza().zza(paramClass), paramzzjt);
    case 9: 
      return Long.valueOf(zzl());
    case 8: 
      return Integer.valueOf(zzg());
    case 7: 
      return Float.valueOf(zzb());
    case 6: 
      return Long.valueOf(zzk());
    case 5: 
      return Integer.valueOf(zzf());
    case 4: 
      return Integer.valueOf(zze());
    case 3: 
      return Double.valueOf(zza());
    case 2: 
      return zzp();
    }
    return Boolean.valueOf(zzs());
  }
  
  private final void zza(int paramInt)
  {
    if (zza.zzc() == paramInt) {
      return;
    }
    throw zzkp.zzi();
  }
  
  private final void zza(List<String> paramList, boolean paramBoolean)
  {
    if ((zzb & 0x7) == 2)
    {
      int i;
      if (((paramList instanceof zzkx)) && (!paramBoolean))
      {
        paramList = (zzkx)paramList;
        do
        {
          paramList.zza(zzp());
          if (zza.zzt()) {
            return;
          }
          i = zza.zzi();
        } while (i == zzb);
        zzd = i;
        return;
      }
      do
      {
        String str;
        if (paramBoolean) {
          str = zzr();
        } else {
          str = zzq();
        }
        paramList.add(str);
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    throw zzkp.zza();
  }
  
  private final <T> T zzb(zzme<T> paramzzme, zzjt paramzzjt)
  {
    Object localObject = paramzzme.zza();
    zzd(localObject, paramzzme, paramzzjt);
    paramzzme.zzd(localObject);
    return (T)localObject;
  }
  
  private final void zzb(int paramInt)
  {
    if ((zzb & 0x7) == paramInt) {
      return;
    }
    throw zzkp.zza();
  }
  
  private static void zzc(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw zzkp.zzg();
  }
  
  private final <T> void zzc(T paramT, zzme<T> paramzzme, zzjt paramzzjt)
  {
    int i = zzc;
    zzc = (zzb >>> 3 << 3 | 0x4);
    try
    {
      paramzzme.zza(paramT, this, paramzzjt);
      int j = zzb;
      int k = zzc;
      if (j == k) {
        return;
      }
      throw zzkp.zzg();
    }
    finally
    {
      zzc = i;
    }
  }
  
  private static void zzd(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw zzkp.zzg();
  }
  
  private final <T> void zzd(T paramT, zzme<T> paramzzme, zzjt paramzzjt)
  {
    int i = zza.zzj();
    zza.zzv();
    i = zza.zza(i);
    zzjk localzzjk = zza;
    zza += 1;
    paramzzme.zza(paramT, this, paramzzjt);
    zza.zzb(0);
    paramT = zza;
    zza -= 1;
    paramT.zzc(i);
  }
  
  public final double zza()
  {
    zzb(1);
    return zza.zza();
  }
  
  public final <T> void zza(T paramT, zzme<T> paramzzme, zzjt paramzzjt)
  {
    zzb(3);
    zzc(paramT, paramzzme, paramzzjt);
  }
  
  public final void zza(List<Boolean> paramList)
  {
    if ((paramList instanceof zziw))
    {
      paramList = (zziw)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zza(zza.zzu());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzu());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Boolean.valueOf(zza.zzu()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Boolean.valueOf(zza.zzu()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  @Deprecated
  public final <T> void zza(List<T> paramList, zzme<T> paramzzme, zzjt paramzzjt)
  {
    int i = zzb;
    if ((i & 0x7) == 3)
    {
      int j;
      do
      {
        paramList.add(zza(paramzzme, paramzzjt));
        if ((zza.zzt()) || (zzd != 0)) {
          break;
        }
        j = zza.zzi();
      } while (j == i);
      zzd = j;
      return;
    }
    throw zzkp.zza();
  }
  
  public final <K, V> void zza(Map<K, V> paramMap, zzlh<K, V> paramzzlh, zzjt paramzzjt)
  {
    zzb(2);
    int i = zza.zzj();
    i = zza.zza(i);
    Object localObject1 = zzb;
    Object localObject2 = zzd;
    try
    {
      do
      {
        for (;;)
        {
          int j = zzc();
          if (j == Integer.MAX_VALUE) {
            break;
          }
          boolean bool = zza.zzt();
          if (bool) {
            break;
          }
          if ((j == 1) || (j != 2)) {}
          try
          {
            if (zzt()) {
              continue;
            }
            localObject3 = new com/google/android/gms/internal/measurement/zzkp;
            ((zzkp)localObject3).<init>("Unable to parse map entry.");
            throw ((Throwable)localObject3);
          }
          catch (zzko localzzko) {}
          Object localObject3 = zza(zzc, zzd.getClass(), paramzzjt);
          localObject2 = localObject3;
          continue;
          localObject3 = zza(zza, null, null);
          localObject1 = localObject3;
        }
      } while (zzt());
      paramMap = new com/google/android/gms/internal/measurement/zzkp;
      paramMap.<init>("Unable to parse map entry.");
      throw paramMap;
      paramMap.put(localObject1, localObject2);
      return;
    }
    finally
    {
      zza.zzc(i);
    }
  }
  
  public final float zzb()
  {
    zzb(5);
    return zza.zzb();
  }
  
  public final <T> void zzb(T paramT, zzme<T> paramzzme, zzjt paramzzjt)
  {
    zzb(2);
    zzd(paramT, paramzzme, paramzzjt);
  }
  
  public final void zzb(List<zziy> paramList)
  {
    if ((zzb & 0x7) == 2)
    {
      int i;
      do
      {
        paramList.add(zzp());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    throw zzkp.zza();
  }
  
  public final <T> void zzb(List<T> paramList, zzme<T> paramzzme, zzjt paramzzjt)
  {
    int i = zzb;
    if ((i & 0x7) == 2)
    {
      int j;
      do
      {
        paramList.add(zzb(paramzzme, paramzzjt));
        if ((zza.zzt()) || (zzd != 0)) {
          break;
        }
        j = zza.zzi();
      } while (j == i);
      zzd = j;
      return;
    }
    throw zzkp.zza();
  }
  
  public final int zzc()
  {
    int i = zzd;
    if (i != 0)
    {
      zzb = i;
      zzd = 0;
    }
    else
    {
      zzb = zza.zzi();
    }
    i = zzb;
    if ((i != 0) && (i != zzc)) {
      return i >>> 3;
    }
    return Integer.MAX_VALUE;
  }
  
  public final void zzc(List<Double> paramList)
  {
    int j;
    if ((paramList instanceof zzjs))
    {
      paramList = (zzjs)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = zza.zzj();
          zzd(i);
          j = zza.zzc();
          do
          {
            paramList.zza(zza.zza());
          } while (zza.zzc() < j + i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zza());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 1)
    {
      if (i == 2)
      {
        j = zza.zzj();
        zzd(j);
        i = zza.zzc();
        do
        {
          paramList.add(Double.valueOf(zza.zza()));
        } while (zza.zzc() < i + j);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Double.valueOf(zza.zza()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final int zzd()
  {
    return zzb;
  }
  
  public final void zzd(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zzd(zza.zzd());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zzd(zza.zzd());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Integer.valueOf(zza.zzd()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(zza.zzd()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final int zze()
  {
    zzb(0);
    return zza.zzd();
  }
  
  public final void zze(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zzd(zza.zze());
            if (zza.zzt()) {
              return;
            }
            i = zza.zzi();
          } while (i == zzb);
          zzd = i;
          return;
        }
        throw zzkp.zza();
      }
      i = zza.zzj();
      zzc(i);
      j = zza.zzc();
      do
      {
        paramList.zzd(zza.zze());
      } while (zza.zzc() < j + i);
      return;
    }
    int i = zzb & 0x7;
    if (i != 2)
    {
      if (i == 5)
      {
        do
        {
          paramList.add(Integer.valueOf(zza.zze()));
          if (zza.zzt()) {
            return;
          }
          i = zza.zzi();
        } while (i == zzb);
        zzd = i;
        return;
      }
      throw zzkp.zza();
    }
    i = zza.zzj();
    zzc(i);
    int j = zza.zzc();
    do
    {
      paramList.add(Integer.valueOf(zza.zze()));
    } while (zza.zzc() < j + i);
  }
  
  public final int zzf()
  {
    zzb(5);
    return zza.zze();
  }
  
  public final void zzf(List<Long> paramList)
  {
    int j;
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = zza.zzj();
          zzd(i);
          j = zza.zzc();
          do
          {
            paramList.zza(zza.zzk());
          } while (zza.zzc() < j + i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzk());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 1)
    {
      if (i == 2)
      {
        j = zza.zzj();
        zzd(j);
        i = zza.zzc();
        do
        {
          paramList.add(Long.valueOf(zza.zzk()));
        } while (zza.zzc() < i + j);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Long.valueOf(zza.zzk()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final int zzg()
  {
    zzb(0);
    return zza.zzf();
  }
  
  public final void zzg(List<Float> paramList)
  {
    if ((paramList instanceof zzkc))
    {
      paramList = (zzkc)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zza(zza.zzb());
            if (zza.zzt()) {
              return;
            }
            i = zza.zzi();
          } while (i == zzb);
          zzd = i;
          return;
        }
        throw zzkp.zza();
      }
      i = zza.zzj();
      zzc(i);
      j = zza.zzc();
      do
      {
        paramList.zza(zza.zzb());
      } while (zza.zzc() < j + i);
      return;
    }
    int i = zzb & 0x7;
    if (i != 2)
    {
      if (i == 5)
      {
        do
        {
          paramList.add(Float.valueOf(zza.zzb()));
          if (zza.zzt()) {
            return;
          }
          i = zza.zzi();
        } while (i == zzb);
        zzd = i;
        return;
      }
      throw zzkp.zza();
    }
    i = zza.zzj();
    zzc(i);
    int j = zza.zzc();
    do
    {
      paramList.add(Float.valueOf(zza.zzb()));
    } while (zza.zzc() < j + i);
  }
  
  public final int zzh()
  {
    zzb(5);
    return zza.zzg();
  }
  
  public final void zzh(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zzd(zza.zzf());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zzd(zza.zzf());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Integer.valueOf(zza.zzf()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(zza.zzf()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final int zzi()
  {
    zzb(0);
    return zza.zzh();
  }
  
  public final void zzi(List<Long> paramList)
  {
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zza(zza.zzl());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzl());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Long.valueOf(zza.zzl()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Long.valueOf(zza.zzl()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final int zzj()
  {
    zzb(0);
    return zza.zzj();
  }
  
  public final void zzj(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zzd(zza.zzg());
            if (zza.zzt()) {
              return;
            }
            i = zza.zzi();
          } while (i == zzb);
          zzd = i;
          return;
        }
        throw zzkp.zza();
      }
      i = zza.zzj();
      zzc(i);
      j = zza.zzc();
      do
      {
        paramList.zzd(zza.zzg());
      } while (zza.zzc() < j + i);
      return;
    }
    int i = zzb & 0x7;
    if (i != 2)
    {
      if (i == 5)
      {
        do
        {
          paramList.add(Integer.valueOf(zza.zzg()));
          if (zza.zzt()) {
            return;
          }
          i = zza.zzi();
        } while (i == zzb);
        zzd = i;
        return;
      }
      throw zzkp.zza();
    }
    int j = zza.zzj();
    zzc(j);
    i = zza.zzc();
    do
    {
      paramList.add(Integer.valueOf(zza.zzg()));
    } while (zza.zzc() < i + j);
  }
  
  public final long zzk()
  {
    zzb(1);
    return zza.zzk();
  }
  
  public final void zzk(List<Long> paramList)
  {
    int j;
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = zza.zzj();
          zzd(i);
          j = zza.zzc();
          do
          {
            paramList.zza(zza.zzn());
          } while (zza.zzc() < j + i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzn());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 1)
    {
      if (i == 2)
      {
        j = zza.zzj();
        zzd(j);
        i = zza.zzc();
        do
        {
          paramList.add(Long.valueOf(zza.zzn()));
        } while (zza.zzc() < i + j);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Long.valueOf(zza.zzn()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final long zzl()
  {
    zzb(0);
    return zza.zzl();
  }
  
  public final void zzl(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zzd(zza.zzh());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zzd(zza.zzh());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Integer.valueOf(zza.zzh()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(zza.zzh()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final long zzm()
  {
    zzb(1);
    return zza.zzn();
  }
  
  public final void zzm(List<Long> paramList)
  {
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zza(zza.zzo());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzo());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Long.valueOf(zza.zzo()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Long.valueOf(zza.zzo()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final long zzn()
  {
    zzb(0);
    return zza.zzo();
  }
  
  public final void zzn(List<String> paramList)
  {
    zza(paramList, false);
  }
  
  public final long zzo()
  {
    zzb(0);
    return zza.zzp();
  }
  
  public final void zzo(List<String> paramList)
  {
    zza(paramList, true);
  }
  
  public final zziy zzp()
  {
    zzb(2);
    return zza.zzq();
  }
  
  public final void zzp(List<Integer> paramList)
  {
    if ((paramList instanceof zzkh))
    {
      paramList = (zzkh)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zzd(zza.zzj());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zzd(zza.zzj());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Integer.valueOf(zza.zzj()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(zza.zzj()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final String zzq()
  {
    zzb(2);
    return zza.zzr();
  }
  
  public final void zzq(List<Long> paramList)
  {
    if ((paramList instanceof zzlb))
    {
      paramList = (zzlb)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = zza.zzj();
          i = zza.zzc() + i;
          do
          {
            paramList.zza(zza.zzp());
          } while (zza.zzc() < i);
          zza(i);
          return;
        }
        throw zzkp.zza();
      }
      do
      {
        paramList.zza(zza.zzp());
        if (zza.zzt()) {
          return;
        }
        i = zza.zzi();
      } while (i == zzb);
      zzd = i;
      return;
    }
    int i = zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = zza.zzj();
        i = zza.zzc() + i;
        do
        {
          paramList.add(Long.valueOf(zza.zzp()));
        } while (zza.zzc() < i);
        zza(i);
        return;
      }
      throw zzkp.zza();
    }
    do
    {
      paramList.add(Long.valueOf(zza.zzp()));
      if (zza.zzt()) {
        return;
      }
      i = zza.zzi();
    } while (i == zzb);
    zzd = i;
  }
  
  public final String zzr()
  {
    zzb(2);
    return zza.zzs();
  }
  
  public final boolean zzs()
  {
    zzb(0);
    return zza.zzu();
  }
  
  public final boolean zzt()
  {
    if (!zza.zzt())
    {
      int i = zzb;
      if (i != zzc) {
        return zza.zzd(i);
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
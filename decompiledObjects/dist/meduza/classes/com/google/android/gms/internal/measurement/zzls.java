package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzls<T>
  implements zzme<T>
{
  private final zzlm zza;
  private final zzmu<?, ?> zzb;
  private final boolean zzc;
  private final zzjv<?> zzd;
  
  private zzls(zzmu<?, ?> paramzzmu, zzjv<?> paramzzjv, zzlm paramzzlm)
  {
    zzb = paramzzmu;
    zzc = paramzzjv.zza(paramzzlm);
    zzd = paramzzjv;
    zza = paramzzlm;
  }
  
  public static <T> zzls<T> zza(zzmu<?, ?> paramzzmu, zzjv<?> paramzzjv, zzlm paramzzlm)
  {
    return new zzls(paramzzmu, paramzzjv, paramzzlm);
  }
  
  public final int zza(T paramT)
  {
    zzmu localzzmu = zzb;
    int i = localzzmu.zzb(localzzmu.zzd(paramT)) + 0;
    int j = i;
    if (zzc) {
      j = i + zzd.zza(paramT).zza();
    }
    return j;
  }
  
  public final T zza()
  {
    zzlm localzzlm = zza;
    if ((localzzlm instanceof zzkg)) {
      return ((zzkg)localzzlm).zzci();
    }
    return localzzlm.zzcm().zzak();
  }
  
  public final void zza(T paramT, zzmf paramzzmf, zzjt paramzzjt)
  {
    zzmu localzzmu = zzb;
    zzjv localzzjv = zzd;
    Object localObject1 = localzzmu.zzc(paramT);
    zzjw localzzjw = localzzjv.zzb(paramT);
    try
    {
      boolean bool;
      label249:
      do
      {
        int i = paramzzmf.zzc();
        if (i == Integer.MAX_VALUE) {
          return;
        }
        int j = paramzzmf.zzd();
        i = 0;
        Object localObject2;
        if (j != 11)
        {
          if ((j & 0x7) == 2)
          {
            localObject2 = localzzjv.zza(paramzzjt, zza, j >>> 3);
            if (localObject2 != null)
            {
              localzzjv.zza(paramzzmf, localObject2, paramzzjt, localzzjw);
            }
            else
            {
              bool = localzzmu.zza(localObject1, paramzzmf, 0);
              continue;
            }
          }
          else
          {
            bool = paramzzmf.zzt();
            continue;
          }
        }
        else
        {
          Object localObject3 = null;
          localObject2 = null;
          do
          {
            for (;;)
            {
              if (paramzzmf.zzc() == Integer.MAX_VALUE) {
                break label249;
              }
              j = paramzzmf.zzd();
              if (j == 16)
              {
                i = paramzzmf.zzj();
                localObject3 = localzzjv.zza(paramzzjt, zza, i);
              }
              else
              {
                if (j != 26) {
                  break;
                }
                if (localObject3 != null) {
                  localzzjv.zza(paramzzmf, localObject3, paramzzjt, localzzjw);
                } else {
                  localObject2 = paramzzmf.zzp();
                }
              }
            }
          } while ((j != 12) && (paramzzmf.zzt()));
          if (paramzzmf.zzd() != 12) {
            break;
          }
          if (localObject2 != null) {
            if (localObject3 != null) {
              localzzjv.zza((zziy)localObject2, localObject3, paramzzjt, localzzjw);
            } else {
              localzzmu.zza(localObject1, i, (zziy)localObject2);
            }
          }
        }
        bool = true;
      } while (bool);
      return;
      throw zzkp.zzb();
    }
    finally
    {
      localzzmu.zzb(paramT, localObject1);
    }
  }
  
  public final void zza(T paramT, zznl paramzznl)
  {
    Iterator localIterator = zzd.zza(paramT).zzd();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localObject = (zzjy)localEntry.getKey();
      if ((((zzjy)localObject).zzc() == zznj.zzi) && (!((zzjy)localObject).zze()) && (!((zzjy)localObject).zzd()))
      {
        boolean bool = localEntry instanceof zzkt;
        int i = ((zzjy)localObject).zza();
        if (bool) {
          localObject = ((zzkt)localEntry).zza().zzb();
        } else {
          localObject = localEntry.getValue();
        }
        paramzznl.zza(i, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = zzb;
    ((zzmu)localObject).zza(((zzmu)localObject).zzd(paramT), paramzznl);
  }
  
  public final void zza(T paramT1, T paramT2)
  {
    zzmg.zza(zzb, paramT1, paramT2);
    if (zzc) {
      zzmg.zza(zzd, paramT1, paramT2);
    }
  }
  
  public final void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzit paramzzit)
  {
    zzkg localzzkg = (zzkg)paramT;
    Object localObject1 = zzb;
    Object localObject2 = localObject1;
    if (localObject1 == zzmx.zzc())
    {
      localObject2 = zzmx.zzd();
      zzb = ((zzmx)localObject2);
    }
    ((zzkg.zzb)paramT).zza();
    paramT = null;
    while (paramInt1 < paramInt2)
    {
      paramInt1 = zziu.zzc(paramArrayOfByte, paramInt1, paramzzit);
      int i = zza;
      if (i != 11)
      {
        if ((i & 0x7) == 2)
        {
          paramT = (zzkg.zzd)zzd.zza(zzd, zza, i >>> 3);
          if (paramT == null)
          {
            paramInt1 = zziu.zza(i, paramArrayOfByte, paramInt1, paramInt2, (zzmx)localObject2, paramzzit);
          }
          else
          {
            zzma.zza();
            throw new NoSuchMethodError();
          }
        }
        else
        {
          paramInt1 = zziu.zza(i, paramArrayOfByte, paramInt1, paramInt2, paramzzit);
        }
      }
      else
      {
        int j = 0;
        localObject1 = null;
        for (;;)
        {
          i = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          paramInt1 = zziu.zzc(paramArrayOfByte, paramInt1, paramzzit);
          int k = zza;
          int m = k >>> 3;
          i = k & 0x7;
          if (m != 2)
          {
            if (m == 3) {
              if (paramT == null)
              {
                if (i == 2)
                {
                  paramInt1 = zziu.zza(paramArrayOfByte, paramInt1, paramzzit);
                  localObject1 = (zziy)zzc;
                }
              }
              else
              {
                zzma.zza();
                throw new NoSuchMethodError();
              }
            }
          }
          else if (i == 0)
          {
            paramInt1 = zziu.zzc(paramArrayOfByte, paramInt1, paramzzit);
            j = zza;
            paramT = (zzkg.zzd)zzd.zza(zzd, zza, j);
            continue;
          }
          i = paramInt1;
          if (k == 12) {
            break;
          }
          paramInt1 = zziu.zza(k, paramArrayOfByte, paramInt1, paramInt2, paramzzit);
        }
        if (localObject1 != null) {
          ((zzmx)localObject2).zza(j << 3 | 0x2, localObject1);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw zzkp.zzg();
  }
  
  public final int zzb(T paramT)
  {
    int i = zzb.zzd(paramT).hashCode();
    int j = i;
    if (zzc) {
      j = i * 53 + zzd.zza(paramT).hashCode();
    }
    return j;
  }
  
  public final boolean zzb(T paramT1, T paramT2)
  {
    if (!zzb.zzd(paramT1).equals(zzb.zzd(paramT2))) {
      return false;
    }
    if (zzc) {
      return zzd.zza(paramT1).equals(zzd.zza(paramT2));
    }
    return true;
  }
  
  public final void zzd(T paramT)
  {
    zzb.zzf(paramT);
    zzd.zzc(paramT);
  }
  
  public final boolean zze(T paramT)
  {
    return zzd.zza(paramT).zzg();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzls
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
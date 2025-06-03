package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzom
  implements zzow
{
  private final zzoi zza;
  private final zzpl zzb;
  private final boolean zzc;
  private final zzmp zzd;
  
  private zzom(zzpl paramzzpl, zzmp paramzzmp, zzoi paramzzoi)
  {
    zzb = paramzzpl;
    zzc = (paramzzoi instanceof zzna);
    zzd = paramzzmp;
    zza = paramzzoi;
  }
  
  public static zzom zzc(zzpl paramzzpl, zzmp paramzzmp, zzoi paramzzoi)
  {
    return new zzom(paramzzpl, paramzzmp, paramzzoi);
  }
  
  public final int zza(Object paramObject)
  {
    int i = zzc.zzb();
    int j = i;
    if (zzc) {
      j = i + zzb.zzb();
    }
    return j;
  }
  
  public final int zzb(Object paramObject)
  {
    int i = zzc.hashCode();
    int j = i;
    if (zzc) {
      j = i * 53 + zzb.zza.hashCode();
    }
    return j;
  }
  
  public final Object zze()
  {
    zzoi localzzoi = zza;
    if ((localzzoi instanceof zznd)) {
      return ((zznd)localzzoi).zzv();
    }
    return localzzoi.zzad().zzl();
  }
  
  public final void zzf(Object paramObject)
  {
    zzb.zzi(paramObject);
    zzd.zza(paramObject);
  }
  
  public final void zzg(Object paramObject1, Object paramObject2)
  {
    zzoy.zzq(zzb, paramObject1, paramObject2);
    if (zzc) {
      zzoy.zzp(zzd, paramObject1, paramObject2);
    }
  }
  
  public final void zzh(Object paramObject, zzov paramzzov, zzmo paramzzmo)
  {
    zzpl localzzpl = zzb;
    Object localObject1 = localzzpl.zza(paramObject);
    ((zzna)paramObject).zzi();
    try
    {
      for (;;)
      {
        int i;
        int j;
        if (paramzzov.zzc() != Integer.MAX_VALUE)
        {
          i = paramzzov.zzd();
          j = 0;
          if (i != 11)
          {
            boolean bool;
            if ((i & 0x7) == 2)
            {
              if (paramzzmo.zza(zza, i >>> 3) == null) {
                bool = localzzpl.zzk(localObject1, paramzzov, 0);
              } else {
                throw null;
              }
            }
            else {
              bool = paramzzov.zzO();
            }
            if (bool) {
              continue;
            }
          }
        }
        else
        {
          return;
        }
        zznc localzznc = null;
        Object localObject2 = localzznc;
        label203:
        do
        {
          for (;;)
          {
            if (paramzzov.zzc() == Integer.MAX_VALUE) {
              break label212;
            }
            i = paramzzov.zzd();
            if (i == 16)
            {
              j = paramzzov.zzj();
              localzznc = paramzzmo.zza(zza, j);
            }
            else
            {
              if (i != 26) {
                break label203;
              }
              if (localzznc != null) {
                break;
              }
              localObject2 = paramzzov.zzp();
            }
          }
          throw null;
        } while (paramzzov.zzO());
        label212:
        if (paramzzov.zzd() != 12) {
          break label249;
        }
        if (localObject2 != null)
        {
          if (localzznc != null) {
            break;
          }
          localzzpl.zzg(localObject1, j, (zzle)localObject2);
        }
      }
      throw null;
      label249:
      paramzzov = new com/google/android/recaptcha/internal/zznn;
      paramzzov.<init>("Protocol message end-group tag did not match expected tag.");
      throw paramzzov;
    }
    finally
    {
      localzzpl.zzj(paramObject, localObject1);
    }
  }
  
  public final void zzi(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzkt paramzzkt)
  {
    zznd localzznd = (zznd)paramObject;
    Object localObject1 = zzc;
    Object localObject2 = localObject1;
    if (localObject1 == zzpm.zzc())
    {
      localObject2 = zzpm.zzf();
      zzc = ((zzpm)localObject2);
    }
    ((zzna)paramObject).zzi();
    paramObject = null;
    while (paramInt1 < paramInt2)
    {
      paramInt1 = zzku.zzi(paramArrayOfByte, paramInt1, paramzzkt);
      int i = zza;
      if (i != 11)
      {
        if ((i & 0x7) == 2)
        {
          paramObject = zzd.zza(zza, i >>> 3);
          if (paramObject == null)
          {
            paramInt1 = zzku.zzh(i, paramArrayOfByte, paramInt1, paramInt2, (zzpm)localObject2, paramzzkt);
          }
          else
          {
            paramInt1 = zzos.zza;
            throw null;
          }
        }
        else
        {
          paramInt1 = zzku.zzo(i, paramArrayOfByte, paramInt1, paramInt2, paramzzkt);
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
          paramInt1 = zzku.zzi(paramArrayOfByte, paramInt1, paramzzkt);
          int k = zza;
          i = k >>> 3;
          int m = k & 0x7;
          if (i != 2)
          {
            if (i == 3) {
              if (paramObject == null)
              {
                if (m == 2)
                {
                  paramInt1 = zzku.zza(paramArrayOfByte, paramInt1, paramzzkt);
                  localObject1 = (zzle)zzc;
                }
              }
              else
              {
                paramInt1 = zzos.zza;
                throw null;
              }
            }
          }
          else if (m == 0)
          {
            paramInt1 = zzku.zzi(paramArrayOfByte, paramInt1, paramzzkt);
            j = zza;
            paramObject = zzd.zza(zza, j);
            continue;
          }
          i = paramInt1;
          if (k == 12) {
            break;
          }
          paramInt1 = zzku.zzo(k, paramArrayOfByte, paramInt1, paramInt2, paramzzkt);
        }
        if (localObject1 != null) {
          ((zzpm)localObject2).zzj(j << 3 | 0x2, localObject1);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw new zznn("Failed to parse the message.");
  }
  
  public final void zzj(Object paramObject, zzpy paramzzpy)
  {
    Iterator localIterator = zzb.zzf();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      zzms localzzms = (zzms)((Map.Entry)localObject).getKey();
      if (localzzms.zze() == zzpx.zzi)
      {
        localzzms.zzg();
        localzzms.zzf();
        boolean bool = localObject instanceof zznp;
        int i = localzzms.zza();
        if (bool) {
          localObject = ((zznp)localObject).zza().zzb();
        } else {
          localObject = ((Map.Entry)localObject).getValue();
        }
        paramzzpy.zzw(i, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    zzc.zzk(paramzzpy);
  }
  
  public final boolean zzk(Object paramObject1, Object paramObject2)
  {
    if (!zzc.equals(zzc)) {
      return false;
    }
    if (zzc) {
      return zzb.equals(zzb);
    }
    return true;
  }
  
  public final boolean zzl(Object paramObject)
  {
    return zzb.zzk();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzom
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
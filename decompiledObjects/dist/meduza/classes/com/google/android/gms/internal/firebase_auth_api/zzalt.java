package com.google.android.gms.internal.firebase_auth_api;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzalt<T>
  implements zzamc<T>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzaln zza;
  private final zzamv<?, ?> zzb;
  private final boolean zzc;
  private final zzajx<?> zzd;
  
  private zzalt(zzamv<?, ?> paramzzamv, zzajx<?> paramzzajx, zzaln paramzzaln)
  {
    zzb = paramzzamv;
    zzc = paramzzajx.zza(paramzzaln);
    zzd = paramzzajx;
    zza = paramzzaln;
  }
  
  public static <T> zzalt<T> zza(zzamv<?, ?> paramzzamv, zzajx<?> paramzzajx, zzaln paramzzaln)
  {
    return new zzalt(paramzzamv, paramzzajx, paramzzaln);
  }
  
  public final int zza(T paramT)
  {
    com.google.android.gms.internal.firebase-auth-api.zzamv localzzamv = zzb;
    int i = localzzamv.zzb(localzzamv.zzd(paramT)) + 0;
    int j = i;
    if (zzc) {
      j = i + zzd.zza(paramT).zza();
    }
    return j;
  }
  
  public final T zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzaln localzzaln = zza;
    if ((localzzaln instanceof zzakg)) {
      return ((zzakg)localzzaln).zzo();
    }
    return localzzaln.zzq().zzf();
  }
  
  public final void zza(T paramT, zzamd paramzzamd, zzajv paramzzajv)
  {
    com.google.android.gms.internal.firebase-auth-api.zzamv localzzamv = zzb;
    com.google.android.gms.internal.firebase-auth-api.zzajx localzzajx = zzd;
    Object localObject1 = localzzamv.zzc(paramT);
    com.google.android.gms.internal.firebase-auth-api.zzajy localzzajy = localzzajx.zzb(paramT);
    try
    {
      boolean bool;
      label249:
      do
      {
        int i = paramzzamd.zzc();
        if (i == Integer.MAX_VALUE) {
          return;
        }
        int j = paramzzamd.zzd();
        i = 0;
        Object localObject2;
        if (j != 11)
        {
          if ((j & 0x7) == 2)
          {
            localObject2 = localzzajx.zza(paramzzajv, zza, j >>> 3);
            if (localObject2 != null)
            {
              localzzajx.zza(paramzzamd, localObject2, paramzzajv, localzzajy);
            }
            else
            {
              bool = localzzamv.zza(localObject1, paramzzamd, 0);
              continue;
            }
          }
          else
          {
            bool = paramzzamd.zzt();
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
              if (paramzzamd.zzc() == Integer.MAX_VALUE) {
                break label249;
              }
              j = paramzzamd.zzd();
              if (j == 16)
              {
                i = paramzzamd.zzj();
                localObject3 = localzzajx.zza(paramzzajv, zza, i);
              }
              else
              {
                if (j != 26) {
                  break;
                }
                if (localObject3 != null) {
                  localzzajx.zza(paramzzamd, localObject3, paramzzajv, localzzajy);
                } else {
                  localObject2 = paramzzamd.zzp();
                }
              }
            }
          } while ((j != 12) && (paramzzamd.zzt()));
          if (paramzzamd.zzd() != 12) {
            break;
          }
          if (localObject2 != null) {
            if (localObject3 != null) {
              localzzajx.zza((com.google.android.gms.internal.firebase-auth-api.zzaiw)localObject2, localObject3, paramzzajv, localzzajy);
            } else {
              localzzamv.zza(localObject1, i, (com.google.android.gms.internal.firebase-auth-api.zzaiw)localObject2);
            }
          }
        }
        bool = true;
      } while (bool);
      return;
      throw zzakm.zzb();
    }
    finally
    {
      localzzamv.zzb(paramT, localObject1);
    }
  }
  
  public final void zza(T paramT, zzanm paramzzanm)
  {
    Iterator localIterator = zzd.zza(paramT).zzd();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localObject = (zzaka)localEntry.getKey();
      if ((((zzaka)localObject).zzc() == zzank.zzi) && (!((zzaka)localObject).zze()) && (!((zzaka)localObject).zzd()))
      {
        boolean bool = localEntry instanceof zzakq;
        int i = ((zzaka)localObject).zza();
        if (bool) {
          localObject = ((zzakq)localEntry).zza().zzb();
        } else {
          localObject = localEntry.getValue();
        }
        paramzzanm.zza(i, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = zzb;
    ((zzamv)localObject).zza(((zzamv)localObject).zzd(paramT), paramzzanm);
  }
  
  public final void zza(T paramT1, T paramT2)
  {
    zzame.zza(zzb, paramT1, paramT2);
    if (zzc) {
      zzame.zza(zzd, paramT1, paramT2);
    }
  }
  
  public final void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzaiv paramzzaiv)
  {
    zzakg localzzakg = (zzakg)paramT;
    Object localObject1 = zzb;
    Object localObject2 = localObject1;
    if (localObject1 == zzamy.zzc())
    {
      localObject2 = zzamy.zzd();
      zzb = ((com.google.android.gms.internal.firebase-auth-api.zzamy)localObject2);
    }
    ((zzakg.zzd)paramT).zza();
    paramT = null;
    while (paramInt1 < paramInt2)
    {
      paramInt1 = zzais.zzc(paramArrayOfByte, paramInt1, paramzzaiv);
      int i = zza;
      if (i != 11)
      {
        if ((i & 0x7) == 2)
        {
          paramT = (zzakg.zzf)zzd.zza(zzd, zza, i >>> 3);
          if (paramT == null)
          {
            paramInt1 = zzais.zza(i, paramArrayOfByte, paramInt1, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzamy)localObject2, paramzzaiv);
          }
          else
          {
            zzaly.zza();
            throw new NoSuchMethodError();
          }
        }
        else
        {
          paramInt1 = zzais.zza(i, paramArrayOfByte, paramInt1, paramInt2, paramzzaiv);
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
          paramInt1 = zzais.zzc(paramArrayOfByte, paramInt1, paramzzaiv);
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
                  paramInt1 = zzais.zza(paramArrayOfByte, paramInt1, paramzzaiv);
                  localObject1 = (zzaiw)zzc;
                }
              }
              else
              {
                zzaly.zza();
                throw new NoSuchMethodError();
              }
            }
          }
          else if (i == 0)
          {
            paramInt1 = zzais.zzc(paramArrayOfByte, paramInt1, paramzzaiv);
            j = zza;
            paramT = (zzakg.zzf)zzd.zza(zzd, zza, j);
            continue;
          }
          i = paramInt1;
          if (k == 12) {
            break;
          }
          paramInt1 = zzais.zza(k, paramArrayOfByte, paramInt1, paramInt2, paramzzaiv);
        }
        if (localObject1 != null) {
          ((zzamy)localObject2).zza(j << 3 | 0x2, localObject1);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw zzakm.zzg();
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
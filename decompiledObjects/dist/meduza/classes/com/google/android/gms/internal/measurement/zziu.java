package com.google.android.gms.internal.measurement;

import java.util.List;

final class zziu
{
  private static volatile int zza = 100;
  
  public static double zza(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(zzd(paramArrayOfByte, paramInt));
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzit paramzzit)
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5) {
                return paramInt2 + 4;
              }
              throw zzkp.zzc();
            }
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            int k;
            for (;;)
            {
              k = paramInt1;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              paramInt2 = zzc(paramArrayOfByte, paramInt2, paramzzit);
              paramInt1 = zza;
              k = paramInt1;
              i = paramInt2;
              if (paramInt1 == j) {
                break;
              }
              paramInt2 = zza(paramInt1, paramArrayOfByte, paramInt2, paramInt3, paramzzit);
            }
            if ((i <= paramInt3) && (k == j)) {
              return i;
            }
            throw zzkp.zzg();
          }
          return zzc(paramArrayOfByte, paramInt2, paramzzit) + zza;
        }
        return paramInt2 + 8;
      }
      return zzd(paramArrayOfByte, paramInt2, paramzzit);
    }
    throw zzkp.zzc();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkm<?> paramzzkm, zzit paramzzit)
  {
    paramzzkm = (zzkh)paramzzkm;
    int i;
    for (paramInt2 = zzc(paramArrayOfByte, paramInt2, paramzzit);; paramInt2 = zzc(paramArrayOfByte, i, paramzzit))
    {
      paramzzkm.zzd(zza);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzc(paramArrayOfByte, paramInt2, paramzzit);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzmx paramzzmx, zzit paramzzit)
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5)
              {
                paramzzmx.zza(paramInt1, Integer.valueOf(zzc(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzkp.zzc();
            }
            zzmx localzzmx = zzmx.zzd();
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            int k = zze + 1;
            zze = k;
            zza(k);
            for (;;)
            {
              k = i;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break label161;
              }
              k = zzc(paramArrayOfByte, paramInt2, paramzzit);
              i = zza;
              paramInt2 = i;
              if (i == j) {
                break;
              }
              paramInt2 = zza(paramInt2, paramArrayOfByte, k, paramInt3, localzzmx, paramzzit);
            }
            i = k;
            k = paramInt2;
            label161:
            zze -= 1;
            if ((i <= paramInt3) && (k == j))
            {
              paramzzmx.zza(paramInt1, localzzmx);
              return i;
            }
            throw zzkp.zzg();
          }
          paramInt3 = zzc(paramArrayOfByte, paramInt2, paramzzit);
          paramInt2 = zza;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {
                paramArrayOfByte = zziy.zza;
              } else {
                paramArrayOfByte = zziy.zza(paramArrayOfByte, paramInt3, paramInt2);
              }
              paramzzmx.zza(paramInt1, paramArrayOfByte);
              return paramInt3 + paramInt2;
            }
            throw zzkp.zzi();
          }
          throw zzkp.zzf();
        }
        paramzzmx.zza(paramInt1, Long.valueOf(zzd(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzd(paramArrayOfByte, paramInt2, paramzzit);
      paramzzmx.zza(paramInt1, Long.valueOf(zzb));
      return paramInt2;
    }
    throw zzkp.zzc();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, zzlm paramzzlm, zzmu<zzmx, zzmx> paramzzmu, zzit paramzzit)
  {
    if (zzd.zza(paramzzlm, paramInt1 >>> 3) == null) {
      return zza(paramInt1, paramArrayOfByte, paramInt2, paramInt3, zzlq.zzc(paramObject), paramzzit);
    }
    paramArrayOfByte = (zzkg.zzb)paramObject;
    paramArrayOfByte.zza();
    paramArrayOfByte = zzc;
    throw new NoSuchMethodError();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zzit paramzzit)
  {
    int i = paramInt1 & 0x7F;
    int j = paramInt2 + 1;
    paramInt1 = paramArrayOfByte[paramInt2];
    if (paramInt1 >= 0)
    {
      paramInt1 <<= 7;
      paramInt2 = i;
      zza = (paramInt2 | paramInt1);
      return j;
    }
    i |= (paramInt1 & 0x7F) << 7;
    paramInt1 = j + 1;
    paramInt2 = paramArrayOfByte[j];
    if (paramInt2 >= 0)
    {
      paramInt2 <<= 14;
      j = i;
    }
    for (;;)
    {
      zza = (j | paramInt2);
      return paramInt1;
      i |= (paramInt2 & 0x7F) << 14;
      paramInt2 = paramInt1 + 1;
      paramInt1 = paramArrayOfByte[paramInt1];
      if (paramInt1 >= 0)
      {
        paramInt1 <<= 21;
        j = paramInt2;
        paramInt2 = i;
        break;
      }
      j = i | (paramInt1 & 0x7F) << 21;
      paramInt1 = paramInt2 + 1;
      i = paramArrayOfByte[paramInt2];
      if (i < 0) {
        break label155;
      }
      paramInt2 = i << 28;
    }
    for (;;)
    {
      label155:
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0)
      {
        zza = (j | (i & 0x7F) << 28);
        return paramInt2;
      }
      paramInt1 = paramInt2;
    }
  }
  
  public static int zza(zzme<?> paramzzme, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkm<Object> paramzzkm, zzit paramzzit)
  {
    int i = paramInt1 & 0xFFFFFFF8 | 0x4;
    int j;
    for (paramInt2 = zza(paramzzme, paramArrayOfByte, paramInt2, paramInt3, i, paramzzit);; paramInt2 = zza(paramzzme, paramArrayOfByte, j, paramInt3, i, paramzzit))
    {
      paramzzkm.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      j = zzc(paramArrayOfByte, paramInt2, paramzzit);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  private static <T> int zza(zzme<T> paramzzme, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzit paramzzit)
  {
    Object localObject = paramzzme.zza();
    paramInt1 = zza(localObject, paramzzme, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzit);
    paramzzme.zzd(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static <T> int zza(zzme<T> paramzzme, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzit paramzzit)
  {
    Object localObject = paramzzme.zza();
    paramInt1 = zza(localObject, paramzzme, paramArrayOfByte, paramInt1, paramInt2, paramzzit);
    paramzzme.zzd(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static <T> int zza(Object paramObject, zzme<T> paramzzme, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzit paramzzit)
  {
    paramzzme = (zzlq)paramzzme;
    int i = zze + 1;
    zze = i;
    zza(i);
    paramInt1 = paramzzme.zza(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzit);
    zze -= 1;
    zzc = paramObject;
    return paramInt1;
  }
  
  public static <T> int zza(Object paramObject, zzme<T> paramzzme, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzit paramzzit)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    paramInt1 = i;
    int k = j;
    if (j < 0)
    {
      paramInt1 = zza(j, paramArrayOfByte, i, paramzzit);
      k = zza;
    }
    if ((k >= 0) && (k <= paramInt2 - paramInt1))
    {
      paramInt2 = zze + 1;
      zze = paramInt2;
      zza(paramInt2);
      paramInt2 = k + paramInt1;
      paramzzme.zza(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramzzit);
      zze -= 1;
      zzc = paramObject;
      return paramInt2;
    }
    throw zzkp.zzi();
  }
  
  public static int zza(byte[] paramArrayOfByte, int paramInt, zzit paramzzit)
  {
    paramInt = zzc(paramArrayOfByte, paramInt, paramzzit);
    int i = zza;
    if (i >= 0)
    {
      if (i <= paramArrayOfByte.length - paramInt)
      {
        if (i == 0)
        {
          zzc = zziy.zza;
          return paramInt;
        }
        zzc = zziy.zza(paramArrayOfByte, paramInt, i);
        return paramInt + i;
      }
      throw zzkp.zzi();
    }
    throw zzkp.zzf();
  }
  
  public static int zza(byte[] paramArrayOfByte, int paramInt, zzkm<?> paramzzkm, zzit paramzzit)
  {
    paramzzkm = (zzkh)paramzzkm;
    paramInt = zzc(paramArrayOfByte, paramInt, paramzzit);
    int i = zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzc(paramArrayOfByte, paramInt, paramzzit);
      paramzzkm.zzd(zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzkp.zzi();
  }
  
  private static void zza(int paramInt)
  {
    if (paramInt < zza) {
      return;
    }
    throw zzkp.zzh();
  }
  
  public static float zzb(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(zzc(paramArrayOfByte, paramInt));
  }
  
  public static int zzb(zzme<?> paramzzme, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkm<?> paramzzkm, zzit paramzzit)
  {
    int i;
    for (paramInt2 = zza(paramzzme, paramArrayOfByte, paramInt2, paramInt3, paramzzit);; paramInt2 = zza(paramzzme, paramArrayOfByte, i, paramInt3, paramzzit))
    {
      paramzzkm.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzc(paramArrayOfByte, paramInt2, paramzzit);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzb(byte[] paramArrayOfByte, int paramInt, zzit paramzzit)
  {
    int i = zzc(paramArrayOfByte, paramInt, paramzzit);
    paramInt = zza;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        zzc = "";
        return i;
      }
      zzc = zzna.zzb(paramArrayOfByte, i, paramInt);
      return i + paramInt;
    }
    throw zzkp.zzf();
  }
  
  public static int zzc(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public static int zzc(byte[] paramArrayOfByte, int paramInt, zzit paramzzit)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      zza = paramInt;
      return i;
    }
    return zza(paramInt, paramArrayOfByte, i, paramzzit);
  }
  
  public static int zzd(byte[] paramArrayOfByte, int paramInt, zzit paramzzit)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      zzb = l;
      return i;
    }
    paramInt = i + 1;
    int j = paramArrayOfByte[i];
    l = l & 0x7F | (j & 0x7F) << 7;
    i = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[paramInt];
      i += 7;
      l |= (j & 0x7F) << i;
      paramInt++;
    }
    zzb = l;
    return paramInt;
  }
  
  public static long zzd(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = paramArrayOfByte[paramInt];
    long l2 = paramArrayOfByte[(paramInt + 1)];
    long l3 = paramArrayOfByte[(paramInt + 2)];
    long l4 = paramArrayOfByte[(paramInt + 3)];
    long l5 = paramArrayOfByte[(paramInt + 4)];
    long l6 = paramArrayOfByte[(paramInt + 5)];
    long l7 = paramArrayOfByte[(paramInt + 6)];
    return (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zziu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
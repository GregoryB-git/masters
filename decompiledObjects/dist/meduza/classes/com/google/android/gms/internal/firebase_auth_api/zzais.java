package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;

final class zzais
{
  private static volatile int zza = 100;
  
  public static double zza(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(zzd(paramArrayOfByte, paramInt));
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
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
              throw zzakm.zzc();
            }
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            for (;;)
            {
              i = paramInt1;
              paramInt1 = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              int k = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
              paramInt2 = zza;
              i = paramInt2;
              paramInt1 = k;
              if (paramInt2 == j) {
                break;
              }
              i = zza(paramInt2, paramArrayOfByte, k, paramInt3, paramzzaiv);
              paramInt1 = paramInt2;
              paramInt2 = i;
            }
            if ((paramInt1 <= paramInt3) && (i == j)) {
              return paramInt1;
            }
            throw zzakm.zzg();
          }
          return zzc(paramArrayOfByte, paramInt2, paramzzaiv) + zza;
        }
        return paramInt2 + 8;
      }
      return zzd(paramArrayOfByte, paramInt2, paramzzaiv);
    }
    throw zzakm.zzc();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzakn<?> paramzzakn, zzaiv paramzzaiv)
  {
    paramzzakn = (zzakj)paramzzakn;
    int i;
    for (paramInt2 = zzc(paramArrayOfByte, paramInt2, paramzzaiv);; paramInt2 = zzc(paramArrayOfByte, i, paramzzaiv))
    {
      paramzzakn.zzc(zza);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, com.google.android.gms.internal.firebase-auth-api.zzamy paramzzamy, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
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
                paramzzamy.zza(paramInt1, Integer.valueOf(zzc(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzakm.zzc();
            }
            com.google.android.gms.internal.firebase-auth-api.zzamy localzzamy = zzamy.zzd();
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
              k = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
              i = zza;
              paramInt2 = i;
              if (i == j) {
                break;
              }
              paramInt2 = zza(paramInt2, paramArrayOfByte, k, paramInt3, localzzamy, paramzzaiv);
            }
            i = k;
            k = paramInt2;
            label161:
            zze -= 1;
            if ((i <= paramInt3) && (k == j))
            {
              paramzzamy.zza(paramInt1, localzzamy);
              return i;
            }
            throw zzakm.zzg();
          }
          paramInt3 = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
          paramInt2 = zza;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {
                paramArrayOfByte = zzaiw.zza;
              } else {
                paramArrayOfByte = zzaiw.zza(paramArrayOfByte, paramInt3, paramInt2);
              }
              paramzzamy.zza(paramInt1, paramArrayOfByte);
              return paramInt3 + paramInt2;
            }
            throw zzakm.zzj();
          }
          throw zzakm.zzf();
        }
        paramzzamy.zza(paramInt1, Long.valueOf(zzd(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzd(paramArrayOfByte, paramInt2, paramzzaiv);
      paramzzamy.zza(paramInt1, Long.valueOf(zzb));
      return paramInt2;
    }
    throw zzakm.zzc();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, zzaln paramzzaln, zzamv<zzamy, zzamy> paramzzamv, zzaiv paramzzaiv)
  {
    if (zzd.zza(paramzzaln, paramInt1 >>> 3) == null) {
      return zza(paramInt1, paramArrayOfByte, paramInt2, paramInt3, zzalr.zzc(paramObject), paramzzaiv);
    }
    paramArrayOfByte = (zzakg.zzd)paramObject;
    paramArrayOfByte.zza();
    paramArrayOfByte = zzc;
    throw new NoSuchMethodError();
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
  {
    paramInt1 &= 0x7F;
    int i = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0)
    {
      j = paramInt2 << 7;
      paramInt2 = i;
      zza = (paramInt1 | j);
      return paramInt2;
    }
    paramInt2 = paramInt1 | (paramInt2 & 0x7F) << 7;
    paramInt1 = i + 1;
    int j = paramArrayOfByte[i];
    if (j >= 0) {
      j <<= 14;
    }
    for (;;)
    {
      zza = (paramInt2 | j);
      return paramInt1;
      i = paramInt2 | (j & 0x7F) << 14;
      j = paramInt1 + 1;
      paramInt1 = paramArrayOfByte[paramInt1];
      if (paramInt1 >= 0)
      {
        int k = paramInt1 << 21;
        paramInt2 = j;
        paramInt1 = i;
        j = k;
        break;
      }
      paramInt2 = i | (paramInt1 & 0x7F) << 21;
      paramInt1 = j + 1;
      i = paramArrayOfByte[j];
      if (i < 0) {
        break label161;
      }
      j = i << 28;
    }
    for (;;)
    {
      label161:
      j = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0)
      {
        zza = (paramInt2 | (i & 0x7F) << 28);
        return j;
      }
      paramInt1 = j;
    }
  }
  
  public static int zza(zzamc<?> paramzzamc, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzakn<Object> paramzzakn, zzaiv paramzzaiv)
  {
    int i = paramInt1 & 0xFFFFFFF8 | 0x4;
    int j;
    for (paramInt2 = zza(paramzzamc, paramArrayOfByte, paramInt2, paramInt3, i, paramzzaiv);; paramInt2 = zza(paramzzamc, paramArrayOfByte, j, paramInt3, i, paramzzaiv))
    {
      paramzzakn.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      j = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  private static <T> int zza(zzamc<T> paramzzamc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzaiv paramzzaiv)
  {
    Object localObject = paramzzamc.zza();
    paramInt1 = zza(localObject, paramzzamc, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzaiv);
    paramzzamc.zzd(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static <T> int zza(zzamc<T> paramzzamc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzaiv paramzzaiv)
  {
    Object localObject = paramzzamc.zza();
    paramInt1 = zza(localObject, paramzzamc, paramArrayOfByte, paramInt1, paramInt2, paramzzaiv);
    paramzzamc.zzd(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static <T> int zza(Object paramObject, zzamc<T> paramzzamc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzaiv paramzzaiv)
  {
    paramzzamc = (zzalr)paramzzamc;
    int i = zze + 1;
    zze = i;
    zza(i);
    paramInt1 = paramzzamc.zza(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzaiv);
    zze -= 1;
    zzc = paramObject;
    return paramInt1;
  }
  
  public static <T> int zza(Object paramObject, zzamc<T> paramzzamc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzaiv paramzzaiv)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    int k = i;
    paramInt1 = j;
    if (j < 0)
    {
      k = zza(j, paramArrayOfByte, i, paramzzaiv);
      paramInt1 = zza;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - k))
    {
      paramInt2 = zze + 1;
      zze = paramInt2;
      zza(paramInt2);
      paramInt1 += k;
      paramzzamc.zza(paramObject, paramArrayOfByte, k, paramInt1, paramzzaiv);
      zze -= 1;
      zzc = paramObject;
      return paramInt1;
    }
    throw zzakm.zzj();
  }
  
  public static int zza(byte[] paramArrayOfByte, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
  {
    int i = zzc(paramArrayOfByte, paramInt, paramzzaiv);
    paramInt = zza;
    if (paramInt >= 0)
    {
      if (paramInt <= paramArrayOfByte.length - i)
      {
        if (paramInt == 0)
        {
          zzc = zzaiw.zza;
          return i;
        }
        zzc = zzaiw.zza(paramArrayOfByte, i, paramInt);
        return i + paramInt;
      }
      throw zzakm.zzj();
    }
    throw zzakm.zzf();
  }
  
  public static int zza(byte[] paramArrayOfByte, int paramInt, zzakn<?> paramzzakn, zzaiv paramzzaiv)
  {
    paramzzakn = (zzakj)paramzzakn;
    paramInt = zzc(paramArrayOfByte, paramInt, paramzzaiv);
    int i = zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzc(paramArrayOfByte, paramInt, paramzzaiv);
      paramzzakn.zzc(zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzakm.zzj();
  }
  
  private static void zza(int paramInt)
  {
    if (paramInt < zza) {
      return;
    }
    throw zzakm.zzh();
  }
  
  public static float zzb(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(zzc(paramArrayOfByte, paramInt));
  }
  
  public static int zzb(zzamc<?> paramzzamc, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzakn<?> paramzzakn, zzaiv paramzzaiv)
  {
    int i;
    for (paramInt2 = zza(paramzzamc, paramArrayOfByte, paramInt2, paramInt3, paramzzaiv);; paramInt2 = zza(paramzzamc, paramArrayOfByte, i, paramInt3, paramzzaiv))
    {
      paramzzakn.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzc(paramArrayOfByte, paramInt2, paramzzaiv);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzb(byte[] paramArrayOfByte, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
  {
    paramInt = zzc(paramArrayOfByte, paramInt, paramzzaiv);
    int i = zza;
    if (i >= 0)
    {
      if (i == 0)
      {
        zzc = "";
        return paramInt;
      }
      zzc = zzanb.zzb(paramArrayOfByte, paramInt, i);
      return paramInt + i;
    }
    throw zzakm.zzf();
  }
  
  public static int zzc(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public static int zzc(byte[] paramArrayOfByte, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      zza = paramInt;
      return i;
    }
    return zza(paramInt, paramArrayOfByte, i, paramzzaiv);
  }
  
  public static int zzd(byte[] paramArrayOfByte, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiv paramzzaiv)
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzais
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
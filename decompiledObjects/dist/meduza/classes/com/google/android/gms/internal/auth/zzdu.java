package com.google.android.gms.internal.auth;

import java.util.List;

final class zzdu
{
  public static int zza(byte[] paramArrayOfByte, int paramInt, zzdt paramzzdt)
  {
    int i = zzh(paramArrayOfByte, paramInt, paramzzdt);
    paramInt = zza;
    if (paramInt >= 0)
    {
      if (paramInt <= paramArrayOfByte.length - i)
      {
        if (paramInt == 0)
        {
          zzc = zzef.zzb;
          return i;
        }
        zzc = zzef.zzk(paramArrayOfByte, i, paramInt);
        return i + paramInt;
      }
      throw zzfb.zzf();
    }
    throw zzfb.zzc();
  }
  
  public static int zzb(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (j & 0xFF) << 8 | i & 0xFF | (k & 0xFF) << 16;
  }
  
  public static int zzc(zzgi paramzzgi, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzdt paramzzdt)
  {
    Object localObject = paramzzgi.zzd();
    paramInt1 = zzl(localObject, paramzzgi, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzdt);
    paramzzgi.zze(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static int zzd(zzgi paramzzgi, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzdt paramzzdt)
  {
    Object localObject = paramzzgi.zzd();
    paramInt1 = zzm(localObject, paramzzgi, paramArrayOfByte, paramInt1, paramInt2, paramzzdt);
    paramzzgi.zze(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static int zze(zzgi paramzzgi, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzez paramzzez, zzdt paramzzdt)
  {
    int i;
    for (paramInt2 = zzd(paramzzgi, paramArrayOfByte, paramInt2, paramInt3, paramzzdt);; paramInt2 = zzd(paramzzgi, paramArrayOfByte, i, paramInt3, paramzzdt))
    {
      paramzzez.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzh(paramArrayOfByte, paramInt2, paramzzdt);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzf(byte[] paramArrayOfByte, int paramInt, zzez paramzzez, zzdt paramzzdt)
  {
    paramzzez = (zzew)paramzzez;
    paramInt = zzh(paramArrayOfByte, paramInt, paramzzdt);
    int i = zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzh(paramArrayOfByte, paramInt, paramzzdt);
      paramzzez.zze(zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzfb.zzf();
  }
  
  public static int zzg(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzha paramzzha, zzdt paramzzdt)
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
                paramzzha.zzh(paramInt1, Integer.valueOf(zzb(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzfb.zza();
            }
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            zzha localzzha = zzha.zzd();
            i = 0;
            for (;;)
            {
              k = i;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break label140;
              }
              k = zzh(paramArrayOfByte, paramInt2, paramzzdt);
              i = zza;
              paramInt2 = i;
              if (i == j) {
                break;
              }
              paramInt2 = zzg(paramInt2, paramArrayOfByte, k, paramInt3, localzzha, paramzzdt);
            }
            i = k;
            int k = paramInt2;
            label140:
            if ((i <= paramInt3) && (k == j))
            {
              paramzzha.zzh(paramInt1, localzzha);
              return i;
            }
            throw zzfb.zzd();
          }
          paramInt2 = zzh(paramArrayOfByte, paramInt2, paramzzdt);
          paramInt3 = zza;
          if (paramInt3 >= 0)
          {
            if (paramInt3 <= paramArrayOfByte.length - paramInt2)
            {
              if (paramInt3 == 0) {
                paramArrayOfByte = zzef.zzb;
              } else {
                paramArrayOfByte = zzef.zzk(paramArrayOfByte, paramInt2, paramInt3);
              }
              paramzzha.zzh(paramInt1, paramArrayOfByte);
              return paramInt2 + paramInt3;
            }
            throw zzfb.zzf();
          }
          throw zzfb.zzc();
        }
        paramzzha.zzh(paramInt1, Long.valueOf(zzn(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzk(paramArrayOfByte, paramInt2, paramzzdt);
      paramzzha.zzh(paramInt1, Long.valueOf(zzb));
      return paramInt2;
    }
    throw zzfb.zza();
  }
  
  public static int zzh(byte[] paramArrayOfByte, int paramInt, zzdt paramzzdt)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      zza = paramInt;
      return i;
    }
    return zzi(paramInt, paramArrayOfByte, i, paramzzdt);
  }
  
  public static int zzi(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zzdt paramzzdt)
  {
    int i = paramArrayOfByte[paramInt2];
    int j = paramInt2 + 1;
    int k = paramInt1 & 0x7F;
    if (i >= 0)
    {
      paramInt2 = i << 7;
      paramInt1 = j;
      j = k;
      zza = (j | paramInt2);
      return paramInt1;
    }
    k |= (i & 0x7F) << 7;
    paramInt2 = j + 1;
    paramInt1 = paramArrayOfByte[j];
    if (paramInt1 >= 0)
    {
      paramInt1 <<= 14;
      j = k;
    }
    for (;;)
    {
      zza = (j | paramInt1);
      return paramInt2;
      j = k | (paramInt1 & 0x7F) << 14;
      paramInt1 = paramInt2 + 1;
      paramInt2 = paramArrayOfByte[paramInt2];
      if (paramInt2 >= 0)
      {
        paramInt2 <<= 21;
        break;
      }
      j |= (paramInt2 & 0x7F) << 21;
      paramInt2 = paramInt1 + 1;
      k = paramArrayOfByte[paramInt1];
      if (k < 0) {
        break label157;
      }
      paramInt1 = k << 28;
    }
    for (;;)
    {
      label157:
      paramInt1 = paramInt2 + 1;
      if (paramArrayOfByte[paramInt2] >= 0) {
        break;
      }
      paramInt2 = paramInt1;
    }
    zza = (j | (k & 0x7F) << 28);
    return paramInt1;
  }
  
  public static int zzj(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzez paramzzez, zzdt paramzzdt)
  {
    paramzzez = (zzew)paramzzez;
    int i;
    for (paramInt2 = zzh(paramArrayOfByte, paramInt2, paramzzdt);; paramInt2 = zzh(paramArrayOfByte, i, paramzzdt))
    {
      paramzzez.zze(zza);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzh(paramArrayOfByte, paramInt2, paramzzdt);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzk(byte[] paramArrayOfByte, int paramInt, zzdt paramzzdt)
  {
    long l = paramArrayOfByte[paramInt];
    paramInt++;
    if (l >= 0L)
    {
      zzb = l;
      return paramInt;
    }
    int i = paramInt + 1;
    int j = paramArrayOfByte[paramInt];
    l = l & 0x7F | (j & 0x7F) << 7;
    paramInt = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[i];
      paramInt += 7;
      l |= (j & 0x7F) << paramInt;
      i++;
    }
    zzb = l;
    return i;
  }
  
  public static int zzl(Object paramObject, zzgi paramzzgi, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzdt paramzzdt)
  {
    paramInt1 = ((zzga)paramzzgi).zzb(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzdt);
    zzc = paramObject;
    return paramInt1;
  }
  
  public static int zzm(Object paramObject, zzgi paramzzgi, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzdt paramzzdt)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    paramInt1 = i;
    int k = j;
    if (j < 0)
    {
      paramInt1 = zzi(j, paramArrayOfByte, i, paramzzdt);
      k = zza;
    }
    if ((k >= 0) && (k <= paramInt2 - paramInt1))
    {
      paramInt2 = k + paramInt1;
      paramzzgi.zzg(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramzzdt);
      zzc = paramObject;
      return paramInt2;
    }
    throw zzfb.zzf();
  }
  
  public static long zzn(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 4)] & 0xFF) << 32 | (paramArrayOfByte[(paramInt + 5)] & 0xFF) << 40 | (paramArrayOfByte[(paramInt + 6)] & 0xFF) << 48 | (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
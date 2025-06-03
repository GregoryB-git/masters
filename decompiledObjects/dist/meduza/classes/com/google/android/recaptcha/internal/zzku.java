package com.google.android.recaptcha.internal;

import java.util.List;

final class zzku
{
  private static volatile int zzb = 100;
  
  public static int zza(byte[] paramArrayOfByte, int paramInt, zzkt paramzzkt)
  {
    paramInt = zzi(paramArrayOfByte, paramInt, paramzzkt);
    int i = zza;
    if (i >= 0)
    {
      if (i <= paramArrayOfByte.length - paramInt)
      {
        if (i == 0)
        {
          zzc = zzle.zzb;
          return paramInt;
        }
        zzc = zzle.zzk(paramArrayOfByte, paramInt, i);
        return paramInt + i;
      }
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static int zzb(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (j & 0xFF) << 8 | i & 0xFF | (k & 0xFF) << 16;
  }
  
  public static int zzc(zzow paramzzow, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzkt paramzzkt)
  {
    Object localObject = paramzzow.zze();
    paramInt1 = zzm(localObject, paramzzow, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzkt);
    paramzzow.zzf(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static int zzd(zzow paramzzow, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzkt paramzzkt)
  {
    Object localObject = paramzzow.zze();
    paramInt1 = zzn(localObject, paramzzow, paramArrayOfByte, paramInt1, paramInt2, paramzzkt);
    paramzzow.zzf(localObject);
    zzc = localObject;
    return paramInt1;
  }
  
  public static int zze(zzow paramzzow, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zznk paramzznk, zzkt paramzzkt)
  {
    int i;
    for (paramInt2 = zzd(paramzzow, paramArrayOfByte, paramInt2, paramInt3, paramzzkt);; paramInt2 = zzd(paramzzow, paramArrayOfByte, i, paramInt3, paramzzkt))
    {
      paramzznk.add(zzc);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzi(paramArrayOfByte, paramInt2, paramzzkt);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzf(byte[] paramArrayOfByte, int paramInt, zznk paramzznk, zzkt paramzzkt)
  {
    paramzznk = (zzne)paramzznk;
    paramInt = zzi(paramArrayOfByte, paramInt, paramzzkt);
    int i = zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzi(paramArrayOfByte, paramInt, paramzzkt);
      paramzznk.zzh(zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public static int zzg(byte[] paramArrayOfByte, int paramInt, zzkt paramzzkt)
  {
    paramInt = zzi(paramArrayOfByte, paramInt, paramzzkt);
    int i = zza;
    if (i >= 0)
    {
      if (i == 0)
      {
        zzc = "";
        return paramInt;
      }
      zzc = new String(paramArrayOfByte, paramInt, i, zznl.zza);
      return paramInt + i;
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static int zzh(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzpm paramzzpm, zzkt paramzzkt)
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
                paramzzpm.zzj(paramInt1, Integer.valueOf(zzb(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            zzpm localzzpm = zzpm.zzf();
            i = zze + 1;
            zze = i;
            zzq(i);
            i = 0;
            int k;
            for (;;)
            {
              k = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              paramInt2 = zzi(paramArrayOfByte, paramInt2, paramzzkt);
              i = zza;
              if (i == j)
              {
                k = paramInt2;
                break;
              }
              paramInt2 = zzh(i, paramArrayOfByte, paramInt2, paramInt3, localzzpm, paramzzkt);
            }
            zze -= 1;
            if ((k <= paramInt3) && (i == j))
            {
              paramzzpm.zzj(paramInt1, localzzpm);
              return k;
            }
            throw new zznn("Failed to parse the message.");
          }
          paramInt2 = zzi(paramArrayOfByte, paramInt2, paramzzkt);
          paramInt3 = zza;
          if (paramInt3 >= 0)
          {
            if (paramInt3 <= paramArrayOfByte.length - paramInt2)
            {
              if (paramInt3 == 0) {
                paramArrayOfByte = zzle.zzb;
              } else {
                paramArrayOfByte = zzle.zzk(paramArrayOfByte, paramInt2, paramInt3);
              }
              paramzzpm.zzj(paramInt1, paramArrayOfByte);
              return paramInt2 + paramInt3;
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
          }
          throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        paramzzpm.zzj(paramInt1, Long.valueOf(zzp(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzl(paramArrayOfByte, paramInt2, paramzzkt);
      paramzzpm.zzj(paramInt1, Long.valueOf(zzb));
      return paramInt2;
    }
    throw new zznn("Protocol message contained an invalid tag (zero).");
  }
  
  public static int zzi(byte[] paramArrayOfByte, int paramInt, zzkt paramzzkt)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      zza = paramInt;
      return i;
    }
    return zzj(paramInt, paramArrayOfByte, i, paramzzkt);
  }
  
  public static int zzj(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zzkt paramzzkt)
  {
    int i = paramArrayOfByte[paramInt2];
    paramInt2++;
    int j = paramInt1 & 0x7F;
    if (i >= 0)
    {
      paramInt1 = i << 7;
      zza = (j | paramInt1);
      return paramInt2;
    }
    paramInt1 = j | (i & 0x7F) << 7;
    j = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0) {
      paramInt2 <<= 14;
    }
    for (;;)
    {
      zza = (paramInt1 | paramInt2);
      return j;
      paramInt1 |= (paramInt2 & 0x7F) << 14;
      i = j + 1;
      paramInt2 = paramArrayOfByte[j];
      if (paramInt2 >= 0)
      {
        paramInt2 <<= 21;
        j = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i;
        break;
      }
      paramInt2 = paramInt1 | (paramInt2 & 0x7F) << 21;
      paramInt1 = i + 1;
      i = paramArrayOfByte[i];
      if (i < 0) {
        break label160;
      }
      i <<= 28;
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
    for (;;)
    {
      label160:
      j = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0) {
        break;
      }
      paramInt1 = j;
    }
    zza = (paramInt2 | (i & 0x7F) << 28);
    return j;
  }
  
  public static int zzk(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zznk paramzznk, zzkt paramzzkt)
  {
    paramzznk = (zzne)paramzznk;
    int i;
    for (paramInt2 = zzi(paramArrayOfByte, paramInt2, paramzzkt);; paramInt2 = zzi(paramArrayOfByte, i, paramzzkt))
    {
      paramzznk.zzh(zza);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = zzi(paramArrayOfByte, paramInt2, paramzzkt);
      if (paramInt1 != zza) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int zzl(byte[] paramArrayOfByte, int paramInt, zzkt paramzzkt)
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
  
  public static int zzm(Object paramObject, zzow paramzzow, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzkt paramzzkt)
  {
    paramzzow = (zzol)paramzzow;
    int i = zze + 1;
    zze = i;
    zzq(i);
    paramInt1 = paramzzow.zzc(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzkt);
    zze -= 1;
    zzc = paramObject;
    return paramInt1;
  }
  
  public static int zzn(Object paramObject, zzow paramzzow, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzkt paramzzkt)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    int k = i;
    paramInt1 = j;
    if (j < 0)
    {
      k = zzj(j, paramArrayOfByte, i, paramzzkt);
      paramInt1 = zza;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - k))
    {
      paramInt2 = zze + 1;
      zze = paramInt2;
      zzq(paramInt2);
      paramInt1 += k;
      paramzzow.zzi(paramObject, paramArrayOfByte, k, paramInt1, paramzzkt);
      zze -= 1;
      zzc = paramObject;
      return paramInt1;
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public static int zzo(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkt paramzzkt)
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
              throw new zznn("Protocol message contained an invalid tag (zero).");
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
              int k = zzi(paramArrayOfByte, paramInt2, paramzzkt);
              paramInt2 = zza;
              i = paramInt2;
              paramInt1 = k;
              if (paramInt2 == j) {
                break;
              }
              i = zzo(paramInt2, paramArrayOfByte, k, paramInt3, paramzzkt);
              paramInt1 = paramInt2;
              paramInt2 = i;
            }
            if ((paramInt1 <= paramInt3) && (i == j)) {
              return paramInt1;
            }
            throw new zznn("Failed to parse the message.");
          }
          return zzi(paramArrayOfByte, paramInt2, paramzzkt) + zza;
        }
        return paramInt2 + 8;
      }
      return zzl(paramArrayOfByte, paramInt2, paramzzkt);
    }
    throw new zznn("Protocol message contained an invalid tag (zero).");
  }
  
  public static long zzp(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 4)] & 0xFF) << 32 | (paramArrayOfByte[(paramInt + 5)] & 0xFF) << 40 | (paramArrayOfByte[(paramInt + 6)] & 0xFF) << 48 | (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56;
  }
  
  private static void zzq(int paramInt)
  {
    if (paramInt < zzb) {
      return;
    }
    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzku
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
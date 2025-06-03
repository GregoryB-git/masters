package com.google.android.recaptcha.internal;

import java.util.Arrays;

final class zzlf
  extends zzli
{
  private final byte[] zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  
  private final void zzJ()
  {
    int i = zzf + zzg;
    zzf = i;
    int j = zzj;
    if (i > j)
    {
      j = i - j;
      zzg = j;
      zzf = (i - j);
      return;
    }
    zzg = 0;
  }
  
  public final void zzA(int paramInt)
  {
    zzj = paramInt;
    zzJ();
  }
  
  public final void zzB(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = zzf;
      int j = zzh;
      if (paramInt <= i - j)
      {
        zzh = (j + paramInt);
        return;
      }
    }
    if (paramInt < 0) {
      throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final boolean zzC()
  {
    return zzh == zzf;
  }
  
  public final boolean zzD()
  {
    return zzr() != 0L;
  }
  
  public final boolean zzE(int paramInt)
  {
    int i = paramInt & 0x7;
    int j = 0;
    int k = 0;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                zzB(4);
                return true;
              }
              throw new zznm("Protocol message tag had invalid wire type.");
            }
            return false;
          }
          zzI();
          zzz(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        zzB(zzj());
        return true;
      }
      zzB(8);
      return true;
    }
    paramInt = j;
    if (zzf - zzh >= 10)
    {
      for (paramInt = k; paramInt < 10; paramInt++)
      {
        byte[] arrayOfByte = zze;
        k = zzh;
        zzh = (k + 1);
        if (arrayOfByte[k] >= 0) {
          break label184;
        }
      }
      throw new zznn("CodedInputStream encountered a malformed varint.");
    }
    for (;;)
    {
      if (paramInt >= 10) {
        break label186;
      }
      if (zza() >= 0) {
        break;
      }
      paramInt++;
    }
    label184:
    return true;
    label186:
    throw new zznn("CodedInputStream encountered a malformed varint.");
  }
  
  public final byte zza()
  {
    int i = zzh;
    if (i != zzf)
    {
      byte[] arrayOfByte = zze;
      zzh = (i + 1);
      return arrayOfByte[i];
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final double zzb()
  {
    return Double.longBitsToDouble(zzq());
  }
  
  public final float zzc()
  {
    return Float.intBitsToFloat(zzi());
  }
  
  public final int zzd()
  {
    return zzh;
  }
  
  public final int zze(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = paramInt + zzh;
      if (i >= 0)
      {
        paramInt = zzj;
        if (i <= paramInt)
        {
          zzj = i;
          zzJ();
          return paramInt;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
      }
      throw new zznn("Failed to parse the message.");
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public final int zzf()
  {
    return zzj();
  }
  
  public final int zzg()
  {
    return zzi();
  }
  
  public final int zzh()
  {
    return zzj();
  }
  
  public final int zzi()
  {
    int i = zzh;
    if (zzf - i >= 4)
    {
      byte[] arrayOfByte = zze;
      zzh = (i + 4);
      int j = arrayOfByte[i];
      int k = arrayOfByte[(i + 1)];
      int m = arrayOfByte[(i + 2)];
      return (arrayOfByte[(i + 3)] & 0xFF) << 24 | (k & 0xFF) << 8 | j & 0xFF | (m & 0xFF) << 16;
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final int zzj()
  {
    int i = zzh;
    int j = zzf;
    if (j != i)
    {
      byte[] arrayOfByte = zze;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzh = k;
        return i;
      }
      if (j - k >= 9)
      {
        j = k + 1;
        i ^= arrayOfByte[k] << 7;
        if (i < 0)
        {
          k = i ^ 0xFFFFFF80;
        }
        else
        {
          k = j + 1;
          i ^= arrayOfByte[j] << 14;
          if (i >= 0)
          {
            i ^= 0x3F80;
            j = k;
            k = i;
          }
          for (;;)
          {
            break;
            j = k + 1;
            k = i ^ arrayOfByte[k] << 21;
            if (k < 0)
            {
              k ^= 0xFFE03F80;
            }
            else
            {
              int m = j + 1;
              int n = arrayOfByte[j];
              i = k ^ n << 28 ^ 0xFE03F80;
              k = i;
              j = m;
              if (n < 0)
              {
                n = m + 1;
                k = i;
                j = n;
                if (arrayOfByte[m] < 0)
                {
                  m = n + 1;
                  k = i;
                  j = m;
                  if (arrayOfByte[n] < 0)
                  {
                    n = m + 1;
                    k = i;
                    j = n;
                    if (arrayOfByte[m] < 0)
                    {
                      m = n + 1;
                      k = i;
                      j = m;
                      if (arrayOfByte[n] < 0)
                      {
                        j = m + 1;
                        k = i;
                        if (arrayOfByte[m] < 0) {
                          break label280;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        zzh = j;
        return k;
      }
    }
    label280:
    return (int)zzs();
  }
  
  public final int zzk()
  {
    return zzi();
  }
  
  public final int zzl()
  {
    return zzli.zzF(zzj());
  }
  
  public final int zzm()
  {
    if (zzC())
    {
      zzi = 0;
      return 0;
    }
    int i = zzj();
    zzi = i;
    if (i >>> 3 != 0) {
      return i;
    }
    throw new zznn("Protocol message contained an invalid tag (zero).");
  }
  
  public final int zzn()
  {
    return zzj();
  }
  
  public final long zzo()
  {
    return zzq();
  }
  
  public final long zzp()
  {
    return zzr();
  }
  
  public final long zzq()
  {
    int i = zzh;
    if (zzf - i >= 8)
    {
      byte[] arrayOfByte = zze;
      zzh = (i + 8);
      long l1 = arrayOfByte[i];
      long l2 = arrayOfByte[(i + 1)];
      long l3 = arrayOfByte[(i + 2)];
      long l4 = arrayOfByte[(i + 3)];
      long l5 = arrayOfByte[(i + 4)];
      long l6 = arrayOfByte[(i + 5)];
      long l7 = arrayOfByte[(i + 6)];
      return (arrayOfByte[(i + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final long zzr()
  {
    int i = zzh;
    int j = zzf;
    if (j != i)
    {
      byte[] arrayOfByte = zze;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzh = k;
        return i;
      }
      if (j - k >= 9)
      {
        j = k + 1;
        i ^= arrayOfByte[k] << 7;
        long l1;
        if (i < 0)
        {
          k = i ^ 0xFFFFFF80;
          l1 = k;
        }
        else
        {
          k = j + 1;
          i ^= arrayOfByte[j] << 14;
          if (i >= 0)
          {
            l1 = i ^ 0x3F80;
            j = k;
          }
          for (;;)
          {
            break label356;
            j = k + 1;
            i ^= arrayOfByte[k] << 21;
            if (i < 0)
            {
              k = i ^ 0xFFE03F80;
              break;
            }
            k = j + 1;
            l1 = arrayOfByte[j];
            l1 = i ^ l1 << 28;
            long l2;
            if (l1 >= 0L)
            {
              l2 = 266354560L;
              j = k;
              label183:
              l1 ^= l2;
            }
            else
            {
              i = k + 1;
              l2 = l1 ^ arrayOfByte[k] << 35;
              if (l2 < 0L)
              {
                l1 = -34093383808L;
                j = i;
              }
              label225:
              for (l1 ^= l2;; l1 = l2)
              {
                break;
                j = i + 1;
                l1 = l2 ^ arrayOfByte[i] << 42;
                if (l1 >= 0L)
                {
                  l2 = 4363953127296L;
                  break label183;
                }
                i = j + 1;
                l2 = l1 ^ arrayOfByte[j] << 49;
                if (l2 < 0L)
                {
                  l1 = -558586000294016L;
                  j = i;
                  break label225;
                }
                k = i + 1;
                l2 = l2 ^ arrayOfByte[i] << 56 ^ 0xFE03F80FE03F80;
                l1 = l2;
                j = k;
                if (l2 >= 0L) {
                  break;
                }
                j = k + 1;
                if (arrayOfByte[k] < 0L) {
                  break label364;
                }
              }
            }
          }
        }
        label356:
        zzh = j;
        return l1;
      }
    }
    label364:
    return zzs();
  }
  
  public final long zzs()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = zza();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw new zznn("CodedInputStream encountered a malformed varint.");
  }
  
  public final long zzt()
  {
    return zzq();
  }
  
  public final long zzu()
  {
    return zzli.zzG(zzr());
  }
  
  public final long zzv()
  {
    return zzr();
  }
  
  public final zzle zzw()
  {
    int i = zzj();
    int j;
    int k;
    if (i > 0)
    {
      j = zzf;
      k = zzh;
      if (i <= j - k)
      {
        zzle localzzle = zzle.zzk(zze, k, i);
        zzh += i;
        return localzzle;
      }
    }
    if (i != 0)
    {
      if (i > 0)
      {
        k = zzf;
        j = zzh;
        if (i <= k - j)
        {
          i += j;
          zzh = i;
          return new zzlc(Arrays.copyOfRange(zze, j, i));
        }
      }
      if (i <= 0) {
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
      }
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    return zzle.zzb;
  }
  
  public final String zzx()
  {
    int i = zzj();
    if (i > 0)
    {
      int j = zzf;
      int k = zzh;
      if (i <= j - k)
      {
        String str = new String(zze, k, i, zznl.zza);
        zzh += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i < 0) {
      throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final String zzy()
  {
    int i = zzj();
    if (i > 0)
    {
      int j = zzf;
      int k = zzh;
      if (i <= j - k)
      {
        String str = zzpv.zzd(zze, k, i);
        zzh += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i <= 0) {
      throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final void zzz(int paramInt)
  {
    if (zzi == paramInt) {
      return;
    }
    throw new zznn("Protocol message end-group tag did not match expected tag.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
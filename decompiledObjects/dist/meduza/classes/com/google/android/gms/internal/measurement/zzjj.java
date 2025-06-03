package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzjj
  extends zzjk
{
  private final byte[] zzd;
  private int zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj = Integer.MAX_VALUE;
  
  private zzjj(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    zzd = paramArrayOfByte;
    zze = (paramInt2 + paramInt1);
    zzg = paramInt1;
    zzh = paramInt1;
  }
  
  private final long zzaa()
  {
    int i = zzg;
    int j = zze;
    if (j != i)
    {
      byte[] arrayOfByte = zzd;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzg = k;
        return i;
      }
      if (j - k >= 9)
      {
        j = k + 1;
        i ^= arrayOfByte[k] << 7;
        if (i < 0) {
          k = i ^ 0xFFFFFF80;
        }
        for (;;)
        {
          l1 = k;
          break label351;
          k = j + 1;
          i ^= arrayOfByte[j] << 14;
          if (i >= 0)
          {
            l1 = i ^ 0x3F80;
            j = k;
            break label351;
          }
          j = k + 1;
          k = i ^ arrayOfByte[k] << 21;
          if (k >= 0) {
            break;
          }
          k ^= 0xFFE03F80;
        }
        long l1 = k;
        k = j + 1;
        l1 ^= arrayOfByte[j] << 28;
        long l2;
        if (l1 >= 0L)
        {
          l2 = 266354560L;
          j = k;
          l1 ^= l2;
        }
        else
        {
          j = k + 1;
          l1 ^= arrayOfByte[k] << 35;
          if (l1 < 0L) {}
          for (l2 = -34093383808L;; l2 = -558586000294016L)
          {
            l1 ^= l2;
            break label351;
            k = j + 1;
            l1 ^= arrayOfByte[j] << 42;
            if (l1 >= 0L)
            {
              l2 = 4363953127296L;
              j = k;
              break;
            }
            j = k + 1;
            l1 ^= arrayOfByte[k] << 49;
            if (l1 >= 0L) {
              break label302;
            }
          }
          label302:
          k = j + 1;
          l1 = l1 ^ arrayOfByte[j] << 56 ^ 0xFE03F80FE03F80;
          if (l1 < 0L)
          {
            j = k + 1;
            if (arrayOfByte[k] < 0L) {
              break label359;
            }
          }
          else
          {
            j = k;
          }
        }
        label351:
        zzg = j;
        return l1;
      }
    }
    label359:
    return zzm();
  }
  
  private final void zzab()
  {
    int i = zze + zzf;
    zze = i;
    int j = i - zzh;
    int k = zzj;
    if (j > k)
    {
      k = j - k;
      zzf = k;
      zze = (i - k);
      return;
    }
    zzf = 0;
  }
  
  private final void zzf(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = zze;
      int j = zzg;
      if (paramInt <= i - j)
      {
        zzg = (j + paramInt);
        return;
      }
    }
    if (paramInt < 0) {
      throw zzkp.zzf();
    }
    throw zzkp.zzi();
  }
  
  private final byte zzw()
  {
    int i = zzg;
    if (i != zze)
    {
      byte[] arrayOfByte = zzd;
      zzg = (i + 1);
      return arrayOfByte[i];
    }
    throw zzkp.zzi();
  }
  
  private final int zzx()
  {
    int i = zzg;
    if (zze - i >= 4)
    {
      byte[] arrayOfByte = zzd;
      zzg = (i + 4);
      int j = arrayOfByte[i];
      int k = arrayOfByte[(i + 1)];
      int m = arrayOfByte[(i + 2)];
      return (arrayOfByte[(i + 3)] & 0xFF) << 24 | j & 0xFF | (k & 0xFF) << 8 | (m & 0xFF) << 16;
    }
    throw zzkp.zzi();
  }
  
  private final int zzy()
  {
    int i = zzg;
    int j = zze;
    if (j != i)
    {
      byte[] arrayOfByte = zzd;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzg = k;
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
                        if (arrayOfByte[m] < 0) {
                          break label274;
                        }
                        k = i;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        zzg = j;
        return k;
      }
    }
    label274:
    return (int)zzm();
  }
  
  private final long zzz()
  {
    int i = zzg;
    if (zze - i >= 8)
    {
      byte[] arrayOfByte = zzd;
      zzg = (i + 8);
      long l1 = arrayOfByte[i];
      long l2 = arrayOfByte[(i + 1)];
      long l3 = arrayOfByte[(i + 2)];
      long l4 = arrayOfByte[(i + 3)];
      long l5 = arrayOfByte[(i + 4)];
      long l6 = arrayOfByte[(i + 5)];
      long l7 = arrayOfByte[(i + 6)];
      return (arrayOfByte[(i + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
    }
    throw zzkp.zzi();
  }
  
  public final double zza()
  {
    return Double.longBitsToDouble(zzz());
  }
  
  public final int zza(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = paramInt + zzc();
      if (i >= 0)
      {
        paramInt = zzj;
        if (i <= paramInt)
        {
          zzj = i;
          zzab();
          return paramInt;
        }
        throw zzkp.zzi();
      }
      throw zzkp.zzg();
    }
    throw zzkp.zzf();
  }
  
  public final float zzb()
  {
    return Float.intBitsToFloat(zzx());
  }
  
  public final void zzb(int paramInt)
  {
    if (zzi == paramInt) {
      return;
    }
    throw zzkp.zzb();
  }
  
  public final int zzc()
  {
    return zzg - zzh;
  }
  
  public final void zzc(int paramInt)
  {
    zzj = paramInt;
    zzab();
  }
  
  public final int zzd()
  {
    return zzy();
  }
  
  public final boolean zzd(int paramInt)
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
                zzf(4);
                return true;
              }
              throw zzkp.zza();
            }
            if (zzb == 0) {
              zzb(0);
            }
            return false;
          }
          boolean bool;
          do
          {
            k = zzi();
            if (k == 0) {
              break;
            }
            zzv();
            zzb += 1;
            bool = zzd(k);
            zzb -= 1;
          } while (bool);
          zzb(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        zzf(zzy());
        return true;
      }
      zzf(8);
      return true;
    }
    paramInt = j;
    if (zze - zzg >= 10)
    {
      for (paramInt = k; paramInt < 10; paramInt++)
      {
        byte[] arrayOfByte = zzd;
        k = zzg;
        zzg = (k + 1);
        if (arrayOfByte[k] >= 0) {
          break label225;
        }
      }
      throw zzkp.zze();
    }
    for (;;)
    {
      if (paramInt >= 10) {
        break label227;
      }
      if (zzw() >= 0) {
        break;
      }
      paramInt++;
    }
    label225:
    return true;
    label227:
    throw zzkp.zze();
  }
  
  public final int zze()
  {
    return zzx();
  }
  
  public final int zzf()
  {
    return zzy();
  }
  
  public final int zzg()
  {
    return zzx();
  }
  
  public final int zzh()
  {
    return zzjk.zze(zzy());
  }
  
  public final int zzi()
  {
    if (zzt())
    {
      zzi = 0;
      return 0;
    }
    int i = zzy();
    zzi = i;
    if (i >>> 3 != 0) {
      return i;
    }
    throw zzkp.zzc();
  }
  
  public final int zzj()
  {
    return zzy();
  }
  
  public final long zzk()
  {
    return zzz();
  }
  
  public final long zzl()
  {
    return zzaa();
  }
  
  public final long zzm()
  {
    long l = 0L;
    for (int i = 0; i < 64; i += 7)
    {
      int j = zzw();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
    }
    throw zzkp.zze();
  }
  
  public final long zzn()
  {
    return zzz();
  }
  
  public final long zzo()
  {
    return zzjk.zza(zzaa());
  }
  
  public final long zzp()
  {
    return zzaa();
  }
  
  public final zziy zzq()
  {
    int i = zzy();
    int j;
    int k;
    Object localObject;
    if (i > 0)
    {
      j = zze;
      k = zzg;
      if (i <= j - k)
      {
        localObject = zziy.zza(zzd, k, i);
        zzg += i;
        return (zziy)localObject;
      }
    }
    if (i == 0) {
      return zziy.zza;
    }
    if (i > 0)
    {
      j = zze;
      k = zzg;
      if (i <= j - k)
      {
        i += k;
        zzg = i;
        localObject = Arrays.copyOfRange(zzd, k, i);
        break label115;
      }
    }
    if (i <= 0)
    {
      if (i == 0)
      {
        localObject = zzkj.zzb;
        label115:
        return zziy.zzb((byte[])localObject);
      }
      throw zzkp.zzf();
    }
    throw zzkp.zzi();
  }
  
  public final String zzr()
  {
    int i = zzy();
    if (i > 0)
    {
      int j = zze;
      int k = zzg;
      if (i <= j - k)
      {
        String str = new String(zzd, k, i, zzkj.zza);
        zzg += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i < 0) {
      throw zzkp.zzf();
    }
    throw zzkp.zzi();
  }
  
  public final String zzs()
  {
    int i = zzy();
    if (i > 0)
    {
      int j = zze;
      int k = zzg;
      if (i <= j - k)
      {
        String str = zzna.zzb(zzd, k, i);
        zzg += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i <= 0) {
      throw zzkp.zzf();
    }
    throw zzkp.zzi();
  }
  
  public final boolean zzt()
  {
    return zzg == zze;
  }
  
  public final boolean zzu()
  {
    return zzaa() != 0L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
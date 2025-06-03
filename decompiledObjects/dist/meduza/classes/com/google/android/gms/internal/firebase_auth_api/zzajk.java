package com.google.android.gms.internal.firebase_auth_api;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzajk
  extends zzaji
{
  private final InputStream zzd;
  private final byte[] zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private int zzk = Integer.MAX_VALUE;
  
  private zzajk(InputStream paramInputStream, int paramInt)
  {
    super(null);
    zzaki.zza(paramInputStream, "input");
    zzd = paramInputStream;
    zze = new byte['က'];
    zzf = 0;
    zzh = 0;
    zzj = 0;
  }
  
  private static int zza(InputStream paramInputStream)
  {
    try
    {
      int i = paramInputStream.available();
      return i;
    }
    catch (zzakm paramInputStream)
    {
      paramInputStream.zzk();
      throw paramInputStream;
    }
  }
  
  private static int zza(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = paramInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (zzakm paramInputStream)
    {
      paramInputStream.zzk();
      throw paramInputStream;
    }
  }
  
  private static long zza(InputStream paramInputStream, long paramLong)
  {
    try
    {
      paramLong = paramInputStream.skip(paramLong);
      return paramLong;
    }
    catch (zzakm paramInputStream)
    {
      paramInputStream.zzk();
      throw paramInputStream;
    }
  }
  
  private final byte[] zza(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = zzj(paramInt);
    if (arrayOfByte1 != null) {
      return arrayOfByte1;
    }
    int i = zzh;
    int j = zzf;
    int k = j - i;
    zzj += j;
    zzh = 0;
    zzf = 0;
    Object localObject = zzf(paramInt - k);
    arrayOfByte1 = new byte[paramInt];
    System.arraycopy(zze, i, arrayOfByte1, 0, k);
    localObject = ((List)localObject).iterator();
    paramInt = k;
    while (((Iterator)localObject).hasNext())
    {
      byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, arrayOfByte2.length);
      paramInt += arrayOfByte2.length;
    }
    return arrayOfByte1;
  }
  
  private final int zzaa()
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
        zzh = j;
        return k;
      }
    }
    label274:
    return (int)zzm();
  }
  
  private final long zzab()
  {
    int i = zzh;
    int j = i;
    if (zzf - i < 8)
    {
      zzg(8);
      j = zzh;
    }
    byte[] arrayOfByte = zze;
    zzh = (j + 8);
    long l1 = arrayOfByte[j];
    long l2 = arrayOfByte[(j + 1)];
    long l3 = arrayOfByte[(j + 2)];
    long l4 = arrayOfByte[(j + 3)];
    long l5 = arrayOfByte[(j + 4)];
    long l6 = arrayOfByte[(j + 5)];
    long l7 = arrayOfByte[(j + 6)];
    return (arrayOfByte[(j + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  private final long zzac()
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
        i = j + 1;
        long l2 = l1 ^ arrayOfByte[j] << 28;
        if (l2 >= 0L)
        {
          l1 = 266354560L;
          j = i;
          l1 = l2 ^ l1;
        }
        else
        {
          k = i + 1;
          l2 ^= arrayOfByte[i] << 35;
          if (l2 < 0L) {
            l1 = -34093383808L;
          }
          for (j = k;; j = k)
          {
            l1 = l2 ^ l1;
            break label351;
            j = k + 1;
            l2 ^= arrayOfByte[k] << 42;
            if (l2 >= 0L)
            {
              l1 = 4363953127296L;
              break;
            }
            k = j + 1;
            l2 ^= arrayOfByte[j] << 49;
            if (l2 >= 0L) {
              break label302;
            }
            l1 = -558586000294016L;
          }
          label302:
          j = k + 1;
          l1 = l2 ^ arrayOfByte[k] << 56 ^ 0xFE03F80FE03F80;
          if (l1 < 0L)
          {
            k = j + 1;
            if (arrayOfByte[j] < 0L) {
              break label359;
            }
            j = k;
          }
        }
        label351:
        zzh = j;
        return l1;
      }
    }
    label359:
    return zzm();
  }
  
  private final void zzad()
  {
    int i = zzf + zzg;
    zzf = i;
    int j = zzj + i;
    int k = zzk;
    if (j > k)
    {
      k = j - k;
      zzg = k;
      zzf = (i - k);
      return;
    }
    zzg = 0;
  }
  
  private final List<byte[]> zzf(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt > 0)
    {
      int i = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      while (j < i)
      {
        int k = zzd.read(arrayOfByte, j, i - j);
        if (k != -1)
        {
          zzj += k;
          j += k;
        }
        else
        {
          throw zzakm.zzj();
        }
      }
      paramInt -= i;
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  private final void zzg(int paramInt)
  {
    if (!zzi(paramInt))
    {
      if (paramInt > zzb - zzj - zzh) {
        throw zzakm.zzi();
      }
      throw zzakm.zzj();
    }
  }
  
  private final void zzh(int paramInt)
  {
    int i = zzf;
    int k = zzh;
    if ((paramInt <= i - k) && (paramInt >= 0))
    {
      zzh = (k + paramInt);
      return;
    }
    if (paramInt >= 0)
    {
      int m = zzj;
      int n = zzk;
      if (m + k + paramInt <= n)
      {
        zzj = (m + k);
        n = i - k;
        zzf = 0;
        zzh = 0;
        while (n < paramInt) {
          try
          {
            Object localObject1 = zzd;
            long l1 = paramInt - n;
            long l2 = zza((InputStream)localObject1, l1);
            boolean bool = l2 < 0L;
            if ((!bool) && (l2 <= l1))
            {
              if (bool) {
                n += (int)l2;
              }
            }
            else
            {
              localObject1 = new java/lang/IllegalStateException;
              String str = String.valueOf(zzd.getClass());
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append(str);
              localStringBuilder.append("#skip returned invalid result: ");
              localStringBuilder.append(l2);
              localStringBuilder.append("\nThe InputStream implementation is buggy.");
              ((IllegalStateException)localObject1).<init>(localStringBuilder.toString());
              throw ((Throwable)localObject1);
            }
          }
          finally
          {
            zzj += n;
            zzad();
          }
        }
        zzj += n;
        zzad();
        if (n < paramInt)
        {
          int j = zzf;
          n = j - zzh;
          for (zzh = j;; zzh = j)
          {
            zzg(1);
            m = paramInt - n;
            j = zzf;
            if (m <= j) {
              break;
            }
            n += j;
          }
          zzh = m;
        }
        return;
      }
      zzh(n - m - k);
      throw zzakm.zzj();
    }
    throw zzakm.zzf();
  }
  
  private final boolean zzi(int paramInt)
  {
    int m;
    do
    {
      int i = zzh;
      int j = zzf;
      if (i + paramInt <= j) {
        break label278;
      }
      int k = zzb;
      m = zzj;
      if (paramInt > k - m - i) {
        return false;
      }
      if (m + i + paramInt > zzk) {
        return false;
      }
      if (i > 0)
      {
        if (j > i)
        {
          localObject1 = zze;
          System.arraycopy(localObject1, i, localObject1, 0, j - i);
        }
        zzj += i;
        zzf -= i;
        zzh = 0;
      }
      localObject2 = zzd;
      localObject1 = zze;
      m = zzf;
      m = zza((InputStream)localObject2, (byte[])localObject1, m, Math.min(localObject1.length - m, zzb - zzj - m));
      if ((m == 0) || (m < -1) || (m > zze.length)) {
        break label212;
      }
      if (m <= 0) {
        break;
      }
      zzf += m;
      zzad();
    } while (zzf < paramInt);
    return true;
    return false;
    label212:
    Object localObject2 = String.valueOf(zzd.getClass());
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("#read(byte[]) returned invalid result: ");
    ((StringBuilder)localObject1).append(m);
    ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
    label278:
    localObject1 = new StringBuilder("refillBuffer() called when ");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append(" bytes were already available in buffer");
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  private final byte[] zzj(int paramInt)
  {
    if (paramInt == 0) {
      return zzaki.zzb;
    }
    if (paramInt >= 0)
    {
      int i = zzj;
      int j = zzh;
      int k = i + j + paramInt;
      if (k - zzb <= 0)
      {
        int m = zzk;
        if (k <= m)
        {
          i = zzf - j;
          m = paramInt - i;
          if ((m >= 4096) && (m > zza(zzd))) {
            return null;
          }
          byte[] arrayOfByte = new byte[paramInt];
          System.arraycopy(zze, zzh, arrayOfByte, 0, i);
          zzj += zzf;
          zzh = 0;
          zzf = 0;
          while (i < paramInt)
          {
            m = zza(zzd, arrayOfByte, i, paramInt - i);
            if (m != -1)
            {
              zzj += m;
              i += m;
            }
            else
            {
              throw zzakm.zzj();
            }
          }
          return arrayOfByte;
        }
        zzh(m - i - j);
        throw zzakm.zzj();
      }
      throw zzakm.zzi();
    }
    throw zzakm.zzf();
  }
  
  private final byte zzy()
  {
    if (zzh == zzf) {
      zzg(1);
    }
    byte[] arrayOfByte = zze;
    int i = zzh;
    zzh = (i + 1);
    return arrayOfByte[i];
  }
  
  private final int zzz()
  {
    int i = zzh;
    int j = i;
    if (zzf - i < 4)
    {
      zzg(4);
      j = zzh;
    }
    byte[] arrayOfByte = zze;
    zzh = (j + 4);
    int k = arrayOfByte[j];
    i = arrayOfByte[(j + 1)];
    int m = arrayOfByte[(j + 2)];
    return (arrayOfByte[(j + 3)] & 0xFF) << 24 | k & 0xFF | (i & 0xFF) << 8 | (m & 0xFF) << 16;
  }
  
  public final double zza()
  {
    return Double.longBitsToDouble(zzab());
  }
  
  public final float zzb()
  {
    return Float.intBitsToFloat(zzz());
  }
  
  public final int zzb(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = zzj + zzh + paramInt;
      if (i >= 0)
      {
        paramInt = zzk;
        if (i <= paramInt)
        {
          zzk = i;
          zzad();
          return paramInt;
        }
        throw zzakm.zzj();
      }
      throw zzakm.zzg();
    }
    throw zzakm.zzf();
  }
  
  public final int zzc()
  {
    return zzj + zzh;
  }
  
  public final void zzc(int paramInt)
  {
    if (zzi == paramInt) {
      return;
    }
    throw zzakm.zzb();
  }
  
  public final int zzd()
  {
    return zzaa();
  }
  
  public final void zzd(int paramInt)
  {
    zzk = paramInt;
    zzad();
  }
  
  public final int zze()
  {
    return zzz();
  }
  
  public final boolean zze(int paramInt)
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
                zzh(4);
                return true;
              }
              throw zzakm.zza();
            }
            zzu();
            return false;
          }
          zzv();
          zzc(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        zzh(zzaa());
        return true;
      }
      zzh(8);
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
          break label173;
        }
      }
      throw zzakm.zze();
    }
    for (;;)
    {
      if (paramInt >= 10) {
        break label175;
      }
      if (zzy() >= 0) {
        break;
      }
      paramInt++;
    }
    label173:
    return true;
    label175:
    throw zzakm.zze();
  }
  
  public final int zzf()
  {
    return zzaa();
  }
  
  public final int zzg()
  {
    return zzz();
  }
  
  public final int zzh()
  {
    return zzaji.zza(zzaa());
  }
  
  public final int zzi()
  {
    if (zzw())
    {
      zzi = 0;
      return 0;
    }
    int i = zzaa();
    zzi = i;
    if (i >>> 3 != 0) {
      return i;
    }
    throw zzakm.zzc();
  }
  
  public final int zzj()
  {
    return zzaa();
  }
  
  public final long zzk()
  {
    return zzab();
  }
  
  public final long zzl()
  {
    return zzac();
  }
  
  public final long zzm()
  {
    long l = 0L;
    for (int i = 0; i < 64; i += 7)
    {
      int j = zzy();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
    }
    throw zzakm.zze();
  }
  
  public final long zzn()
  {
    return zzab();
  }
  
  public final long zzo()
  {
    return zzaji.zza(zzac());
  }
  
  public final long zzp()
  {
    return zzac();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzq()
  {
    int i = zzaa();
    int j = zzf;
    int k = zzh;
    Object localObject1;
    if ((i <= j - k) && (i > 0))
    {
      localObject1 = zzaiw.zza(zze, k, i);
      zzh += i;
      return (com.google.android.gms.internal.firebase-auth-api.zzaiw)localObject1;
    }
    if (i == 0) {
      return zzaiw.zza;
    }
    if (i >= 0)
    {
      localObject1 = zzj(i);
      if (localObject1 != null) {
        return zzaiw.zza((byte[])localObject1);
      }
      j = zzh;
      int m = zzf;
      k = m - j;
      zzj += m;
      zzh = 0;
      zzf = 0;
      Object localObject2 = zzf(i - k);
      localObject1 = new byte[i];
      System.arraycopy(zze, j, localObject1, 0, k);
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
        System.arraycopy(arrayOfByte, 0, localObject1, k, arrayOfByte.length);
        k += arrayOfByte.length;
      }
      return zzaiw.zzb((byte[])localObject1);
    }
    throw zzakm.zzf();
  }
  
  public final String zzr()
  {
    int i = zzaa();
    String str;
    if (i > 0)
    {
      int j = zzf;
      int k = zzh;
      if (i <= j - k)
      {
        str = new String(zze, k, i, zzaki.zza);
        zzh += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i >= 0)
    {
      if (i <= zzf)
      {
        zzg(i);
        str = new String(zze, zzh, i, zzaki.zza);
        zzh += i;
        return str;
      }
      return new String(zza(i, false), zzaki.zza);
    }
    throw zzakm.zzf();
  }
  
  public final String zzs()
  {
    int i = zzaa();
    int j = zzh;
    int k = zzf;
    byte[] arrayOfByte;
    if ((i <= k - j) && (i > 0))
    {
      arrayOfByte = zze;
      zzh = (j + i);
    }
    else
    {
      if (i == 0) {
        return "";
      }
      if (i < 0) {
        break label96;
      }
      if (i <= k)
      {
        zzg(i);
        arrayOfByte = zze;
        zzh = i;
      }
      else
      {
        arrayOfByte = zza(i, false);
      }
      j = 0;
    }
    return zzanb.zzb(arrayOfByte, j, i);
    label96:
    throw zzakm.zzf();
  }
  
  public final boolean zzw()
  {
    return (zzh == zzf) && (!zzi(1));
  }
  
  public final boolean zzx()
  {
    return zzac() != 0L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
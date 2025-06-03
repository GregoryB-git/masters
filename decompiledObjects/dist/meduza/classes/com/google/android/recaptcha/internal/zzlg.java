package com.google.android.recaptcha.internal;

import a0.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzlg
  extends zzli
{
  private final InputStream zze;
  private final byte[] zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private int zzk;
  private int zzl;
  
  private final List zzJ(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt > 0)
    {
      int i = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      while (j < i)
      {
        int k = zze.read(arrayOfByte, j, i - j);
        if (k != -1)
        {
          zzk += k;
          j += k;
        }
        else
        {
          throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
      }
      paramInt -= i;
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  private final void zzK()
  {
    int i = zzg + zzh;
    zzg = i;
    int j = zzk + i;
    int k = zzl;
    if (j > k)
    {
      j -= k;
      zzh = j;
      zzg = (i - j);
      return;
    }
    zzh = 0;
  }
  
  private final void zzL(int paramInt)
  {
    if (!zzM(paramInt))
    {
      if (paramInt > Integer.MAX_VALUE - zzk - zzi) {
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
      }
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
  }
  
  private final boolean zzM(int paramInt)
  {
    int i = zzi;
    int j = zzg;
    if (i + paramInt > j)
    {
      int k = zzk;
      if (paramInt > Integer.MAX_VALUE - k - i) {
        return false;
      }
      if (k + i + paramInt > zzl) {
        return false;
      }
      int m = j;
      if (i > 0)
      {
        if (j > i)
        {
          localObject1 = zzf;
          System.arraycopy(localObject1, i, localObject1, 0, j - i);
        }
        k = zzk + i;
        zzk = k;
        m = zzg - i;
        zzg = m;
        zzi = 0;
      }
      Object localObject2 = zze;
      Object localObject1 = zzf;
      k = Math.min(4096 - m, Integer.MAX_VALUE - k - m);
      try
      {
        m = ((InputStream)localObject2).read((byte[])localObject1, m, k);
        if ((m != 0) && (m >= -1) && (m <= 4096))
        {
          if (m > 0)
          {
            zzg += m;
            zzK();
            if (zzg >= paramInt) {
              return true;
            }
            return zzM(paramInt);
          }
          return false;
        }
        localObject2 = String.valueOf(zze.getClass());
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append("#read(byte[]) returned invalid result: ");
        ((StringBuilder)localObject1).append(m);
        ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
      catch (zznn localzznn)
      {
        localzznn.zza();
        throw localzznn;
      }
    }
    throw new IllegalStateException(j.h("refillBuffer() called when ", paramInt, " bytes were already available in buffer"));
  }
  
  private final byte[] zzN(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = zzO(paramInt);
    if (arrayOfByte1 != null) {
      return arrayOfByte1;
    }
    int i = zzi;
    int j = zzg;
    int k = j - i;
    zzk += j;
    zzi = 0;
    zzg = 0;
    Object localObject = zzJ(paramInt - k);
    arrayOfByte1 = new byte[paramInt];
    System.arraycopy(zzf, i, arrayOfByte1, 0, k);
    localObject = ((List)localObject).iterator();
    paramInt = k;
    while (((Iterator)localObject).hasNext())
    {
      byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
      k = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, k);
      paramInt += k;
    }
    return arrayOfByte1;
  }
  
  private final byte[] zzO(int paramInt)
  {
    if (paramInt == 0) {
      return zznl.zzb;
    }
    int i = zzk;
    int j = zzi;
    int k = i + j + paramInt;
    if (-2147483647 + k <= 0)
    {
      int m = zzl;
      if (k <= m)
      {
        m = zzg - j;
        j = paramInt - m;
        if (j >= 4096)
        {
          InputStream localInputStream1 = zze;
          try
          {
            k = localInputStream1.available();
            if (j > k) {
              return null;
            }
          }
          catch (zznn localzznn1)
          {
            localzznn1.zza();
            throw localzznn1;
          }
        }
        byte[] arrayOfByte = new byte[paramInt];
        System.arraycopy(zzf, zzi, arrayOfByte, 0, m);
        zzk += zzg;
        zzi = 0;
        zzg = 0;
        while (m < paramInt)
        {
          InputStream localInputStream2 = zze;
          try
          {
            j = localInputStream2.read(arrayOfByte, m, paramInt - m);
            if (j != -1)
            {
              zzk += j;
              m += j;
            }
            else
            {
              throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
          }
          catch (zznn localzznn2)
          {
            localzznn2.zza();
            throw localzznn2;
          }
        }
        return localzznn2;
      }
      zzB(m - i - j);
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  public final void zzA(int paramInt)
  {
    zzl = paramInt;
    zzK();
  }
  
  public final void zzB(int paramInt)
  {
    int i = zzg;
    int j = zzi;
    i -= j;
    if ((paramInt <= i) && (paramInt >= 0))
    {
      zzi = (j + paramInt);
      return;
    }
    if (paramInt >= 0)
    {
      int m = zzk;
      int n = m + j;
      int i1 = zzl;
      int k;
      if (n + paramInt <= i1)
      {
        zzk = n;
        zzg = 0;
        zzi = 0;
        while (i < paramInt) {
          try
          {
            Object localObject1 = zze;
            long l1 = paramInt - i;
            try
            {
              long l2 = ((InputStream)localObject1).skip(l1);
              boolean bool = l2 < 0L;
              if ((!bool) && (l2 <= l1))
              {
                if (bool) {
                  i += (int)l2;
                }
              }
              else
              {
                IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
                localObject1 = String.valueOf(zze.getClass());
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append((String)localObject1);
                localStringBuilder.append("#skip returned invalid result: ");
                localStringBuilder.append(l2);
                localStringBuilder.append("\nThe InputStream implementation is buggy.");
                localIllegalStateException.<init>(localStringBuilder.toString());
                throw localIllegalStateException;
              }
            }
            catch (zznn localzznn)
            {
              localzznn.zza();
              throw localzznn;
            }
            zzk += i;
          }
          finally
          {
            zzk += i;
            zzK();
          }
        }
        zzK();
        if (i < paramInt)
        {
          k = zzg;
          i = k - zzi;
          for (zzi = k;; zzi = k)
          {
            zzL(1);
            i1 = paramInt - i;
            k = zzg;
            if (i1 <= k) {
              break;
            }
            i += k;
          }
          zzi = i1;
        }
        return;
      }
      zzB(i1 - m - k);
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public final boolean zzC()
  {
    return (zzi == zzg) && (!zzM(1));
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
    if (zzg - zzi >= 10)
    {
      for (paramInt = k; paramInt < 10; paramInt++)
      {
        byte[] arrayOfByte = zzf;
        k = zzi;
        zzi = (k + 1);
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
    if (zzi == zzg) {
      zzL(1);
    }
    byte[] arrayOfByte = zzf;
    int i = zzi;
    zzi = (i + 1);
    return arrayOfByte[i];
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
    return zzk + zzi;
  }
  
  public final int zze(int paramInt)
  {
    if (paramInt >= 0)
    {
      paramInt = zzk + zzi + paramInt;
      if (paramInt >= 0)
      {
        int i = zzl;
        if (paramInt <= i)
        {
          zzl = paramInt;
          zzK();
          return i;
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
    int i = zzi;
    int j = i;
    if (zzg - i < 4)
    {
      zzL(4);
      j = zzi;
    }
    byte[] arrayOfByte = zzf;
    zzi = (j + 4);
    int k = arrayOfByte[j];
    int m = arrayOfByte[(j + 1)];
    i = arrayOfByte[(j + 2)];
    return (arrayOfByte[(j + 3)] & 0xFF) << 24 | (m & 0xFF) << 8 | k & 0xFF | (i & 0xFF) << 16;
  }
  
  public final int zzj()
  {
    int i = zzi;
    int j = zzg;
    if (j != i)
    {
      byte[] arrayOfByte = zzf;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzi = k;
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
        zzi = j;
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
      zzj = 0;
      return 0;
    }
    int i = zzj();
    zzj = i;
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
    int i = zzi;
    int j = i;
    if (zzg - i < 8)
    {
      zzL(8);
      j = zzi;
    }
    byte[] arrayOfByte = zzf;
    zzi = (j + 8);
    long l1 = arrayOfByte[j];
    long l2 = arrayOfByte[(j + 1)];
    long l3 = arrayOfByte[(j + 2)];
    long l4 = arrayOfByte[(j + 3)];
    long l5 = arrayOfByte[(j + 4)];
    long l6 = arrayOfByte[(j + 5)];
    long l7 = arrayOfByte[(j + 6)];
    return (arrayOfByte[(j + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public final long zzr()
  {
    int i = zzi;
    int j = zzg;
    if (j != i)
    {
      byte[] arrayOfByte = zzf;
      int k = i + 1;
      i = arrayOfByte[i];
      if (i >= 0)
      {
        zzi = k;
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
              l1 ^= arrayOfByte[k] << 35;
              if (l1 < 0L)
              {
                l2 = -34093383808L;
                j = i;
              }
              label225:
              for (l1 = l2 ^ l1;; l1 = l2)
              {
                break;
                j = i + 1;
                l1 ^= arrayOfByte[i] << 42;
                if (l1 >= 0L)
                {
                  l2 = 4363953127296L;
                  break label183;
                }
                i = j + 1;
                l1 ^= arrayOfByte[j] << 49;
                if (l1 < 0L)
                {
                  l2 = -558586000294016L;
                  j = i;
                  break label225;
                }
                k = i + 1;
                l2 = l1 ^ arrayOfByte[i] << 56 ^ 0xFE03F80FE03F80;
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
        zzi = j;
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
    int j = zzg;
    int k = zzi;
    Object localObject1;
    if ((i <= j - k) && (i > 0))
    {
      localObject1 = zzle.zzk(zzf, k, i);
      zzi += i;
      return (zzle)localObject1;
    }
    if (i == 0) {
      return zzle.zzb;
    }
    if (i >= 0)
    {
      localObject1 = zzO(i);
      if (localObject1 != null)
      {
        localObject1 = zzle.zzk((byte[])localObject1, 0, localObject1.length);
      }
      else
      {
        k = zzi;
        int m = zzg;
        j = m - k;
        zzk += m;
        zzi = 0;
        zzg = 0;
        Object localObject2 = zzJ(i - j);
        localObject1 = new byte[i];
        System.arraycopy(zzf, k, localObject1, 0, j);
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (byte[])localIterator.next();
          i = localObject2.length;
          System.arraycopy(localObject2, 0, localObject1, j, i);
          j += i;
        }
        localObject1 = new zzlc((byte[])localObject1);
      }
      return (zzle)localObject1;
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public final String zzx()
  {
    int i = zzj();
    String str;
    if (i > 0)
    {
      int j = zzg;
      int k = zzi;
      if (i <= j - k)
      {
        str = new String(zzf, k, i, zznl.zza);
        zzi += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i >= 0)
    {
      if (i <= zzg)
      {
        zzL(i);
        str = new String(zzf, zzi, i, zznl.zza);
        zzi += i;
        return str;
      }
      return new String(zzN(i, false), zznl.zza);
    }
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public final String zzy()
  {
    int i = zzj();
    int j = zzi;
    int k = zzg;
    byte[] arrayOfByte;
    if ((i <= k - j) && (i > 0))
    {
      arrayOfByte = zzf;
      zzi = (j + i);
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
        zzL(i);
        arrayOfByte = zzf;
        zzi = i;
      }
      else
      {
        arrayOfByte = zzN(i, false);
      }
      j = 0;
    }
    return zzpv.zzd(arrayOfByte, j, i);
    label96:
    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public final void zzz(int paramInt)
  {
    if (zzj == paramInt) {
      return;
    }
    throw new zznn("Protocol message end-group tag did not match expected tag.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.util.Locale;

final class zzjn$zzb
  extends zzjn
{
  private final byte[] zzb;
  private final int zzc;
  private int zzd;
  
  public zzjn$zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    if (paramArrayOfByte != null)
    {
      if ((paramInt2 | 0x0 | paramArrayOfByte.length - paramInt2) >= 0)
      {
        zzb = paramArrayOfByte;
        zzd = 0;
        zzc = paramInt2;
        return;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
    }
    throw new NullPointerException("buffer");
  }
  
  private final void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, zzb, zzd, paramInt2);
      zzd += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new zzjn.zza(zzd, zzc, paramInt2, paramArrayOfByte);
    }
  }
  
  public final int zza()
  {
    return zzc - zzd;
  }
  
  public final void zza(byte paramByte)
  {
    int i = zzd;
    try
    {
      byte[] arrayOfByte = zzb;
      arrayOfByte[i] = ((byte)paramByte);
      zzd = (i + 1);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjn.zza(i, zzc, 1, localIndexOutOfBoundsException);
    }
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzc(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void zzb(int paramInt, zzlm paramzzlm)
  {
    zzj(1, 3);
    zzk(2, paramInt);
    zzj(3, 2);
    zzc(paramzzlm);
    zzj(1, 4);
  }
  
  public final void zzb(int paramInt, String paramString)
  {
    zzj(paramInt, 2);
    zzb(paramString);
  }
  
  public final void zzb(int paramInt, boolean paramBoolean)
  {
    zzj(paramInt, 0);
    zza((byte)paramBoolean);
  }
  
  public final void zzb(zziy paramzziy)
  {
    zzk(paramzziy.zzb());
    paramzziy.zza(this);
  }
  
  public final void zzb(String paramString)
  {
    int i = zzd;
    try
    {
      int j = zzjn.zzg(paramString.length() * 3);
      int k = zzjn.zzg(paramString.length());
      if (k == j)
      {
        j = i + k;
        zzd = j;
        j = zzna.zza(paramString, zzb, j, zza());
        zzd = i;
        zzk(j - i - k);
        zzd = j;
        return;
      }
      zzk(zzna.zza(paramString));
      zzd = zzna.zza(paramString, zzb, zzd, zza());
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzjn.zza(paramString);
    }
    catch (zznd localzznd)
    {
      zzd = i;
      zza(paramString, localzznd);
    }
  }
  
  public final void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzk(paramInt2);
    zzc(paramArrayOfByte, 0, paramInt2);
  }
  
  public final void zzc(int paramInt, zziy paramzziy)
  {
    zzj(paramInt, 2);
    zzb(paramzziy);
  }
  
  public final void zzc(int paramInt, zzlm paramzzlm, zzme paramzzme)
  {
    zzj(paramInt, 2);
    zzk(((zzio)paramzzlm).zza(paramzzme));
    paramzzme.zza(paramzzlm, zza);
  }
  
  public final void zzc(zzlm paramzzlm)
  {
    zzk(paramzzlm.zzcf());
    paramzzlm.zza(this);
  }
  
  public final void zzd(int paramInt, zziy paramzziy)
  {
    zzj(1, 3);
    zzk(2, paramInt);
    zzc(3, paramzziy);
    zzj(1, 4);
  }
  
  public final void zzf(int paramInt, long paramLong)
  {
    zzj(paramInt, 1);
    zzf(paramLong);
  }
  
  public final void zzf(long paramLong)
  {
    int i = zzd;
    try
    {
      byte[] arrayOfByte = zzb;
      arrayOfByte[i] = ((byte)(byte)(int)paramLong);
      arrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramLong >> 8));
      arrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramLong >> 16));
      arrayOfByte[(i + 3)] = ((byte)(byte)(int)(paramLong >> 24));
      arrayOfByte[(i + 4)] = ((byte)(byte)(int)(paramLong >> 32));
      arrayOfByte[(i + 5)] = ((byte)(byte)(int)(paramLong >> 40));
      arrayOfByte[(i + 6)] = ((byte)(byte)(int)(paramLong >> 48));
      arrayOfByte[(i + 7)] = ((byte)(byte)(int)(paramLong >> 56));
      zzd = (i + 8);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjn.zza(i, zzc, 8, localIndexOutOfBoundsException);
    }
  }
  
  public final void zzg(int paramInt1, int paramInt2)
  {
    zzj(paramInt1, 5);
    zzh(paramInt2);
  }
  
  public final void zzh(int paramInt)
  {
    int i = zzd;
    try
    {
      byte[] arrayOfByte = zzb;
      arrayOfByte[i] = ((byte)(byte)paramInt);
      arrayOfByte[(i + 1)] = ((byte)(byte)(paramInt >> 8));
      arrayOfByte[(i + 2)] = ((byte)(byte)(paramInt >> 16));
      arrayOfByte[(i + 3)] = ((byte)(paramInt >> 24));
      zzd = (i + 4);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjn.zza(i, zzc, 4, localIndexOutOfBoundsException);
    }
  }
  
  public final void zzh(int paramInt1, int paramInt2)
  {
    zzj(paramInt1, 0);
    zzi(paramInt2);
  }
  
  public final void zzh(int paramInt, long paramLong)
  {
    zzj(paramInt, 0);
    zzh(paramLong);
  }
  
  public final void zzh(long paramLong)
  {
    int i = zzd;
    j = i;
    long l = paramLong;
    byte[] arrayOfByte;
    if (zzjn.zzc())
    {
      j = i;
      l = paramLong;
      if (zza() >= 10) {
        for (j = i;; j++)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = zzb;
            i = j + 1;
            zzmz.zza(arrayOfByte, j, (byte)(int)paramLong);
            j = i;
            break;
          }
          zzmz.zza(zzb, j, (byte)((int)paramLong | 0x80));
          paramLong >>>= 7;
        }
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
      try
      {
        arrayOfByte = zzb;
        i = j + 1;
        int k = (byte)(int)l;
        arrayOfByte[j] = ((byte)k);
        j = i;
        zzd = j;
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzjn.zza(j, zzc, 1, localIndexOutOfBoundsException);
      }
      arrayOfByte = zzb;
      i = (byte)((int)l | 0x80);
      arrayOfByte[j] = ((byte)i);
      l >>>= 7;
      j++;
    }
  }
  
  public final void zzi(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzk(paramInt);
      return;
    }
    zzh(paramInt);
  }
  
  public final void zzj(int paramInt1, int paramInt2)
  {
    zzk(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzk(int paramInt)
  {
    int i = zzd;
    int j = paramInt;
    for (paramInt = i;; paramInt++)
    {
      if ((j & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = zzb;
        j = (byte)j;
        arrayOfByte[paramInt] = ((byte)j);
        zzd = (paramInt + 1);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        byte[] arrayOfByte;
        throw new zzjn.zza(paramInt, zzc, 1, localIndexOutOfBoundsException);
      }
      arrayOfByte = zzb;
      i = (byte)(j | 0x80);
      arrayOfByte[paramInt] = ((byte)i);
      j >>>= 7;
    }
  }
  
  public final void zzk(int paramInt1, int paramInt2)
  {
    zzj(paramInt1, 0);
    zzk(paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjn.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
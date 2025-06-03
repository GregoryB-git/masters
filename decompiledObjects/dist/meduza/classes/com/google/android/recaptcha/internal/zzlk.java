package com.google.android.recaptcha.internal;

final class zzlk
  extends zzln
{
  private final byte[] zzb;
  private final int zzc;
  private int zzd;
  
  public zzlk(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    paramInt1 = paramArrayOfByte.length;
    if ((paramInt1 - paramInt2 | paramInt2) >= 0)
    {
      zzb = paramArrayOfByte;
      zzd = 0;
      zzc = paramInt2;
      return;
    }
    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
  }
  
  public final int zza()
  {
    return zzc - zzd;
  }
  
  public final void zzb(byte paramByte)
  {
    try
    {
      byte[] arrayOfByte = zzb;
      int i = zzd;
      zzd = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, 0, zzb, zzd, paramInt2);
      zzd += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void zzd(int paramInt, boolean paramBoolean)
  {
    zzt(paramInt << 3);
    zzb(paramBoolean);
  }
  
  public final void zze(int paramInt, zzle paramzzle)
  {
    zzt(paramInt << 3 | 0x2);
    zzt(paramzzle.zzd());
    paramzzle.zzh(this);
  }
  
  public final void zzf(int paramInt1, int paramInt2)
  {
    zzt(paramInt1 << 3 | 0x5);
    zzg(paramInt2);
  }
  
  public final void zzg(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = zzb;
      int i = zzd;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      zzd = (j + 1);
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzh(int paramInt, long paramLong)
  {
    zzt(paramInt << 3 | 0x1);
    zzi(paramLong);
  }
  
  public final void zzi(long paramLong)
  {
    try
    {
      byte[] arrayOfByte = zzb;
      int i = zzd;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)paramLong & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 8) & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 16) & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 24) & 0xFF));
      int k = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
      j = k + 1;
      arrayOfByte[k] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
      zzd = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzj(int paramInt1, int paramInt2)
  {
    zzt(paramInt1 << 3);
    zzk(paramInt2);
  }
  
  public final void zzk(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzt(paramInt);
      return;
    }
    zzv(paramInt);
  }
  
  public final void zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzc(paramArrayOfByte, 0, paramInt2);
  }
  
  public final void zzm(int paramInt, zzoi paramzzoi, zzow paramzzow)
  {
    zzt(paramInt << 3 | 0x2);
    zzt(((zzko)paramzzoi).zza(paramzzow));
    paramzzow.zzj(paramzzoi, zza);
  }
  
  public final void zzn(int paramInt, zzoi paramzzoi)
  {
    zzt(11);
    zzs(2, paramInt);
    zzt(26);
    zzt(paramzzoi.zzo());
    paramzzoi.zze(this);
    zzt(12);
  }
  
  public final void zzo(int paramInt, zzle paramzzle)
  {
    zzt(11);
    zzs(2, paramInt);
    zze(3, paramzzle);
    zzt(12);
  }
  
  public final void zzp(int paramInt, String paramString)
  {
    zzt(paramInt << 3 | 0x2);
    zzq(paramString);
  }
  
  public final void zzq(String paramString)
  {
    int i = zzd;
    try
    {
      int j = zzln.zzA(paramString.length() * 3);
      int k = zzln.zzA(paramString.length());
      if (k == j)
      {
        j = i + k;
        zzd = j;
        j = zzpv.zzb(paramString, zzb, j, zzc - j);
        zzd = i;
        zzt(j - i - k);
        zzd = j;
        return;
      }
      zzt(zzpv.zzc(paramString));
      byte[] arrayOfByte = zzb;
      k = zzd;
      zzd = zzpv.zzb(paramString, arrayOfByte, k, zzc - k);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzll(paramString);
    }
    catch (zzpu localzzpu)
    {
      zzd = i;
      zzD(paramString, localzzpu);
    }
  }
  
  public final void zzr(int paramInt1, int paramInt2)
  {
    zzt(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzs(int paramInt1, int paramInt2)
  {
    zzt(paramInt1 << 3);
    zzt(paramInt2);
  }
  
  public final void zzt(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = zzb;
        i = zzd;
        zzd = (i + 1);
        arrayOfByte[i] = ((byte)(byte)paramInt);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        byte[] arrayOfByte;
        int i;
        throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = zzb;
      i = zzd;
      zzd = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((paramInt | 0x80) & 0xFF));
      paramInt >>>= 7;
    }
  }
  
  public final void zzu(int paramInt, long paramLong)
  {
    zzt(paramInt << 3);
    zzv(paramLong);
  }
  
  public final void zzv(long paramLong)
  {
    long l = paramLong;
    int i;
    byte[] arrayOfByte;
    if (zzln.zzE())
    {
      l = paramLong;
      if (zzc - zzd >= 10) {
        for (;;)
        {
          i = (int)paramLong;
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = zzb;
            j = zzd;
            zzd = (j + 1);
            zzps.zzn(arrayOfByte, j, (byte)i);
            return;
          }
          arrayOfByte = zzb;
          int j = zzd;
          zzd = (j + 1);
          zzps.zzn(arrayOfByte, j, (byte)((i | 0x80) & 0xFF));
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
        i = zzd;
        zzd = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)l);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(zzd), Integer.valueOf(zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = zzb;
      i = zzd;
      zzd = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(((int)l | 0x80) & 0xFF));
      l >>>= 7;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
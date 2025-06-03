package com.google.android.gms.internal.firebase_auth_api;

abstract class zzajo$zzb
  extends zzajo
{
  public final byte[] zzb;
  public final int zzc;
  public int zzd;
  public int zze;
  
  public zzajo$zzb(int paramInt)
  {
    super(null);
    if (paramInt >= 0)
    {
      byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
      zzb = arrayOfByte;
      zzc = arrayOfByte.length;
      return;
    }
    throw new IllegalArgumentException("bufferSize must be >= 0");
  }
  
  public final int zza()
  {
    throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
  }
  
  public final void zzb(byte paramByte)
  {
    int i = zzd;
    zzb[i] = ((byte)paramByte);
    zzd = (i + 1);
    zze += 1;
  }
  
  public final void zzi(long paramLong)
  {
    int i = zzd;
    byte[] arrayOfByte = zzb;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)paramLong);
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 8));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 16));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 24));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 32));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 40));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 48));
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 56));
    zzd = (j + 1);
    zze += 8;
  }
  
  public final void zzj(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (zzajo.zzd())
    {
      l = zzd;
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = zzb;
          i = zzd;
          zzd = (i + 1);
          zzana.zza(arrayOfByte, i, (byte)(int)paramLong);
          i = (int)(zzd - l);
          zze += i;
          return;
        }
        arrayOfByte = zzb;
        i = zzd;
        zzd = (i + 1);
        zzana.zza(arrayOfByte, i, (byte)((int)paramLong | 0x80));
        paramLong >>>= 7;
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        arrayOfByte = zzb;
        i = zzd;
        zzd = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)l);
        zze += 1;
        return;
      }
      arrayOfByte = zzb;
      i = zzd;
      zzd = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)l | 0x80));
      zze += 1;
      l >>>= 7;
    }
  }
  
  public final void zzl(int paramInt1, int paramInt2)
  {
    zzn(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzm(int paramInt)
  {
    int i = zzd;
    byte[] arrayOfByte = zzb;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)paramInt);
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(paramInt >> 8));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >> 16));
    arrayOfByte[j] = ((byte)(paramInt >> 24));
    zzd = (j + 1);
    zze += 4;
  }
  
  public final void zzn(int paramInt)
  {
    int i = paramInt;
    byte[] arrayOfByte;
    if (zzajo.zzd())
    {
      long l = zzd;
      for (;;)
      {
        if ((paramInt & 0xFFFFFF80) == 0)
        {
          arrayOfByte = zzb;
          i = zzd;
          zzd = (i + 1);
          zzana.zza(arrayOfByte, i, (byte)paramInt);
          paramInt = (int)(zzd - l);
          zze += paramInt;
          return;
        }
        arrayOfByte = zzb;
        i = zzd;
        zzd = (i + 1);
        zzana.zza(arrayOfByte, i, (byte)(paramInt | 0x80));
        paramInt >>>= 7;
      }
    }
    for (;;)
    {
      if ((i & 0xFFFFFF80) == 0)
      {
        arrayOfByte = zzb;
        paramInt = zzd;
        zzd = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)i);
        zze += 1;
        return;
      }
      arrayOfByte = zzb;
      paramInt = zzd;
      zzd = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(byte)(i | 0x80));
      zze += 1;
      i >>>= 7;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajo.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
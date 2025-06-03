package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajq;
import f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzajo
  extends zzaix
{
  private static final Logger zzb = Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzajo.class.getName());
  private static final boolean zzc = zzana.zzc();
  public zzajq zza;
  
  public static int zza(double paramDouble)
  {
    return 8;
  }
  
  public static int zza(float paramFloat)
  {
    return 4;
  }
  
  public static int zza(int paramInt)
  {
    return zze(paramInt);
  }
  
  public static int zza(int paramInt, double paramDouble)
  {
    return zzh(paramInt << 3) + 8;
  }
  
  public static int zza(int paramInt, float paramFloat)
  {
    return zzh(paramInt << 3) + 4;
  }
  
  public static int zza(int paramInt1, int paramInt2)
  {
    paramInt1 = zzh(paramInt1 << 3);
    return zze(paramInt2) + paramInt1;
  }
  
  public static int zza(int paramInt, long paramLong)
  {
    return zzh(paramInt << 3) + 8;
  }
  
  public static int zza(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    int i = zzh(paramInt << 3);
    paramInt = paramzzaiw.zzb();
    return zzh(paramInt) + paramInt + i;
  }
  
  public static int zza(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzakv paramzzakv)
  {
    int i = zzh(8);
    paramInt = zzf(2, paramInt);
    return zzb(3, paramzzakv) + (paramInt + (i << 1));
  }
  
  public static int zza(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    int i = zzh(8);
    int j = zzf(2, paramInt);
    paramInt = zzh(24);
    return zzb(paramzzaln) + paramInt + (j + (i << 1));
  }
  
  @Deprecated
  public static int zza(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    paramInt = zzh(paramInt << 3);
    return ((zzain)paramzzaln).zza(paramzzamc) + (paramInt << 1);
  }
  
  public static int zza(int paramInt, String paramString)
  {
    paramInt = zzh(paramInt << 3);
    return zza(paramString) + paramInt;
  }
  
  public static int zza(int paramInt, boolean paramBoolean)
  {
    return zzh(paramInt << 3) + 1;
  }
  
  public static int zza(long paramLong)
  {
    return 8;
  }
  
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    int i = paramzzaiw.zzb();
    return zzh(i) + i;
  }
  
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzakv paramzzakv)
  {
    int i = paramzzakv.zza();
    return zzh(i) + i;
  }
  
  @Deprecated
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    return paramzzaln.zzl();
  }
  
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    int i = ((zzain)paramzzaln).zza(paramzzamc);
    return zzh(i) + i;
  }
  
  public static int zza(String paramString)
  {
    int i;
    try
    {
      i = zzanb.zza(paramString);
    }
    catch (zzane localzzane)
    {
      i = paramString.getBytes(zzaki.zza).length;
    }
    return zzh(i) + i;
  }
  
  public static int zza(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int zza(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zzh(i) + i;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzajo zza(OutputStream paramOutputStream, int paramInt)
  {
    return new zzc(paramOutputStream, paramInt);
  }
  
  public static int zzb(int paramInt)
  {
    return 4;
  }
  
  public static int zzb(int paramInt1, int paramInt2)
  {
    return zzh(paramInt1 << 3) + 4;
  }
  
  public static int zzb(int paramInt, long paramLong)
  {
    paramInt = zzh(paramInt << 3);
    return zze(paramLong) + paramInt;
  }
  
  public static int zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    int i = zzh(8);
    paramInt = zzf(2, paramInt);
    return zza(3, paramzzaiw) + (paramInt + (i << 1));
  }
  
  public static int zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzakv paramzzakv)
  {
    paramInt = zzh(paramInt << 3);
    int i = paramzzakv.zza();
    return zzh(i) + i + paramInt;
  }
  
  public static int zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    paramInt = zzh(paramInt << 3);
    return zza(paramzzaln, paramzzamc) + paramInt;
  }
  
  public static int zzb(long paramLong)
  {
    return zze(paramLong);
  }
  
  public static int zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    int i = paramzzaln.zzl();
    return zzh(i) + i;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzajo zzb(byte[] paramArrayOfByte)
  {
    return new zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int zzc(int paramInt)
  {
    return zze(paramInt);
  }
  
  public static int zzc(int paramInt1, int paramInt2)
  {
    paramInt1 = zzh(paramInt1 << 3);
    return zze(paramInt2) + paramInt1;
  }
  
  public static int zzc(int paramInt, long paramLong)
  {
    return zzh(paramInt << 3) + 8;
  }
  
  public static int zzc(long paramLong)
  {
    return 8;
  }
  
  public static int zzd(int paramInt)
  {
    if (paramInt > 4096) {
      return 4096;
    }
    return paramInt;
  }
  
  public static int zzd(int paramInt1, int paramInt2)
  {
    return zzh(paramInt1 << 3) + 4;
  }
  
  public static int zzd(int paramInt, long paramLong)
  {
    paramInt = zzh(paramInt << 3);
    return zze(zzi(paramLong)) + paramInt;
  }
  
  public static int zzd(long paramLong)
  {
    return zze(zzi(paramLong));
  }
  
  public static int zze(int paramInt)
  {
    return 4;
  }
  
  public static int zze(int paramInt1, int paramInt2)
  {
    paramInt1 = zzh(paramInt1 << 3);
    return zzh(zzm(paramInt2)) + paramInt1;
  }
  
  public static int zze(int paramInt, long paramLong)
  {
    paramInt = zzh(paramInt << 3);
    return zze(paramLong) + paramInt;
  }
  
  public static int zze(long paramLong)
  {
    return 640 - Long.numberOfLeadingZeros(paramLong) * 9 >>> 6;
  }
  
  public static int zzf(int paramInt)
  {
    return zzh(zzm(paramInt));
  }
  
  public static int zzf(int paramInt1, int paramInt2)
  {
    paramInt1 = zzh(paramInt1 << 3);
    return zzh(paramInt2) + paramInt1;
  }
  
  public static int zzg(int paramInt)
  {
    return zzh(paramInt << 3);
  }
  
  public static int zzh(int paramInt)
  {
    return 352 - Integer.numberOfLeadingZeros(paramInt) * 9 >>> 6;
  }
  
  private static long zzi(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  private static int zzm(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public abstract int zza();
  
  public abstract void zza(byte paramByte);
  
  public final void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzane paramzzane)
  {
    zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzzane);
    paramString = paramString.getBytes(zzaki.zza);
    try
    {
      zzl(paramString.length);
      zza(paramString, 0, paramString.length);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzd(paramString);
    }
  }
  
  public final void zzb()
  {
    if (zza() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void zzb(double paramDouble)
  {
    zzf(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zzb(float paramFloat)
  {
    zzi(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void zzb(int paramInt, double paramDouble)
  {
    zzf(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zzb(int paramInt, float paramFloat)
  {
    zzg(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln);
  
  public abstract void zzb(int paramInt, String paramString);
  
  public abstract void zzb(int paramInt, boolean paramBoolean);
  
  public abstract void zzb(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw);
  
  public abstract void zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc);
  
  public abstract void zzb(String paramString);
  
  public final void zzb(boolean paramBoolean)
  {
    zza((byte)paramBoolean);
  }
  
  public abstract void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void zzc();
  
  public abstract void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw);
  
  public abstract void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc);
  
  public abstract void zzc(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln);
  
  public abstract void zzd(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw);
  
  public abstract void zzf(int paramInt, long paramLong);
  
  public abstract void zzf(long paramLong);
  
  public abstract void zzg(int paramInt1, int paramInt2);
  
  public final void zzg(int paramInt, long paramLong)
  {
    zzh(paramInt, zzi(paramLong));
  }
  
  public final void zzg(long paramLong)
  {
    zzh(zzi(paramLong));
  }
  
  public abstract void zzh(int paramInt1, int paramInt2);
  
  public abstract void zzh(int paramInt, long paramLong);
  
  public abstract void zzh(long paramLong);
  
  public abstract void zzi(int paramInt);
  
  public final void zzi(int paramInt1, int paramInt2)
  {
    zzk(paramInt1, zzm(paramInt2));
  }
  
  public abstract void zzj(int paramInt);
  
  public abstract void zzj(int paramInt1, int paramInt2);
  
  public final void zzk(int paramInt)
  {
    zzl(zzm(paramInt));
  }
  
  public abstract void zzk(int paramInt1, int paramInt2);
  
  public abstract void zzl(int paramInt);
  
  public static final class zza
    extends zzajo
  {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;
    
    public zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
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
        throw new zzajo.zzd(zzd, zzc, paramInt2, paramArrayOfByte);
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
        throw new zzajo.zzd(i, zzc, 1, localIndexOutOfBoundsException);
      }
    }
    
    public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      zzc(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
    {
      zzj(1, 3);
      zzk(2, paramInt);
      zzj(3, 2);
      zzc(paramzzaln);
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
    
    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzl(paramzzaiw.zzb());
      paramzzaiw.zza(this);
    }
    
    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
    {
      zzl(((zzain)paramzzaln).zza(paramzzamc));
      paramzzamc.zza(paramzzaln, zza);
    }
    
    public final void zzb(String paramString)
    {
      int i = zzd;
      try
      {
        int j = zzajo.zzh(paramString.length() * 3);
        int k = zzajo.zzh(paramString.length());
        if (k == j)
        {
          j = i + k;
          zzd = j;
          j = zzanb.zza(paramString, zzb, j, zza());
          zzd = i;
          zzl(j - i - k);
          zzd = j;
          return;
        }
        zzl(zzanb.zza(paramString));
        zzd = zzanb.zza(paramString, zzb, zzd, zza());
        return;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new zzajo.zzd(paramString);
      }
      catch (zzane localzzane)
      {
        zzd = i;
        zza(paramString, localzzane);
      }
    }
    
    public final void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      zzl(paramInt2);
      zzc(paramArrayOfByte, 0, paramInt2);
    }
    
    public final void zzc() {}
    
    public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzj(paramInt, 2);
      zzb(paramzzaiw);
    }
    
    public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
    {
      zzj(paramInt, 2);
      zzl(((zzain)paramzzaln).zza(paramzzamc));
      paramzzamc.zza(paramzzaln, zza);
    }
    
    public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
    {
      zzl(paramzzaln.zzl());
      paramzzaln.zza(this);
    }
    
    public final void zzd(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzj(1, 3);
      zzk(2, paramInt);
      zzc(3, paramzzaiw);
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
        throw new zzajo.zzd(i, zzc, 8, localIndexOutOfBoundsException);
      }
    }
    
    public final void zzg(int paramInt1, int paramInt2)
    {
      zzj(paramInt1, 5);
      zzi(paramInt2);
    }
    
    public final void zzh(int paramInt1, int paramInt2)
    {
      zzj(paramInt1, 0);
      zzj(paramInt2);
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
      if (zzajo.zzd())
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
              zzana.zza(arrayOfByte, j, (byte)(int)paramLong);
              j = i;
              break;
            }
            zzana.zza(zzb, j, (byte)((int)paramLong | 0x80));
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
          throw new zzajo.zzd(j, zzc, 1, localIndexOutOfBoundsException);
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
        throw new zzajo.zzd(i, zzc, 4, localIndexOutOfBoundsException);
      }
    }
    
    public final void zzj(int paramInt)
    {
      if (paramInt >= 0)
      {
        zzl(paramInt);
        return;
      }
      zzh(paramInt);
    }
    
    public final void zzj(int paramInt1, int paramInt2)
    {
      zzl(paramInt1 << 3 | paramInt2);
    }
    
    public final void zzk(int paramInt1, int paramInt2)
    {
      zzj(paramInt1, 0);
      zzl(paramInt2);
    }
    
    public final void zzl(int paramInt)
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
          throw new zzajo.zzd(paramInt, zzc, 1, localIndexOutOfBoundsException);
        }
        arrayOfByte = zzb;
        i = (byte)(j | 0x80);
        arrayOfByte[paramInt] = ((byte)i);
        j >>>= 7;
      }
    }
  }
  
  public static abstract class zzb
    extends zzajo
  {
    public final byte[] zzb;
    public final int zzc;
    public int zzd;
    public int zze;
    
    public zzb(int paramInt)
    {
      super();
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
  
  public static final class zzc
    extends zzajo.zzb
  {
    private final OutputStream zzf;
    
    public zzc(OutputStream paramOutputStream, int paramInt)
    {
      super();
      if (paramOutputStream != null)
      {
        zzf = paramOutputStream;
        return;
      }
      throw new NullPointerException("out");
    }
    
    private final void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int i = zzc;
      int j = zzd;
      if (i - j >= paramInt2)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, zzb, j, paramInt2);
        zzd += paramInt2;
      }
      else
      {
        i -= j;
        System.arraycopy(paramArrayOfByte, paramInt1, zzb, j, i);
        paramInt1 += i;
        paramInt2 -= i;
        zzd = zzc;
        zze += i;
        zze();
        if (paramInt2 <= zzc)
        {
          System.arraycopy(paramArrayOfByte, paramInt1, zzb, 0, paramInt2);
          zzd = paramInt2;
        }
        else
        {
          zzf.write(paramArrayOfByte, paramInt1, paramInt2);
        }
      }
      zze += paramInt2;
    }
    
    private final void zze()
    {
      zzf.write(zzb, 0, zzd);
      zzd = 0;
    }
    
    private final void zzo(int paramInt)
    {
      if (zzc - zzd < paramInt) {
        zze();
      }
    }
    
    public final void zza(byte paramByte)
    {
      if (zzd == zzc) {
        zze();
      }
      zzb(paramByte);
    }
    
    public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      zzc(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
    {
      zzj(1, 3);
      zzk(2, paramInt);
      zzj(3, 2);
      zzc(paramzzaln);
      zzj(1, 4);
    }
    
    public final void zzb(int paramInt, String paramString)
    {
      zzj(paramInt, 2);
      zzb(paramString);
    }
    
    public final void zzb(int paramInt, boolean paramBoolean)
    {
      zzo(11);
      zzl(paramInt, 0);
      zzb((byte)paramBoolean);
    }
    
    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzl(paramzzaiw.zzb());
      paramzzaiw.zza(this);
    }
    
    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
    {
      zzl(((zzain)paramzzaln).zza(paramzzamc));
      paramzzamc.zza(paramzzaln, zza);
    }
    
    public final void zzb(String paramString)
    {
      try
      {
        int i = paramString.length() * 3;
        int j = zzajo.zzh(i);
        int k = j + i;
        int m = zzc;
        if (k > m)
        {
          byte[] arrayOfByte = new byte[i];
          j = zzanb.zza(paramString, arrayOfByte, 0, i);
          zzl(j);
          zza(arrayOfByte, 0, j);
          return;
        }
        if (k > m - zzd) {
          zze();
        }
        m = zzajo.zzh(paramString.length());
        k = zzd;
        if (m == j) {
          j = k + m;
        }
        try
        {
          zzd = j;
          i = zzanb.zza(paramString, zzb, j, zzc - j);
          zzd = k;
          j = i - k - m;
          zzn(j);
          zzd = i;
          break label176;
          j = zzanb.zza(paramString);
          zzn(j);
          zzd = zzanb.zza(paramString, zzb, zzd, j);
          label176:
          zze += j;
          return;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          zzajo.zzd localzzd = new com/google/android/gms/internal/firebase_auth_api/zzajo$zzd;
          localzzd.<init>(localArrayIndexOutOfBoundsException);
          throw localzzd;
        }
        catch (zzane localzzane1)
        {
          zze -= zzd - k;
          zzd = k;
          throw localzzane1;
        }
        return;
      }
      catch (zzane localzzane2)
      {
        zza(paramString, localzzane2);
      }
    }
    
    public final void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      zzl(paramInt2);
      zzc(paramArrayOfByte, 0, paramInt2);
    }
    
    public final void zzc()
    {
      if (zzd > 0) {
        zze();
      }
    }
    
    public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzj(paramInt, 2);
      zzb(paramzzaiw);
    }
    
    public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
    {
      zzj(paramInt, 2);
      zzb(paramzzaln, paramzzamc);
    }
    
    public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
    {
      zzl(paramzzaln.zzl());
      paramzzaln.zza(this);
    }
    
    public final void zzd(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzj(1, 3);
      zzk(2, paramInt);
      zzc(3, paramzzaiw);
      zzj(1, 4);
    }
    
    public final void zzf(int paramInt, long paramLong)
    {
      zzo(18);
      zzl(paramInt, 1);
      zzi(paramLong);
    }
    
    public final void zzf(long paramLong)
    {
      zzo(8);
      zzi(paramLong);
    }
    
    public final void zzg(int paramInt1, int paramInt2)
    {
      zzo(14);
      zzl(paramInt1, 5);
      zzm(paramInt2);
    }
    
    public final void zzh(int paramInt1, int paramInt2)
    {
      zzo(20);
      zzl(paramInt1, 0);
      if (paramInt2 >= 0)
      {
        zzn(paramInt2);
        return;
      }
      zzj(paramInt2);
    }
    
    public final void zzh(int paramInt, long paramLong)
    {
      zzo(20);
      zzl(paramInt, 0);
      zzj(paramLong);
    }
    
    public final void zzh(long paramLong)
    {
      zzo(10);
      zzj(paramLong);
    }
    
    public final void zzi(int paramInt)
    {
      zzo(4);
      zzm(paramInt);
    }
    
    public final void zzj(int paramInt)
    {
      if (paramInt >= 0)
      {
        zzl(paramInt);
        return;
      }
      zzh(paramInt);
    }
    
    public final void zzj(int paramInt1, int paramInt2)
    {
      zzl(paramInt1 << 3 | paramInt2);
    }
    
    public final void zzk(int paramInt1, int paramInt2)
    {
      zzo(20);
      zzl(paramInt1, 0);
      zzn(paramInt2);
    }
    
    public final void zzl(int paramInt)
    {
      zzo(5);
      zzn(paramInt);
    }
  }
  
  public static final class zzd
    extends IOException
  {
    public zzd()
    {
      super();
    }
    
    public zzd(int paramInt1, int paramInt2, int paramInt3, Throwable paramThrowable)
    {
      this(paramInt1, paramInt2, paramInt3, paramThrowable);
    }
    
    private zzd(long paramLong1, long paramLong2, int paramInt, Throwable paramThrowable)
    {
      this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) }), paramThrowable);
    }
    
    private zzd(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public zzd(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
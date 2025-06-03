package com.google.android.gms.internal.measurement;

import f;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzjn
  extends zziv
{
  private static final Logger zzb = Logger.getLogger(zzjn.class.getName());
  private static final boolean zzc = zzmz.zzc();
  public zzjp zza;
  
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
    return zzg(paramInt << 3) + 8;
  }
  
  public static int zza(int paramInt, float paramFloat)
  {
    return zzg(paramInt << 3) + 4;
  }
  
  public static int zza(int paramInt1, int paramInt2)
  {
    paramInt1 = zzg(paramInt1 << 3);
    return zze(paramInt2) + paramInt1;
  }
  
  public static int zza(int paramInt, long paramLong)
  {
    return zzg(paramInt << 3) + 8;
  }
  
  public static int zza(int paramInt, zziy paramzziy)
  {
    paramInt = zzg(paramInt << 3);
    int i = paramzziy.zzb();
    return zzg(i) + i + paramInt;
  }
  
  public static int zza(int paramInt, zzku paramzzku)
  {
    int i = zzg(8);
    paramInt = zzf(2, paramInt);
    return zzb(3, paramzzku) + (paramInt + (i << 1));
  }
  
  public static int zza(int paramInt, zzlm paramzzlm)
  {
    int i = zzg(8);
    paramInt = zzf(2, paramInt);
    int j = zzg(24);
    return zzb(paramzzlm) + j + (paramInt + (i << 1));
  }
  
  @Deprecated
  public static int zza(int paramInt, zzlm paramzzlm, zzme paramzzme)
  {
    paramInt = zzg(paramInt << 3);
    return ((zzio)paramzzlm).zza(paramzzme) + (paramInt << 1);
  }
  
  public static int zza(int paramInt, String paramString)
  {
    paramInt = zzg(paramInt << 3);
    return zza(paramString) + paramInt;
  }
  
  public static int zza(int paramInt, boolean paramBoolean)
  {
    return zzg(paramInt << 3) + 1;
  }
  
  public static int zza(long paramLong)
  {
    return 8;
  }
  
  public static int zza(zziy paramzziy)
  {
    int i = paramzziy.zzb();
    return zzg(i) + i;
  }
  
  public static int zza(zzku paramzzku)
  {
    int i = paramzzku.zza();
    return zzg(i) + i;
  }
  
  @Deprecated
  public static int zza(zzlm paramzzlm)
  {
    return paramzzlm.zzcf();
  }
  
  public static int zza(zzlm paramzzlm, zzme paramzzme)
  {
    int i = ((zzio)paramzzlm).zza(paramzzme);
    return zzg(i) + i;
  }
  
  public static int zza(String paramString)
  {
    int i;
    try
    {
      i = zzna.zza(paramString);
    }
    catch (zznd localzznd)
    {
      i = paramString.getBytes(zzkj.zza).length;
    }
    return zzg(i) + i;
  }
  
  public static int zza(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int zza(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zzg(i) + i;
  }
  
  public static int zzb(int paramInt)
  {
    return 4;
  }
  
  public static int zzb(int paramInt1, int paramInt2)
  {
    return zzg(paramInt1 << 3) + 4;
  }
  
  public static int zzb(int paramInt, long paramLong)
  {
    paramInt = zzg(paramInt << 3);
    return zze(paramLong) + paramInt;
  }
  
  public static int zzb(int paramInt, zziy paramzziy)
  {
    int i = zzg(8);
    paramInt = zzf(2, paramInt);
    return zza(3, paramzziy) + (paramInt + (i << 1));
  }
  
  public static int zzb(int paramInt, zzku paramzzku)
  {
    paramInt = zzg(paramInt << 3);
    int i = paramzzku.zza();
    return zzg(i) + i + paramInt;
  }
  
  public static int zzb(int paramInt, zzlm paramzzlm, zzme paramzzme)
  {
    paramInt = zzg(paramInt << 3);
    return zza(paramzzlm, paramzzme) + paramInt;
  }
  
  public static int zzb(long paramLong)
  {
    return zze(paramLong);
  }
  
  public static int zzb(zzlm paramzzlm)
  {
    int i = paramzzlm.zzcf();
    return zzg(i) + i;
  }
  
  public static zzjn zzb(byte[] paramArrayOfByte)
  {
    return new zzb(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int zzc(int paramInt)
  {
    return zze(paramInt);
  }
  
  public static int zzc(int paramInt1, int paramInt2)
  {
    paramInt1 = zzg(paramInt1 << 3);
    return zze(paramInt2) + paramInt1;
  }
  
  public static int zzc(int paramInt, long paramLong)
  {
    return zzg(paramInt << 3) + 8;
  }
  
  public static int zzc(long paramLong)
  {
    return 8;
  }
  
  public static int zzd(int paramInt)
  {
    return 4;
  }
  
  public static int zzd(int paramInt1, int paramInt2)
  {
    return zzg(paramInt1 << 3) + 4;
  }
  
  public static int zzd(int paramInt, long paramLong)
  {
    paramInt = zzg(paramInt << 3);
    return zze(zzi(paramLong)) + paramInt;
  }
  
  public static int zzd(long paramLong)
  {
    return zze(zzi(paramLong));
  }
  
  public static int zze(int paramInt)
  {
    return zzg(zzl(paramInt));
  }
  
  public static int zze(int paramInt1, int paramInt2)
  {
    paramInt1 = zzg(paramInt1 << 3);
    return zzg(zzl(paramInt2)) + paramInt1;
  }
  
  public static int zze(int paramInt, long paramLong)
  {
    paramInt = zzg(paramInt << 3);
    return zze(paramLong) + paramInt;
  }
  
  public static int zze(long paramLong)
  {
    return 640 - Long.numberOfLeadingZeros(paramLong) * 9 >>> 6;
  }
  
  public static int zzf(int paramInt)
  {
    return zzg(paramInt << 3);
  }
  
  public static int zzf(int paramInt1, int paramInt2)
  {
    paramInt1 = zzg(paramInt1 << 3);
    return zzg(paramInt2) + paramInt1;
  }
  
  public static int zzg(int paramInt)
  {
    return 352 - Integer.numberOfLeadingZeros(paramInt) * 9 >>> 6;
  }
  
  private static long zzi(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  private static int zzl(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public abstract int zza();
  
  public abstract void zza(byte paramByte);
  
  public final void zza(String paramString, zznd paramzznd)
  {
    zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzznd);
    paramString = paramString.getBytes(zzkj.zza);
    try
    {
      zzk(paramString.length);
      zza(paramString, 0, paramString.length);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zza(paramString);
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
    zzh(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void zzb(int paramInt, double paramDouble)
  {
    zzf(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zzb(int paramInt, float paramFloat)
  {
    zzg(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void zzb(int paramInt, zzlm paramzzlm);
  
  public abstract void zzb(int paramInt, String paramString);
  
  public abstract void zzb(int paramInt, boolean paramBoolean);
  
  public abstract void zzb(zziy paramzziy);
  
  public abstract void zzb(String paramString);
  
  public final void zzb(boolean paramBoolean)
  {
    zza((byte)paramBoolean);
  }
  
  public abstract void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void zzc(int paramInt, zziy paramzziy);
  
  public abstract void zzc(int paramInt, zzlm paramzzlm, zzme paramzzme);
  
  public abstract void zzc(zzlm paramzzlm);
  
  public abstract void zzd(int paramInt, zziy paramzziy);
  
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
  
  public abstract void zzh(int paramInt);
  
  public abstract void zzh(int paramInt1, int paramInt2);
  
  public abstract void zzh(int paramInt, long paramLong);
  
  public abstract void zzh(long paramLong);
  
  public abstract void zzi(int paramInt);
  
  public final void zzi(int paramInt1, int paramInt2)
  {
    zzk(paramInt1, zzl(paramInt2));
  }
  
  public final void zzj(int paramInt)
  {
    zzk(zzl(paramInt));
  }
  
  public abstract void zzj(int paramInt1, int paramInt2);
  
  public abstract void zzk(int paramInt);
  
  public abstract void zzk(int paramInt1, int paramInt2);
  
  public static final class zza
    extends IOException
  {
    public zza()
    {
      super();
    }
    
    public zza(int paramInt1, int paramInt2, int paramInt3, Throwable paramThrowable)
    {
      this(paramInt1, paramInt2, paramInt3, paramThrowable);
    }
    
    private zza(long paramLong1, long paramLong2, int paramInt, Throwable paramThrowable)
    {
      this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) }), paramThrowable);
    }
    
    private zza(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public zza(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static final class zzb
    extends zzjn
  {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;
    
    public zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
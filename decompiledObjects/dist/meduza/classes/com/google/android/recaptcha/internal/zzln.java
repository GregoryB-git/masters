package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzln
  extends zzkw
{
  private static final Logger zzb = Logger.getLogger(zzln.class.getName());
  private static final boolean zzc = zzps.zzx();
  public zzlo zza;
  
  public static int zzA(int paramInt)
  {
    return 352 - Integer.numberOfLeadingZeros(paramInt) * 9 >>> 6;
  }
  
  public static int zzB(long paramLong)
  {
    return 640 - Long.numberOfLeadingZeros(paramLong) * 9 >>> 6;
  }
  
  @Deprecated
  public static int zzw(int paramInt, zzoi paramzzoi, zzow paramzzow)
  {
    paramInt = zzA(paramInt << 3);
    return ((zzko)paramzzoi).zza(paramzzow) + (paramInt + paramInt);
  }
  
  public static int zzx(zzoi paramzzoi)
  {
    int i = paramzzoi.zzo();
    return zzA(i) + i;
  }
  
  public static int zzy(zzoi paramzzoi, zzow paramzzow)
  {
    int i = ((zzko)paramzzoi).zza(paramzzow);
    return zzA(i) + i;
  }
  
  public static int zzz(String paramString)
  {
    int i;
    try
    {
      i = zzpv.zzc(paramString);
    }
    catch (zzpu localzzpu)
    {
      i = paramString.getBytes(zznl.zza).length;
    }
    return zzA(i) + i;
  }
  
  public final void zzC()
  {
    if (zza() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void zzD(String paramString, zzpu paramzzpu)
  {
    zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzzpu);
    paramString = paramString.getBytes(zznl.zza);
    try
    {
      int i = paramString.length;
      zzt(i);
      zzl(paramString, 0, i);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzll(paramString);
    }
  }
  
  public abstract int zza();
  
  public abstract void zzb(byte paramByte);
  
  public abstract void zzd(int paramInt, boolean paramBoolean);
  
  public abstract void zze(int paramInt, zzle paramzzle);
  
  public abstract void zzf(int paramInt1, int paramInt2);
  
  public abstract void zzg(int paramInt);
  
  public abstract void zzh(int paramInt, long paramLong);
  
  public abstract void zzi(long paramLong);
  
  public abstract void zzj(int paramInt1, int paramInt2);
  
  public abstract void zzk(int paramInt);
  
  public abstract void zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void zzm(int paramInt, zzoi paramzzoi, zzow paramzzow);
  
  public abstract void zzn(int paramInt, zzoi paramzzoi);
  
  public abstract void zzo(int paramInt, zzle paramzzle);
  
  public abstract void zzp(int paramInt, String paramString);
  
  public abstract void zzr(int paramInt1, int paramInt2);
  
  public abstract void zzs(int paramInt1, int paramInt2);
  
  public abstract void zzt(int paramInt);
  
  public abstract void zzu(int paramInt, long paramLong);
  
  public abstract void zzv(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzln
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
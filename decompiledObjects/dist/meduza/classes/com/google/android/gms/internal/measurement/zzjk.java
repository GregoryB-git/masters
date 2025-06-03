package com.google.android.gms.internal.measurement;

public abstract class zzjk
{
  private static volatile int zzd = 100;
  public int zza;
  public int zzb;
  public zzjl zzc;
  private int zze = zzd;
  
  public static long zza(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static zzjk zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzjj(paramArrayOfByte, 0, paramInt2, false, null);
    try
    {
      paramArrayOfByte.zza(paramInt2);
      return paramArrayOfByte;
    }
    catch (zzkp paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public static int zze(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public abstract double zza();
  
  public abstract int zza(int paramInt);
  
  public abstract float zzb();
  
  public abstract void zzb(int paramInt);
  
  public abstract int zzc();
  
  public abstract void zzc(int paramInt);
  
  public abstract int zzd();
  
  public abstract boolean zzd(int paramInt);
  
  public abstract int zze();
  
  public abstract int zzf();
  
  public abstract int zzg();
  
  public abstract int zzh();
  
  public abstract int zzi();
  
  public abstract int zzj();
  
  public abstract long zzk();
  
  public abstract long zzl();
  
  public abstract long zzm();
  
  public abstract long zzn();
  
  public abstract long zzo();
  
  public abstract long zzp();
  
  public abstract zziy zzq();
  
  public abstract String zzr();
  
  public abstract String zzs();
  
  public abstract boolean zzt();
  
  public abstract boolean zzu();
  
  public final void zzv()
  {
    if (zza + zzb < zze) {
      return;
    }
    throw zzkp.zzh();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
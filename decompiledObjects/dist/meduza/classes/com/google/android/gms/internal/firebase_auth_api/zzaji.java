package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajm;

public abstract class zzaji
{
  private static volatile int zzd = 100;
  public int zza;
  public int zzb = Integer.MAX_VALUE;
  public zzajm zzc;
  private int zze;
  private int zzf = zzd;
  
  public static int zza(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long zza(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaji zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzajl(paramArrayOfByte, paramInt1, paramInt2, paramBoolean, null);
    try
    {
      paramArrayOfByte.zzb(paramInt2);
      return paramArrayOfByte;
    }
    catch (zzakm paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract double zza();
  
  public abstract float zzb();
  
  public abstract int zzb(int paramInt);
  
  public abstract int zzc();
  
  public abstract void zzc(int paramInt);
  
  public abstract int zzd();
  
  public abstract void zzd(int paramInt);
  
  public abstract int zze();
  
  public abstract boolean zze(int paramInt);
  
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
  
  public abstract zzaiw zzq();
  
  public abstract String zzr();
  
  public abstract String zzs();
  
  public final void zzt()
  {
    if (zza + zze < zzf) {
      return;
    }
    throw zzakm.zzh();
  }
  
  public final void zzu()
  {
    if (zze == 0) {
      zzc(0);
    }
  }
  
  public final void zzv()
  {
    boolean bool;
    do
    {
      int i = zzi();
      if (i == 0) {
        return;
      }
      zzt();
      zze += 1;
      bool = zze(i);
      zze -= 1;
    } while (bool);
  }
  
  public abstract boolean zzw();
  
  public abstract boolean zzx();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaji
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
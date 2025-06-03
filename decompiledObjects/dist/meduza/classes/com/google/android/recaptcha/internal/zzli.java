package com.google.android.recaptcha.internal;

public abstract class zzli
{
  private static volatile int zze = 100;
  public int zza;
  public final int zzb = zze;
  public zzlj zzc;
  
  public static int zzF(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }
  
  public static long zzG(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }
  
  public static zzli zzH(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzlf(paramArrayOfByte, 0, 0, false, null);
    try
    {
      paramArrayOfByte.zze(0);
      return paramArrayOfByte;
    }
    catch (zznn paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract void zzA(int paramInt);
  
  public abstract boolean zzC();
  
  public abstract boolean zzD();
  
  public abstract boolean zzE(int paramInt);
  
  public final void zzI()
  {
    boolean bool;
    do
    {
      int i = zzm();
      if (i == 0) {
        break;
      }
      int j = zza;
      if (j >= zzb) {
        break label53;
      }
      zza = (j + 1);
      bool = zzE(i);
      zza -= 1;
    } while (bool);
    return;
    label53:
    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
  }
  
  public abstract double zzb();
  
  public abstract float zzc();
  
  public abstract int zzd();
  
  public abstract int zze(int paramInt);
  
  public abstract int zzf();
  
  public abstract int zzg();
  
  public abstract int zzh();
  
  public abstract int zzk();
  
  public abstract int zzl();
  
  public abstract int zzm();
  
  public abstract int zzn();
  
  public abstract long zzo();
  
  public abstract long zzp();
  
  public abstract long zzt();
  
  public abstract long zzu();
  
  public abstract long zzv();
  
  public abstract zzle zzw();
  
  public abstract String zzx();
  
  public abstract String zzy();
  
  public abstract void zzz(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzli
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
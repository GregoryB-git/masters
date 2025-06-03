package com.google.android.gms.internal.common;

abstract class zzz
  extends zzm
{
  public final CharSequence zzb;
  public final zzr zzc;
  public final boolean zzd;
  public int zze = 0;
  public int zzf;
  
  public zzz(zzaa paramzzaa, CharSequence paramCharSequence)
  {
    zzc = zzaa.zza(paramzzaa);
    zzd = zzaa.zzg(paramzzaa);
    zzf = Integer.MAX_VALUE;
    zzb = paramCharSequence;
  }
  
  public abstract int zzc(int paramInt);
  
  public abstract int zzd(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.common;

import java.util.List;

final class zzaj
  extends zzak
{
  public final transient int zza;
  public final transient int zzb;
  
  public zzaj(zzak paramzzak, int paramInt1, int paramInt2)
  {
    zza = paramInt1;
    zzb = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzv.zza(paramInt, zzb, "index");
    return zzc.get(paramInt + zza);
  }
  
  public final int size()
  {
    return zzb;
  }
  
  public final int zzb()
  {
    return zzc.zzc() + zza + zzb;
  }
  
  public final int zzc()
  {
    return zzc.zzc() + zza;
  }
  
  public final boolean zzf()
  {
    return true;
  }
  
  public final Object[] zzg()
  {
    return zzc.zzg();
  }
  
  public final zzak zzh(int paramInt1, int paramInt2)
  {
    zzv.zzc(paramInt1, paramInt2, zzb);
    int i = zza;
    return zzc.zzh(paramInt1 + i, paramInt2 + i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
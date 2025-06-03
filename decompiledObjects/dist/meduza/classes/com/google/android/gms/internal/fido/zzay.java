package com.google.android.gms.internal.fido;

import java.util.List;

final class zzay
  extends zzaz
{
  public final transient int zza;
  public final transient int zzb;
  
  public zzay(zzaz paramzzaz, int paramInt1, int paramInt2)
  {
    zza = paramInt1;
    zzb = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzap.zza(paramInt, zzb, "index");
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
  
  public final Object[] zze()
  {
    return zzc.zze();
  }
  
  public final zzaz zzg(int paramInt1, int paramInt2)
  {
    zzap.zze(paramInt1, paramInt2, zzb);
    zzaz localzzaz = zzc;
    int i = zza;
    return localzzaz.zzg(paramInt1 + i, paramInt2 + i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
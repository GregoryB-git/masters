package com.google.android.gms.internal.measurement;

public final class zzoi
  implements zzof
{
  private static final zzhx<Boolean> zza;
  private static final zzhx<Boolean> zzb;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.collection.event_safelist", true);
    zza = localzzif.zza("measurement.service.store_null_safelist", true);
    zzb = localzzif.zza("measurement.service.store_safelist", true);
  }
  
  public final boolean zza()
  {
    return true;
  }
  
  public final boolean zzb()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
  
  public final boolean zzc()
  {
    return ((Boolean)zzb.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzoi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
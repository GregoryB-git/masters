package com.google.android.gms.internal.measurement;

public final class zzoj
  implements zzok
{
  private static final zzhx<Boolean> zza;
  private static final zzhx<Boolean> zzb;
  private static final zzhx<Boolean> zzc;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
    zza = localzzif.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
    zzb = localzzif.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
    zzc = localzzif.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
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
  
  public final boolean zzd()
  {
    return ((Boolean)zzc.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzoj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
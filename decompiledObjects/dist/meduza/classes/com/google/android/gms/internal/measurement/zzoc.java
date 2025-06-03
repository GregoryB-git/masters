package com.google.android.gms.internal.measurement;

public final class zzoc
  implements zznz
{
  private static final zzhx<Boolean> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.set_default_event_parameters_with_backfill.client.dev", false);
    localzzif.zza("measurement.defensively_copy_bundles_validate_default_params", true);
    localzzif.zza("measurement.set_default_event_parameters_with_backfill.service", true);
    zza = localzzif.zza("measurement.set_default_event_parameters.fix_deferred_analytics_collection", false);
    localzzif.zza("measurement.id.set_default_event_parameters.fix_deferred_analytics_collection", 0L);
    localzzif.zza("measurement.set_default_event_parameters.fix_subsequent_launches", true);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzoc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
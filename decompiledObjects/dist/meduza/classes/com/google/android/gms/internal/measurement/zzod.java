package com.google.android.gms.internal.measurement;

public final class zzod
  implements zzoe
{
  private static final zzhx<Boolean> zza;
  private static final zzhx<Boolean> zzb;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    zza = localzzif.zza("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
    zzb = localzzif.zza("measurement.set_default_event_parameters_propagate_clear.service", false);
    localzzif.zza("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
  
  public final boolean zzb()
  {
    return ((Boolean)zzb.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

public final class zzop
  implements zzoq
{
  private static final zzhx<Boolean> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.gmscore_feature_tracking", true);
    zza = localzzif.zza("measurement.gmscore_client_telemetry", false);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzop
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
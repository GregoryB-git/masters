package com.google.android.gms.internal.measurement;

public final class zznx
  implements zzny
{
  private static final zzhx<Long> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.client.consent_state_v1", true);
    localzzif.zza("measurement.client.3p_consent_state_v1", true);
    localzzif.zza("measurement.service.consent_state_v1_W36", true);
    zza = localzzif.zza("measurement.service.storage_consent_support_version", 203600L);
  }
  
  public final long zza()
  {
    return ((Long)zza.zza()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zznx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
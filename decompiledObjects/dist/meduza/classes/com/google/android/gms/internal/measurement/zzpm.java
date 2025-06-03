package com.google.android.gms.internal.measurement;

public final class zzpm
  implements zzpj
{
  private static final zzhx<Boolean> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.client.sessions.background_sessions_enabled", true);
    zza = localzzif.zza("measurement.client.sessions.enable_fix_background_engagement", false);
    localzzif.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
    localzzif.zza("measurement.client.sessions.enable_pause_engagement_in_background", true);
    localzzif.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
    localzzif.zza("measurement.client.sessions.session_id_enabled", true);
    localzzif.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzpm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
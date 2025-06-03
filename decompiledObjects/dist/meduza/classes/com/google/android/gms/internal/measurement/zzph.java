package com.google.android.gms.internal.measurement;

public final class zzph
  implements zzpi
{
  private static final zzhx<Boolean> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
    localzzif.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
    zza = localzzif.zza("measurement.session_stitching_token_enabled", false);
    localzzif.zza("measurement.link_sst_to_sid", true);
  }
  
  public final boolean zza()
  {
    return true;
  }
  
  public final boolean zzb()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzph
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
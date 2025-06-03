package com.google.android.gms.internal.measurement;

public final class zzpn
  implements zzpo
{
  private static final zzhx<Boolean> zza;
  private static final zzhx<Boolean> zzb;
  private static final zzhx<Boolean> zzc;
  private static final zzhx<Boolean> zzd;
  private static final zzhx<Boolean> zze;
  private static final zzhx<Boolean> zzf;
  private static final zzhx<Boolean> zzg;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    zza = localzzif.zza("measurement.sgtm.client.scion_upload_action.dev", false);
    zzb = localzzif.zza("measurement.sgtm.client.upload_on_backgrounded.dev", false);
    zzc = localzzif.zza("measurement.sgtm.google_signal.enable", false);
    zzd = localzzif.zza("measurement.sgtm.no_proxy.client.dev", false);
    zze = localzzif.zza("measurement.sgtm.no_proxy.service", false);
    localzzif.zza("measurement.sgtm.preview_mode_enabled", true);
    localzzif.zza("measurement.sgtm.rollout_percentage_fix", true);
    localzzif.zza("measurement.sgtm.service", true);
    zzf = localzzif.zza("measurement.sgtm.service.batching_on_backgrounded", false);
    zzg = localzzif.zza("measurement.sgtm.upload_queue", false);
    localzzif.zza("measurement.id.sgtm", 0L);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
  
  public final boolean zzb()
  {
    return ((Boolean)zzb.zza()).booleanValue();
  }
  
  public final boolean zzc()
  {
    return ((Boolean)zzc.zza()).booleanValue();
  }
  
  public final boolean zzd()
  {
    return ((Boolean)zzd.zza()).booleanValue();
  }
  
  public final boolean zze()
  {
    return ((Boolean)zze.zza()).booleanValue();
  }
  
  public final boolean zzf()
  {
    return ((Boolean)zzf.zza()).booleanValue();
  }
  
  public final boolean zzg()
  {
    return ((Boolean)zzg.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzpn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
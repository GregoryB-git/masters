package com.google.android.gms.internal.auth;

public final class zzhv
  implements zzhu
{
  public static final zzdc zza;
  public static final zzdc zzb;
  public static final zzdc zzc;
  public static final zzdc zzd;
  public static final zzdc zze;
  
  static
  {
    zzcz localzzcz = new zzcz(zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
    zza = localzzcz.zze("Aang__create_auth_exception_with_pending_intent", false);
    zzb = localzzcz.zze("Aang__enable_add_account_restrictions", false);
    zzc = localzzcz.zze("Aang__log_missing_gaia_id_event", true);
    zzd = localzzcz.zze("Aang__log_obfuscated_gaiaid_status", true);
    zze = localzzcz.zze("Aang__switch_clear_token_to_aang", false);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zzb()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
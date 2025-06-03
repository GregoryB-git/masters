package com.google.android.gms.internal.auth;

import android.util.Base64;

public final class zzhz
  implements zzhx
{
  public static final zzdc zza;
  public static final zzdc zzb;
  public static final zzdc zzc;
  public static final zzdc zzd;
  public static final zzdc zze;
  public static final zzdc zzf;
  public static final zzdc zzg;
  public static final zzdc zzh;
  public static final zzdc zzi;
  public static final zzdc zzj;
  public static final zzdc zzk;
  public static final zzdc zzl;
  public static final zzdc zzm;
  
  static
  {
    zzcz localzzcz = new zzcz(zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
    zza = localzzcz.zzc("getTokenRefactor__account_data_service_sample_percentage", 0.0D);
    zzb = localzzcz.zze("getTokenRefactor__account_data_service_tokenAPI_usable", true);
    zzc = localzzcz.zzd("getTokenRefactor__account_manager_timeout_seconds", 20L);
    zzd = localzzcz.zzd("getTokenRefactor__android_id_shift", 0L);
    try
    {
      zze = localzzcz.zzf("getTokenRefactor__blocked_packages", zzhs.zzp(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), zzhy.zza);
      zzf = localzzcz.zze("getTokenRefactor__chimera_get_token_evolved", true);
      zzg = localzzcz.zzd("getTokenRefactor__clear_token_timeout_seconds", 20L);
      zzh = localzzcz.zzd("getTokenRefactor__default_task_timeout_seconds", 20L);
      zzi = localzzcz.zze("getTokenRefactor__gaul_accounts_api_evolved", false);
      zzj = localzzcz.zze("getTokenRefactor__gaul_token_api_evolved", false);
      zzk = localzzcz.zzd("getTokenRefactor__get_token_timeout_seconds", 120L);
      zzl = localzzcz.zze("getTokenRefactor__gms_account_authenticator_evolved", true);
      zzm = localzzcz.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0D);
      return;
    }
    catch (Exception localException)
    {
      throw new AssertionError(localException);
    }
  }
  
  public final zzhs zza()
  {
    return (zzhs)zze.zzb();
  }
  
  public final boolean zzb()
  {
    return ((Boolean)zzi.zzb()).booleanValue();
  }
  
  public final boolean zzc()
  {
    return ((Boolean)zzj.zzb()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
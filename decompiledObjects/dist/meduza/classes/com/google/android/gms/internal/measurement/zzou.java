package com.google.android.gms.internal.measurement;

public final class zzou
  implements zzor
{
  private static final zzhx<Boolean> zza;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    localzzif.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
    localzzif.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
    zza = localzzif.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
    localzzif.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
  }
  
  public final boolean zza()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzou
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
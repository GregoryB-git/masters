package com.google.android.gms.internal.measurement;

public final class zzov
  implements zzow
{
  private static final zzhx<Boolean> zza;
  private static final zzhx<Long> zzb;
  private static final zzhx<Double> zzc;
  private static final zzhx<Long> zzd;
  private static final zzhx<Long> zze;
  private static final zzhx<String> zzf;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    zza = localzzif.zza("measurement.test.boolean_flag", false);
    zzb = localzzif.zza("measurement.test.cached_long_flag", -1L);
    zzc = localzzif.zza("measurement.test.double_flag", -3.0D);
    zzd = localzzif.zza("measurement.test.int_flag", -2L);
    zze = localzzif.zza("measurement.test.long_flag", -1L);
    zzf = localzzif.zza("measurement.test.string_flag", "---");
  }
  
  public final double zza()
  {
    return ((Double)zzc.zza()).doubleValue();
  }
  
  public final long zzb()
  {
    return ((Long)zzb.zza()).longValue();
  }
  
  public final long zzc()
  {
    return ((Long)zzd.zza()).longValue();
  }
  
  public final long zzd()
  {
    return ((Long)zze.zza()).longValue();
  }
  
  public final String zze()
  {
    return (String)zzf.zza();
  }
  
  public final boolean zzf()
  {
    return ((Boolean)zza.zza()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzov
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class zzr
  extends zzal
{
  private final zzv zzk;
  
  public zzr(zzv paramzzv)
  {
    super("internal.logger");
    zzk = paramzzv;
    zzb.put("log", new zzu(this, false, true));
    zzb.put("silent", new zzq(this, "silent"));
    ((zzal)zzb.get("silent")).zza("log", new zzu(this, true, true));
    zzb.put("unmonitored", new zzt(this, "unmonitored"));
    ((zzal)zzb.get("unmonitored")).zza("log", new zzu(this, false, false));
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    return zzaq.zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
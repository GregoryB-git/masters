package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzx
  extends zzal
{
  private final Callable<Object> zzk;
  
  public zzx(String paramString, Callable<Object> paramCallable)
  {
    super(paramString);
    zzk = paramCallable;
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    try
    {
      paramzzh = zzj.zza(zzk.call());
      return paramzzh;
    }
    catch (Exception paramzzh) {}
    return zzaq.zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
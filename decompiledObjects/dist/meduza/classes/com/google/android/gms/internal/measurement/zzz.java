package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzz
  extends zzal
{
  private final zzl zzk;
  private final Map<String, zzal> zzl = new HashMap();
  
  public zzz(zzl paramzzl)
  {
    super("require");
    zzk = paramzzl;
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zza("require", 1, paramList);
    paramList = paramzzh.zza((zzaq)paramList.get(0)).zzf();
    if (zzl.containsKey(paramList)) {
      return (zzaq)zzl.get(paramList);
    }
    paramzzh = zzk.zza(paramList);
    if ((paramzzh instanceof zzal)) {
      zzl.put(paramList, (zzal)paramzzh);
    }
    return paramzzh;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
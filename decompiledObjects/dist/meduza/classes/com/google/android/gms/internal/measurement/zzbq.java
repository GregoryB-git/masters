package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbq
  extends zzay
{
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    if ((paramString != null) && (!paramString.isEmpty()) && (paramzzh.zzb(paramString)))
    {
      zzaq localzzaq = paramzzh.zza(paramString);
      if ((localzzaq instanceof zzal)) {
        return ((zzal)localzzaq).zza(paramzzh, paramList);
      }
      throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[] { paramString }));
    }
    throw new IllegalArgumentException(String.format("Command not found: %s", new Object[] { paramString }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
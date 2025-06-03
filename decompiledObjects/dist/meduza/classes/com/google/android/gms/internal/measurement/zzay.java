package com.google.android.gms.internal.measurement;

import f;
import java.util.ArrayList;
import java.util.List;

public abstract class zzay
{
  public final List<zzbv> zza = new ArrayList();
  
  public final zzaq zza(String paramString)
  {
    if (zza.contains(zzg.zza(paramString))) {
      throw new UnsupportedOperationException(f.j("Command not implemented: ", paramString));
    }
    throw new IllegalArgumentException("Command not supported");
  }
  
  public abstract zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
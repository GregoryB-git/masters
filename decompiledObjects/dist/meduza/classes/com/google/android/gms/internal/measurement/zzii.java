package com.google.android.gms.internal.measurement;

import n7.q;
import o7.w;
import x6.b;

public final class zzii
{
  private final boolean zza;
  
  public zzii(zzil paramzzil)
  {
    b.y(paramzzil, "BuildInfo must be non-null");
    zza = (paramzzil.zza() ^ true);
  }
  
  public final boolean zza(String paramString)
  {
    b.y(paramString, "flagName must not be null");
    if (!zza) {
      return true;
    }
    return ((w)zzik.zza.get()).b(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzii
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
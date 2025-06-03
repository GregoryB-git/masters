package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a;
import e7.h3;

final class zzed$zza
  extends zzdv
{
  private final h3 zza;
  
  public zzed$zza(h3 paramh3)
  {
    zza = paramh3;
  }
  
  public final int zza()
  {
    return System.identityHashCode(zza);
  }
  
  public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    ((AppMeasurementDynamiteService.a)zza).a(paramString1, paramString2, paramBundle, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzed.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
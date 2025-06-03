package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import e7.a1;
import e7.b1;
import e7.j2;
import e7.j3;

public final class AppMeasurementDynamiteService$b
  implements j3
{
  public zzdw a;
  
  public AppMeasurementDynamiteService$b(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, zzdw paramzzdw)
  {
    a = paramzzdw;
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    try
    {
      a.zza(paramString1, paramString2, paramBundle, paramLong);
      return;
    }
    catch (RemoteException paramString2)
    {
      paramString1 = b.a;
      if (paramString1 != null) {
        zzjr.c("Event listener threw exception", paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
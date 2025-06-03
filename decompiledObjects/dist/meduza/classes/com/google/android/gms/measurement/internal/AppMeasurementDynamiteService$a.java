package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import e7.a1;
import e7.b1;
import e7.h3;
import e7.j2;

public final class AppMeasurementDynamiteService$a
  implements h3
{
  public zzdw a;
  
  public AppMeasurementDynamiteService$a(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, zzdw paramzzdw)
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
        zzjr.c("Event interceptor threw exception", paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
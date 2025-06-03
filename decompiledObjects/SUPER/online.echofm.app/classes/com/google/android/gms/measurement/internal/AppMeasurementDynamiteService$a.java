package com.google.android.gms.measurement.internal;

import R2.N2;
import R2.Y1;
import R2.a2;
import R2.v3;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.E0;

public final class AppMeasurementDynamiteService$a
  implements v3
{
  public E0 a;
  
  public AppMeasurementDynamiteService$a(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, E0 paramE0)
  {
    a = paramE0;
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    try
    {
      a.L(paramString1, paramString2, paramBundle, paramLong);
      return;
    }
    catch (RemoteException paramString1)
    {
      paramString2 = b.b;
      if (paramString2 != null) {
        paramString2.j().L().b("Event interceptor threw exception", paramString1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
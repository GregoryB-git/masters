package com.google.android.gms.measurement.internal;

import R2.N2;
import R2.Y1;
import R2.a2;
import R2.u3;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.E0;

public final class AppMeasurementDynamiteService$b
  implements u3
{
  public E0 a;
  
  public AppMeasurementDynamiteService$b(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, E0 paramE0)
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
    catch (RemoteException paramString2)
    {
      paramString1 = b.b;
      if (paramString1 != null) {
        paramString1.j().L().b("Event listener threw exception", paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
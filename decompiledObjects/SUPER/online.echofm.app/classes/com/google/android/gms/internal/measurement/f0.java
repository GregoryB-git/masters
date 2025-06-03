package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class f0
  extends b0
  implements c0
{
  public static c0 o(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    if ((localIInterface instanceof c0)) {
      return (c0)localIInterface;
    }
    return new e0(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
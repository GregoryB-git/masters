package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzby
  extends zzbx
  implements zzbz
{
  public static zzbz zza(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    if ((localIInterface instanceof zzbz)) {
      return (zzbz)localIInterface;
    }
    return new zzca(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzby
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
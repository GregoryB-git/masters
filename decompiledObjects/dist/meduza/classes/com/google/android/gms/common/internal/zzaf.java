package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;
import m6.d0;
import m6.e0;

public abstract class zzaf
  extends zzb
  implements e0
{
  public static e0 zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    if ((localIInterface instanceof e0)) {
      return (e0)localIInterface;
    }
    return new d0(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
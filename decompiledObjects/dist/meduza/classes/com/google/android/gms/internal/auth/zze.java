package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zze
  extends zzb
  implements zzf
{
  public static zzf zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
    if ((localIInterface instanceof zzf)) {
      return (zzf)localIInterface;
    }
    return new zzd(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
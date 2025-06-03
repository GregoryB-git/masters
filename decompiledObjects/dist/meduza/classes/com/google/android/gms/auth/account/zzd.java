package com.google.android.gms.auth.account;

import a6.c;
import a6.d;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd
  extends zzb
  implements d
{
  public static d zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
    if ((localIInterface instanceof d)) {
      return (d)localIInterface;
    }
    return new c(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.account.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
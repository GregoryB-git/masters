package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import m7.o;
import m7.p;

public abstract class h
  extends b
  implements p
{
  public static p b(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    if ((localIInterface instanceof p)) {
      return (p)localIInterface;
    }
    return new o(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.integrity.internal.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import m7.r;
import m7.s;

public abstract class m
  extends b
  implements s
{
  public static s b(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
    if ((localIInterface instanceof s)) {
      return (s)localIInterface;
    }
    return new r(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.integrity.internal.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
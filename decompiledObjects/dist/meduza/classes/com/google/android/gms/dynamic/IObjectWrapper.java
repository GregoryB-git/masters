package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public abstract interface IObjectWrapper
  extends IInterface
{
  public static abstract class Stub
    extends zzb
    implements IObjectWrapper
  {
    public Stub()
    {
      super();
    }
    
    public static IObjectWrapper asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      if ((localIInterface instanceof IObjectWrapper)) {
        return (IObjectWrapper)localIInterface;
      }
      return new b(paramIBinder);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.IObjectWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
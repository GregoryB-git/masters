package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public abstract class IObjectWrapper$Stub
  extends zzb
  implements IObjectWrapper
{
  public IObjectWrapper$Stub()
  {
    super("com.google.android.gms.dynamic.IObjectWrapper");
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

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.IObjectWrapper.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
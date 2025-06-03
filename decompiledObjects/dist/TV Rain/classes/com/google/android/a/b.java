package com.google.android.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class b
  extends Binder
  implements IInterface
{
  public b()
  {
    attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
  }
  
  public boolean a(int paramInt, Parcel paramParcel1, Parcel paramParcel2)
    throws RemoteException
  {
    throw null;
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 > 16777215)
    {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2)) {
        return true;
      }
    }
    else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    }
    return a(paramInt1, paramParcel1, paramParcel2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
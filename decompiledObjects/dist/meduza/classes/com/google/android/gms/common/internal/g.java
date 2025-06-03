package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m6.e;
import m6.o0;

public final class g
  implements IGmsServiceBroker
{
  public final IBinder a;
  
  public g(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void D(e parame, b paramb)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (parame != null) {
        parame = parame.asBinder();
      } else {
        parame = null;
      }
      localParcel1.writeStrongBinder(parame);
      if (paramb != null)
      {
        localParcel1.writeInt(1);
        o0.a(paramb, localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      a.transact(46, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
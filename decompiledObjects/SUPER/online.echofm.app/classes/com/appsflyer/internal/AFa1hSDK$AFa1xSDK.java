package com.appsflyer.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

final class AFa1hSDK$AFa1xSDK
  implements IInterface
{
  private final IBinder valueOf;
  
  public AFa1hSDK$AFa1xSDK(IBinder paramIBinder)
  {
    valueOf = paramIBinder;
  }
  
  public final String AFInAppEventParameterName()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      valueOf.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return valueOf;
  }
  
  public final boolean values()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      boolean bool = true;
      localParcel1.writeInt(1);
      valueOf.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1hSDK.AFa1xSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

final class AttributionIdentifiers$GoogleAdInfo
  implements IInterface
{
  private static final int FIRST_TRANSACTION_CODE = 1;
  private static final int SECOND_TRANSACTION_CODE = 2;
  private IBinder binder;
  
  public AttributionIdentifiers$GoogleAdInfo(IBinder paramIBinder)
  {
    binder = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return binder;
  }
  
  public String getAdvertiserId()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      binder.transact(1, localParcel1, localParcel2, 0);
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
  
  public boolean isTrackingLimited()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      boolean bool = true;
      localParcel1.writeInt(1);
      binder.transact(2, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.facebook.internal.AttributionIdentifiers.GoogleAdInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
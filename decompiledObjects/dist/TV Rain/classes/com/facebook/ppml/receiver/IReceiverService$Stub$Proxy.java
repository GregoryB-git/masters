package com.facebook.ppml.receiver;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IReceiverService$Stub$Proxy
  implements IReceiverService
{
  public static IReceiverService sDefaultImpl;
  private IBinder mRemote;
  
  public IReceiverService$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.facebook.ppml.receiver.IReceiverService";
  }
  
  public int sendEvents(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(1, localParcel1, localParcel2, 0)) && (IReceiverService.Stub.getDefaultImpl() != null))
      {
        i = IReceiverService.Stub.getDefaultImpl().sendEvents(paramBundle);
        return i;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.ppml.receiver.IReceiverService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
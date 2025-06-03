package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IResultReceiver$Stub$Proxy
  implements IResultReceiver
{
  private IBinder mRemote;
  
  public IResultReceiver$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.v4.os.IResultReceiver";
  }
  
  public void send(int paramInt, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
      localParcel.writeInt(paramInt);
      IResultReceiver._Parcel.access$100(localParcel, paramBundle, 0);
      mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.IResultReceiver.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.room;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IMultiInstanceInvalidationCallback$Stub$Proxy
  implements IMultiInstanceInvalidationCallback
{
  private IBinder mRemote;
  
  public IMultiInstanceInvalidationCallback$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.room.IMultiInstanceInvalidationCallback";
  }
  
  public void onInvalidation(String[] paramArrayOfString)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
      localParcel.writeStringArray(paramArrayOfString);
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
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationCallback.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
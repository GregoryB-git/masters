package androidx.room;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

class IMultiInstanceInvalidationService$Stub$Proxy
  implements IMultiInstanceInvalidationService
{
  private IBinder mRemote;
  
  public IMultiInstanceInvalidationService$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public void broadcastInvalidation(int paramInt, String[] paramArrayOfString)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
      localParcel.writeInt(paramInt);
      localParcel.writeStringArray(paramArrayOfString);
      mRemote.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.room.IMultiInstanceInvalidationService";
  }
  
  public int registerCallback(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, String paramString)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
      if (paramIMultiInstanceInvalidationCallback != null) {
        paramIMultiInstanceInvalidationCallback = paramIMultiInstanceInvalidationCallback.asBinder();
      } else {
        paramIMultiInstanceInvalidationCallback = null;
      }
      localParcel1.writeStrongBinder(paramIMultiInstanceInvalidationCallback);
      localParcel1.writeString(paramString);
      mRemote.transact(1, localParcel1, localParcel2, 0);
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
  
  public void unregisterCallback(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, int paramInt)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
      if (paramIMultiInstanceInvalidationCallback != null) {
        paramIMultiInstanceInvalidationCallback = paramIMultiInstanceInvalidationCallback.asBinder();
      } else {
        paramIMultiInstanceInvalidationCallback = null;
      }
      localParcel1.writeStrongBinder(paramIMultiInstanceInvalidationCallback);
      localParcel1.writeInt(paramInt);
      mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
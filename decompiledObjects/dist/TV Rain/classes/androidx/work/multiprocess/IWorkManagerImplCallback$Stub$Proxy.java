package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IWorkManagerImplCallback$Stub$Proxy
  implements IWorkManagerImplCallback
{
  public static IWorkManagerImplCallback sDefaultImpl;
  private IBinder mRemote;
  
  public IWorkManagerImplCallback$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.work.multiprocess.IWorkManagerImplCallback";
  }
  
  public void onFailure(String paramString)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
      localParcel.writeString(paramString);
      if ((!mRemote.transact(2, localParcel, null, 1)) && (IWorkManagerImplCallback.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImplCallback.Stub.getDefaultImpl().onFailure(paramString);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSuccess(byte[] paramArrayOfByte)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
      localParcel.writeByteArray(paramArrayOfByte);
      if ((!mRemote.transact(1, localParcel, null, 1)) && (IWorkManagerImplCallback.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImplCallback.Stub.getDefaultImpl().onSuccess(paramArrayOfByte);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
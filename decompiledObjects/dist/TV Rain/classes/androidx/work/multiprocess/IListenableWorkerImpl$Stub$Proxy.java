package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

class IListenableWorkerImpl$Stub$Proxy
  implements IListenableWorkerImpl
{
  public static IListenableWorkerImpl sDefaultImpl;
  private IBinder mRemote;
  
  public IListenableWorkerImpl$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.work.multiprocess.IListenableWorkerImpl";
  }
  
  public void interrupt(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(2, localParcel, null, 1)) && (IListenableWorkerImpl.Stub.getDefaultImpl() != null))
      {
        IListenableWorkerImpl.Stub.getDefaultImpl().interrupt(paramArrayOfByte, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void startWork(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(1, localParcel, null, 1)) && (IListenableWorkerImpl.Stub.getDefaultImpl() != null))
      {
        IListenableWorkerImpl.Stub.getDefaultImpl().startWork(paramArrayOfByte, paramIWorkManagerImplCallback);
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
 * Qualified Name:     androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
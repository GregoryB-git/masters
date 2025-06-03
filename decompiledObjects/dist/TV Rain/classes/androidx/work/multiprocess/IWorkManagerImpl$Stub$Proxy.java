package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

class IWorkManagerImpl$Stub$Proxy
  implements IWorkManagerImpl
{
  public static IWorkManagerImpl sDefaultImpl;
  private IBinder mRemote;
  
  public IWorkManagerImpl$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public void cancelAllWork(IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(6, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWork(paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void cancelAllWorkByTag(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeString(paramString);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(4, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWorkByTag(paramString, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void cancelUniqueWork(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeString(paramString);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(5, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().cancelUniqueWork(paramString, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void cancelWorkById(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeString(paramString);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(3, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().cancelWorkById(paramString, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void enqueueContinuation(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(2, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().enqueueContinuation(paramArrayOfByte, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void enqueueWorkRequests(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(1, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().enqueueWorkRequests(paramArrayOfByte, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.work.multiprocess.IWorkManagerImpl";
  }
  
  public void queryWorkInfo(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(7, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().queryWorkInfo(paramArrayOfByte, paramIWorkManagerImplCallback);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void setProgress(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
      localParcel.writeByteArray(paramArrayOfByte);
      IBinder localIBinder;
      if (paramIWorkManagerImplCallback != null) {
        localIBinder = paramIWorkManagerImplCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel.writeStrongBinder(localIBinder);
      if ((!mRemote.transact(8, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
      {
        IWorkManagerImpl.Stub.getDefaultImpl().setProgress(paramArrayOfByte, paramIWorkManagerImplCallback);
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
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
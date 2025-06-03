package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IWorkManagerImpl$Stub
  extends Binder
  implements IWorkManagerImpl
{
  private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
  public static final int TRANSACTION_cancelAllWork = 6;
  public static final int TRANSACTION_cancelAllWorkByTag = 4;
  public static final int TRANSACTION_cancelUniqueWork = 5;
  public static final int TRANSACTION_cancelWorkById = 3;
  public static final int TRANSACTION_enqueueContinuation = 2;
  public static final int TRANSACTION_enqueueWorkRequests = 1;
  public static final int TRANSACTION_queryWorkInfo = 7;
  public static final int TRANSACTION_setProgress = 8;
  
  public IWorkManagerImpl$Stub()
  {
    attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
  }
  
  public static IWorkManagerImpl asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
    if ((localIInterface != null) && ((localIInterface instanceof IWorkManagerImpl))) {
      return (IWorkManagerImpl)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public static IWorkManagerImpl getDefaultImpl()
  {
    return Proxy.sDefaultImpl;
  }
  
  public static boolean setDefaultImpl(IWorkManagerImpl paramIWorkManagerImpl)
  {
    if (Proxy.sDefaultImpl == null)
    {
      if (paramIWorkManagerImpl != null)
      {
        Proxy.sDefaultImpl = paramIWorkManagerImpl;
        return true;
      }
      return false;
    }
    throw new IllegalStateException("setDefaultImpl() called twice");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1598968902)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 8: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        setProgress(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 7: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        queryWorkInfo(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 6: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        cancelAllWork(IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 5: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        cancelUniqueWork(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 4: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        cancelAllWorkByTag(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 3: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        cancelWorkById(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      case 2: 
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        enqueueContinuation(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      }
      paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
      enqueueWorkRequests(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
      return true;
    }
    paramParcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
    return true;
  }
  
  public static class Proxy
    implements IWorkManagerImpl
  {
    public static IWorkManagerImpl sDefaultImpl;
    private IBinder mRemote;
    
    public Proxy(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImpl.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IListenableWorkerImpl$Stub
  extends Binder
  implements IListenableWorkerImpl
{
  private static final String DESCRIPTOR = "androidx.work.multiprocess.IListenableWorkerImpl";
  public static final int TRANSACTION_interrupt = 2;
  public static final int TRANSACTION_startWork = 1;
  
  public IListenableWorkerImpl$Stub()
  {
    attachInterface(this, "androidx.work.multiprocess.IListenableWorkerImpl");
  }
  
  public static IListenableWorkerImpl asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.work.multiprocess.IListenableWorkerImpl");
    if ((localIInterface != null) && ((localIInterface instanceof IListenableWorkerImpl))) {
      return (IListenableWorkerImpl)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public static IListenableWorkerImpl getDefaultImpl()
  {
    return Proxy.sDefaultImpl;
  }
  
  public static boolean setDefaultImpl(IListenableWorkerImpl paramIListenableWorkerImpl)
  {
    if (Proxy.sDefaultImpl == null)
    {
      if (paramIListenableWorkerImpl != null)
      {
        Proxy.sDefaultImpl = paramIListenableWorkerImpl;
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
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 1598968902) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        paramParcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
        return true;
      }
      paramParcel1.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
      interrupt(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
      return true;
    }
    paramParcel1.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
    startWork(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
    return true;
  }
  
  public static class Proxy
    implements IListenableWorkerImpl
  {
    public static IListenableWorkerImpl sDefaultImpl;
    private IBinder mRemote;
    
    public Proxy(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.IListenableWorkerImpl.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
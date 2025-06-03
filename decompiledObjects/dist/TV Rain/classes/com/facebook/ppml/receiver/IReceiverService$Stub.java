package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract class IReceiverService$Stub
  extends Binder
  implements IReceiverService
{
  private static final String DESCRIPTOR = "com.facebook.ppml.receiver.IReceiverService";
  public static final int TRANSACTION_sendEvents = 1;
  
  public IReceiverService$Stub()
  {
    attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
  }
  
  public static IReceiverService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
    if ((localIInterface != null) && ((localIInterface instanceof IReceiverService))) {
      return (IReceiverService)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public static IReceiverService getDefaultImpl()
  {
    return Proxy.sDefaultImpl;
  }
  
  public static boolean setDefaultImpl(IReceiverService paramIReceiverService)
  {
    if ((Proxy.sDefaultImpl == null) && (paramIReceiverService != null))
    {
      Proxy.sDefaultImpl = paramIReceiverService;
      return true;
    }
    return false;
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
      if (paramInt1 != 1598968902) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
      return true;
    }
    paramParcel1.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
    if (paramParcel1.readInt() != 0) {
      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    } else {
      paramParcel1 = null;
    }
    paramInt1 = sendEvents(paramParcel1);
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
  
  public static class Proxy
    implements IReceiverService
  {
    public static IReceiverService sDefaultImpl;
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
}

/* Location:
 * Qualified Name:     com.facebook.ppml.receiver.IReceiverService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
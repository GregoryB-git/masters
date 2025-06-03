package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IResultReceiver$Stub
  extends Binder
  implements IResultReceiver
{
  public static final int TRANSACTION_send = 1;
  
  public IResultReceiver$Stub()
  {
    attachInterface(this, "android.support.v4.os.IResultReceiver");
  }
  
  public static IResultReceiver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
    if ((localIInterface != null) && ((localIInterface instanceof IResultReceiver))) {
      return (IResultReceiver)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface("android.support.v4.os.IResultReceiver");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      send(paramParcel1.readInt(), (Bundle)IResultReceiver._Parcel.access$000(paramParcel1, Bundle.CREATOR));
      return true;
    }
    paramParcel2.writeString("android.support.v4.os.IResultReceiver");
    return true;
  }
  
  public static class Proxy
    implements IResultReceiver
  {
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
}

/* Location:
 * Qualified Name:     android.support.v4.os.IResultReceiver.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
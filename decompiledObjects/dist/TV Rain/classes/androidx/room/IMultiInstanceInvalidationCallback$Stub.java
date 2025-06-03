package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IMultiInstanceInvalidationCallback$Stub
  extends Binder
  implements IMultiInstanceInvalidationCallback
{
  private static final String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationCallback";
  public static final int TRANSACTION_onInvalidation = 1;
  
  public IMultiInstanceInvalidationCallback$Stub()
  {
    attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
  }
  
  public static IMultiInstanceInvalidationCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IMultiInstanceInvalidationCallback))) {
      return (IMultiInstanceInvalidationCallback)localIInterface;
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
    if (paramInt1 != 1)
    {
      if (paramInt1 != 1598968902) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
      return true;
    }
    paramParcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
    onInvalidation(paramParcel1.createStringArray());
    return true;
  }
  
  public static class Proxy
    implements IMultiInstanceInvalidationCallback
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
}

/* Location:
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class INotificationSideChannel$Stub
  extends Binder
  implements INotificationSideChannel
{
  public static final int TRANSACTION_cancel = 2;
  public static final int TRANSACTION_cancelAll = 3;
  public static final int TRANSACTION_notify = 1;
  
  public INotificationSideChannel$Stub()
  {
    attachInterface(this, "android.support.v4.app.INotificationSideChannel");
  }
  
  public static INotificationSideChannel asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
    if ((localIInterface != null) && ((localIInterface instanceof INotificationSideChannel))) {
      return (INotificationSideChannel)localIInterface;
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
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          cancelAll(paramParcel1.readString());
        }
        else
        {
          cancel(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
        }
      }
      else {
        notify(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString(), (Notification)INotificationSideChannel._Parcel.access$000(paramParcel1, Notification.CREATOR));
      }
      return true;
    }
    paramParcel2.writeString("android.support.v4.app.INotificationSideChannel");
    return true;
  }
  
  public static class Proxy
    implements INotificationSideChannel
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
    
    public void cancel(String paramString1, int paramInt, String paramString2)
      throws RemoteException
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString1);
        localParcel.writeInt(paramInt);
        localParcel.writeString(paramString2);
        mRemote.transact(2, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void cancelAll(String paramString)
      throws RemoteException
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString);
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
      return "android.support.v4.app.INotificationSideChannel";
    }
    
    public void notify(String paramString1, int paramInt, String paramString2, Notification paramNotification)
      throws RemoteException
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString1);
        localParcel.writeInt(paramInt);
        localParcel.writeString(paramString2);
        INotificationSideChannel._Parcel.access$100(localParcel, paramNotification, 0);
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
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
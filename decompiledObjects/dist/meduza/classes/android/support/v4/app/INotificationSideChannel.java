package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract interface INotificationSideChannel
  extends IInterface
{
  public static final String m = "android$support$v4$app$INotificationSideChannel".replace('$', '.');
  
  public abstract void A0(String paramString);
  
  public abstract void M0(int paramInt, String paramString1, String paramString2);
  
  public abstract void P2(String paramString1, int paramInt, String paramString2, Notification paramNotification);
  
  public static abstract class Stub
    extends Binder
    implements INotificationSideChannel
  {
    public Stub()
    {
      attachInterface(this, INotificationSideChannel.m);
    }
    
    public static INotificationSideChannel asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(INotificationSideChannel.m);
      if ((localIInterface != null) && ((localIInterface instanceof INotificationSideChannel))) {
        return (INotificationSideChannel)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = INotificationSideChannel.m;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface(str);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString(str);
        return true;
      }
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          A0(paramParcel1.readString());
        }
        else
        {
          paramParcel2 = paramParcel1.readString();
          M0(paramParcel1.readInt(), paramParcel2, paramParcel1.readString());
        }
      }
      else
      {
        str = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = paramParcel1.readString();
        Parcelable.Creator localCreator = Notification.CREATOR;
        if (paramParcel1.readInt() != 0) {
          paramParcel1 = localCreator.createFromParcel(paramParcel1);
        } else {
          paramParcel1 = null;
        }
        P2(str, paramInt1, paramParcel2, (Notification)paramParcel1);
      }
      return true;
    }
    
    public static final class a
      implements INotificationSideChannel
    {
      public IBinder a;
      
      public a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final void A0(String paramString)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken(INotificationSideChannel.m);
          localParcel.writeString(paramString);
          a.transact(3, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public final void M0(int paramInt, String paramString1, String paramString2)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken(INotificationSideChannel.m);
          localParcel.writeString(paramString1);
          localParcel.writeInt(paramInt);
          localParcel.writeString(paramString2);
          a.transact(2, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public final void P2(String paramString1, int paramInt, String paramString2, Notification paramNotification)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken(INotificationSideChannel.m);
          localParcel.writeString(paramString1);
          localParcel.writeInt(paramInt);
          localParcel.writeString(paramString2);
          if (paramNotification != null)
          {
            localParcel.writeInt(1);
            paramNotification.writeToParcel(localParcel, 0);
          }
          else
          {
            localParcel.writeInt(0);
          }
          a.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.INotificationSideChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
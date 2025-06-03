package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class INotificationSideChannel$Stub$a
  implements INotificationSideChannel
{
  public IBinder a;
  
  public INotificationSideChannel$Stub$a(IBinder paramIBinder)
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

/* Location:
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
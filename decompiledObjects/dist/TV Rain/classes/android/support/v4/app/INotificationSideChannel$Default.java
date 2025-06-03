package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;

public class INotificationSideChannel$Default
  implements INotificationSideChannel
{
  public IBinder asBinder()
  {
    return null;
  }
  
  public void cancel(String paramString1, int paramInt, String paramString2)
    throws RemoteException
  {}
  
  public void cancelAll(String paramString)
    throws RemoteException
  {}
  
  public void notify(String paramString1, int paramInt, String paramString2, Notification paramNotification)
    throws RemoteException
  {}
}

/* Location:
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Default
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
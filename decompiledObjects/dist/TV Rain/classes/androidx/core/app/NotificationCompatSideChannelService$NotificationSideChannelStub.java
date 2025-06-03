package androidx.core.app;

import android.app.Notification;
import android.os.Binder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel.Stub;

class NotificationCompatSideChannelService$NotificationSideChannelStub
  extends INotificationSideChannel.Stub
{
  public NotificationCompatSideChannelService$NotificationSideChannelStub(NotificationCompatSideChannelService paramNotificationCompatSideChannelService) {}
  
  public void cancel(String paramString1, int paramInt, String paramString2)
    throws RemoteException
  {
    this$0.checkPermission(Binder.getCallingUid(), paramString1);
    long l = Binder.clearCallingIdentity();
    try
    {
      this$0.cancel(paramString1, paramInt, paramString2);
      return;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public void cancelAll(String paramString)
  {
    this$0.checkPermission(Binder.getCallingUid(), paramString);
    long l = Binder.clearCallingIdentity();
    try
    {
      this$0.cancelAll(paramString);
      return;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public void notify(String paramString1, int paramInt, String paramString2, Notification paramNotification)
    throws RemoteException
  {
    this$0.checkPermission(Binder.getCallingUid(), paramString1);
    long l = Binder.clearCallingIdentity();
    try
    {
      this$0.notify(paramString1, paramInt, paramString2, paramNotification);
      return;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompatSideChannelService.NotificationSideChannelStub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel.Stub;

public abstract class NotificationCompatSideChannelService
  extends Service
{
  public abstract void cancel(String paramString1, int paramInt, String paramString2);
  
  public abstract void cancelAll(String paramString);
  
  public void checkPermission(int paramInt, String paramString)
  {
    Object localObject = getPackageManager().getPackagesForUid(paramInt);
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      if (localObject[j].equals(paramString)) {
        return;
      }
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("NotificationSideChannelService: Uid ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" is not authorized for package ");
    ((StringBuilder)localObject).append(paramString);
    throw new SecurityException(((StringBuilder)localObject).toString());
  }
  
  public abstract void notify(String paramString1, int paramInt, String paramString2, Notification paramNotification);
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
    return null;
  }
  
  public class NotificationSideChannelStub
    extends INotificationSideChannel.Stub
  {
    public NotificationSideChannelStub() {}
    
    public void cancel(String paramString1, int paramInt, String paramString2)
      throws RemoteException
    {
      checkPermission(Binder.getCallingUid(), paramString1);
      long l = Binder.clearCallingIdentity();
      try
      {
        NotificationCompatSideChannelService.this.cancel(paramString1, paramInt, paramString2);
        return;
      }
      finally
      {
        Binder.restoreCallingIdentity(l);
      }
    }
    
    public void cancelAll(String paramString)
    {
      checkPermission(Binder.getCallingUid(), paramString);
      long l = Binder.clearCallingIdentity();
      try
      {
        NotificationCompatSideChannelService.this.cancelAll(paramString);
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
      checkPermission(Binder.getCallingUid(), paramString1);
      long l = Binder.clearCallingIdentity();
      try
      {
        NotificationCompatSideChannelService.this.notify(paramString1, paramInt, paramString2, paramNotification);
        return;
      }
      finally
      {
        Binder.restoreCallingIdentity(l);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompatSideChannelService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
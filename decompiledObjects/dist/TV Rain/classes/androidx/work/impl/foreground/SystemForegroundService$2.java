package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;

class SystemForegroundService$2
  implements Runnable
{
  public SystemForegroundService$2(SystemForegroundService paramSystemForegroundService, int paramInt, Notification paramNotification) {}
  
  public void run()
  {
    this$0.mNotificationManager.notify(val$notificationId, val$notification);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
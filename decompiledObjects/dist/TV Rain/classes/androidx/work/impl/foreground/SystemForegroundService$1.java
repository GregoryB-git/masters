package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;
import android.os.Build.VERSION;

class SystemForegroundService$1
  implements Runnable
{
  public SystemForegroundService$1(SystemForegroundService paramSystemForegroundService, int paramInt1, Notification paramNotification, int paramInt2) {}
  
  public void run()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      this$0.startForeground(val$notificationId, val$notification, val$notificationType);
    } else {
      this$0.startForeground(val$notificationId, val$notification);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
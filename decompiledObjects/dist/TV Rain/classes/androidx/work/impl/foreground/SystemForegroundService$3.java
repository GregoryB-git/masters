package androidx.work.impl.foreground;

import android.app.NotificationManager;

class SystemForegroundService$3
  implements Runnable
{
  public SystemForegroundService$3(SystemForegroundService paramSystemForegroundService, int paramInt) {}
  
  public void run()
  {
    this$0.mNotificationManager.cancel(val$notificationId);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
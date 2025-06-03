package androidx.core.app;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

class NotificationManagerCompat$SideChannelManager$ListenerRecord
{
  public boolean bound = false;
  public final ComponentName componentName;
  public int retryCount = 0;
  public INotificationSideChannel service;
  public ArrayDeque<NotificationManagerCompat.Task> taskQueue = new ArrayDeque();
  
  public NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName paramComponentName)
  {
    componentName = paramComponentName;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
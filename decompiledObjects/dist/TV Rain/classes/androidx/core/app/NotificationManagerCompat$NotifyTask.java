package androidx.core.app;

import android.app.Notification;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import androidx.annotation.NonNull;
import z2;

class NotificationManagerCompat$NotifyTask
  implements NotificationManagerCompat.Task
{
  public final int id;
  public final Notification notif;
  public final String packageName;
  public final String tag;
  
  public NotificationManagerCompat$NotifyTask(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    packageName = paramString1;
    id = paramInt;
    tag = paramString2;
    notif = paramNotification;
  }
  
  public void send(INotificationSideChannel paramINotificationSideChannel)
    throws RemoteException
  {
    paramINotificationSideChannel.notify(packageName, id, tag, notif);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
    localStringBuilder.append("packageName:");
    localStringBuilder.append(packageName);
    localStringBuilder.append(", id:");
    localStringBuilder.append(id);
    localStringBuilder.append(", tag:");
    return z2.s(localStringBuilder, tag, "]");
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.NotifyTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
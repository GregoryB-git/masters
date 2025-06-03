package androidx.core.app;

import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import androidx.annotation.NonNull;

class NotificationManagerCompat$CancelTask
  implements NotificationManagerCompat.Task
{
  public final boolean all;
  public final int id;
  public final String packageName;
  public final String tag;
  
  public NotificationManagerCompat$CancelTask(String paramString)
  {
    packageName = paramString;
    id = 0;
    tag = null;
    all = true;
  }
  
  public NotificationManagerCompat$CancelTask(String paramString1, int paramInt, String paramString2)
  {
    packageName = paramString1;
    id = paramInt;
    tag = paramString2;
    all = false;
  }
  
  public void send(INotificationSideChannel paramINotificationSideChannel)
    throws RemoteException
  {
    if (all) {
      paramINotificationSideChannel.cancelAll(packageName);
    } else {
      paramINotificationSideChannel.cancel(packageName, id, tag);
    }
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
    localStringBuilder.append("packageName:");
    localStringBuilder.append(packageName);
    localStringBuilder.append(", id:");
    localStringBuilder.append(id);
    localStringBuilder.append(", tag:");
    localStringBuilder.append(tag);
    localStringBuilder.append(", all:");
    localStringBuilder.append(all);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.CancelTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
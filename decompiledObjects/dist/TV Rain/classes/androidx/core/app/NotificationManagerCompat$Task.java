package androidx.core.app;

import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

abstract interface NotificationManagerCompat$Task
{
  public abstract void send(INotificationSideChannel paramINotificationSideChannel)
    throws RemoteException;
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
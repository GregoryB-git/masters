package w;

import android.app.NotificationManager;

public abstract class k$a
{
  public static boolean a(NotificationManager paramNotificationManager)
  {
    return paramNotificationManager.areNotificationsEnabled();
  }
  
  public static int b(NotificationManager paramNotificationManager)
  {
    return paramNotificationManager.getImportance();
  }
}

/* Location:
 * Qualified Name:     w.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
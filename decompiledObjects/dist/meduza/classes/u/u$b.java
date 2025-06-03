package u;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import c0.b;
import com.google.android.gms.internal.base.a;
import d2.e;
import java.util.List;

public final class u$b
{
  public static void a(NotificationManager paramNotificationManager, NotificationChannel paramNotificationChannel)
  {
    b.p(paramNotificationManager, paramNotificationChannel);
  }
  
  public static void b(NotificationManager paramNotificationManager, NotificationChannelGroup paramNotificationChannelGroup)
  {
    e.n(paramNotificationManager, paramNotificationChannelGroup);
  }
  
  public static void c(NotificationManager paramNotificationManager, List<NotificationChannelGroup> paramList)
  {
    b.q(paramNotificationManager, paramList);
  }
  
  public static void d(NotificationManager paramNotificationManager, List<NotificationChannel> paramList)
  {
    a.q(paramNotificationManager, paramList);
  }
  
  public static void e(NotificationManager paramNotificationManager, String paramString)
  {
    e.o(paramNotificationManager, paramString);
  }
  
  public static void f(NotificationManager paramNotificationManager, String paramString)
  {
    e.w(paramNotificationManager, paramString);
  }
  
  public static String g(NotificationChannel paramNotificationChannel)
  {
    return paramNotificationChannel.getId();
  }
  
  public static String h(NotificationChannelGroup paramNotificationChannelGroup)
  {
    return paramNotificationChannelGroup.getId();
  }
  
  public static NotificationChannel i(NotificationManager paramNotificationManager, String paramString)
  {
    return a.g(paramNotificationManager, paramString);
  }
  
  public static List<NotificationChannelGroup> j(NotificationManager paramNotificationManager)
  {
    return b.n(paramNotificationManager);
  }
  
  public static List<NotificationChannel> k(NotificationManager paramNotificationManager)
  {
    return a.o(paramNotificationManager);
  }
}

/* Location:
 * Qualified Name:     u.u.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
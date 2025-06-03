package u;

import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;
import g;

public final class u$c
  implements u.f
{
  public final String a;
  public final int b;
  public final String c;
  public final Notification d;
  
  public u$c(String paramString, int paramInt, Notification paramNotification)
  {
    a = paramString;
    b = paramInt;
    c = null;
    d = paramNotification;
  }
  
  public final void a(INotificationSideChannel paramINotificationSideChannel)
  {
    paramINotificationSideChannel.P2(a, b, c, d);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
    localStringBuilder.append("packageName:");
    localStringBuilder.append(a);
    localStringBuilder.append(", id:");
    localStringBuilder.append(b);
    localStringBuilder.append(", tag:");
    return g.f(localStringBuilder, c, "]");
  }
}

/* Location:
 * Qualified Name:     u.u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
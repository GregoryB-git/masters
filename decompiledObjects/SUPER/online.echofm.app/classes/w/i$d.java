package w;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

public abstract class i$d
{
  public static Notification.Builder a(Notification.Builder paramBuilder, Notification.Action paramAction)
  {
    return paramBuilder.addAction(paramAction);
  }
  
  public static Notification.Action.Builder b(Notification.Action.Builder paramBuilder, Bundle paramBundle)
  {
    return paramBuilder.addExtras(paramBundle);
  }
  
  public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, RemoteInput paramRemoteInput)
  {
    return paramBuilder.addRemoteInput(paramRemoteInput);
  }
  
  public static Notification.Action d(Notification.Action.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  public static Notification.Action.Builder e(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    return new Notification.Action.Builder(paramInt, paramCharSequence, paramPendingIntent);
  }
  
  public static String f(Notification paramNotification)
  {
    return paramNotification.getGroup();
  }
  
  public static Notification.Builder g(Notification.Builder paramBuilder, String paramString)
  {
    return paramBuilder.setGroup(paramString);
  }
  
  public static Notification.Builder h(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setGroupSummary(paramBoolean);
  }
  
  public static Notification.Builder i(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setLocalOnly(paramBoolean);
  }
  
  public static Notification.Builder j(Notification.Builder paramBuilder, String paramString)
  {
    return paramBuilder.setSortKey(paramString);
  }
}

/* Location:
 * Qualified Name:     w.i.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
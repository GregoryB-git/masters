package w;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.widget.RemoteViews;

public abstract class i$g
{
  public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setAllowGeneratedReplies(paramBoolean);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
  {
    return paramBuilder.setCustomBigContentView(paramRemoteViews);
  }
  
  public static Notification.Builder c(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
  {
    return paramBuilder.setCustomContentView(paramRemoteViews);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
  {
    return paramBuilder.setCustomHeadsUpContentView(paramRemoteViews);
  }
  
  public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence[] paramArrayOfCharSequence)
  {
    return paramBuilder.setRemoteInputHistory(paramArrayOfCharSequence);
  }
}

/* Location:
 * Qualified Name:     w.i.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
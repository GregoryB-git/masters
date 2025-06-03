package w;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

public abstract class i$f
{
  public static Notification.Action.Builder a(Icon paramIcon, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    return new Notification.Action.Builder(paramIcon, paramCharSequence, paramPendingIntent);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, Object paramObject)
  {
    return paramBuilder.setSmallIcon((Icon)paramObject);
  }
}

/* Location:
 * Qualified Name:     w.i.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
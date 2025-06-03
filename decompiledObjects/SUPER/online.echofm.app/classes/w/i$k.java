package w;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;

public abstract class i$k
{
  public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setAuthenticationRequired(paramBoolean);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setForegroundServiceBehavior(paramInt);
  }
}

/* Location:
 * Qualified Name:     w.i.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
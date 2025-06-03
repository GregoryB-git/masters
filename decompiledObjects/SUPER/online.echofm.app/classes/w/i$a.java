package w;

import android.app.Notification;
import android.app.Notification.Builder;

public abstract class i$a
{
  public static Notification a(Notification.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setPriority(paramInt);
  }
  
  public static Notification.Builder c(Notification.Builder paramBuilder, CharSequence paramCharSequence)
  {
    return paramBuilder.setSubText(paramCharSequence);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setUsesChronometer(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
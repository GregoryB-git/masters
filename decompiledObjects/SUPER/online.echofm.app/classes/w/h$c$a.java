package w;

import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;

public abstract class h$c$a
{
  public static Notification.BigTextStyle a(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
  {
    return paramBigTextStyle.bigText(paramCharSequence);
  }
  
  public static Notification.BigTextStyle b(Notification.Builder paramBuilder)
  {
    return new Notification.BigTextStyle(paramBuilder);
  }
  
  public static Notification.BigTextStyle c(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
  {
    return paramBigTextStyle.setBigContentTitle(paramCharSequence);
  }
  
  public static Notification.BigTextStyle d(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
  {
    return paramBigTextStyle.setSummaryText(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     w.h.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
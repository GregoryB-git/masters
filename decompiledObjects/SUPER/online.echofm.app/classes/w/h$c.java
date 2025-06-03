package w;

import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.os.Bundle;

public class h$c
  extends h.f
{
  public CharSequence e;
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
  }
  
  public void b(g paramg)
  {
    paramg = a.a(a.c(a.b(paramg.a()), b), e);
    if (d) {
      a.d(paramg, c);
    }
  }
  
  public String c()
  {
    return "androidx.core.app.NotificationCompat$BigTextStyle";
  }
  
  public c h(CharSequence paramCharSequence)
  {
    e = h.e.e(paramCharSequence);
    return this;
  }
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     w.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
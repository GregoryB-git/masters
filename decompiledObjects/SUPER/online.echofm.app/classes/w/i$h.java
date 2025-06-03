package w;

import android.app.Notification.Builder;
import android.content.Context;

public abstract class i$h
{
  public static Notification.Builder a(Context paramContext, String paramString)
  {
    return new Notification.Builder(paramContext, paramString);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setBadgeIconType(paramInt);
  }
  
  public static Notification.Builder c(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setColorized(paramBoolean);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setGroupAlertBehavior(paramInt);
  }
  
  public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence paramCharSequence)
  {
    return paramBuilder.setSettingsText(paramCharSequence);
  }
  
  public static Notification.Builder f(Notification.Builder paramBuilder, String paramString)
  {
    return paramBuilder.setShortcutId(paramString);
  }
  
  public static Notification.Builder g(Notification.Builder paramBuilder, long paramLong)
  {
    return paramBuilder.setTimeoutAfter(paramLong);
  }
}

/* Location:
 * Qualified Name:     w.i.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
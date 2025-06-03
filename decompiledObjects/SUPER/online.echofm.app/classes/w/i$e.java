package w;

import android.app.Notification;
import android.app.Notification.Builder;
import android.media.AudioAttributes;
import android.net.Uri;

public abstract class i$e
{
  public static Notification.Builder a(Notification.Builder paramBuilder, String paramString)
  {
    return paramBuilder.addPerson(paramString);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, String paramString)
  {
    return paramBuilder.setCategory(paramString);
  }
  
  public static Notification.Builder c(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setColor(paramInt);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, Notification paramNotification)
  {
    return paramBuilder.setPublicVersion(paramNotification);
  }
  
  public static Notification.Builder e(Notification.Builder paramBuilder, Uri paramUri, Object paramObject)
  {
    return paramBuilder.setSound(paramUri, (AudioAttributes)paramObject);
  }
  
  public static Notification.Builder f(Notification.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setVisibility(paramInt);
  }
}

/* Location:
 * Qualified Name:     w.i.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
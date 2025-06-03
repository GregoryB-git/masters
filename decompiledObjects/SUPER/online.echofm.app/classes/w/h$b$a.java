package w;

import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.graphics.Bitmap;

public abstract class h$b$a
{
  public static Notification.BigPictureStyle a(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
  {
    return paramBigPictureStyle.bigPicture(paramBitmap);
  }
  
  public static Notification.BigPictureStyle b(Notification.Builder paramBuilder)
  {
    return new Notification.BigPictureStyle(paramBuilder);
  }
  
  public static Notification.BigPictureStyle c(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
  {
    return paramBigPictureStyle.setBigContentTitle(paramCharSequence);
  }
  
  public static void d(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
  {
    paramBigPictureStyle.bigLargeIcon(paramBitmap);
  }
  
  public static void e(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
  {
    paramBigPictureStyle.setSummaryText(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     w.h.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
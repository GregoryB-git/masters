package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class NotificationCompat$BigPictureStyle$Api16Impl
{
  @RequiresApi(16)
  public static void setBigLargeIcon(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
  {
    paramBigPictureStyle.bigLargeIcon(paramBitmap);
  }
  
  @RequiresApi(16)
  public static void setSummaryText(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
  {
    paramBigPictureStyle.setSummaryText(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
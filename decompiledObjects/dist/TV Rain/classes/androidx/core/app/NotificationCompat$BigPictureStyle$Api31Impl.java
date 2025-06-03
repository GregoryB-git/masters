package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;
import g;

@RequiresApi(31)
class NotificationCompat$BigPictureStyle$Api31Impl
{
  @RequiresApi(31)
  public static void setBigPicture(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
  {
    g.h(paramBigPictureStyle, paramIcon);
  }
  
  @RequiresApi(31)
  public static void setContentDescription(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
  {
    g.i(paramBigPictureStyle, paramCharSequence);
  }
  
  @RequiresApi(31)
  public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle paramBigPictureStyle, boolean paramBoolean)
  {
    g.j(paramBigPictureStyle, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
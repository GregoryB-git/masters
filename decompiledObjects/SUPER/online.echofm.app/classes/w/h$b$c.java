package w;

import android.app.Notification.BigPictureStyle;
import android.graphics.drawable.Icon;

public abstract class h$b$c
{
  public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
  {
    paramBigPictureStyle.bigPicture(paramIcon);
  }
  
  public static void b(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
  {
    paramBigPictureStyle.setContentDescription(paramCharSequence);
  }
  
  public static void c(Notification.BigPictureStyle paramBigPictureStyle, boolean paramBoolean)
  {
    paramBigPictureStyle.showBigPictureWhenCollapsed(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w.h.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
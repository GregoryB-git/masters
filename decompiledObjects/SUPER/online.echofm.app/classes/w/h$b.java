package w;

import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;

public class h$b
  extends h.f
{
  public IconCompat e;
  public IconCompat f;
  public boolean g;
  public CharSequence h;
  public boolean i;
  
  public void b(g paramg)
  {
    int j = Build.VERSION.SDK_INT;
    Notification.BigPictureStyle localBigPictureStyle = a.c(a.b(paramg.a()), b);
    IconCompat localIconCompat = e;
    Context localContext = null;
    Object localObject = localBigPictureStyle;
    if (localIconCompat != null) {
      if (j >= 31)
      {
        if ((paramg instanceof i)) {
          localObject = ((i)paramg).f();
        } else {
          localObject = null;
        }
        c.a(localBigPictureStyle, e.o((Context)localObject));
        localObject = localBigPictureStyle;
      }
      else
      {
        localObject = localBigPictureStyle;
        if (localIconCompat.i() == 1) {
          localObject = a.a(localBigPictureStyle, e.f());
        }
      }
    }
    if (g) {
      if (f == null)
      {
        a.d((Notification.BigPictureStyle)localObject, null);
      }
      else
      {
        if ((paramg instanceof i)) {
          localContext = ((i)paramg).f();
        }
        b.a((Notification.BigPictureStyle)localObject, f.o(localContext));
      }
    }
    if (d) {
      a.e((Notification.BigPictureStyle)localObject, c);
    }
    if (j >= 31)
    {
      c.c((Notification.BigPictureStyle)localObject, i);
      c.b((Notification.BigPictureStyle)localObject, h);
    }
  }
  
  public String c()
  {
    return "androidx.core.app.NotificationCompat$BigPictureStyle";
  }
  
  public b h(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      paramBitmap = IconCompat.d(paramBitmap);
    }
    f = paramBitmap;
    g = true;
    return this;
  }
  
  public b i(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      paramBitmap = IconCompat.d(paramBitmap);
    }
    e = paramBitmap;
    return this;
  }
  
  public static abstract class a
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
  
  public static abstract class b
  {
    public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
    {
      paramBigPictureStyle.bigLargeIcon(paramIcon);
    }
  }
  
  public static abstract class c
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
}

/* Location:
 * Qualified Name:     w.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
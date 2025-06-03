package u;

import a4.r;
import android.app.Notification.BigPictureStyle;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat.a;
import e0.h0;
import e0.i0;

public final class o
  extends s
{
  public IconCompat b;
  public IconCompat c;
  public boolean d;
  
  public final void b(t paramt)
  {
    Object localObject1 = new Notification.BigPictureStyle(b).setBigContentTitle(null);
    IconCompat localIconCompat = b;
    Object localObject2 = localObject1;
    if (localIconCompat != null) {
      if (Build.VERSION.SDK_INT >= 31)
      {
        b.a((Notification.BigPictureStyle)localObject1, IconCompat.a.f(localIconCompat, a));
        localObject2 = localObject1;
      }
      else
      {
        int i = a;
        int j = i;
        if (i == -1) {
          j = IconCompat.a.c(b);
        }
        localObject2 = localObject1;
        if (j == 1)
        {
          localObject2 = b;
          j = a;
          if (j == -1)
          {
            localObject2 = b;
            if (!(localObject2 instanceof Bitmap))
            {
              localObject2 = null;
              break label174;
            }
          }
          else
          {
            if (j != 1) {
              break label154;
            }
            localObject2 = b;
          }
          localObject2 = (Bitmap)localObject2;
          label154:
          if (j == 5)
          {
            localObject2 = IconCompat.c((Bitmap)b, true);
            label174:
            localObject2 = ((Notification.BigPictureStyle)localObject1).bigPicture((Bitmap)localObject2);
          }
          else
          {
            paramt = new StringBuilder();
            paramt.append("called getBitmap() on ");
            paramt.append(localObject2);
            throw new IllegalStateException(paramt.toString());
          }
        }
      }
    }
    if (d)
    {
      localObject1 = c;
      if (localObject1 == null) {
        ((Notification.BigPictureStyle)localObject2).bigLargeIcon(null);
      } else {
        a.a((Notification.BigPictureStyle)localObject2, IconCompat.a.f((IconCompat)localObject1, a));
      }
    }
    if (Build.VERSION.SDK_INT >= 31)
    {
      b.c((Notification.BigPictureStyle)localObject2, false);
      b.b((Notification.BigPictureStyle)localObject2, null);
    }
  }
  
  public final String c()
  {
    return "androidx.core.app.NotificationCompat$BigPictureStyle";
  }
  
  public static final class a
  {
    public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
    {
      paramBigPictureStyle.bigLargeIcon(paramIcon);
    }
  }
  
  public static final class b
  {
    public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
    {
      i0.c(paramBigPictureStyle, paramIcon);
    }
    
    public static void b(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
    {
      h0.g(paramBigPictureStyle, paramCharSequence);
    }
    
    public static void c(Notification.BigPictureStyle paramBigPictureStyle, boolean paramBoolean)
    {
      r.d(paramBigPictureStyle, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     u.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
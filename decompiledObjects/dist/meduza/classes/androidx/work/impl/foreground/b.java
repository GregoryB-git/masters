package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;
import android.os.Build.VERSION;

public final class b
  implements Runnable
{
  public final void run()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      SystemForegroundService.b.a(d, a, b, c);
    } else if (i >= 29) {
      SystemForegroundService.a.a(d, a, b, c);
    } else {
      d.startForeground(a, b);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
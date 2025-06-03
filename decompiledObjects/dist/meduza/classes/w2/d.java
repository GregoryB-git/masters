package w2;

import android.app.NotificationManager;
import androidx.work.impl.foreground.SystemForegroundService;

public final class d
  implements Runnable
{
  public final void run()
  {
    b.e.cancel(a);
  }
}

/* Location:
 * Qualified Name:     w2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
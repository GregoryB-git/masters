package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import o2.j;
import o2.j.a;

public final class SystemForegroundService$b
{
  public static void a(Service paramService, int paramInt1, Notification paramNotification, int paramInt2)
  {
    try
    {
      paramService.startForeground(paramInt1, paramNotification, paramInt2);
    }
    catch (ForegroundServiceStartNotAllowedException localForegroundServiceStartNotAllowedException)
    {
      paramNotification = j.d();
      paramService = SystemForegroundService.f;
      if (c <= 5) {
        Log.w(paramService, "Unable to start foreground service", localForegroundServiceStartNotAllowedException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
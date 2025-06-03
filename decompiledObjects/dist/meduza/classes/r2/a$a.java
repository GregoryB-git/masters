package r2;

import android.app.AlarmManager;
import android.app.PendingIntent;

public final class a$a
{
  public static void a(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setExact(paramInt, paramLong, paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     r2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
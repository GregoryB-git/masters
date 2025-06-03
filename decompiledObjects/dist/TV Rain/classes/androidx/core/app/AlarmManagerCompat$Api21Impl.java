package androidx.core.app;

import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class AlarmManagerCompat$Api21Impl
{
  @DoNotInline
  public static AlarmManager.AlarmClockInfo createAlarmClockInfo(long paramLong, PendingIntent paramPendingIntent)
  {
    return new AlarmManager.AlarmClockInfo(paramLong, paramPendingIntent);
  }
  
  @DoNotInline
  public static void setAlarmClock(AlarmManager paramAlarmManager, Object paramObject, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setAlarmClock((AlarmManager.AlarmClockInfo)paramObject, paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.AlarmManagerCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class AlarmManagerCompat$Api23Impl
{
  @DoNotInline
  public static void setAndAllowWhileIdle(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
  }
  
  @DoNotInline
  public static void setExactAndAllowWhileIdle(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setExactAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.AlarmManagerCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
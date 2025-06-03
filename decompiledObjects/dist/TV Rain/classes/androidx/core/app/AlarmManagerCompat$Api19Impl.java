package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class AlarmManagerCompat$Api19Impl
{
  @DoNotInline
  public static void setExact(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setExact(paramInt, paramLong, paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.AlarmManagerCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
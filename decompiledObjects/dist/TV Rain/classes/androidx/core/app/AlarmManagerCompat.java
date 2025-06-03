package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class AlarmManagerCompat
{
  @SuppressLint({"MissingPermission"})
  public static void setAlarmClock(@NonNull AlarmManager paramAlarmManager, long paramLong, @NonNull PendingIntent paramPendingIntent1, @NonNull PendingIntent paramPendingIntent2)
  {
    Api21Impl.setAlarmClock(paramAlarmManager, Api21Impl.createAlarmClockInfo(paramLong, paramPendingIntent1), paramPendingIntent2);
  }
  
  public static void setAndAllowWhileIdle(@NonNull AlarmManager paramAlarmManager, int paramInt, long paramLong, @NonNull PendingIntent paramPendingIntent)
  {
    Api23Impl.setAndAllowWhileIdle(paramAlarmManager, paramInt, paramLong, paramPendingIntent);
  }
  
  public static void setExact(@NonNull AlarmManager paramAlarmManager, int paramInt, long paramLong, @NonNull PendingIntent paramPendingIntent)
  {
    Api19Impl.setExact(paramAlarmManager, paramInt, paramLong, paramPendingIntent);
  }
  
  public static void setExactAndAllowWhileIdle(@NonNull AlarmManager paramAlarmManager, int paramInt, long paramLong, @NonNull PendingIntent paramPendingIntent)
  {
    Api23Impl.setExactAndAllowWhileIdle(paramAlarmManager, paramInt, paramLong, paramPendingIntent);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static void setExact(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
    {
      paramAlarmManager.setExact(paramInt, paramLong, paramPendingIntent);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
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
  
  @RequiresApi(23)
  public static class Api23Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.app.AlarmManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
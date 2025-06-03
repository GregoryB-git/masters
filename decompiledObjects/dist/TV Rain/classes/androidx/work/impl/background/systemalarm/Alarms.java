package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class Alarms
{
  private static final String TAG = Logger.tagWithPrefix("Alarms");
  
  public static void cancelAlarm(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull String paramString)
  {
    paramWorkManagerImpl = paramWorkManagerImpl.getWorkDatabase().systemIdInfoDao();
    SystemIdInfo localSystemIdInfo = paramWorkManagerImpl.getSystemIdInfo(paramString);
    if (localSystemIdInfo != null)
    {
      cancelExactAlarm(paramContext, paramString, systemId);
      Logger.get().debug(TAG, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[] { paramString }), new Throwable[0]);
      paramWorkManagerImpl.removeSystemIdInfo(paramString);
    }
  }
  
  private static void cancelExactAlarm(@NonNull Context paramContext, @NonNull String paramString, int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getService(paramContext, paramInt, CommandHandler.createDelayMetIntent(paramContext, paramString), 603979776);
    if ((paramContext != null) && (localAlarmManager != null))
    {
      Logger.get().debug(TAG, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[] { paramString, Integer.valueOf(paramInt) }), new Throwable[0]);
      localAlarmManager.cancel(paramContext);
    }
  }
  
  public static void setAlarm(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull String paramString, long paramLong)
  {
    paramWorkManagerImpl = paramWorkManagerImpl.getWorkDatabase();
    SystemIdInfoDao localSystemIdInfoDao = paramWorkManagerImpl.systemIdInfoDao();
    SystemIdInfo localSystemIdInfo = localSystemIdInfoDao.getSystemIdInfo(paramString);
    if (localSystemIdInfo != null)
    {
      cancelExactAlarm(paramContext, paramString, systemId);
      setExactAlarm(paramContext, paramString, systemId, paramLong);
    }
    else
    {
      int i = new IdGenerator(paramWorkManagerImpl).nextAlarmManagerId();
      localSystemIdInfoDao.insertSystemIdInfo(new SystemIdInfo(paramString, i));
      setExactAlarm(paramContext, paramString, i, paramLong);
    }
  }
  
  private static void setExactAlarm(@NonNull Context paramContext, @NonNull String paramString, int paramInt, long paramLong)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getService(paramContext, paramInt, CommandHandler.createDelayMetIntent(paramContext, paramString), 201326592);
    if (localAlarmManager != null) {
      localAlarmManager.setExact(0, paramLong, paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.Alarms
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
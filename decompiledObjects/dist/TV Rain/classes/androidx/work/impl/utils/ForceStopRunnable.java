package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.room.RoomDatabase;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable
  implements Runnable
{
  @VisibleForTesting
  public static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
  private static final int ALARM_ID = -1;
  private static final long BACKOFF_DURATION_MS = 300L;
  @VisibleForTesting
  public static final int MAX_ATTEMPTS = 3;
  private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
  private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650L);
  private final Context mContext;
  private int mRetryCount;
  private final WorkManagerImpl mWorkManager;
  
  public ForceStopRunnable(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl)
  {
    mContext = paramContext.getApplicationContext();
    mWorkManager = paramWorkManagerImpl;
    mRetryCount = 0;
  }
  
  @VisibleForTesting
  public static Intent getIntent(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramContext, BroadcastReceiver.class));
    localIntent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
    return localIntent;
  }
  
  private static PendingIntent getPendingIntent(Context paramContext, int paramInt)
  {
    return PendingIntent.getBroadcast(paramContext, -1, getIntent(paramContext), paramInt);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  public static void setAlarm(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    int i;
    if (BuildCompat.isAtLeastS()) {
      i = 167772160;
    } else {
      i = 134217728;
    }
    paramContext = getPendingIntent(paramContext, i);
    long l1 = System.currentTimeMillis();
    long l2 = TEN_YEARS;
    if (localAlarmManager != null) {
      localAlarmManager.setExact(0, l1 + l2, paramContext);
    }
  }
  
  @VisibleForTesting
  public boolean cleanUp()
  {
    boolean bool1 = SystemJobScheduler.reconcileJobs(mContext, mWorkManager);
    WorkDatabase localWorkDatabase = mWorkManager.getWorkDatabase();
    WorkSpecDao localWorkSpecDao = localWorkDatabase.workSpecDao();
    WorkProgressDao localWorkProgressDao = localWorkDatabase.workProgressDao();
    localWorkDatabase.beginTransaction();
    try
    {
      Object localObject2 = localWorkSpecDao.getRunningWork();
      boolean bool2 = true;
      int i;
      if ((localObject2 != null) && (!((List)localObject2).isEmpty())) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (WorkSpec)localIterator.next();
          localWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { id });
          localWorkSpecDao.markWorkSpecScheduled(id, -1L);
        }
      }
      localWorkProgressDao.deleteAll();
      localWorkDatabase.setTransactionSuccessful();
      localWorkDatabase.endTransaction();
      boolean bool3 = bool2;
      if (i == 0) {
        if (bool1) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
  
  @VisibleForTesting
  public void forceStopRunnable()
  {
    boolean bool = cleanUp();
    if (shouldRescheduleWorkers())
    {
      Logger.get().debug(TAG, "Rescheduling Workers.", new Throwable[0]);
      mWorkManager.rescheduleEligibleWork();
      mWorkManager.getPreferenceUtils().setNeedsReschedule(false);
    }
    else if (isForceStopped())
    {
      Logger.get().debug(TAG, "Application was force-stopped, rescheduling.", new Throwable[0]);
      mWorkManager.rescheduleEligibleWork();
    }
    else if (bool)
    {
      Logger.get().debug(TAG, "Found unfinished work, scheduling it.", new Throwable[0]);
      Schedulers.schedule(mWorkManager.getConfiguration(), mWorkManager.getWorkDatabase(), mWorkManager.getSchedulers());
    }
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @VisibleForTesting
  public boolean isForceStopped()
  {
    int i = 536870912;
    try
    {
      if (BuildCompat.isAtLeastS()) {
        i = 570425344;
      }
      Object localObject = getPendingIntent(mContext, i);
      if (Build.VERSION.SDK_INT >= 30)
      {
        if (localObject != null) {
          ((PendingIntent)localObject).cancel();
        }
        localObject = ((ActivityManager)mContext.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if ((localObject != null) && (!((List)localObject).isEmpty())) {
          for (i = 0; i < ((List)localObject).size(); i++) {
            if (((ApplicationExitInfo)((List)localObject).get(i)).getReason() == 10) {
              return true;
            }
          }
        }
      }
      else if (localObject == null)
      {
        setAlarm(mContext);
        return true;
      }
      return false;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}catch (SecurityException localSecurityException) {}
    Logger.get().warning(TAG, "Ignoring exception", new Throwable[] { localSecurityException });
    return true;
  }
  
  @VisibleForTesting
  public boolean multiProcessChecks()
  {
    Configuration localConfiguration = mWorkManager.getConfiguration();
    if (TextUtils.isEmpty(localConfiguration.getDefaultProcessName()))
    {
      Logger.get().debug(TAG, "The default process name was not specified.", new Throwable[0]);
      return true;
    }
    boolean bool = ProcessUtils.isDefaultProcess(mContext, localConfiguration);
    Logger.get().debug(TAG, String.format("Is default app process = %s", new Object[] { Boolean.valueOf(bool) }), new Throwable[0]);
    return bool;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 364	androidx/work/impl/utils/ForceStopRunnable:multiProcessChecks	()Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: getfield 75	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   13: invokevirtual 367	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   16: return
    //   17: aload_0
    //   18: getfield 73	androidx/work/impl/utils/ForceStopRunnable:mContext	Landroid/content/Context;
    //   21: invokestatic 372	androidx/work/impl/WorkDatabasePathHelper:migrateDatabase	(Landroid/content/Context;)V
    //   24: invokestatic 235	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   27: getstatic 45	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   30: ldc_w 374
    //   33: iconst_0
    //   34: anewarray 239	java/lang/Throwable
    //   37: invokevirtual 243	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   40: aload_0
    //   41: invokevirtual 376	androidx/work/impl/utils/ForceStopRunnable:forceStopRunnable	()V
    //   44: goto +126 -> 170
    //   47: astore_2
    //   48: goto +20 -> 68
    //   51: astore_2
    //   52: goto +16 -> 68
    //   55: astore_2
    //   56: goto +12 -> 68
    //   59: astore_2
    //   60: goto +8 -> 68
    //   63: astore_2
    //   64: goto +4 -> 68
    //   67: astore_2
    //   68: aload_0
    //   69: getfield 77	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   72: iconst_1
    //   73: iadd
    //   74: istore_3
    //   75: aload_0
    //   76: iload_3
    //   77: putfield 77	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   80: iload_3
    //   81: iconst_3
    //   82: if_icmplt +99 -> 181
    //   85: invokestatic 235	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   88: astore 4
    //   90: getstatic 45	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   93: astore 5
    //   95: aload 4
    //   97: aload 5
    //   99: ldc_w 378
    //   102: iconst_1
    //   103: anewarray 239	java/lang/Throwable
    //   106: dup
    //   107: iconst_0
    //   108: aload_2
    //   109: aastore
    //   110: invokevirtual 381	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   113: new 383	java/lang/IllegalStateException
    //   116: astore 4
    //   118: aload 4
    //   120: ldc_w 378
    //   123: aload_2
    //   124: invokespecial 386	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   127: aload_0
    //   128: getfield 75	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   131: invokevirtual 267	androidx/work/impl/WorkManagerImpl:getConfiguration	()Landroidx/work/Configuration;
    //   134: invokevirtual 390	androidx/work/Configuration:getExceptionHandler	()Landroidx/work/InitializationExceptionHandler;
    //   137: astore_2
    //   138: aload_2
    //   139: ifnull +39 -> 178
    //   142: invokestatic 235	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   145: aload 5
    //   147: ldc_w 392
    //   150: iconst_1
    //   151: anewarray 239	java/lang/Throwable
    //   154: dup
    //   155: iconst_0
    //   156: aload 4
    //   158: aastore
    //   159: invokevirtual 243	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   162: aload_2
    //   163: aload 4
    //   165: invokeinterface 398 2 0
    //   170: aload_0
    //   171: getfield 75	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   174: invokevirtual 367	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   177: return
    //   178: aload 4
    //   180: athrow
    //   181: iload_3
    //   182: i2l
    //   183: lstore 6
    //   185: invokestatic 235	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   188: getstatic 45	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   191: ldc_w 400
    //   194: iconst_1
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: lload 6
    //   202: ldc2_w 23
    //   205: lmul
    //   206: invokestatic 405	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   209: aastore
    //   210: invokestatic 349	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   213: iconst_1
    //   214: anewarray 239	java/lang/Throwable
    //   217: dup
    //   218: iconst_0
    //   219: aload_2
    //   220: aastore
    //   221: invokevirtual 243	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   224: aload_0
    //   225: aload_0
    //   226: getfield 77	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   229: i2l
    //   230: ldc2_w 23
    //   233: lmul
    //   234: invokevirtual 409	androidx/work/impl/utils/ForceStopRunnable:sleep	(J)V
    //   237: goto -220 -> 17
    //   240: astore_2
    //   241: aload_0
    //   242: getfield 75	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   245: invokevirtual 367	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   248: aload_2
    //   249: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	this	ForceStopRunnable
    //   4	2	1	bool	boolean
    //   47	1	2	localSQLiteAccessPermException	android.database.sqlite.SQLiteAccessPermException
    //   51	1	2	localSQLiteConstraintException	android.database.sqlite.SQLiteConstraintException
    //   55	1	2	localSQLiteTableLockedException	android.database.sqlite.SQLiteTableLockedException
    //   59	1	2	localSQLiteDatabaseLockedException	android.database.sqlite.SQLiteDatabaseLockedException
    //   63	1	2	localSQLiteDatabaseCorruptException	android.database.sqlite.SQLiteDatabaseCorruptException
    //   67	57	2	localSQLiteCantOpenDatabaseException	android.database.sqlite.SQLiteCantOpenDatabaseException
    //   137	83	2	localInitializationExceptionHandler	androidx.work.InitializationExceptionHandler
    //   240	9	2	localObject1	Object
    //   74	108	3	i	int
    //   88	91	4	localObject2	Object
    //   93	53	5	str	String
    //   183	18	6	l	long
    // Exception table:
    //   from	to	target	type
    //   40	44	47	android/database/sqlite/SQLiteAccessPermException
    //   40	44	51	android/database/sqlite/SQLiteConstraintException
    //   40	44	55	android/database/sqlite/SQLiteTableLockedException
    //   40	44	59	android/database/sqlite/SQLiteDatabaseLockedException
    //   40	44	63	android/database/sqlite/SQLiteDatabaseCorruptException
    //   40	44	67	android/database/sqlite/SQLiteCantOpenDatabaseException
    //   0	5	240	finally
    //   17	40	240	finally
    //   40	44	240	finally
    //   68	80	240	finally
    //   85	138	240	finally
    //   142	170	240	finally
    //   178	181	240	finally
    //   185	237	240	finally
  }
  
  @VisibleForTesting
  public boolean shouldRescheduleWorkers()
  {
    return mWorkManager.getPreferenceUtils().getNeedsReschedule();
  }
  
  @VisibleForTesting
  public void sleep(long paramLong)
  {
    try
    {
      Thread.sleep(paramLong);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class BroadcastReceiver
    extends BroadcastReceiver
  {
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");
    
    public void onReceive(@NonNull Context paramContext, @Nullable Intent paramIntent)
    {
      if ((paramIntent != null) && ("ACTION_FORCE_STOP_RESCHEDULE".equals(paramIntent.getAction())))
      {
        Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
        ForceStopRunnable.setAlarm(paramContext);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.ForceStopRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
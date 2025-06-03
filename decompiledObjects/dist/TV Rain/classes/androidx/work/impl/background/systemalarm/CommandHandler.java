package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class CommandHandler
  implements ExecutionListener
{
  public static final String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
  public static final String ACTION_DELAY_MET = "ACTION_DELAY_MET";
  public static final String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
  public static final String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
  public static final String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
  public static final String ACTION_STOP_WORK = "ACTION_STOP_WORK";
  private static final String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
  private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
  private static final String TAG = Logger.tagWithPrefix("CommandHandler");
  public static final long WORK_PROCESSING_TIME_IN_MS = 600000L;
  private final Context mContext;
  private final Object mLock;
  private final Map<String, ExecutionListener> mPendingDelayMet;
  
  public CommandHandler(@NonNull Context paramContext)
  {
    mContext = paramContext;
    mPendingDelayMet = new HashMap();
    mLock = new Object();
  }
  
  public static Intent createConstraintsChangedIntent(@NonNull Context paramContext)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_CONSTRAINTS_CHANGED");
    return paramContext;
  }
  
  public static Intent createDelayMetIntent(@NonNull Context paramContext, @NonNull String paramString)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_DELAY_MET");
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  public static Intent createExecutionCompletedIntent(@NonNull Context paramContext, @NonNull String paramString, boolean paramBoolean)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_EXECUTION_COMPLETED");
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    paramContext.putExtra("KEY_NEEDS_RESCHEDULE", paramBoolean);
    return paramContext;
  }
  
  public static Intent createRescheduleIntent(@NonNull Context paramContext)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_RESCHEDULE");
    return paramContext;
  }
  
  public static Intent createScheduleWorkIntent(@NonNull Context paramContext, @NonNull String paramString)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_SCHEDULE_WORK");
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  public static Intent createStopWorkIntent(@NonNull Context paramContext, @NonNull String paramString)
  {
    paramContext = new Intent(paramContext, SystemAlarmService.class);
    paramContext.setAction("ACTION_STOP_WORK");
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  private void handleConstraintsChanged(@NonNull Intent paramIntent, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    Logger.get().debug(TAG, String.format("Handling constraints changed %s", new Object[] { paramIntent }), new Throwable[0]);
    new ConstraintsCommandHandler(mContext, paramInt, paramSystemAlarmDispatcher).handleConstraintsChanged();
  }
  
  private void handleDelayMet(@NonNull Intent arg1, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    Object localObject1 = ???.getExtras();
    synchronized (mLock)
    {
      localObject1 = ((BaseBundle)localObject1).getString("KEY_WORKSPEC_ID");
      Logger localLogger = Logger.get();
      Object localObject2 = TAG;
      localLogger.debug((String)localObject2, String.format("Handing delay met for %s", new Object[] { localObject1 }), new Throwable[0]);
      if (!mPendingDelayMet.containsKey(localObject1))
      {
        localObject2 = new androidx/work/impl/background/systemalarm/DelayMetCommandHandler;
        ((DelayMetCommandHandler)localObject2).<init>(mContext, paramInt, (String)localObject1, paramSystemAlarmDispatcher);
        mPendingDelayMet.put(localObject1, localObject2);
        ((DelayMetCommandHandler)localObject2).handleProcessWork();
      }
      else
      {
        Logger.get().debug((String)localObject2, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[] { localObject1 }), new Throwable[0]);
      }
      return;
    }
  }
  
  private void handleExecutionCompleted(@NonNull Intent paramIntent, int paramInt)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str = localBundle.getString("KEY_WORKSPEC_ID");
    boolean bool = localBundle.getBoolean("KEY_NEEDS_RESCHEDULE");
    Logger.get().debug(TAG, String.format("Handling onExecutionCompleted %s, %s", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    onExecuted(str, bool);
  }
  
  private void handleReschedule(@NonNull Intent paramIntent, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    Logger.get().debug(TAG, String.format("Handling reschedule %s, %s", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    paramSystemAlarmDispatcher.getWorkManager().rescheduleEligibleWork();
  }
  
  private void handleScheduleWorkIntent(@NonNull Intent paramIntent, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    Object localObject1 = paramIntent.getExtras().getString("KEY_WORKSPEC_ID");
    paramIntent = Logger.get();
    Object localObject2 = TAG;
    paramIntent.debug((String)localObject2, String.format("Handling schedule work for %s", new Object[] { localObject1 }), new Throwable[0]);
    paramIntent = paramSystemAlarmDispatcher.getWorkManager().getWorkDatabase();
    paramIntent.beginTransaction();
    try
    {
      Object localObject3 = paramIntent.workSpecDao().getWorkSpec((String)localObject1);
      if (localObject3 == null)
      {
        localObject3 = Logger.get();
        paramSystemAlarmDispatcher = new java/lang/StringBuilder;
        paramSystemAlarmDispatcher.<init>();
        paramSystemAlarmDispatcher.append("Skipping scheduling ");
        paramSystemAlarmDispatcher.append((String)localObject1);
        paramSystemAlarmDispatcher.append(" because it's no longer in the DB");
        ((Logger)localObject3).warning((String)localObject2, paramSystemAlarmDispatcher.toString(), new Throwable[0]);
        return;
      }
      if (state.isFinished())
      {
        paramSystemAlarmDispatcher = Logger.get();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("Skipping scheduling ");
        ((StringBuilder)localObject3).append((String)localObject1);
        ((StringBuilder)localObject3).append("because it is finished.");
        paramSystemAlarmDispatcher.warning((String)localObject2, ((StringBuilder)localObject3).toString(), new Throwable[0]);
        return;
      }
      long l = ((WorkSpec)localObject3).calculateNextRunTime();
      if (!((WorkSpec)localObject3).hasConstraints())
      {
        Logger.get().debug((String)localObject2, String.format("Setting up Alarms for %s at %s", new Object[] { localObject1, Long.valueOf(l) }), new Throwable[0]);
        Alarms.setAlarm(mContext, paramSystemAlarmDispatcher.getWorkManager(), (String)localObject1, l);
      }
      else
      {
        Logger.get().debug((String)localObject2, String.format("Opportunistically setting an alarm for %s at %s", new Object[] { localObject1, Long.valueOf(l) }), new Throwable[0]);
        Alarms.setAlarm(mContext, paramSystemAlarmDispatcher.getWorkManager(), (String)localObject1, l);
        localObject1 = createConstraintsChangedIntent(mContext);
        localObject2 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$AddRunnable;
        ((SystemAlarmDispatcher.AddRunnable)localObject2).<init>(paramSystemAlarmDispatcher, (Intent)localObject1, paramInt);
        paramSystemAlarmDispatcher.postOnMainThread((Runnable)localObject2);
      }
      paramIntent.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramIntent.endTransaction();
    }
  }
  
  private void handleStopWork(@NonNull Intent paramIntent, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    paramIntent = paramIntent.getExtras().getString("KEY_WORKSPEC_ID");
    Logger.get().debug(TAG, String.format("Handing stopWork work for %s", new Object[] { paramIntent }), new Throwable[0]);
    paramSystemAlarmDispatcher.getWorkManager().stopWork(paramIntent);
    Alarms.cancelAlarm(mContext, paramSystemAlarmDispatcher.getWorkManager(), paramIntent);
    paramSystemAlarmDispatcher.onExecuted(paramIntent, false);
  }
  
  private static boolean hasKeys(@Nullable Bundle paramBundle, @NonNull String... paramVarArgs)
  {
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++) {
        if (paramBundle.get(paramVarArgs[j]) == null) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean hasPendingCommands()
  {
    synchronized (mLock)
    {
      boolean bool;
      if (!mPendingDelayMet.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    synchronized (mLock)
    {
      ExecutionListener localExecutionListener = (ExecutionListener)mPendingDelayMet.remove(paramString);
      if (localExecutionListener != null) {
        localExecutionListener.onExecuted(paramString, paramBoolean);
      }
      return;
    }
  }
  
  @WorkerThread
  public void onHandleIntent(@NonNull Intent paramIntent, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    String str = paramIntent.getAction();
    if ("ACTION_CONSTRAINTS_CHANGED".equals(str)) {
      handleConstraintsChanged(paramIntent, paramInt, paramSystemAlarmDispatcher);
    } else if ("ACTION_RESCHEDULE".equals(str)) {
      handleReschedule(paramIntent, paramInt, paramSystemAlarmDispatcher);
    } else if (!hasKeys(paramIntent.getExtras(), new String[] { "KEY_WORKSPEC_ID" })) {
      Logger.get().error(TAG, String.format("Invalid request for %s, requires %s.", new Object[] { str, "KEY_WORKSPEC_ID" }), new Throwable[0]);
    } else if ("ACTION_SCHEDULE_WORK".equals(str)) {
      handleScheduleWorkIntent(paramIntent, paramInt, paramSystemAlarmDispatcher);
    } else if ("ACTION_DELAY_MET".equals(str)) {
      handleDelayMet(paramIntent, paramInt, paramSystemAlarmDispatcher);
    } else if ("ACTION_STOP_WORK".equals(str)) {
      handleStopWork(paramIntent, paramSystemAlarmDispatcher);
    } else if ("ACTION_EXECUTION_COMPLETED".equals(str)) {
      handleExecutionCompleted(paramIntent, paramInt);
    } else {
      Logger.get().warning(TAG, String.format("Ignoring intent %s", new Object[] { paramIntent }), new Throwable[0]);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.CommandHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
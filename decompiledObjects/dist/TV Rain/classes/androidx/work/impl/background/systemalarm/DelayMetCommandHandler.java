package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener;
import java.util.Collections;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DelayMetCommandHandler
  implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener
{
  private static final int STATE_INITIAL = 0;
  private static final int STATE_START_REQUESTED = 1;
  private static final int STATE_STOP_REQUESTED = 2;
  private static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
  private final Context mContext;
  private int mCurrentState;
  private final SystemAlarmDispatcher mDispatcher;
  private boolean mHasConstraints;
  private final Object mLock;
  private final int mStartId;
  @Nullable
  private PowerManager.WakeLock mWakeLock;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  private final String mWorkSpecId;
  
  public DelayMetCommandHandler(@NonNull Context paramContext, int paramInt, @NonNull String paramString, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    mContext = paramContext;
    mStartId = paramInt;
    mDispatcher = paramSystemAlarmDispatcher;
    mWorkSpecId = paramString;
    mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramSystemAlarmDispatcher.getTaskExecutor(), this);
    mHasConstraints = false;
    mCurrentState = 0;
    mLock = new Object();
  }
  
  private void cleanUp()
  {
    synchronized (mLock)
    {
      mWorkConstraintsTracker.reset();
      mDispatcher.getWorkTimer().stopTimer(mWorkSpecId);
      PowerManager.WakeLock localWakeLock = mWakeLock;
      if ((localWakeLock != null) && (localWakeLock.isHeld()))
      {
        Logger.get().debug(TAG, String.format("Releasing wakelock %s for WorkSpec %s", new Object[] { mWakeLock, mWorkSpecId }), new Throwable[0]);
        mWakeLock.release();
      }
      return;
    }
  }
  
  private void stopWork()
  {
    synchronized (mLock)
    {
      if (mCurrentState < 2)
      {
        mCurrentState = 2;
        Object localObject2 = Logger.get();
        Object localObject3 = TAG;
        ((Logger)localObject2).debug((String)localObject3, String.format("Stopping work for WorkSpec %s", new Object[] { mWorkSpecId }), new Throwable[0]);
        Intent localIntent = CommandHandler.createStopWorkIntent(mContext, mWorkSpecId);
        Object localObject5 = mDispatcher;
        localObject2 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$AddRunnable;
        ((SystemAlarmDispatcher.AddRunnable)localObject2).<init>((SystemAlarmDispatcher)localObject5, localIntent, mStartId);
        ((SystemAlarmDispatcher)localObject5).postOnMainThread((Runnable)localObject2);
        if (mDispatcher.getProcessor().isEnqueued(mWorkSpecId))
        {
          Logger.get().debug((String)localObject3, String.format("WorkSpec %s needs to be rescheduled", new Object[] { mWorkSpecId }), new Throwable[0]);
          localObject5 = CommandHandler.createScheduleWorkIntent(mContext, mWorkSpecId);
          localObject3 = mDispatcher;
          localObject2 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$AddRunnable;
          ((SystemAlarmDispatcher.AddRunnable)localObject2).<init>((SystemAlarmDispatcher)localObject3, (Intent)localObject5, mStartId);
          ((SystemAlarmDispatcher)localObject3).postOnMainThread((Runnable)localObject2);
        }
        else
        {
          Logger.get().debug((String)localObject3, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[] { mWorkSpecId }), new Throwable[0]);
        }
      }
      else
      {
        Logger.get().debug(TAG, String.format("Already stopped work for %s", new Object[] { mWorkSpecId }), new Throwable[0]);
      }
      return;
    }
  }
  
  @WorkerThread
  public void handleProcessWork()
  {
    mWakeLock = WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] { mWorkSpecId, Integer.valueOf(mStartId) }));
    Object localObject = Logger.get();
    String str = TAG;
    ((Logger)localObject).debug(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[] { mWakeLock, mWorkSpecId }), new Throwable[0]);
    mWakeLock.acquire();
    localObject = mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(mWorkSpecId);
    if (localObject == null)
    {
      stopWork();
      return;
    }
    boolean bool = ((WorkSpec)localObject).hasConstraints();
    mHasConstraints = bool;
    if (!bool)
    {
      Logger.get().debug(str, String.format("No constraints for %s", new Object[] { mWorkSpecId }), new Throwable[0]);
      onAllConstraintsMet(Collections.singletonList(mWorkSpecId));
    }
    else
    {
      mWorkConstraintsTracker.replace(Collections.singletonList(localObject));
    }
  }
  
  public void onAllConstraintsMet(@NonNull List<String> paramList)
  {
    if (!paramList.contains(mWorkSpecId)) {
      return;
    }
    synchronized (mLock)
    {
      if (mCurrentState == 0)
      {
        mCurrentState = 1;
        Logger.get().debug(TAG, String.format("onAllConstraintsMet for %s", new Object[] { mWorkSpecId }), new Throwable[0]);
        if (mDispatcher.getProcessor().startWork(mWorkSpecId)) {
          mDispatcher.getWorkTimer().startTimer(mWorkSpecId, 600000L, this);
        } else {
          cleanUp();
        }
      }
      else
      {
        Logger.get().debug(TAG, String.format("Already started work for %s", new Object[] { mWorkSpecId }), new Throwable[0]);
      }
      return;
    }
  }
  
  public void onAllConstraintsNotMet(@NonNull List<String> paramList)
  {
    stopWork();
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    Logger.get().debug(TAG, String.format("onExecuted %s, %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) }), new Throwable[0]);
    cleanUp();
    Object localObject;
    if (paramBoolean)
    {
      paramString = CommandHandler.createScheduleWorkIntent(mContext, mWorkSpecId);
      localObject = mDispatcher;
      ((SystemAlarmDispatcher)localObject).postOnMainThread(new SystemAlarmDispatcher.AddRunnable((SystemAlarmDispatcher)localObject, paramString, mStartId));
    }
    if (mHasConstraints)
    {
      localObject = CommandHandler.createConstraintsChangedIntent(mContext);
      paramString = mDispatcher;
      paramString.postOnMainThread(new SystemAlarmDispatcher.AddRunnable(paramString, (Intent)localObject, mStartId));
    }
  }
  
  public void onTimeLimitExceeded(@NonNull String paramString)
  {
    Logger.get().debug(TAG, String.format("Exceeded time limits on execution for %s", new Object[] { paramString }), new Throwable[0]);
    stopWork();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.DelayMetCommandHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
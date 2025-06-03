package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class ConstraintsCommandHandler
{
  private static final String TAG = Logger.tagWithPrefix("ConstraintsCmdHandler");
  private final Context mContext;
  private final SystemAlarmDispatcher mDispatcher;
  private final int mStartId;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  
  public ConstraintsCommandHandler(@NonNull Context paramContext, int paramInt, @NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    mContext = paramContext;
    mStartId = paramInt;
    mDispatcher = paramSystemAlarmDispatcher;
    mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramSystemAlarmDispatcher.getTaskExecutor(), null);
  }
  
  @WorkerThread
  public void handleConstraintsChanged()
  {
    Object localObject1 = mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getScheduledWork();
    ConstraintProxy.updateAll(mContext, (List)localObject1);
    mWorkConstraintsTracker.replace((Iterable)localObject1);
    Object localObject2 = new ArrayList(((List)localObject1).size());
    long l = System.currentTimeMillis();
    Object localObject3 = ((List)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (WorkSpec)((Iterator)localObject3).next();
      String str = id;
      if ((l >= ((WorkSpec)localObject1).calculateNextRunTime()) && ((!((WorkSpec)localObject1).hasConstraints()) || (mWorkConstraintsTracker.areAllConstraintsMet(str)))) {
        ((ArrayList)localObject2).add(localObject1);
      }
    }
    localObject2 = ((ArrayList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = nextid;
      localObject1 = CommandHandler.createDelayMetIntent(mContext, (String)localObject3);
      Logger.get().debug(TAG, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[] { localObject3 }), new Throwable[0]);
      localObject3 = mDispatcher;
      ((SystemAlarmDispatcher)localObject3).postOnMainThread(new SystemAlarmDispatcher.AddRunnable((SystemAlarmDispatcher)localObject3, (Intent)localObject1, mStartId));
    }
    mWorkConstraintsTracker.reset();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintsCommandHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
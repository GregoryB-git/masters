package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class GreedyScheduler
  implements Scheduler, WorkConstraintsCallback, ExecutionListener
{
  private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
  private final Set<WorkSpec> mConstrainedWorkSpecs = new HashSet();
  private final Context mContext;
  private DelayedWorkTracker mDelayedWorkTracker;
  public Boolean mInDefaultProcess;
  private final Object mLock;
  private boolean mRegisteredExecutionListener;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  private final WorkManagerImpl mWorkManagerImpl;
  
  public GreedyScheduler(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkManagerImpl paramWorkManagerImpl)
  {
    mContext = paramContext;
    mWorkManagerImpl = paramWorkManagerImpl;
    mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramTaskExecutor, this);
    mDelayedWorkTracker = new DelayedWorkTracker(this, paramConfiguration.getRunnableScheduler());
    mLock = new Object();
  }
  
  @VisibleForTesting
  public GreedyScheduler(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull WorkConstraintsTracker paramWorkConstraintsTracker)
  {
    mContext = paramContext;
    mWorkManagerImpl = paramWorkManagerImpl;
    mWorkConstraintsTracker = paramWorkConstraintsTracker;
    mLock = new Object();
  }
  
  private void checkDefaultProcess()
  {
    Configuration localConfiguration = mWorkManagerImpl.getConfiguration();
    mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(mContext, localConfiguration));
  }
  
  private void registerExecutionListenerIfNeeded()
  {
    if (!mRegisteredExecutionListener)
    {
      mWorkManagerImpl.getProcessor().addExecutionListener(this);
      mRegisteredExecutionListener = true;
    }
  }
  
  private void removeConstraintTrackingFor(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      Iterator localIterator = mConstrainedWorkSpecs.iterator();
      while (localIterator.hasNext())
      {
        WorkSpec localWorkSpec = (WorkSpec)localIterator.next();
        if (id.equals(paramString))
        {
          Logger.get().debug(TAG, String.format("Stopping tracking for %s", new Object[] { paramString }), new Throwable[0]);
          mConstrainedWorkSpecs.remove(localWorkSpec);
          mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
        }
      }
      return;
    }
  }
  
  public void cancel(@NonNull String paramString)
  {
    if (mInDefaultProcess == null) {
      checkDefaultProcess();
    }
    if (!mInDefaultProcess.booleanValue())
    {
      Logger.get().info(TAG, "Ignoring schedule request in non-main process", new Throwable[0]);
      return;
    }
    registerExecutionListenerIfNeeded();
    Logger.get().debug(TAG, String.format("Cancelling work ID %s", new Object[] { paramString }), new Throwable[0]);
    DelayedWorkTracker localDelayedWorkTracker = mDelayedWorkTracker;
    if (localDelayedWorkTracker != null) {
      localDelayedWorkTracker.unschedule(paramString);
    }
    mWorkManagerImpl.stopWork(paramString);
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return false;
  }
  
  public void onAllConstraintsMet(@NonNull List<String> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      Logger.get().debug(TAG, String.format("Constraints met: Scheduling work ID %s", new Object[] { str }), new Throwable[0]);
      mWorkManagerImpl.startWork(str);
    }
  }
  
  public void onAllConstraintsNotMet(@NonNull List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      Logger.get().debug(TAG, String.format("Constraints not met: Cancelling work ID %s", new Object[] { paramList }), new Throwable[0]);
      mWorkManagerImpl.stopWork(paramList);
    }
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    removeConstraintTrackingFor(paramString);
  }
  
  public void schedule(@NonNull WorkSpec... arg1)
  {
    if (mInDefaultProcess == null) {
      checkDefaultProcess();
    }
    if (!mInDefaultProcess.booleanValue())
    {
      Logger.get().info(TAG, "Ignoring schedule request in a secondary process", new Throwable[0]);
      return;
    }
    registerExecutionListenerIfNeeded();
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    int i = ???.length;
    for (int j = 0; j < i; j++)
    {
      WorkSpec localWorkSpec = ???[j];
      long l1 = localWorkSpec.calculateNextRunTime();
      long l2 = System.currentTimeMillis();
      if (state == WorkInfo.State.ENQUEUED) {
        if (l2 < l1)
        {
          DelayedWorkTracker localDelayedWorkTracker = mDelayedWorkTracker;
          if (localDelayedWorkTracker != null) {
            localDelayedWorkTracker.schedule(localWorkSpec);
          }
        }
        else if (localWorkSpec.hasConstraints())
        {
          if (constraints.requiresDeviceIdle())
          {
            Logger.get().debug(TAG, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[] { localWorkSpec }), new Throwable[0]);
          }
          else if (constraints.hasContentUriTriggers())
          {
            Logger.get().debug(TAG, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[] { localWorkSpec }), new Throwable[0]);
          }
          else
          {
            localHashSet1.add(localWorkSpec);
            localHashSet2.add(id);
          }
        }
        else
        {
          Logger.get().debug(TAG, String.format("Starting work for %s", new Object[] { id }), new Throwable[0]);
          mWorkManagerImpl.startWork(id);
        }
      }
    }
    synchronized (mLock)
    {
      if (!localHashSet1.isEmpty())
      {
        Logger.get().debug(TAG, String.format("Starting tracking for [%s]", new Object[] { TextUtils.join(",", localHashSet2) }), new Throwable[0]);
        mConstrainedWorkSpecs.addAll(localHashSet1);
        mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
      }
      return;
    }
  }
  
  @VisibleForTesting
  public void setDelayedWorkTracker(@NonNull DelayedWorkTracker paramDelayedWorkTracker)
  {
    mDelayedWorkTracker = paramDelayedWorkTracker;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.greedy.GreedyScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
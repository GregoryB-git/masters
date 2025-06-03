package androidx.work.impl.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.RoomDatabase;
import androidx.work.Constraints;
import androidx.work.Data.Builder;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.Operation.State.FAILURE;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class EnqueueRunnable
  implements Runnable
{
  private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
  private final OperationImpl mOperation;
  private final WorkContinuationImpl mWorkContinuation;
  
  public EnqueueRunnable(@NonNull WorkContinuationImpl paramWorkContinuationImpl)
  {
    mWorkContinuation = paramWorkContinuationImpl;
    mOperation = new OperationImpl();
  }
  
  private static boolean enqueueContinuation(@NonNull WorkContinuationImpl paramWorkContinuationImpl)
  {
    Set localSet = WorkContinuationImpl.prerequisitesFor(paramWorkContinuationImpl);
    boolean bool = enqueueWorkWithPrerequisites(paramWorkContinuationImpl.getWorkManagerImpl(), paramWorkContinuationImpl.getWork(), (String[])localSet.toArray(new String[0]), paramWorkContinuationImpl.getName(), paramWorkContinuationImpl.getExistingWorkPolicy());
    paramWorkContinuationImpl.markEnqueued();
    return bool;
  }
  
  private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl paramWorkManagerImpl, @NonNull List<? extends WorkRequest> paramList, String[] paramArrayOfString, String paramString, ExistingWorkPolicy paramExistingWorkPolicy)
  {
    long l = System.currentTimeMillis();
    WorkDatabase localWorkDatabase = paramWorkManagerImpl.getWorkDatabase();
    boolean bool1 = true;
    int i;
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    Object localObject2;
    if (i != 0)
    {
      j = paramArrayOfString.length;
      k = 1;
      m = 0;
      n = m;
      for (i1 = n;; i1 = i3)
      {
        i2 = k;
        i3 = n;
        i4 = i1;
        if (m >= j) {
          break;
        }
        localObject1 = paramArrayOfString[m];
        localObject2 = localWorkDatabase.workSpecDao().getWorkSpec((String)localObject1);
        if (localObject2 == null)
        {
          Logger.get().error(TAG, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[] { localObject1 }), new Throwable[0]);
          return false;
        }
        localObject1 = state;
        if (localObject1 == WorkInfo.State.SUCCEEDED) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        k &= i3;
        if (localObject1 == WorkInfo.State.FAILED)
        {
          i3 = 1;
        }
        else
        {
          i3 = i1;
          if (localObject1 == WorkInfo.State.CANCELLED)
          {
            n = 1;
            i3 = i1;
          }
        }
        m++;
      }
    }
    int i2 = 1;
    int i3 = 0;
    int i4 = i3;
    boolean bool2 = TextUtils.isEmpty(paramString) ^ true;
    if ((bool2) && (i == 0)) {
      j = 1;
    } else {
      j = 0;
    }
    Object localObject1 = paramArrayOfString;
    int i1 = i;
    int n = i2;
    int k = i3;
    int m = i4;
    if (j != 0)
    {
      localObject2 = localWorkDatabase.workSpecDao().getWorkSpecIdAndStatesForName(paramString);
      localObject1 = paramArrayOfString;
      i1 = i;
      n = i2;
      k = i3;
      m = i4;
      if (!((List)localObject2).isEmpty())
      {
        if ((paramExistingWorkPolicy != ExistingWorkPolicy.APPEND) && (paramExistingWorkPolicy != ExistingWorkPolicy.APPEND_OR_REPLACE))
        {
          if (paramExistingWorkPolicy == ExistingWorkPolicy.KEEP)
          {
            paramExistingWorkPolicy = ((List)localObject2).iterator();
            while (paramExistingWorkPolicy.hasNext())
            {
              localObject1 = nextstate;
              if ((localObject1 == WorkInfo.State.ENQUEUED) || (localObject1 == WorkInfo.State.RUNNING)) {
                return false;
              }
            }
          }
          CancelWorkRunnable.forName(paramString, paramWorkManagerImpl, false).run();
          paramExistingWorkPolicy = localWorkDatabase.workSpecDao();
          localObject1 = ((List)localObject2).iterator();
          for (;;)
          {
            paramWorkManagerImpl = paramArrayOfString;
            bool3 = bool1;
            i1 = i;
            n = i2;
            k = i3;
            m = i4;
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            paramExistingWorkPolicy.delete(nextid);
          }
        }
        paramWorkManagerImpl = localWorkDatabase.dependencyDao();
        localObject1 = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          WorkSpec.IdAndState localIdAndState = (WorkSpec.IdAndState)((Iterator)localObject2).next();
          n = i2;
          i1 = i3;
          i = i4;
          if (!paramWorkManagerImpl.hasDependents(id))
          {
            WorkInfo.State localState = state;
            if (localState == WorkInfo.State.SUCCEEDED) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (localState == WorkInfo.State.FAILED)
            {
              i = 1;
            }
            else
            {
              i = i4;
              if (localState == WorkInfo.State.CANCELLED)
              {
                i3 = 1;
                i = i4;
              }
            }
            ((ArrayList)localObject1).add(id);
            n = i1 & i2;
            i1 = i3;
          }
          i2 = n;
          i3 = i1;
          i4 = i;
        }
        k = i3;
        m = i4;
        paramWorkManagerImpl = (WorkManagerImpl)localObject1;
        if (paramExistingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
          if (i3 == 0)
          {
            k = i3;
            m = i4;
            paramWorkManagerImpl = (WorkManagerImpl)localObject1;
            if (i4 == 0) {}
          }
          else
          {
            paramWorkManagerImpl = localWorkDatabase.workSpecDao();
            paramExistingWorkPolicy = paramWorkManagerImpl.getWorkSpecIdAndStatesForName(paramString).iterator();
            while (paramExistingWorkPolicy.hasNext()) {
              paramWorkManagerImpl.delete(nextid);
            }
            paramWorkManagerImpl = Collections.emptyList();
            k = 0;
            m = 0;
          }
        }
        localObject1 = (String[])paramWorkManagerImpl.toArray(paramArrayOfString);
        if (localObject1.length > 0)
        {
          i1 = 1;
          n = i2;
        }
        else
        {
          i1 = 0;
          n = i2;
        }
      }
    }
    boolean bool3 = false;
    paramWorkManagerImpl = (WorkManagerImpl)localObject1;
    for (paramList = paramList.iterator(); paramList.hasNext(); paramList = paramArrayOfString)
    {
      localObject1 = (WorkRequest)paramList.next();
      paramArrayOfString = ((WorkRequest)localObject1).getWorkSpec();
      if ((i1 != 0) && (n == 0))
      {
        if (m != 0) {
          state = WorkInfo.State.FAILED;
        } else if (k != 0) {
          state = WorkInfo.State.CANCELLED;
        } else {
          state = WorkInfo.State.BLOCKED;
        }
      }
      else if (!paramArrayOfString.isPeriodic()) {
        periodStartTime = l;
      } else {
        periodStartTime = 0L;
      }
      if (Build.VERSION.SDK_INT <= 25) {
        tryDelegateConstrainedWorkSpec(paramArrayOfString);
      }
      if (state == WorkInfo.State.ENQUEUED) {
        bool3 = true;
      }
      localWorkDatabase.workSpecDao().insertWorkSpec(paramArrayOfString);
      paramExistingWorkPolicy = paramWorkManagerImpl;
      paramArrayOfString = paramList;
      if (i1 != 0)
      {
        i4 = paramWorkManagerImpl.length;
        for (i3 = 0;; i3++)
        {
          paramExistingWorkPolicy = paramWorkManagerImpl;
          paramArrayOfString = paramList;
          if (i3 >= i4) {
            break;
          }
          paramArrayOfString = paramWorkManagerImpl[i3];
          paramArrayOfString = new Dependency(((WorkRequest)localObject1).getStringId(), paramArrayOfString);
          localWorkDatabase.dependencyDao().insertDependency(paramArrayOfString);
        }
      }
      paramWorkManagerImpl = ((WorkRequest)localObject1).getTags().iterator();
      while (paramWorkManagerImpl.hasNext())
      {
        paramList = (String)paramWorkManagerImpl.next();
        localWorkDatabase.workTagDao().insert(new WorkTag(paramList, ((WorkRequest)localObject1).getStringId()));
      }
      if (bool2) {
        localWorkDatabase.workNameDao().insert(new WorkName(paramString, ((WorkRequest)localObject1).getStringId()));
      }
      paramWorkManagerImpl = paramExistingWorkPolicy;
    }
    return bool3;
  }
  
  private static boolean processContinuation(@NonNull WorkContinuationImpl paramWorkContinuationImpl)
  {
    Object localObject = paramWorkContinuationImpl.getParents();
    boolean bool = false;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      bool = false;
      while (((Iterator)localObject).hasNext())
      {
        WorkContinuationImpl localWorkContinuationImpl = (WorkContinuationImpl)((Iterator)localObject).next();
        if (!localWorkContinuationImpl.isEnqueued()) {
          bool |= processContinuation(localWorkContinuationImpl);
        } else {
          Logger.get().warning(TAG, String.format("Already enqueued work ids (%s).", new Object[] { TextUtils.join(", ", localWorkContinuationImpl.getIds()) }), new Throwable[0]);
        }
      }
    }
    return enqueueContinuation(paramWorkContinuationImpl) | bool;
  }
  
  private static void tryDelegateConstrainedWorkSpec(WorkSpec paramWorkSpec)
  {
    Object localObject = constraints;
    String str = workerClassName;
    if ((!str.equals(ConstraintTrackingWorker.class.getName())) && ((((Constraints)localObject).requiresBatteryNotLow()) || (((Constraints)localObject).requiresStorageNotLow())))
    {
      localObject = new Data.Builder();
      ((Data.Builder)localObject).putAll(input).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
      workerClassName = ConstraintTrackingWorker.class.getName();
      input = ((Data.Builder)localObject).build();
    }
  }
  
  private static boolean usesScheduler(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      paramWorkManagerImpl = paramWorkManagerImpl.getSchedulers().iterator();
      while (paramWorkManagerImpl.hasNext())
      {
        boolean bool = paramString.isAssignableFrom(((Scheduler)paramWorkManagerImpl.next()).getClass());
        if (bool) {
          return true;
        }
      }
    }
    catch (ClassNotFoundException paramWorkManagerImpl)
    {
      for (;;) {}
    }
    return false;
  }
  
  @VisibleForTesting
  public boolean addToDatabase()
  {
    WorkDatabase localWorkDatabase = mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      boolean bool = processContinuation(mWorkContinuation);
      localWorkDatabase.setTransactionSuccessful();
      return bool;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
  
  @NonNull
  public Operation getOperation()
  {
    return mOperation;
  }
  
  public void run()
  {
    try
    {
      if (!mWorkContinuation.hasCycles())
      {
        if (addToDatabase())
        {
          PackageManagerHelper.setComponentEnabled(mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
          scheduleWorkInBackground();
        }
        mOperation.setState(Operation.SUCCESS);
      }
      else
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>(String.format("WorkContinuation has cycles (%s)", new Object[] { mWorkContinuation }));
        throw localIllegalStateException;
      }
    }
    finally
    {
      mOperation.setState(new Operation.State.FAILURE(localThrowable));
    }
  }
  
  @VisibleForTesting
  public void scheduleWorkInBackground()
  {
    WorkManagerImpl localWorkManagerImpl = mWorkContinuation.getWorkManagerImpl();
    Schedulers.schedule(localWorkManagerImpl.getConfiguration(), localWorkManagerImpl.getWorkDatabase(), localWorkManagerImpl.getSchedulers());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.EnqueueRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
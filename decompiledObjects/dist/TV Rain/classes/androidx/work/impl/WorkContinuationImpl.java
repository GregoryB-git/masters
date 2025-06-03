package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.WorkRequest.Builder;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkContinuationImpl
  extends WorkContinuation
{
  private static final String TAG = Logger.tagWithPrefix("WorkContinuationImpl");
  private final List<String> mAllIds;
  private boolean mEnqueued;
  private final ExistingWorkPolicy mExistingWorkPolicy;
  private final List<String> mIds;
  private final String mName;
  private Operation mOperation;
  private final List<WorkContinuationImpl> mParents;
  private final List<? extends WorkRequest> mWork;
  private final WorkManagerImpl mWorkManagerImpl;
  
  public WorkContinuationImpl(@NonNull WorkManagerImpl paramWorkManagerImpl, @Nullable String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<? extends WorkRequest> paramList)
  {
    this(paramWorkManagerImpl, paramString, paramExistingWorkPolicy, paramList, null);
  }
  
  public WorkContinuationImpl(@NonNull WorkManagerImpl paramWorkManagerImpl, @Nullable String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<? extends WorkRequest> paramList, @Nullable List<WorkContinuationImpl> paramList1)
  {
    mWorkManagerImpl = paramWorkManagerImpl;
    mName = paramString;
    mExistingWorkPolicy = paramExistingWorkPolicy;
    mWork = paramList;
    mParents = paramList1;
    mIds = new ArrayList(paramList.size());
    mAllIds = new ArrayList();
    if (paramList1 != null)
    {
      paramString = paramList1.iterator();
      while (paramString.hasNext())
      {
        paramWorkManagerImpl = (WorkContinuationImpl)paramString.next();
        mAllIds.addAll(mAllIds);
      }
    }
    for (int i = 0; i < paramList.size(); i++)
    {
      paramWorkManagerImpl = ((WorkRequest)paramList.get(i)).getStringId();
      mIds.add(paramWorkManagerImpl);
      mAllIds.add(paramWorkManagerImpl);
    }
  }
  
  public WorkContinuationImpl(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull List<? extends WorkRequest> paramList)
  {
    this(paramWorkManagerImpl, null, ExistingWorkPolicy.KEEP, paramList, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  private static boolean hasCycles(@NonNull WorkContinuationImpl paramWorkContinuationImpl, @NonNull Set<String> paramSet)
  {
    paramSet.addAll(paramWorkContinuationImpl.getIds());
    Object localObject = prerequisitesFor(paramWorkContinuationImpl);
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext()) {
      if (((Set)localObject).contains((String)localIterator.next())) {
        return true;
      }
    }
    localObject = paramWorkContinuationImpl.getParents();
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (hasCycles((WorkContinuationImpl)((Iterator)localObject).next(), paramSet)) {
          return true;
        }
      }
    }
    paramSet.removeAll(paramWorkContinuationImpl.getIds());
    return false;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Set<String> prerequisitesFor(WorkContinuationImpl paramWorkContinuationImpl)
  {
    HashSet localHashSet = new HashSet();
    paramWorkContinuationImpl = paramWorkContinuationImpl.getParents();
    if ((paramWorkContinuationImpl != null) && (!paramWorkContinuationImpl.isEmpty()))
    {
      paramWorkContinuationImpl = paramWorkContinuationImpl.iterator();
      while (paramWorkContinuationImpl.hasNext()) {
        localHashSet.addAll(((WorkContinuationImpl)paramWorkContinuationImpl.next()).getIds());
      }
    }
    return localHashSet;
  }
  
  @NonNull
  public WorkContinuation combineInternal(@NonNull List<WorkContinuation> paramList)
  {
    OneTimeWorkRequest localOneTimeWorkRequest = (OneTimeWorkRequest)new OneTimeWorkRequest.Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add((WorkContinuationImpl)paramList.next());
    }
    return new WorkContinuationImpl(mWorkManagerImpl, null, ExistingWorkPolicy.KEEP, Collections.singletonList(localOneTimeWorkRequest), localArrayList);
  }
  
  @NonNull
  public Operation enqueue()
  {
    if (!mEnqueued)
    {
      EnqueueRunnable localEnqueueRunnable = new EnqueueRunnable(this);
      mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(localEnqueueRunnable);
      mOperation = localEnqueueRunnable.getOperation();
    }
    else
    {
      Logger.get().warning(TAG, String.format("Already enqueued work ids (%s)", new Object[] { TextUtils.join(", ", mIds) }), new Throwable[0]);
    }
    return mOperation;
  }
  
  public List<String> getAllIds()
  {
    return mAllIds;
  }
  
  public ExistingWorkPolicy getExistingWorkPolicy()
  {
    return mExistingWorkPolicy;
  }
  
  @NonNull
  public List<String> getIds()
  {
    return mIds;
  }
  
  @Nullable
  public String getName()
  {
    return mName;
  }
  
  public List<WorkContinuationImpl> getParents()
  {
    return mParents;
  }
  
  @NonNull
  public List<? extends WorkRequest> getWork()
  {
    return mWork;
  }
  
  @NonNull
  public ListenableFuture<List<WorkInfo>> getWorkInfos()
  {
    StatusRunnable localStatusRunnable = StatusRunnable.forStringIds(mWorkManagerImpl, mAllIds);
    mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(localStatusRunnable);
    return localStatusRunnable.getFuture();
  }
  
  @NonNull
  public LiveData<List<WorkInfo>> getWorkInfosLiveData()
  {
    return mWorkManagerImpl.getWorkInfosById(mAllIds);
  }
  
  @NonNull
  public WorkManagerImpl getWorkManagerImpl()
  {
    return mWorkManagerImpl;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean hasCycles()
  {
    return hasCycles(this, new HashSet());
  }
  
  public boolean isEnqueued()
  {
    return mEnqueued;
  }
  
  public void markEnqueued()
  {
    mEnqueued = true;
  }
  
  @NonNull
  public WorkContinuation then(@NonNull List<OneTimeWorkRequest> paramList)
  {
    if (paramList.isEmpty()) {
      return this;
    }
    return new WorkContinuationImpl(mWorkManagerImpl, mName, ExistingWorkPolicy.KEEP, paramList, Collections.singletonList(this));
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkContinuationImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
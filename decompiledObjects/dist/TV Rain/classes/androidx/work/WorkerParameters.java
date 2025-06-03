package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters
{
  @NonNull
  private Executor mBackgroundExecutor;
  @NonNull
  private ForegroundUpdater mForegroundUpdater;
  @NonNull
  private UUID mId;
  @NonNull
  private Data mInputData;
  @NonNull
  private ProgressUpdater mProgressUpdater;
  private int mRunAttemptCount;
  @NonNull
  private RuntimeExtras mRuntimeExtras;
  @NonNull
  private Set<String> mTags;
  @NonNull
  private TaskExecutor mWorkTaskExecutor;
  @NonNull
  private WorkerFactory mWorkerFactory;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkerParameters(@NonNull UUID paramUUID, @NonNull Data paramData, @NonNull Collection<String> paramCollection, @NonNull RuntimeExtras paramRuntimeExtras, @IntRange(from=0L) int paramInt, @NonNull Executor paramExecutor, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkerFactory paramWorkerFactory, @NonNull ProgressUpdater paramProgressUpdater, @NonNull ForegroundUpdater paramForegroundUpdater)
  {
    mId = paramUUID;
    mInputData = paramData;
    mTags = new HashSet(paramCollection);
    mRuntimeExtras = paramRuntimeExtras;
    mRunAttemptCount = paramInt;
    mBackgroundExecutor = paramExecutor;
    mWorkTaskExecutor = paramTaskExecutor;
    mWorkerFactory = paramWorkerFactory;
    mProgressUpdater = paramProgressUpdater;
    mForegroundUpdater = paramForegroundUpdater;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Executor getBackgroundExecutor()
  {
    return mBackgroundExecutor;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public ForegroundUpdater getForegroundUpdater()
  {
    return mForegroundUpdater;
  }
  
  @NonNull
  public UUID getId()
  {
    return mId;
  }
  
  @NonNull
  public Data getInputData()
  {
    return mInputData;
  }
  
  @Nullable
  @RequiresApi(28)
  public Network getNetwork()
  {
    return mRuntimeExtras.network;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public ProgressUpdater getProgressUpdater()
  {
    return mProgressUpdater;
  }
  
  @IntRange(from=0L)
  public int getRunAttemptCount()
  {
    return mRunAttemptCount;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public RuntimeExtras getRuntimeExtras()
  {
    return mRuntimeExtras;
  }
  
  @NonNull
  public Set<String> getTags()
  {
    return mTags;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public TaskExecutor getTaskExecutor()
  {
    return mWorkTaskExecutor;
  }
  
  @NonNull
  @RequiresApi(24)
  public List<String> getTriggeredContentAuthorities()
  {
    return mRuntimeExtras.triggeredContentAuthorities;
  }
  
  @NonNull
  @RequiresApi(24)
  public List<Uri> getTriggeredContentUris()
  {
    return mRuntimeExtras.triggeredContentUris;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkerFactory getWorkerFactory()
  {
    return mWorkerFactory;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class RuntimeExtras
  {
    @RequiresApi(28)
    public Network network;
    @NonNull
    public List<String> triggeredContentAuthorities = Collections.emptyList();
    @NonNull
    public List<Uri> triggeredContentUris = Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkerParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
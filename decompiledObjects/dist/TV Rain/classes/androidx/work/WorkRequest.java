package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class WorkRequest
{
  public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000L;
  @SuppressLint({"MinMaxConstant"})
  public static final long MAX_BACKOFF_MILLIS = 18000000L;
  @SuppressLint({"MinMaxConstant"})
  public static final long MIN_BACKOFF_MILLIS = 10000L;
  @NonNull
  private UUID mId;
  @NonNull
  private Set<String> mTags;
  @NonNull
  private WorkSpec mWorkSpec;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkRequest(@NonNull UUID paramUUID, @NonNull WorkSpec paramWorkSpec, @NonNull Set<String> paramSet)
  {
    mId = paramUUID;
    mWorkSpec = paramWorkSpec;
    mTags = paramSet;
  }
  
  @NonNull
  public UUID getId()
  {
    return mId;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public String getStringId()
  {
    return mId.toString();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Set<String> getTags()
  {
    return mTags;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkSpec getWorkSpec()
  {
    return mWorkSpec;
  }
  
  public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest>
  {
    public boolean mBackoffCriteriaSet = false;
    public UUID mId = UUID.randomUUID();
    public Set<String> mTags = new HashSet();
    public WorkSpec mWorkSpec;
    public Class<? extends ListenableWorker> mWorkerClass;
    
    public Builder(@NonNull Class<? extends ListenableWorker> paramClass)
    {
      mWorkerClass = paramClass;
      mWorkSpec = new WorkSpec(mId.toString(), paramClass.getName());
      addTag(paramClass.getName());
    }
    
    @NonNull
    public final B addTag(@NonNull String paramString)
    {
      mTags.add(paramString);
      return getThis();
    }
    
    @NonNull
    public final W build()
    {
      WorkRequest localWorkRequest = buildInternal();
      Object localObject = mWorkSpec.constraints;
      int i;
      if ((!((Constraints)localObject).hasContentUriTriggers()) && (!((Constraints)localObject).requiresBatteryNotLow()) && (!((Constraints)localObject).requiresCharging()) && (!((Constraints)localObject).requiresDeviceIdle())) {
        i = 0;
      } else {
        i = 1;
      }
      localObject = mWorkSpec;
      if (expedited) {
        if (i == 0)
        {
          if (initialDelay > 0L) {
            throw new IllegalArgumentException("Expedited jobs cannot be delayed");
          }
        }
        else {
          throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
      }
      mId = UUID.randomUUID();
      localObject = new WorkSpec(mWorkSpec);
      mWorkSpec = ((WorkSpec)localObject);
      id = mId.toString();
      return localWorkRequest;
    }
    
    @NonNull
    public abstract W buildInternal();
    
    @NonNull
    public abstract B getThis();
    
    @NonNull
    public final B keepResultsForAtLeast(long paramLong, @NonNull TimeUnit paramTimeUnit)
    {
      mWorkSpec.minimumRetentionDuration = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
    
    @NonNull
    @RequiresApi(26)
    public final B keepResultsForAtLeast(@NonNull Duration paramDuration)
    {
      mWorkSpec.minimumRetentionDuration = paramDuration.toMillis();
      return getThis();
    }
    
    @NonNull
    public final B setBackoffCriteria(@NonNull BackoffPolicy paramBackoffPolicy, long paramLong, @NonNull TimeUnit paramTimeUnit)
    {
      mBackoffCriteriaSet = true;
      WorkSpec localWorkSpec = mWorkSpec;
      backoffPolicy = paramBackoffPolicy;
      localWorkSpec.setBackoffDelayDuration(paramTimeUnit.toMillis(paramLong));
      return getThis();
    }
    
    @NonNull
    @RequiresApi(26)
    public final B setBackoffCriteria(@NonNull BackoffPolicy paramBackoffPolicy, @NonNull Duration paramDuration)
    {
      mBackoffCriteriaSet = true;
      WorkSpec localWorkSpec = mWorkSpec;
      backoffPolicy = paramBackoffPolicy;
      localWorkSpec.setBackoffDelayDuration(paramDuration.toMillis());
      return getThis();
    }
    
    @NonNull
    public final B setConstraints(@NonNull Constraints paramConstraints)
    {
      mWorkSpec.constraints = paramConstraints;
      return getThis();
    }
    
    @SuppressLint({"MissingGetterMatchingBuilder"})
    @NonNull
    public B setExpedited(@NonNull OutOfQuotaPolicy paramOutOfQuotaPolicy)
    {
      WorkSpec localWorkSpec = mWorkSpec;
      expedited = true;
      outOfQuotaPolicy = paramOutOfQuotaPolicy;
      return getThis();
    }
    
    @NonNull
    public B setInitialDelay(long paramLong, @NonNull TimeUnit paramTimeUnit)
    {
      mWorkSpec.initialDelay = paramTimeUnit.toMillis(paramLong);
      if (Long.MAX_VALUE - System.currentTimeMillis() > mWorkSpec.initialDelay) {
        return getThis();
      }
      throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    
    @NonNull
    @RequiresApi(26)
    public B setInitialDelay(@NonNull Duration paramDuration)
    {
      mWorkSpec.initialDelay = paramDuration.toMillis();
      if (Long.MAX_VALUE - System.currentTimeMillis() > mWorkSpec.initialDelay) {
        return getThis();
      }
      throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final B setInitialRunAttemptCount(int paramInt)
    {
      mWorkSpec.runAttemptCount = paramInt;
      return getThis();
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final B setInitialState(@NonNull WorkInfo.State paramState)
    {
      mWorkSpec.state = paramState;
      return getThis();
    }
    
    @NonNull
    public final B setInputData(@NonNull Data paramData)
    {
      mWorkSpec.input = paramData;
      return getThis();
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final B setPeriodStartTime(long paramLong, @NonNull TimeUnit paramTimeUnit)
    {
      mWorkSpec.periodStartTime = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final B setScheduleRequestedAt(long paramLong, @NonNull TimeUnit paramTimeUnit)
    {
      mWorkSpec.scheduleRequestedAt = paramTimeUnit.toMillis(paramLong);
      return getThis();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class PeriodicWorkRequest$Builder
  extends WorkRequest.Builder<Builder, PeriodicWorkRequest>
{
  public PeriodicWorkRequest$Builder(@NonNull Class<? extends ListenableWorker> paramClass, long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    super(paramClass);
    mWorkSpec.setPeriodic(paramTimeUnit.toMillis(paramLong));
  }
  
  public PeriodicWorkRequest$Builder(@NonNull Class<? extends ListenableWorker> paramClass, long paramLong1, @NonNull TimeUnit paramTimeUnit1, long paramLong2, @NonNull TimeUnit paramTimeUnit2)
  {
    super(paramClass);
    mWorkSpec.setPeriodic(paramTimeUnit1.toMillis(paramLong1), paramTimeUnit2.toMillis(paramLong2));
  }
  
  @RequiresApi(26)
  public PeriodicWorkRequest$Builder(@NonNull Class<? extends ListenableWorker> paramClass, @NonNull Duration paramDuration)
  {
    super(paramClass);
    mWorkSpec.setPeriodic(paramDuration.toMillis());
  }
  
  @RequiresApi(26)
  public PeriodicWorkRequest$Builder(@NonNull Class<? extends ListenableWorker> paramClass, @NonNull Duration paramDuration1, @NonNull Duration paramDuration2)
  {
    super(paramClass);
    mWorkSpec.setPeriodic(paramDuration1.toMillis(), paramDuration2.toMillis());
  }
  
  @NonNull
  public PeriodicWorkRequest buildInternal()
  {
    if ((mBackoffCriteriaSet) && (mWorkSpec.constraints.requiresDeviceIdle())) {
      throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
    if (!mWorkSpec.expedited) {
      return new PeriodicWorkRequest(this);
    }
    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
  }
  
  @NonNull
  public Builder getThis()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.work.PeriodicWorkRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
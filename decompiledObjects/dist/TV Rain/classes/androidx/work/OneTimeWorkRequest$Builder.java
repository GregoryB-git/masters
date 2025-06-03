package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;

public final class OneTimeWorkRequest$Builder
  extends WorkRequest.Builder<Builder, OneTimeWorkRequest>
{
  public OneTimeWorkRequest$Builder(@NonNull Class<? extends ListenableWorker> paramClass)
  {
    super(paramClass);
    mWorkSpec.inputMergerClassName = OverwritingInputMerger.class.getName();
  }
  
  @NonNull
  public OneTimeWorkRequest buildInternal()
  {
    if ((mBackoffCriteriaSet) && (mWorkSpec.constraints.requiresDeviceIdle())) {
      throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
    return new OneTimeWorkRequest(this);
  }
  
  @NonNull
  public Builder getThis()
  {
    return this;
  }
  
  @NonNull
  public Builder setInputMerger(@NonNull Class<? extends InputMerger> paramClass)
  {
    mWorkSpec.inputMergerClassName = paramClass.getName();
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.work.OneTimeWorkRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OneTimeWorkRequest
  extends WorkRequest
{
  public OneTimeWorkRequest(Builder paramBuilder)
  {
    super(mId, mWorkSpec, mTags);
  }
  
  @NonNull
  public static OneTimeWorkRequest from(@NonNull Class<? extends ListenableWorker> paramClass)
  {
    return (OneTimeWorkRequest)new Builder(paramClass).build();
  }
  
  @NonNull
  public static List<OneTimeWorkRequest> from(@NonNull List<Class<? extends ListenableWorker>> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add((OneTimeWorkRequest)new Builder((Class)paramList.next()).build());
    }
    return localArrayList;
  }
  
  public static final class Builder
    extends WorkRequest.Builder<Builder, OneTimeWorkRequest>
  {
    public Builder(@NonNull Class<? extends ListenableWorker> paramClass)
    {
      super();
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
}

/* Location:
 * Qualified Name:     androidx.work.OneTimeWorkRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
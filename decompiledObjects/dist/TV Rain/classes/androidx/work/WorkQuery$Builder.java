package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class WorkQuery$Builder
{
  public List<UUID> mIds = new ArrayList();
  public List<WorkInfo.State> mStates = new ArrayList();
  public List<String> mTags = new ArrayList();
  public List<String> mUniqueWorkNames = new ArrayList();
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public static Builder fromIds(@NonNull List<UUID> paramList)
  {
    Builder localBuilder = new Builder();
    localBuilder.addIds(paramList);
    return localBuilder;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public static Builder fromStates(@NonNull List<WorkInfo.State> paramList)
  {
    Builder localBuilder = new Builder();
    localBuilder.addStates(paramList);
    return localBuilder;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public static Builder fromTags(@NonNull List<String> paramList)
  {
    Builder localBuilder = new Builder();
    localBuilder.addTags(paramList);
    return localBuilder;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @NonNull
  public static Builder fromUniqueWorkNames(@NonNull List<String> paramList)
  {
    Builder localBuilder = new Builder();
    localBuilder.addUniqueWorkNames(paramList);
    return localBuilder;
  }
  
  @NonNull
  public Builder addIds(@NonNull List<UUID> paramList)
  {
    mIds.addAll(paramList);
    return this;
  }
  
  @NonNull
  public Builder addStates(@NonNull List<WorkInfo.State> paramList)
  {
    mStates.addAll(paramList);
    return this;
  }
  
  @NonNull
  public Builder addTags(@NonNull List<String> paramList)
  {
    mTags.addAll(paramList);
    return this;
  }
  
  @NonNull
  public Builder addUniqueWorkNames(@NonNull List<String> paramList)
  {
    mUniqueWorkNames.addAll(paramList);
    return this;
  }
  
  @NonNull
  public WorkQuery build()
  {
    if ((mIds.isEmpty()) && (mUniqueWorkNames.isEmpty()) && (mTags.isEmpty()) && (mStates.isEmpty())) {
      throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
    }
    return new WorkQuery(this);
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkQuery.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
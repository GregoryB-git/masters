package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import z2;

public final class WorkInfo
{
  @NonNull
  private UUID mId;
  @NonNull
  private Data mOutputData;
  @NonNull
  private Data mProgress;
  private int mRunAttemptCount;
  @NonNull
  private State mState;
  @NonNull
  private Set<String> mTags;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkInfo(@NonNull UUID paramUUID, @NonNull State paramState, @NonNull Data paramData1, @NonNull List<String> paramList, @NonNull Data paramData2, int paramInt)
  {
    mId = paramUUID;
    mState = paramState;
    mOutputData = paramData1;
    mTags = new HashSet(paramList);
    mProgress = paramData2;
    mRunAttemptCount = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (WorkInfo.class == paramObject.getClass()))
    {
      paramObject = (WorkInfo)paramObject;
      if (mRunAttemptCount != mRunAttemptCount) {
        return false;
      }
      if (!mId.equals(mId)) {
        return false;
      }
      if (mState != mState) {
        return false;
      }
      if (!mOutputData.equals(mOutputData)) {
        return false;
      }
      if (!mTags.equals(mTags)) {
        return false;
      }
      return mProgress.equals(mProgress);
    }
    return false;
  }
  
  @NonNull
  public UUID getId()
  {
    return mId;
  }
  
  @NonNull
  public Data getOutputData()
  {
    return mOutputData;
  }
  
  @NonNull
  public Data getProgress()
  {
    return mProgress;
  }
  
  @IntRange(from=0L)
  public int getRunAttemptCount()
  {
    return mRunAttemptCount;
  }
  
  @NonNull
  public State getState()
  {
    return mState;
  }
  
  @NonNull
  public Set<String> getTags()
  {
    return mTags;
  }
  
  public int hashCode()
  {
    int i = mId.hashCode();
    int j = mState.hashCode();
    int k = mOutputData.hashCode();
    int m = mTags.hashCode();
    return (mProgress.hashCode() + (m + (k + (j + i * 31) * 31) * 31) * 31) * 31 + mRunAttemptCount;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("WorkInfo{mId='");
    localStringBuilder.append(mId);
    localStringBuilder.append('\'');
    localStringBuilder.append(", mState=");
    localStringBuilder.append(mState);
    localStringBuilder.append(", mOutputData=");
    localStringBuilder.append(mOutputData);
    localStringBuilder.append(", mTags=");
    localStringBuilder.append(mTags);
    localStringBuilder.append(", mProgress=");
    localStringBuilder.append(mProgress);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static enum State
  {
    static
    {
      State localState1 = new State("ENQUEUED", 0);
      ENQUEUED = localState1;
      State localState2 = new State("RUNNING", 1);
      RUNNING = localState2;
      State localState3 = new State("SUCCEEDED", 2);
      SUCCEEDED = localState3;
      State localState4 = new State("FAILED", 3);
      FAILED = localState4;
      State localState5 = new State("BLOCKED", 4);
      BLOCKED = localState5;
      State localState6 = new State("CANCELLED", 5);
      CANCELLED = localState6;
      $VALUES = new State[] { localState1, localState2, localState3, localState4, localState5, localState6 };
    }
    
    private State() {}
    
    public boolean isFinished()
    {
      boolean bool;
      if ((this != SUCCEEDED) && (this != FAILED) && (this != CANCELLED)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
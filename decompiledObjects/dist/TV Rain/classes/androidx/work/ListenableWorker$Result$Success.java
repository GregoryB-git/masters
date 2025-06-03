package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ListenableWorker$Result$Success
  extends ListenableWorker.Result
{
  private final Data mOutputData;
  
  public ListenableWorker$Result$Success()
  {
    this(Data.EMPTY);
  }
  
  public ListenableWorker$Result$Success(@NonNull Data paramData)
  {
    mOutputData = paramData;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Success.class == paramObject.getClass()))
    {
      paramObject = (Success)paramObject;
      return mOutputData.equals(mOutputData);
    }
    return false;
  }
  
  @NonNull
  public Data getOutputData()
  {
    return mOutputData;
  }
  
  public int hashCode()
  {
    return mOutputData.hashCode() - 1876823561;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Success {mOutputData=");
    localStringBuilder.append(mOutputData);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.work.ListenableWorker.Result.Success
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ListenableWorker$Result$Failure
  extends ListenableWorker.Result
{
  private final Data mOutputData;
  
  public ListenableWorker$Result$Failure()
  {
    this(Data.EMPTY);
  }
  
  public ListenableWorker$Result$Failure(@NonNull Data paramData)
  {
    mOutputData = paramData;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Failure.class == paramObject.getClass()))
    {
      paramObject = (Failure)paramObject;
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
    return mOutputData.hashCode() + 846803280;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Failure {mOutputData=");
    localStringBuilder.append(mOutputData);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.work.ListenableWorker.Result.Failure
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
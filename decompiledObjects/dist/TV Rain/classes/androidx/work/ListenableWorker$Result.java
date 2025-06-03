package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import z2;

public abstract class ListenableWorker$Result
{
  @NonNull
  public static Result failure()
  {
    return new Failure();
  }
  
  @NonNull
  public static Result failure(@NonNull Data paramData)
  {
    return new Failure(paramData);
  }
  
  @NonNull
  public static Result retry()
  {
    return new Retry();
  }
  
  @NonNull
  public static Result success()
  {
    return new Success();
  }
  
  @NonNull
  public static Result success(@NonNull Data paramData)
  {
    return new Success(paramData);
  }
  
  @NonNull
  public abstract Data getOutputData();
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final class Failure
    extends ListenableWorker.Result
  {
    private final Data mOutputData;
    
    public Failure()
    {
      this(Data.EMPTY);
    }
    
    public Failure(@NonNull Data paramData)
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
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final class Retry
    extends ListenableWorker.Result
  {
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject == null) || (Retry.class != paramObject.getClass())) {
        bool = false;
      }
      return bool;
    }
    
    @NonNull
    public Data getOutputData()
    {
      return Data.EMPTY;
    }
    
    public int hashCode()
    {
      return 25945934;
    }
    
    public String toString()
    {
      return "Retry";
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final class Success
    extends ListenableWorker.Result
  {
    private final Data mOutputData;
    
    public Success()
    {
      this(Data.EMPTY);
    }
    
    public Success(@NonNull Data paramData)
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
}

/* Location:
 * Qualified Name:     androidx.work.ListenableWorker.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
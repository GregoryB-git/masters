package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ListenableWorker$Result$Retry
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

/* Location:
 * Qualified Name:     androidx.work.ListenableWorker.Result.Retry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

public abstract interface Operation
{
  @SuppressLint({"SyntheticAccessor"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final Operation.State.IN_PROGRESS IN_PROGRESS = new Operation.State.IN_PROGRESS(null);
  @SuppressLint({"SyntheticAccessor"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final Operation.State.SUCCESS SUCCESS = new Operation.State.SUCCESS(null);
  
  @NonNull
  public abstract ListenableFuture<Operation.State.SUCCESS> getResult();
  
  @NonNull
  public abstract LiveData<State> getState();
  
  public static abstract class State
  {
    public static final class FAILURE
      extends Operation.State
    {
      private final Throwable mThrowable;
      
      public FAILURE(@NonNull Throwable paramThrowable)
      {
        mThrowable = paramThrowable;
      }
      
      @NonNull
      public Throwable getThrowable()
      {
        return mThrowable;
      }
      
      @NonNull
      public String toString()
      {
        return String.format("FAILURE (%s)", new Object[] { mThrowable.getMessage() });
      }
    }
    
    public static final class IN_PROGRESS
      extends Operation.State
    {
      @NonNull
      public String toString()
      {
        return "IN_PROGRESS";
      }
    }
    
    public static final class SUCCESS
      extends Operation.State
    {
      @NonNull
      public String toString()
      {
        return "SUCCESS";
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.Operation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
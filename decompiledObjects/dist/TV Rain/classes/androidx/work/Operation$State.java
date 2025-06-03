package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

public abstract class Operation$State
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

/* Location:
 * Qualified Name:     androidx.work.Operation.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
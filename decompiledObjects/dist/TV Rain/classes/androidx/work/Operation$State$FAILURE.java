package androidx.work;

import androidx.annotation.NonNull;

public final class Operation$State$FAILURE
  extends Operation.State
{
  private final Throwable mThrowable;
  
  public Operation$State$FAILURE(@NonNull Throwable paramThrowable)
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

/* Location:
 * Qualified Name:     androidx.work.Operation.State.FAILURE
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
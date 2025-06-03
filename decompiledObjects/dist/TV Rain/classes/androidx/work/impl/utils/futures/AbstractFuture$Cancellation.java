package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;

final class AbstractFuture$Cancellation
{
  public static final Cancellation CAUSELESS_CANCELLED;
  public static final Cancellation CAUSELESS_INTERRUPTED;
  @Nullable
  public final Throwable cause;
  public final boolean wasInterrupted;
  
  static
  {
    if (AbstractFuture.GENERATE_CANCELLATION_CAUSES)
    {
      CAUSELESS_CANCELLED = null;
      CAUSELESS_INTERRUPTED = null;
    }
    else
    {
      CAUSELESS_CANCELLED = new Cancellation(false, null);
      CAUSELESS_INTERRUPTED = new Cancellation(true, null);
    }
  }
  
  public AbstractFuture$Cancellation(boolean paramBoolean, @Nullable Throwable paramThrowable)
  {
    wasInterrupted = paramBoolean;
    cause = paramThrowable;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.Cancellation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work.impl.utils.futures;

final class AbstractFuture$Failure
{
  public static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.")
  {
    public Throwable fillInStackTrace()
    {
      return this;
    }
  });
  public final Throwable exception;
  
  public AbstractFuture$Failure(Throwable paramThrowable)
  {
    exception = ((Throwable)AbstractFuture.checkNotNull(paramThrowable));
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.Failure
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
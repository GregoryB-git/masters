package androidx.concurrent.futures;

final class AbstractResolvableFuture$Failure
{
  public static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.")
  {
    public Throwable fillInStackTrace()
    {
      return this;
    }
  });
  public final Throwable exception;
  
  public AbstractResolvableFuture$Failure(Throwable paramThrowable)
  {
    exception = ((Throwable)AbstractResolvableFuture.checkNotNull(paramThrowable));
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.Failure
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package bolts;

import java.io.Closeable;

public class CancellationTokenRegistration
  implements Closeable
{
  private Runnable action;
  private boolean closed;
  private final Object lock = new Object();
  private CancellationTokenSource tokenSource;
  
  public CancellationTokenRegistration(CancellationTokenSource paramCancellationTokenSource, Runnable paramRunnable)
  {
    tokenSource = paramCancellationTokenSource;
    action = paramRunnable;
  }
  
  private void throwIfClosed()
  {
    if (!closed) {
      return;
    }
    throw new IllegalStateException("Object already closed");
  }
  
  public void close()
  {
    synchronized (lock)
    {
      if (closed) {
        return;
      }
      closed = true;
      tokenSource.unregister(this);
      tokenSource = null;
      action = null;
      return;
    }
  }
  
  public void runAction()
  {
    synchronized (lock)
    {
      throwIfClosed();
      action.run();
      close();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     bolts.CancellationTokenRegistration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
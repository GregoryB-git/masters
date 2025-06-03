package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CancellationTokenSource
  implements Closeable
{
  private boolean cancellationRequested;
  private boolean closed;
  private final ScheduledExecutorService executor = BoltsExecutors.scheduled();
  private final Object lock = new Object();
  private final List<CancellationTokenRegistration> registrations = new ArrayList();
  private ScheduledFuture<?> scheduledCancellation;
  
  private void cancelAfter(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool = paramLong < -1L;
    if (!bool)
    {
      if (paramLong == 0L)
      {
        cancel();
        return;
      }
      synchronized (lock)
      {
        if (cancellationRequested) {
          return;
        }
        cancelScheduledCancellation();
        if (bool)
        {
          ScheduledExecutorService localScheduledExecutorService = executor;
          Runnable local1 = new bolts/CancellationTokenSource$1;
          local1.<init>(this);
          scheduledCancellation = localScheduledExecutorService.schedule(local1, paramLong, paramTimeUnit);
        }
        return;
      }
    }
    throw new IllegalArgumentException("Delay must be >= -1");
  }
  
  private void cancelScheduledCancellation()
  {
    ScheduledFuture localScheduledFuture = scheduledCancellation;
    if (localScheduledFuture != null)
    {
      localScheduledFuture.cancel(true);
      scheduledCancellation = null;
    }
  }
  
  private void notifyListeners(List<CancellationTokenRegistration> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((CancellationTokenRegistration)paramList.next()).runAction();
    }
  }
  
  private void throwIfClosed()
  {
    if (!closed) {
      return;
    }
    throw new IllegalStateException("Object already closed");
  }
  
  public void cancel()
  {
    synchronized (lock)
    {
      throwIfClosed();
      if (cancellationRequested) {
        return;
      }
      cancelScheduledCancellation();
      cancellationRequested = true;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(registrations);
      notifyListeners(localArrayList);
      return;
    }
  }
  
  public void cancelAfter(long paramLong)
  {
    cancelAfter(paramLong, TimeUnit.MILLISECONDS);
  }
  
  public void close()
  {
    synchronized (lock)
    {
      if (closed) {
        return;
      }
      cancelScheduledCancellation();
      Iterator localIterator = registrations.iterator();
      while (localIterator.hasNext()) {
        ((CancellationTokenRegistration)localIterator.next()).close();
      }
      registrations.clear();
      closed = true;
      return;
    }
  }
  
  public CancellationToken getToken()
  {
    synchronized (lock)
    {
      throwIfClosed();
      CancellationToken localCancellationToken = new bolts/CancellationToken;
      localCancellationToken.<init>(this);
      return localCancellationToken;
    }
  }
  
  public boolean isCancellationRequested()
  {
    synchronized (lock)
    {
      throwIfClosed();
      boolean bool = cancellationRequested;
      return bool;
    }
  }
  
  public CancellationTokenRegistration register(Runnable paramRunnable)
  {
    synchronized (lock)
    {
      throwIfClosed();
      CancellationTokenRegistration localCancellationTokenRegistration = new bolts/CancellationTokenRegistration;
      localCancellationTokenRegistration.<init>(this, paramRunnable);
      if (cancellationRequested) {
        localCancellationTokenRegistration.runAction();
      } else {
        registrations.add(localCancellationTokenRegistration);
      }
      return localCancellationTokenRegistration;
    }
  }
  
  public void throwIfCancellationRequested()
    throws CancellationException
  {
    synchronized (lock)
    {
      throwIfClosed();
      if (!cancellationRequested) {
        return;
      }
      CancellationException localCancellationException = new java/util/concurrent/CancellationException;
      localCancellationException.<init>();
      throw localCancellationException;
    }
  }
  
  public String toString()
  {
    return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] { getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested()) });
  }
  
  public void unregister(CancellationTokenRegistration paramCancellationTokenRegistration)
  {
    synchronized (lock)
    {
      throwIfClosed();
      registrations.remove(paramCancellationTokenRegistration);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     bolts.CancellationTokenSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
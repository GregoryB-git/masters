package e1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import b1.w;
import d1.b.a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import q0.g;

public abstract class a<D>
  extends b<D>
{
  public Executor g;
  public volatile a<D>.a h;
  public volatile a<D>.a i;
  
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void b()
  {
    if ((i == null) && (h != null))
    {
      h.getClass();
      if (g == null) {
        g = AsyncTask.THREAD_POOL_EXECUTOR;
      }
      a locala = h;
      Executor localExecutor = g;
      if (b != 1)
      {
        int j = g.c(b);
        if (j != 1)
        {
          if (j != 2) {
            throw new IllegalStateException("We should never reach this state");
          }
          throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("Cannot execute task: the task is already running.");
      }
      b = 2;
      localExecutor.execute(a);
    }
  }
  
  public final void c()
  {
    h6.e locale = (h6.e)this;
    Iterator localIterator = k.iterator();
    if (!localIterator.hasNext())
    {
      try
      {
        j.tryAcquire(0, 5L, TimeUnit.SECONDS);
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.i("GACSignInLoader", "Unexpected InterruptedException", localInterruptedException);
        Thread.currentThread().interrupt();
      }
      return;
    }
    ((k6.e)localInterruptedException.next()).getClass();
    throw new UnsupportedOperationException();
  }
  
  public final class a
    extends c<D>
    implements Runnable
  {
    public a() {}
    
    public final void a()
    {
      c();
    }
    
    public final void b(D paramD)
    {
      paramD = a.this;
      if (i == this)
      {
        SystemClock.uptimeMillis();
        i = null;
        paramD.b();
      }
    }
    
    public final void c(D paramD)
    {
      Object localObject = a.this;
      if (h != this)
      {
        if (i == this)
        {
          SystemClock.uptimeMillis();
          i = null;
          ((a)localObject).b();
        }
      }
      else if (!d)
      {
        SystemClock.uptimeMillis();
        h = null;
        localObject = b;
        if (localObject != null)
        {
          localObject = (b.a)localObject;
          if (Looper.myLooper() == Looper.getMainLooper()) {
            ((b.a)localObject).setValue(paramD);
          } else {
            ((w)localObject).postValue(paramD);
          }
        }
      }
    }
    
    public final void run()
    {
      b();
    }
  }
}

/* Location:
 * Qualified Name:     e1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
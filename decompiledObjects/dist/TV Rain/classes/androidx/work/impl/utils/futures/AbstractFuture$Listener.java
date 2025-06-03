package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

final class AbstractFuture$Listener
{
  public static final Listener TOMBSTONE = new Listener(null, null);
  public final Executor executor;
  @Nullable
  public Listener next;
  public final Runnable task;
  
  public AbstractFuture$Listener(Runnable paramRunnable, Executor paramExecutor)
  {
    task = paramRunnable;
    executor = paramExecutor;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
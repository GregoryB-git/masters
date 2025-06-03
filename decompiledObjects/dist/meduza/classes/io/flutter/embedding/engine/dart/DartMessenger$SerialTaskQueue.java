package io.flutter.embedding.engine.dart;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

class DartMessenger$SerialTaskQueue
  implements DartMessenger.DartMessengerTaskQueue
{
  private final ExecutorService executor;
  private final AtomicBoolean isRunning;
  private final ConcurrentLinkedQueue<Runnable> queue;
  
  public DartMessenger$SerialTaskQueue(ExecutorService paramExecutorService)
  {
    executor = paramExecutorService;
    queue = new ConcurrentLinkedQueue();
    isRunning = new AtomicBoolean(false);
  }
  
  private void flush()
  {
    if (isRunning.compareAndSet(false, true)) {
      try
      {
        Runnable localRunnable = (Runnable)queue.poll();
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
      finally
      {
        isRunning.set(false);
        if (!queue.isEmpty()) {
          executor.execute(new b(this));
        }
      }
    }
  }
  
  public void dispatch(Runnable paramRunnable)
  {
    queue.add(paramRunnable);
    executor.execute(new c(this));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.SerialTaskQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.embedding.engine.dart;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class DartMessenger$ConcurrentTaskQueue
  implements DartMessenger.DartMessengerTaskQueue
{
  private final ExecutorService executor;
  
  public DartMessenger$ConcurrentTaskQueue(ExecutorService paramExecutorService)
  {
    executor = paramExecutorService;
  }
  
  public void dispatch(Runnable paramRunnable)
  {
    executor.execute(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.ConcurrentTaskQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
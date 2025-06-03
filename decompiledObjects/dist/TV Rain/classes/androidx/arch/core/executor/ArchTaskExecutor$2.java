package androidx.arch.core.executor;

import java.util.concurrent.Executor;

final class ArchTaskExecutor$2
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    ArchTaskExecutor.getInstance().executeOnDiskIO(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.arch.core.executor.ArchTaskExecutor.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
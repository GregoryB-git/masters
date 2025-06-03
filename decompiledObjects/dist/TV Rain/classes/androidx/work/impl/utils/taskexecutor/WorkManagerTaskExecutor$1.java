package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

class WorkManagerTaskExecutor$1
  implements Executor
{
  public WorkManagerTaskExecutor$1(WorkManagerTaskExecutor paramWorkManagerTaskExecutor) {}
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    this$0.postToMainThread(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
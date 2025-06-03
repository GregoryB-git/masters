package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SynchronousExecutor
  implements Executor
{
  public void execute(@NonNull Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.SynchronousExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
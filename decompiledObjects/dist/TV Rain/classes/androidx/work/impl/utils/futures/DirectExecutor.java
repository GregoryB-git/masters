package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
 enum DirectExecutor
  implements Executor
{
  static
  {
    DirectExecutor localDirectExecutor = new DirectExecutor("INSTANCE", 0);
    INSTANCE = localDirectExecutor;
    $VALUES = new DirectExecutor[] { localDirectExecutor };
  }
  
  private DirectExecutor() {}
  
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public String toString()
  {
    return "DirectExecutor";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.DirectExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
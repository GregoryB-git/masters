package k8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.auth.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class b
  implements Executor
{
  public final ExecutorService a;
  public final Object b = new Object();
  public Task<?> c = Tasks.forResult(null);
  
  public b(ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
  }
  
  public final Task<Void> a(Runnable paramRunnable)
  {
    synchronized (b)
    {
      Task localTask = c;
      ExecutorService localExecutorService = a;
      g localg = new io/flutter/plugins/firebase/auth/g;
      localg.<init>(paramRunnable, 17);
      paramRunnable = localTask.continueWithTask(localExecutorService, localg);
      c = paramRunnable;
      return paramRunnable;
    }
  }
  
  public final void execute(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     k8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
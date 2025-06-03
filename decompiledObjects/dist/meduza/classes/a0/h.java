package a0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class h
  implements Executor
{
  public final Handler a;
  
  public h(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    Handler localHandler = a;
    paramRunnable.getClass();
    if (localHandler.post(paramRunnable)) {
      return;
    }
    paramRunnable = new StringBuilder();
    paramRunnable.append(a);
    paramRunnable.append(" is shutting down");
    throw new RejectedExecutionException(paramRunnable.toString());
  }
}

/* Location:
 * Qualified Name:     a0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
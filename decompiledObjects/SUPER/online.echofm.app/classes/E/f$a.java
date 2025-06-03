package E;

import H.e;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class f$a
  implements Executor
{
  public final Handler o;
  
  public f$a(Handler paramHandler)
  {
    o = ((Handler)e.b(paramHandler));
  }
  
  public void execute(Runnable paramRunnable)
  {
    if (o.post((Runnable)e.b(paramRunnable))) {
      return;
    }
    paramRunnable = new StringBuilder();
    paramRunnable.append(o);
    paramRunnable.append(" is shutting down");
    throw new RejectedExecutionException(paramRunnable.toString());
  }
}

/* Location:
 * Qualified Name:     E.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
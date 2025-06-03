package a3;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class c$a
  implements Executor
{
  public c$a(c paramc) {}
  
  public final void execute(Runnable paramRunnable)
  {
    a.c.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     a3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
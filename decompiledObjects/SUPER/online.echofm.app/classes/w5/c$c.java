package w5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class c$c
  implements c.d
{
  public final ExecutorService a;
  
  public c$c(ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
  }
  
  public void a(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     w5.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
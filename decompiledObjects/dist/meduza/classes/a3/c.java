package a3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import nc.c1;
import y2.r;

public final class c
  implements b
{
  public final r a;
  public final c1 b;
  public final Handler c = new Handler(Looper.getMainLooper());
  public final a d = new a();
  
  public c(ExecutorService paramExecutorService)
  {
    paramExecutorService = new r(paramExecutorService);
    a = paramExecutorService;
    b = x6.b.W(paramExecutorService);
  }
  
  public final c1 a()
  {
    return b;
  }
  
  public final a b()
  {
    return d;
  }
  
  public final r c()
  {
    return a;
  }
  
  public final void d(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }
  
  public final class a
    implements Executor
  {
    public a() {}
    
    public final void execute(Runnable paramRunnable)
    {
      c.post(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     a3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
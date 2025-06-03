package p4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class b
{
  public static final Executor a = a.o;
  
  public static Executor a()
  {
    return a;
  }
  
  public static ExecutorService b()
  {
    return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F2.a("firebase-iid-executor"));
  }
}

/* Location:
 * Qualified Name:     p4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
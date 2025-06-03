package m;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c
  extends d
{
  public final Object a = new Object();
  public final ExecutorService b = Executors.newFixedThreadPool(4, new a());
  public volatile Handler c;
  
  public static Handler d(Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return b.a(paramLooper);
    }
    try
    {
      Handler localHandler = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
      return localHandler;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return new Handler(paramLooper);
    }
    catch (IllegalAccessException|InstantiationException|NoSuchMethodException localIllegalAccessException) {}
    return new Handler(paramLooper);
  }
  
  public void a(Runnable paramRunnable)
  {
    b.execute(paramRunnable);
  }
  
  public boolean b()
  {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(Runnable paramRunnable)
  {
    if (c == null)
    {
      synchronized (a)
      {
        if (c == null) {
          c = d(Looper.getMainLooper());
        }
      }
      break label47;
      throw paramRunnable;
    }
    label47:
    c.post(paramRunnable);
  }
  
  public class a
    implements ThreadFactory
  {
    public final AtomicInteger a = new AtomicInteger(0);
    
    public a() {}
    
    public Thread newThread(Runnable paramRunnable)
    {
      paramRunnable = new Thread(paramRunnable);
      paramRunnable.setName(String.format("arch_disk_io_%d", new Object[] { Integer.valueOf(a.getAndIncrement()) }));
      return paramRunnable;
    }
  }
}

/* Location:
 * Qualified Name:     m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
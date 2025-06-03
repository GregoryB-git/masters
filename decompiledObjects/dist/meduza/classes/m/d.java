package m;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.v4.media.session.b;
import f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d
  extends e
{
  public final Object b = new Object();
  public final ExecutorService c = Executors.newFixedThreadPool(4, new a());
  public volatile Handler d;
  
  public d()
  {
    super(0);
  }
  
  public static Handler v(Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return b.e(paramLooper);
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
  
  public final class a
    implements ThreadFactory
  {
    public final AtomicInteger a = new AtomicInteger(0);
    
    public final Thread newThread(Runnable paramRunnable)
    {
      paramRunnable = new Thread(paramRunnable);
      StringBuilder localStringBuilder = f.l("arch_disk_io_");
      localStringBuilder.append(a.getAndIncrement());
      paramRunnable.setName(localStringBuilder.toString());
      return paramRunnable;
    }
  }
}

/* Location:
 * Qualified Name:     m.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
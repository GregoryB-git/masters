package io.flutter.plugins.googlesignin;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s7.a.a;
import s7.a.b;
import s7.a.c;
import s7.e;

public final class BackgroundTaskRunner
{
  private final ThreadPoolExecutor executor;
  
  public BackgroundTaskRunner(int paramInt)
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new LinkedBlockingQueue();
    executor = new ThreadPoolExecutor(paramInt, paramInt, 1L, TimeUnit.SECONDS, localLinkedBlockingQueue);
  }
  
  private static void lambda$runInBackground$1(s7.f paramf, Callable paramCallable)
  {
    if (!(a instanceof a.b)) {
      try
      {
        Object localObject = paramCallable.call();
        paramCallable = (Callable)localObject;
        if (localObject == null) {
          paramCallable = s7.a.o;
        }
        if (s7.a.f.b(paramf, null, paramCallable)) {
          s7.a.d(paramf);
        }
      }
      finally
      {
        paramCallable = new a.c(paramCallable);
        if (s7.a.f.b(paramf, null, paramCallable)) {
          s7.a.d(paramf);
        }
      }
    }
  }
  
  public <T> e<T> runInBackground(Callable<T> paramCallable)
  {
    s7.f localf = new s7.f();
    executor.execute(new io.flutter.plugins.firebase.messaging.f(1, localf, paramCallable));
    return localf;
  }
  
  public <T> void runInBackground(Callable<T> paramCallable, Callback<T> paramCallback)
  {
    paramCallable = runInBackground(paramCallable);
    paramCallable.f(new a(0, paramCallback, paramCallable), Executors.uiThreadExecutor());
  }
  
  public static abstract interface Callback<T>
  {
    public abstract void run(Future<T> paramFuture);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.BackgroundTaskRunner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
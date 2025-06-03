package p2;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.v4.media.session.b;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o2.n;

public final class c
  implements n
{
  public final Handler a;
  
  public c()
  {
    Looper localLooper = Looper.getMainLooper();
    Handler localHandler1;
    Handler localHandler2;
    if (Build.VERSION.SDK_INT >= 28)
    {
      localHandler1 = b.e(localLooper);
    }
    else
    {
      try
      {
        localHandler1 = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { localLooper, null, Boolean.TRUE });
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Throwable localThrowable = localInvocationTargetException.getCause();
        if (!(localThrowable instanceof RuntimeException))
        {
          if ((localThrowable instanceof Error)) {
            throw ((Error)localThrowable);
          }
          throw new RuntimeException(localThrowable);
        }
        throw ((RuntimeException)localThrowable);
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
      Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", localIllegalAccessException);
      localHandler2 = new Handler(localLooper);
    }
    a = localHandler2;
  }
  
  public final void a(Runnable paramRunnable, long paramLong)
  {
    a.postDelayed(paramRunnable, paramLong);
  }
  
  public final void b(Runnable paramRunnable)
  {
    a.removeCallbacks(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     p2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
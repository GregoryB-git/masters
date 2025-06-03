package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import c;
import e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class HandlerCompat
{
  private static final String TAG = "HandlerCompat";
  
  @NonNull
  public static Handler createAsync(@NonNull Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.createAsync(paramLooper);
    }
    try
    {
      Handler localHandler = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
      return localHandler;
    }
    catch (InvocationTargetException paramLooper)
    {
      paramLooper = paramLooper.getCause();
      if (!(paramLooper instanceof RuntimeException))
      {
        if ((paramLooper instanceof Error)) {
          throw ((Error)paramLooper);
        }
        throw new RuntimeException(paramLooper);
      }
      throw ((RuntimeException)paramLooper);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", localIllegalAccessException);
    return new Handler(paramLooper);
  }
  
  @NonNull
  public static Handler createAsync(@NonNull Looper paramLooper, @NonNull Handler.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.createAsync(paramLooper, paramCallback);
    }
    try
    {
      Handler localHandler = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { paramLooper, paramCallback, Boolean.TRUE });
      return localHandler;
    }
    catch (InvocationTargetException paramLooper)
    {
      paramLooper = paramLooper.getCause();
      if (!(paramLooper instanceof RuntimeException))
      {
        if ((paramLooper instanceof Error)) {
          throw ((Error)paramLooper);
        }
        throw new RuntimeException(paramLooper);
      }
      throw ((RuntimeException)paramLooper);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", localIllegalAccessException);
    return new Handler(paramLooper, paramCallback);
  }
  
  @RequiresApi(16)
  public static boolean hasCallbacks(@NonNull Handler paramHandler, @NonNull Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.hasCallbacks(paramHandler, paramRunnable);
    }
    try
    {
      try
      {
        boolean bool = ((Boolean)Handler.class.getMethod("hasCallbacks", new Class[] { Runnable.class }).invoke(paramHandler, new Object[] { paramRunnable })).booleanValue();
        return bool;
      }
      catch (NullPointerException paramHandler) {}catch (NoSuchMethodException paramHandler) {}catch (IllegalAccessException paramHandler) {}
      throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", paramHandler);
    }
    catch (InvocationTargetException paramHandler)
    {
      paramHandler = paramHandler.getCause();
      if (!(paramHandler instanceof RuntimeException))
      {
        if ((paramHandler instanceof Error)) {
          throw ((Error)paramHandler);
        }
        throw new RuntimeException(paramHandler);
      }
      throw ((RuntimeException)paramHandler);
    }
  }
  
  public static boolean postDelayed(@NonNull Handler paramHandler, @NonNull Runnable paramRunnable, @Nullable Object paramObject, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.postDelayed(paramHandler, paramRunnable, paramObject, paramLong);
    }
    paramRunnable = Message.obtain(paramHandler, paramRunnable);
    obj = paramObject;
    return paramHandler.sendMessageDelayed(paramRunnable, paramLong);
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    public static Handler createAsync(Looper paramLooper)
    {
      return c.g(paramLooper);
    }
    
    public static Handler createAsync(Looper paramLooper, Handler.Callback paramCallback)
    {
      return c.h(paramLooper, paramCallback);
    }
    
    public static boolean postDelayed(Handler paramHandler, Runnable paramRunnable, Object paramObject, long paramLong)
    {
      return c.u(paramHandler, paramRunnable, paramObject, paramLong);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    public static boolean hasCallbacks(Handler paramHandler, Runnable paramRunnable)
    {
      return e.y(paramHandler, paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.HandlerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
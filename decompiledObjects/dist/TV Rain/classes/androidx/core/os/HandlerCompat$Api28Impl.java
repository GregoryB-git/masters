package androidx.core.os;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class HandlerCompat$Api28Impl
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

/* Location:
 * Qualified Name:     androidx.core.os.HandlerCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n0;

class ConcurrencyHelpers
{
  private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;
  
  @Deprecated
  @NonNull
  public static Executor convertHandlerToExecutor(@NonNull Handler paramHandler)
  {
    Objects.requireNonNull(paramHandler);
    return new n0(paramHandler);
  }
  
  public static ThreadPoolExecutor createBackgroundPriorityExecutor(@NonNull String paramString)
  {
    paramString = new a(paramString);
    paramString = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), paramString);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  public static Handler mainHandlerAsync()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Handler28Impl.createAsync(Looper.getMainLooper());
    }
    return new Handler(Looper.getMainLooper());
  }
  
  @RequiresApi(28)
  public static class Handler28Impl
  {
    @DoNotInline
    public static Handler createAsync(Looper paramLooper)
    {
      return c.g(paramLooper);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.ConcurrencyHelpers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
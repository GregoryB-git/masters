package io.flutter.plugins.googlesignin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class Executors
{
  public static Executor uiThreadExecutor()
  {
    return new UiThreadExecutor();
  }
  
  public static final class UiThreadExecutor
    implements Executor
  {
    private static final Handler UI_THREAD = new Handler(Looper.getMainLooper());
    
    public void execute(Runnable paramRunnable)
    {
      UI_THREAD.post(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Executors
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
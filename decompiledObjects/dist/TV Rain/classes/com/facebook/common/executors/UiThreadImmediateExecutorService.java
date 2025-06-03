package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;

public class UiThreadImmediateExecutorService
  extends HandlerExecutorServiceImpl
{
  private static UiThreadImmediateExecutorService sInstance;
  
  private UiThreadImmediateExecutorService()
  {
    super(new Handler(Looper.getMainLooper()));
  }
  
  public static UiThreadImmediateExecutorService getInstance()
  {
    if (sInstance == null) {
      sInstance = new UiThreadImmediateExecutorService();
    }
    return sInstance;
  }
  
  public void execute(Runnable paramRunnable)
  {
    if (isHandlerThread()) {
      paramRunnable.run();
    } else {
      super.execute(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.executors.UiThreadImmediateExecutorService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
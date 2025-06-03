package com.devbrackets.android.exomedia.util;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

public class StopWatch
{
  public static final int DEFAULT_TICK_DELAY = 33;
  public static final String HANDLER_THREAD_NAME = "ExoMedia_StopWatch_HandlerThread";
  public long currentTime = 0L;
  public Handler delayedHandler;
  public HandlerThread handlerThread;
  public volatile boolean isRunning = false;
  public TickListener listener;
  @FloatRange(from=0.0D)
  public float speedMultiplier = 1.0F;
  public long startTime = 0L;
  public long storedTime = 0L;
  public int tickDelay = 33;
  public TickRunnable tickRunnable = new TickRunnable();
  public boolean useHandlerThread = false;
  
  public StopWatch()
  {
    this(true);
  }
  
  public StopWatch(Handler paramHandler)
  {
    delayedHandler = paramHandler;
  }
  
  public StopWatch(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      delayedHandler = new Handler();
      return;
    }
    useHandlerThread = true;
  }
  
  @FloatRange(from=0.0D)
  public float getSpeedMultiplier()
  {
    return speedMultiplier;
  }
  
  public int getTickDelay()
  {
    return tickDelay;
  }
  
  public long getTime()
  {
    return currentTime + storedTime;
  }
  
  public int getTimeInt()
  {
    long l = currentTime + storedTime;
    int i;
    if (l < 2147483647L) {
      i = (int)l;
    } else {
      i = Integer.MAX_VALUE;
    }
    return i;
  }
  
  public boolean isRunning()
  {
    return isRunning;
  }
  
  public void overrideCurrentTime(long paramLong)
  {
    long l = System.currentTimeMillis();
    startTime = l;
    tickRunnable.lastTickTimestamp = l;
    currentTime = 0L;
    storedTime = paramLong;
  }
  
  public void reset()
  {
    currentTime = 0L;
    storedTime = 0L;
    long l = System.currentTimeMillis();
    startTime = l;
    tickRunnable.lastTickTimestamp = l;
  }
  
  public void setSpeedMultiplier(@FloatRange(from=0.0D) float paramFloat)
  {
    speedMultiplier = paramFloat;
  }
  
  public void setTickDelay(int paramInt)
  {
    tickDelay = paramInt;
  }
  
  public void setTickListener(@Nullable TickListener paramTickListener)
  {
    listener = paramTickListener;
  }
  
  public void start()
  {
    if (isRunning()) {
      return;
    }
    isRunning = true;
    long l = System.currentTimeMillis();
    startTime = l;
    tickRunnable.lastTickTimestamp = l;
    if (useHandlerThread)
    {
      HandlerThread localHandlerThread = new HandlerThread("ExoMedia_StopWatch_HandlerThread");
      handlerThread = localHandlerThread;
      localHandlerThread.start();
      delayedHandler = new Handler(handlerThread.getLooper());
    }
    tickRunnable.performTick();
  }
  
  public void stop()
  {
    if (!isRunning()) {
      return;
    }
    delayedHandler.removeCallbacksAndMessages(null);
    HandlerThread localHandlerThread = handlerThread;
    if (localHandlerThread != null) {
      localHandlerThread.quit();
    }
    storedTime = (currentTime + storedTime);
    isRunning = false;
    currentTime = 0L;
  }
  
  public static abstract interface TickListener
  {
    public abstract void onStopWatchTick(long paramLong);
  }
  
  public class TickRunnable
    implements Runnable
  {
    public long lastTickTimestamp = -1L;
    public long tempNow = 0L;
    
    public TickRunnable() {}
    
    public void performTick()
    {
      StopWatch localStopWatch = StopWatch.this;
      delayedHandler.postDelayed(tickRunnable, tickDelay);
    }
    
    public void run()
    {
      if (lastTickTimestamp == -1L) {
        lastTickTimestamp = startTime;
      }
      long l = System.currentTimeMillis();
      tempNow = l;
      StopWatch localStopWatch = StopWatch.this;
      float f = (float)currentTime;
      currentTime = (((float)(l - lastTickTimestamp) * speedMultiplier + f));
      lastTickTimestamp = l;
      if (isRunning) {
        performTick();
      }
      localStopWatch = StopWatch.this;
      StopWatch.TickListener localTickListener = listener;
      if (localTickListener != null) {
        localTickListener.onStopWatchTick(currentTime + storedTime);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.StopWatch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
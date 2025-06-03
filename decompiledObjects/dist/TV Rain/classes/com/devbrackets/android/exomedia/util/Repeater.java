package com.devbrackets.android.exomedia.util;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;

public class Repeater
{
  public static final int DEFAULT_REPEAT_DELAY = 33;
  public static final String HANDLER_THREAD_NAME = "ExoMedia_Repeater_HandlerThread";
  public Handler delayedHandler;
  public HandlerThread handlerThread;
  public RepeatListener listener;
  public PollRunnable pollRunnable = new PollRunnable();
  public int repeatDelay = 33;
  public volatile boolean repeaterRunning = false;
  public boolean useHandlerThread = false;
  
  public Repeater()
  {
    this(true);
  }
  
  public Repeater(Handler paramHandler)
  {
    delayedHandler = paramHandler;
  }
  
  public Repeater(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      delayedHandler = new Handler();
      return;
    }
    useHandlerThread = true;
  }
  
  public int getRepeaterDelay()
  {
    return repeatDelay;
  }
  
  public boolean isRunning()
  {
    return repeaterRunning;
  }
  
  public void setRepeatListener(@Nullable RepeatListener paramRepeatListener)
  {
    listener = paramRepeatListener;
  }
  
  public void setRepeaterDelay(int paramInt)
  {
    repeatDelay = paramInt;
  }
  
  public void start()
  {
    if (!repeaterRunning)
    {
      repeaterRunning = true;
      if (useHandlerThread)
      {
        HandlerThread localHandlerThread = new HandlerThread("ExoMedia_Repeater_HandlerThread");
        handlerThread = localHandlerThread;
        localHandlerThread.start();
        delayedHandler = new Handler(handlerThread.getLooper());
      }
      pollRunnable.performPoll();
    }
  }
  
  public void stop()
  {
    HandlerThread localHandlerThread = handlerThread;
    if (localHandlerThread != null) {
      localHandlerThread.quit();
    }
    repeaterRunning = false;
  }
  
  public class PollRunnable
    implements Runnable
  {
    public PollRunnable() {}
    
    public void performPoll()
    {
      Repeater localRepeater = Repeater.this;
      delayedHandler.postDelayed(pollRunnable, repeatDelay);
    }
    
    public void run()
    {
      Repeater.RepeatListener localRepeatListener = listener;
      if (localRepeatListener != null) {
        localRepeatListener.onRepeat();
      }
      if (repeaterRunning) {
        performPoll();
      }
    }
  }
  
  public static abstract interface RepeatListener
  {
    public abstract void onRepeat();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.Repeater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
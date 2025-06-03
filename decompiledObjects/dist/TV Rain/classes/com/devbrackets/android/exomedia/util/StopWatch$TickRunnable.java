package com.devbrackets.android.exomedia.util;

import android.os.Handler;

public class StopWatch$TickRunnable
  implements Runnable
{
  public long lastTickTimestamp = -1L;
  public long tempNow = 0L;
  
  public StopWatch$TickRunnable(StopWatch paramStopWatch) {}
  
  public void performTick()
  {
    StopWatch localStopWatch = this$0;
    delayedHandler.postDelayed(tickRunnable, tickDelay);
  }
  
  public void run()
  {
    if (lastTickTimestamp == -1L) {
      lastTickTimestamp = this$0.startTime;
    }
    long l = System.currentTimeMillis();
    tempNow = l;
    StopWatch localStopWatch = this$0;
    float f = (float)currentTime;
    currentTime = (((float)(l - lastTickTimestamp) * speedMultiplier + f));
    lastTickTimestamp = l;
    if (isRunning) {
      performTick();
    }
    localStopWatch = this$0;
    StopWatch.TickListener localTickListener = listener;
    if (localTickListener != null) {
      localTickListener.onStopWatchTick(currentTime + storedTime);
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.StopWatch.TickRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
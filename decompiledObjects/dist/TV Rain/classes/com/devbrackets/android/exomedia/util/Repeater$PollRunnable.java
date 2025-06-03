package com.devbrackets.android.exomedia.util;

import android.os.Handler;

public class Repeater$PollRunnable
  implements Runnable
{
  public Repeater$PollRunnable(Repeater paramRepeater) {}
  
  public void performPoll()
  {
    Repeater localRepeater = this$0;
    delayedHandler.postDelayed(pollRunnable, repeatDelay);
  }
  
  public void run()
  {
    Repeater.RepeatListener localRepeatListener = this$0.listener;
    if (localRepeatListener != null) {
      localRepeatListener.onRepeat();
    }
    if (this$0.repeaterRunning) {
      performPoll();
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.Repeater.PollRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
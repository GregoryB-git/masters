package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

@Deprecated
public abstract class Player$DefaultEventListener
  implements Player.EventListener
{
  @Deprecated
  public void onTimelineChanged(Timeline paramTimeline, @Nullable Object paramObject) {}
  
  public void onTimelineChanged(Timeline paramTimeline, @Nullable Object paramObject, int paramInt)
  {
    onTimelineChanged(paramTimeline, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Player.DefaultEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
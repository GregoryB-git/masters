package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

public abstract class BasePlayer
  implements Player
{
  public final Timeline.Window window = new Timeline.Window();
  
  private int getRepeatModeForNavigation()
  {
    int i = getRepeatMode();
    int j = i;
    if (i == 1) {
      j = 0;
    }
    return j;
  }
  
  public final int getBufferedPercentage()
  {
    long l1 = getBufferedPosition();
    long l2 = getDuration();
    int i = 100;
    if ((l1 != -9223372036854775807L) && (l2 != -9223372036854775807L))
    {
      if (l2 != 0L) {
        i = Util.constrainValue((int)(l1 * 100L / l2), 0, 100);
      }
    }
    else {
      i = 0;
    }
    return i;
  }
  
  public final long getContentDuration()
  {
    Timeline localTimeline = getCurrentTimeline();
    long l;
    if (localTimeline.isEmpty()) {
      l = -9223372036854775807L;
    } else {
      l = localTimeline.getWindow(getCurrentWindowIndex(), window).getDurationMs();
    }
    return l;
  }
  
  @Nullable
  public final Object getCurrentTag()
  {
    int i = getCurrentWindowIndex();
    Object localObject = getCurrentTimeline();
    if (i >= ((Timeline)localObject).getWindowCount()) {
      localObject = null;
    } else {
      localObject = getWindowwindow, true).tag;
    }
    return localObject;
  }
  
  public final int getNextWindowIndex()
  {
    Timeline localTimeline = getCurrentTimeline();
    int i;
    if (localTimeline.isEmpty()) {
      i = -1;
    } else {
      i = localTimeline.getNextWindowIndex(getCurrentWindowIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }
    return i;
  }
  
  public final int getPreviousWindowIndex()
  {
    Timeline localTimeline = getCurrentTimeline();
    int i;
    if (localTimeline.isEmpty()) {
      i = -1;
    } else {
      i = localTimeline.getPreviousWindowIndex(getCurrentWindowIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }
    return i;
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (getNextWindowIndex() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean hasPrevious()
  {
    boolean bool;
    if (getPreviousWindowIndex() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isCurrentWindowDynamic()
  {
    Timeline localTimeline = getCurrentTimeline();
    boolean bool;
    if ((!localTimeline.isEmpty()) && (getWindowgetCurrentWindowIndexwindow).isDynamic)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isCurrentWindowSeekable()
  {
    Timeline localTimeline = getCurrentTimeline();
    boolean bool;
    if ((!localTimeline.isEmpty()) && (getWindowgetCurrentWindowIndexwindow).isSeekable)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void next()
  {
    int i = getNextWindowIndex();
    if (i != -1) {
      seekToDefaultPosition(i);
    }
  }
  
  public final void previous()
  {
    int i = getPreviousWindowIndex();
    if (i != -1) {
      seekToDefaultPosition(i);
    }
  }
  
  public final void seekTo(long paramLong)
  {
    seekTo(getCurrentWindowIndex(), paramLong);
  }
  
  public final void seekToDefaultPosition()
  {
    seekToDefaultPosition(getCurrentWindowIndex());
  }
  
  public final void seekToDefaultPosition(int paramInt)
  {
    seekTo(paramInt, -9223372036854775807L);
  }
  
  public final void stop()
  {
    stop(false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.BasePlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
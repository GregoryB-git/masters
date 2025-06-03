package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

final class Mp4WebvttSubtitle
  implements Subtitle
{
  private final List<Cue> cues;
  
  public Mp4WebvttSubtitle(List<Cue> paramList)
  {
    cues = Collections.unmodifiableList(paramList);
  }
  
  public List<Cue> getCues(long paramLong)
  {
    List localList;
    if (paramLong >= 0L) {
      localList = cues;
    } else {
      localList = Collections.emptyList();
    }
    return localList;
  }
  
  public long getEventTime(int paramInt)
  {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    return 0L;
  }
  
  public int getEventTimeCount()
  {
    return 1;
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    int i;
    if (paramLong < 0L) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.Mp4WebvttSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
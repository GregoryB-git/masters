package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

final class SsaSubtitle
  implements Subtitle
{
  private final long[] cueTimesUs;
  private final Cue[] cues;
  
  public SsaSubtitle(Cue[] paramArrayOfCue, long[] paramArrayOfLong)
  {
    cues = paramArrayOfCue;
    cueTimesUs = paramArrayOfLong;
  }
  
  public List<Cue> getCues(long paramLong)
  {
    int i = Util.binarySearchFloor(cueTimesUs, paramLong, true, false);
    if (i != -1)
    {
      Cue localCue = cues[i];
      if (localCue != null) {
        return Collections.singletonList(localCue);
      }
    }
    return Collections.emptyList();
  }
  
  public long getEventTime(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramInt < cueTimesUs.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    return cueTimesUs[paramInt];
  }
  
  public int getEventTimeCount()
  {
    return cueTimesUs.length;
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    int i = Util.binarySearchCeil(cueTimesUs, paramLong, false, false);
    if (i >= cueTimesUs.length) {
      i = -1;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ssa.SsaSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
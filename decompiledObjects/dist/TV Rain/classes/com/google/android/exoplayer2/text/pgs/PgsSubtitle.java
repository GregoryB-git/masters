package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

final class PgsSubtitle
  implements Subtitle
{
  private final List<Cue> cues;
  
  public PgsSubtitle(List<Cue> paramList)
  {
    cues = paramList;
  }
  
  public List<Cue> getCues(long paramLong)
  {
    return cues;
  }
  
  public long getEventTime(int paramInt)
  {
    return 0L;
  }
  
  public int getEventTimeCount()
  {
    return 1;
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.pgs.PgsSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
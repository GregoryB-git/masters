package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

final class DvbSubtitle
  implements Subtitle
{
  private final List<Cue> cues;
  
  public DvbSubtitle(List<Cue> paramList)
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
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
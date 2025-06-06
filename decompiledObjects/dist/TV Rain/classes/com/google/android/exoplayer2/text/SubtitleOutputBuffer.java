package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import java.util.List;

public abstract class SubtitleOutputBuffer
  extends OutputBuffer
  implements Subtitle
{
  private long subsampleOffsetUs;
  private Subtitle subtitle;
  
  public void clear()
  {
    super.clear();
    subtitle = null;
  }
  
  public List<Cue> getCues(long paramLong)
  {
    return subtitle.getCues(paramLong - subsampleOffsetUs);
  }
  
  public long getEventTime(int paramInt)
  {
    return subtitle.getEventTime(paramInt) + subsampleOffsetUs;
  }
  
  public int getEventTimeCount()
  {
    return subtitle.getEventTimeCount();
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    return subtitle.getNextEventTimeIndex(paramLong - subsampleOffsetUs);
  }
  
  public abstract void release();
  
  public void setContent(long paramLong1, Subtitle paramSubtitle, long paramLong2)
  {
    timeUs = paramLong1;
    subtitle = paramSubtitle;
    if (paramLong2 != Long.MAX_VALUE) {
      paramLong1 = paramLong2;
    }
    subsampleOffsetUs = paramLong1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.SubtitleOutputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
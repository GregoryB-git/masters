package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class TtmlSubtitle
  implements Subtitle
{
  private final long[] eventTimesUs;
  private final Map<String, TtmlStyle> globalStyles;
  private final Map<String, TtmlRegion> regionMap;
  private final TtmlNode root;
  
  public TtmlSubtitle(TtmlNode paramTtmlNode, Map<String, TtmlStyle> paramMap, Map<String, TtmlRegion> paramMap1)
  {
    root = paramTtmlNode;
    regionMap = paramMap1;
    if (paramMap != null) {
      paramMap = Collections.unmodifiableMap(paramMap);
    } else {
      paramMap = Collections.emptyMap();
    }
    globalStyles = paramMap;
    eventTimesUs = paramTtmlNode.getEventTimesUs();
  }
  
  public List<Cue> getCues(long paramLong)
  {
    return root.getCues(paramLong, globalStyles, regionMap);
  }
  
  public long getEventTime(int paramInt)
  {
    return eventTimesUs[paramInt];
  }
  
  public int getEventTimeCount()
  {
    return eventTimesUs.length;
  }
  
  public Map<String, TtmlStyle> getGlobalStyles()
  {
    return globalStyles;
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    int i = Util.binarySearchCeil(eventTimesUs, paramLong, false, false);
    if (i >= eventTimesUs.length) {
      i = -1;
    }
    return i;
  }
  
  public TtmlNode getRoot()
  {
    return root;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
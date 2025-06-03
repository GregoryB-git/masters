package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class Period
{
  public final List<AdaptationSet> adaptationSets;
  public final List<EventStream> eventStreams;
  @Nullable
  public final String id;
  public final long startMs;
  
  public Period(@Nullable String paramString, long paramLong, List<AdaptationSet> paramList)
  {
    this(paramString, paramLong, paramList, Collections.emptyList());
  }
  
  public Period(@Nullable String paramString, long paramLong, List<AdaptationSet> paramList, List<EventStream> paramList1)
  {
    id = paramString;
    startMs = paramLong;
    adaptationSets = Collections.unmodifiableList(paramList);
    eventStreams = Collections.unmodifiableList(paramList1);
  }
  
  public int getAdaptationSetIndex(int paramInt)
  {
    int i = adaptationSets.size();
    for (int j = 0; j < i; j++) {
      if (adaptationSets.get(j)).type == paramInt) {
        return j;
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.Period
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
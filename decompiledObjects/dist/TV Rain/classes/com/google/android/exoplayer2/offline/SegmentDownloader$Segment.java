package com.google.android.exoplayer2.offline;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;

public class SegmentDownloader$Segment
  implements Comparable<Segment>
{
  public final DataSpec dataSpec;
  public final long startTimeUs;
  
  public SegmentDownloader$Segment(long paramLong, DataSpec paramDataSpec)
  {
    startTimeUs = paramLong;
    dataSpec = paramDataSpec;
  }
  
  public int compareTo(@NonNull Segment paramSegment)
  {
    return Util.compareLong(startTimeUs, startTimeUs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.SegmentDownloader.Segment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
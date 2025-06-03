package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import java.util.Comparator;

final class BaseTrackSelection$DecreasingBandwidthComparator
  implements Comparator<Format>
{
  public int compare(Format paramFormat1, Format paramFormat2)
  {
    return bitrate - bitrate;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.BaseTrackSelection.DecreasingBandwidthComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
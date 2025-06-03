package com.google.android.exoplayer2.source.hls;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import java.util.List;

final class HlsChunkSource$InitializationTrackSelection
  extends BaseTrackSelection
{
  private int selectedIndex = indexOf(paramTrackGroup.getFormat(0));
  
  public HlsChunkSource$InitializationTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt)
  {
    super(paramTrackGroup, paramArrayOfInt);
  }
  
  public int getSelectedIndex()
  {
    return selectedIndex;
  }
  
  public Object getSelectionData()
  {
    return null;
  }
  
  public int getSelectionReason()
  {
    return 0;
  }
  
  public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3, List<? extends MediaChunk> paramList, MediaChunkIterator[] paramArrayOfMediaChunkIterator)
  {
    paramLong1 = SystemClock.elapsedRealtime();
    if (!isBlacklisted(selectedIndex, paramLong1)) {
      return;
    }
    for (int i = length - 1; i >= 0; i--) {
      if (!isBlacklisted(i, paramLong1))
      {
        selectedIndex = i;
        return;
      }
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsChunkSource.InitializationTrackSelection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
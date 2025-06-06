package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

public abstract interface TrackSelection
{
  public abstract boolean blacklist(int paramInt, long paramLong);
  
  public abstract void disable();
  
  public abstract void enable();
  
  public abstract int evaluateQueueSize(long paramLong, List<? extends MediaChunk> paramList);
  
  public abstract Format getFormat(int paramInt);
  
  public abstract int getIndexInTrackGroup(int paramInt);
  
  public abstract Format getSelectedFormat();
  
  public abstract int getSelectedIndex();
  
  public abstract int getSelectedIndexInTrackGroup();
  
  @Nullable
  public abstract Object getSelectionData();
  
  public abstract int getSelectionReason();
  
  public abstract TrackGroup getTrackGroup();
  
  public abstract int indexOf(int paramInt);
  
  public abstract int indexOf(Format paramFormat);
  
  public abstract int length();
  
  public abstract void onPlaybackSpeed(float paramFloat);
  
  @Deprecated
  public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3)
  {
    throw new UnsupportedOperationException();
  }
  
  public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3, List<? extends MediaChunk> paramList, MediaChunkIterator[] paramArrayOfMediaChunkIterator)
  {
    updateSelectedTrack(paramLong1, paramLong2, paramLong3);
  }
  
  public static abstract interface Factory
  {
    public abstract TrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.TrackSelection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
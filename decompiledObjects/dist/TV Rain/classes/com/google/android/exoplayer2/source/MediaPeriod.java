package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

public abstract interface MediaPeriod
  extends SequenceableLoader
{
  public abstract boolean continueLoading(long paramLong);
  
  public abstract void discardBuffer(long paramLong, boolean paramBoolean);
  
  public abstract long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters);
  
  public abstract long getBufferedPositionUs();
  
  public abstract long getNextLoadPositionUs();
  
  public abstract TrackGroupArray getTrackGroups();
  
  public abstract void maybeThrowPrepareError()
    throws IOException;
  
  public abstract void prepare(Callback paramCallback, long paramLong);
  
  public abstract long readDiscontinuity();
  
  public abstract void reevaluateBuffer(long paramLong);
  
  public abstract long seekToUs(long paramLong);
  
  public abstract long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong);
  
  public static abstract interface Callback
    extends SequenceableLoader.Callback<MediaPeriod>
  {
    public abstract void onPrepared(MediaPeriod paramMediaPeriod);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
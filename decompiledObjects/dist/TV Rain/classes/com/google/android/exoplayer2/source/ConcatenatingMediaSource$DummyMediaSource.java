package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

final class ConcatenatingMediaSource$DummyMediaSource
  extends BaseMediaSource
{
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    throw new UnsupportedOperationException();
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {}
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener) {}
  
  public void releasePeriod(MediaPeriod paramMediaPeriod) {}
  
  public void releaseSourceInternal() {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.DummyMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
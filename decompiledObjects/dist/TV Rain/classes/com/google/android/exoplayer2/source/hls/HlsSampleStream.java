package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

final class HlsSampleStream
  implements SampleStream
{
  private int sampleQueueIndex;
  private final HlsSampleStreamWrapper sampleStreamWrapper;
  private final int trackGroupIndex;
  
  public HlsSampleStream(HlsSampleStreamWrapper paramHlsSampleStreamWrapper, int paramInt)
  {
    sampleStreamWrapper = paramHlsSampleStreamWrapper;
    trackGroupIndex = paramInt;
    sampleQueueIndex = -1;
  }
  
  private boolean hasValidSampleQueueIndex()
  {
    int i = sampleQueueIndex;
    boolean bool;
    if ((i != -1) && (i != -3) && (i != -2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void bindSampleQueue()
  {
    boolean bool;
    if (sampleQueueIndex == -1) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    sampleQueueIndex = sampleStreamWrapper.bindSampleQueueToSampleStream(trackGroupIndex);
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((sampleQueueIndex != -3) && ((!hasValidSampleQueueIndex()) || (!sampleStreamWrapper.isReady(sampleQueueIndex)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    if (sampleQueueIndex != -2)
    {
      sampleStreamWrapper.maybeThrowError();
      return;
    }
    throw new SampleQueueMappingException(sampleStreamWrapper.getTrackGroups().get(trackGroupIndex).getFormat(0).sampleMimeType);
  }
  
  public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    int i;
    if (hasValidSampleQueueIndex()) {
      i = sampleStreamWrapper.readData(sampleQueueIndex, paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
    } else {
      i = -3;
    }
    return i;
  }
  
  public int skipData(long paramLong)
  {
    int i;
    if (hasValidSampleQueueIndex()) {
      i = sampleStreamWrapper.skipData(sampleQueueIndex, paramLong);
    } else {
      i = 0;
    }
    return i;
  }
  
  public void unbindSampleQueue()
  {
    if (sampleQueueIndex != -1)
    {
      sampleStreamWrapper.unbindSampleQueue(trackGroupIndex);
      sampleQueueIndex = -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsSampleStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
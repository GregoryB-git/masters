package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

final class ExtractorMediaPeriod$SampleStreamImpl
  implements SampleStream
{
  private final int track;
  
  public ExtractorMediaPeriod$SampleStreamImpl(ExtractorMediaPeriod paramExtractorMediaPeriod, int paramInt)
  {
    track = paramInt;
  }
  
  public boolean isReady()
  {
    return this$0.isReady(track);
  }
  
  public void maybeThrowError()
    throws IOException
  {
    this$0.maybeThrowError();
  }
  
  public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    return this$0.readData(track, paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
  }
  
  public int skipData(long paramLong)
  {
    return this$0.skipData(track, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaPeriod.SampleStreamImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;

final class SingleSampleMediaPeriod$SampleStreamImpl
  implements SampleStream
{
  private static final int STREAM_STATE_END_OF_STREAM = 2;
  private static final int STREAM_STATE_SEND_FORMAT = 0;
  private static final int STREAM_STATE_SEND_SAMPLE = 1;
  private boolean notifiedDownstreamFormat;
  private int streamState;
  
  private SingleSampleMediaPeriod$SampleStreamImpl(SingleSampleMediaPeriod paramSingleSampleMediaPeriod) {}
  
  private void maybeNotifyDownstreamFormat()
  {
    if (!notifiedDownstreamFormat)
    {
      SingleSampleMediaPeriod.access$300(this$0).downstreamFormatChanged(MimeTypes.getTrackType(this$0.format.sampleMimeType), this$0.format, 0, null, 0L);
      notifiedDownstreamFormat = true;
    }
  }
  
  public boolean isReady()
  {
    return this$0.loadingFinished;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    SingleSampleMediaPeriod localSingleSampleMediaPeriod = this$0;
    if (!treatLoadErrorsAsEndOfStream) {
      loader.maybeThrowError();
    }
  }
  
  public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    maybeNotifyDownstreamFormat();
    int i = streamState;
    if (i == 2)
    {
      paramDecoderInputBuffer.addFlag(4);
      return -4;
    }
    if ((!paramBoolean) && (i != 0))
    {
      paramFormatHolder = this$0;
      if (loadingFinished)
      {
        if (loadingSucceeded)
        {
          timeUs = 0L;
          paramDecoderInputBuffer.addFlag(1);
          paramDecoderInputBuffer.ensureSpaceForWrite(this$0.sampleSize);
          paramFormatHolder = data;
          paramDecoderInputBuffer = this$0;
          paramFormatHolder.put(sampleData, 0, sampleSize);
        }
        else
        {
          paramDecoderInputBuffer.addFlag(4);
        }
        streamState = 2;
        return -4;
      }
      return -3;
    }
    format = this$0.format;
    streamState = 1;
    return -5;
  }
  
  public void reset()
  {
    if (streamState == 2) {
      streamState = 1;
    }
  }
  
  public int skipData(long paramLong)
  {
    maybeNotifyDownstreamFormat();
    if ((paramLong > 0L) && (streamState != 2))
    {
      streamState = 2;
      return 1;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
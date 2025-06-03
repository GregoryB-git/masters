package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

final class ClippingMediaPeriod$ClippingSampleStream
  implements SampleStream
{
  public final SampleStream childStream;
  private boolean sentEos;
  
  public ClippingMediaPeriod$ClippingSampleStream(ClippingMediaPeriod paramClippingMediaPeriod, SampleStream paramSampleStream)
  {
    childStream = paramSampleStream;
  }
  
  public void clearSentEos()
  {
    sentEos = false;
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!this$0.isPendingInitialDiscontinuity()) && (childStream.isReady())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    childStream.maybeThrowError();
  }
  
  public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    if (this$0.isPendingInitialDiscontinuity()) {
      return -3;
    }
    if (sentEos)
    {
      paramDecoderInputBuffer.setFlags(4);
      return -4;
    }
    int i = childStream.readData(paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
    if (i == -5)
    {
      paramDecoderInputBuffer = format;
      i = encoderDelay;
      if ((i != 0) || (encoderPadding != 0))
      {
        ClippingMediaPeriod localClippingMediaPeriod = this$0;
        l = startUs;
        int j = 0;
        if (l != 0L) {
          i = 0;
        }
        if (endUs == Long.MIN_VALUE) {
          j = encoderPadding;
        }
        format = paramDecoderInputBuffer.copyWithGaplessInfo(i, j);
      }
      return -5;
    }
    paramFormatHolder = this$0;
    long l = endUs;
    if ((l != Long.MIN_VALUE) && (((i == -4) && (timeUs >= l)) || ((i == -3) && (paramFormatHolder.getBufferedPositionUs() == Long.MIN_VALUE))))
    {
      paramDecoderInputBuffer.clear();
      paramDecoderInputBuffer.setFlags(4);
      sentEos = true;
      return -4;
    }
    return i;
  }
  
  public int skipData(long paramLong)
  {
    if (this$0.isPendingInitialDiscontinuity()) {
      return -3;
    }
    return childStream.skipData(paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
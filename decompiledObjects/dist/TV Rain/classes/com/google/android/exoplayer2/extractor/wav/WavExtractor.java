package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import z3;

public final class WavExtractor
  implements Extractor
{
  public static final ExtractorsFactory FACTORY = new z3(24);
  private static final int MAX_INPUT_SIZE = 32768;
  private int bytesPerFrame;
  private ExtractorOutput extractorOutput;
  private int pendingBytes;
  private TrackOutput trackOutput;
  private WavHeader wavHeader;
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
    trackOutput = paramExtractorOutput.track(0, 1);
    wavHeader = null;
    paramExtractorOutput.endTracks();
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    if (wavHeader == null)
    {
      paramPositionHolder = WavHeaderReader.peek(paramExtractorInput);
      wavHeader = paramPositionHolder;
      if (paramPositionHolder != null)
      {
        paramPositionHolder = Format.createAudioSampleFormat(null, "audio/raw", null, paramPositionHolder.getBitrate(), 32768, wavHeader.getNumChannels(), wavHeader.getSampleRateHz(), wavHeader.getEncoding(), null, null, 0, null);
        trackOutput.format(paramPositionHolder);
        bytesPerFrame = wavHeader.getBytesPerFrame();
      }
      else
      {
        throw new ParserException("Unsupported or unrecognized wav header.");
      }
    }
    if (!wavHeader.hasDataBounds())
    {
      WavHeaderReader.skipToData(paramExtractorInput, wavHeader);
      extractorOutput.seekMap(wavHeader);
    }
    long l = wavHeader.getDataLimit();
    int i = 0;
    boolean bool;
    if (l != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    l -= paramExtractorInput.getPosition();
    if (l <= 0L) {
      return -1;
    }
    int j = (int)Math.min(32768 - pendingBytes, l);
    j = trackOutput.sampleData(paramExtractorInput, j, true);
    if (j != -1) {
      pendingBytes += j;
    }
    int k = pendingBytes / bytesPerFrame;
    if (k > 0)
    {
      l = wavHeader.getTimeUs(paramExtractorInput.getPosition() - pendingBytes);
      k *= bytesPerFrame;
      int m = pendingBytes - k;
      pendingBytes = m;
      trackOutput.sampleMetadata(l, 1, k, m, null);
    }
    if (j == -1) {
      i = -1;
    }
    return i;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    pendingBytes = 0;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    boolean bool;
    if (WavHeaderReader.peek(paramExtractorInput) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.wav.WavExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
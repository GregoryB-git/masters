package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

final class MatroskaExtractor$TrueHdSampleRechunker
{
  private int blockFlags;
  private int chunkSize;
  private boolean foundSyncframe;
  private int sampleCount;
  private final byte[] syncframePrefix = new byte[10];
  private long timeUs;
  
  public void outputPendingSampleMetadata(MatroskaExtractor.Track paramTrack)
  {
    if ((foundSyncframe) && (sampleCount > 0))
    {
      output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, cryptoData);
      sampleCount = 0;
    }
  }
  
  public void reset()
  {
    foundSyncframe = false;
  }
  
  public void sampleMetadata(MatroskaExtractor.Track paramTrack, long paramLong)
  {
    if (!foundSyncframe) {
      return;
    }
    int i = sampleCount;
    int j = i + 1;
    sampleCount = j;
    if (i == 0) {
      timeUs = paramLong;
    }
    if (j < 16) {
      return;
    }
    output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, cryptoData);
    sampleCount = 0;
  }
  
  public void startSample(ExtractorInput paramExtractorInput, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    if (!foundSyncframe)
    {
      paramExtractorInput.peekFully(syncframePrefix, 0, 10);
      paramExtractorInput.resetPeekPosition();
      if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(syncframePrefix) == 0) {
        return;
      }
      foundSyncframe = true;
      sampleCount = 0;
    }
    if (sampleCount == 0)
    {
      blockFlags = paramInt1;
      chunkSize = 0;
    }
    chunkSize += paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TrueHdSampleRechunker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
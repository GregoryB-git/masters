package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

final class ChunkExtractorWrapper$BindingTrackOutput
  implements TrackOutput
{
  private final DummyTrackOutput dummyTrackOutput;
  private long endTimeUs;
  private final int id;
  private final Format manifestFormat;
  public Format sampleFormat;
  private TrackOutput trackOutput;
  private final int type;
  
  public ChunkExtractorWrapper$BindingTrackOutput(int paramInt1, int paramInt2, Format paramFormat)
  {
    id = paramInt1;
    type = paramInt2;
    manifestFormat = paramFormat;
    dummyTrackOutput = new DummyTrackOutput();
  }
  
  public void bind(ChunkExtractorWrapper.TrackOutputProvider paramTrackOutputProvider, long paramLong)
  {
    if (paramTrackOutputProvider == null)
    {
      trackOutput = dummyTrackOutput;
      return;
    }
    endTimeUs = paramLong;
    paramTrackOutputProvider = paramTrackOutputProvider.track(id, type);
    trackOutput = paramTrackOutputProvider;
    Format localFormat = sampleFormat;
    if (localFormat != null) {
      paramTrackOutputProvider.format(localFormat);
    }
  }
  
  public void format(Format paramFormat)
  {
    Format localFormat1 = manifestFormat;
    Format localFormat2 = paramFormat;
    if (localFormat1 != null) {
      localFormat2 = paramFormat.copyWithManifestFormatInfo(localFormat1);
    }
    sampleFormat = localFormat2;
    trackOutput.format(localFormat2);
  }
  
  public int sampleData(ExtractorInput paramExtractorInput, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    return trackOutput.sampleData(paramExtractorInput, paramInt, paramBoolean);
  }
  
  public void sampleData(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    trackOutput.sampleData(paramParsableByteArray, paramInt);
  }
  
  public void sampleMetadata(long paramLong, int paramInt1, int paramInt2, int paramInt3, TrackOutput.CryptoData paramCryptoData)
  {
    long l = endTimeUs;
    if ((l != -9223372036854775807L) && (paramLong >= l)) {
      trackOutput = dummyTrackOutput;
    }
    trackOutput.sampleMetadata(paramLong, paramInt1, paramInt2, paramInt3, paramCryptoData);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper.BindingTrackOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
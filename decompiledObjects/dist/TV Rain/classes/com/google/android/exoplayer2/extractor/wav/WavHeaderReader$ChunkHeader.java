package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

final class WavHeaderReader$ChunkHeader
{
  public static final int SIZE_IN_BYTES = 8;
  public final int id;
  public final long size;
  
  private WavHeaderReader$ChunkHeader(int paramInt, long paramLong)
  {
    id = paramInt;
    size = paramLong;
  }
  
  public static ChunkHeader peek(ExtractorInput paramExtractorInput, ParsableByteArray paramParsableByteArray)
    throws IOException, InterruptedException
  {
    paramExtractorInput.peekFully(data, 0, 8);
    paramParsableByteArray.setPosition(0);
    return new ChunkHeader(paramParsableByteArray.readInt(), paramParsableByteArray.readLittleEndianUnsignedInt());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
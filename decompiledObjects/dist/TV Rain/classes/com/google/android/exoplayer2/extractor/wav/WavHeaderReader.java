package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import z2;

final class WavHeaderReader
{
  private static final String TAG = "WavHeaderReader";
  
  public static WavHeader peek(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    Assertions.checkNotNull(paramExtractorInput);
    ParsableByteArray localParsableByteArray = new ParsableByteArray(16);
    if (peekid != WavUtil.RIFF_FOURCC) {
      return null;
    }
    paramExtractorInput.peekFully(data, 0, 4);
    localParsableByteArray.setPosition(0);
    int i = localParsableByteArray.readInt();
    if (i != WavUtil.WAVE_FOURCC)
    {
      paramExtractorInput = new StringBuilder();
      paramExtractorInput.append("Unsupported RIFF format: ");
      paramExtractorInput.append(i);
      Log.e("WavHeaderReader", paramExtractorInput.toString());
      return null;
    }
    for (ChunkHeader localChunkHeader = ChunkHeader.peek(paramExtractorInput, localParsableByteArray); id != WavUtil.FMT_FOURCC; localChunkHeader = ChunkHeader.peek(paramExtractorInput, localParsableByteArray)) {
      paramExtractorInput.advancePeekPosition((int)size);
    }
    boolean bool;
    if (size >= 16L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    paramExtractorInput.peekFully(data, 0, 16);
    localParsableByteArray.setPosition(0);
    int j = localParsableByteArray.readLittleEndianUnsignedShort();
    int k = localParsableByteArray.readLittleEndianUnsignedShort();
    int m = localParsableByteArray.readLittleEndianUnsignedIntToInt();
    int n = localParsableByteArray.readLittleEndianUnsignedIntToInt();
    int i1 = localParsableByteArray.readLittleEndianUnsignedShort();
    i = localParsableByteArray.readLittleEndianUnsignedShort();
    int i2 = k * i / 8;
    if (i1 == i2)
    {
      i2 = WavUtil.getEncodingForType(j, i);
      if (i2 == 0)
      {
        paramExtractorInput = new StringBuilder();
        paramExtractorInput.append("Unsupported WAV format: ");
        paramExtractorInput.append(i);
        paramExtractorInput.append(" bit/sample, type ");
        paramExtractorInput.append(j);
        Log.e("WavHeaderReader", paramExtractorInput.toString());
        return null;
      }
      paramExtractorInput.advancePeekPosition((int)size - 16);
      return new WavHeader(k, m, n, i1, i, i2);
    }
    throw new ParserException(z2.n("Expected block alignment: ", i2, "; got: ", i1));
  }
  
  public static void skipToData(ExtractorInput paramExtractorInput, WavHeader paramWavHeader)
    throws IOException, InterruptedException
  {
    Assertions.checkNotNull(paramExtractorInput);
    Assertions.checkNotNull(paramWavHeader);
    paramExtractorInput.resetPeekPosition();
    ParsableByteArray localParsableByteArray = new ParsableByteArray(8);
    ChunkHeader localChunkHeader = ChunkHeader.peek(paramExtractorInput, localParsableByteArray);
    while (id != Util.getIntegerCodeForString("data"))
    {
      StringBuilder localStringBuilder = z2.t("Ignoring unknown WAV chunk: ");
      localStringBuilder.append(id);
      Log.w("WavHeaderReader", localStringBuilder.toString());
      long l = size + 8L;
      if (id == Util.getIntegerCodeForString("RIFF")) {
        l = 12L;
      }
      if (l <= 2147483647L)
      {
        paramExtractorInput.skipFully((int)l);
        localChunkHeader = ChunkHeader.peek(paramExtractorInput, localParsableByteArray);
      }
      else
      {
        paramExtractorInput = z2.t("Chunk is too large (~2GB+) to skip; id: ");
        paramExtractorInput.append(id);
        throw new ParserException(paramExtractorInput.toString());
      }
    }
    paramExtractorInput.skipFully(8);
    paramWavHeader.setDataBounds(paramExtractorInput.getPosition(), size);
  }
  
  public static final class ChunkHeader
  {
    public static final int SIZE_IN_BYTES = 8;
    public final int id;
    public final long size;
    
    private ChunkHeader(int paramInt, long paramLong)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.wav.WavHeaderReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
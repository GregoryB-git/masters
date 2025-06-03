package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

final class AtomParsers$ChunkIterator
{
  private final ParsableByteArray chunkOffsets;
  private final boolean chunkOffsetsAreLongs;
  public int index;
  public final int length;
  private int nextSamplesPerChunkChangeIndex;
  public int numSamples;
  public long offset;
  private int remainingSamplesPerChunkChanges;
  private final ParsableByteArray stsc;
  
  public AtomParsers$ChunkIterator(ParsableByteArray paramParsableByteArray1, ParsableByteArray paramParsableByteArray2, boolean paramBoolean)
  {
    stsc = paramParsableByteArray1;
    chunkOffsets = paramParsableByteArray2;
    chunkOffsetsAreLongs = paramBoolean;
    paramParsableByteArray2.setPosition(12);
    length = paramParsableByteArray2.readUnsignedIntToInt();
    paramParsableByteArray1.setPosition(12);
    remainingSamplesPerChunkChanges = paramParsableByteArray1.readUnsignedIntToInt();
    int i = paramParsableByteArray1.readInt();
    paramBoolean = true;
    if (i != 1) {
      paramBoolean = false;
    }
    Assertions.checkState(paramBoolean, "first_chunk must be 1");
    index = -1;
  }
  
  public boolean moveNext()
  {
    int i = index + 1;
    index = i;
    if (i == length) {
      return false;
    }
    long l;
    if (chunkOffsetsAreLongs) {
      l = chunkOffsets.readUnsignedLongToLong();
    } else {
      l = chunkOffsets.readUnsignedInt();
    }
    offset = l;
    if (index == nextSamplesPerChunkChangeIndex)
    {
      numSamples = stsc.readUnsignedIntToInt();
      stsc.skipBytes(4);
      i = remainingSamplesPerChunkChanges - 1;
      remainingSamplesPerChunkChanges = i;
      if (i > 0) {
        i = stsc.readUnsignedIntToInt() - 1;
      } else {
        i = -1;
      }
      nextSamplesPerChunkChangeIndex = i;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers.ChunkIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;

final class AtomParsers$Stz2SampleSizeBox
  implements AtomParsers.SampleSizeBox
{
  private int currentByte;
  private final ParsableByteArray data;
  private final int fieldSize;
  private final int sampleCount;
  private int sampleIndex;
  
  public AtomParsers$Stz2SampleSizeBox(Atom.LeafAtom paramLeafAtom)
  {
    paramLeafAtom = data;
    data = paramLeafAtom;
    paramLeafAtom.setPosition(12);
    fieldSize = (paramLeafAtom.readUnsignedIntToInt() & 0xFF);
    sampleCount = paramLeafAtom.readUnsignedIntToInt();
  }
  
  public int getSampleCount()
  {
    return sampleCount;
  }
  
  public boolean isFixedSampleSize()
  {
    return false;
  }
  
  public int readNextSampleSize()
  {
    int i = fieldSize;
    if (i == 8) {
      return data.readUnsignedByte();
    }
    if (i == 16) {
      return data.readUnsignedShort();
    }
    i = sampleIndex;
    sampleIndex = (i + 1);
    if (i % 2 == 0)
    {
      i = data.readUnsignedByte();
      currentByte = i;
      return (i & 0xF0) >> 4;
    }
    return currentByte & 0xF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers.Stz2SampleSizeBox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
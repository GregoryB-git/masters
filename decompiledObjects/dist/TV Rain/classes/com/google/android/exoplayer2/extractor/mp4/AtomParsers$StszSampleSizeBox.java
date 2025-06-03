package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;

final class AtomParsers$StszSampleSizeBox
  implements AtomParsers.SampleSizeBox
{
  private final ParsableByteArray data;
  private final int fixedSampleSize;
  private final int sampleCount;
  
  public AtomParsers$StszSampleSizeBox(Atom.LeafAtom paramLeafAtom)
  {
    paramLeafAtom = data;
    data = paramLeafAtom;
    paramLeafAtom.setPosition(12);
    fixedSampleSize = paramLeafAtom.readUnsignedIntToInt();
    sampleCount = paramLeafAtom.readUnsignedIntToInt();
  }
  
  public int getSampleCount()
  {
    return sampleCount;
  }
  
  public boolean isFixedSampleSize()
  {
    boolean bool;
    if (fixedSampleSize != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int readNextSampleSize()
  {
    int i = fixedSampleSize;
    int j = i;
    if (i == 0) {
      j = data.readUnsignedIntToInt();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers.StszSampleSizeBox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
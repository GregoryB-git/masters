package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;

final class AtomParsers$StsdData
{
  public static final int STSD_HEADER_SIZE = 8;
  public Format format;
  public int nalUnitLengthFieldLength;
  public int requiredSampleTransformation;
  public final TrackEncryptionBox[] trackEncryptionBoxes;
  
  public AtomParsers$StsdData(int paramInt)
  {
    trackEncryptionBoxes = new TrackEncryptionBox[paramInt];
    requiredSampleTransformation = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
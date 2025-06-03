package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;

final class H265Reader$SampleReader
{
  private static final int FIRST_SLICE_FLAG_OFFSET = 2;
  private boolean isFirstParameterSet;
  private boolean isFirstSlice;
  private boolean lookingForFirstSliceFlag;
  private int nalUnitBytesRead;
  private boolean nalUnitHasKeyframeData;
  private long nalUnitStartPosition;
  private long nalUnitTimeUs;
  private final TrackOutput output;
  private boolean readingSample;
  private boolean sampleIsKeyframe;
  private long samplePosition;
  private long sampleTimeUs;
  private boolean writingParameterSets;
  
  public H265Reader$SampleReader(TrackOutput paramTrackOutput)
  {
    output = paramTrackOutput;
  }
  
  private void outputSample(int paramInt)
  {
    int i = sampleIsKeyframe;
    int j = (int)(nalUnitStartPosition - samplePosition);
    output.sampleMetadata(sampleTimeUs, i, j, paramInt, null);
  }
  
  public void endNalUnit(long paramLong, int paramInt)
  {
    if ((writingParameterSets) && (isFirstSlice))
    {
      sampleIsKeyframe = nalUnitHasKeyframeData;
      writingParameterSets = false;
    }
    else if ((isFirstParameterSet) || (isFirstSlice))
    {
      if (readingSample) {
        outputSample(paramInt + (int)(paramLong - nalUnitStartPosition));
      }
      samplePosition = nalUnitStartPosition;
      sampleTimeUs = nalUnitTimeUs;
      readingSample = true;
      sampleIsKeyframe = nalUnitHasKeyframeData;
    }
  }
  
  public void readNalUnitData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (lookingForFirstSliceFlag)
    {
      int i = nalUnitBytesRead;
      int j = paramInt1 + 2 - i;
      if (j < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[j] & 0x80) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        isFirstSlice = bool;
        lookingForFirstSliceFlag = false;
      }
      else
      {
        nalUnitBytesRead = (paramInt2 - paramInt1 + i);
      }
    }
  }
  
  public void reset()
  {
    lookingForFirstSliceFlag = false;
    isFirstSlice = false;
    isFirstParameterSet = false;
    readingSample = false;
    writingParameterSets = false;
  }
  
  public void startNalUnit(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    boolean bool1 = false;
    isFirstSlice = false;
    isFirstParameterSet = false;
    nalUnitTimeUs = paramLong2;
    nalUnitBytesRead = 0;
    nalUnitStartPosition = paramLong1;
    if (paramInt2 >= 32)
    {
      if ((!writingParameterSets) && (readingSample))
      {
        outputSample(paramInt1);
        readingSample = false;
      }
      if (paramInt2 <= 34)
      {
        isFirstParameterSet = (writingParameterSets ^ true);
        writingParameterSets = true;
      }
    }
    boolean bool2;
    if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    nalUnitHasKeyframeData = bool2;
    if (!bool2)
    {
      bool2 = bool1;
      if (paramInt2 > 9) {}
    }
    else
    {
      bool2 = true;
    }
    lookingForFirstSliceFlag = bool2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H265Reader.SampleReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
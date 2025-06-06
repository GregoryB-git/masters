package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

final class TrackFragment
{
  public long atomPosition;
  public long auxiliaryDataPosition;
  public long dataPosition;
  public boolean definesEncryptionData;
  public DefaultSampleValues header;
  public long nextFragmentDecodeTime;
  public int[] sampleCompositionTimeOffsetTable;
  public int sampleCount;
  public long[] sampleDecodingTimeTable;
  public ParsableByteArray sampleEncryptionData;
  public int sampleEncryptionDataLength;
  public boolean sampleEncryptionDataNeedsFill;
  public boolean[] sampleHasSubsampleEncryptionTable;
  public boolean[] sampleIsSyncFrameTable;
  public int[] sampleSizeTable;
  public TrackEncryptionBox trackEncryptionBox;
  public int trunCount;
  public long[] trunDataPosition;
  public int[] trunLength;
  
  public void fillEncryptionData(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.readFully(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
    sampleEncryptionData.setPosition(0);
    sampleEncryptionDataNeedsFill = false;
  }
  
  public void fillEncryptionData(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.readBytes(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
    sampleEncryptionData.setPosition(0);
    sampleEncryptionDataNeedsFill = false;
  }
  
  public long getSamplePresentationTime(int paramInt)
  {
    return sampleDecodingTimeTable[paramInt] + sampleCompositionTimeOffsetTable[paramInt];
  }
  
  public void initEncryptionData(int paramInt)
  {
    ParsableByteArray localParsableByteArray = sampleEncryptionData;
    if ((localParsableByteArray == null) || (localParsableByteArray.limit() < paramInt)) {
      sampleEncryptionData = new ParsableByteArray(paramInt);
    }
    sampleEncryptionDataLength = paramInt;
    definesEncryptionData = true;
    sampleEncryptionDataNeedsFill = true;
  }
  
  public void initTables(int paramInt1, int paramInt2)
  {
    trunCount = paramInt1;
    sampleCount = paramInt2;
    int[] arrayOfInt = trunLength;
    if ((arrayOfInt == null) || (arrayOfInt.length < paramInt1))
    {
      trunDataPosition = new long[paramInt1];
      trunLength = new int[paramInt1];
    }
    arrayOfInt = sampleSizeTable;
    if ((arrayOfInt == null) || (arrayOfInt.length < paramInt2))
    {
      paramInt1 = paramInt2 * 125 / 100;
      sampleSizeTable = new int[paramInt1];
      sampleCompositionTimeOffsetTable = new int[paramInt1];
      sampleDecodingTimeTable = new long[paramInt1];
      sampleIsSyncFrameTable = new boolean[paramInt1];
      sampleHasSubsampleEncryptionTable = new boolean[paramInt1];
    }
  }
  
  public void reset()
  {
    trunCount = 0;
    nextFragmentDecodeTime = 0L;
    definesEncryptionData = false;
    sampleEncryptionDataNeedsFill = false;
    trackEncryptionBox = null;
  }
  
  public boolean sampleHasSubsampleEncryptionTable(int paramInt)
  {
    boolean bool;
    if ((definesEncryptionData) && (sampleHasSubsampleEncryptionTable[paramInt] != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.TrackFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
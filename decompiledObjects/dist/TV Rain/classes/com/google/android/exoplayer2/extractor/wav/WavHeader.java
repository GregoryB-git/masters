package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

final class WavHeader
  implements SeekMap
{
  private final int averageBytesPerSecond;
  private final int bitsPerSample;
  private final int blockAlignment;
  private long dataSize;
  private long dataStartPosition;
  private final int encoding;
  private final int numChannels;
  private final int sampleRateHz;
  
  public WavHeader(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    numChannels = paramInt1;
    sampleRateHz = paramInt2;
    averageBytesPerSecond = paramInt3;
    blockAlignment = paramInt4;
    bitsPerSample = paramInt5;
    encoding = paramInt6;
  }
  
  public int getBitrate()
  {
    return sampleRateHz * bitsPerSample * numChannels;
  }
  
  public int getBytesPerFrame()
  {
    return blockAlignment;
  }
  
  public long getDataLimit()
  {
    long l;
    if (hasDataBounds()) {
      l = dataStartPosition + dataSize;
    } else {
      l = -1L;
    }
    return l;
  }
  
  public long getDurationUs()
  {
    return dataSize / blockAlignment * 1000000L / sampleRateHz;
  }
  
  public int getEncoding()
  {
    return encoding;
  }
  
  public int getNumChannels()
  {
    return numChannels;
  }
  
  public int getSampleRateHz()
  {
    return sampleRateHz;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    long l1 = averageBytesPerSecond * paramLong / 1000000L;
    int i = blockAlignment;
    l1 = Util.constrainValue(l1 / i * i, 0L, dataSize - i);
    long l2 = dataStartPosition + l1;
    long l3 = getTimeUs(l2);
    SeekPoint localSeekPoint = new SeekPoint(l3, l2);
    if (l3 < paramLong)
    {
      paramLong = dataSize;
      i = blockAlignment;
      if (l1 != paramLong - i)
      {
        paramLong = l2 + i;
        return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(getTimeUs(paramLong), paramLong));
      }
    }
    return new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public long getTimeUs(long paramLong)
  {
    return Math.max(0L, paramLong - dataStartPosition) * 1000000L / averageBytesPerSecond;
  }
  
  public boolean hasDataBounds()
  {
    boolean bool;
    if ((dataStartPosition != 0L) && (dataSize != 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSeekable()
  {
    return true;
  }
  
  public void setDataBounds(long paramLong1, long paramLong2)
  {
    dataStartPosition = paramLong1;
    dataSize = paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.wav.WavHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
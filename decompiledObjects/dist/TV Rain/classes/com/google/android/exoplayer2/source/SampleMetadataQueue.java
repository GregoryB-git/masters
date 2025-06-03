package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

final class SampleMetadataQueue
{
  private static final int SAMPLE_CAPACITY_INCREMENT = 1000;
  private int absoluteFirstIndex;
  private int capacity = 1000;
  private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData['Ϩ'];
  private int[] flags = new int['Ϩ'];
  private Format[] formats = new Format['Ϩ'];
  private long largestDiscardedTimestampUs = Long.MIN_VALUE;
  private long largestQueuedTimestampUs = Long.MIN_VALUE;
  private int length;
  private long[] offsets = new long['Ϩ'];
  private int readPosition;
  private int relativeFirstIndex;
  private int[] sizes = new int['Ϩ'];
  private int[] sourceIds = new int['Ϩ'];
  private long[] timesUs = new long['Ϩ'];
  private Format upstreamFormat;
  private boolean upstreamFormatRequired = true;
  private boolean upstreamKeyframeRequired = true;
  private int upstreamSourceId;
  
  private long discardSamples(int paramInt)
  {
    largestDiscardedTimestampUs = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(paramInt));
    int i = length - paramInt;
    length = i;
    absoluteFirstIndex += paramInt;
    int j = relativeFirstIndex + paramInt;
    relativeFirstIndex = j;
    int k = capacity;
    if (j >= k) {
      relativeFirstIndex = (j - k);
    }
    paramInt = readPosition - paramInt;
    readPosition = paramInt;
    if (paramInt < 0) {
      readPosition = 0;
    }
    if (i == 0)
    {
      paramInt = relativeFirstIndex;
      if (paramInt == 0) {
        paramInt = k;
      }
      paramInt--;
      return offsets[paramInt] + sizes[paramInt];
    }
    return offsets[relativeFirstIndex];
  }
  
  private int findSampleBefore(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i = -1;
    int j = 0;
    int k = paramInt1;
    for (paramInt1 = j; (paramInt1 < paramInt2) && (timesUs[k] <= paramLong); paramInt1++)
    {
      if ((!paramBoolean) || ((flags[k] & 0x1) != 0)) {
        i = paramInt1;
      }
      j = k + 1;
      k = j;
      if (j == capacity) {
        k = 0;
      }
    }
    return i;
  }
  
  private long getLargestTimestamp(int paramInt)
  {
    long l1 = Long.MIN_VALUE;
    if (paramInt == 0) {
      return Long.MIN_VALUE;
    }
    int i = getRelativeIndex(paramInt - 1);
    long l2;
    for (int j = 0;; j++)
    {
      l2 = l1;
      if (j >= paramInt) {
        break;
      }
      l1 = Math.max(l1, timesUs[i]);
      if ((flags[i] & 0x1) != 0)
      {
        l2 = l1;
        break;
      }
      int k = i - 1;
      i = k;
      if (k == -1) {
        i = capacity - 1;
      }
    }
    return l2;
  }
  
  private int getRelativeIndex(int paramInt)
  {
    paramInt = relativeFirstIndex + paramInt;
    int i = capacity;
    if (paramInt >= i) {
      paramInt -= i;
    }
    return paramInt;
  }
  
  public int advanceTo(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int i = getRelativeIndex(readPosition);
      if ((hasNextSample()) && (paramLong >= timesUs[i]) && ((paramLong <= largestQueuedTimestampUs) || (paramBoolean2)))
      {
        i = findSampleBefore(i, length - readPosition, paramLong, paramBoolean1);
        if (i == -1) {
          return -1;
        }
        readPosition += i;
        return i;
      }
      return -1;
    }
    finally {}
  }
  
  public int advanceToEnd()
  {
    try
    {
      int i = length;
      int j = readPosition;
      readPosition = i;
      return i - j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean attemptSplice(long paramLong)
  {
    try
    {
      int i = length;
      boolean bool = false;
      if (i == 0)
      {
        l = largestDiscardedTimestampUs;
        if (paramLong > l) {
          bool = true;
        }
        return bool;
      }
      long l = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(readPosition));
      if (l >= paramLong) {
        return false;
      }
      int j = length;
      i = getRelativeIndex(j - 1);
      while ((j > readPosition) && (timesUs[i] >= paramLong))
      {
        int k = j - 1;
        int m = i - 1;
        j = k;
        i = m;
        if (m == -1)
        {
          i = capacity - 1;
          j = k;
        }
      }
      discardUpstreamSamples(absoluteFirstIndex + j);
      return true;
    }
    finally {}
  }
  
  public void commitSample(long paramLong1, int paramInt1, long paramLong2, int paramInt2, TrackOutput.CryptoData paramCryptoData)
  {
    try
    {
      boolean bool = upstreamKeyframeRequired;
      if (bool)
      {
        if ((paramInt1 & 0x1) == 0) {
          return;
        }
        upstreamKeyframeRequired = false;
      }
      if (!upstreamFormatRequired) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      commitSampleTimestamp(paramLong1);
      int i = getRelativeIndex(length);
      timesUs[i] = paramLong1;
      long[] arrayOfLong1 = offsets;
      arrayOfLong1[i] = paramLong2;
      sizes[i] = paramInt2;
      flags[i] = paramInt1;
      cryptoDatas[i] = paramCryptoData;
      formats[i] = upstreamFormat;
      sourceIds[i] = upstreamSourceId;
      paramInt1 = length + 1;
      length = paramInt1;
      paramInt2 = capacity;
      if (paramInt1 == paramInt2)
      {
        paramInt1 = paramInt2 + 1000;
        int[] arrayOfInt1 = new int[paramInt1];
        long[] arrayOfLong2 = new long[paramInt1];
        paramCryptoData = new long[paramInt1];
        int[] arrayOfInt2 = new int[paramInt1];
        int[] arrayOfInt3 = new int[paramInt1];
        TrackOutput.CryptoData[] arrayOfCryptoData = new TrackOutput.CryptoData[paramInt1];
        Format[] arrayOfFormat = new Format[paramInt1];
        i = relativeFirstIndex;
        paramInt2 -= i;
        System.arraycopy(arrayOfLong1, i, arrayOfLong2, 0, paramInt2);
        System.arraycopy(timesUs, relativeFirstIndex, paramCryptoData, 0, paramInt2);
        System.arraycopy(flags, relativeFirstIndex, arrayOfInt2, 0, paramInt2);
        System.arraycopy(sizes, relativeFirstIndex, arrayOfInt3, 0, paramInt2);
        System.arraycopy(cryptoDatas, relativeFirstIndex, arrayOfCryptoData, 0, paramInt2);
        System.arraycopy(formats, relativeFirstIndex, arrayOfFormat, 0, paramInt2);
        System.arraycopy(sourceIds, relativeFirstIndex, arrayOfInt1, 0, paramInt2);
        i = relativeFirstIndex;
        System.arraycopy(offsets, 0, arrayOfLong2, paramInt2, i);
        System.arraycopy(timesUs, 0, paramCryptoData, paramInt2, i);
        System.arraycopy(flags, 0, arrayOfInt2, paramInt2, i);
        System.arraycopy(sizes, 0, arrayOfInt3, paramInt2, i);
        System.arraycopy(cryptoDatas, 0, arrayOfCryptoData, paramInt2, i);
        System.arraycopy(formats, 0, arrayOfFormat, paramInt2, i);
        System.arraycopy(sourceIds, 0, arrayOfInt1, paramInt2, i);
        offsets = arrayOfLong2;
        timesUs = paramCryptoData;
        flags = arrayOfInt2;
        sizes = arrayOfInt3;
        cryptoDatas = arrayOfCryptoData;
        formats = arrayOfFormat;
        sourceIds = arrayOfInt1;
        relativeFirstIndex = 0;
        length = capacity;
        capacity = paramInt1;
      }
      return;
    }
    finally {}
  }
  
  public void commitSampleTimestamp(long paramLong)
  {
    try
    {
      largestQueuedTimestampUs = Math.max(largestQueuedTimestampUs, paramLong);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long discardTo(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int i = length;
      if (i != 0)
      {
        long[] arrayOfLong = timesUs;
        int j = relativeFirstIndex;
        if (paramLong >= arrayOfLong[j])
        {
          int k = i;
          if (paramBoolean2)
          {
            int m = readPosition;
            k = i;
            if (m != i) {
              k = m + 1;
            }
          }
          k = findSampleBefore(j, k, paramLong, paramBoolean1);
          if (k == -1) {
            return -1L;
          }
          paramLong = discardSamples(k);
          return paramLong;
        }
      }
      return -1L;
    }
    finally {}
  }
  
  public long discardToEnd()
  {
    try
    {
      int i = length;
      if (i == 0) {
        return -1L;
      }
      long l = discardSamples(i);
      return l;
    }
    finally {}
  }
  
  public long discardToRead()
  {
    try
    {
      int i = readPosition;
      if (i == 0) {
        return -1L;
      }
      long l = discardSamples(i);
      return l;
    }
    finally {}
  }
  
  public long discardUpstreamSamples(int paramInt)
  {
    paramInt = getWriteIndex() - paramInt;
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= length - readPosition)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    paramInt = length - paramInt;
    length = paramInt;
    largestQueuedTimestampUs = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(paramInt));
    paramInt = length;
    if (paramInt == 0) {
      return 0L;
    }
    paramInt = getRelativeIndex(paramInt - 1);
    return offsets[paramInt] + sizes[paramInt];
  }
  
  public boolean format(Format paramFormat)
  {
    if (paramFormat == null) {}
    try
    {
      upstreamFormatRequired = true;
      return false;
    }
    finally {}
    upstreamFormatRequired = false;
    boolean bool = Util.areEqual(paramFormat, upstreamFormat);
    if (bool) {
      return false;
    }
    upstreamFormat = paramFormat;
    return true;
  }
  
  public int getFirstIndex()
  {
    return absoluteFirstIndex;
  }
  
  public long getFirstTimestampUs()
  {
    try
    {
      long l;
      if (length == 0) {
        l = Long.MIN_VALUE;
      } else {
        l = timesUs[relativeFirstIndex];
      }
      return l;
    }
    finally {}
  }
  
  public long getLargestQueuedTimestampUs()
  {
    try
    {
      long l = largestQueuedTimestampUs;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getReadIndex()
  {
    return absoluteFirstIndex + readPosition;
  }
  
  public Format getUpstreamFormat()
  {
    try
    {
      Format localFormat;
      if (upstreamFormatRequired) {
        localFormat = null;
      } else {
        localFormat = upstreamFormat;
      }
      return localFormat;
    }
    finally {}
  }
  
  public int getWriteIndex()
  {
    return absoluteFirstIndex + length;
  }
  
  public boolean hasNextSample()
  {
    try
    {
      int i = readPosition;
      int j = length;
      boolean bool;
      if (i != j) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int peekSourceId()
  {
    int i = getRelativeIndex(readPosition);
    if (hasNextSample()) {
      i = sourceIds[i];
    } else {
      i = upstreamSourceId;
    }
    return i;
  }
  
  public int read(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean1, boolean paramBoolean2, Format paramFormat, SampleExtrasHolder paramSampleExtrasHolder)
  {
    try
    {
      if (!hasNextSample())
      {
        if (paramBoolean2)
        {
          paramDecoderInputBuffer.setFlags(4);
          return -4;
        }
        paramDecoderInputBuffer = upstreamFormat;
        if ((paramDecoderInputBuffer != null) && ((paramBoolean1) || (paramDecoderInputBuffer != paramFormat)))
        {
          format = paramDecoderInputBuffer;
          return -5;
        }
        return -3;
      }
      int i = getRelativeIndex(readPosition);
      if ((!paramBoolean1) && (formats[i] == paramFormat))
      {
        paramBoolean1 = paramDecoderInputBuffer.isFlagsOnly();
        if (paramBoolean1) {
          return -3;
        }
        timeUs = timesUs[i];
        paramDecoderInputBuffer.setFlags(flags[i]);
        size = sizes[i];
        offset = offsets[i];
        cryptoData = cryptoDatas[i];
        readPosition += 1;
        return -4;
      }
      format = formats[i];
      return -5;
    }
    finally {}
  }
  
  public void reset(boolean paramBoolean)
  {
    length = 0;
    absoluteFirstIndex = 0;
    relativeFirstIndex = 0;
    readPosition = 0;
    upstreamKeyframeRequired = true;
    largestDiscardedTimestampUs = Long.MIN_VALUE;
    largestQueuedTimestampUs = Long.MIN_VALUE;
    if (paramBoolean)
    {
      upstreamFormat = null;
      upstreamFormatRequired = true;
    }
  }
  
  public void rewind()
  {
    try
    {
      readPosition = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean setReadPosition(int paramInt)
  {
    try
    {
      int i = absoluteFirstIndex;
      if ((i <= paramInt) && (paramInt <= length + i))
      {
        readPosition = (paramInt - i);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public void sourceId(int paramInt)
  {
    upstreamSourceId = paramInt;
  }
  
  public static final class SampleExtrasHolder
  {
    public TrackOutput.CryptoData cryptoData;
    public long offset;
    public int size;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SampleMetadataQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
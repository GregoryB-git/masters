package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

final class DefaultOggSeeker
  implements OggSeeker
{
  private static final int DEFAULT_OFFSET = 30000;
  public static final int MATCH_BYTE_RANGE = 100000;
  public static final int MATCH_RANGE = 72000;
  private static final int STATE_IDLE = 3;
  private static final int STATE_READ_LAST_PAGE = 1;
  private static final int STATE_SEEK = 2;
  private static final int STATE_SEEK_TO_END = 0;
  private long end;
  private long endGranule;
  private final long endPosition;
  private final OggPageHeader pageHeader = new OggPageHeader();
  private long positionBeforeSeekToEnd;
  private long start;
  private long startGranule;
  private final long startPosition;
  private int state;
  private final StreamReader streamReader;
  private long targetGranule;
  private long totalGranules;
  
  public DefaultOggSeeker(long paramLong1, long paramLong2, StreamReader paramStreamReader, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    boolean bool;
    if ((paramLong1 >= 0L) && (paramLong2 > paramLong1)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    streamReader = paramStreamReader;
    startPosition = paramLong1;
    endPosition = paramLong2;
    if ((paramLong3 != paramLong2 - paramLong1) && (!paramBoolean))
    {
      state = 0;
    }
    else
    {
      totalGranules = paramLong4;
      state = 3;
    }
  }
  
  private long getEstimatedPosition(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = endPosition;
    long l2 = startPosition;
    paramLong1 = (l1 - l2) * paramLong2 / totalGranules - paramLong3 + paramLong1;
    if (paramLong1 < l2) {
      paramLong1 = l2;
    }
    paramLong2 = paramLong1;
    if (paramLong1 >= l1) {
      paramLong2 = l1 - 1L;
    }
    return paramLong2;
  }
  
  public OggSeekMap createSeekMap()
  {
    long l = totalGranules;
    OggSeekMap localOggSeekMap = null;
    if (l != 0L) {
      localOggSeekMap = new OggSeekMap(null);
    }
    return localOggSeekMap;
  }
  
  public long getNextSeekPosition(long paramLong, ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    long l1 = start;
    long l2 = end;
    long l3 = 2L;
    if (l1 == l2) {
      return -(startGranule + 2L);
    }
    l2 = paramExtractorInput.getPosition();
    if (!skipToNextPage(paramExtractorInput, end))
    {
      paramLong = start;
      if (paramLong != l2) {
        return paramLong;
      }
      throw new IOException("No ogg page can be found.");
    }
    pageHeader.populate(paramExtractorInput, false);
    paramExtractorInput.resetPeekPosition();
    OggPageHeader localOggPageHeader = pageHeader;
    long l4 = granulePosition;
    l1 = paramLong - l4;
    int i = headerSize + bodySize;
    boolean bool = l1 < 0L;
    if ((!bool) && (l1 <= 72000L))
    {
      paramExtractorInput.skipFully(i);
      return -(pageHeader.granulePosition + 2L);
    }
    if (bool)
    {
      end = l2;
      endGranule = l4;
    }
    else
    {
      l2 = paramExtractorInput.getPosition();
      paramLong = i;
      l2 += paramLong;
      start = l2;
      startGranule = pageHeader.granulePosition;
      if (end - l2 + paramLong < 100000L)
      {
        paramExtractorInput.skipFully(i);
        return -(startGranule + 2L);
      }
    }
    paramLong = end;
    l2 = start;
    if (paramLong - l2 < 100000L)
    {
      end = l2;
      return l2;
    }
    l2 = i;
    if (!bool) {
      paramLong = l3;
    } else {
      paramLong = 1L;
    }
    long l5 = paramExtractorInput.getPosition();
    l3 = end;
    l4 = start;
    return Math.min(Math.max((l3 - l4) * l1 / (endGranule - startGranule) + (l5 - l2 * paramLong), l4), end - 1L);
  }
  
  public long read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    int i = state;
    long l1;
    long l2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            return -1L;
          }
          throw new IllegalStateException();
        }
        l1 = targetGranule;
        l2 = 0L;
        if (l1 != 0L)
        {
          l2 = getNextSeekPosition(l1, paramExtractorInput);
          if (l2 >= 0L) {
            return l2;
          }
          l2 = skipToPageOfGranule(paramExtractorInput, targetGranule, -(l2 + 2L));
        }
        state = 3;
        return -(l2 + 2L);
      }
    }
    else
    {
      l2 = paramExtractorInput.getPosition();
      positionBeforeSeekToEnd = l2;
      state = 1;
      l1 = endPosition - 65307L;
      if (l1 > l2) {
        return l1;
      }
    }
    totalGranules = readGranuleOfLastPage(paramExtractorInput);
    state = 3;
    return positionBeforeSeekToEnd;
  }
  
  public long readGranuleOfLastPage(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    skipToNextPage(paramExtractorInput);
    pageHeader.reset();
    while (((pageHeader.type & 0x4) != 4) && (paramExtractorInput.getPosition() < endPosition))
    {
      pageHeader.populate(paramExtractorInput, false);
      OggPageHeader localOggPageHeader = pageHeader;
      paramExtractorInput.skipFully(headerSize + bodySize);
    }
    return pageHeader.granulePosition;
  }
  
  public void resetSeeking()
  {
    start = startPosition;
    end = endPosition;
    startGranule = 0L;
    endGranule = totalGranules;
  }
  
  public void skipToNextPage(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (skipToNextPage(paramExtractorInput, endPosition)) {
      return;
    }
    throw new EOFException();
  }
  
  public boolean skipToNextPage(ExtractorInput paramExtractorInput, long paramLong)
    throws IOException, InterruptedException
  {
    long l1 = Math.min(paramLong + 3L, endPosition);
    int i = 2048;
    byte[] arrayOfByte = new byte['ࠀ'];
    for (;;)
    {
      long l2 = paramExtractorInput.getPosition();
      paramLong = i;
      int j = 0;
      int k;
      if (l2 + paramLong > l1)
      {
        k = (int)(l1 - paramExtractorInput.getPosition());
        i = k;
        if (k < 4) {
          return false;
        }
      }
      paramExtractorInput.peekFully(arrayOfByte, 0, i, false);
      for (;;)
      {
        k = i - 3;
        if (j >= k) {
          break;
        }
        if ((arrayOfByte[j] == 79) && (arrayOfByte[(j + 1)] == 103) && (arrayOfByte[(j + 2)] == 103) && (arrayOfByte[(j + 3)] == 83))
        {
          paramExtractorInput.skipFully(j);
          return true;
        }
        j++;
      }
      paramExtractorInput.skipFully(k);
    }
  }
  
  public long skipToPageOfGranule(ExtractorInput paramExtractorInput, long paramLong1, long paramLong2)
    throws IOException, InterruptedException
  {
    pageHeader.populate(paramExtractorInput, false);
    for (;;)
    {
      OggPageHeader localOggPageHeader = pageHeader;
      if (granulePosition >= paramLong1) {
        break;
      }
      paramExtractorInput.skipFully(headerSize + bodySize);
      localOggPageHeader = pageHeader;
      paramLong2 = granulePosition;
      localOggPageHeader.populate(paramExtractorInput, false);
    }
    paramExtractorInput.resetPeekPosition();
    return paramLong2;
  }
  
  public long startSeek(long paramLong)
  {
    int i = state;
    boolean bool;
    if ((i != 3) && (i != 2)) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkArgument(bool);
    long l = 0L;
    if (paramLong == 0L) {
      paramLong = l;
    } else {
      paramLong = streamReader.convertTimeToGranule(paramLong);
    }
    targetGranule = paramLong;
    state = 2;
    resetSeeking();
    return targetGranule;
  }
  
  public class OggSeekMap
    implements SeekMap
  {
    private OggSeekMap() {}
    
    public long getDurationUs()
    {
      return DefaultOggSeeker.access$200(DefaultOggSeeker.this).convertGranuleToTime(DefaultOggSeeker.access$400(DefaultOggSeeker.this));
    }
    
    public SeekMap.SeekPoints getSeekPoints(long paramLong)
    {
      if (paramLong == 0L) {
        return new SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.access$100(DefaultOggSeeker.this)));
      }
      long l = DefaultOggSeeker.access$200(DefaultOggSeeker.this).convertTimeToGranule(paramLong);
      DefaultOggSeeker localDefaultOggSeeker = DefaultOggSeeker.this;
      return new SeekMap.SeekPoints(new SeekPoint(paramLong, DefaultOggSeeker.access$300(localDefaultOggSeeker, DefaultOggSeeker.access$100(localDefaultOggSeeker), l, 30000L)));
    }
    
    public boolean isSeekable()
    {
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
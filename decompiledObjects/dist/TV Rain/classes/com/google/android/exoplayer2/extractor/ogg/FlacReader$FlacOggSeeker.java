package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.FlacStreamInfo;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

class FlacReader$FlacOggSeeker
  implements OggSeeker, SeekMap
{
  private static final int METADATA_LENGTH_OFFSET = 1;
  private static final int SEEK_POINT_SIZE = 18;
  private long firstFrameOffset = -1L;
  private long pendingSeekGranule = -1L;
  private long[] seekPointGranules;
  private long[] seekPointOffsets;
  
  public FlacReader$FlacOggSeeker(FlacReader paramFlacReader) {}
  
  public SeekMap createSeekMap()
  {
    return this;
  }
  
  public long getDurationUs()
  {
    return FlacReader.access$000(this$0).durationUs();
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    long l = this$0.convertTimeToGranule(paramLong);
    int i = Util.binarySearchFloor(seekPointGranules, l, true, true);
    l = this$0.convertGranuleToTime(seekPointGranules[i]);
    SeekPoint localSeekPoint = new SeekPoint(l, firstFrameOffset + seekPointOffsets[i]);
    if (l < paramLong)
    {
      long[] arrayOfLong = seekPointGranules;
      if (i != arrayOfLong.length - 1)
      {
        FlacReader localFlacReader = this$0;
        i++;
        return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(localFlacReader.convertGranuleToTime(arrayOfLong[i]), firstFrameOffset + seekPointOffsets[i]));
      }
    }
    return new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public boolean isSeekable()
  {
    return true;
  }
  
  public void parseSeekTable(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.skipBytes(1);
    int i = paramParsableByteArray.readUnsignedInt24() / 18;
    seekPointGranules = new long[i];
    seekPointOffsets = new long[i];
    for (int j = 0; j < i; j++)
    {
      seekPointGranules[j] = paramParsableByteArray.readLong();
      seekPointOffsets[j] = paramParsableByteArray.readLong();
      paramParsableByteArray.skipBytes(2);
    }
  }
  
  public long read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    long l = pendingSeekGranule;
    if (l >= 0L)
    {
      l = -(l + 2L);
      pendingSeekGranule = -1L;
      return l;
    }
    return -1L;
  }
  
  public void setFirstFrameOffset(long paramLong)
  {
    firstFrameOffset = paramLong;
  }
  
  public long startSeek(long paramLong)
  {
    paramLong = this$0.convertTimeToGranule(paramLong);
    int i = Util.binarySearchFloor(seekPointGranules, paramLong, true, true);
    pendingSeekGranule = seekPointGranules[i];
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
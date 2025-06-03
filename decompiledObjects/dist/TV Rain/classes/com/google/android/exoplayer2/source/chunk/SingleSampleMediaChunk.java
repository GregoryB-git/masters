package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

public final class SingleSampleMediaChunk
  extends BaseMediaChunk
{
  private boolean loadCompleted;
  private long nextLoadPosition;
  private final Format sampleFormat;
  private final int trackType;
  
  public SingleSampleMediaChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat1, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, Format paramFormat2)
  {
    super(paramDataSource, paramDataSpec, paramFormat1, paramInt1, paramObject, paramLong1, paramLong2, -9223372036854775807L, -9223372036854775807L, paramLong3);
    trackType = paramInt2;
    sampleFormat = paramFormat2;
  }
  
  public void cancelLoad() {}
  
  public boolean isLoadCompleted()
  {
    return loadCompleted;
  }
  
  public void load()
    throws IOException, InterruptedException
  {
    Object localObject1 = dataSpec.subrange(nextLoadPosition);
    try
    {
      long l1 = dataSource.open((DataSpec)localObject1);
      long l2 = l1;
      if (l1 != -1L) {
        l2 = l1 + nextLoadPosition;
      }
      localObject1 = new com/google/android/exoplayer2/extractor/DefaultExtractorInput;
      ((DefaultExtractorInput)localObject1).<init>(dataSource, nextLoadPosition, l2);
      Object localObject3 = getOutput();
      ((BaseMediaChunkOutput)localObject3).setSampleOffsetUs(0L);
      int i = trackType;
      int j = 0;
      localObject3 = ((BaseMediaChunkOutput)localObject3).track(0, i);
      ((TrackOutput)localObject3).format(sampleFormat);
      while (j != -1)
      {
        nextLoadPosition += j;
        j = ((TrackOutput)localObject3).sampleData((ExtractorInput)localObject1, Integer.MAX_VALUE, true);
      }
      j = (int)nextLoadPosition;
      ((TrackOutput)localObject3).sampleMetadata(startTimeUs, 1, j, 0, null);
      Util.closeQuietly(dataSource);
      loadCompleted = true;
      return;
    }
    finally
    {
      Util.closeQuietly(dataSource);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
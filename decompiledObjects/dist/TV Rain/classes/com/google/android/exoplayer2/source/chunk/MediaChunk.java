package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

public abstract class MediaChunk
  extends Chunk
{
  public final long chunkIndex;
  
  public MediaChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    super(paramDataSource, paramDataSpec, 1, paramFormat, paramInt, paramObject, paramLong1, paramLong2);
    Assertions.checkNotNull(paramFormat);
    chunkIndex = paramLong3;
  }
  
  public long getNextChunkIndex()
  {
    long l1 = chunkIndex;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = 1L + l1;
    }
    return l2;
  }
  
  public abstract boolean isLoadCompleted();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.MediaChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
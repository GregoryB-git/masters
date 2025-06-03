package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.NoSuchElementException;

final class MediaChunkIterator$1
  implements MediaChunkIterator
{
  public long getChunkEndTimeUs()
  {
    throw new NoSuchElementException();
  }
  
  public long getChunkStartTimeUs()
  {
    throw new NoSuchElementException();
  }
  
  public DataSpec getDataSpec()
  {
    throw new NoSuchElementException();
  }
  
  public boolean isEnded()
  {
    return true;
  }
  
  public boolean next()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.MediaChunkIterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

public abstract class BaseMediaChunkIterator
  implements MediaChunkIterator
{
  private long currentIndex;
  private final long fromIndex;
  private final long toIndex;
  
  public BaseMediaChunkIterator(long paramLong1, long paramLong2)
  {
    fromIndex = paramLong1;
    toIndex = paramLong2;
    currentIndex = (paramLong1 - 1L);
  }
  
  public void checkInBounds()
  {
    long l = currentIndex;
    if ((l >= fromIndex) && (l <= toIndex)) {
      return;
    }
    throw new NoSuchElementException();
  }
  
  public long getCurrentIndex()
  {
    return currentIndex;
  }
  
  public boolean isEnded()
  {
    boolean bool;
    if (currentIndex > toIndex) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean next()
  {
    currentIndex += 1L;
    return isEnded() ^ true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
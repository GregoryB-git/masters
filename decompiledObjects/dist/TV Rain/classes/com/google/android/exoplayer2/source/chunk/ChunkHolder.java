package com.google.android.exoplayer2.source.chunk;

public final class ChunkHolder
{
  public Chunk chunk;
  public boolean endOfStream;
  
  public void clear()
  {
    chunk = null;
    endOfStream = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ChunkHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
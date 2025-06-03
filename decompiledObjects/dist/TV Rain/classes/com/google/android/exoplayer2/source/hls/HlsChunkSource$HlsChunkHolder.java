package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;

public final class HlsChunkSource$HlsChunkHolder
{
  public Chunk chunk;
  public boolean endOfStream;
  public HlsMasterPlaylist.HlsUrl playlist;
  
  public HlsChunkSource$HlsChunkHolder()
  {
    clear();
  }
  
  public void clear()
  {
    chunk = null;
    endOfStream = false;
    playlist = null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsChunkSource.HlsChunkHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
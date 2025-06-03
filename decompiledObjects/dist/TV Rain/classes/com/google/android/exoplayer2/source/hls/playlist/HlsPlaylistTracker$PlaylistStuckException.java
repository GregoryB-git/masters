package com.google.android.exoplayer2.source.hls.playlist;

import java.io.IOException;

public final class HlsPlaylistTracker$PlaylistStuckException
  extends IOException
{
  public final String url;
  
  public HlsPlaylistTracker$PlaylistStuckException(String paramString)
  {
    url = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistStuckException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
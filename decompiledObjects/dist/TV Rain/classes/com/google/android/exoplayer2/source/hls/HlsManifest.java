package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;

public final class HlsManifest
{
  public final HlsMasterPlaylist masterPlaylist;
  public final HlsMediaPlaylist mediaPlaylist;
  
  public HlsManifest(HlsMasterPlaylist paramHlsMasterPlaylist, HlsMediaPlaylist paramHlsMediaPlaylist)
  {
    masterPlaylist = paramHlsMasterPlaylist;
    mediaPlaylist = paramHlsMediaPlaylist;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsManifest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
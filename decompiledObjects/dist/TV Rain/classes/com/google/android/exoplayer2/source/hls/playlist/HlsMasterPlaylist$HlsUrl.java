package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;

public final class HlsMasterPlaylist$HlsUrl
{
  public final Format format;
  public final String url;
  
  public HlsMasterPlaylist$HlsUrl(String paramString, Format paramFormat)
  {
    url = paramString;
    format = paramFormat;
  }
  
  public static HlsUrl createMediaPlaylistHlsUrl(String paramString)
  {
    return new HlsUrl(paramString, Format.createContainerFormat("0", null, "application/x-mpegURL", null, null, -1, 0, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
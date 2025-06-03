package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;

public abstract interface HlsPlaylistParserFactory
{
  public abstract ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser();
  
  public abstract ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(HlsMasterPlaylist paramHlsMasterPlaylist);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
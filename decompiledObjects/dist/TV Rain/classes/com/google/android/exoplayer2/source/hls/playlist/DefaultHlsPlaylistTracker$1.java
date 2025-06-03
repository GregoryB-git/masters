package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;

final class DefaultHlsPlaylistTracker$1
  implements HlsPlaylistParserFactory
{
  public DefaultHlsPlaylistTracker$1(ParsingLoadable.Parser paramParser) {}
  
  public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser()
  {
    return val$playlistParser;
  }
  
  public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(HlsMasterPlaylist paramHlsMasterPlaylist)
  {
    return val$playlistParser;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
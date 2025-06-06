package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import java.util.Collections;
import java.util.List;

public final class DefaultHlsPlaylistParserFactory
  implements HlsPlaylistParserFactory
{
  private final List<StreamKey> streamKeys;
  
  public DefaultHlsPlaylistParserFactory()
  {
    this(Collections.emptyList());
  }
  
  public DefaultHlsPlaylistParserFactory(List<StreamKey> paramList)
  {
    streamKeys = paramList;
  }
  
  public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser()
  {
    return new FilteringManifestParser(new HlsPlaylistParser(), streamKeys);
  }
  
  public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(HlsMasterPlaylist paramHlsMasterPlaylist)
  {
    return new FilteringManifestParser(new HlsPlaylistParser(paramHlsMasterPlaylist), streamKeys);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
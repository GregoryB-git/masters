package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

public abstract interface HlsPlaylistTracker$Factory
{
  public abstract HlsPlaylistTracker createTracker(HlsDataSourceFactory paramHlsDataSourceFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, HlsPlaylistParserFactory paramHlsPlaylistParserFactory);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
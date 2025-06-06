package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

public abstract interface HlsPlaylistTracker
{
  public abstract void addListener(PlaylistEventListener paramPlaylistEventListener);
  
  public abstract long getInitialStartTimeUs();
  
  @Nullable
  public abstract HlsMasterPlaylist getMasterPlaylist();
  
  @Nullable
  public abstract HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl paramHlsUrl);
  
  public abstract boolean isLive();
  
  public abstract boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl paramHlsUrl);
  
  public abstract void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl paramHlsUrl)
    throws IOException;
  
  public abstract void maybeThrowPrimaryPlaylistRefreshError()
    throws IOException;
  
  public abstract void refreshPlaylist(HlsMasterPlaylist.HlsUrl paramHlsUrl);
  
  public abstract void removeListener(PlaylistEventListener paramPlaylistEventListener);
  
  public abstract void start(Uri paramUri, MediaSourceEventListener.EventDispatcher paramEventDispatcher, PrimaryPlaylistListener paramPrimaryPlaylistListener);
  
  public abstract void stop();
  
  public static abstract interface Factory
  {
    public abstract HlsPlaylistTracker createTracker(HlsDataSourceFactory paramHlsDataSourceFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, HlsPlaylistParserFactory paramHlsPlaylistParserFactory);
  }
  
  public static abstract interface PlaylistEventListener
  {
    public abstract void onPlaylistChanged();
    
    public abstract boolean onPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong);
  }
  
  public static final class PlaylistResetException
    extends IOException
  {
    public final String url;
    
    public PlaylistResetException(String paramString)
    {
      url = paramString;
    }
  }
  
  public static final class PlaylistStuckException
    extends IOException
  {
    public final String url;
    
    public PlaylistStuckException(String paramString)
    {
      url = paramString;
    }
  }
  
  public static abstract interface PrimaryPlaylistListener
  {
    public abstract void onPrimaryPlaylistRefreshed(HlsMediaPlaylist paramHlsMediaPlaylist);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
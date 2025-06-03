package com.google.android.exoplayer2.source.hls.playlist;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.List;

final class DefaultHlsPlaylistTracker$MediaPlaylistBundle
  implements Loader.Callback<ParsingLoadable<HlsPlaylist>>, Runnable
{
  private long blacklistUntilMs;
  private long earliestNextLoadTimeMs;
  private long lastSnapshotChangeMs;
  private long lastSnapshotLoadMs;
  private boolean loadPending;
  private final ParsingLoadable<HlsPlaylist> mediaPlaylistLoadable;
  private final Loader mediaPlaylistLoader;
  private IOException playlistError;
  private HlsMediaPlaylist playlistSnapshot;
  private final HlsMasterPlaylist.HlsUrl playlistUrl;
  
  public DefaultHlsPlaylistTracker$MediaPlaylistBundle(DefaultHlsPlaylistTracker paramDefaultHlsPlaylistTracker, HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    playlistUrl = paramHlsUrl;
    mediaPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
    mediaPlaylistLoadable = new ParsingLoadable(DefaultHlsPlaylistTracker.access$300(paramDefaultHlsPlaylistTracker).createDataSource(4), UriUtil.resolveToUri(access$400baseUri, url), 4, DefaultHlsPlaylistTracker.access$500(paramDefaultHlsPlaylistTracker));
  }
  
  private boolean blacklistPlaylist(long paramLong)
  {
    blacklistUntilMs = (SystemClock.elapsedRealtime() + paramLong);
    boolean bool;
    if ((DefaultHlsPlaylistTracker.access$1200(this$0) == playlistUrl) && (!DefaultHlsPlaylistTracker.access$1300(this$0))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void loadPlaylistImmediately()
  {
    long l = mediaPlaylistLoader.startLoading(mediaPlaylistLoadable, this, DefaultHlsPlaylistTracker.access$800(this$0).getMinimumLoadableRetryCount(mediaPlaylistLoadable.type));
    MediaSourceEventListener.EventDispatcher localEventDispatcher = DefaultHlsPlaylistTracker.access$700(this$0);
    ParsingLoadable localParsingLoadable = mediaPlaylistLoadable;
    localEventDispatcher.loadStarted(dataSpec, type, l);
  }
  
  private void processLoadedPlaylist(HlsMediaPlaylist paramHlsMediaPlaylist, long paramLong)
  {
    HlsMediaPlaylist localHlsMediaPlaylist1 = playlistSnapshot;
    long l1 = SystemClock.elapsedRealtime();
    lastSnapshotLoadMs = l1;
    HlsMediaPlaylist localHlsMediaPlaylist2 = DefaultHlsPlaylistTracker.access$1000(this$0, localHlsMediaPlaylist1, paramHlsMediaPlaylist);
    playlistSnapshot = localHlsMediaPlaylist2;
    if (localHlsMediaPlaylist2 != localHlsMediaPlaylist1)
    {
      playlistError = null;
      lastSnapshotChangeMs = l1;
      DefaultHlsPlaylistTracker.access$1100(this$0, playlistUrl, localHlsMediaPlaylist2);
    }
    else if (!hasEndTag)
    {
      long l2 = mediaSequence;
      long l3 = segments.size();
      paramHlsMediaPlaylist = playlistSnapshot;
      if (l2 + l3 < mediaSequence)
      {
        playlistError = new HlsPlaylistTracker.PlaylistResetException(playlistUrl.url);
        DefaultHlsPlaylistTracker.access$900(this$0, playlistUrl, -9223372036854775807L);
      }
      else if (l1 - lastSnapshotChangeMs > C.usToMs(targetDurationUs) * 3.5D)
      {
        playlistError = new HlsPlaylistTracker.PlaylistStuckException(playlistUrl.url);
        paramLong = DefaultHlsPlaylistTracker.access$800(this$0).getBlacklistDurationMsFor(4, paramLong, playlistError, 1);
        DefaultHlsPlaylistTracker.access$900(this$0, playlistUrl, paramLong);
        if (paramLong != -9223372036854775807L) {
          blacklistPlaylist(paramLong);
        }
      }
    }
    paramHlsMediaPlaylist = playlistSnapshot;
    if (paramHlsMediaPlaylist != localHlsMediaPlaylist1) {
      paramLong = targetDurationUs;
    } else {
      paramLong = targetDurationUs / 2L;
    }
    earliestNextLoadTimeMs = (C.usToMs(paramLong) + l1);
    if ((playlistUrl == DefaultHlsPlaylistTracker.access$1200(this$0)) && (!playlistSnapshot.hasEndTag)) {
      loadPlaylist();
    }
  }
  
  public HlsMediaPlaylist getPlaylistSnapshot()
  {
    return playlistSnapshot;
  }
  
  public boolean isSnapshotValid()
  {
    HlsMediaPlaylist localHlsMediaPlaylist = playlistSnapshot;
    boolean bool = false;
    if (localHlsMediaPlaylist == null) {
      return false;
    }
    long l1 = SystemClock.elapsedRealtime();
    long l2 = Math.max(30000L, C.usToMs(playlistSnapshot.durationUs));
    localHlsMediaPlaylist = playlistSnapshot;
    if (!hasEndTag)
    {
      int i = playlistType;
      if ((i != 2) && (i != 1) && (lastSnapshotLoadMs + l2 <= l1)) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public void loadPlaylist()
  {
    blacklistUntilMs = 0L;
    if ((!loadPending) && (!mediaPlaylistLoader.isLoading()))
    {
      long l = SystemClock.elapsedRealtime();
      if (l < earliestNextLoadTimeMs)
      {
        loadPending = true;
        DefaultHlsPlaylistTracker.access$600(this$0).postDelayed(this, earliestNextLoadTimeMs - l);
      }
      else
      {
        loadPlaylistImmediately();
      }
    }
  }
  
  public void maybeThrowPlaylistRefreshError()
    throws IOException
  {
    mediaPlaylistLoader.maybeThrowError();
    IOException localIOException = playlistError;
    if (localIOException == null) {
      return;
    }
    throw localIOException;
  }
  
  public void onLoadCanceled(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    DefaultHlsPlaylistTracker.access$700(this$0).loadCanceled(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
  }
  
  public void onLoadCompleted(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    HlsPlaylist localHlsPlaylist = (HlsPlaylist)paramParsingLoadable.getResult();
    if ((localHlsPlaylist instanceof HlsMediaPlaylist))
    {
      processLoadedPlaylist((HlsMediaPlaylist)localHlsPlaylist, paramLong2);
      DefaultHlsPlaylistTracker.access$700(this$0).loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
    }
    else
    {
      playlistError = new ParserException("Loaded playlist has unexpected type.");
    }
  }
  
  public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l = DefaultHlsPlaylistTracker.access$800(this$0).getBlacklistDurationMsFor(type, paramLong2, paramIOException, paramInt);
    int i;
    if (l != -9223372036854775807L) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool1;
    if ((!DefaultHlsPlaylistTracker.access$900(this$0, playlistUrl, l)) && (i != 0)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    boolean bool2 = bool1;
    if (i != 0) {
      bool2 = bool1 | blacklistPlaylist(l);
    }
    Loader.LoadErrorAction localLoadErrorAction;
    if (bool2)
    {
      l = DefaultHlsPlaylistTracker.access$800(this$0).getRetryDelayMsFor(type, paramLong2, paramIOException, paramInt);
      if (l != -9223372036854775807L) {
        localLoadErrorAction = Loader.createRetryAction(false, l);
      } else {
        localLoadErrorAction = Loader.DONT_RETRY_FATAL;
      }
    }
    else
    {
      localLoadErrorAction = Loader.DONT_RETRY;
    }
    DefaultHlsPlaylistTracker.access$700(this$0).loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, localLoadErrorAction.isRetry() ^ true);
    return localLoadErrorAction;
  }
  
  public void release()
  {
    mediaPlaylistLoader.release();
  }
  
  public void run()
  {
    loadPending = false;
    loadPlaylistImmediately();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
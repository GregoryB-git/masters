package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import z0;

public final class DefaultHlsPlaylistTracker
  implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>>
{
  public static final HlsPlaylistTracker.Factory FACTORY = new z0();
  private static final double PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5D;
  private final HlsDataSourceFactory dataSourceFactory;
  @Nullable
  private MediaSourceEventListener.EventDispatcher eventDispatcher;
  @Nullable
  private Loader initialPlaylistLoader;
  private long initialStartTimeUs;
  private boolean isLive;
  private final List<HlsPlaylistTracker.PlaylistEventListener> listeners;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  @Nullable
  private HlsMasterPlaylist masterPlaylist;
  @Nullable
  private ParsingLoadable.Parser<HlsPlaylist> mediaPlaylistParser;
  private final IdentityHashMap<HlsMasterPlaylist.HlsUrl, MediaPlaylistBundle> playlistBundles;
  private final HlsPlaylistParserFactory playlistParserFactory;
  @Nullable
  private Handler playlistRefreshHandler;
  @Nullable
  private HlsMasterPlaylist.HlsUrl primaryHlsUrl;
  @Nullable
  private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;
  @Nullable
  private HlsMediaPlaylist primaryUrlSnapshot;
  
  public DefaultHlsPlaylistTracker(HlsDataSourceFactory paramHlsDataSourceFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, HlsPlaylistParserFactory paramHlsPlaylistParserFactory)
  {
    dataSourceFactory = paramHlsDataSourceFactory;
    playlistParserFactory = paramHlsPlaylistParserFactory;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    listeners = new ArrayList();
    playlistBundles = new IdentityHashMap();
    initialStartTimeUs = -9223372036854775807L;
  }
  
  @Deprecated
  public DefaultHlsPlaylistTracker(HlsDataSourceFactory paramHlsDataSourceFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, ParsingLoadable.Parser<HlsPlaylist> paramParser)
  {
    this(paramHlsDataSourceFactory, paramLoadErrorHandlingPolicy, createFixedFactory(paramParser));
  }
  
  private void createBundles(List<HlsMasterPlaylist.HlsUrl> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      HlsMasterPlaylist.HlsUrl localHlsUrl = (HlsMasterPlaylist.HlsUrl)paramList.get(j);
      MediaPlaylistBundle localMediaPlaylistBundle = new MediaPlaylistBundle(localHlsUrl);
      playlistBundles.put(localHlsUrl, localMediaPlaylistBundle);
    }
  }
  
  private static HlsPlaylistParserFactory createFixedFactory(ParsingLoadable.Parser<HlsPlaylist> paramParser)
  {
    new HlsPlaylistParserFactory()
    {
      public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser()
      {
        return val$playlistParser;
      }
      
      public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(HlsMasterPlaylist paramAnonymousHlsMasterPlaylist)
      {
        return val$playlistParser;
      }
    };
  }
  
  private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist paramHlsMediaPlaylist1, HlsMediaPlaylist paramHlsMediaPlaylist2)
  {
    int i = (int)(mediaSequence - mediaSequence);
    paramHlsMediaPlaylist1 = segments;
    if (i < paramHlsMediaPlaylist1.size()) {
      paramHlsMediaPlaylist1 = (HlsMediaPlaylist.Segment)paramHlsMediaPlaylist1.get(i);
    } else {
      paramHlsMediaPlaylist1 = null;
    }
    return paramHlsMediaPlaylist1;
  }
  
  private HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist paramHlsMediaPlaylist1, HlsMediaPlaylist paramHlsMediaPlaylist2)
  {
    if (!paramHlsMediaPlaylist2.isNewerThan(paramHlsMediaPlaylist1))
    {
      HlsMediaPlaylist localHlsMediaPlaylist = paramHlsMediaPlaylist1;
      if (hasEndTag) {
        localHlsMediaPlaylist = paramHlsMediaPlaylist1.copyWithEndTag();
      }
      return localHlsMediaPlaylist;
    }
    return paramHlsMediaPlaylist2.copyWith(getLoadedPlaylistStartTimeUs(paramHlsMediaPlaylist1, paramHlsMediaPlaylist2), getLoadedPlaylistDiscontinuitySequence(paramHlsMediaPlaylist1, paramHlsMediaPlaylist2));
  }
  
  private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist paramHlsMediaPlaylist1, HlsMediaPlaylist paramHlsMediaPlaylist2)
  {
    if (hasDiscontinuitySequence) {
      return discontinuitySequence;
    }
    Object localObject = primaryUrlSnapshot;
    int i;
    if (localObject != null) {
      i = discontinuitySequence;
    } else {
      i = 0;
    }
    if (paramHlsMediaPlaylist1 == null) {
      return i;
    }
    localObject = getFirstOldOverlappingSegment(paramHlsMediaPlaylist1, paramHlsMediaPlaylist2);
    if (localObject != null) {
      return discontinuitySequence + relativeDiscontinuitySequence - segments.get(0)).relativeDiscontinuitySequence;
    }
    return i;
  }
  
  private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist paramHlsMediaPlaylist1, HlsMediaPlaylist paramHlsMediaPlaylist2)
  {
    if (hasProgramDateTime) {
      return startTimeUs;
    }
    Object localObject = primaryUrlSnapshot;
    long l;
    if (localObject != null) {
      l = startTimeUs;
    } else {
      l = 0L;
    }
    if (paramHlsMediaPlaylist1 == null) {
      return l;
    }
    int i = segments.size();
    localObject = getFirstOldOverlappingSegment(paramHlsMediaPlaylist1, paramHlsMediaPlaylist2);
    if (localObject != null) {
      return startTimeUs + relativeStartTimeUs;
    }
    if (i == mediaSequence - mediaSequence) {
      return paramHlsMediaPlaylist1.getEndTimeUs();
    }
    return l;
  }
  
  private boolean maybeSelectNewPrimaryUrl()
  {
    List localList = masterPlaylist.variants;
    int i = localList.size();
    long l = SystemClock.elapsedRealtime();
    for (int j = 0; j < i; j++)
    {
      MediaPlaylistBundle localMediaPlaylistBundle = (MediaPlaylistBundle)playlistBundles.get(localList.get(j));
      if (l > MediaPlaylistBundle.access$100(localMediaPlaylistBundle))
      {
        primaryHlsUrl = MediaPlaylistBundle.access$200(localMediaPlaylistBundle);
        localMediaPlaylistBundle.loadPlaylist();
        return true;
      }
    }
    return false;
  }
  
  private void maybeSetPrimaryUrl(HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    if ((paramHlsUrl != primaryHlsUrl) && (masterPlaylist.variants.contains(paramHlsUrl)))
    {
      HlsMediaPlaylist localHlsMediaPlaylist = primaryUrlSnapshot;
      if ((localHlsMediaPlaylist == null) || (!hasEndTag))
      {
        primaryHlsUrl = paramHlsUrl;
        ((MediaPlaylistBundle)playlistBundles.get(paramHlsUrl)).loadPlaylist();
      }
    }
  }
  
  private boolean notifyPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong)
  {
    int i = listeners.size();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      bool |= ((HlsPlaylistTracker.PlaylistEventListener)listeners.get(j)).onPlaylistError(paramHlsUrl, paramLong) ^ true;
      j++;
    }
    return bool;
  }
  
  private void onPlaylistUpdated(HlsMasterPlaylist.HlsUrl paramHlsUrl, HlsMediaPlaylist paramHlsMediaPlaylist)
  {
    if (paramHlsUrl == primaryHlsUrl)
    {
      if (primaryUrlSnapshot == null)
      {
        isLive = (hasEndTag ^ true);
        initialStartTimeUs = startTimeUs;
      }
      primaryUrlSnapshot = paramHlsMediaPlaylist;
      primaryPlaylistListener.onPrimaryPlaylistRefreshed(paramHlsMediaPlaylist);
    }
    int i = listeners.size();
    for (int j = 0; j < i; j++) {
      ((HlsPlaylistTracker.PlaylistEventListener)listeners.get(j)).onPlaylistChanged();
    }
  }
  
  public void addListener(HlsPlaylistTracker.PlaylistEventListener paramPlaylistEventListener)
  {
    listeners.add(paramPlaylistEventListener);
  }
  
  public long getInitialStartTimeUs()
  {
    return initialStartTimeUs;
  }
  
  @Nullable
  public HlsMasterPlaylist getMasterPlaylist()
  {
    return masterPlaylist;
  }
  
  public HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    HlsMediaPlaylist localHlsMediaPlaylist = ((MediaPlaylistBundle)playlistBundles.get(paramHlsUrl)).getPlaylistSnapshot();
    if (localHlsMediaPlaylist != null) {
      maybeSetPrimaryUrl(paramHlsUrl);
    }
    return localHlsMediaPlaylist;
  }
  
  public boolean isLive()
  {
    return isLive;
  }
  
  public boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    return ((MediaPlaylistBundle)playlistBundles.get(paramHlsUrl)).isSnapshotValid();
  }
  
  public void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl paramHlsUrl)
    throws IOException
  {
    ((MediaPlaylistBundle)playlistBundles.get(paramHlsUrl)).maybeThrowPlaylistRefreshError();
  }
  
  public void maybeThrowPrimaryPlaylistRefreshError()
    throws IOException
  {
    Object localObject = initialPlaylistLoader;
    if (localObject != null) {
      ((Loader)localObject).maybeThrowError();
    }
    localObject = primaryHlsUrl;
    if (localObject != null) {
      maybeThrowPlaylistRefreshError((HlsMasterPlaylist.HlsUrl)localObject);
    }
  }
  
  public void onLoadCanceled(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    eventDispatcher.loadCanceled(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
  }
  
  public void onLoadCompleted(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    HlsPlaylist localHlsPlaylist = (HlsPlaylist)paramParsingLoadable.getResult();
    boolean bool = localHlsPlaylist instanceof HlsMediaPlaylist;
    if (bool) {
      localObject = HlsMasterPlaylist.createSingleVariantMasterPlaylist(baseUri);
    } else {
      localObject = (HlsMasterPlaylist)localHlsPlaylist;
    }
    masterPlaylist = ((HlsMasterPlaylist)localObject);
    mediaPlaylistParser = playlistParserFactory.createPlaylistParser((HlsMasterPlaylist)localObject);
    primaryHlsUrl = ((HlsMasterPlaylist.HlsUrl)variants.get(0));
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(variants);
    localArrayList.addAll(audios);
    localArrayList.addAll(subtitles);
    createBundles(localArrayList);
    Object localObject = (MediaPlaylistBundle)playlistBundles.get(primaryHlsUrl);
    if (bool) {
      MediaPlaylistBundle.access$000((MediaPlaylistBundle)localObject, (HlsMediaPlaylist)localHlsPlaylist, paramLong2);
    } else {
      ((MediaPlaylistBundle)localObject).loadPlaylist();
    }
    eventDispatcher.loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
  }
  
  public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l = loadErrorHandlingPolicy.getRetryDelayMsFor(type, paramLong2, paramIOException, paramInt);
    boolean bool;
    if (l == -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    eventDispatcher.loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, bool);
    if (bool) {
      paramParsingLoadable = Loader.DONT_RETRY_FATAL;
    } else {
      paramParsingLoadable = Loader.createRetryAction(false, l);
    }
    return paramParsingLoadable;
  }
  
  public void refreshPlaylist(HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    ((MediaPlaylistBundle)playlistBundles.get(paramHlsUrl)).loadPlaylist();
  }
  
  public void removeListener(HlsPlaylistTracker.PlaylistEventListener paramPlaylistEventListener)
  {
    listeners.remove(paramPlaylistEventListener);
  }
  
  public void start(Uri paramUri, MediaSourceEventListener.EventDispatcher paramEventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener paramPrimaryPlaylistListener)
  {
    playlistRefreshHandler = new Handler();
    eventDispatcher = paramEventDispatcher;
    primaryPlaylistListener = paramPrimaryPlaylistListener;
    paramUri = new ParsingLoadable(dataSourceFactory.createDataSource(4), paramUri, 4, playlistParserFactory.createPlaylistParser());
    boolean bool;
    if (initialPlaylistLoader == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    paramPrimaryPlaylistListener = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
    initialPlaylistLoader = paramPrimaryPlaylistListener;
    long l = paramPrimaryPlaylistListener.startLoading(paramUri, this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(type));
    paramEventDispatcher.loadStarted(dataSpec, type, l);
  }
  
  public void stop()
  {
    primaryHlsUrl = null;
    primaryUrlSnapshot = null;
    masterPlaylist = null;
    initialStartTimeUs = -9223372036854775807L;
    initialPlaylistLoader.release();
    initialPlaylistLoader = null;
    Iterator localIterator = playlistBundles.values().iterator();
    while (localIterator.hasNext()) {
      ((MediaPlaylistBundle)localIterator.next()).release();
    }
    playlistRefreshHandler.removeCallbacksAndMessages(null);
    playlistRefreshHandler = null;
    playlistBundles.clear();
  }
  
  public final class MediaPlaylistBundle
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
    
    public MediaPlaylistBundle(HlsMasterPlaylist.HlsUrl paramHlsUrl)
    {
      playlistUrl = paramHlsUrl;
      mediaPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
      mediaPlaylistLoadable = new ParsingLoadable(DefaultHlsPlaylistTracker.access$300(DefaultHlsPlaylistTracker.this).createDataSource(4), UriUtil.resolveToUri(access$400baseUri, url), 4, DefaultHlsPlaylistTracker.access$500(DefaultHlsPlaylistTracker.this));
    }
    
    private boolean blacklistPlaylist(long paramLong)
    {
      blacklistUntilMs = (SystemClock.elapsedRealtime() + paramLong);
      boolean bool;
      if ((DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker.this) == playlistUrl) && (!DefaultHlsPlaylistTracker.access$1300(DefaultHlsPlaylistTracker.this))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private void loadPlaylistImmediately()
    {
      long l = mediaPlaylistLoader.startLoading(mediaPlaylistLoadable, this, DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this).getMinimumLoadableRetryCount(mediaPlaylistLoadable.type));
      MediaSourceEventListener.EventDispatcher localEventDispatcher = DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this);
      ParsingLoadable localParsingLoadable = mediaPlaylistLoadable;
      localEventDispatcher.loadStarted(dataSpec, type, l);
    }
    
    private void processLoadedPlaylist(HlsMediaPlaylist paramHlsMediaPlaylist, long paramLong)
    {
      HlsMediaPlaylist localHlsMediaPlaylist1 = playlistSnapshot;
      long l1 = SystemClock.elapsedRealtime();
      lastSnapshotLoadMs = l1;
      HlsMediaPlaylist localHlsMediaPlaylist2 = DefaultHlsPlaylistTracker.access$1000(DefaultHlsPlaylistTracker.this, localHlsMediaPlaylist1, paramHlsMediaPlaylist);
      playlistSnapshot = localHlsMediaPlaylist2;
      if (localHlsMediaPlaylist2 != localHlsMediaPlaylist1)
      {
        playlistError = null;
        lastSnapshotChangeMs = l1;
        DefaultHlsPlaylistTracker.access$1100(DefaultHlsPlaylistTracker.this, playlistUrl, localHlsMediaPlaylist2);
      }
      else if (!hasEndTag)
      {
        long l2 = mediaSequence;
        long l3 = segments.size();
        paramHlsMediaPlaylist = playlistSnapshot;
        if (l2 + l3 < mediaSequence)
        {
          playlistError = new HlsPlaylistTracker.PlaylistResetException(playlistUrl.url);
          DefaultHlsPlaylistTracker.access$900(DefaultHlsPlaylistTracker.this, playlistUrl, -9223372036854775807L);
        }
        else if (l1 - lastSnapshotChangeMs > C.usToMs(targetDurationUs) * 3.5D)
        {
          playlistError = new HlsPlaylistTracker.PlaylistStuckException(playlistUrl.url);
          paramLong = DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this).getBlacklistDurationMsFor(4, paramLong, playlistError, 1);
          DefaultHlsPlaylistTracker.access$900(DefaultHlsPlaylistTracker.this, playlistUrl, paramLong);
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
      if ((playlistUrl == DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker.this)) && (!playlistSnapshot.hasEndTag)) {
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
          DefaultHlsPlaylistTracker.access$600(DefaultHlsPlaylistTracker.this).postDelayed(this, earliestNextLoadTimeMs - l);
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
      DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadCanceled(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
    }
    
    public void onLoadCompleted(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2)
    {
      HlsPlaylist localHlsPlaylist = (HlsPlaylist)paramParsingLoadable.getResult();
      if ((localHlsPlaylist instanceof HlsMediaPlaylist))
      {
        processLoadedPlaylist((HlsMediaPlaylist)localHlsPlaylist, paramLong2);
        DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
      }
      else
      {
        playlistError = new ParserException("Loaded playlist has unexpected type.");
      }
    }
    
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      long l = DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this).getBlacklistDurationMsFor(type, paramLong2, paramIOException, paramInt);
      int i;
      if (l != -9223372036854775807L) {
        i = 1;
      } else {
        i = 0;
      }
      boolean bool1;
      if ((!DefaultHlsPlaylistTracker.access$900(DefaultHlsPlaylistTracker.this, playlistUrl, l)) && (i != 0)) {
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
        l = DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this).getRetryDelayMsFor(type, paramLong2, paramIOException, paramInt);
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
      DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), 4, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, localLoadErrorAction.isRetry() ^ true);
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
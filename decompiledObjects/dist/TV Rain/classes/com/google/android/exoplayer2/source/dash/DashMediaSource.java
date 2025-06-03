package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower.Dummy;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0;
import z2;

public final class DashMediaSource
  extends BaseMediaSource
{
  @Deprecated
  public static final long DEFAULT_LIVE_PRESENTATION_DELAY_FIXED_MS = 30000L;
  public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000L;
  @Deprecated
  public static final long DEFAULT_LIVE_PRESENTATION_DELAY_PREFER_MANIFEST_MS = -1L;
  private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000L;
  private static final int NOTIFY_MANIFEST_INTERVAL_MS = 5000;
  private static final String TAG = "DashMediaSource";
  private final DashChunkSource.Factory chunkSourceFactory;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private DataSource dataSource;
  private boolean dynamicMediaPresentationEnded;
  private long elapsedRealtimeOffsetMs;
  private long expiredManifestPublishTimeUs;
  private int firstPeriodId;
  private Handler handler;
  private Uri initialManifestUri;
  private final long livePresentationDelayMs;
  private final boolean livePresentationDelayOverridesManifest;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private Loader loader;
  private DashManifest manifest;
  private final ManifestCallback manifestCallback;
  private final DataSource.Factory manifestDataSourceFactory;
  private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
  private IOException manifestFatalError;
  private long manifestLoadEndTimestampMs;
  private final LoaderErrorThrower manifestLoadErrorThrower;
  private boolean manifestLoadPending;
  private long manifestLoadStartTimestampMs;
  private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
  private Uri manifestUri;
  private final Object manifestUriLock;
  @Nullable
  private TransferListener mediaTransferListener;
  private final SparseArray<DashMediaPeriod> periodsById;
  private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
  private final Runnable refreshManifestRunnable;
  private final boolean sideloadedManifest;
  private final Runnable simulateManifestRefreshRunnable;
  private int staleManifestReloadAttempt;
  @Nullable
  private final Object tag;
  
  static
  {
    ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
  }
  
  @Deprecated
  public DashMediaSource(Uri paramUri, DataSource.Factory paramFactory, DashChunkSource.Factory paramFactory1, int paramInt, long paramLong, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, paramFactory, new DashManifestParser(), paramFactory1, paramInt, paramLong, paramHandler, paramMediaSourceEventListener);
  }
  
  @Deprecated
  public DashMediaSource(Uri paramUri, DataSource.Factory paramFactory, DashChunkSource.Factory paramFactory1, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, paramFactory, paramFactory1, 3, -1L, paramHandler, paramMediaSourceEventListener);
  }
  
  @Deprecated
  public DashMediaSource(Uri paramUri, DataSource.Factory paramFactory, ParsingLoadable.Parser<? extends DashManifest> paramParser, DashChunkSource.Factory paramFactory1, int paramInt, long paramLong, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(null, paramUri, paramFactory, paramParser, paramFactory1, localDefaultCompositeSequenceableLoaderFactory, localDefaultLoadErrorHandlingPolicy, paramLong, bool, null);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      addEventListener(paramHandler, paramMediaSourceEventListener);
    }
  }
  
  private DashMediaSource(DashManifest paramDashManifest, Uri paramUri, DataSource.Factory paramFactory, ParsingLoadable.Parser<? extends DashManifest> paramParser, DashChunkSource.Factory paramFactory1, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, long paramLong, boolean paramBoolean, @Nullable Object paramObject)
  {
    initialManifestUri = paramUri;
    manifest = paramDashManifest;
    manifestUri = paramUri;
    manifestDataSourceFactory = paramFactory;
    manifestParser = paramParser;
    chunkSourceFactory = paramFactory1;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    livePresentationDelayMs = paramLong;
    livePresentationDelayOverridesManifest = paramBoolean;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    tag = paramObject;
    if (paramDashManifest != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    sideloadedManifest = paramBoolean;
    manifestEventDispatcher = createEventDispatcher(null);
    manifestUriLock = new Object();
    periodsById = new SparseArray();
    playerEmsgCallback = new DefaultPlayerEmsgCallback(null);
    expiredManifestPublishTimeUs = -9223372036854775807L;
    if (paramBoolean)
    {
      Assertions.checkState(dynamic ^ true);
      manifestCallback = null;
      refreshManifestRunnable = null;
      simulateManifestRefreshRunnable = null;
      manifestLoadErrorThrower = new LoaderErrorThrower.Dummy();
    }
    else
    {
      manifestCallback = new ManifestCallback(null);
      manifestLoadErrorThrower = new ManifestLoadErrorThrower();
      refreshManifestRunnable = new v0(this, 0);
      simulateManifestRefreshRunnable = new v0(this, 1);
    }
  }
  
  @Deprecated
  public DashMediaSource(DashManifest paramDashManifest, DashChunkSource.Factory paramFactory, int paramInt, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramDashManifest, null, null, null, paramFactory, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(paramInt), 30000L, false, null);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      addEventListener(paramHandler, paramMediaSourceEventListener);
    }
  }
  
  @Deprecated
  public DashMediaSource(DashManifest paramDashManifest, DashChunkSource.Factory paramFactory, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramDashManifest, paramFactory, 3, paramHandler, paramMediaSourceEventListener);
  }
  
  private long getManifestLoadRetryDelayMillis()
  {
    return Math.min((staleManifestReloadAttempt - 1) * 1000, 5000);
  }
  
  private long getNowUnixTimeUs()
  {
    if (elapsedRealtimeOffsetMs != 0L) {
      return C.msToUs(SystemClock.elapsedRealtime() + elapsedRealtimeOffsetMs);
    }
    return C.msToUs(System.currentTimeMillis());
  }
  
  private void onUtcTimestampResolutionError(IOException paramIOException)
  {
    Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", paramIOException);
    processManifest(true);
  }
  
  private void onUtcTimestampResolved(long paramLong)
  {
    elapsedRealtimeOffsetMs = paramLong;
    processManifest(true);
  }
  
  private void processManifest(boolean paramBoolean)
  {
    for (int i = 0; i < periodsById.size(); i++)
    {
      j = periodsById.keyAt(i);
      if (j >= firstPeriodId) {
        ((DashMediaPeriod)periodsById.valueAt(i)).updateManifest(manifest, j - firstPeriodId);
      }
    }
    i = manifest.getPeriodCount() - 1;
    Object localObject = PeriodSeekInfo.createPeriodSeekInfo(manifest.getPeriod(0), manifest.getPeriodDurationUs(0));
    PeriodSeekInfo localPeriodSeekInfo = PeriodSeekInfo.createPeriodSeekInfo(manifest.getPeriod(i), manifest.getPeriodDurationUs(i));
    long l1 = availableStartTimeUs;
    long l2 = availableEndTimeUs;
    if ((manifest.dynamic) && (!isIndexExplicit))
    {
      l3 = Math.min(getNowUnixTimeUs() - C.msToUs(manifest.availabilityStartTimeMs) - C.msToUs(manifest.getPeriod(i).startMs), l2);
      l4 = manifest.timeShiftBufferDepthMs;
      l2 = l1;
      if (l4 != -9223372036854775807L)
      {
        for (l2 = l3 - C.msToUs(l4); (l2 < 0L) && (i > 0); l2 += ((DashManifest)localObject).getPeriodDurationUs(i))
        {
          localObject = manifest;
          i--;
        }
        if (i == 0) {
          l2 = Math.max(l1, l2);
        } else {
          l2 = manifest.getPeriodDurationUs(0);
        }
      }
      i = 1;
      l1 = l2;
      l2 = l3;
    }
    else
    {
      i = 0;
    }
    int j = 0;
    long l3 = l2 - l1;
    while (j < manifest.getPeriodCount() - 1)
    {
      l3 = manifest.getPeriodDurationUs(j) + l3;
      j++;
    }
    localObject = manifest;
    if (dynamic)
    {
      l5 = livePresentationDelayMs;
      l2 = l5;
      if (!livePresentationDelayOverridesManifest)
      {
        l4 = suggestedPresentationDelayMs;
        l2 = l5;
        if (l4 != -9223372036854775807L) {
          l2 = l4;
        }
      }
      l4 = l3 - C.msToUs(l2);
      l2 = l4;
      if (l4 < 5000000L) {
        l2 = Math.min(5000000L, l3 / 2L);
      }
    }
    else
    {
      l2 = 0L;
    }
    localObject = manifest;
    long l6 = availabilityStartTimeMs;
    long l5 = getPeriod0startMs;
    long l4 = C.usToMs(l1);
    localObject = manifest;
    refreshSourceInfo(new DashTimeline(availabilityStartTimeMs, l4 + (l6 + l5), firstPeriodId, l1, l3, l2, (DashManifest)localObject, tag), manifest);
    if (!sideloadedManifest)
    {
      handler.removeCallbacks(simulateManifestRefreshRunnable);
      l2 = 5000L;
      if (i != 0) {
        handler.postDelayed(simulateManifestRefreshRunnable, 5000L);
      }
      if (manifestLoadPending)
      {
        startLoadingManifest();
      }
      else if (paramBoolean)
      {
        localObject = manifest;
        if (dynamic)
        {
          l1 = minUpdatePeriodMs;
          if (l1 != -9223372036854775807L)
          {
            if (l1 != 0L) {
              l2 = l1;
            }
            scheduleManifestRefresh(Math.max(0L, manifestLoadStartTimestampMs + l2 - SystemClock.elapsedRealtime()));
          }
        }
      }
    }
  }
  
  private void resolveUtcTimingElement(UtcTimingElement paramUtcTimingElement)
  {
    String str = schemeIdUri;
    if ((!Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014")) && (!Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")))
    {
      if ((!Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014")) && (!Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")))
      {
        if ((!Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014")) && (!Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012"))) {
          onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        } else {
          resolveUtcTimingElementHttp(paramUtcTimingElement, new XsDateTimeParser(null));
        }
      }
      else {
        resolveUtcTimingElementHttp(paramUtcTimingElement, new Iso8601Parser());
      }
    }
    else {
      resolveUtcTimingElementDirect(paramUtcTimingElement);
    }
  }
  
  private void resolveUtcTimingElementDirect(UtcTimingElement paramUtcTimingElement)
  {
    try
    {
      onUtcTimestampResolved(Util.parseXsDateTime(value) - manifestLoadEndTimestampMs);
    }
    catch (ParserException paramUtcTimingElement)
    {
      onUtcTimestampResolutionError(paramUtcTimingElement);
    }
  }
  
  private void resolveUtcTimingElementHttp(UtcTimingElement paramUtcTimingElement, ParsingLoadable.Parser<Long> paramParser)
  {
    startLoading(new ParsingLoadable(dataSource, Uri.parse(value), 5, paramParser), new UtcTimestampCallback(null), 1);
  }
  
  private void scheduleManifestRefresh(long paramLong)
  {
    handler.postDelayed(refreshManifestRunnable, paramLong);
  }
  
  private <T> void startLoading(ParsingLoadable<T> paramParsingLoadable, Loader.Callback<ParsingLoadable<T>> paramCallback, int paramInt)
  {
    long l = loader.startLoading(paramParsingLoadable, paramCallback, paramInt);
    manifestEventDispatcher.loadStarted(dataSpec, type, l);
  }
  
  private void startLoadingManifest()
  {
    handler.removeCallbacks(refreshManifestRunnable);
    if (loader.isLoading())
    {
      manifestLoadPending = true;
      return;
    }
    synchronized (manifestUriLock)
    {
      Uri localUri = manifestUri;
      manifestLoadPending = false;
      startLoading(new ParsingLoadable(dataSource, localUri, 4, manifestParser), manifestCallback, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
      return;
    }
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    int i = ((Integer)periodUid).intValue() - firstPeriodId;
    paramMediaPeriodId = createEventDispatcher(paramMediaPeriodId, manifest.getPeriod(i).startMs);
    paramMediaPeriodId = new DashMediaPeriod(firstPeriodId + i, manifest, i, chunkSourceFactory, mediaTransferListener, loadErrorHandlingPolicy, paramMediaPeriodId, elapsedRealtimeOffsetMs, manifestLoadErrorThrower, paramAllocator, compositeSequenceableLoaderFactory, playerEmsgCallback);
    periodsById.put(id, paramMediaPeriodId);
    return paramMediaPeriodId;
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    manifestLoadErrorThrower.maybeThrowError();
  }
  
  public void onDashLiveMediaPresentationEndSignalEncountered()
  {
    dynamicMediaPresentationEnded = true;
  }
  
  public void onDashManifestPublishTimeExpired(long paramLong)
  {
    long l = expiredManifestPublishTimeUs;
    if ((l == -9223372036854775807L) || (l < paramLong)) {
      expiredManifestPublishTimeUs = paramLong;
    }
  }
  
  public void onDashManifestRefreshRequested()
  {
    handler.removeCallbacks(simulateManifestRefreshRunnable);
    startLoadingManifest();
  }
  
  public void onLoadCanceled(ParsingLoadable<?> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    manifestEventDispatcher.loadCanceled(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
  }
  
  public void onManifestLoadCompleted(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    manifestEventDispatcher.loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
    Object localObject1 = (DashManifest)paramParsingLoadable.getResult();
    Object localObject2 = manifest;
    int i = 0;
    int j;
    if (localObject2 == null) {
      j = 0;
    } else {
      j = ((DashManifest)localObject2).getPeriodCount();
    }
    long l = getPeriod0startMs;
    for (int k = 0; (k < j) && (manifest.getPeriod(k).startMs < l); k++) {}
    int m;
    if (dynamic)
    {
      if (j - k > ((DashManifest)localObject1).getPeriodCount())
      {
        Log.w("DashMediaSource", "Loaded out of sync manifest");
      }
      else
      {
        if (!dynamicMediaPresentationEnded)
        {
          l = expiredManifestPublishTimeUs;
          if ((l == -9223372036854775807L) || (publishTimeMs * 1000L > l))
          {
            m = 0;
            break label259;
          }
        }
        localObject2 = z2.t("Loaded stale dynamic manifest: ");
        ((StringBuilder)localObject2).append(publishTimeMs);
        ((StringBuilder)localObject2).append(", ");
        ((StringBuilder)localObject2).append(dynamicMediaPresentationEnded);
        ((StringBuilder)localObject2).append(", ");
        ((StringBuilder)localObject2).append(expiredManifestPublishTimeUs);
        Log.w("DashMediaSource", ((StringBuilder)localObject2).toString());
      }
      m = 1;
      label259:
      if (m != 0)
      {
        j = staleManifestReloadAttempt;
        staleManifestReloadAttempt = (j + 1);
        if (j < loadErrorHandlingPolicy.getMinimumLoadableRetryCount(type)) {
          scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
        } else {
          manifestFatalError = new DashManifestStaleException();
        }
        return;
      }
      staleManifestReloadAttempt = 0;
    }
    manifest = ((DashManifest)localObject1);
    manifestLoadPending &= dynamic;
    manifestLoadStartTimestampMs = (paramLong1 - paramLong2);
    manifestLoadEndTimestampMs = paramLong1;
    if (location != null)
    {
      localObject1 = manifestUriLock;
      m = i;
      try
      {
        if (dataSpec.uri == manifestUri) {
          m = 1;
        }
        if (m != 0) {
          manifestUri = manifest.location;
        }
      }
      finally {}
    }
    if (j == 0)
    {
      paramParsingLoadable = manifest.utcTiming;
      if (paramParsingLoadable != null) {
        resolveUtcTimingElement(paramParsingLoadable);
      } else {
        processManifest(true);
      }
    }
    else
    {
      firstPeriodId += k;
      processManifest(true);
    }
  }
  
  public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException)
  {
    boolean bool = paramIOException instanceof ParserException;
    manifestEventDispatcher.loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, bool);
    if (bool) {
      paramParsingLoadable = Loader.DONT_RETRY_FATAL;
    } else {
      paramParsingLoadable = Loader.RETRY;
    }
    return paramParsingLoadable;
  }
  
  public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    manifestEventDispatcher.loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
    onUtcTimestampResolved(((Long)paramParsingLoadable.getResult()).longValue() - paramLong1);
  }
  
  public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException)
  {
    manifestEventDispatcher.loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, true);
    onUtcTimestampResolutionError(paramIOException);
    return Loader.DONT_RETRY;
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    mediaTransferListener = paramTransferListener;
    if (sideloadedManifest)
    {
      processManifest(false);
    }
    else
    {
      dataSource = manifestDataSourceFactory.createDataSource();
      loader = new Loader("Loader:DashMediaSource");
      handler = new Handler();
      startLoadingManifest();
    }
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    paramMediaPeriod = (DashMediaPeriod)paramMediaPeriod;
    paramMediaPeriod.release();
    periodsById.remove(id);
  }
  
  public void releaseSourceInternal()
  {
    manifestLoadPending = false;
    dataSource = null;
    Object localObject = loader;
    if (localObject != null)
    {
      ((Loader)localObject).release();
      loader = null;
    }
    manifestLoadStartTimestampMs = 0L;
    manifestLoadEndTimestampMs = 0L;
    if (sideloadedManifest) {
      localObject = manifest;
    } else {
      localObject = null;
    }
    manifest = ((DashManifest)localObject);
    manifestUri = initialManifestUri;
    manifestFatalError = null;
    localObject = handler;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      handler = null;
    }
    elapsedRealtimeOffsetMs = 0L;
    staleManifestReloadAttempt = 0;
    expiredManifestPublishTimeUs = -9223372036854775807L;
    dynamicMediaPresentationEnded = false;
    firstPeriodId = 0;
    periodsById.clear();
  }
  
  public void replaceManifestUri(Uri paramUri)
  {
    synchronized (manifestUriLock)
    {
      manifestUri = paramUri;
      initialManifestUri = paramUri;
      return;
    }
  }
  
  public static final class DashTimeline
    extends Timeline
  {
    private final int firstPeriodId;
    private final DashManifest manifest;
    private final long offsetInFirstPeriodUs;
    private final long presentationStartTimeMs;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowStartTimeMs;
    @Nullable
    private final Object windowTag;
    
    public DashTimeline(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, long paramLong5, DashManifest paramDashManifest, @Nullable Object paramObject)
    {
      presentationStartTimeMs = paramLong1;
      windowStartTimeMs = paramLong2;
      firstPeriodId = paramInt;
      offsetInFirstPeriodUs = paramLong3;
      windowDurationUs = paramLong4;
      windowDefaultStartPositionUs = paramLong5;
      manifest = paramDashManifest;
      windowTag = paramObject;
    }
    
    private long getAdjustedWindowDefaultStartPositionUs(long paramLong)
    {
      long l1 = windowDefaultStartPositionUs;
      Object localObject = manifest;
      if (!dynamic) {
        return l1;
      }
      long l2 = l1;
      if (paramLong > 0L)
      {
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > windowDurationUs) {
          return -9223372036854775807L;
        }
      }
      paramLong = offsetInFirstPeriodUs + l2;
      l1 = ((DashManifest)localObject).getPeriodDurationUs(0);
      int i = 0;
      while ((i < manifest.getPeriodCount() - 1) && (paramLong >= l1))
      {
        paramLong -= l1;
        i++;
        l1 = manifest.getPeriodDurationUs(i);
      }
      localObject = manifest.getPeriod(i);
      i = ((Period)localObject).getAdaptationSetIndex(2);
      if (i == -1) {
        return l2;
      }
      localObject = ((Representation)adaptationSets.get(i)).representations.get(0)).getIndex();
      if ((localObject != null) && (((DashSegmentIndex)localObject).getSegmentCount(l1) != 0)) {
        return ((DashSegmentIndex)localObject).getTimeUs(((DashSegmentIndex)localObject).getSegmentNum(paramLong, l1)) + l2 - paramLong;
      }
      return l2;
    }
    
    public int getIndexOfPeriod(Object paramObject)
    {
      boolean bool = paramObject instanceof Integer;
      int i = -1;
      if (!bool) {
        return -1;
      }
      int j = ((Integer)paramObject).intValue() - firstPeriodId;
      int k = i;
      if (j >= 0) {
        if (j >= getPeriodCount()) {
          k = i;
        } else {
          k = j;
        }
      }
      return k;
    }
    
    public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
    {
      Assertions.checkIndex(paramInt, 0, getPeriodCount());
      Integer localInteger = null;
      String str;
      if (paramBoolean) {
        str = manifest.getPeriod(paramInt).id;
      } else {
        str = null;
      }
      if (paramBoolean) {
        localInteger = Integer.valueOf(firstPeriodId + paramInt);
      }
      return paramPeriod.set(str, localInteger, 0, manifest.getPeriodDurationUs(paramInt), C.msToUs(manifest.getPeriod(paramInt).startMs - manifest.getPeriod(0).startMs) - offsetInFirstPeriodUs);
    }
    
    public int getPeriodCount()
    {
      return manifest.getPeriodCount();
    }
    
    public Object getUidOfPeriod(int paramInt)
    {
      Assertions.checkIndex(paramInt, 0, getPeriodCount());
      return Integer.valueOf(firstPeriodId + paramInt);
    }
    
    public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
    {
      Assertions.checkIndex(paramInt, 0, 1);
      paramLong = getAdjustedWindowDefaultStartPositionUs(paramLong);
      Object localObject;
      if (paramBoolean) {
        localObject = windowTag;
      } else {
        localObject = null;
      }
      return paramWindow.set(localObject, presentationStartTimeMs, windowStartTimeMs, true, manifest.dynamic, paramLong, windowDurationUs, 0, getPeriodCount() - 1, offsetInFirstPeriodUs);
    }
    
    public int getWindowCount()
    {
      return 1;
    }
  }
  
  public final class DefaultPlayerEmsgCallback
    implements PlayerEmsgHandler.PlayerEmsgCallback
  {
    private DefaultPlayerEmsgCallback() {}
    
    public void onDashLiveMediaPresentationEndSignalEncountered()
    {
      DashMediaSource.this.onDashLiveMediaPresentationEndSignalEncountered();
    }
    
    public void onDashManifestPublishTimeExpired(long paramLong)
    {
      DashMediaSource.this.onDashManifestPublishTimeExpired(paramLong);
    }
    
    public void onDashManifestRefreshRequested()
    {
      DashMediaSource.this.onDashManifestRefreshRequested();
    }
  }
  
  public static final class Factory
    implements AdsMediaSource.MediaSourceFactory
  {
    private final DashChunkSource.Factory chunkSourceFactory;
    private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private boolean isCreateCalled;
    private long livePresentationDelayMs;
    private boolean livePresentationDelayOverridesManifest;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    private final DataSource.Factory manifestDataSourceFactory;
    @Nullable
    private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    @Nullable
    private Object tag;
    
    public Factory(DashChunkSource.Factory paramFactory, @Nullable DataSource.Factory paramFactory1)
    {
      chunkSourceFactory = ((DashChunkSource.Factory)Assertions.checkNotNull(paramFactory));
      manifestDataSourceFactory = paramFactory1;
      loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
      livePresentationDelayMs = 30000L;
      compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
    }
    
    public Factory(DataSource.Factory paramFactory)
    {
      this(new DefaultDashChunkSource.Factory(paramFactory), paramFactory);
    }
    
    public DashMediaSource createMediaSource(Uri paramUri)
    {
      isCreateCalled = true;
      if (manifestParser == null) {
        manifestParser = new DashManifestParser();
      }
      return new DashMediaSource(null, (Uri)Assertions.checkNotNull(paramUri), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, livePresentationDelayOverridesManifest, tag, null);
    }
    
    @Deprecated
    public DashMediaSource createMediaSource(Uri paramUri, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramUri = createMediaSource(paramUri);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramUri;
    }
    
    public DashMediaSource createMediaSource(DashManifest paramDashManifest)
    {
      Assertions.checkArgument(dynamic ^ true);
      isCreateCalled = true;
      return new DashMediaSource(paramDashManifest, null, null, null, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, livePresentationDelayOverridesManifest, tag, null);
    }
    
    @Deprecated
    public DashMediaSource createMediaSource(DashManifest paramDashManifest, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramDashManifest = createMediaSource(paramDashManifest);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramDashManifest.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramDashManifest;
    }
    
    public int[] getSupportedTypes()
    {
      return new int[] { 0 };
    }
    
    public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory)Assertions.checkNotNull(paramCompositeSequenceableLoaderFactory));
      return this;
    }
    
    @Deprecated
    public Factory setLivePresentationDelayMs(long paramLong)
    {
      if (paramLong == -1L) {
        return setLivePresentationDelayMs(30000L, false);
      }
      return setLivePresentationDelayMs(paramLong, true);
    }
    
    public Factory setLivePresentationDelayMs(long paramLong, boolean paramBoolean)
    {
      Assertions.checkState(isCreateCalled ^ true);
      livePresentationDelayMs = paramLong;
      livePresentationDelayOverridesManifest = paramBoolean;
      return this;
    }
    
    public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy)
    {
      Assertions.checkState(isCreateCalled ^ true);
      loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
      return this;
    }
    
    public Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> paramParser)
    {
      Assertions.checkState(isCreateCalled ^ true);
      manifestParser = ((ParsingLoadable.Parser)Assertions.checkNotNull(paramParser));
      return this;
    }
    
    @Deprecated
    public Factory setMinLoadableRetryCount(int paramInt)
    {
      return setLoadErrorHandlingPolicy(new DefaultLoadErrorHandlingPolicy(paramInt));
    }
    
    public Factory setTag(Object paramObject)
    {
      Assertions.checkState(isCreateCalled ^ true);
      tag = paramObject;
      return this;
    }
  }
  
  public static final class Iso8601Parser
    implements ParsingLoadable.Parser<Long>
  {
    private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
    
    public Long parse(Uri paramUri, InputStream paramInputStream)
      throws IOException
    {
      paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream, Charset.forName("UTF-8"))).readLine();
      try
      {
        paramUri = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(paramInputStream);
        if (paramUri.matches())
        {
          localObject = paramUri.group(1);
          paramInputStream = new java/text/SimpleDateFormat;
          paramInputStream.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
          paramInputStream.setTimeZone(TimeZone.getTimeZone("UTC"));
          long l1 = paramInputStream.parse((String)localObject).getTime();
          long l2;
          if ("Z".equals(paramUri.group(2)))
          {
            l2 = l1;
          }
          else
          {
            if ("+".equals(paramUri.group(4))) {
              l2 = 1L;
            } else {
              l2 = -1L;
            }
            long l3 = Long.parseLong(paramUri.group(5));
            paramUri = paramUri.group(7);
            long l4;
            if (TextUtils.isEmpty(paramUri)) {
              l4 = 0L;
            } else {
              l4 = Long.parseLong(paramUri);
            }
            l2 = l1 - (l3 * 60L + l4) * 60L * 1000L * l2;
          }
          return Long.valueOf(l2);
        }
        paramUri = new com/google/android/exoplayer2/ParserException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Couldn't parse timestamp: ");
        ((StringBuilder)localObject).append(paramInputStream);
        paramUri.<init>(((StringBuilder)localObject).toString());
        throw paramUri;
      }
      catch (ParseException paramUri)
      {
        throw new ParserException(paramUri);
      }
    }
  }
  
  public final class ManifestCallback
    implements Loader.Callback<ParsingLoadable<DashManifest>>
  {
    private ManifestCallback() {}
    
    public void onLoadCanceled(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      onLoadCanceled(paramParsingLoadable, paramLong1, paramLong2);
    }
    
    public void onLoadCompleted(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2)
    {
      onManifestLoadCompleted(paramParsingLoadable, paramLong1, paramLong2);
    }
    
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      return onManifestLoadError(paramParsingLoadable, paramLong1, paramLong2, paramIOException);
    }
  }
  
  public final class ManifestLoadErrorThrower
    implements LoaderErrorThrower
  {
    public ManifestLoadErrorThrower() {}
    
    private void maybeThrowManifestError()
      throws IOException
    {
      if (DashMediaSource.access$600(DashMediaSource.this) == null) {
        return;
      }
      throw DashMediaSource.access$600(DashMediaSource.this);
    }
    
    public void maybeThrowError()
      throws IOException
    {
      DashMediaSource.access$500(DashMediaSource.this).maybeThrowError();
      maybeThrowManifestError();
    }
    
    public void maybeThrowError(int paramInt)
      throws IOException
    {
      DashMediaSource.access$500(DashMediaSource.this).maybeThrowError(paramInt);
      maybeThrowManifestError();
    }
  }
  
  public static final class PeriodSeekInfo
  {
    public final long availableEndTimeUs;
    public final long availableStartTimeUs;
    public final boolean isIndexExplicit;
    
    private PeriodSeekInfo(boolean paramBoolean, long paramLong1, long paramLong2)
    {
      isIndexExplicit = paramBoolean;
      availableStartTimeUs = paramLong1;
      availableEndTimeUs = paramLong2;
    }
    
    public static PeriodSeekInfo createPeriodSeekInfo(Period paramPeriod, long paramLong)
    {
      int i = adaptationSets.size();
      int j = 0;
      while (j < i)
      {
        k = adaptationSets.get(j)).type;
        if ((k != 1) && (k != 2))
        {
          j++;
        }
        else
        {
          k = 1;
          break label68;
        }
      }
      int k = 0;
      label68:
      long l1 = Long.MAX_VALUE;
      int m = 0;
      j = m;
      int n = j;
      long l2 = 0L;
      while (m < i)
      {
        Object localObject = (AdaptationSet)adaptationSets.get(m);
        if ((k == 0) || (type != 3))
        {
          int i2;
          int i3;
          int i1;
          do
          {
            localObject = ((Representation)representations.get(0)).getIndex();
            if (localObject == null) {
              return new PeriodSeekInfo(true, 0L, paramLong);
            }
            i2 = j | ((DashSegmentIndex)localObject).isExplicit();
            i3 = ((DashSegmentIndex)localObject).getSegmentCount(paramLong);
            if (i3 == 0)
            {
              l1 = 0L;
              l2 = 0L;
              i1 = 1;
              j = i2;
              break;
            }
            j = i2;
          } while (i1 != 0);
          long l3 = ((DashSegmentIndex)localObject).getFirstSegmentNum();
          l2 = Math.max(l2, ((DashSegmentIndex)localObject).getTimeUs(l3));
          if (i3 != -1)
          {
            l3 = l3 + i3 - 1L;
            long l4 = ((DashSegmentIndex)localObject).getTimeUs(l3);
            l1 = Math.min(l1, ((DashSegmentIndex)localObject).getDurationUs(l3, paramLong) + l4);
            j = i2;
          }
          else
          {
            j = i2;
          }
        }
        m++;
      }
      return new PeriodSeekInfo(j, l2, l1);
    }
  }
  
  public final class UtcTimestampCallback
    implements Loader.Callback<ParsingLoadable<Long>>
  {
    private UtcTimestampCallback() {}
    
    public void onLoadCanceled(ParsingLoadable<Long> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      onLoadCanceled(paramParsingLoadable, paramLong1, paramLong2);
    }
    
    public void onLoadCompleted(ParsingLoadable<Long> paramParsingLoadable, long paramLong1, long paramLong2)
    {
      onUtcTimestampLoadCompleted(paramParsingLoadable, paramLong1, paramLong2);
    }
    
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      return onUtcTimestampLoadError(paramParsingLoadable, paramLong1, paramLong2, paramIOException);
    }
  }
  
  public static final class XsDateTimeParser
    implements ParsingLoadable.Parser<Long>
  {
    public Long parse(Uri paramUri, InputStream paramInputStream)
      throws IOException
    {
      return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(paramInputStream)).readLine()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
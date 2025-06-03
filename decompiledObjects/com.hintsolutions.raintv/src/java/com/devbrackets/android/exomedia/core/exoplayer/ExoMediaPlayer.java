/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  android.view.Surface
 *  androidx.annotation.FloatRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.Size
 *  androidx.collection.ArrayMap
 *  com.google.android.exoplayer2.C
 *  com.google.android.exoplayer2.DefaultLoadControl
 *  com.google.android.exoplayer2.ExoPlaybackException
 *  com.google.android.exoplayer2.ExoPlayer
 *  com.google.android.exoplayer2.ExoPlayerFactory
 *  com.google.android.exoplayer2.Format
 *  com.google.android.exoplayer2.LoadControl
 *  com.google.android.exoplayer2.PlaybackParameters
 *  com.google.android.exoplayer2.Player
 *  com.google.android.exoplayer2.Player$DefaultEventListener
 *  com.google.android.exoplayer2.Player$EventListener
 *  com.google.android.exoplayer2.PlayerMessage
 *  com.google.android.exoplayer2.PlayerMessage$Target
 *  com.google.android.exoplayer2.Renderer
 *  com.google.android.exoplayer2.Timeline
 *  com.google.android.exoplayer2.Timeline$Window
 *  com.google.android.exoplayer2.analytics.AnalyticsCollector
 *  com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory
 *  com.google.android.exoplayer2.analytics.AnalyticsListener
 *  com.google.android.exoplayer2.audio.AudioAttributes$Builder
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener
 *  com.google.android.exoplayer2.decoder.DecoderCounters
 *  com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
 *  com.google.android.exoplayer2.drm.DefaultDrmSessionManager
 *  com.google.android.exoplayer2.drm.DrmSessionManager
 *  com.google.android.exoplayer2.drm.ExoMediaDrm
 *  com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest
 *  com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest
 *  com.google.android.exoplayer2.drm.FrameworkMediaCrypto
 *  com.google.android.exoplayer2.drm.FrameworkMediaDrm
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.metadata.Metadata
 *  com.google.android.exoplayer2.metadata.MetadataOutput
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.TrackGroup
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  com.google.android.exoplayer2.text.Cue
 *  com.google.android.exoplayer2.text.TextOutput
 *  com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride
 *  com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo
 *  com.google.android.exoplayer2.trackselection.TrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.TrackSelector
 *  com.google.android.exoplayer2.upstream.BandwidthMeter
 *  com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  com.google.android.exoplayer2.util.Clock
 *  com.google.android.exoplayer2.util.Util
 *  com.google.android.exoplayer2.video.VideoRendererEventListener
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.devbrackets.android.exomedia.core.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.collection.ArrayMap;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.ExoPlayerListener;
import com.devbrackets.android.exomedia.core.listener.InternalErrorListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.renderer.RendererProvider;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.util.Repeater;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExoMediaPlayer
extends Player.DefaultEventListener {
    private static final int BUFFER_REPEAT_DELAY = 1000;
    private static final String TAG = "ExoMediaPlayer";
    private static final int WAKE_LOCK_TIMEOUT = 1000;
    @NonNull
    private final AdaptiveTrackSelection.Factory adaptiveTrackSelectionFactory;
    @NonNull
    private AnalyticsCollector analyticsCollector;
    private int audioSessionId = 0;
    @NonNull
    private DefaultBandwidthMeter bandwidthMeter;
    @NonNull
    private Repeater bufferRepeater;
    @Nullable
    private OnBufferUpdateListener bufferUpdateListener;
    @NonNull
    private CapabilitiesListener capabilitiesListener;
    @Nullable
    private CaptionListener captionListener;
    @NonNull
    private final Context context;
    @Nullable
    private MediaDrmCallback drmCallback;
    @Nullable
    private InternalErrorListener internalErrorListener;
    @NonNull
    private final CopyOnWriteArrayList<ExoPlayerListener> listeners = new CopyOnWriteArrayList();
    @NonNull
    private final Handler mainHandler;
    @Nullable
    private MediaSource mediaSource;
    @Nullable
    private MetadataListener metadataListener;
    @NonNull
    private final ExoPlayer player;
    private boolean prepared = false;
    @NonNull
    private List<Renderer> renderers;
    @FloatRange(from=0.0, to=1.0)
    public float requestedVolume = 1.0f;
    @NonNull
    private StateStore stateStore;
    @NonNull
    private final AtomicBoolean stopped = new AtomicBoolean();
    @Nullable
    private Surface surface;
    @NonNull
    private final DefaultTrackSelector trackSelector;
    @Nullable
    private PowerManager.WakeLock wakeLock = null;

    public ExoMediaPlayer(@NonNull Context object) {
        this.stateStore = new StateStore(null);
        this.bufferRepeater = new Repeater();
        this.bandwidthMeter = new DefaultBandwidthMeter();
        this.capabilitiesListener = new CapabilitiesListener(this, null);
        this.context = object;
        this.bufferRepeater.setRepeaterDelay(1000);
        this.bufferRepeater.setRepeatListener(new BufferRepeatListener(this, null));
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager = new DrmSessionManager<FrameworkMediaCrypto>();
        this.mainHandler = drmSessionManager;
        ComponentListener componentListener = new ComponentListener(this, null);
        object = new RendererProvider((Context)object, (Handler)drmSessionManager, componentListener, componentListener, componentListener, componentListener);
        drmSessionManager = this.generateDrmSessionManager();
        ((RendererProvider)object).setDrmSessionManager(drmSessionManager);
        this.renderers = ((RendererProvider)object).generate();
        object = new AdaptiveTrackSelection.Factory((BandwidthMeter)this.bandwidthMeter);
        this.adaptiveTrackSelectionFactory = object;
        componentListener = new DefaultTrackSelector((TrackSelection.Factory)object);
        this.trackSelector = componentListener;
        object = ExoMedia.Data.loadControl != null ? ExoMedia.Data.loadControl : new DefaultLoadControl();
        List<Renderer> list = this.renderers;
        object = ExoPlayerFactory.newInstance((Renderer[])((Renderer[])list.toArray((Object[])new Renderer[list.size()])), (TrackSelector)componentListener, (LoadControl)object);
        this.player = object;
        object.addListener((Player.EventListener)this);
        componentListener = new AnalyticsCollector.Factory().createAnalyticsCollector((Player)object, Clock.DEFAULT);
        this.analyticsCollector = componentListener;
        object.addListener((Player.EventListener)componentListener);
        this.setupDamSessionManagerAnalytics(drmSessionManager);
    }

    public static /* synthetic */ int access$902(ExoMediaPlayer exoMediaPlayer, int n) {
        exoMediaPlayer.audioSessionId = n;
        return n;
    }

    private void reportPlayerState() {
        int n;
        boolean bl = this.player.getPlayWhenReady();
        int n2 = this.stateStore.getState(bl, n = this.getPlaybackState());
        if (n2 != this.stateStore.getMostRecentState()) {
            this.stateStore.setMostRecentState(bl, n);
            if (n2 == 3) {
                this.setBufferRepeaterStarted(true);
            } else if (n2 == 1 || n2 == 4) {
                this.setBufferRepeaterStarted(false);
            }
            boolean bl2 = this.stateStore.matchesHistory(new int[]{100, 2, 3}, true);
            boolean bl3 = this.stateStore.matchesHistory(new int[]{2, 100, 3}, true);
            boolean bl4 = this.stateStore.matchesHistory(new int[]{100, 3, 2, 3}, true);
            for (ExoPlayerListener exoPlayerListener : this.listeners) {
                exoPlayerListener.onStateChanged(bl, n);
                if (!(bl2 | bl3 | bl4)) continue;
                exoPlayerListener.onSeekComplete();
            }
        }
    }

    private void setBufferRepeaterStarted(boolean bl) {
        if (bl && this.bufferUpdateListener != null) {
            this.bufferRepeater.start();
        } else {
            this.bufferRepeater.stop();
        }
    }

    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener(analyticsListener);
    }

    public void addListener(ExoPlayerListener exoPlayerListener) {
        if (exoPlayerListener != null) {
            this.listeners.add((Object)exoPlayerListener);
        }
    }

    @Deprecated
    public void blockingClearSurface() {
        this.clearSurface();
    }

    public void blockingSendMessages(List<PlayerMessage> iterator) {
        iterator = iterator.iterator();
        boolean bl = false;
        block2: while (iterator.hasNext()) {
            PlayerMessage playerMessage = (PlayerMessage)iterator.next();
            boolean bl2 = true;
            boolean bl3 = bl;
            while (true) {
                bl = bl3;
                if (!bl2) continue block2;
                try {
                    playerMessage.blockUntilDelivered();
                    bl2 = false;
                }
                catch (InterruptedException interruptedException) {
                    bl3 = true;
                }
            }
        }
        if (bl) {
            Thread.currentThread().interrupt();
        }
    }

    public void clearSelectedTracks(@NonNull ExoMedia.RendererType rendererType) {
        ExoPlayerRendererTracksInfo exoPlayerRendererTracksInfo = this.getExoPlayerTracksInfo(rendererType, 0, this.trackSelector.getCurrentMappedTrackInfo());
        rendererType = this.trackSelector.buildUponParameters();
        exoPlayerRendererTracksInfo = exoPlayerRendererTracksInfo.rendererTrackIndexes.iterator();
        while (exoPlayerRendererTracksInfo.hasNext()) {
            int n = (Integer)exoPlayerRendererTracksInfo.next();
            rendererType.setRendererDisabled(n, false).clearSelectionOverrides(n);
        }
        this.trackSelector.setParameters((DefaultTrackSelector.ParametersBuilder)rendererType);
    }

    public void clearSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
        this.sendMessage(2, 1, null, false);
    }

    public void forcePrepare() {
        this.prepared = false;
    }

    @Nullable
    public DrmSessionManager<FrameworkMediaCrypto> generateDrmSessionManager() {
        UUID uUID = C.WIDEVINE_UUID;
        try {
            FrameworkMediaDrm frameworkMediaDrm = FrameworkMediaDrm.newInstance((UUID)uUID);
            DelegatedMediaDrmCallback delegatedMediaDrmCallback = new DelegatedMediaDrmCallback(this, null);
            DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uUID, (ExoMediaDrm)frameworkMediaDrm, (MediaDrmCallback)delegatedMediaDrmCallback, null);
            defaultDrmSessionManager.addListener(this.mainHandler, (DefaultDrmSessionEventListener)this.capabilitiesListener);
            return defaultDrmSessionManager;
        }
        catch (Exception exception) {
            Log.d((String)TAG, (String)"Unable to create a DrmSessionManager due to an exception", (Throwable)exception);
            return null;
        }
    }

    @NonNull
    public AnalyticsCollector getAnalyticsCollector() {
        return this.analyticsCollector;
    }

    public int getAudioSessionId() {
        return this.audioSessionId;
    }

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        if (this.getPlaybackState() == 1) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
        if (mappedTrackInfo == null) {
            return arrayMap;
        }
        ExoMedia.RendererType rendererType = ExoMedia.RendererType.AUDIO;
        ExoMedia.RendererType rendererType2 = ExoMedia.RendererType.VIDEO;
        ExoMedia.RendererType rendererType3 = ExoMedia.RendererType.CLOSED_CAPTION;
        ExoMedia.RendererType rendererType4 = ExoMedia.RendererType.METADATA;
        for (int j = 0; j < 4; ++j) {
            ExoMedia.RendererType rendererType5 = (new ExoMedia.RendererType[]{rendererType, rendererType2, rendererType3, rendererType4})[j];
            ArrayList arrayList = new ArrayList();
            Iterator iterator = this.getExoPlayerTracksInfo((ExoMedia.RendererType)rendererType5, (int)0, (MappingTrackSelector.MappedTrackInfo)mappedTrackInfo).rendererTrackIndexes.iterator();
            while (iterator.hasNext()) {
                TrackGroupArray trackGroupArray = mappedTrackInfo.getTrackGroups(((Integer)iterator.next()).intValue());
                for (int k = 0; k < trackGroupArray.length; ++k) {
                    arrayList.add((Object)trackGroupArray.get(k));
                }
            }
            if (arrayList.isEmpty()) continue;
            arrayMap.put((Object)rendererType5, (Object)new TrackGroupArray((TrackGroup[])arrayList.toArray((Object[])new TrackGroup[arrayList.size()])));
        }
        return arrayMap;
    }

    @NonNull
    public BandwidthMeter getBandwidthMeter() {
        return this.bandwidthMeter;
    }

    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    public long getCurrentPosition() {
        return this.getCurrentPosition(false);
    }

    public long getCurrentPosition(boolean bl) {
        long l = this.player.getCurrentPosition();
        if (bl) {
            return l;
        }
        Timeline timeline = this.player.getCurrentTimeline();
        int n = Math.min((int)(timeline.getWindowCount() - 1), (int)this.player.getCurrentWindowIndex());
        long l2 = 0L;
        Timeline.Window window = new Timeline.Window();
        for (int j = 0; j < n; ++j) {
            timeline.getWindow(j, window);
            l2 += window.getDurationMs();
        }
        return l2 + l;
    }

    public long getDuration() {
        return this.player.getDuration();
    }

    public ExoMedia.RendererType getExoMediaRendererType(int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        return null;
                    }
                    return ExoMedia.RendererType.METADATA;
                }
                return ExoMedia.RendererType.CLOSED_CAPTION;
            }
            return ExoMedia.RendererType.VIDEO;
        }
        return ExoMedia.RendererType.AUDIO;
    }

    @NonNull
    public ExoPlayer getExoPlayer() {
        return this.player;
    }

    public int getExoPlayerTrackType(@NonNull ExoMedia.RendererType rendererType) {
        int n = 1.$SwitchMap$com$devbrackets$android$exomedia$ExoMedia$RendererType[rendererType.ordinal()];
        int n2 = 1;
        if (n != 1) {
            n2 = 2;
            if (n != 2) {
                n2 = 3;
                if (n != 3) {
                    n2 = 4;
                    if (n != 4) {
                        return -1;
                    }
                }
            }
        }
        return n2;
    }

    public ExoPlayerRendererTracksInfo getExoPlayerTracksInfo(@NonNull ExoMedia.RendererType rendererType, int n, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        int n2;
        ArrayList arrayList = new ArrayList();
        int n3 = -1;
        if (mappedTrackInfo != null) {
            int n4 = -1;
            n2 = -1;
            int n6 = 0;
            for (n3 = 0; n3 < mappedTrackInfo.getRendererCount(); ++n3) {
                int n7 = n6;
                int n8 = n4;
                int n9 = n2;
                if (rendererType == this.getExoMediaRendererType(mappedTrackInfo.getRendererType(n3))) {
                    arrayList.add((Object)n3);
                    n8 = mappedTrackInfo.getTrackGroups((int)n3).length;
                    if (n6 + n8 > n) {
                        n7 = n6;
                        n8 = n4;
                        n9 = n2;
                        if (n4 == -1) {
                            n9 = n - n6;
                            n8 = n3;
                            n7 = n6;
                        }
                    } else {
                        n7 = n6 + n8;
                        n9 = n2;
                        n8 = n4;
                    }
                }
                n6 = n7;
                n4 = n8;
                n2 = n9;
            }
            n = n4;
        } else {
            n2 = -1;
            n = n3;
        }
        return new ExoPlayerRendererTracksInfo(this, (List<Integer>)arrayList, n, n2);
    }

    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    public float getPlaybackSpeed() {
        return this.player.getPlaybackParameters().speed;
    }

    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType) {
        return this.getSelectedTrackIndex(rendererType, 0);
    }

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
        ExoPlayerRendererTracksInfo exoPlayerRendererTracksInfo = this.getExoPlayerTracksInfo(rendererType, n, mappedTrackInfo);
        n = exoPlayerRendererTracksInfo.rendererTrackIndex;
        rendererType = n == -1 ? null : mappedTrackInfo.getTrackGroups(n);
        if (rendererType != null && ((TrackGroupArray)rendererType).length != 0 && (rendererType = this.trackSelector.getParameters().getSelectionOverride(exoPlayerRendererTracksInfo.rendererTrackIndex, (TrackGroupArray)rendererType)) != null && ((DefaultTrackSelector.SelectionOverride)rendererType).groupIndex == exoPlayerRendererTracksInfo.rendererTrackGroupIndex && ((DefaultTrackSelector.SelectionOverride)rendererType).length > 0) {
            return ((DefaultTrackSelector.SelectionOverride)rendererType).tracks[0];
        }
        return -1;
    }

    @Nullable
    public Surface getSurface() {
        return this.surface;
    }

    @FloatRange(from=0.0, to=1.0)
    public float getVolume() {
        return this.requestedVolume;
    }

    @Nullable
    public WindowInfo getWindowInfo() {
        Timeline timeline = this.player.getCurrentTimeline();
        if (timeline.isEmpty()) {
            return null;
        }
        int n = this.player.getCurrentWindowIndex();
        timeline = timeline.getWindow(n, new Timeline.Window(), true);
        return new WindowInfo(this.player.getPreviousWindowIndex(), n, this.player.getNextWindowIndex(), (Timeline.Window)timeline);
    }

    public boolean isRendererEnabled(@NonNull ExoMedia.RendererType rendererType) {
        ExoPlayerRendererTracksInfo exoPlayerRendererTracksInfo = this.getExoPlayerTracksInfo(rendererType, 0, this.trackSelector.getCurrentMappedTrackInfo());
        rendererType = this.trackSelector.getParameters();
        exoPlayerRendererTracksInfo = exoPlayerRendererTracksInfo.rendererTrackIndexes.iterator();
        while (exoPlayerRendererTracksInfo.hasNext()) {
            if (rendererType.getRendererDisabled((Integer)exoPlayerRendererTracksInfo.next())) continue;
            return true;
        }
        return false;
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        Iterator iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            ((ExoPlayerListener)iterator.next()).onError(this, (Exception)exoPlaybackException);
        }
    }

    public void onPlayerStateChanged(boolean bl, int n) {
        this.reportPlayerState();
    }

    public void prepare() {
        if (!this.prepared && this.mediaSource != null) {
            if (!this.renderers.isEmpty()) {
                this.player.stop();
            }
            this.stateStore.reset();
            this.player.prepare(this.mediaSource);
            this.prepared = true;
            this.stopped.set(false);
        }
    }

    public void release() {
        this.setBufferRepeaterStarted(false);
        this.listeners.clear();
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            mediaSource.removeEventListener((MediaSourceEventListener)this.analyticsCollector);
        }
        this.surface = null;
        this.player.release();
        this.stayAwake(false);
    }

    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.removeListener(analyticsListener);
    }

    public void removeListener(ExoPlayerListener exoPlayerListener) {
        if (exoPlayerListener != null) {
            this.listeners.remove((Object)exoPlayerListener);
        }
    }

    public boolean restart() {
        int n = this.getPlaybackState();
        if (n != 1 && n != 4) {
            return false;
        }
        this.seekTo(0L);
        this.setPlayWhenReady(true);
        this.forcePrepare();
        this.prepare();
        return true;
    }

    public void seekTo(long l) {
        this.seekTo(l, false);
    }

    public void seekTo(long l, boolean bl) {
        this.analyticsCollector.notifySeekStarted();
        if (bl) {
            this.player.seekTo(l);
            StateStore stateStore = this.stateStore;
            stateStore.setMostRecentState(stateStore.isLastReportedPlayWhenReady(), 100);
            return;
        }
        Object object = this.player.getCurrentTimeline();
        int n = object.getWindowCount();
        long l2 = 0L;
        Timeline.Window window = new Timeline.Window();
        for (int j = 0; j < n; ++j) {
            object.getWindow(j, window);
            long l3 = window.getDurationMs();
            if (l2 < l && l <= l2 + l3) {
                this.player.seekTo(j, l - l2);
                object = this.stateStore;
                ((StateStore)object).setMostRecentState(((StateStore)object).isLastReportedPlayWhenReady(), 100);
                return;
            }
            l2 += l3;
        }
        Log.e((String)TAG, (String)"Unable to seek across windows, falling back to in-window seeking");
        this.player.seekTo(l);
        object = this.stateStore;
        ((StateStore)object).setMostRecentState(((StateStore)object).isLastReportedPlayWhenReady(), 100);
    }

    public void sendMessage(int n, int n2, Object object) {
        this.sendMessage(n, n2, object, false);
    }

    public void sendMessage(int n, int n2, Object object, boolean bl) {
        if (this.renderers.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() != n) continue;
            arrayList.add((Object)this.player.createMessage((PlayerMessage.Target)renderer).setType(n2).setPayload(object));
        }
        if (bl) {
            this.blockingSendMessages((List<PlayerMessage>)arrayList);
        } else {
            object = arrayList.iterator();
            while (object.hasNext()) {
                ((PlayerMessage)object.next()).send();
            }
        }
    }

    public void setAudioStreamType(int n) {
        int n2 = Util.getAudioUsageForStreamType((int)n);
        n = Util.getAudioContentTypeForStreamType((int)n);
        this.sendMessage(1, 3, new AudioAttributes.Builder().setUsage(n2).setContentType(n).build());
    }

    public void setBufferUpdateListener(@Nullable OnBufferUpdateListener onBufferUpdateListener) {
        this.bufferUpdateListener = onBufferUpdateListener;
        boolean bl = onBufferUpdateListener != null;
        this.setBufferRepeaterStarted(bl);
    }

    public void setCaptionListener(@Nullable CaptionListener captionListener) {
        this.captionListener = captionListener;
    }

    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.drmCallback = mediaDrmCallback;
    }

    public void setInternalErrorListener(@Nullable InternalErrorListener internalErrorListener) {
        this.internalErrorListener = internalErrorListener;
    }

    public void setMediaSource(@Nullable MediaSource mediaSource) {
        MediaSource mediaSource2 = this.mediaSource;
        if (mediaSource2 != null) {
            mediaSource2.removeEventListener((MediaSourceEventListener)this.analyticsCollector);
            this.analyticsCollector.resetForNewMediaSource();
        }
        if (mediaSource != null) {
            mediaSource.addEventListener(this.mainHandler, (MediaSourceEventListener)this.analyticsCollector);
        }
        this.mediaSource = mediaSource;
        this.prepared = false;
        this.prepare();
    }

    public void setMetadataListener(@Nullable MetadataListener metadataListener) {
        this.metadataListener = metadataListener;
    }

    public void setPlayWhenReady(boolean bl) {
        this.player.setPlayWhenReady(bl);
        this.stayAwake(bl);
    }

    public boolean setPlaybackSpeed(float f2) {
        PlaybackParameters playbackParameters = new PlaybackParameters(f2, 1.0f);
        this.player.setPlaybackParameters(playbackParameters);
        return true;
    }

    public void setRendererEnabled(@NonNull ExoMedia.RendererType rendererType, boolean bl) {
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
        ExoPlayerRendererTracksInfo exoPlayerRendererTracksInfo = this.getExoPlayerTracksInfo(rendererType, 0, mappedTrackInfo);
        if (!exoPlayerRendererTracksInfo.rendererTrackIndexes.isEmpty()) {
            rendererType = this.trackSelector.buildUponParameters();
            Iterator iterator = exoPlayerRendererTracksInfo.rendererTrackIndexes.iterator();
            boolean bl2 = false;
            while (iterator.hasNext()) {
                int n = (Integer)iterator.next();
                if (bl) {
                    if (this.trackSelector.getParameters().getSelectionOverride(n, mappedTrackInfo.getTrackGroups(n)) == null) continue;
                    rendererType.setRendererDisabled(n, false);
                    bl2 = true;
                    continue;
                }
                rendererType.setRendererDisabled(n, true);
            }
            if (bl && !bl2) {
                rendererType.setRendererDisabled((Integer)exoPlayerRendererTracksInfo.rendererTrackIndexes.get(0), false);
            }
            this.trackSelector.setParameters((DefaultTrackSelector.ParametersBuilder)rendererType);
        }
    }

    public void setRepeatMode(int n) {
        this.player.setRepeatMode(n);
    }

    @Deprecated
    public void setSelectedTrack(@NonNull ExoMedia.RendererType rendererType, int n) {
        this.setSelectedTrack(rendererType, 0, n);
    }

    public void setSelectedTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
        int n3;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
        ExoPlayerRendererTracksInfo exoPlayerRendererTracksInfo = this.getExoPlayerTracksInfo(rendererType, n, mappedTrackInfo);
        n = exoPlayerRendererTracksInfo.rendererTrackIndex;
        rendererType = n != -1 && mappedTrackInfo != null ? mappedTrackInfo.getTrackGroups(n) : null;
        if (rendererType != null && (n = ((TrackGroupArray)rendererType).length) != 0 && n > (n3 = exoPlayerRendererTracksInfo.rendererTrackGroupIndex) && (mappedTrackInfo = rendererType.get(n3)) != null && mappedTrackInfo.length > n2) {
            mappedTrackInfo = this.trackSelector.buildUponParameters();
            Iterator iterator = exoPlayerRendererTracksInfo.rendererTrackIndexes.iterator();
            while (iterator.hasNext()) {
                n = (Integer)iterator.next();
                mappedTrackInfo.clearSelectionOverrides(n);
                if (exoPlayerRendererTracksInfo.rendererTrackIndex == n) {
                    mappedTrackInfo.setSelectionOverride(n, (TrackGroupArray)rendererType, new DefaultTrackSelector.SelectionOverride(exoPlayerRendererTracksInfo.rendererTrackGroupIndex, new int[]{n2}));
                    mappedTrackInfo.setRendererDisabled(n, false);
                    continue;
                }
                mappedTrackInfo.setRendererDisabled(n, true);
            }
            this.trackSelector.setParameters((DefaultTrackSelector.ParametersBuilder)mappedTrackInfo);
        }
    }

    public void setSurface(@Nullable Surface surface) {
        this.surface = surface;
        this.sendMessage(2, 1, surface, false);
    }

    public void setUri(@Nullable Uri object) {
        object = object != null ? ExoMedia.Data.mediaSourceProvider.generate(this.context, this.mainHandler, (Uri)object, (TransferListener)this.bandwidthMeter) : null;
        this.setMediaSource((MediaSource)object);
    }

    public void setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        this.requestedVolume = f2;
        this.sendMessage(1, 2, Float.valueOf((float)f2));
    }

    public void setWakeMode(Context context, int n) {
        boolean bl;
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                bl = true;
                this.wakeLock.release();
            } else {
                bl = false;
            }
            this.wakeLock = null;
        } else {
            bl = false;
        }
        if (context.getPackageManager().checkPermission("android.permission.WAKE_LOCK", context.getPackageName()) == 0) {
            if ((context = (PowerManager)context.getSystemService("power")) != null) {
                context = context.newWakeLock(n | 0x20000000, ExoMediaPlayer.class.getName());
                this.wakeLock = context;
                context.setReferenceCounted(false);
            } else {
                Log.e((String)TAG, (String)"Unable to acquire WAKE_LOCK due to a null power manager");
            }
        } else {
            Log.w((String)TAG, (String)"Unable to acquire WAKE_LOCK due to missing manifest permission");
        }
        this.stayAwake(bl);
    }

    public void setupDamSessionManagerAnalytics(DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        if (drmSessionManager instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager)drmSessionManager).addListener(this.mainHandler, (DefaultDrmSessionEventListener)this.analyticsCollector);
        }
    }

    public void stayAwake(boolean bl) {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            return;
        }
        if (bl && !wakeLock.isHeld()) {
            this.wakeLock.acquire(1000L);
        } else if (!bl && this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }

    public void stop() {
        if (!this.stopped.getAndSet(true)) {
            this.player.setPlayWhenReady(false);
            this.player.stop();
        }
    }

    public class BufferRepeatListener
    implements Repeater.RepeatListener {
        public final ExoMediaPlayer this$0;

        private BufferRepeatListener(ExoMediaPlayer exoMediaPlayer) {
            this.this$0 = exoMediaPlayer;
        }

        public /* synthetic */ BufferRepeatListener(ExoMediaPlayer exoMediaPlayer, 1 var2_2) {
            this(exoMediaPlayer);
        }

        @Override
        public void onRepeat() {
            if (this.this$0.bufferUpdateListener != null) {
                this.this$0.bufferUpdateListener.onBufferingUpdate(this.this$0.getBufferedPercentage());
            }
        }
    }

    public class CapabilitiesListener
    implements DefaultDrmSessionEventListener {
        public final ExoMediaPlayer this$0;

        private CapabilitiesListener(ExoMediaPlayer exoMediaPlayer) {
            this.this$0 = exoMediaPlayer;
        }

        public /* synthetic */ CapabilitiesListener(ExoMediaPlayer exoMediaPlayer, 1 var2_2) {
            this(exoMediaPlayer);
        }

        public void onDrmKeysLoaded() {
        }

        public void onDrmKeysRemoved() {
        }

        public void onDrmKeysRestored() {
        }

        public void onDrmSessionManagerError(Exception exception) {
            if (this.this$0.internalErrorListener != null) {
                this.this$0.internalErrorListener.onDrmSessionManagerError(exception);
            }
        }
    }

    public class ComponentListener
    implements VideoRendererEventListener,
    AudioRendererEventListener,
    TextOutput,
    MetadataOutput {
        public final ExoMediaPlayer this$0;

        private ComponentListener(ExoMediaPlayer exoMediaPlayer) {
            this.this$0 = exoMediaPlayer;
        }

        public /* synthetic */ ComponentListener(ExoMediaPlayer exoMediaPlayer, 1 var2_2) {
            this(exoMediaPlayer);
        }

        public void onAudioDecoderInitialized(String string2, long l, long l2) {
            this.this$0.analyticsCollector.onAudioDecoderInitialized(string2, l, l2);
        }

        public void onAudioDisabled(DecoderCounters decoderCounters) {
            ExoMediaPlayer.access$902(this.this$0, 0);
            this.this$0.analyticsCollector.onAudioDisabled(decoderCounters);
        }

        public void onAudioEnabled(DecoderCounters decoderCounters) {
            this.this$0.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        public void onAudioInputFormatChanged(Format format) {
            this.this$0.analyticsCollector.onAudioInputFormatChanged(format);
        }

        public void onAudioSessionId(int n) {
            ExoMediaPlayer.access$902(this.this$0, n);
            this.this$0.analyticsCollector.onAudioSessionId(n);
        }

        public void onAudioSinkUnderrun(int n, long l, long l2) {
            if (this.this$0.internalErrorListener != null) {
                this.this$0.internalErrorListener.onAudioSinkUnderrun(n, l, l2);
            }
            this.this$0.analyticsCollector.onAudioSinkUnderrun(n, l, l2);
        }

        public void onCues(List<Cue> list) {
            if (this.this$0.captionListener != null) {
                this.this$0.captionListener.onCues(list);
            }
        }

        public void onDroppedFrames(int n, long l) {
            this.this$0.analyticsCollector.onDroppedFrames(n, l);
        }

        public void onMetadata(Metadata metadata) {
            if (this.this$0.metadataListener != null) {
                this.this$0.metadataListener.onMetadata(metadata);
            }
            this.this$0.analyticsCollector.onMetadata(metadata);
        }

        public void onRenderedFirstFrame(Surface surface) {
            this.this$0.analyticsCollector.onRenderedFirstFrame(surface);
        }

        public void onVideoDecoderInitialized(String string2, long l, long l2) {
            this.this$0.analyticsCollector.onVideoDecoderInitialized(string2, l, l2);
        }

        public void onVideoDisabled(DecoderCounters decoderCounters) {
            this.this$0.analyticsCollector.onVideoDisabled(decoderCounters);
        }

        public void onVideoEnabled(DecoderCounters decoderCounters) {
            this.this$0.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        public void onVideoInputFormatChanged(Format format) {
            this.this$0.analyticsCollector.onVideoInputFormatChanged(format);
        }

        public void onVideoSizeChanged(int n, int n2, int n3, float f2) {
            Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((ExoPlayerListener)iterator.next()).onVideoSizeChanged(n, n2, n3, f2);
            }
            this.this$0.analyticsCollector.onVideoSizeChanged(n, n2, n3, f2);
        }
    }

    public class DelegatedMediaDrmCallback
    implements MediaDrmCallback {
        public final ExoMediaPlayer this$0;

        private DelegatedMediaDrmCallback(ExoMediaPlayer exoMediaPlayer) {
            this.this$0 = exoMediaPlayer;
        }

        public /* synthetic */ DelegatedMediaDrmCallback(ExoMediaPlayer exoMediaPlayer, 1 var2_2) {
            this(exoMediaPlayer);
        }

        public byte[] executeKeyRequest(UUID object, ExoMediaDrm.KeyRequest keyRequest) throws Exception {
            object = this.this$0.drmCallback != null ? (Object)this.this$0.drmCallback.executeKeyRequest((UUID)object, keyRequest) : (Object)new byte[0];
            return object;
        }

        public byte[] executeProvisionRequest(UUID object, ExoMediaDrm.ProvisionRequest provisionRequest) throws Exception {
            object = this.this$0.drmCallback != null ? (Object)this.this$0.drmCallback.executeProvisionRequest((UUID)object, provisionRequest) : (Object)new byte[0];
            return object;
        }
    }

    public class ExoPlayerRendererTracksInfo {
        public final int rendererTrackGroupIndex;
        public final int rendererTrackIndex;
        public final List<Integer> rendererTrackIndexes;
        public final ExoMediaPlayer this$0;

        public ExoPlayerRendererTracksInfo(ExoMediaPlayer exoMediaPlayer, List<Integer> list, int n, int n2) {
            this.this$0 = exoMediaPlayer;
            this.rendererTrackIndexes = Collections.unmodifiableList(list);
            this.rendererTrackIndex = n;
            this.rendererTrackGroupIndex = n2;
        }
    }

    public static class StateStore {
        public static final int FLAG_PLAY_WHEN_READY = -268435456;
        public static final int STATE_SEEKING = 100;
        private int[] prevStates = new int[]{1, 1, 1, 1};

        private StateStore() {
        }

        public /* synthetic */ StateStore(1 var1_1) {
            this();
        }

        public int getMostRecentState() {
            return this.prevStates[3];
        }

        public int getState(boolean bl, int n) {
            int n2 = bl ? -268435456 : 0;
            return n2 | n;
        }

        public boolean isLastReportedPlayWhenReady() {
            boolean bl = (this.prevStates[3] & 0xF0000000) != 0;
            return bl;
        }

        public boolean matchesHistory(@Size(max=4L, min=1L) int[] nArray, boolean bl) {
            int n;
            int[] nArray2;
            int n2 = bl ? 0xFFFFFFF : -1;
            bl = true;
            for (int j = n = this.prevStates.length - nArray.length; j < (nArray2 = this.prevStates).length; ++j) {
                boolean bl2 = (nArray2[j] & n2) == (nArray[j - n] & n2);
                bl &= bl2;
            }
            return bl;
        }

        public void reset() {
            int[] nArray;
            for (int j = 0; j < (nArray = this.prevStates).length; ++j) {
                nArray[j] = 1;
            }
        }

        public void setMostRecentState(boolean bl, int n) {
            int[] nArray = this.prevStates;
            int n2 = nArray[3];
            int n3 = this.getState(bl, n);
            if (n2 == n3) {
                return;
            }
            nArray[0] = nArray[1];
            nArray[1] = nArray[2];
            nArray[2] = n2;
            nArray[3] = n;
        }
    }
}


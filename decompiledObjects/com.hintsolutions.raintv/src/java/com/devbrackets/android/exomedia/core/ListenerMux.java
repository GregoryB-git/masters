/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.os.Handler
 *  android.view.Surface
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.ExoPlaybackException
 *  com.google.android.exoplayer2.Format
 *  com.google.android.exoplayer2.PlaybackParameters
 *  com.google.android.exoplayer2.analytics.AnalyticsListener
 *  com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime
 *  com.google.android.exoplayer2.audio.AudioAttributes
 *  com.google.android.exoplayer2.decoder.DecoderCounters
 *  com.google.android.exoplayer2.metadata.Metadata
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  com.google.android.exoplayer2.trackselection.TrackSelectionArray
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package com.devbrackets.android.exomedia.core;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.exception.NativeMediaPlaybackException;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.listener.ExoPlayerListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class ListenerMux
implements ExoPlayerListener,
MediaPlayer.OnPreparedListener,
MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnBufferingUpdateListener,
MediaPlayer.OnSeekCompleteListener,
OnBufferUpdateListener,
MetadataListener,
AnalyticsListener {
    private static final long COMPLETED_DURATION_LEEWAY = 1000L;
    @Nullable
    private AnalyticsListener analyticsListener;
    @Nullable
    private OnBufferUpdateListener bufferUpdateListener;
    private boolean clearRequested = false;
    @NonNull
    private WeakReference<ClearableSurface> clearableSurfaceRef;
    @Nullable
    private OnCompletionListener completionListener;
    @NonNull
    private Handler delayedHandler = new Handler();
    @Nullable
    private OnErrorListener errorListener;
    @Nullable
    private MetadataListener metadataListener;
    @NonNull
    private Notifier muxNotifier;
    private boolean notifiedCompleted = false;
    private boolean notifiedPrepared = false;
    @Nullable
    private OnPreparedListener preparedListener;
    @Nullable
    private OnSeekCompletionListener seekCompletionListener;

    public ListenerMux(@NonNull Notifier notifier) {
        this.clearableSurfaceRef = new WeakReference(null);
        this.muxNotifier = notifier;
    }

    private void notifyCompletionListener() {
        if (!this.muxNotifier.shouldNotifyCompletion(1000L)) {
            return;
        }
        this.notifiedCompleted = true;
        this.delayedHandler.post(new Runnable(this){
            public final ListenerMux this$0;
            {
                this.this$0 = listenerMux;
            }

            public void run() {
                if (this.this$0.completionListener != null) {
                    this.this$0.completionListener.onCompletion();
                }
            }
        });
    }

    private boolean notifyErrorListener(Exception exception) {
        OnErrorListener onErrorListener = this.errorListener;
        boolean bl = onErrorListener != null && onErrorListener.onError(exception);
        return bl;
    }

    private void notifyPreparedListener() {
        this.notifiedPrepared = true;
        this.delayedHandler.post(new Runnable(this){
            public final ListenerMux this$0;
            {
                this.this$0 = listenerMux;
            }

            public void run() {
                this.this$0.performPreparedHandlerNotification();
            }
        });
    }

    private void performPreparedHandlerNotification() {
        this.muxNotifier.onPrepared();
        OnPreparedListener onPreparedListener = this.preparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared();
        }
    }

    public void clearSurfaceWhenReady(@Nullable ClearableSurface clearableSurface) {
        this.clearRequested = true;
        this.clearableSurfaceRef = new WeakReference((Object)clearableSurface);
    }

    public boolean isPrepared() {
        return this.notifiedPrepared;
    }

    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onAudioAttributesChanged(eventTime, audioAttributes);
        }
    }

    public void onAudioSessionId(AnalyticsListener.EventTime eventTime, int n) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onAudioSessionId(eventTime, n);
        }
    }

    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int n, long l, long l2) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onAudioUnderrun(eventTime, n, l, l2);
        }
    }

    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int n, long l, long l2) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onBandwidthEstimate(eventTime, n, l, l2);
        }
    }

    @Override
    public void onBufferingUpdate(@IntRange(from=0L, to=100L) int n) {
        this.muxNotifier.onBufferUpdated(n);
        OnBufferUpdateListener onBufferUpdateListener = this.bufferUpdateListener;
        if (onBufferUpdateListener != null) {
            onBufferUpdateListener.onBufferingUpdate(n);
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int n) {
        this.onBufferingUpdate(n);
    }

    public void onCompletion(MediaPlayer object) {
        object = this.completionListener;
        if (object != null) {
            object.onCompletion();
        }
    }

    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int n, DecoderCounters decoderCounters) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDecoderDisabled(eventTime, n, decoderCounters);
        }
    }

    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int n, DecoderCounters decoderCounters) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDecoderEnabled(eventTime, n, decoderCounters);
        }
    }

    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int n, String string2, long l) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDecoderInitialized(eventTime, n, string2, l);
        }
    }

    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int n, Format format) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDecoderInputFormatChanged(eventTime, n, format);
        }
    }

    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDownstreamFormatChanged(eventTime, mediaLoadData);
        }
    }

    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmKeysLoaded(eventTime);
        }
    }

    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmKeysRemoved(eventTime);
        }
    }

    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmKeysRestored(eventTime);
        }
    }

    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmSessionAcquired(eventTime);
        }
    }

    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exception) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmSessionManagerError(eventTime, exception);
        }
    }

    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDrmSessionReleased(eventTime);
        }
    }

    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int n, long l) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onDroppedVideoFrames(eventTime, n, l);
        }
    }

    @Override
    public void onError(ExoMediaPlayer exoMediaPlayer, Exception exception) {
        this.muxNotifier.onMediaPlaybackEnded();
        this.muxNotifier.onExoPlayerError(exoMediaPlayer, exception);
        this.notifyErrorListener(exception);
    }

    public boolean onError(MediaPlayer mediaPlayer, int n, int n2) {
        return this.notifyErrorListener(new NativeMediaPlaybackException(n, n2));
    }

    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onLoadCanceled(eventTime, loadEventInfo, mediaLoadData);
        }
    }

    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onLoadCompleted(eventTime, loadEventInfo, mediaLoadData);
        }
    }

    public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean bl) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onLoadError(eventTime, loadEventInfo, mediaLoadData, iOException, bl);
        }
    }

    public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        }
    }

    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean bl) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onLoadingChanged(eventTime, bl);
        }
    }

    public void onMediaPeriodCreated(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onMediaPeriodCreated(eventTime);
        }
    }

    public void onMediaPeriodReleased(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onMediaPeriodReleased(eventTime);
        }
    }

    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onMetadata(eventTime, metadata);
        }
    }

    @Override
    public void onMetadata(Metadata metadata) {
        MetadataListener metadataListener = this.metadataListener;
        if (metadataListener != null) {
            metadataListener.onMetadata(metadata);
        }
    }

    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onPlaybackParametersChanged(eventTime, playbackParameters);
        }
    }

    public void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onPlayerError(eventTime, exoPlaybackException);
        }
    }

    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean bl, int n) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onPlayerStateChanged(eventTime, bl, n);
        }
    }

    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int n) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onPositionDiscontinuity(eventTime, n);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.notifyPreparedListener();
    }

    public void onReadingStarted(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onReadingStarted(eventTime);
        }
    }

    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Surface surface) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onRenderedFirstFrame(eventTime, surface);
        }
    }

    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int n) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onRepeatModeChanged(eventTime, n);
        }
    }

    @Override
    public void onSeekComplete() {
        this.muxNotifier.onSeekComplete();
        OnSeekCompletionListener onSeekCompletionListener = this.seekCompletionListener;
        if (onSeekCompletionListener != null) {
            onSeekCompletionListener.onSeekComplete();
        }
    }

    public void onSeekComplete(MediaPlayer object) {
        object = this.seekCompletionListener;
        if (object != null) {
            object.onSeekComplete();
        }
    }

    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onSeekProcessed(eventTime);
        }
    }

    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onSeekStarted(eventTime);
        }
    }

    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean bl) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onShuffleModeChanged(eventTime, bl);
        }
    }

    @Override
    public void onStateChanged(boolean bl, int n) {
        if (n == 4) {
            this.muxNotifier.onMediaPlaybackEnded();
            if (!this.notifiedCompleted) {
                this.notifyCompletionListener();
            }
        } else if (n == 3 && !this.notifiedPrepared) {
            this.notifyPreparedListener();
        }
        if (n == 3 && bl) {
            this.muxNotifier.onPreviewImageStateChanged(false);
        }
        if (n == 1 && this.clearRequested) {
            this.clearRequested = false;
            ClearableSurface clearableSurface = (ClearableSurface)this.clearableSurfaceRef.get();
            if (clearableSurface != null) {
                clearableSurface.clearSurface();
                this.clearableSurfaceRef = new WeakReference(null);
            }
        }
    }

    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int n, int n2) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onSurfaceSizeChanged(eventTime, n, n2);
        }
    }

    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int n) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onTimelineChanged(eventTime, n);
        }
    }

    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onTracksChanged(eventTime, trackGroupArray, trackSelectionArray);
        }
    }

    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onUpstreamDiscarded(eventTime, mediaLoadData);
        }
    }

    @Override
    public void onVideoSizeChanged(int n, int n2, int n3, float f2) {
        this.muxNotifier.onVideoSizeChanged(n, n2, n3, f2);
    }

    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int n, int n2, int n3, float f2) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onVideoSizeChanged(eventTime, n, n2, n3, f2);
        }
    }

    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f2) {
        AnalyticsListener analyticsListener = this.analyticsListener;
        if (analyticsListener != null) {
            analyticsListener.onVolumeChanged(eventTime, f2);
        }
    }

    public void setAnalyticsListener(@Nullable AnalyticsListener analyticsListener) {
        this.analyticsListener = analyticsListener;
    }

    public void setMetadataListener(@Nullable MetadataListener metadataListener) {
        this.metadataListener = metadataListener;
    }

    public void setNotifiedCompleted(boolean bl) {
        this.notifiedCompleted = bl;
    }

    public void setNotifiedPrepared(boolean bl) {
        this.notifiedPrepared = bl;
        this.muxNotifier.onPreviewImageStateChanged(true);
    }

    public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener onBufferUpdateListener) {
        this.bufferUpdateListener = onBufferUpdateListener;
    }

    public void setOnCompletionListener(@Nullable OnCompletionListener onCompletionListener) {
        this.completionListener = onCompletionListener;
    }

    public void setOnErrorListener(@Nullable OnErrorListener onErrorListener) {
        this.errorListener = onErrorListener;
    }

    public void setOnPreparedListener(@Nullable OnPreparedListener onPreparedListener) {
        this.preparedListener = onPreparedListener;
    }

    public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener onSeekCompletionListener) {
        this.seekCompletionListener = onSeekCompletionListener;
    }

    public static abstract class Notifier {
        public void onBufferUpdated(int n) {
        }

        public abstract void onExoPlayerError(ExoMediaPlayer var1, Exception var2);

        public abstract void onMediaPlaybackEnded();

        public void onPrepared() {
        }

        public void onPreviewImageStateChanged(boolean bl) {
        }

        public void onSeekComplete() {
        }

        public void onVideoSizeChanged(int n, int n2, int n3, float f2) {
        }

        public abstract boolean shouldNotifyCompletion(long var1);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  androidx.annotation.FloatRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.analytics.AnalyticsListener
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package com.devbrackets.android.exomedia;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.audio.ExoAudioPlayer;
import com.devbrackets.android.exomedia.core.audio.NativeAudioPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.devbrackets.android.exomedia.util.DeviceUtil;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class AudioPlayer {
    public AudioPlayerApi audioPlayerImpl;
    public ListenerMux listenerMux;
    public long overriddenDuration = -1L;

    public AudioPlayer(@NonNull Context context) {
        this(context, new DeviceUtil());
    }

    public AudioPlayer(@NonNull Context object, @NonNull DeviceUtil deviceUtil) {
        object = deviceUtil.supportsExoPlayer((Context)object) ? new ExoAudioPlayer((Context)object) : new NativeAudioPlayer((Context)object);
        this.init((AudioPlayerApi)object);
    }

    public AudioPlayer(AudioPlayerApi audioPlayerApi) {
        this.init(audioPlayerApi);
    }

    private void onPlaybackEnded() {
        this.pause();
    }

    public int getAudioSessionId() {
        return this.audioPlayerImpl.getAudioSessionId();
    }

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return this.audioPlayerImpl.getAvailableTracks();
    }

    public int getBufferPercentage() {
        return this.audioPlayerImpl.getBufferedPercent();
    }

    public long getCurrentPosition() {
        return this.audioPlayerImpl.getCurrentPosition();
    }

    public long getDuration() {
        long l = this.overriddenDuration;
        if (l >= 0L) {
            return l;
        }
        return this.audioPlayerImpl.getDuration();
    }

    public float getPlaybackSpeed() {
        return this.audioPlayerImpl.getPlaybackSpeed();
    }

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return this.audioPlayerImpl.getSelectedTrackIndex(rendererType, n);
    }

    @FloatRange(from=0.0, to=1.0)
    public float getVolumeLeft() {
        return this.audioPlayerImpl.getVolumeLeft();
    }

    @FloatRange(from=0.0, to=1.0)
    public float getVolumeRight() {
        return this.audioPlayerImpl.getVolumeRight();
    }

    @Nullable
    public WindowInfo getWindowInfo() {
        return this.audioPlayerImpl.getWindowInfo();
    }

    public void init(AudioPlayerApi audioPlayerApi) {
        ListenerMux listenerMux;
        this.audioPlayerImpl = audioPlayerApi;
        this.listenerMux = listenerMux = new ListenerMux(new MuxNotifier(this, null));
        audioPlayerApi.setListenerMux(listenerMux);
    }

    public boolean isPlaying() {
        return this.audioPlayerImpl.isPlaying();
    }

    public void overrideDuration(long l) {
        this.overriddenDuration = l;
    }

    public void pause() {
        this.audioPlayerImpl.pause();
    }

    public void prepareAsync() {
        this.audioPlayerImpl.prepareAsync();
    }

    public void release() {
        this.audioPlayerImpl.release();
    }

    public void reset() {
        this.stopPlayback();
        this.setDataSource(null, null);
        this.audioPlayerImpl.reset();
    }

    public void seekTo(long l) {
        this.audioPlayerImpl.seekTo(l);
    }

    public void setAnalyticsListener(@Nullable AnalyticsListener analyticsListener) {
        this.listenerMux.setAnalyticsListener(analyticsListener);
    }

    public void setAudioStreamType(int n) {
        this.audioPlayerImpl.setAudioStreamType(n);
    }

    public void setDataSource(@Nullable Uri uri) {
        this.audioPlayerImpl.setDataSource(uri);
        this.overrideDuration(-1L);
    }

    public void setDataSource(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
        this.audioPlayerImpl.setDataSource(uri, mediaSource);
        this.overrideDuration(-1L);
    }

    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.audioPlayerImpl.setDrmCallback(mediaDrmCallback);
    }

    public void setMetadataListener(@Nullable MetadataListener metadataListener) {
        this.listenerMux.setMetadataListener(metadataListener);
    }

    public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener onBufferUpdateListener) {
        this.listenerMux.setOnBufferUpdateListener(onBufferUpdateListener);
    }

    public void setOnCompletionListener(@Nullable OnCompletionListener onCompletionListener) {
        this.listenerMux.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable OnErrorListener onErrorListener) {
        this.listenerMux.setOnErrorListener(onErrorListener);
    }

    public void setOnPreparedListener(@Nullable OnPreparedListener onPreparedListener) {
        this.listenerMux.setOnPreparedListener(onPreparedListener);
    }

    public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener onSeekCompletionListener) {
        this.listenerMux.setOnSeekCompletionListener(onSeekCompletionListener);
    }

    public boolean setPlaybackSpeed(float f2) {
        return this.audioPlayerImpl.setPlaybackSpeed(f2);
    }

    public void setRepeatMode(int n) {
        this.audioPlayerImpl.setRepeatMode(n);
    }

    @Deprecated
    public void setTrack(ExoMedia.RendererType rendererType, int n) {
        this.audioPlayerImpl.setTrack(rendererType, n);
    }

    public void setTrack(ExoMedia.RendererType rendererType, int n, int n2) {
        this.audioPlayerImpl.setTrack(rendererType, n, n2);
    }

    public void setVolume(@FloatRange(from=0.0, to=1.0) float f2, @FloatRange(from=0.0, to=1.0) float f4) {
        this.audioPlayerImpl.setVolume(f2, f4);
    }

    public void setWakeMode(Context context, int n) {
        this.audioPlayerImpl.setWakeMode(context, n);
    }

    public void start() {
        this.audioPlayerImpl.start();
    }

    public void stopPlayback() {
        this.audioPlayerImpl.stopPlayback();
    }

    public boolean trackSelectionAvailable() {
        return this.audioPlayerImpl.trackSelectionAvailable();
    }

    public class MuxNotifier
    extends ListenerMux.Notifier {
        public final AudioPlayer this$0;

        private MuxNotifier(AudioPlayer audioPlayer) {
            this.this$0 = audioPlayer;
        }

        public /* synthetic */ MuxNotifier(AudioPlayer audioPlayer, 1 var2_2) {
            this(audioPlayer);
        }

        @Override
        public void onExoPlayerError(ExoMediaPlayer exoMediaPlayer, Exception exception) {
            this.this$0.stopPlayback();
            if (exoMediaPlayer != null) {
                exoMediaPlayer.forcePrepare();
            }
        }

        @Override
        public void onMediaPlaybackEnded() {
            this.this$0.onPlaybackEnded();
        }

        @Override
        public void onPrepared() {
            this.this$0.audioPlayerImpl.onMediaPrepared();
        }

        @Override
        public boolean shouldNotifyCompletion(long l) {
            long l2 = this.this$0.getCurrentPosition();
            long l3 = this.this$0.getDuration();
            boolean bl = l2 > 0L && l3 > 0L && l2 + l >= l3;
            return bl;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.media.PlaybackParams
 *  android.net.Uri
 *  android.util.Log
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.audio;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class NativeAudioPlayer
implements AudioPlayerApi {
    private static final String TAG = "NativeMediaPlayer";
    @NonNull
    public final Context context;
    public int currentBufferPercent = 0;
    @NonNull
    public InternalListeners internalListeners = new InternalListeners(this);
    public ListenerMux listenerMux;
    @NonNull
    public final MediaPlayer mediaPlayer;
    public long requestedSeek;
    @FloatRange(from=0.0, to=1.0)
    public float volumeLeft = 1.0f;
    @FloatRange(from=0.0, to=1.0)
    public float volumeRight = 1.0f;

    public NativeAudioPlayer(@NonNull Context context) {
        this.context = context;
        context = new MediaPlayer();
        this.mediaPlayer = context;
        context.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)this.internalListeners);
    }

    @Override
    public int getAudioSessionId() {
        return this.mediaPlayer.getAudioSessionId();
    }

    @Override
    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return null;
    }

    @Override
    public int getBufferedPercent() {
        return this.currentBufferPercent;
    }

    @Override
    public long getCurrentPosition() {
        ListenerMux listenerMux = this.listenerMux;
        if (listenerMux != null && listenerMux.isPrepared()) {
            return this.mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public long getDuration() {
        ListenerMux listenerMux = this.listenerMux;
        if (listenerMux != null && listenerMux.isPrepared()) {
            return this.mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override
    public float getPlaybackSpeed() {
        return this.mediaPlayer.getPlaybackParams().getSpeed();
    }

    @Override
    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return -1;
    }

    @Override
    public float getVolumeLeft() {
        return this.volumeLeft;
    }

    @Override
    public float getVolumeRight() {
        return this.volumeRight;
    }

    @Override
    @Nullable
    public WindowInfo getWindowInfo() {
        return null;
    }

    @Override
    public boolean isPlaying() {
        return this.mediaPlayer.isPlaying();
    }

    @Override
    public void onMediaPrepared() {
        long l = this.requestedSeek;
        if (l != 0L) {
            this.seekTo(l);
        }
    }

    @Override
    public void pause() {
        this.mediaPlayer.pause();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void prepareAsync() {
        try {
            this.mediaPlayer.prepareAsync();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public void release() {
        this.mediaPlayer.release();
    }

    @Override
    public void reset() {
        this.mediaPlayer.reset();
    }

    @Override
    public boolean restart() {
        ListenerMux listenerMux = this.listenerMux;
        if (listenerMux != null && listenerMux.isPrepared()) {
            this.mediaPlayer.seekTo(0);
            this.mediaPlayer.start();
            this.listenerMux.setNotifiedCompleted(false);
            return true;
        }
        return false;
    }

    @Override
    public void seekTo(@IntRange(from=0L) long l) {
        ListenerMux listenerMux = this.listenerMux;
        if (listenerMux != null && listenerMux.isPrepared()) {
            this.mediaPlayer.seekTo((int)l);
            this.requestedSeek = 0L;
        } else {
            this.requestedSeek = l;
        }
    }

    @Override
    public void setAudioStreamType(int n) {
        this.mediaPlayer.setAudioStreamType(n);
    }

    @Override
    public void setDataSource(@Nullable Uri uri) {
        this.setDataSource(uri, null);
    }

    @Override
    public void setDataSource(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
        try {
            this.requestedSeek = 0L;
            this.mediaPlayer.setDataSource(this.context, uri);
        }
        catch (Exception exception) {
            Log.d((String)TAG, (String)"MediaPlayer: error setting data source", (Throwable)exception);
        }
    }

    @Override
    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
    }

    @Override
    public void setListenerMux(ListenerMux listenerMux) {
        this.listenerMux = listenerMux;
        this.mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)listenerMux);
        this.mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)listenerMux);
        this.mediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)listenerMux);
        this.mediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener)listenerMux);
        this.mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener)listenerMux);
    }

    @Override
    public boolean setPlaybackSpeed(float f2) {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.setSpeed(f2);
        this.mediaPlayer.setPlaybackParams(playbackParams);
        return true;
    }

    @Override
    public void setRepeatMode(int n) {
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n) {
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
    }

    @Override
    public void setVolume(@FloatRange(from=0.0, to=1.0) float f2, @FloatRange(from=0.0, to=1.0) float f4) {
        this.volumeLeft = f2;
        this.volumeRight = f4;
        this.mediaPlayer.setVolume(f2, f4);
    }

    @Override
    public void setWakeMode(@NonNull Context context, int n) {
        this.mediaPlayer.setWakeMode(context, n);
    }

    @Override
    public void start() {
        this.mediaPlayer.start();
        ListenerMux listenerMux = this.listenerMux;
        if (listenerMux != null) {
            listenerMux.setNotifiedCompleted(false);
        }
    }

    @Override
    public void stopPlayback() {
        this.mediaPlayer.stop();
    }

    @Override
    public boolean trackSelectionAvailable() {
        return false;
    }

    public class InternalListeners
    implements MediaPlayer.OnBufferingUpdateListener {
        public final NativeAudioPlayer this$0;

        public InternalListeners(NativeAudioPlayer nativeAudioPlayer) {
            this.this$0 = nativeAudioPlayer;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int n) {
            this.this$0.listenerMux.onBufferingUpdate(n);
            this.this$0.currentBufferPercent = n;
        }
    }
}


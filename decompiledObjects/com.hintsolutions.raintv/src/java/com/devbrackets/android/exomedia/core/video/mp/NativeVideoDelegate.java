/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 *  android.media.PlaybackParams
 *  android.net.Uri
 *  android.util.Log
 *  android.view.Surface
 *  androidx.annotation.FloatRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.video.mp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import java.io.IOException;
import java.util.Map;

public class NativeVideoDelegate {
    public Callback callback;
    public ClearableSurface clearableSurface;
    public Context context;
    public int currentBufferPercent;
    public State currentState;
    public Map<String, String> headers;
    @NonNull
    public InternalListeners internalListeners;
    public ListenerMux listenerMux;
    public MediaPlayer mediaPlayer;
    @Nullable
    public MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener;
    @Nullable
    public MediaPlayer.OnCompletionListener onCompletionListener;
    @Nullable
    public MediaPlayer.OnErrorListener onErrorListener;
    @Nullable
    public MediaPlayer.OnInfoListener onInfoListener;
    @Nullable
    public MediaPlayer.OnPreparedListener onPreparedListener;
    @Nullable
    public MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
    public boolean playRequested;
    public long requestedSeek;
    @FloatRange(from=0.0, to=1.0)
    public float requestedVolume;

    public NativeVideoDelegate(@NonNull Context context, @NonNull Callback callback, @NonNull ClearableSurface clearableSurface) {
        State state;
        this.currentState = state = State.IDLE;
        this.playRequested = false;
        this.requestedVolume = 1.0f;
        this.internalListeners = new InternalListeners(this);
        this.context = context;
        this.callback = callback;
        this.clearableSurface = clearableSurface;
        this.initMediaPlayer();
        this.currentState = state;
    }

    public int getBufferPercentage() {
        if (this.mediaPlayer != null) {
            return this.currentBufferPercent;
        }
        return 0;
    }

    public long getCurrentPosition() {
        if (this.listenerMux.isPrepared() && this.isReady()) {
            return this.mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    public long getDuration() {
        if (this.listenerMux.isPrepared() && this.isReady()) {
            return this.mediaPlayer.getDuration();
        }
        return 0L;
    }

    public float getPlaybackSpeed() {
        return this.mediaPlayer.getPlaybackParams().getSpeed();
    }

    @FloatRange(from=0.0, to=1.0)
    public float getVolume() {
        return this.requestedVolume;
    }

    @Nullable
    public WindowInfo getWindowInfo() {
        return null;
    }

    public void initMediaPlayer() {
        MediaPlayer mediaPlayer;
        this.mediaPlayer = mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener)this.internalListeners);
        this.mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener)this.internalListeners);
        this.mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)this.internalListeners);
        this.mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)this.internalListeners);
        this.mediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener)this.internalListeners);
        this.mediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)this.internalListeners);
        this.mediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener)this.internalListeners);
        this.mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setScreenOnWhilePlaying(true);
    }

    public boolean isPlaying() {
        boolean bl = this.isReady() && this.mediaPlayer.isPlaying();
        return bl;
    }

    public boolean isReady() {
        State state = this.currentState;
        boolean bl = state != State.ERROR && state != State.IDLE && state != State.PREPARING;
        return bl;
    }

    public void onSurfaceReady(Surface surface) {
        this.mediaPlayer.setSurface(surface);
        if (this.playRequested) {
            this.start();
        }
    }

    public void onSurfaceSizeChanged(int n, int n2) {
        if (this.mediaPlayer != null && n > 0 && n2 > 0) {
            long l = this.requestedSeek;
            if (l != 0L) {
                this.seekTo(l);
            }
            if (this.playRequested) {
                this.start();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void openVideo(@Nullable Uri uri) {
        block4: {
            void var2_4;
            if (uri == null) {
                return;
            }
            this.currentBufferPercent = 0;
            try {
                this.mediaPlayer.reset();
                this.mediaPlayer.setDataSource(this.context.getApplicationContext(), uri, this.headers);
                this.mediaPlayer.prepareAsync();
                this.currentState = State.PREPARING;
                break block4;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to open content: ");
            stringBuilder.append((Object)uri);
            Log.w((String)"ContentValues", (String)stringBuilder.toString(), (Throwable)var2_4);
            this.currentState = State.ERROR;
            this.internalListeners.onError(this.mediaPlayer, 1, 0);
        }
    }

    public void pause() {
        if (this.isReady() && this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
            this.currentState = State.PAUSED;
        }
        this.playRequested = false;
    }

    public boolean restart() {
        if (this.currentState != State.COMPLETED) {
            return false;
        }
        this.seekTo(0L);
        this.start();
        this.listenerMux.setNotifiedPrepared(false);
        this.listenerMux.setNotifiedCompleted(false);
        return true;
    }

    public void seekTo(long l) {
        if (this.isReady()) {
            this.mediaPlayer.seekTo((int)l);
            this.requestedSeek = 0L;
        } else {
            this.requestedSeek = l;
        }
    }

    public void setListenerMux(ListenerMux listenerMux) {
        this.listenerMux = listenerMux;
        this.setOnCompletionListener(listenerMux);
        this.setOnPreparedListener(listenerMux);
        this.setOnBufferingUpdateListener(listenerMux);
        this.setOnSeekCompleteListener(listenerMux);
        this.setOnErrorListener(listenerMux);
    }

    public void setOnBufferingUpdateListener(@Nullable MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.onBufferingUpdateListener = onBufferingUpdateListener;
    }

    public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.onCompletionListener = onCompletionListener;
    }

    public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }

    public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.onInfoListener = onInfoListener;
    }

    public void setOnPreparedListener(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) {
        this.onPreparedListener = onPreparedListener;
    }

    public void setOnSeekCompleteListener(@Nullable MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.onSeekCompleteListener = onSeekCompleteListener;
    }

    public boolean setPlaybackSpeed(float f2) {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.setSpeed(f2);
        this.mediaPlayer.setPlaybackParams(playbackParams);
        return true;
    }

    public void setVideoURI(Uri uri, @Nullable Map<String, String> map) {
        this.headers = map;
        this.requestedSeek = 0L;
        this.playRequested = false;
        this.openVideo(uri);
    }

    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        this.requestedVolume = f2;
        this.mediaPlayer.setVolume(f2, f2);
        return true;
    }

    public void start() {
        if (this.isReady()) {
            this.mediaPlayer.start();
            this.currentState = State.PLAYING;
        }
        this.playRequested = true;
        this.listenerMux.setNotifiedCompleted(false);
    }

    public void stopPlayback(boolean bl) {
        this.currentState = State.IDLE;
        if (this.isReady()) {
            try {
                this.mediaPlayer.stop();
            }
            catch (Exception exception) {
                Log.d((String)"ContentValues", (String)"stopPlayback: error calling mediaPlayer.stop()", (Throwable)exception);
            }
        }
        this.playRequested = false;
        if (bl) {
            this.listenerMux.clearSurfaceWhenReady(this.clearableSurface);
        }
    }

    public void suspend() {
        this.currentState = State.IDLE;
        try {
            this.mediaPlayer.reset();
            this.mediaPlayer.release();
        }
        catch (Exception exception) {
            Log.d((String)"ContentValues", (String)"stopPlayback: error calling mediaPlayer.reset() or mediaPlayer.release()", (Throwable)exception);
        }
        this.playRequested = false;
    }

    public static interface Callback {
        public void videoSizeChanged(int var1, int var2);
    }

    public class InternalListeners
    implements MediaPlayer.OnBufferingUpdateListener,
    MediaPlayer.OnErrorListener,
    MediaPlayer.OnPreparedListener,
    MediaPlayer.OnCompletionListener,
    MediaPlayer.OnSeekCompleteListener,
    MediaPlayer.OnInfoListener,
    MediaPlayer.OnVideoSizeChangedListener {
        public final NativeVideoDelegate this$0;

        public InternalListeners(NativeVideoDelegate nativeVideoDelegate) {
            this.this$0 = nativeVideoDelegate;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int n) {
            NativeVideoDelegate nativeVideoDelegate = this.this$0;
            nativeVideoDelegate.currentBufferPercent = n;
            nativeVideoDelegate = nativeVideoDelegate.onBufferingUpdateListener;
            if (nativeVideoDelegate != null) {
                nativeVideoDelegate.onBufferingUpdate(mediaPlayer, n);
            }
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            NativeVideoDelegate nativeVideoDelegate = this.this$0;
            nativeVideoDelegate.currentState = State.COMPLETED;
            mediaPlayer = nativeVideoDelegate.onCompletionListener;
            if (mediaPlayer != null) {
                mediaPlayer.onCompletion(nativeVideoDelegate.mediaPlayer);
            }
        }

        public boolean onError(MediaPlayer object, int n, int n2) {
            object = new StringBuilder();
            object.append("Error: ");
            object.append(n);
            object.append(",");
            object.append(n2);
            Log.d((String)"ContentValues", (String)object.toString());
            object = this.this$0;
            object.currentState = State.ERROR;
            MediaPlayer.OnErrorListener onErrorListener = object.onErrorListener;
            boolean bl = onErrorListener == null || onErrorListener.onError(object.mediaPlayer, n, n2);
            return bl;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int n, int n2) {
            MediaPlayer.OnInfoListener onInfoListener = this.this$0.onInfoListener;
            boolean bl = onInfoListener == null || onInfoListener.onInfo(mediaPlayer, n, n2);
            return bl;
        }

        public void onPrepared(MediaPlayer object) {
            NativeVideoDelegate nativeVideoDelegate = this.this$0;
            nativeVideoDelegate.currentState = State.PREPARED;
            MediaPlayer.OnPreparedListener onPreparedListener = nativeVideoDelegate.onPreparedListener;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(nativeVideoDelegate.mediaPlayer);
            }
            this.this$0.callback.videoSizeChanged(object.getVideoWidth(), object.getVideoHeight());
            object = this.this$0;
            long l = ((NativeVideoDelegate)object).requestedSeek;
            if (l != 0L) {
                ((NativeVideoDelegate)object).seekTo(l);
            }
            object = this.this$0;
            if (((NativeVideoDelegate)object).playRequested) {
                ((NativeVideoDelegate)object).start();
            }
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.this$0.onSeekCompleteListener;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(mediaPlayer);
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int n, int n2) {
            this.this$0.callback.videoSizeChanged(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        }
    }

    public static final class State
    extends Enum<State> {
        private static final State[] $VALUES;
        public static final /* enum */ State COMPLETED;
        public static final /* enum */ State ERROR;
        public static final /* enum */ State IDLE;
        public static final /* enum */ State PAUSED;
        public static final /* enum */ State PLAYING;
        public static final /* enum */ State PREPARED;
        public static final /* enum */ State PREPARING;

        static {
            State state;
            State state2;
            State state3;
            State state4;
            State state5;
            State state6;
            State state7;
            ERROR = state7 = new State();
            IDLE = state6 = new State();
            PREPARING = state5 = new State();
            PREPARED = state4 = new State();
            PLAYING = state3 = new State();
            PAUSED = state2 = new State();
            COMPLETED = state = new State();
            $VALUES = new State[]{state7, state6, state5, state4, state3, state2, state};
        }

        public static State valueOf(String string2) {
            return (State)Enum.valueOf(State.class, (String)string2);
        }

        public static State[] values() {
            return (State[])$VALUES.clone();
        }
    }
}


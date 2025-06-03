/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.net.wifi.WifiManager
 *  android.net.wifi.WifiManager$WifiLock
 *  android.text.TextUtils
 *  com.hintsolutions.raintv.services.audio.MusicService
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.hintsolutions.raintv.services.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.hintsolutions.raintv.services.audio.AudioItemProvider;
import com.hintsolutions.raintv.services.audio.LogHelper;
import com.hintsolutions.raintv.services.audio.MusicService;
import java.io.IOException;

public class Playback
implements AudioManager.OnAudioFocusChangeListener,
MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnPreparedListener,
MediaPlayer.OnSeekCompleteListener {
    private static final int AUDIO_FOCUSED = 2;
    private static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    private static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    private static final String TAG = LogHelper.makeLogTag(Playback.class);
    public static final float VOLUME_DUCK = 0.2f;
    public static final float VOLUME_NORMAL = 1.0f;
    private int mAudioFocus = 0;
    private AudioManager mAudioManager;
    private IntentFilter mAudioNoisyIntentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private BroadcastReceiver mAudioNoisyReceiver = new BroadcastReceiver(this){
        public final Playback this$0;
        {
            this.this$0 = playback;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals((Object)intent.getAction())) {
                LogHelper.d(TAG, "Headphones disconnected.");
                if (this.this$0.isPlaying()) {
                    context = new Intent(context, MusicService.class);
                    context.setAction("com.hintsolutions.raintv.services.audio.musicservice.ACTION_CMD");
                    context.putExtra("CMD_NAME", "CMD_PAUSE");
                    this.this$0.mService.startService((Intent)context);
                }
            }
        }
    };
    private volatile boolean mAudioNoisyReceiverRegistered;
    private Callback mCallback;
    private volatile String mCurrentMediaId;
    private volatile int mCurrentPosition;
    private MediaPlayer mMediaPlayer;
    private boolean mPlayOnFocusGain;
    private final MusicService mService;
    private int mState;
    private final WifiManager.WifiLock mWifiLock;

    public Playback(MusicService musicService) {
        this.mService = musicService;
        this.mAudioManager = (AudioManager)musicService.getSystemService("audio");
        this.mWifiLock = ((WifiManager)musicService.getApplicationContext().getSystemService("wifi")).createWifiLock(1, "sample_lock");
    }

    private void configMediaPlayerState() {
        Object object = TAG;
        LogHelper.d((String)object, "configMediaPlayerState. mAudioFocus=", this.mAudioFocus);
        int n = this.mAudioFocus;
        if (n == 0) {
            if (this.mState == 3) {
                this.pause();
            }
        } else {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                if (n == 1) {
                    mediaPlayer.setVolume(0.2f, 0.2f);
                } else {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
            }
            if (this.mPlayOnFocusGain) {
                mediaPlayer = this.mMediaPlayer;
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    LogHelper.d((String)object, "configMediaPlayerState startMediaPlayer. seeking to ", this.mCurrentPosition);
                    if (this.mCurrentPosition == this.mMediaPlayer.getCurrentPosition()) {
                        this.mMediaPlayer.start();
                        this.mState = 3;
                    } else {
                        this.mMediaPlayer.seekTo(this.mCurrentPosition);
                        this.mState = 6;
                    }
                }
                this.mPlayOnFocusGain = false;
            }
        }
        if ((object = this.mCallback) != null) {
            object.onPlaybackStatusChanged(this.mState);
        }
    }

    private void createMediaPlayerIfNeeded() {
        String string2 = TAG;
        boolean bl = false;
        if (this.mMediaPlayer == null) {
            bl = true;
        }
        LogHelper.d(string2, "createMediaPlayerIfNeeded. needed? ", bl);
        string2 = this.mMediaPlayer;
        if (string2 == null) {
            string2 = new MediaPlayer();
            this.mMediaPlayer = string2;
            string2.setWakeMode(this.mService.getApplicationContext(), 1);
            this.mMediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)this);
            this.mMediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)this);
            this.mMediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener)this);
            this.mMediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener)this);
        } else {
            string2.reset();
        }
    }

    private void giveUpAudioFocus() {
        LogHelper.d(TAG, "giveUpAudioFocus");
        if (this.mAudioFocus == 2 && this.mAudioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)this) == 1) {
            this.mAudioFocus = 0;
        }
    }

    private void registerAudioNoisyReceiver() {
        if (!this.mAudioNoisyReceiverRegistered) {
            this.mService.registerReceiver(this.mAudioNoisyReceiver, this.mAudioNoisyIntentFilter);
            this.mAudioNoisyReceiverRegistered = true;
        }
    }

    private void relaxResources(boolean bl) {
        MediaPlayer mediaPlayer;
        LogHelper.d(TAG, "relaxResources. releaseMediaPlayer=", bl);
        this.mService.stopForeground(true);
        if (bl && (mediaPlayer = this.mMediaPlayer) != null) {
            mediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        if (this.mWifiLock.isHeld()) {
            this.mWifiLock.release();
        }
    }

    private void tryToGetAudioFocus() {
        LogHelper.d(TAG, "tryToGetAudioFocus");
        if (this.mAudioFocus != 2 && this.mAudioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener)this, 3, 1) == 1) {
            this.mAudioFocus = 2;
        }
    }

    private void unregisterAudioNoisyReceiver() {
        if (this.mAudioNoisyReceiverRegistered) {
            this.mService.unregisterReceiver(this.mAudioNoisyReceiver);
            this.mAudioNoisyReceiverRegistered = false;
        }
    }

    public int getCurrentStreamPosition() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        int n = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.mCurrentPosition;
        return n;
    }

    public int getState() {
        return this.mState;
    }

    public boolean isConnected() {
        return true;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer;
        boolean bl = this.mPlayOnFocusGain || (mediaPlayer = this.mMediaPlayer) != null && mediaPlayer.isPlaying();
        return bl;
    }

    public void onAudioFocusChange(int n) {
        String string2 = TAG;
        int n2 = 0;
        LogHelper.d(string2, "onAudioFocusChange. focusChange=", n);
        if (n == 1) {
            this.mAudioFocus = 2;
        } else if (n != -1 && n != -2 && n != -3) {
            LogHelper.e(string2, "onAudioFocusChange: Ignoring unsupported focusChange: ", n);
        } else {
            if (n == -3) {
                n2 = 1;
            }
            this.mAudioFocus = n2;
            if (this.mState == 3 && n2 == 0) {
                this.mPlayOnFocusGain = true;
            }
        }
        this.configMediaPlayerState();
    }

    public void onCompletion(MediaPlayer object) {
        LogHelper.d(TAG, "onCompletion from MediaPlayer");
        object = this.mCallback;
        if (object != null) {
            object.onCompletion();
        }
    }

    public boolean onError(MediaPlayer object, int n, int n2) {
        LogHelper.e(TAG, z2.n("Media player error: what=", n, ", extra=", n2));
        object = this.mCallback;
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaPlayer error ");
            stringBuilder.append(n);
            stringBuilder.append(" (");
            stringBuilder.append(n2);
            stringBuilder.append(")");
            object.onError(stringBuilder.toString());
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        LogHelper.d(TAG, "onPrepared from MediaPlayer");
        this.configMediaPlayerState();
    }

    public void onSeekComplete(MediaPlayer object) {
        LogHelper.d(TAG, "onSeekComplete from MediaPlayer:", object.getCurrentPosition());
        this.mCurrentPosition = object.getCurrentPosition();
        if (this.mState == 6) {
            this.mMediaPlayer.start();
            this.mState = 3;
        }
        if ((object = this.mCallback) != null) {
            object.onPlaybackStatusChanged(this.mState);
        }
    }

    public void pause() {
        Object object;
        if (this.mState == 3) {
            object = this.mMediaPlayer;
            if (object != null && object.isPlaying()) {
                this.mMediaPlayer.pause();
                this.mCurrentPosition = this.mMediaPlayer.getCurrentPosition();
            }
            this.relaxResources(false);
            this.giveUpAudioFocus();
        }
        this.mState = 2;
        object = this.mCallback;
        if (object != null) {
            object.onPlaybackStatusChanged(2);
        }
        this.unregisterAudioNoisyReceiver();
    }

    public void play() {
        block6: {
            Object object = AudioItemProvider.getCurrentItem();
            this.mPlayOnFocusGain = true;
            this.tryToGetAudioFocus();
            this.registerAudioNoisyReceiver();
            Object object2 = object.getString("android.media.metadata.MEDIA_ID");
            boolean bl = TextUtils.equals((CharSequence)object2, (CharSequence)this.mCurrentMediaId) ^ true;
            if (bl) {
                this.mCurrentPosition = 0;
                this.mCurrentMediaId = object2;
            }
            if (this.mState == 2 && !bl && this.mMediaPlayer != null) {
                this.configMediaPlayerState();
            } else {
                this.mState = 1;
                this.relaxResources(false);
                object = object.getString("custom_stream_url");
                this.createMediaPlayerIfNeeded();
                this.mState = 6;
                this.mMediaPlayer.setAudioStreamType(3);
                this.mMediaPlayer.setDataSource((String)object);
                this.mMediaPlayer.prepareAsync();
                this.mWifiLock.acquire();
                object = this.mCallback;
                if (object == null) break block6;
                try {
                    object.onPlaybackStatusChanged(this.mState);
                }
                catch (IOException iOException) {
                    LogHelper.e(TAG, iOException, "Exception playing song");
                    object2 = this.mCallback;
                    if (object2 == null) break block6;
                    object2.onError(iOException.getMessage());
                }
            }
        }
    }

    public void seekTo(int n) {
        LogHelper.d(TAG, "seekTo called with ", n);
        Object object = this.mMediaPlayer;
        if (object == null) {
            this.mCurrentPosition = n;
        } else {
            if (object.isPlaying()) {
                this.mState = 6;
            }
            this.mMediaPlayer.seekTo(n);
            object = this.mCallback;
            if (object != null) {
                object.onPlaybackStatusChanged(this.mState);
            }
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setState(int n) {
        this.mState = n;
    }

    public void start() {
    }

    public void stop(boolean bl) {
        Callback callback;
        this.mState = 1;
        if (bl && (callback = this.mCallback) != null) {
            callback.onPlaybackStatusChanged(1);
        }
        this.mCurrentPosition = this.getCurrentStreamPosition();
        this.giveUpAudioFocus();
        this.unregisterAudioNoisyReceiver();
        this.relaxResources(true);
        if (this.mWifiLock.isHeld()) {
            this.mWifiLock.release();
        }
    }

    public static interface Callback {
        public void onCompletion();

        public void onError(String var1);

        public void onPlaybackStatusChanged(int var1);
    }
}


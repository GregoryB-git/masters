/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.SystemClock
 *  android.support.v4.media.MediaBrowserCompat$MediaItem
 *  android.support.v4.media.MediaMetadataCompat
 *  android.support.v4.media.MediaMetadataCompat$Builder
 *  android.support.v4.media.session.MediaSessionCompat
 *  android.support.v4.media.session.MediaSessionCompat$Callback
 *  android.support.v4.media.session.PlaybackStateCompat$Builder
 *  androidx.media.MediaBrowserServiceCompat
 *  androidx.media.MediaBrowserServiceCompat$BrowserRoot
 *  androidx.media.MediaBrowserServiceCompat$Result
 *  com.hintsolutions.raintv.services.audio.AudioActivity
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.List
 *  javax.inject.Inject
 *  tvrain.analytics.AnalyticsManager
 */
package com.hintsolutions.raintv.services.audio;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.MediaBrowserServiceCompat;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.services.audio.AlbumArtCache;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.audio.AudioItemProvider;
import com.hintsolutions.raintv.services.audio.LogHelper;
import com.hintsolutions.raintv.services.audio.MediaNotificationManager;
import com.hintsolutions.raintv.services.audio.Playback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import tvrain.analytics.AnalyticsManager;

public class MusicService
extends MediaBrowserServiceCompat
implements Playback.Callback {
    public static final String ACTION_CMD = "com.hintsolutions.raintv.services.audio.musicservice.ACTION_CMD";
    public static final String CMD_NAME = "CMD_NAME";
    public static final String CMD_PAUSE = "CMD_PAUSE";
    private static final int STOP_DELAY = 30000;
    private static final String TAG = LogHelper.makeLogTag(MusicService.class);
    @Inject
    public AnalyticsManager analyticsManager;
    private DelayedStopHandler mDelayedStopHandler = new Handler(this, null){
        private final WeakReference<MusicService> mWeakReference;
        {
            this.mWeakReference = new WeakReference((Object)musicService);
        }
        {
            this(musicService);
        }

        public void handleMessage(Message object) {
            object = (MusicService)this.mWeakReference.get();
            if (object != null && ((MusicService)object).mPlayback != null) {
                if (((MusicService)object).mPlayback.isPlaying()) {
                    LogHelper.d(TAG, "Ignoring delayed stop since the media player is in use.");
                    return;
                }
                LogHelper.d(TAG, "Stopping service with delay handler.");
                object.stopSelf();
                MusicService.access$802((MusicService)object, false);
            }
        }
    };
    private MediaNotificationManager mMediaNotificationManager;
    private Playback mPlayback;
    private boolean mServiceStarted;
    private MediaSessionCompat mSession;

    public static /* synthetic */ boolean access$802(MusicService musicService, boolean bl) {
        musicService.mServiceStarted = bl;
        return bl;
    }

    private long getAvailableActions() {
        MediaMetadataCompat mediaMetadataCompat = AudioItemProvider.getCurrentItem();
        long l = 1028L;
        if (mediaMetadataCompat == null) {
            return 1028L;
        }
        if (this.mPlayback.isPlaying()) {
            l = 1030L;
        }
        return l;
    }

    private void handlePauseRequest() {
        String string = TAG;
        StringBuilder stringBuilder = z2.t("handlePauseRequest: mState=");
        stringBuilder.append(this.mPlayback.getState());
        LogHelper.d(string, stringBuilder.toString());
        this.mPlayback.pause();
        this.mDelayedStopHandler.removeCallbacksAndMessages(null);
        this.mDelayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
    }

    private void handlePlayRequest() {
        String string = TAG;
        StringBuilder stringBuilder = z2.t("handlePlayRequest: mState=");
        stringBuilder.append(this.mPlayback.getState());
        LogHelper.d(string, stringBuilder.toString());
        this.mDelayedStopHandler.removeCallbacksAndMessages(null);
        if (!this.mServiceStarted) {
            LogHelper.v(string, "Starting service");
            this.startService(new Intent(this.getApplicationContext(), MusicService.class));
            this.mServiceStarted = true;
        }
        if (!this.mSession.isActive()) {
            this.mSession.setActive(true);
        }
        this.updateMetadata();
        this.mPlayback.play();
    }

    private void handleStopRequest(String string) {
        String string2 = TAG;
        StringBuilder stringBuilder = z2.t("handleStopRequest: mState=");
        stringBuilder.append(this.mPlayback.getState());
        stringBuilder.append(" error=");
        LogHelper.d(string2, stringBuilder.toString(), string);
        this.mPlayback.stop(true);
        this.mDelayedStopHandler.removeCallbacksAndMessages(null);
        this.mDelayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
        this.updatePlaybackState(string);
        this.stopSelf();
        this.mServiceStarted = false;
    }

    private void loadChildrenImpl(String string, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        String string2 = TAG;
        LogHelper.d(string2, "OnLoadChildren: parentMediaId=", string);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new MediaBrowserCompat.MediaItem(AudioItemProvider.getCurrentItem().getDescription(), 2));
        LogHelper.d(string2, "OnLoadChildren sending ", arrayList.size(), " results for ", string);
        result.sendResult((Object)arrayList);
    }

    private void updateMetadata() {
        Object object = AudioItemProvider.getCurrentItem();
        String string = object.getString("android.media.metadata.MEDIA_ID");
        LogHelper.d(TAG, z2.o("Updating metadata for MusicID= ", string));
        this.mSession.setMetadata(object);
        if (object.getDescription().getIconBitmap() == null && object.getDescription().getIconUri() != null) {
            object = object.getDescription().getIconUri().toString();
            AlbumArtCache.getInstance().fetch((String)object, new AlbumArtCache.FetchListener(this, string){
                public final MusicService this$0;
                public final String val$trackId;
                {
                    this.this$0 = musicService;
                    this.val$trackId = string;
                }

                @Override
                public void onFetched(String string, Bitmap bitmap, Bitmap bitmap2) {
                    bitmap = new MediaMetadataCompat.Builder(AudioItemProvider.getCurrentItem()).putBitmap("android.media.metadata.ALBUM_ART", bitmap).putBitmap("android.media.metadata.DISPLAY_ICON", bitmap2).build();
                    string = AudioItemProvider.getCurrentItem().getString("android.media.metadata.MEDIA_ID");
                    if (this.val$trackId.equals((Object)string)) {
                        this.this$0.mSession.setMetadata((MediaMetadataCompat)bitmap);
                    }
                }
            });
        }
    }

    private void updatePlaybackState(String string) {
        String string2 = TAG;
        Object object = z2.t("updatePlaybackState, playback state=");
        object.append(this.mPlayback.getState());
        LogHelper.d(string2, object.toString());
        object = this.mPlayback;
        long l = object != null && ((Playback)object).isConnected() ? (long)this.mPlayback.getCurrentStreamPosition() : -1L;
        object = new PlaybackStateCompat.Builder().setActions(this.getAvailableActions());
        int n = this.mPlayback.getState();
        if (string != null) {
            object.setErrorMessage((CharSequence)string);
            n = 7;
        }
        object.setState(n, l, 1.0f, SystemClock.elapsedRealtime());
        object.setActiveQueueItemId(0L);
        this.mSession.setPlaybackState(object.build());
        if (n == 3 || n == 2) {
            this.mMediaNotificationManager.startNotification();
        }
    }

    @Override
    public void onCompletion() {
        this.handleStopRequest(null);
    }

    public void onCreate() {
        super.onCreate();
        RainApplication.getAppComponent().inject(this);
        LogHelper.d(TAG, "onCreate");
        Object object = new MediaSessionCompat((Context)this, "MusicService", new ComponentName((Context)this, MediaNotificationManager.class), null);
        this.mSession = object;
        this.setSessionToken(object.getSessionToken());
        this.mSession.setCallback((MediaSessionCompat.Callback)new MediaSessionCallback(this, null));
        this.mSession.setFlags(3);
        object = new Playback(this);
        this.mPlayback = object;
        ((Playback)object).setState(0);
        this.mPlayback.setCallback(this);
        this.mPlayback.start();
        object = this.getApplicationContext();
        object = PendingIntent.getActivity((Context)object, (int)99, (Intent)new Intent((Context)object, AudioActivity.class), (int)0xC000000);
        this.mSession.setSessionActivity((PendingIntent)object);
        object = new Bundle();
        this.mSession.setExtras((Bundle)object);
        this.updatePlaybackState(null);
        this.mMediaNotificationManager = new MediaNotificationManager(this);
    }

    public void onDestroy() {
        LogHelper.d(TAG, "onDestroy");
        this.handleStopRequest(null);
        this.mDelayedStopHandler.removeCallbacksAndMessages(null);
        this.mSession.release();
    }

    @Override
    public void onError(String string) {
        this.updatePlaybackState(string);
    }

    public MediaBrowserServiceCompat.BrowserRoot onGetRoot(String string, int n, Bundle bundle) {
        LogHelper.d(TAG, z2.o("OnGetRoot: clientPackageName=", string), a.g("; clientUid=", n, " ; rootHints="), bundle);
        return new MediaBrowserServiceCompat.BrowserRoot("rain_root", null);
    }

    public void onLoadChildren(String string, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        try {
            if (AudioItemProvider.getCurrentItem() != null) {
                this.loadChildrenImpl(string, result);
            } else {
                result.detach();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onPlaybackStatusChanged(int n) {
        this.updatePlaybackState(null);
    }

    public int onStartCommand(Intent object, int n, int n2) {
        if (object != null) {
            String string = object.getAction();
            object = object.getStringExtra(CMD_NAME);
            if (ACTION_CMD.equals((Object)string) && CMD_PAUSE.equals(object) && (object = this.mPlayback) != null && ((Playback)object).isPlaying()) {
                this.handlePauseRequest();
            }
        }
        return 1;
    }

    public final class MediaSessionCallback
    extends MediaSessionCompat.Callback {
        public final MusicService this$0;

        private MediaSessionCallback(MusicService musicService) {
            this.this$0 = musicService;
        }

        public /* synthetic */ MediaSessionCallback(MusicService musicService, 1 var2_2) {
            this(musicService);
        }

        public void onPause() {
            String string = TAG;
            StringBuilder stringBuilder = z2.t("pause. current state=");
            stringBuilder.append(this.this$0.mPlayback.getState());
            LogHelper.d(string, stringBuilder.toString());
            this.this$0.handlePauseRequest();
        }

        public void onPlay() {
            LogHelper.d(TAG, "play");
            try {
                this.this$0.handlePlayRequest();
            }
            catch (Exception exception) {
                this.this$0.handleStopRequest(null);
            }
        }

        public void onPlayFromMediaId(String string, Bundle bundle) {
            LogHelper.d(TAG, "playFromMediaId mediaId:", string, "  extras=", bundle);
            try {
                this.this$0.handlePlayRequest();
            }
            catch (Exception exception) {
                this.this$0.handleStopRequest(null);
            }
        }

        public void onSeekTo(long l) {
            LogHelper.d(TAG, "onSeekTo:", l);
            this.this$0.mPlayback.seekTo((int)l);
        }

        public void onSkipToQueueItem(long l) {
            LogHelper.d(TAG, a.h("OnSkipToQueueItem:", l));
            try {
                this.this$0.handlePlayRequest();
            }
            catch (Exception exception) {
                this.this$0.handleStopRequest(null);
            }
        }

        public void onStop() {
            String string = TAG;
            StringBuilder stringBuilder = z2.t("stop. current state=");
            stringBuilder.append(this.this$0.mPlayback.getState());
            LogHelper.d(string, stringBuilder.toString());
            this.this$0.handleStopRequest(null);
        }
    }
}


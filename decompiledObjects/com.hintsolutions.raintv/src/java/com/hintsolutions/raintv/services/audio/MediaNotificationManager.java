/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.Build$VERSION
 *  android.support.v4.media.MediaDescriptionCompat
 *  android.support.v4.media.MediaMetadataCompat
 *  android.support.v4.media.session.MediaControllerCompat
 *  android.support.v4.media.session.MediaControllerCompat$Callback
 *  android.support.v4.media.session.MediaControllerCompat$TransportControls
 *  android.support.v4.media.session.MediaSessionCompat$Token
 *  android.support.v4.media.session.PlaybackStateCompat
 *  android.util.Log
 *  androidx.annotation.RequiresApi
 *  androidx.core.app.NotificationCompat$Action
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationCompat$Style
 *  androidx.media.app.NotificationCompat$MediaStyle
 *  com.hintsolutions.raintv.services.audio.AudioActivity
 *  com.hintsolutions.raintv.services.audio.MediaNotificationManager$1
 *  com.hintsolutions.raintv.services.audio.MediaNotificationManager$2
 *  com.hintsolutions.raintv.services.audio.MusicService
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.hintsolutions.raintv.services.audio;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.media.app.NotificationCompat;
import com.hintsolutions.raintv.services.audio.AlbumArtCache;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.audio.LogHelper;
import com.hintsolutions.raintv.services.audio.MediaNotificationManager;
import com.hintsolutions.raintv.services.audio.MusicService;
import com.hintsolutions.raintv.services.audio.ResourceHelper;

public class MediaNotificationManager
extends BroadcastReceiver {
    public static final String ACTION_CANCEL = "com.hintsolutions.raintv.services.audio.cancel";
    public static final String ACTION_NEXT = "com.hintsolutions.raintv.services.audio.next";
    public static final String ACTION_PAUSE = "com.hintsolutions.raintv.services.audio.pause";
    public static final String ACTION_PLAY = "com.hintsolutions.raintv.services.audio.play";
    public static final String ACTION_PREV = "com.hintsolutions.raintv.services.audio.prev";
    private static final String NOTIFICATION_CHANNEL_ID = "audio";
    private static final int NOTIFICATION_ID = 412;
    private static final int REQUEST_CODE = 100;
    private static final String TAG = LogHelper.makeLogTag(MediaNotificationManager.class);
    private PendingIntent mCancelIntent;
    private final MediaControllerCompat.Callback mCb = new 1(this);
    private MediaControllerCompat mController;
    private MediaMetadataCompat mMetadata;
    private PendingIntent mNextIntent;
    private int mNotificationColor;
    private NotificationManager mNotificationManager;
    private PendingIntent mPauseIntent;
    private PendingIntent mPlayIntent;
    private PlaybackStateCompat mPlaybackState;
    private PendingIntent mPreviousIntent;
    private final MusicService mService;
    private MediaSessionCompat.Token mSessionToken;
    private boolean mStarted = false;
    private MediaControllerCompat.TransportControls mTransportControls;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MediaNotificationManager(MusicService object) {
        this.mService = object;
        this.updateSessionToken();
        try {
            this.mNotificationColor = ResourceHelper.getThemeColor((Context)object, 16843827, -12303292);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mNotificationManager = (NotificationManager)this.mService.getSystemService("notification");
        String string2 = this.mService.getPackageName();
        this.mCancelIntent = PendingIntent.getBroadcast((Context)this.mService, (int)100, (Intent)new Intent(ACTION_CANCEL).setPackage(string2), (int)0x14000000);
        this.mPauseIntent = PendingIntent.getBroadcast((Context)this.mService, (int)100, (Intent)new Intent(ACTION_PAUSE).setPackage(string2), (int)0x14000000);
        this.mPlayIntent = PendingIntent.getBroadcast((Context)this.mService, (int)100, (Intent)new Intent(ACTION_PLAY).setPackage(string2), (int)0x14000000);
        this.mPreviousIntent = PendingIntent.getBroadcast((Context)this.mService, (int)100, (Intent)new Intent(ACTION_PREV).setPackage(string2), (int)0x14000000);
        this.mNextIntent = PendingIntent.getBroadcast((Context)this.mService, (int)100, (Intent)new Intent(ACTION_NEXT).setPackage(string2), (int)0x14000000);
        try {
            this.mNotificationManager.cancelAll();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ PlaybackStateCompat access$002(MediaNotificationManager mediaNotificationManager, PlaybackStateCompat playbackStateCompat) {
        mediaNotificationManager.mPlaybackState = playbackStateCompat;
        return playbackStateCompat;
    }

    public static /* synthetic */ String access$100() {
        return TAG;
    }

    public static /* synthetic */ Notification access$200(MediaNotificationManager mediaNotificationManager) {
        return mediaNotificationManager.createNotification();
    }

    public static /* synthetic */ NotificationManager access$300(MediaNotificationManager mediaNotificationManager) {
        return mediaNotificationManager.mNotificationManager;
    }

    public static /* synthetic */ MediaMetadataCompat access$400(MediaNotificationManager mediaNotificationManager) {
        return mediaNotificationManager.mMetadata;
    }

    public static /* synthetic */ MediaMetadataCompat access$402(MediaNotificationManager mediaNotificationManager, MediaMetadataCompat mediaMetadataCompat) {
        mediaNotificationManager.mMetadata = mediaMetadataCompat;
        return mediaMetadataCompat;
    }

    public static /* synthetic */ void access$500(MediaNotificationManager mediaNotificationManager) {
        mediaNotificationManager.updateSessionToken();
    }

    private void addPlayPauseAction(NotificationCompat.Builder builder) {
        PendingIntent pendingIntent;
        int n;
        String string2;
        LogHelper.d(TAG, "updatePlayPauseAction");
        if (this.mPlaybackState.getState() == 3) {
            string2 = this.mService.getString(2131755307);
            n = 2131231172;
            pendingIntent = this.mPauseIntent;
        } else {
            string2 = this.mService.getString(2131755308);
            n = 2131231174;
            pendingIntent = this.mPlayIntent;
        }
        builder.addAction(new NotificationCompat.Action(n, (CharSequence)string2, pendingIntent));
    }

    private PendingIntent createContentIntent() {
        Intent intent = new Intent((Context)this.mService, AudioActivity.class);
        intent.setFlags(0x20000000);
        return PendingIntent.getActivity((Context)this.mService, (int)100, (Intent)intent, (int)0x14000000);
    }

    private Notification createNotification() {
        String string2 = TAG;
        Object object = z2.t("updateNotificationMetadata. mMetadata=");
        object.append((Object)this.mMetadata);
        LogHelper.d(string2, object.toString());
        object = this.mMetadata;
        string2 = null;
        if (object != null && this.mPlaybackState != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.createNotificationChannel();
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder((Context)this.mService, NOTIFICATION_CHANNEL_ID);
            this.addPlayPauseAction(builder);
            MediaDescriptionCompat mediaDescriptionCompat = this.mMetadata.getDescription();
            if (mediaDescriptionCompat.getIconUri() != null) {
                object = mediaDescriptionCompat.getIconUri().toString();
                string2 = AlbumArtCache.getInstance().getBigImage((String)object);
                if (string2 == null) {
                    string2 = BitmapFactory.decodeResource((Resources)this.mService.getResources(), (int)2131231025);
                } else {
                    object = null;
                }
            } else {
                object = null;
            }
            builder.setStyle((NotificationCompat.Style)new NotificationCompat.MediaStyle().setShowActionsInCompactView(new int[]{0}).setMediaSession(this.mSessionToken)).setColor(this.mNotificationColor).setSmallIcon(2131231205).setVisibility(1).setContentIntent(this.createContentIntent()).setContentTitle(mediaDescriptionCompat.getTitle()).setContentText(mediaDescriptionCompat.getSubtitle()).setDeleteIntent(this.mCancelIntent).setLargeIcon((Bitmap)string2);
            this.setNotificationPlaybackState(builder);
            if (object != null) {
                this.fetchBitmapFromURLAsync((String)object, builder);
            }
            return builder.build();
        }
        return null;
    }

    @RequiresApi(value=26)
    private void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, (CharSequence)"Audio", 2);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-1);
        notificationChannel.enableVibration(true);
        this.mNotificationManager.createNotificationChannel(notificationChannel);
    }

    private void fetchBitmapFromURLAsync(String string2, NotificationCompat.Builder builder) {
        AlbumArtCache.getInstance().fetch(string2, (AlbumArtCache.FetchListener)new 2(this, builder));
    }

    private void setNotificationPlaybackState(NotificationCompat.Builder builder) {
        String string2 = TAG;
        boolean bl = true;
        StringBuilder stringBuilder = z2.t("updateNotificationPlaybackState. mPlaybackState=");
        stringBuilder.append((Object)this.mPlaybackState);
        LogHelper.d(string2, stringBuilder.toString());
        stringBuilder = this.mPlaybackState;
        if (stringBuilder != null && this.mStarted) {
            if (stringBuilder.getState() == 3 && this.mPlaybackState.getPosition() >= 0L) {
                LogHelper.d(string2, "updateNotificationPlaybackState. updating playback position to ", (System.currentTimeMillis() - this.mPlaybackState.getPosition()) / 1000L, " seconds");
                builder.setWhen(System.currentTimeMillis() - this.mPlaybackState.getPosition()).setShowWhen(true).setUsesChronometer(false);
            } else {
                LogHelper.d(string2, "updateNotificationPlaybackState. hiding playback position");
                builder.setWhen(0L).setShowWhen(false).setUsesChronometer(false);
            }
            if (this.mPlaybackState.getState() != 3) {
                bl = false;
            }
            builder.setOngoing(bl);
            return;
        }
        LogHelper.d(string2, "updateNotificationPlaybackState. cancelling notification!");
        this.mService.stopForeground(true);
    }

    private void updateSessionToken() {
        MediaSessionCompat.Token token = this.mService.getSessionToken();
        MediaSessionCompat.Token token2 = this.mSessionToken;
        if (token2 == null || !token2.equals((Object)token)) {
            token2 = this.mController;
            if (token2 != null) {
                token2.unregisterCallback(this.mCb);
            }
            this.mSessionToken = token;
            if (token != null) {
                try {
                    token2 = new MediaControllerCompat((Context)this.mService, token);
                    this.mController = token2;
                    this.mTransportControls = token2.getTransportControls();
                    if (this.mStarted) {
                        this.mController.registerCallback(this.mCb);
                    }
                }
                catch (Exception exception) {
                    Log.e((String)TAG, (String)"", (Throwable)exception);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onReceive(Context var1_1, Intent var2_2) {
        block14: {
            var1_1 /* !! */  = var2_2 /* !! */ .getAction();
            var2_2 /* !! */  = MediaNotificationManager.TAG;
            LogHelper.d((String)var2_2 /* !! */ , new Object[]{z2.o("Received intent with action ", (String)var1_1 /* !! */ )});
            var1_1 /* !! */ .getClass();
            var1_1 /* !! */ .hashCode();
            var3_3 = -1;
            switch (var1_1 /* !! */ .hashCode()) {
                default: {
                    break;
                }
                case 2138219006: {
                    if (!var1_1 /* !! */ .equals((Object)"com.hintsolutions.raintv.services.audio.pause")) break;
                    var3_3 = 4;
                    break;
                }
                case 1487876978: {
                    if (!var1_1 /* !! */ .equals((Object)"com.hintsolutions.raintv.services.audio.cancel")) break;
                    var3_3 = 3;
                    break;
                }
                case -346651349: {
                    if (!var1_1 /* !! */ .equals((Object)"com.hintsolutions.raintv.services.audio.prev")) break;
                    var3_3 = 2;
                    break;
                }
                case -346657236: {
                    if (!var1_1 /* !! */ .equals((Object)"com.hintsolutions.raintv.services.audio.play")) break;
                    var3_3 = 1;
                    break;
                }
                case -346722837: {
                    if (!var1_1 /* !! */ .equals((Object)"com.hintsolutions.raintv.services.audio.next")) break;
                    var3_3 = 0;
                }
            }
            switch (var3_3) {
                default: {
                    ** GOTO lbl39
                }
                case 4: {
                    this.mTransportControls.pause();
                    break block14;
                }
                case 3: {
                    this.mTransportControls.stop();
lbl39:
                    // 2 sources

                    LogHelper.w((String)var2_2 /* !! */ , new Object[]{"Unknown intent ignored. Action=", var1_1 /* !! */ });
                    break block14;
                }
                case 2: {
                    this.mTransportControls.skipToPrevious();
                    break block14;
                }
                case 1: {
                    this.mTransportControls.play();
                    break block14;
                }
                case 0: 
            }
            this.mTransportControls.skipToNext();
        }
    }

    public void startNotification() {
        if (!this.mStarted) {
            this.mMetadata = this.mController.getMetadata();
            this.mPlaybackState = this.mController.getPlaybackState();
            Notification notification = this.createNotification();
            if (notification != null) {
                this.mController.registerCallback(this.mCb);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(ACTION_NEXT);
                intentFilter.addAction(ACTION_PAUSE);
                intentFilter.addAction(ACTION_PLAY);
                intentFilter.addAction(ACTION_PREV);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.mService.registerReceiver((BroadcastReceiver)this, intentFilter, 4);
                } else {
                    this.mService.registerReceiver((BroadcastReceiver)this, intentFilter);
                }
                this.mService.startForeground(412, notification);
                this.mStarted = true;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void stopNotification() {
        if (this.mStarted) {
            this.mStarted = false;
            this.mController.unregisterCallback(this.mCb);
            try {
                this.mNotificationManager.cancel(412);
                this.mService.unregisterReceiver((BroadcastReceiver)this);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            this.mService.stopForeground(true);
        }
    }
}


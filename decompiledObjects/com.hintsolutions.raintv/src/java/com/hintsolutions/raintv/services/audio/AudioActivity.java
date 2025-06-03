/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.support.v4.media.MediaBrowserCompat
 *  android.support.v4.media.MediaBrowserCompat$ConnectionCallback
 *  android.support.v4.media.MediaMetadataCompat
 *  android.support.v4.media.session.MediaControllerCompat
 *  android.support.v4.media.session.MediaControllerCompat$Callback
 *  android.support.v4.media.session.MediaControllerCompat$TransportControls
 *  android.support.v4.media.session.MediaSessionCompat$QueueItem
 *  android.support.v4.media.session.PlaybackStateCompat
 *  android.text.TextUtils
 *  android.text.format.DateUtils
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  butterknife.BindView
 *  butterknife.OnClick
 *  com.google.android.gms.tagmanager.DataLayer
 *  com.mikepenz.google_material_typeface_library.GoogleMaterial$Icon
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.AutoVideo
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.ScheduleProgram
 *  ru.tvrain.core.data.Video
 *  rx.Observable
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.services.bus.events.ScheduleChangedEvent
 */
package com.hintsolutions.raintv.services.audio;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.services.audio.AudioItemProvider;
import com.hintsolutions.raintv.services.audio.LogHelper;
import com.hintsolutions.raintv.services.audio.MusicService;
import com.hintsolutions.raintv.utils.MediaUtils;
import com.hintsolutions.raintv.video.LocalVideoActivity;
import com.hintsolutions.raintv.video.VideoActivity;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.squareup.otto.Subscribe;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.ScheduleProgram;
import ru.tvrain.core.data.Video;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.services.bus.events.ScheduleChangedEvent;

public class AudioActivity
extends BaseActivity {
    public static final String INTENT_EXTRA_METADATA = "metadata";
    public static final String INTENT_EXTRA_METADATA_JSON = "metadata_json";
    public static final String INTENT_EXTRA_POSITION = "position";
    private static final long PROGRESS_UPDATE_INITIAL_INTERVAL = 100L;
    private static final long PROGRESS_UPDATE_INTERNAL = 1000L;
    private static final String STATE_POSITION = "position";
    private static int createdInstances;
    @BindView(value=2131296584)
    public TextView endText;
    private Article mArticle;
    @BindView(value=2131296370)
    public LinearLayout mAudioLinearLayout;
    private MediaBrowserCompat.ConnectionCallback mConnectionCallback;
    private final ScheduledExecutorService mExecutorService;
    private final Handler mHandler = new Handler();
    private MediaBrowserCompat mMediaBrowser;
    private MediaControllerCompat mMediaController;
    private PlaybackStateCompat mPlaybackState;
    private ScheduledFuture<?> mScheduleFuture;
    private MediaControllerCompat.Callback mSessionCallback;
    private MediaControllerCompat.TransportControls mTransportControls;
    private final Runnable mUpdateProgressTask;
    private IVideo mVideo;
    private MediaMetadataCompat newMetadata;
    private IconicsDrawable pauseDrawable;
    private IconicsDrawable playDrawable;
    private Subscription playLoggingSubscription;
    @BindView(value=2131297008)
    public ImageView playPauseButton;
    @BindView(value=2131297011)
    public RelativeLayout playbackProgressLayout;
    private long positionToStart = 0L;
    @BindView(value=2131297027)
    public TextView programName;
    @BindView(value=2131297028)
    public ProgressWheel progress;
    private boolean resumed = false;
    @BindView(value=2131297109)
    public SeekBar seekBar;
    @BindView(value=2131297158)
    public TextView startText;
    private boolean updatePositionOnStart = false;

    public AudioActivity() {
        this.mExecutorService = Executors.newSingleThreadScheduledExecutor();
        this.mUpdateProgressTask = new o(this, 1);
        this.mConnectionCallback = new MediaBrowserCompat.ConnectionCallback(this){
            public final AudioActivity this$0;
            {
                this.this$0 = audioActivity;
            }

            public void onConnected() {
                if (AudioActivity.access$000(this.this$0) != null) {
                    Object object = this.this$0;
                    AudioActivity.access$102((AudioActivity)object, new MediaControllerCompat((Context)object, AudioActivity.access$000((AudioActivity)object).getSessionToken()));
                    object = this.this$0;
                    AudioActivity.access$202((AudioActivity)object, AudioActivity.access$100((AudioActivity)object).getTransportControls());
                    AudioActivity.access$100(this.this$0).registerCallback(AudioActivity.access$300(this.this$0));
                    object = this.this$0;
                    MediaControllerCompat.setMediaController((Activity)object, (MediaControllerCompat)AudioActivity.access$100((AudioActivity)object));
                    object = this.this$0;
                    AudioActivity.access$402((AudioActivity)object, AudioActivity.access$100((AudioActivity)object).getPlaybackState());
                    object = AudioActivity.access$500(this.this$0);
                    boolean bl = false;
                    boolean bl2 = object != null && !MediaUtils.isSameIds(AudioActivity.access$500(this.this$0), AudioItemProvider.getCurrentItem());
                    boolean bl3 = bl;
                    if (AudioActivity.access$400(this.this$0) != null) {
                        bl3 = bl;
                        if (AudioActivity.access$400(this.this$0).getState() != 3) {
                            bl3 = true;
                        }
                    }
                    if (bl2 || bl3) {
                        if (bl2 && (object = AudioItemProvider.getCurrentItem()) != null) {
                            this.this$0.saveVideoPosition(MediaUtils.getVideoFromMetadata((MediaMetadataCompat)object));
                        }
                        if (!AudioActivity.access$600(this.this$0) || bl2) {
                            AudioActivity.access$700(this.this$0);
                        }
                    }
                    if (AudioActivity.access$600(this.this$0)) {
                        AudioActivity.access$800(this.this$0);
                    }
                    AudioActivity.access$602(this.this$0, true);
                    AudioActivity.access$900(this.this$0, AudioItemProvider.getCurrentItem());
                    AudioActivity.access$1000(this.this$0);
                    try {
                        object = AudioActivity.access$1100(this.this$0) ? this.this$0.getString(2131755039) : this.this$0.getString(2131755038);
                        if (this.this$0.getSupportActionBar() != null) {
                            this.this$0.getSupportActionBar().setTitle((CharSequence)object);
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return;
                }
                throw new IllegalArgumentException("No Session token");
            }

            public void onConnectionFailed() {
            }

            public void onConnectionSuspended() {
                AudioActivity.access$100(this.this$0).unregisterCallback(AudioActivity.access$300(this.this$0));
                AudioActivity.access$202(this.this$0, null);
                AudioActivity.access$102(this.this$0, null);
                MediaControllerCompat.setMediaController((Activity)this.this$0, null);
            }
        };
        this.mSessionCallback = new MediaControllerCompat.Callback(this){
            public final AudioActivity this$0;
            {
                this.this$0 = audioActivity;
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                AudioActivity.access$900(this.this$0, mediaMetadataCompat);
            }

            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                if (playbackStateCompat == null) {
                    return;
                }
                AudioActivity.access$402(this.this$0, playbackStateCompat);
                AudioActivity.access$1000(this.this$0);
            }

            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
            }

            public void onSessionDestroyed() {
            }
        };
    }

    public static /* synthetic */ void A(Throwable throwable) {
        AudioActivity.lambda$saveVideoPosition$3(throwable);
    }

    public static /* synthetic */ void B(ResponseBody responseBody) {
        AudioActivity.lambda$saveVideoPosition$2(responseBody);
    }

    public static /* synthetic */ void C(AudioActivity audioActivity) {
        audioActivity.lambda$scheduleSeekbarUpdate$4();
    }

    public static /* synthetic */ void D(AudioActivity audioActivity, Long l4) {
        audioActivity.lambda$startPlayLogging$1(l4);
    }

    public static /* synthetic */ void E(AudioActivity audioActivity, View view) {
        audioActivity.lambda$onCreate$0(view);
    }

    public static /* synthetic */ MediaBrowserCompat access$000(AudioActivity audioActivity) {
        return audioActivity.mMediaBrowser;
    }

    public static /* synthetic */ MediaControllerCompat access$100(AudioActivity audioActivity) {
        return audioActivity.mMediaController;
    }

    public static /* synthetic */ void access$1000(AudioActivity audioActivity) {
        audioActivity.updateCurrentState();
    }

    public static /* synthetic */ MediaControllerCompat access$102(AudioActivity audioActivity, MediaControllerCompat mediaControllerCompat) {
        audioActivity.mMediaController = mediaControllerCompat;
        return mediaControllerCompat;
    }

    public static /* synthetic */ boolean access$1100(AudioActivity audioActivity) {
        return audioActivity.isLive();
    }

    public static /* synthetic */ void access$1200(AudioActivity audioActivity) {
        audioActivity.stopSeekbarUpdate();
    }

    public static /* synthetic */ void access$1300(AudioActivity audioActivity) {
        audioActivity.scheduleSeekbarUpdate();
    }

    public static /* synthetic */ MediaControllerCompat.TransportControls access$202(AudioActivity audioActivity, MediaControllerCompat.TransportControls transportControls) {
        audioActivity.mTransportControls = transportControls;
        return transportControls;
    }

    public static /* synthetic */ MediaControllerCompat.Callback access$300(AudioActivity audioActivity) {
        return audioActivity.mSessionCallback;
    }

    public static /* synthetic */ PlaybackStateCompat access$400(AudioActivity audioActivity) {
        return audioActivity.mPlaybackState;
    }

    public static /* synthetic */ PlaybackStateCompat access$402(AudioActivity audioActivity, PlaybackStateCompat playbackStateCompat) {
        audioActivity.mPlaybackState = playbackStateCompat;
        return playbackStateCompat;
    }

    public static /* synthetic */ MediaMetadataCompat access$500(AudioActivity audioActivity) {
        return audioActivity.newMetadata;
    }

    public static /* synthetic */ boolean access$600(AudioActivity audioActivity) {
        return audioActivity.resumed;
    }

    public static /* synthetic */ boolean access$602(AudioActivity audioActivity, boolean bl) {
        audioActivity.resumed = bl;
        return bl;
    }

    public static /* synthetic */ void access$700(AudioActivity audioActivity) {
        audioActivity.initPlayback();
    }

    public static /* synthetic */ void access$800(AudioActivity audioActivity) {
        audioActivity.hideProgress();
    }

    public static /* synthetic */ void access$900(AudioActivity audioActivity, MediaMetadataCompat mediaMetadataCompat) {
        audioActivity.updateDuration(mediaMetadataCompat);
    }

    private Article getArticleFromMetadata() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat = this.newMetadata;
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat2 = AudioItemProvider.getCurrentItem();
        }
        return MediaUtils.getArticleFromMetadata(mediaMetadataCompat2);
    }

    private IVideo getVideoFromMetadata() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat = this.newMetadata;
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat2 = AudioItemProvider.getCurrentItem();
        }
        return MediaUtils.getVideoFromMetadata(mediaMetadataCompat2);
    }

    private Map<String, Object> gtmGetVideoInfo() {
        Object object = this.mArticle;
        if (object != null) {
            int n4 = object.id;
            object = this.mArticle.isFull() ? "1" : "0";
            object = DataLayer.mapOf((Object[])new Object[]{"video_id", n4, "full_version", object});
        } else {
            object = new HashMap();
        }
        MediaMetadataCompat mediaMetadataCompat = this.newMetadata;
        if (mediaMetadataCompat != null) {
            object.put((Object)"video_id", (Object)mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID"));
            object.put((Object)"full_version", (Object)"1");
        }
        if ((mediaMetadataCompat = this.mVideo) != null && !TextUtils.isEmpty((CharSequence)mediaMetadataCompat.getVideoDuration())) {
            object.put((Object)"length", (Object)(Long.parseLong((String)this.mVideo.getVideoDuration()) / 1000L));
        } else {
            mediaMetadataCompat = this.newMetadata;
            if (mediaMetadataCompat != null) {
                object.put((Object)"length", (Object)(mediaMetadataCompat.getLong("android.media.metadata.DURATION") / 1000L));
            }
        }
        return object;
    }

    private void hideProgress() {
        this.playPauseButton.setVisibility(0);
        this.progress.setVisibility(8);
    }

    private void initAudioService() {
        this.mMediaBrowser = new MediaBrowserCompat((Context)this, new ComponentName((Context)this, MusicService.class), this.mConnectionCallback, null);
    }

    private void initPlayback() {
        this.setAudio(this.newMetadata);
    }

    private void initViews() {
        if (this.isLive()) {
            this.playbackProgressLayout.setVisibility(8);
        } else {
            this.playbackProgressLayout.setVisibility(0);
        }
        this.playDrawable = new IconicsDrawable((Context)this, (IIcon)GoogleMaterial.Icon.gmd_play_circle_outline).color(-1).sizeDp(64).paddingDp(8);
        this.pauseDrawable = new IconicsDrawable((Context)this, (IIcon)GoogleMaterial.Icon.gmd_pause_circle_outline).color(-1).sizeDp(64).paddingDp(8);
        this.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(this){
            public final AudioActivity this$0;
            {
                this.this$0 = audioActivity;
            }

            public void onProgressChanged(SeekBar seekBar, int n4, boolean bl) {
                this.this$0.startText.setText((CharSequence)DateUtils.formatElapsedTime((long)(n4 / 1000)));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                AudioActivity.access$1200(this.this$0);
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                MediaControllerCompat.getMediaController((Activity)this.this$0).getTransportControls().seekTo((long)seekBar.getProgress());
                AudioActivity.access$1300(this.this$0);
            }
        });
    }

    public static boolean isCreated() {
        boolean bl = createdInstances > 0;
        return bl;
    }

    private boolean isLive() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat = this.newMetadata;
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat2 = AudioItemProvider.getCurrentItem();
        }
        return MediaUtils.isLive(mediaMetadataCompat2);
    }

    private boolean isPlaying() {
        PlaybackStateCompat playbackStateCompat = this.mPlaybackState;
        boolean bl = playbackStateCompat != null && playbackStateCompat.getState() == 3;
        return bl;
    }

    private /* synthetic */ void lambda$onCreate$0(View view) {
        createdInstances = 0;
        this.finish();
    }

    private static /* synthetic */ void lambda$saveVideoPosition$2(ResponseBody responseBody) {
    }

    private static /* synthetic */ void lambda$saveVideoPosition$3(Throwable throwable) {
        Log.e((String)"TV_Rain", (String)throwable.getMessage());
    }

    private /* synthetic */ void lambda$scheduleSeekbarUpdate$4() {
        this.mHandler.post(this.mUpdateProgressTask);
    }

    private /* synthetic */ void lambda$startPlayLogging$1(Long l4) {
        if (this.isPlaying()) {
            if (this.isLive()) {
                this.gtmLogLivePlayback();
            } else {
                this.gtmLogPlayback();
            }
        }
    }

    private void logContentEvent() {
    }

    private void movePositionBackALittle() {
        long l4 = this.positionToStart;
        if (l4 >= 3000L) {
            this.positionToStart = l4 - 3000L;
        }
        if (this.positionToStart > 0L) {
            this.updatePositionOnStart = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void parseIntent(Bundle bundle) {
        block8: {
            try {
                boolean bl;
                Intent intent = this.getIntent();
                if (intent == null || !(bl = intent.hasExtra(INTENT_EXTRA_METADATA)) && !intent.hasExtra(INTENT_EXTRA_METADATA_JSON)) break block8;
                if (intent.hasExtra(INTENT_EXTRA_METADATA_JSON)) {
                    String string = intent.getStringExtra(INTENT_EXTRA_METADATA_JSON);
                    if (string != null) {
                        this.newMetadata = MediaUtils.buildMetadataFromJsonStr(string);
                    }
                } else {
                    this.newMetadata = (MediaMetadataCompat)intent.getParcelableExtra(INTENT_EXTRA_METADATA);
                }
                this.positionToStart = intent.getLongExtra("position", 0L);
                if (bundle != null) {
                    this.resumed = true;
                    this.positionToStart = bundle.getInt("position", 0);
                } else {
                    this.movePositionBackALittle();
                }
            }
            catch (Exception exception) {
                this.newMetadata = null;
            }
        }
        if (this.newMetadata == null && AudioItemProvider.getCurrentItem() == null) {
            this.finish();
        }
    }

    private void scheduleSeekbarUpdate() {
        this.stopSeekbarUpdate();
        if (!this.mExecutorService.isShutdown()) {
            this.mScheduleFuture = this.mExecutorService.scheduleAtFixedRate((Runnable)new o(this, 0), 100L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void setAudio(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat != null) {
            AudioItemProvider.setCurrentItem(mediaMetadataCompat);
        }
        if ((mediaMetadataCompat = this.mTransportControls) != null) {
            mediaMetadataCompat.play();
        }
        this.mAudioLinearLayout.setVisibility(0);
    }

    private void showProgress() {
        this.playPauseButton.setVisibility(8);
        this.progress.setVisibility(0);
    }

    private void startPlayLogging() {
        if (TagManager.getSendPlaybackInterval() > 0L) {
            this.playLoggingSubscription = Observable.interval((long)TagManager.getSendPlaybackInterval(), (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new s4(this, 12), (Action1)new v1(26));
        }
    }

    private void stopPlayLogging() {
        Subscription subscription = this.playLoggingSubscription;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.playLoggingSubscription.unsubscribe();
        }
    }

    private void stopSeekbarUpdate() {
        ScheduledFuture<?> scheduledFuture = this.mScheduleFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void updateCurrentState() {
        PlaybackStateCompat playbackStateCompat = this.mPlaybackState;
        if (playbackStateCompat != null) {
            int n4 = playbackStateCompat.getState();
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 == 6) {
                            this.stopSeekbarUpdate();
                        }
                    } else {
                        this.hideProgress();
                        this.playPauseButton.setImageDrawable((Drawable)this.pauseDrawable);
                        if (this.updatePositionOnStart) {
                            this.updatePositionOnStart = false;
                            MediaControllerCompat.getMediaController((Activity)this).getTransportControls().seekTo(this.positionToStart);
                        }
                        this.scheduleSeekbarUpdate();
                    }
                } else {
                    this.playPauseButton.setImageDrawable((Drawable)this.playDrawable);
                    this.stopSeekbarUpdate();
                }
            } else {
                this.playPauseButton.setImageDrawable((Drawable)this.playDrawable);
                this.stopSeekbarUpdate();
            }
        }
    }

    private void updateDuration(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        LogHelper.d("TV_Rain", "updateDuration called ");
        int n4 = (int)mediaMetadataCompat.getLong("android.media.metadata.DURATION");
        this.seekBar.setMax(n4);
        this.endText.setText((CharSequence)DateUtils.formatElapsedTime((long)(n4 / 1000)));
    }

    private void updateProgramName() {
        ScheduleProgram scheduleProgram = this.currentlyOnAirGetter.getCurrentlyOnAir();
        if (scheduleProgram != null && this.isLive()) {
            this.programName.setText((CharSequence)scheduleProgram.program_name);
            this.programName.setVisibility(0);
        } else {
            this.programName.setText((CharSequence)"");
            this.programName.setVisibility(8);
        }
    }

    private void updateProgress() {
        long l4;
        PlaybackStateCompat playbackStateCompat = this.mPlaybackState;
        if (playbackStateCompat == null) {
            return;
        }
        long l5 = l4 = playbackStateCompat.getPosition();
        if (this.mPlaybackState.getState() != 2) {
            l5 = SystemClock.elapsedRealtime();
            long l6 = this.mPlaybackState.getLastPositionUpdateTime();
            float f = l4;
            float f2 = (int)(l5 - l6);
            l5 = (long)(this.mPlaybackState.getPlaybackSpeed() * f2 + f);
        }
        this.seekBar.setProgress((int)l5);
    }

    public static /* synthetic */ void z(AudioActivity audioActivity) {
        audioActivity.updateProgress();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @OnClick(value={2131296384})
    public void backToVideo() {
        MediaMetadataCompat mediaMetadataCompat = AudioItemProvider.getCurrentItem();
        try {
            Intent intent;
            if (this.isLive()) {
                this.startLiveActivity(true);
                this.finish();
                return;
            }
            boolean bl = MediaUtils.isSavedVideo(mediaMetadataCompat);
            long l4 = 0L;
            if (bl) {
                intent = new Intent((Context)this, LocalVideoActivity.class);
                intent.putExtra("video", (Parcelable)MediaUtils.getSavedVideoHolderFromMetadata(mediaMetadataCompat));
                intent.putExtra("from", "Downloaded");
                intent.putExtra("FROM_AUDIO", "1");
                mediaMetadataCompat = this.mPlaybackState;
                if (mediaMetadataCompat != null) {
                    long l5;
                    long l6 = l5 = mediaMetadataCompat.getPosition();
                    if (l5 > 3000L) {
                        l6 = l5 - 3000L;
                    }
                    if (l6 < 0L) {
                        l6 = l4;
                    }
                    intent.putExtra("position", l6);
                }
                this.startActivity(intent);
                this.finish();
                return;
            }
            intent = new Intent((Context)this, VideoActivity.class);
            IVideo iVideo = MediaUtils.getVideoFromMetadata(mediaMetadataCompat);
            if (iVideo instanceof Video) {
                intent.putExtra("video", (Serializable)((Video)iVideo));
            } else if (iVideo instanceof AutoVideo) {
                intent.putExtra("auto_video", (Serializable)((AutoVideo)iVideo));
            }
            intent.putExtra("article", (Serializable)MediaUtils.getArticleFromMetadata(mediaMetadataCompat));
            intent.putExtra("FROM_AUDIO", "1");
            mediaMetadataCompat = this.mPlaybackState;
            if (mediaMetadataCompat != null) {
                long l7;
                long l8 = l7 = mediaMetadataCompat.getPosition();
                if (l7 > 3000L) {
                    l8 = l7 - 3000L;
                }
                if (l8 >= 0L) {
                    l4 = l8;
                }
                intent.putExtra("position", l4);
            }
            this.startActivity(intent);
            this.finish();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public int getLayoutResource() {
        return 2131492893;
    }

    public void gtmLogLivePlayback() {
        this.tagManager.logEvent("live_streaming", null, DataLayer.mapOf((Object[])new Object[]{"live_type", "audio", "duration", TagManager.getSendPlaybackInterval()}));
    }

    public void gtmLogPlayback() {
        Map<String, Object> map = this.gtmGetVideoInfo();
        map.put((Object)"duration", (Object)TagManager.getSendPlaybackInterval());
        Object object = this.mVideo;
        if (object != null && !TextUtils.isEmpty((CharSequence)object.getVideoName())) {
            map.put((Object)"video_title", (Object)this.mVideo.getVideoName());
        } else {
            object = this.mArticle;
            if (object != null) {
                map.put((Object)"video_title", (Object)object.name);
            } else {
                object = this.newMetadata;
                if (object != null) {
                    map.put((Object)"video_title", (Object)object.getString("android.media.metadata.TITLE"));
                }
            }
        }
        object = "Doc/";
        Article article = this.mArticle;
        String string = "1";
        if (article != null) {
            map.put((Object)"category", (Object)article.getProgramName());
            object = this.mArticle.isFull() ? string : "0";
            map.put((Object)"full_version", object);
            object = new StringBuilder();
            object.append("Doc/");
            object.append(this.mArticle.id);
            object = object.toString();
        } else if (this.newMetadata != null) {
            map.put((Object)"full_version", (Object)"1");
            object = new StringBuilder();
            object.append("Doc/");
            object.append(this.newMetadata.getString("android.media.metadata.MEDIA_ID"));
            object = object.toString();
        }
        this.tagManager.logEvent("audio", (String)object, map);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parseIntent(bundle);
        this.mArticle = this.getArticleFromMetadata();
        this.mVideo = this.getVideoFromMetadata();
        this.initViews();
        this.initAudioService();
        this.logContentEvent();
        this.startPlayLogging();
        ++createdInstances;
        this.toolbar.setNavigationOnClickListener((View.OnClickListener)new c0(this, 2));
        this.updateProgramName();
    }

    @Override
    public void onDestroy() {
        int n4 = createdInstances;
        if (n4 > 0) {
            createdInstances = n4 - 1;
        }
        this.stopSeekbarUpdate();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.parseIntent(null);
        this.mArticle = this.getArticleFromMetadata();
        this.mVideo = this.getVideoFromMetadata();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.stopPlayLogging();
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.mSessionCallback);
        }
        if ((mediaControllerCompat = this.mMediaBrowser) != null) {
            mediaControllerCompat.disconnect();
        }
    }

    @Override
    public void onResume() {
        MediaBrowserCompat mediaBrowserCompat;
        super.onResume();
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().show();
        }
        if ((mediaBrowserCompat = this.mMediaBrowser) != null) {
            mediaBrowserCompat.connect();
        }
        this.startPlayLogging();
    }

    public void onSaveInstanceState(Bundle bundle) {
        try {
            bundle.putInt("position", Long.valueOf((long)this.mPlaybackState.getPosition()).intValue());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onSaveInstanceState(bundle);
    }

    @Subscribe
    public void onScheduleChangeEvent(ScheduleChangedEvent scheduleChangedEvent) {
        this.updateProgramName();
    }

    public void saveVideoPosition() {
        this.saveVideoPosition(this.mVideo);
    }

    public void saveVideoPosition(IVideo iVideo) {
        long l4 = this.mPlaybackState.getPosition();
        if (iVideo != null && l4 != 0L) {
            this.rainApi.setVideoPosition(this.getAuthorization(), iVideo.getVideoId(), l4).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v1(27), (Action1)new v1(28));
        }
    }

    @OnClick(value={2131297008})
    public void togglePlayState() {
        PlaybackStateCompat playbackStateCompat = this.mPlaybackState;
        if (playbackStateCompat != null && this.mTransportControls != null) {
            if (playbackStateCompat.getState() == 3) {
                this.saveVideoPosition();
                this.mTransportControls.pause();
            } else if (this.mPlaybackState.getState() == 2 || this.mPlaybackState.getState() == 1) {
                try {
                    if (this.mPlaybackState.getPosition() >= (long)(this.seekBar.getMax() - 1000) && !this.isLive()) {
                        this.mTransportControls.seekTo(0L);
                        this.mTransportControls.play();
                        this.showProgress();
                        return;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                this.mTransportControls.play();
            }
        }
    }
}


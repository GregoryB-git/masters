/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.google.android.gms.cast.MediaInfo$Builder
 *  com.google.android.gms.cast.MediaMetadata
 *  com.google.android.gms.common.images.WebImage
 *  com.google.android.gms.tagmanager.DataLayer
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.TimeUnit
 *  ru.tvrain.core.data.Playlist
 *  ru.tvrain.core.data.PlaylistVideo
 *  ru.tvrain.core.data.Quality
 *  rx.Observable
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.cast.CastActivity$PlaybackLocation
 */
package com.hintsolutions.raintv.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.utils.DFPHelper;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.data.Playlist;
import ru.tvrain.core.data.PlaylistVideo;
import ru.tvrain.core.data.Quality;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.cast.CastActivity;

public class PlaylistActivity
extends VideoStreamActivity {
    public static final String INTENT_EXTRA_CODE = "code";
    public static final String LIVE = "live";
    private String code;
    private PlaylistVideo currentVideo = null;
    private long id;
    private String mDeepLink;
    private Playlist playlist;

    public static /* synthetic */ String F(PlaylistActivity playlistActivity) {
        return playlistActivity.lambda$setQuality$4();
    }

    public static /* synthetic */ void G(PlaylistActivity playlistActivity, List list) {
        playlistActivity.lambda$getPlaylistInfo$2(list);
    }

    public static /* synthetic */ void H(PlaylistActivity playlistActivity) {
        playlistActivity.lambda$setQuality$5();
    }

    public static /* synthetic */ void I(PlaylistActivity playlistActivity) {
        playlistActivity.lambda$setQuality$6();
    }

    public static /* synthetic */ void J(PlaylistActivity playlistActivity, Throwable throwable) {
        playlistActivity.lambda$getPlaylistInfo$3(throwable);
    }

    public static /* synthetic */ void K(PlaylistActivity playlistActivity, Long l4) {
        playlistActivity.lambda$onCreate$0(l4);
    }

    public static /* synthetic */ void L(PlaylistActivity playlistActivity, View view) {
        playlistActivity.lambda$updateProgramName$1(view);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void checkCastSession() {
        try {
            if (this.getCastSession() != null && !this.getCastSession().getRemoteMediaClient().getMediaInfo().getMetadata().getString("article_id").equals((Object)LIVE)) {
                this.startCast();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private String getLogScreenName() {
        StringBuilder stringBuilder = z2.t("Playlist/");
        stringBuilder.append(this.playlist.code);
        return stringBuilder.toString();
    }

    private void getPlaylistInfo() {
        this.showProgressDialog();
        this.addSubscription(this.rainApi.playlists(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new s3(this, 1), (Action1)new s3(this, 2)));
    }

    private /* synthetic */ void lambda$getPlaylistInfo$2(List list2) {
        for (List list2 : list2) {
            String string = this.code;
            if ((string == null || !string.equals((Object)list2.code)) && this.id != (long)list2.id.intValue()) continue;
            this.playlist = list2;
            break;
        }
        this.logOpenView();
        this.hideProgressDialog();
        if (this.playlist != null) {
            this.getSupportActionBar().setTitle((CharSequence)this.playlist.name);
        }
        this.setQuality(this.mQuality);
    }

    private /* synthetic */ void lambda$getPlaylistInfo$3(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$onCreate$0(Long l4) {
        this.updateProgramName();
    }

    private /* synthetic */ String lambda$setQuality$4() throws Exception {
        return DFPHelper.addCustomAdTargetingOnAir(this.userManager, this.currentlyOnAirGetter.getCurrentlyOnAir());
    }

    private /* synthetic */ void lambda$setQuality$5() {
        if (!this.videoView.isPreventAutoplay() && !this.videoView.isAdsRequestSent()) {
            this.videoView.start();
        }
    }

    private /* synthetic */ void lambda$setQuality$6() {
        this.videoView.setPreventAutoplay(true);
        this.videoView.reset();
        this.videoView.setVideoURI(this.mQuality.getUri(this.playlist));
    }

    private /* synthetic */ void lambda$updateProgramName$1(View view) {
        view = new Intent((Context)this, NewsActivity.class);
        view.putExtra("id", (Serializable)this.currentVideo.articleId);
        this.startActivity((Intent)view);
    }

    private void logOpenView() {
        String string = this.mDeepLink != null ? "1" : "0";
        string = DataLayer.mapOf((Object[])new Object[]{"referrer", string});
        this.tagManager.logOpenView(this.getLogScreenName(), (Map)string);
    }

    private void updateProgramName() {
        Date date = new Date();
        Playlist playlist = this.playlist;
        if (playlist != null && (playlist = playlist.videos) != null) {
            PlaylistVideo playlistVideo = null;
            Iterator iterator = playlist.iterator();
            do {
                playlist = playlistVideo;
            } while (iterator.hasNext() && (!date.after((playlist = (PlaylistVideo)iterator.next()).getStartDate()) || !date.before(playlist.getEndDate())));
            if (playlist == null) {
                this.programName.setVisibility(8);
            } else {
                playlistVideo = this.currentVideo;
                if (playlistVideo == null || !playlist.articleId.equals((Object)playlistVideo.articleId)) {
                    this.currentVideo = playlist;
                    this.programName.setText((CharSequence)playlist.articleName);
                    this.programName.setVisibility(0);
                    this.programName.setClickable(true);
                    this.programName.setOnClickListener((View.OnClickListener)new o1((KeyEvent.Callback)this, 2));
                }
            }
        }
    }

    @Override
    public String getQualityPrefsFieldName() {
        return "live_quality";
    }

    @Override
    public Object getVideoObject() {
        return this.playlist;
    }

    @Override
    public void gtmLogEvent(String string) {
        Map map = DataLayer.mapOf((Object[])new Object[0]);
        TagManager tagManager = this.tagManager;
        StringBuilder stringBuilder = z2.t("Playlist/");
        stringBuilder.append(this.code);
        tagManager.logEvent(string, stringBuilder.toString(), map);
    }

    @Override
    public void gtmLogPlayback() {
        this.tagManager.logEvent("playlist", null, DataLayer.mapOf((Object[])new Object[]{"live_type", "video", "duration", TagManager.getSendPlaybackInterval()}));
    }

    @Override
    public boolean isAudioAvailable() {
        return false;
    }

    @Override
    public boolean isQualityChangeSupported() {
        return false;
    }

    @Override
    public void onAdsLoadedOrFailed() {
        super.onAdsLoadedOrFailed();
        this.updateProgramName();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131099756)));
        }
        this.code = this.getIntent().getStringExtra(INTENT_EXTRA_CODE);
        this.id = this.getIntent().getLongExtra("id", 0L);
        this.mDeepLink = this.getIntent().getStringExtra("link");
        this.getPlaylistInfo();
        this.updateProgramName();
        this.addSubscription(Observable.interval((long)10L, (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new s3(this, 0), (Action1)new z3(5)));
    }

    @Override
    public void onResume() {
        super.onResume();
        this.checkCastSession();
    }

    @Override
    public void setQuality(Quality object) {
        ExoVideoView exoVideoView = this.videoView;
        if (exoVideoView != null && exoVideoView.isPlaying() && (exoVideoView = this.mQuality) != null && object != null && exoVideoView == object) {
            return;
        }
        this.mQuality = object == null ? Quality.AUTO : object;
        try {
            exoVideoView = this.videoView;
            object = new s2(this, 2);
            exoVideoView.setCustParamsCreator((Callable<String>)object);
            this.videoView.setVideoURI(this.mQuality.getUri(this.playlist));
            this.videoView.setHidePositionControls(true);
            exoVideoView = this.videoView;
            object = new s3(this, 3);
            exoVideoView.setOnPreparedListener((OnPreparedListener)object);
            exoVideoView = this.videoView;
            object = new s3(this, 4);
            exoVideoView.setOnCompletionListener((OnCompletionListener)object);
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
            this.finish();
            return;
        }
        this.saveQuality("live_quality", this.mQuality);
    }

    @Override
    public void startAudioActivity() {
        this.startAudioLiveActivity();
        this.finish();
    }

    @Override
    public void startCast() {
        block6: {
            Object object;
            if (this.mQuality == null) {
                this.mQuality = Quality.AUTO;
            }
            if (this.mQuality.getUri(this.playlist) == null || (object = this.mQuality.getUri(this.playlist)) == null) break block6;
            String string = object.toString();
            object = string;
            try {
                if (string.startsWith("https://strm.yandex.ru/")) {
                    object = new StringBuilder();
                    object.append(string);
                    object.append("&dvr=181");
                    object = object.toString();
                }
                string = new MediaMetadata(1);
                string.putString("article_id", LIVE);
                string.putString("com.google.android.gms.cast.metadata.TITLE", this.playlist.name);
                string.putString("com.google.android.gms.cast.metadata.SUBTITLE", this.getString(2131755273));
                WebImage webImage = new WebImage(Uri.parse((String)"https://s79369.cdn.ngenix.net/media/photo/original/20160622/e3e813046482504e2d341c71149dac9d.png"));
                string.addImage(webImage);
                webImage = new WebImage(Uri.parse((String)"https://s79369.cdn.ngenix.net/media/photo/original/20160622/e3e813046482504e2d341c71149dac9d.png"));
                string.addImage(webImage);
                webImage = new MediaInfo.Builder((String)object);
                this.castMedia(webImage.setContentType("application/vnd.apple.mpegurl").setStreamType(2).setStreamDuration(-1L).setMetadata((MediaMetadata)string).build(), 0);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public void startVideo() {
        if (CastActivity.getPlaybackLocation() == CastActivity.PlaybackLocation.REMOTE) {
            this.getCastLayout().setVisibility(0);
            return;
        }
        this.getCastLayout().setVisibility(8);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"video");
            hashMap.put((Object)"action", (Object)"playlist");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.setQuality(this.mQuality);
    }

    @Override
    public void updateViewsWithOrientation(boolean bl) {
        super.updateViewsWithOrientation(bl);
        TextView textView = this.programName;
        int n4 = bl ? 8 : 0;
        textView.setVisibility(n4);
    }
}


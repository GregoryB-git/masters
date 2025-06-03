/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.google.android.gms.cast.MediaInfo$Builder
 *  com.google.android.gms.cast.MediaMetadata
 *  com.google.android.gms.common.images.WebImage
 *  com.google.android.gms.tagmanager.DataLayer
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  ru.tvrain.core.data.Live
 *  ru.tvrain.core.data.Quality
 *  ru.tvrain.core.data.ScheduleProgram
 *  rx.Observable
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.cast.CastActivity$PlaybackLocation
 *  tvrain.services.bus.events.ScheduleChangedEvent
 */
package com.hintsolutions.raintv.video;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.utils.DFPHelper;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import com.squareup.otto.Subscribe;
import java.util.HashMap;
import java.util.Map;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.Quality;
import ru.tvrain.core.data.ScheduleProgram;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.cast.CastActivity;
import tvrain.services.bus.events.ScheduleChangedEvent;

public class LiveActivity
extends VideoStreamActivity {
    public static final String LIVE = "live";
    private boolean adsLoadedEventReceived = false;
    private Live mLive;

    public static /* synthetic */ void F(LiveActivity liveActivity, Throwable throwable) {
        liveActivity.lambda$getStreamUrls$4(throwable);
    }

    public static /* synthetic */ void G(Throwable throwable) {
        LiveActivity.lambda$checkCastSession$6(throwable);
    }

    public static /* synthetic */ void H(LiveActivity liveActivity, Live live) {
        liveActivity.lambda$checkCastSession$5(live);
    }

    public static /* synthetic */ String I(LiveActivity liveActivity) {
        return liveActivity.lambda$setQuality$0();
    }

    public static /* synthetic */ void J(LiveActivity liveActivity) {
        liveActivity.lambda$setQuality$1();
    }

    public static /* synthetic */ void K(LiveActivity liveActivity, Live live) {
        liveActivity.lambda$getStreamUrls$3(live);
    }

    public static /* synthetic */ void L(LiveActivity liveActivity) {
        liveActivity.lambda$setQuality$2();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void checkCastSession() {
        try {
            if (this.getCastSession() != null && !this.getCastSession().getRemoteMediaClient().getMediaInfo().getMetadata().getString("article_id").equals((Object)LIVE)) {
                Observable observable = this.rainApi.live(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                r2 r22 = new r2(this, 4);
                z3 z32 = new z3(3);
                this.addSubscription(observable.subscribe((Action1)r22, (Action1)z32));
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ void lambda$checkCastSession$5(Live live) {
        try {
            this.mLive = live;
            this.startCast();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static /* synthetic */ void lambda$checkCastSession$6(Throwable throwable) {
    }

    private /* synthetic */ void lambda$getStreamUrls$3(Live live) {
        try {
            this.mLive = live;
            this.setQuality(this.mQuality);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$getStreamUrls$4(Throwable throwable) {
        Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
        this.finish();
    }

    private /* synthetic */ String lambda$setQuality$0() throws Exception {
        return DFPHelper.addCustomAdTargetingOnAir(this.userManager, this.currentlyOnAirGetter.getCurrentlyOnAir());
    }

    private /* synthetic */ void lambda$setQuality$1() {
        if (!this.videoView.isPreventAutoplay() && !this.videoView.isAdsRequestSent()) {
            this.videoView.start();
        }
    }

    private /* synthetic */ void lambda$setQuality$2() {
        this.videoView.setPreventAutoplay(true);
        this.videoView.reset();
        this.videoView.setVideoURI(this.mQuality.getUri(this.mLive));
    }

    private void updateProgramName() {
        ScheduleProgram scheduleProgram = this.currentlyOnAirGetter.getCurrentlyOnAir();
        if (scheduleProgram != null) {
            this.programName.setText((CharSequence)scheduleProgram.getFullName());
        } else {
            this.programName.setText((CharSequence)"");
        }
        if (scheduleProgram != null && this.adsLoadedEventReceived) {
            this.programName.setVisibility(0);
        } else {
            this.programName.setVisibility(8);
        }
    }

    @Override
    public String getQualityPrefsFieldName() {
        return "live_quality";
    }

    public void getStreamUrls() {
        this.addSubscription(this.rainApi.live(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new r2(this, 0), (Action1)new r2(this, 1)));
    }

    @Override
    public Object getVideoObject() {
        return this.mLive;
    }

    @Override
    public void gtmLogEvent(String string) {
        Map map = DataLayer.mapOf((Object[])new Object[]{"quality", this.mQuality.toShortString()});
        this.tagManager.logEvent(string, "Live", map);
    }

    @Override
    public void gtmLogPlayback() {
        this.tagManager.logEvent("live_streaming", null, DataLayer.mapOf((Object[])new Object[]{"live_type", "video", "duration", TagManager.getSendPlaybackInterval()}));
    }

    @Override
    public boolean isAudioAvailable() {
        return true;
    }

    @Override
    public void onAdsLoadedOrFailed() {
        super.onAdsLoadedOrFailed();
        this.adsLoadedEventReceived = true;
        this.updateProgramName();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131099756)));
        }
        this.tagManager.logOpenView("Live");
        this.adsLoadedEventReceived = false;
        this.updateProgramName();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.checkCastSession();
    }

    @Subscribe
    public void onScheduleChangeEvent(ScheduleChangedEvent scheduleChangedEvent) {
        this.updateProgramName();
    }

    @Override
    public void setQuality(Quality object) {
        Object object2 = this.videoView;
        if (object2 != null && object2.isPlaying() && (object2 = this.mQuality) != null && object != null && object2 == object) {
            return;
        }
        this.mQuality = object == null ? Quality.AUTO : object;
        try {
            object2 = this.videoView;
            s2 s22 = new s2(this, 0);
            object2.setCustParamsCreator(s22);
            this.videoView.setHidePositionControls(true);
            this.videoView.setQuality((Quality)object);
            object2 = this.videoView;
            object = new r2(this, 2);
            object2.setOnPreparedListener((OnPreparedListener)object);
            this.videoView.setVideoURI(this.mQuality.getUri(this.mLive));
            object = this.videoView;
            object2 = new r2(this, 3);
            ((VideoView)((Object)object)).setOnCompletionListener((OnCompletionListener)object2);
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
            if (this.mQuality.getUri(this.mLive) == null || (object = this.mQuality.getUri(this.mLive)) == null) break block6;
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
                string.putString("com.google.android.gms.cast.metadata.TITLE", "\u041f\u0440\u044f\u043c\u043e\u0439 \u044d\u0444\u0438\u0440");
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
        this.getStreamUrls();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"video");
            hashMap.put((Object)"action", (Object)LIVE);
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void updateViewsWithOrientation(boolean bl) {
        super.updateViewsWithOrientation(bl);
        TextView textView = this.programName;
        int n4 = bl ? 8 : 0;
        textView.setVisibility(n4);
    }
}


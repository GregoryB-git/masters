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
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 *  androidx.appcompat.app.ActionBar
 *  com.google.android.gms.cast.MediaInfo$Builder
 *  com.google.android.gms.cast.MediaMetadata
 *  com.google.android.gms.common.images.WebImage
 *  com.google.android.gms.tagmanager.DataLayer
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Audio
 *  ru.tvrain.core.data.AutoVideo
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.Quality
 *  ru.tvrain.core.utils.ListUtils
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
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.utils.DFPHelper;
import com.hintsolutions.raintv.utils.MediaUtils;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Audio;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.Quality;
import ru.tvrain.core.utils.ListUtils;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.cast.CastActivity;

public class VideoActivity
extends VideoStreamActivity {
    private Article mArticle;
    private IVideo mVideo;

    public static /* synthetic */ void F(VideoActivity videoActivity, Throwable throwable) {
        videoActivity.lambda$startAudioActivity$2(throwable);
    }

    public static /* synthetic */ void G(VideoActivity videoActivity, ArrayList arrayList) {
        videoActivity.lambda$startAudioActivity$1(arrayList);
    }

    public static /* synthetic */ boolean H(Exception exception) {
        return VideoActivity.lambda$startVideo$7(exception);
    }

    public static /* synthetic */ void I(ResponseBody responseBody) {
        VideoActivity.lambda$saveVideoPosition$3(responseBody);
    }

    public static /* synthetic */ void J(VideoActivity videoActivity) {
        videoActivity.lambda$startVideo$8();
    }

    public static /* synthetic */ String K(VideoActivity videoActivity) {
        return videoActivity.lambda$startVideo$5();
    }

    public static /* synthetic */ void L(Throwable throwable) {
        VideoActivity.lambda$saveVideoPosition$4(throwable);
    }

    public static /* synthetic */ void M(VideoActivity videoActivity) {
        videoActivity.lambda$startVideo$6();
    }

    public static /* synthetic */ void N(VideoActivity videoActivity, View view) {
        videoActivity.lambda$onCreate$0(view);
    }

    private Map<String, Object> gtmGetVideoInfo() {
        int n4 = this.mArticle.id;
        String string = this.mArticle.isFull() ? "1" : "0";
        string = DataLayer.mapOf((Object[])new Object[]{"video_id", n4, "full_version", string, "quality", this.mQuality.toShortString()});
        if (!TextUtils.isEmpty((CharSequence)this.mVideo.getVideoDuration())) {
            string.put((Object)"length", (Object)(Long.parseLong((String)this.mVideo.getVideoDuration()) / 1000L));
        }
        return string;
    }

    private /* synthetic */ void lambda$onCreate$0(View view) {
        this.saveVideoPosition();
        this.finish();
    }

    private static /* synthetic */ void lambda$saveVideoPosition$3(ResponseBody responseBody) {
    }

    private static /* synthetic */ void lambda$saveVideoPosition$4(Throwable throwable) {
        Log.d((String)"TV_Rain", (String)throwable.getMessage());
    }

    private /* synthetic */ void lambda$startAudioActivity$1(ArrayList arrayList) {
        this.hideProgressDialog();
        if (ListUtils.getListSize((List)arrayList) > 0) {
            Intent intent = new Intent((Context)this, AudioActivity.class);
            intent.putExtra("metadata", (Parcelable)MediaUtils.buildMediaMetadataForArticle(this.mArticle, (Audio)arrayList.get(0), this.mVideo));
            intent.putExtra("metadata_json", MediaUtils.buildMetadataJsonFromArticle(this.mArticle, (Audio)arrayList.get(0), this.mVideo));
            intent.putExtra("position", this.videoView.getCurrentPosition());
            this.startActivity(intent);
            this.finish();
        } else {
            this.showErrorDialog(this.getString(2131755234));
        }
    }

    private /* synthetic */ void lambda$startAudioActivity$2(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ String lambda$startVideo$5() throws Exception {
        return DFPHelper.addCustomAdTargetingForVideo(this.userManager, this.mArticle, this.mVideo);
    }

    private /* synthetic */ void lambda$startVideo$6() {
        try {
            if (!this.videoView.isPreventAutoplay() && !this.videoView.isAdsRequestSent()) {
                this.videoView.start();
            }
            this.handler.sendEmptyMessageDelayed(1, 3000L);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static /* synthetic */ boolean lambda$startVideo$7(Exception exception) {
        return true;
    }

    private /* synthetic */ void lambda$startVideo$8() {
        this.videoView.setPreventAutoplay(true);
        this.videoView.reset();
        this.videoView.setVideoURI(this.mVideo.getUri(this.mQuality));
    }

    private void parseIntent(Intent intent, Bundle bundle) {
        if (intent == null) {
            this.finish();
            return;
        }
        this.mVideo = null;
        if (intent.hasExtra("video")) {
            this.mVideo = (IVideo)intent.getSerializableExtra("video");
        } else if (intent.hasExtra("auto_video")) {
            this.mVideo = (AutoVideo)intent.getSerializableExtra("auto_video");
        }
        IVideo iVideo = this.mVideo;
        if (iVideo != null && iVideo.getVideoName() != null && this.mVideo.getVideoDuration() != null && this.mVideo.hasVideoStreams()) {
            try {
                if (intent.hasExtra("article")) {
                    this.mArticle = (Article)intent.getSerializableExtra("article");
                }
                if (this.getSupportActionBar() != null) {
                    this.getSupportActionBar().setTitle((CharSequence)this.mArticle.name);
                    ActionBar actionBar = this.getSupportActionBar();
                    iVideo = new ColorDrawable(this.getResources().getColor(2131099756));
                    actionBar.setBackgroundDrawable((Drawable)iVideo);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (intent.hasExtra("position")) {
                this.mCurrentPosition = intent.getLongExtra("position", 0L);
            }
            if (bundle != null) {
                this.mCurrentPosition = bundle.getLong("position", 0L);
            }
            try {
                if (intent.getBooleanExtra("start_casting", false)) {
                    this.startCast();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        }
        Toast.makeText((Context)this, (CharSequence)"\u0412\u0438\u0434\u0435\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e.", (int)0).show();
        this.finish();
    }

    private void trackVideoView() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"video");
            hashMap.put((Object)"action", (Object)"archive");
            hashMap.put((Object)"label", (Object)String.valueOf((Object)this.mArticle.name));
            hashMap.put((Object)"value", (Object)String.valueOf((int)this.mArticle.id));
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String getQualityPrefsFieldName() {
        return "video_quality";
    }

    @Override
    public Object getVideoObject() {
        return this.mArticle;
    }

    @Override
    public void gtmLogEvent(String string) {
        if (this.mArticle != null && this.mVideo != null) {
            TagManager tagManager = this.tagManager;
            StringBuilder stringBuilder = z2.t("Doc/");
            stringBuilder.append(this.mArticle.id);
            tagManager.logEvent(string, stringBuilder.toString(), this.gtmGetVideoInfo());
        }
    }

    @Override
    public void gtmLogPlayback() {
        Map<String, Object> map = this.gtmGetVideoInfo();
        map.put((Object)"video_title", (Object)this.mArticle.name);
        map.put((Object)"duration", (Object)TagManager.getSendPlaybackInterval());
        map.put((Object)"category", (Object)this.mArticle.getProgramName());
        String string = this.mArticle.isFull() ? "1" : "0";
        map.put((Object)"full_version", (Object)string);
        TagManager tagManager = this.tagManager;
        string = z2.t("Doc/");
        string.append(this.mArticle.id);
        tagManager.logEvent("video", string.toString(), map);
    }

    @Override
    public boolean isAudioAvailable() {
        return true;
    }

    public void onBackPressed() {
        this.saveVideoPosition();
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parseIntent(this.getIntent(), bundle);
        this.trackVideoView();
        this.toolbar.setNavigationOnClickListener((View.OnClickListener)new o1((KeyEvent.Callback)this, 3));
    }

    @Override
    public void saveVideoPosition() {
        long l4 = this.videoView.getCurrentPosition();
        if (this.mVideo != null && l4 != 0L) {
            this.rainApi.setVideoPosition(this.getAuthorization(), this.mVideo.getVideoId(), l4).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new z3(6), (Action1)new z3(7));
        }
    }

    @Override
    public void setQuality(Quality quality) {
        this.mQuality = quality == null ? Quality.AUTO : quality;
        try {
            this.mCurrentPosition = this.videoView.getCurrentPosition();
            this.videoView.setQuality(quality);
            this.videoView.setVideoURI(this.mVideo.getUri(this.mQuality));
            if (this.mCurrentPosition != 0L) {
                quality = new StringBuilder();
                quality.append("seekTo2");
                quality.append(this.mCurrentPosition);
                Log.d((String)"adTag", (String)quality.toString());
                this.videoView.seekTo((int)this.mCurrentPosition);
            }
            this.saveQuality("video_quality", this.mQuality);
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
            this.finish();
        }
    }

    @Override
    public void startAudioActivity() {
        if (this.mArticle == null) {
            return;
        }
        this.showProgressDialog();
        this.addSubscription(this.rainApi.getArticleAudio(this.getAuthorization(), String.valueOf((int)this.mArticle.id)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new f5(this, 2), (Action1)new f5(this, 3)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void startCast() {
        long l4;
        block6: {
            long l5;
            l4 = l5 = -1L;
            if (this.mVideo.getVideoDuration() == null) break block6;
            boolean bl = this.mVideo.getVideoDuration().isEmpty();
            l4 = l5;
            if (bl) break block6;
            try {
                l4 = Long.parseLong((String)this.mVideo.getVideoDuration());
            }
            catch (Exception exception) {
                l4 = l5;
            }
        }
        try {
            String string;
            String string2 = string = this.mVideo.getUri(this.mQuality).toString();
            if (string.startsWith("https://strm.yandex.ru/")) {
                string2 = new StringBuilder();
                string2.append(string);
                string2.append("&dvr=181");
                string2 = string2.toString();
            }
            string = new MediaMetadata(1);
            string.putString("article_id", String.valueOf((int)this.mArticle.id));
            string.putString("com.google.android.gms.cast.metadata.TITLE", this.mVideo.getVideoName());
            string.putString("com.google.android.gms.cast.metadata.SUBTITLE", this.getString(2131755273));
            WebImage webImage = new WebImage(Uri.parse((String)"https://s79369.cdn.ngenix.net/media/photo/original/20160622/e3e813046482504e2d341c71149dac9d.png"));
            string.addImage(webImage);
            webImage = new WebImage(Uri.parse((String)"https://s79369.cdn.ngenix.net/media/photo/original/20160622/e3e813046482504e2d341c71149dac9d.png"));
            string.addImage(webImage);
            webImage = new MediaInfo.Builder(string2);
            this.castMedia(webImage.setContentType("application/vnd.apple.mpegurl").setStreamType(1).setStreamDuration(l4).setMetadata((MediaMetadata)string).build(), (int)this.videoView.getCurrentPosition());
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void startVideo() {
        if (CastActivity.getPlaybackLocation() == CastActivity.PlaybackLocation.REMOTE) {
            this.getCastLayout().setVisibility(0);
            return;
        }
        this.getCastLayout().setVisibility(8);
        Object object = this.videoView;
        if (object != null && object.isPlaying()) {
            return;
        }
        try {
            object = this.videoView;
            Object object2 = new s2(this, 3);
            object.setCustParamsCreator((Callable<String>)object2);
            this.videoView.setQuality(this.mQuality);
            object2 = this.videoView;
            object = new f5(this, 0);
            ((ExoVideoView)((Object)object2)).setOnPreparedListener((OnPreparedListener)object);
            this.videoView.setVideoURI(this.mVideo.getUri(this.mQuality));
            if (this.mCurrentPosition != 0L) {
                object = new StringBuilder();
                object.append("seekTo1, ");
                object.append(this.mCurrentPosition);
                Log.d((String)"adTag", (String)object.toString());
                this.videoView.seekTo((int)this.mCurrentPosition);
            }
            object2 = this.videoView;
            object = new z3(8);
            ((VideoView)((Object)object2)).setOnErrorListener((OnErrorListener)object);
            object2 = this.videoView;
            object = new f5(this, 1);
            ((VideoView)((Object)object2)).setOnCompletionListener((OnCompletionListener)object);
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
            this.finish();
        }
    }
}


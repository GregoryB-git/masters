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
 *  android.view.KeyEvent$Callback
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.gms.tagmanager.DataLayer
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  ru.tvrain.core.data.Quality
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
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.services.video.SavedVideos;
import com.hintsolutions.raintv.utils.DFPHelper;
import com.hintsolutions.raintv.utils.MediaUtils;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import ru.tvrain.core.data.Quality;
import tvrain.cast.CastActivity;

public class LocalVideoActivity
extends VideoStreamActivity {
    private MediaSource mediaSource;
    private SavedVideoHolder savedVideoHolder;

    public static /* synthetic */ String F(LocalVideoActivity localVideoActivity) {
        return localVideoActivity.lambda$startVideo$1();
    }

    public static /* synthetic */ void G(LocalVideoActivity localVideoActivity, View view) {
        localVideoActivity.lambda$onCreate$0(view);
    }

    public static /* synthetic */ void H(LocalVideoActivity localVideoActivity) {
        localVideoActivity.lambda$startVideo$2();
    }

    public static /* synthetic */ boolean I(Exception exception) {
        return LocalVideoActivity.lambda$startVideo$4(exception);
    }

    public static /* synthetic */ void J(LocalVideoActivity localVideoActivity) {
        localVideoActivity.lambda$startVideo$3();
    }

    private /* synthetic */ void lambda$onCreate$0(View view) {
        this.saveVideoPosition();
        this.finish();
    }

    private /* synthetic */ String lambda$startVideo$1() throws Exception {
        return DFPHelper.addMainAdTargetingString(this.userManager);
    }

    private /* synthetic */ void lambda$startVideo$2() {
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

    private /* synthetic */ void lambda$startVideo$3() {
        this.videoView.setPreventAutoplay(true);
        this.videoView.reset();
        this.setVideoUri();
    }

    private static /* synthetic */ boolean lambda$startVideo$4(Exception exception) {
        return true;
    }

    private int parseDuration(String stringArray) {
        stringArray = stringArray.split(":");
        int n4 = Integer.parseInt((String)stringArray[0]);
        return Integer.parseInt((String)stringArray[1]) + n4 * 60;
    }

    private void parseIntent(Intent intent, Bundle bundle) {
        if (intent == null) {
            this.finish();
            return;
        }
        if (intent.hasExtra("video")) {
            SavedVideoHolder savedVideoHolder;
            this.savedVideoHolder = savedVideoHolder = (SavedVideoHolder)intent.getParcelableExtra("video");
            if (savedVideoHolder != null && savedVideoHolder.name != null) {
                if (savedVideoHolder.filePath == null) {
                    savedVideoHolder = ((RainApplication)this.getApplication()).getMediaSourceForUrl(this.savedVideoHolder.url);
                    this.mediaSource = savedVideoHolder;
                    if (savedVideoHolder == null) {
                        Toast.makeText((Context)this, (CharSequence)"\u0412\u0438\u0434\u0435\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e.", (int)0).show();
                        this.finish();
                        return;
                    }
                }
                if (intent.hasExtra("position")) {
                    this.mCurrentPosition = intent.getLongExtra("position", 0L);
                }
                if (bundle != null) {
                    this.mCurrentPosition = bundle.getInt("position", 0);
                }
                if (this.getSupportActionBar() != null) {
                    this.getSupportActionBar().setTitle((CharSequence)this.savedVideoHolder.name);
                    this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131099756)));
                }
            } else {
                Toast.makeText((Context)this, (CharSequence)"\u0412\u0438\u0434\u0435\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e.", (int)0).show();
                this.finish();
            }
        }
    }

    private void setVideoUri() {
        if (this.mediaSource != null) {
            this.videoView.setVideoURI(Uri.parse((String)this.savedVideoHolder.url), this.mediaSource);
        } else {
            this.videoView.setVideoURI(Uri.fromFile((File)new File(this.savedVideoHolder.filePath)));
        }
    }

    @Override
    public String getQualityPrefsFieldName() {
        return "video_quality";
    }

    @Override
    public Object getVideoObject() {
        return this.savedVideoHolder;
    }

    @Override
    public void gtmLogEvent(String string) {
        SavedVideoHolder savedVideoHolder = this.savedVideoHolder;
        if (savedVideoHolder != null) {
            savedVideoHolder = DataLayer.mapOf((Object[])new Object[]{"video_id", savedVideoHolder.id, "quality", this.mQuality.toShortString()});
            if (!TextUtils.isEmpty((CharSequence)this.savedVideoHolder.duration)) {
                savedVideoHolder.put("length", this.parseDuration(this.savedVideoHolder.duration));
            }
            this.tagManager.logEvent(string, "Downloaded", (Map)savedVideoHolder);
        }
    }

    @Override
    public void gtmLogPlayback() {
        Map map = DataLayer.mapOf((Object[])new Object[]{"video_id", this.savedVideoHolder.id, "quality", this.mQuality.toShortString()});
        if (!TextUtils.isEmpty((CharSequence)this.savedVideoHolder.duration)) {
            map.put((Object)"length", (Object)this.parseDuration(this.savedVideoHolder.duration));
        }
        this.tagManager.logEvent("video", "Downloaded", map);
    }

    @Override
    public boolean isAdsEnabled() {
        return false;
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
        this.isCastAvailable = false;
        this.parseIntent(this.getIntent(), bundle);
        this.toolbar.setNavigationOnClickListener((View.OnClickListener)new o1((KeyEvent.Callback)this, 1));
    }

    @Override
    public void saveVideoPosition() {
        long l4 = this.videoView.getCurrentPosition();
        SavedVideoHolder savedVideoHolder = this.savedVideoHolder;
        if (savedVideoHolder != null && l4 != 0L) {
            SavedVideos.setVideoPosition(this.prefsManager, savedVideoHolder, l4);
        }
    }

    @Override
    public void setQuality(Quality quality) {
    }

    @Override
    public void startAudioActivity() {
        Intent intent = new Intent((Context)this, AudioActivity.class);
        intent.putExtra("metadata", (Parcelable)MediaUtils.buildMediaMetadataForArticle(this.savedVideoHolder));
        intent.putExtra("metadata_json", MediaUtils.buildMetadataJsonFromArticle(this.savedVideoHolder));
        intent.putExtra("position", this.videoView.getCurrentPosition());
        this.startActivity(intent);
        this.finish();
    }

    @Override
    public void startCast() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void startVideo() {
        if (CastActivity.getPlaybackLocation() == CastActivity.PlaybackLocation.REMOTE) {
            this.getCastLayout().setVisibility(0);
            return;
        }
        this.getCastLayout().setVisibility(8);
        Object object = this.videoView;
        if (object != null && ((VideoView)((Object)object)).isPlaying()) {
            return;
        }
        try {
            ExoVideoView exoVideoView = this.videoView;
            object = new s2(this, 1);
            exoVideoView.setCustParamsCreator((Callable<String>)object);
            this.setVideoUri();
            long l4 = this.mCurrentPosition;
            if (l4 != 0L) {
                this.videoView.seekTo((int)l4);
            }
            ExoVideoView exoVideoView2 = this.videoView;
            object = new t2(this);
            exoVideoView2.setOnPreparedListener((OnPreparedListener)object);
            object = this.videoView;
            t2 t22 = new t2(this);
            ((VideoView)((Object)object)).setOnCompletionListener(t22);
            object = this.videoView;
            z3 z32 = new z3(4);
            ((VideoView)((Object)object)).setOnErrorListener(z32);
            return;
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
            this.finish();
        }
    }

    @Override
    public void updateMenu() {
        super.updateMenu();
        MenuItem menuItem = this.qualityMenuItem;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }
}


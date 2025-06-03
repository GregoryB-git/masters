/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.PersistableBundle
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.KeyEvent$Callback
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.core.view.LayoutInflaterCompat
 *  androidx.core.view.LayoutInflaterFactory
 *  butterknife.BindView
 *  com.google.android.gms.cast.framework.CastButtonFactory
 *  com.mikepenz.google_material_typeface_library.GoogleMaterial$Icon
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.context.IconicsLayoutInflater
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 *  ru.tvrain.core.data.Quality
 *  rx.Observable
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 */
package com.hintsolutions.raintv.video;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.LayoutInflaterFactory;
import butterknife.BindView;
import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsVisibilityListener;
import com.devbrackets.android.exomedia.ui.widget.VideoControls;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater;
import com.mikepenz.iconics.typeface.IIcon;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.data.Quality;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.cast.CastActivity;

public abstract class VideoStreamActivity
extends CastActivity
implements ExoVideoView.AdEventsListener {
    private static final int AUTOHIDE_LOADER_AFTER_SEC = 3;
    public static final int DEFAULT_DELAY = 2000;
    public static final int HIDE_CONTROLS = 1;
    public static final String INTENT_EXTRA_ARTICLE_ID = "article_id";
    public static final String INTENT_EXTRA_FROM_AUDIO = "FROM_AUDIO";
    private static String STATE_POSITION = "position";
    private static boolean isLandscape;
    @BindView(value=2131296433)
    public TextView castLabel;
    @BindView(value=2131296434)
    public LinearLayout castLayout;
    private ImageView fullscreenImageView;
    public Handler handler = new Handler(new Handler.Callback(this){
        public final VideoStreamActivity this$0;
        {
            this.this$0 = videoStreamActivity;
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                this.this$0.handler.removeMessages(1);
                VideoStreamActivity.access$000(this.this$0);
            }
            VideoStreamActivity.access$000(this.this$0);
            return true;
        }
    });
    public boolean isCastAvailable = true;
    private boolean isControlsShown = true;
    public long mCurrentPosition;
    public Quality mQuality;
    public boolean noAds = true;
    private Subscription playLoggingSubscription;
    @BindView(value=2131297027)
    public TextView programName;
    public MenuItem qualityMenuItem;
    private IconicsDrawable switchFromFullscreenDrawable;
    private IconicsDrawable switchToFullscreenDrawable;
    @BindView(value=2131297314)
    public RelativeLayout videoContainer;
    @BindView(value=2131297313)
    public ExoVideoView videoView;

    public static /* synthetic */ void C(VideoStreamActivity videoStreamActivity, Long l4) {
        videoStreamActivity.lambda$showLoader$0(l4);
    }

    public static /* synthetic */ void D(VideoStreamActivity videoStreamActivity, View view) {
        videoStreamActivity.lambda$initViews$2(view);
    }

    public static /* synthetic */ void E(VideoStreamActivity videoStreamActivity, Long l4) {
        videoStreamActivity.lambda$startPlayLogging$1(l4);
    }

    private void hideControls() {
        ExoVideoView exoVideoView;
        this.isControlsShown = false;
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().hide();
        }
        if ((exoVideoView = this.videoView) != null && exoVideoView.getVideoControls() != null) {
            this.videoView.getVideoControls().hideDelayed(10L);
        }
    }

    private void initFullscreenAction() {
        int n4 = this.isTablet() ? 32 : 24;
        this.fullscreenImageView = new ImageView((Context)this);
        this.switchToFullscreenDrawable = new IconicsDrawable((Context)this, (IIcon)GoogleMaterial.Icon.gmd_fullscreen).sizeDp(n4).paddingDp(4).color(-1);
        this.switchFromFullscreenDrawable = new IconicsDrawable((Context)this, (IIcon)GoogleMaterial.Icon.gmd_fullscreen_exit).sizeDp(n4).paddingDp(4).color(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(CommonUtils.dpToPx((Context)this, 4), 0, 0, 0);
        this.fullscreenImageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.fullscreenImageView.setImageDrawable((Drawable)this.switchToFullscreenDrawable);
    }

    private void initQuality() {
        try {
            this.mQuality = Quality.parse((String)this.prefsManager.getString(this.getQualityPrefsFieldName(), Quality.LOW.toString()));
        }
        catch (Exception exception) {
            this.mQuality = null;
        }
        if (this.mQuality == null) {
            this.mQuality = Quality.LOW;
        }
    }

    private void initViews() {
        Object object;
        Object object2;
        this.videoView.setAdsEnabled(this.isAdsEnabled());
        this.initFullscreenAction();
        boolean bl = this.getResources().getConfiguration().orientation == 2;
        this.updateViewsWithOrientation(bl);
        this.fullscreenImageView.setOnClickListener((View.OnClickListener)new o1((KeyEvent.Callback)this, 4));
        try {
            object2 = this.videoView.getVideoControls();
            object = new VideoControlsVisibilityListener(this){
                public final VideoStreamActivity this$0;
                {
                    this.this$0 = videoStreamActivity;
                }

                public void onControlsHidden() {
                    this.this$0.handler.sendEmptyMessageDelayed(1, 2000L);
                }

                public void onControlsShown() {
                    VideoStreamActivity.access$100(this.this$0);
                }
            };
            ((VideoControls)object2).setVisibilityListener((VideoControlsVisibilityListener)object);
            object2 = this.videoView.getVideoControls();
            object = new VideoControlsButtonListener(this){
                public final VideoStreamActivity this$0;
                {
                    this.this$0 = videoStreamActivity;
                }

                public boolean onFastForwardClicked() {
                    return false;
                }

                public boolean onNextClicked() {
                    return false;
                }

                public boolean onPlayPauseClicked() {
                    if (this.this$0.videoView.isPlaying()) {
                        this.this$0.saveVideoPosition();
                    }
                    VideoStreamActivity videoStreamActivity = this.this$0;
                    String string = videoStreamActivity.videoView.isPlaying() ? "pause" : "play";
                    videoStreamActivity.gtmLogEvent(string);
                    this.this$0.videoView.isPlaying();
                    return false;
                }

                public boolean onPreviousClicked() {
                    return false;
                }

                public boolean onRewindClicked() {
                    return false;
                }
            };
            ((VideoControls)object2).setButtonListener((VideoControlsButtonListener)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.videoView.getVideoControls().addExtraView((View)this.fullscreenImageView);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = this.videoView;
            object2 = new View.OnTouchListener(this, (Context)this){
                public GestureDetector gestureDetector;
                public final VideoStreamActivity this$0;
                {
                    this.this$0 = videoStreamActivity;
                    this.gestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)this);
                }

                public boolean onDoubleTap(MotionEvent motionEvent) {
                    int n4 = this.this$0.videoView.getWidth();
                    if (motionEvent.getX() > (float)(n4 / 2)) {
                        this.this$0.videoView.fastRewindForward();
                    } else {
                        this.this$0.videoView.fastRewindBackward();
                    }
                    return true;
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (this.this$0.videoView.getVideoControls() != null) {
                        if (!this.this$0.isControlsShown) {
                            this.this$0.showControls();
                            if (this.this$0.videoView.isPlaying()) {
                                this.this$0.handler.sendEmptyMessageDelayed(1, 2000L);
                            }
                        } else {
                            this.this$0.hideControls();
                        }
                    }
                    return true;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    this.gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            };
            ((VideoView)((Object)object)).setOnTouchListener((View.OnTouchListener)object2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.videoView.setAdEventsListener(this);
            this.videoView.initAds();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$initViews$2(View view) {
        this.switchOrientation(isLandscape ^ true);
    }

    private /* synthetic */ void lambda$showLoader$0(Long l4) {
        this.onAdsLoadedOrFailed();
    }

    private /* synthetic */ void lambda$startPlayLogging$1(Long object) {
        object = this.videoView;
        if (object != null && object.isPlaying()) {
            this.gtmLogPlayback();
        }
    }

    private void showControls() {
        ExoVideoView exoVideoView;
        this.isControlsShown = true;
        this.handler.removeMessages(1);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().show();
        }
        if ((exoVideoView = this.videoView) != null && exoVideoView.getVideoControls() != null) {
            this.videoView.getVideoControls().show();
        }
    }

    private void startPlayLogging() {
        if (TagManager.getSendPlaybackInterval() > 0L) {
            this.playLoggingSubscription = Observable.interval((long)TagManager.getSendPlaybackInterval(), (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new j5(this, 0), (Action1)new z3(9));
        }
    }

    private void stopPlayLogging() {
        Subscription subscription = this.playLoggingSubscription;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.playLoggingSubscription.unsubscribe();
        }
    }

    private void switchOrientation(boolean bl) {
        if (bl) {
            this.gtmLogEvent("fullscreen");
        }
        isLandscape = bl;
        int n4 = bl ? 6 : 1;
        this.setRequestedOrientation(n4);
    }

    @Override
    @NonNull
    public TextView getCastLabel() {
        return this.castLabel;
    }

    @Override
    @NonNull
    public LinearLayout getCastLayout() {
        return this.castLayout;
    }

    @Override
    public int getLayoutResource() {
        return 2131492913;
    }

    public abstract String getQualityPrefsFieldName();

    public abstract Object getVideoObject();

    public abstract void gtmLogEvent(String var1);

    public abstract void gtmLogPlayback();

    public boolean isAdsEnabled() {
        boolean bl = !this.userManager.isNoAds() && !this.noAds;
        return bl;
    }

    public abstract boolean isAudioAvailable();

    public boolean isQualityChangeSupported() {
        return true;
    }

    @Override
    public void onAdsLoadedOrFailed() {
        this.videoContainer.setVisibility(0);
        this.hideProgressDialog();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.invalidateOptionsMenu();
        int n4 = configuration.orientation;
        if (n4 == 2) {
            this.getWindow().addFlags(1024);
            this.getWindow().clearFlags(2048);
            this.updateViewsWithOrientation(true);
        } else if (n4 == 1) {
            this.updateViewsWithOrientation(false);
            this.getWindow().addFlags(2048);
            this.getWindow().clearFlags(1024);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        LayoutInflaterCompat.setFactory((LayoutInflater)this.getLayoutInflater(), (LayoutInflaterFactory)new IconicsLayoutInflater(this.getDelegate()));
        this.setFullscreenIfLandscape();
        super.onCreate(bundle);
        this.getWindow().addFlags(128);
        if (this.getIntent().hasExtra(INTENT_EXTRA_FROM_AUDIO)) {
            this.noAds = true;
        }
        if (this.isAdsEnabled()) {
            this.showLoader();
        }
        this.stopAudioService();
        this.initViews();
        this.initQuality();
        this.startPlayLogging();
        this.programName.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        this.getMenuInflater().inflate(2131558405, menu);
        try {
            this.setMediaRouteMenuItem(CastButtonFactory.setUpMediaRouteButton((Context)this.getApplicationContext(), (Menu)menu, (int)2131296850));
        }
        catch (Exception exception) {}
        try {
            menuItem = menu.findItem(2131296371);
            if (this.isAudioAvailable()) {
                menuItem.setChecked(false);
                menuItem.setIcon(2131231205);
                menuItem.setVisible(true);
            } else {
                menuItem.setVisible(false);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.isQualityChangeSupported()) {
            try {
                this.qualityMenuItem = menu.findItem(2131297038);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            menu.findItem(2131297038).setVisible(false);
        }
        boolean bl = this.getResources().getConfiguration().screenWidthDp > 850 || this.getResources().getConfiguration().orientation == 2;
        menuItem = this.qualityMenuItem;
        if (menuItem != null) {
            if (bl) {
                menuItem.setShowAsAction(2);
            } else {
                menuItem.setShowAsAction(0);
            }
        }
        this.updateMenu();
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public void onDestroy() {
        try {
            this.videoView.setOnPreparedListener(null);
            this.videoView.setOnTouchListener(null);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.videoView.release();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                break;
            }
            case 2131296855: {
                this.setQuality(Quality.MEDIUM);
                this.updateMenu();
                this.gtmLogEvent("quality");
                break;
            }
            case 2131296761: {
                this.setQuality(Quality.LOW);
                this.updateMenu();
                this.gtmLogEvent("quality");
                break;
            }
            case 2131296673: {
                this.setQuality(Quality.HIGH);
                this.updateMenu();
                this.gtmLogEvent("quality");
                break;
            }
            case 2131296380: {
                this.setQuality(Quality.AUTO);
                this.updateMenu();
                this.gtmLogEvent("quality");
                break;
            }
            case 2131296371: {
                this.startAudioActivity();
                this.gtmLogEvent("sound");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            int n4 = (int)bundle.getLong(STATE_POSITION);
            Object object = new StringBuilder();
            object.append("seekTo3");
            object.append(this.mCurrentPosition);
            Log.d((String)"adTag", (String)object.toString());
            object = this.videoView;
            long l4 = n4;
            try {
                ((ExoVideoView)((Object)object)).seekTo(l4);
                this.mCurrentPosition = l4;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("position", this.videoView.getCurrentPosition());
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            bundle.putLong(STATE_POSITION, this.videoView.getCurrentPosition());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    public void onStart() {
        this.videoView.onResume();
        this.startPlayLogging();
        super.onStart();
    }

    public void onStop() {
        this.stopPlayLogging();
        this.videoView.onPause();
        super.onStop();
        if (this.videoView.getCurrentPosition() != 0L) {
            this.mCurrentPosition = this.videoView.getCurrentPosition();
        }
        this.handler.removeMessages(1);
    }

    public void saveQuality(String string, Quality quality) {
        this.prefsManager.putString(string, quality.toString());
    }

    public void saveVideoPosition() {
    }

    public abstract void setQuality(Quality var1);

    public void showLoader() {
        try {
            this.videoContainer.setVisibility(4);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.showProgressDialog();
            Observable observable = Observable.timer((long)3L, (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop();
            j5 j52 = new j5(this, 1);
            z3 z32 = new z3(10);
            this.addSubscription(observable.subscribe((Action1)j52, (Action1)z32));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.videoContainer.setVisibility(0);
        }
    }

    public abstract void startAudioActivity();

    public void updateMenu() {
        block4: {
            Quality quality = this.mQuality;
            if (quality == null) break block4;
            MenuItem menuItem = this.qualityMenuItem;
            if (menuItem == null) break block4;
            try {
                menuItem.setTitle((CharSequence)this.getString(2131755528, new Object[]{quality.toShortString()}));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateViewsWithOrientation(boolean bl) {
        try {
            isLandscape = bl;
            if (bl) {
                ViewGroup.LayoutParams layoutParams = this.videoContainer.getLayoutParams();
                layoutParams.height = -1;
                this.videoContainer.setLayoutParams(layoutParams);
                this.fullscreenImageView.setImageDrawable((Drawable)this.switchFromFullscreenDrawable);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.videoContainer.getLayoutParams();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            layoutParams.height = (int)((float)displayMetrics.widthPixels * 9.0f / 16.0f);
            this.videoContainer.setLayoutParams(layoutParams);
            this.fullscreenImageView.setImageDrawable((Drawable)this.switchToFullscreenDrawable);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}


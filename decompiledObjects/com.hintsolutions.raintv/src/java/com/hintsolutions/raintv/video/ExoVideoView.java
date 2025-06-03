/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.Nullable
 *  com.google.ads.interactivemedia.v3.api.AdDisplayContainer
 *  com.google.ads.interactivemedia.v3.api.AdErrorEvent
 *  com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener
 *  com.google.ads.interactivemedia.v3.api.AdEvent
 *  com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener
 *  com.google.ads.interactivemedia.v3.api.AdsLoader
 *  com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener
 *  com.google.ads.interactivemedia.v3.api.AdsManager
 *  com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
 *  com.google.ads.interactivemedia.v3.api.AdsRequest
 *  com.google.ads.interactivemedia.v3.api.ImaSdkFactory
 *  com.google.ads.interactivemedia.v3.api.ImaSdkSettings
 *  com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
 *  com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroup
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  com.hintsolutions.raintv.video.a
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.TimeUnit
 *  l1
 *  m1
 *  ru.tvrain.core.data.Quality
 *  rx.Observable
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  z3
 */
package com.hintsolutions.raintv.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.data.Quality;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ExoVideoView
extends VideoView
implements AdErrorEvent.AdErrorListener,
AdEvent.AdEventListener {
    private static final String TAG = "ExoVideo asdf";
    private static SpeedItem[] playbackSpeedItems = new SpeedItem[]{new Object(1.0f, 2131231181){
        public int resId;
        public float speed;
        public String text;
        {
            this.speed = f;
            this.resId = n;
        }
        {
            this.speed = f;
            this.text = string;
        }
    }, new /* invalid duplicate definition of identical inner class */, new /* invalid duplicate definition of identical inner class */, new /* invalid duplicate definition of identical inner class */, new /* invalid duplicate definition of identical inner class */, new /* invalid duplicate definition of identical inner class */};
    private AdEventsListener adEventsListener;
    private boolean adsEnabled;
    private boolean adsRequested = false;
    private boolean hidePositionControls = false;
    private Subscription hideRewindInfo;
    private Subscription hideSubscription;
    private ViewGroup mAdUiContainer;
    private AdsLoader mAdsLoader;
    private AdsManager mAdsManager;
    private boolean mAdsRequestSent = false;
    private boolean mIsAdDisplaying;
    private boolean mPreventAutoplay = false;
    private ImaSdkFactory mSdkFactory;
    private Callable<String> paramsCreator;
    private int playbackSpeed = 0;
    private boolean played = false;
    private long position = 0L;
    private Quality quality;
    private View rewindBackdrop;
    private Rewind rewindBackward = new Object(this, true){
        private static final int DURATION_STEP = 10;
        private static final int HIDE_AFTER = 1;
        private static final int HIDE_REWIND_INFO_AFTER = 1;
        public List<ImageView> animImages;
        private boolean backward;
        private int duration;
        public TextView durationView;
        public View layout;
        public final ExoVideoView this$0;
        {
            this.this$0 = exoVideoView;
            this.animImages = new ArrayList();
            this.duration = 0;
            this.backward = bl;
        }

        public static /* synthetic */ void a(Rewind rewind, Long l) {
            rewind.lambda$showRewindInfo$1(l);
        }

        public static /* synthetic */ int access$002(Rewind rewind, int n) {
            rewind.duration = n;
            return n;
        }

        private void animateImages() {
            for (int i = 0; i < this.animImages.size(); ++i) {
                ImageView imageView = (ImageView)this.animImages.get(i);
                if (imageView.getAnimation() != null) {
                    imageView.getAnimation().reset();
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setStartOffset((long)(i * 250 / 2));
                long l = 250;
                alphaAnimation.setDuration(l);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setStartOffset(alphaAnimation.getStartOffset() + l);
                alphaAnimation2.setDuration(alphaAnimation.getStartOffset() + l);
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation((Animation)alphaAnimation);
                animationSet.addAnimation((Animation)alphaAnimation2);
                animationSet.setFillAfter(true);
                imageView.startAnimation((Animation)animationSet);
            }
        }

        public static /* synthetic */ void b(Rewind rewind, Long l) {
            rewind.lambda$move$0(l);
        }

        private void hideRewindInfoWithAnimation() {
            this.this$0.rewindInfo.animate().alpha(0.0f).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                public final Rewind this$1;
                {
                    this.this$1 = rewind;
                }

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    this.this$1.this$0.rewindInfo.setVisibility(4);
                    this.this$1.this$0.rewindInfo.setAlpha(1.0f);
                }
            });
        }

        private void hideRewindWithAnimation() {
            this.this$0.rewindBackdrop.animate().alpha(0.0f).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                public final Rewind this$1;
                {
                    this.this$1 = rewind;
                }

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    Rewind.access$002(this.this$1, 0);
                    this.this$1.updateViews();
                    this.this$1.this$0.rewindBackdrop.setVisibility(4);
                    this.this$1.this$0.rewindBackdrop.setAlpha(1.0f);
                }
            });
        }

        private /* synthetic */ void lambda$move$0(Long l) {
            this.hideRewindWithAnimation();
        }

        private /* synthetic */ void lambda$showRewindInfo$1(Long l) {
            this.hideRewindInfoWithAnimation();
        }

        private void movePosition() {
            long l;
            long l2 = this.this$0.getCurrentPosition();
            int n = this.backward ? -1 : 1;
            l2 = l = l2 + (long)(n * 10000);
            if (l < 0L) {
                l2 = 0L;
            }
            l = l2;
            if (l2 >= this.this$0.getDuration()) {
                l = this.this$0.getDuration() - 1L;
            }
            this.this$0.seekTo(l);
        }

        private void updateViews() {
            if (this.duration > 0) {
                this.this$0.rewindBackdrop.setVisibility(0);
                this.layout.setVisibility(0);
            } else {
                this.layout.setVisibility(4);
            }
            this.durationView.setText((CharSequence)this.this$0.getContext().getString(2131755402, new Object[]{this.duration}));
        }

        public void clearIfActive() {
            if (this.duration > 0) {
                this.duration = 0;
                this.updateViews();
            }
        }

        public void move() {
            int n = this.duration;
            this.duration = n == 0 ? 10 : n + 10;
            this.movePosition();
            this.animateImages();
            this.updateViews();
            if (this.this$0.hideSubscription != null && !this.this$0.hideSubscription.isUnsubscribed()) {
                this.this$0.hideSubscription.unsubscribe();
            }
            ExoVideoView.access$402(this.this$0, Observable.timer((long)1L, (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new a(this, 1), (Action1)new z3(2)));
        }

        public void showRewindInfo() {
            this.this$0.rewindInfo.setVisibility(0);
            if (this.this$0.hideRewindInfo != null && !this.this$0.hideRewindInfo.isUnsubscribed()) {
                this.this$0.hideRewindInfo.unsubscribe();
            }
            ExoVideoView.access$502(this.this$0, Observable.timer((long)1L, (TimeUnit)TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new a(this, 0), (Action1)new z3(1)));
        }
    };
    private Rewind rewindForward = new /* invalid duplicate definition of identical inner class */;
    private View rewindInfo;
    private ImageButton speedButton;
    private TextView speedText;

    public ExoVideoView(Context context) {
        super(context);
        if (!this.hidePositionControls) {
            this.initRewindViews();
            this.updateSpeedControl();
        }
    }

    public ExoVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.hidePositionControls) {
            this.initRewindViews();
            this.updateSpeedControl();
        }
    }

    public static /* synthetic */ void a(ExoVideoView exoVideoView, OnPreparedListener onPreparedListener) {
        exoVideoView.lambda$setOnPreparedListener$4(onPreparedListener);
    }

    public static /* synthetic */ Subscription access$402(ExoVideoView exoVideoView, Subscription subscription) {
        exoVideoView.hideSubscription = subscription;
        return subscription;
    }

    public static /* synthetic */ Subscription access$502(ExoVideoView exoVideoView, Subscription subscription) {
        exoVideoView.hideRewindInfo = subscription;
        return subscription;
    }

    public static /* synthetic */ boolean b(ExoVideoView exoVideoView, View view, MotionEvent motionEvent) {
        return exoVideoView.lambda$initRewindViews$1(view, motionEvent);
    }

    public static /* synthetic */ void c(ExoVideoView exoVideoView, View view) {
        exoVideoView.lambda$updateSpeedControl$0(view);
    }

    public static /* synthetic */ void d(ExoVideoView exoVideoView) {
        exoVideoView.lambda$initAds$3();
    }

    public static /* synthetic */ void e(ExoVideoView exoVideoView, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        exoVideoView.lambda$initAds$2(adsManagerLoadedEvent);
    }

    public static /* synthetic */ VideoProgressUpdate f(ExoVideoView exoVideoView) {
        return exoVideoView.lambda$requestAds$5();
    }

    private void initPositionControls() {
        int n = this.hidePositionControls ? 4 : 0;
        this.getVideoControls().getRootView().findViewById(2131296592).setVisibility(n);
        this.getVideoControls().getRootView().findViewById(2131296611).setVisibility(n);
        this.getVideoControls().getRootView().findViewById(2131296594).setVisibility(n);
    }

    private void initRewindViews() {
        View view;
        this.rewindBackdrop = this.findViewById(2131297061);
        this.rewindInfo = view = this.findViewById(2131297067);
        view.setVisibility(4);
        this.rewindBackdrop.setVisibility(4);
        this.rewindBackward.layout = this.findViewById(2131297060);
        this.rewindBackward.animImages.add((Object)((ImageView)this.findViewById(2131297058)));
        this.rewindBackward.animImages.add((Object)((ImageView)this.findViewById(2131297057)));
        this.rewindBackward.animImages.add((Object)((ImageView)this.findViewById(2131297056)));
        this.rewindBackward.durationView = (TextView)this.findViewById(2131297059);
        this.rewindBackward.updateViews();
        this.rewindForward.layout = this.findViewById(2131297066);
        this.rewindForward.animImages.add((Object)((ImageView)this.findViewById(2131297062)));
        this.rewindForward.animImages.add((Object)((ImageView)this.findViewById(2131297063)));
        this.rewindForward.animImages.add((Object)((ImageView)this.findViewById(2131297064)));
        this.rewindForward.durationView = (TextView)this.findViewById(2131297065);
        this.rewindForward.updateViews();
        this.rewindBackdrop.setOnTouchListener((View.OnTouchListener)new n1(this));
        this.getVideoControls().setSeekListener(new VideoControlsSeekListener(this){
            public final ExoVideoView this$0;
            {
                this.this$0 = exoVideoView;
            }

            @Override
            public boolean onSeekEnded(long l) {
                return false;
            }

            @Override
            public boolean onSeekStarted() {
                if (!this.this$0.hidePositionControls) {
                    this.this$0.rewindBackward.showRewindInfo();
                }
                return false;
            }
        });
    }

    private /* synthetic */ void lambda$initAds$2(AdsManagerLoadedEvent adsManagerLoadedEvent) {
        AdEventsListener adEventsListener = this.adEventsListener;
        if (adEventsListener != null) {
            adEventsListener.onAdsLoadedOrFailed();
        }
        adsManagerLoadedEvent = adsManagerLoadedEvent.getAdsManager();
        this.mAdsManager = adsManagerLoadedEvent;
        adsManagerLoadedEvent.addAdErrorListener((AdErrorEvent.AdErrorListener)this);
        this.mAdsManager.addAdEventListener((AdEvent.AdEventListener)this);
        this.mAdsManager.init();
    }

    private /* synthetic */ void lambda$initAds$3() {
        AdsLoader adsLoader = this.mAdsLoader;
        if (adsLoader != null) {
            adsLoader.contentComplete();
        }
    }

    private /* synthetic */ boolean lambda$initRewindViews$1(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int n = this.rewindBackdrop.getWidth();
            if (motionEvent.getX() > (float)(n / 2)) {
                this.fastRewindForward();
            } else {
                this.fastRewindBackward();
            }
        }
        return false;
    }

    private /* synthetic */ VideoProgressUpdate lambda$requestAds$5() {
        if (!this.mIsAdDisplaying && this.getDuration() > 0L) {
            return new VideoProgressUpdate(this.getCurrentPosition(), this.getDuration());
        }
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    private /* synthetic */ void lambda$setOnPreparedListener$4(OnPreparedListener onPreparedListener) {
        this.changeQuality(true);
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared();
        }
    }

    private /* synthetic */ void lambda$updateSpeedControl$0(View view) {
        int n;
        this.playbackSpeed = n = this.playbackSpeed + 1;
        if (n >= playbackSpeedItems.length) {
            this.playbackSpeed = 0;
        }
        this.updateSpeedControl();
    }

    private void requestAds(String string) {
        if (this.adsEnabled && !this.adsRequested) {
            this.adsRequested = true;
            AdDisplayContainer adDisplayContainer = this.mSdkFactory.createAdDisplayContainer();
            adDisplayContainer.setAdContainer(this.mAdUiContainer);
            AdsRequest adsRequest = this.mSdkFactory.createAdsRequest();
            adsRequest.setAdTagUrl(string);
            adsRequest.setAdDisplayContainer(adDisplayContainer);
            adsRequest.setContentProgressProvider((ContentProgressProvider)new m1(this));
            this.mAdsLoader.requestAds(adsRequest);
        }
    }

    private void updateSpeedControl() {
        Object object;
        SpeedItem speedItem = playbackSpeedItems[this.playbackSpeed];
        this.speedText = (TextView)this.getVideoControls().getRootView().findViewById(2131296605);
        this.speedButton = object = (ImageButton)this.getVideoControls().getRootView().findViewById(2131296604);
        if (this.hidePositionControls) {
            object.setVisibility(8);
            this.speedText.setVisibility(8);
        } else {
            int n = speedItem.resId;
            if (n != 0) {
                object.setImageResource(n);
                this.speedButton.setVisibility(0);
                this.speedText.setVisibility(8);
            } else {
                this.speedText.setText((CharSequence)speedItem.text);
                this.speedButton.setVisibility(8);
                this.speedText.setVisibility(0);
            }
        }
        this.videoViewImpl.setPlaybackSpeed(speedItem.speed);
        object = new o1((KeyEvent.Callback)this, 0);
        this.speedText.setOnClickListener((View.OnClickListener)object);
        this.speedButton.setOnClickListener((View.OnClickListener)object);
    }

    public void changeQuality(boolean bl) {
        TrackGroupArray trackGroupArray;
        Object object = this.quality;
        if (!(object == null || bl && object.equals((Object)Quality.AUTO) || !this.trackSelectionAvailable() || (trackGroupArray = this.getAvailableTracks()) == null)) {
            int n;
            object = ExoMedia.RendererType.VIDEO;
            if ((trackGroupArray = (TrackGroupArray)trackGroupArray.get(object)) == null) {
                return;
            }
            TrackGroup trackGroup = trackGroupArray.get(0);
            trackGroupArray = new ArrayList();
            for (n = 0; n < trackGroup.length; ++n) {
                trackGroupArray.add(n, (Object)trackGroup.getFormat(n).getPixelCount());
            }
            trackGroup = (Integer)Collections.max((Collection)trackGroupArray);
            Integer n2 = (Integer)Collections.min((Collection)trackGroupArray);
            n = trackGroupArray.indexOf((Object)trackGroup);
            int n3 = (int)Math.ceil((double)((float)trackGroupArray.size() / 2.0f));
            int n4 = trackGroupArray.indexOf((Object)n2);
            int n5 = 2.$SwitchMap$ru$tvrain$core$data$Quality[this.quality.ordinal()];
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        this.clearSelectedTracks(ExoMedia.RendererType.VIDEO);
                        return;
                    }
                    n = n4;
                } else {
                    n = n3;
                }
            }
            if (this.getSelectedTrackIndex((ExoMedia.RendererType)((Object)object), 0) != n) {
                this.setTrack((ExoMedia.RendererType)((Object)object), 0, n);
            }
        }
    }

    public void fastRewindBackward() {
        if (!this.hidePositionControls) {
            this.rewindForward.clearIfActive();
            this.rewindBackward.move();
        }
    }

    public void fastRewindForward() {
        if (!this.hidePositionControls) {
            this.rewindBackward.clearIfActive();
            this.rewindForward.move();
        }
    }

    @Override
    public long getCurrentPosition() {
        if (this.mIsAdDisplaying) {
            return this.position;
        }
        return super.getCurrentPosition();
    }

    public void initAds() {
        if (this.adsEnabled) {
            this.mAdsRequestSent = true;
            this.mAdUiContainer = (ViewGroup)this.getParent();
            this.mSdkFactory = ImaSdkFactory.getInstance();
            ImaSdkSettings imaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            imaSdkSettings.setLanguage("ru");
            imaSdkSettings.setMaxRedirects(4);
            imaSdkSettings = this.mSdkFactory.createAdsLoader(this.getContext(), imaSdkSettings);
            this.mAdsLoader = imaSdkSettings;
            imaSdkSettings.addAdErrorListener((AdErrorEvent.AdErrorListener)this);
            this.mAdsLoader.addAdsLoadedListener((AdsLoader.AdsLoadedListener)new l1(this));
            this.setOnCompletionListener((OnCompletionListener)new m1(this));
        }
    }

    public boolean isAdsRequestSent() {
        return this.mAdsRequestSent;
    }

    public boolean isPreventAutoplay() {
        return this.mPreventAutoplay;
    }

    public void onAdError(AdErrorEvent object) {
        if (!this.adsEnabled) {
            return;
        }
        StringBuilder stringBuilder = z2.t("Ad Error: ");
        stringBuilder.append(object.getError().getMessage());
        Log.d((String)"adTag", (String)stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("Ad Error: ");
        stringBuilder.append(object.getError().getMessage());
        Log.e((String)TAG, (String)stringBuilder.toString());
        object = this.adEventsListener;
        if (object != null) {
            object.onAdsLoadedOrFailed();
        }
        if (!this.mPreventAutoplay) {
            this.showControls();
            this.start();
        }
    }

    public void onAdEvent(AdEvent adEvent) {
        if (!this.adsEnabled) {
            return;
        }
        StringBuilder stringBuilder = z2.t("Event: ");
        stringBuilder.append((Object)adEvent.getType());
        Log.i((String)TAG, (String)stringBuilder.toString());
        int n = 2.$SwitchMap$com$google$ads$interactivemedia$v3$api$AdEvent$AdEventType[adEvent.getType().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4 && (adEvent = this.mAdsManager) != null) {
                        adEvent.destroy();
                        this.mAdsManager = null;
                    }
                } else {
                    this.mIsAdDisplaying = false;
                    super.setVideoURI(this.getVideoUri());
                    adEvent = z2.t("CONTENT_RESUME_REQUESTED, position=");
                    adEvent.append(this.position);
                    Log.d((String)"adTag", (String)adEvent.toString());
                    this.seekTo(this.position);
                    this.start();
                }
            } else {
                long l = this.getCurrentPosition();
                if (this.position == 0L) {
                    this.position = l;
                }
                adEvent = z2.t("CONTENT_PAUSE_REQUESTED, position=");
                adEvent.append(this.position);
                Log.d((String)"adTag", (String)adEvent.toString());
                this.mIsAdDisplaying = true;
                this.stopPlayback();
            }
        } else {
            this.mAdsManager.start();
        }
    }

    public void onPause() {
        AdsManager adsManager;
        if (this.adsEnabled && (adsManager = this.mAdsManager) != null && this.mIsAdDisplaying) {
            adsManager.pause();
            return;
        }
        this.position = super.getCurrentPosition();
        this.played = this.isPlaying();
        this.stopPlayback();
    }

    public void onResume() {
        AdsManager adsManager;
        if (this.adsEnabled && (adsManager = this.mAdsManager) != null && this.mIsAdDisplaying) {
            adsManager.resume();
            return;
        }
        if (this.played) {
            super.setVideoURI(this.getVideoUri());
            this.seekTo(this.position);
            this.start();
        }
    }

    @Override
    public void seekTo(long l) {
        super.seekTo(l);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("seekTo, position=");
        stringBuilder.append(l);
        Log.d((String)"adTag", (String)stringBuilder.toString());
        this.position = l;
    }

    public void setAdEventsListener(AdEventsListener adEventsListener) {
        this.adEventsListener = adEventsListener;
    }

    public void setAdsEnabled(boolean bl) {
        this.adsEnabled = bl;
    }

    public void setCustParamsCreator(Callable<String> callable) {
        this.paramsCreator = callable;
    }

    public void setHidePositionControls(boolean bl) {
        if (this.hidePositionControls != bl) {
            this.hidePositionControls = bl;
            this.initRewindViews();
            this.updateSpeedControl();
            this.initPositionControls();
        }
    }

    @Override
    public void setOnPreparedListener(@Nullable OnPreparedListener onPreparedListener) {
        super.setOnPreparedListener(new y4((Object)this, onPreparedListener, 5));
    }

    public void setPreventAutoplay(boolean bl) {
        this.mPreventAutoplay = bl;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public void setVideoURI(@Nullable Uri uri) {
        this.setVideoURI(uri, false);
    }

    @Override
    public void setVideoURI(@Nullable Uri uri, MediaSource mediaSource) {
        super.setVideoURI(uri, mediaSource);
    }

    public void setVideoURI(@Nullable Uri uri, boolean bl) {
        if (!bl && this.getVideoUri() != null && this.getVideoUri().equals((Object)uri)) {
            this.changeQuality(false);
        } else {
            super.setVideoURI(uri);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  androidx.annotation.IntRange
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.IntRange;
import com.devbrackets.android.exomedia.R;
import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation;
import com.devbrackets.android.exomedia.ui.widget.VideoControls;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.devbrackets.android.exomedia.util.ResourceUtil;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;

@TargetApi(value=21)
public class VideoControlsLeanback
extends VideoControls {
    public static final int FAST_FORWARD_REWIND_AMOUNT = 10000;
    public ButtonFocusChangeListener buttonFocusChangeListener = new ButtonFocusChangeListener(this);
    public ViewGroup controlsParent;
    public View currentFocus;
    public ImageButton fastForwardButton;
    public ProgressBar progressBar;
    public ImageButton rewindButton;
    public ImageView rippleIndicator;

    public VideoControlsLeanback(Context context) {
        super(context);
    }

    public VideoControlsLeanback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoControlsLeanback(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
    }

    public VideoControlsLeanback(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
    }

    @Override
    public void animateVisibility(boolean bl) {
        if (this.isVisible == bl) {
            return;
        }
        if (!this.isLoading) {
            this.controlsParent.startAnimation((Animation)new BottomViewHideShowAnimation((View)this.controlsParent, bl, 300L));
        }
        this.isVisible = bl;
        this.onVisibilityChanged();
    }

    @Override
    public void finishLoading() {
        if (!this.isLoading) {
            return;
        }
        boolean bl = false;
        this.isLoading = false;
        this.controlsContainer.setVisibility(0);
        this.rippleIndicator.setVisibility(0);
        this.loadingProgressBar.setVisibility(8);
        VideoView videoView = this.videoView;
        boolean bl2 = bl;
        if (videoView != null) {
            bl2 = bl;
            if (videoView.isPlaying()) {
                bl2 = true;
            }
        }
        this.updatePlaybackState(bl2);
    }

    public void focusNext(View view) {
        int n = view.getNextFocusRightId();
        if (n == -1) {
            return;
        }
        view = this.findViewById(n);
        if (view.getVisibility() != 0) {
            this.focusNext(view);
            return;
        }
        view.requestFocus();
        this.currentFocus = view;
        this.buttonFocusChangeListener.onFocusChange(view, true);
    }

    public void focusPrevious(View view) {
        int n = view.getNextFocusLeftId();
        if (n == -1) {
            return;
        }
        view = this.findViewById(n);
        if (view.getVisibility() != 0) {
            this.focusPrevious(view);
            return;
        }
        view.requestFocus();
        this.currentFocus = view;
        this.buttonFocusChangeListener.onFocusChange(view, true);
    }

    @Override
    public int getLayoutResource() {
        return R.layout.exomedia_default_controls_leanback;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.playPauseButton.requestFocus();
        this.currentFocus = this.playPauseButton;
    }

    public void onFastForwardClick() {
        VideoControlsButtonListener videoControlsButtonListener = this.buttonsListener;
        if (videoControlsButtonListener == null || !videoControlsButtonListener.onFastForwardClicked()) {
            this.internalListener.onFastForwardClicked();
        }
    }

    public void onRewindClick() {
        VideoControlsButtonListener videoControlsButtonListener = this.buttonsListener;
        if (videoControlsButtonListener == null || !videoControlsButtonListener.onRewindClicked()) {
            this.internalListener.onRewindClicked();
        }
    }

    public void performSeek(long l) {
        VideoControlsSeekListener videoControlsSeekListener = this.seekListener;
        if (videoControlsSeekListener == null || !videoControlsSeekListener.onSeekEnded(l)) {
            this.show();
            this.internalListener.onSeekEnded(l);
        }
    }

    public void registerForInput() {
        RemoteKeyListener remoteKeyListener = new RemoteKeyListener(this);
        this.setOnKeyListener(remoteKeyListener);
        this.playPauseButton.setOnKeyListener((View.OnKeyListener)remoteKeyListener);
        this.previousButton.setOnKeyListener((View.OnKeyListener)remoteKeyListener);
        this.nextButton.setOnKeyListener((View.OnKeyListener)remoteKeyListener);
        this.rewindButton.setOnKeyListener((View.OnKeyListener)remoteKeyListener);
        this.fastForwardButton.setOnKeyListener((View.OnKeyListener)remoteKeyListener);
    }

    @Override
    public void registerListeners() {
        super.registerListeners();
        this.rewindButton.setOnClickListener(new View.OnClickListener(this){
            public final VideoControlsLeanback this$0;
            {
                this.this$0 = videoControlsLeanback;
            }

            public void onClick(View view) {
                this.this$0.onRewindClick();
            }
        });
        this.fastForwardButton.setOnClickListener(new View.OnClickListener(this){
            public final VideoControlsLeanback this$0;
            {
                this.this$0 = videoControlsLeanback;
            }

            public void onClick(View view) {
                this.this$0.onFastForwardClick();
            }
        });
        this.previousButton.setOnFocusChangeListener((View.OnFocusChangeListener)this.buttonFocusChangeListener);
        this.rewindButton.setOnFocusChangeListener((View.OnFocusChangeListener)this.buttonFocusChangeListener);
        this.playPauseButton.setOnFocusChangeListener((View.OnFocusChangeListener)this.buttonFocusChangeListener);
        this.fastForwardButton.setOnFocusChangeListener((View.OnFocusChangeListener)this.buttonFocusChangeListener);
        this.nextButton.setOnFocusChangeListener((View.OnFocusChangeListener)this.buttonFocusChangeListener);
    }

    @Override
    public void retrieveViews() {
        super.retrieveViews();
        this.progressBar = (ProgressBar)this.findViewById(R.id.exomedia_controls_video_progress);
        this.rewindButton = (ImageButton)this.findViewById(R.id.exomedia_controls_rewind_btn);
        this.fastForwardButton = (ImageButton)this.findViewById(R.id.exomedia_controls_fast_forward_btn);
        this.rippleIndicator = (ImageView)this.findViewById(R.id.exomedia_controls_leanback_ripple);
        this.controlsParent = (ViewGroup)this.findViewById(R.id.exomedia_controls_parent);
    }

    @Override
    public void setDuration(long l) {
        if (l != (long)this.progressBar.getMax()) {
            this.endTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
            this.progressBar.setMax((int)l);
        }
    }

    @Override
    public void setFastForwardButtonEnabled(boolean bl) {
        ImageButton imageButton = this.fastForwardButton;
        if (imageButton != null) {
            imageButton.setEnabled(bl);
            this.enabledViews.put(R.id.exomedia_controls_fast_forward_btn, bl);
        }
    }

    @Override
    public void setFastForwardButtonRemoved(boolean bl) {
        ImageButton imageButton = this.fastForwardButton;
        if (imageButton != null) {
            int n = bl ? 8 : 0;
            imageButton.setVisibility(n);
        }
    }

    @Override
    public void setFastForwardDrawable(Drawable drawable2) {
        ImageButton imageButton = this.fastForwardButton;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable2);
        }
    }

    @Override
    public void setPosition(long l) {
        this.currentTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
        this.progressBar.setProgress((int)l);
    }

    @Override
    public void setRewindButtonEnabled(boolean bl) {
        ImageButton imageButton = this.rewindButton;
        if (imageButton != null) {
            imageButton.setEnabled(bl);
            this.enabledViews.put(R.id.exomedia_controls_rewind_btn, bl);
        }
    }

    @Override
    public void setRewindButtonRemoved(boolean bl) {
        ImageButton imageButton = this.rewindButton;
        if (imageButton != null) {
            int n = bl ? 8 : 0;
            imageButton.setVisibility(n);
        }
    }

    @Override
    public void setRewindDrawable(Drawable drawable2) {
        ImageButton imageButton = this.rewindButton;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable2);
        }
    }

    @Override
    public void setup(Context context) {
        super.setup(context);
        this.internalListener = new LeanbackInternalListener(this);
        this.registerForInput();
        this.setFocusable(true);
    }

    @Override
    public void showLoading(boolean bl) {
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        this.controlsContainer.setVisibility(8);
        this.rippleIndicator.setVisibility(8);
        this.loadingProgressBar.setVisibility(0);
        this.show();
    }

    public void showTemporary() {
        this.show();
        VideoView videoView = this.videoView;
        if (videoView != null && videoView.isPlaying()) {
            this.hideDelayed();
        }
    }

    @Override
    public void updateButtonDrawables() {
        this.updateButtonDrawables(R.color.exomedia_default_controls_leanback_button_selector);
    }

    @Override
    public void updateButtonDrawables(int n) {
        super.updateButtonDrawables(n);
        Drawable drawable2 = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_rewind_white, n);
        this.rewindButton.setImageDrawable(drawable2);
        drawable2 = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_fast_forward_white, n);
        this.fastForwardButton.setImageDrawable(drawable2);
    }

    @Override
    public void updateProgress(@IntRange(from=0L) long l, @IntRange(from=0L) long l2, @IntRange(from=0L, to=100L) int n) {
        ProgressBar progressBar = this.progressBar;
        float f2 = progressBar.getMax();
        progressBar.setSecondaryProgress((int)((float)n / 100.0f * f2));
        this.progressBar.setProgress((int)l);
        this.currentTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
    }

    @Override
    public void updateTextContainerVisibility() {
        if (!this.isVisible) {
            return;
        }
        boolean bl = this.isTextContainerEmpty();
        if (this.hideEmptyTextContainer && bl && this.textContainer.getVisibility() == 0) {
            this.textContainer.clearAnimation();
            this.textContainer.startAnimation((Animation)new BottomViewHideShowAnimation((View)this.textContainer, false, 300L));
        } else if (!(this.hideEmptyTextContainer && bl || this.textContainer.getVisibility() == 0)) {
            this.textContainer.clearAnimation();
            this.textContainer.startAnimation((Animation)new BottomViewHideShowAnimation((View)this.textContainer, true, 300L));
        }
    }

    public class ButtonFocusChangeListener
    implements View.OnFocusChangeListener {
        public final VideoControlsLeanback this$0;

        public ButtonFocusChangeListener(VideoControlsLeanback videoControlsLeanback) {
            this.this$0 = videoControlsLeanback;
        }

        public int getHorizontalDelta(View view) {
            int[] nArray = new int[2];
            view.getLocationOnScreen(nArray);
            int n = nArray[0];
            this.this$0.rippleIndicator.getLocationOnScreen(nArray);
            return n - (this.this$0.rippleIndicator.getWidth() - view.getWidth()) / 2 - nArray[0];
        }

        public void onFocusChange(View view, boolean bl) {
            if (!bl) {
                return;
            }
            int n = this.getHorizontalDelta(view);
            this.this$0.rippleIndicator.startAnimation((Animation)new RippleTranslateAnimation(this.this$0, n));
        }
    }

    public class LeanbackInternalListener
    extends VideoControls.InternalListener {
        public final VideoControlsLeanback this$0;

        public LeanbackInternalListener(VideoControlsLeanback videoControlsLeanback) {
            this.this$0 = videoControlsLeanback;
            super(videoControlsLeanback);
        }

        @Override
        public boolean onFastForwardClicked() {
            long l;
            VideoView videoView = this.this$0.videoView;
            if (videoView == null) {
                return false;
            }
            long l2 = l = videoView.getCurrentPosition() + 10000L;
            if (l > (long)this.this$0.progressBar.getMax()) {
                l2 = this.this$0.progressBar.getMax();
            }
            this.this$0.performSeek(l2);
            return true;
        }

        @Override
        public boolean onRewindClicked() {
            long l;
            VideoView videoView = this.this$0.videoView;
            if (videoView == null) {
                return false;
            }
            long l2 = l = videoView.getCurrentPosition() - 10000L;
            if (l < 0L) {
                l2 = 0L;
            }
            this.this$0.performSeek(l2);
            return true;
        }
    }

    public class RemoteKeyListener
    implements View.OnKeyListener {
        public final VideoControlsLeanback this$0;

        public RemoteKeyListener(VideoControlsLeanback videoControlsLeanback) {
            this.this$0 = videoControlsLeanback;
        }

        public boolean onKey(View object, int n, KeyEvent keyEvent) {
            block22: {
                block18: {
                    block19: {
                        block20: {
                            block21: {
                                if (keyEvent.getAction() != 0) {
                                    return false;
                                }
                                if (n == 4) break block18;
                                if (n == 85) break block19;
                                if (n == 126) break block20;
                                if (n == 127) break block21;
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                break block22;
                                            }
                                            case 90: {
                                                this.this$0.onFastForwardClick();
                                                return true;
                                            }
                                            case 89: {
                                                this.this$0.onRewindClick();
                                                return true;
                                            }
                                            case 88: {
                                                this.this$0.onPreviousClick();
                                                return true;
                                            }
                                            case 87: {
                                                this.this$0.onNextClick();
                                                return true;
                                            }
                                        }
                                    }
                                    case 23: {
                                        this.this$0.showTemporary();
                                        this.this$0.currentFocus.callOnClick();
                                        return true;
                                    }
                                    case 22: {
                                        this.this$0.showTemporary();
                                        object = this.this$0;
                                        object.focusNext(object.currentFocus);
                                        return true;
                                    }
                                    case 21: {
                                        this.this$0.showTemporary();
                                        object = this.this$0;
                                        object.focusPrevious(object.currentFocus);
                                        return true;
                                    }
                                    case 20: {
                                        this.this$0.hide();
                                        return true;
                                    }
                                    case 19: {
                                        this.this$0.showTemporary();
                                        return true;
                                    }
                                }
                            }
                            object = this.this$0.videoView;
                            if (object != null && object.isPlaying()) {
                                this.this$0.videoView.pause();
                                return true;
                            }
                            break block22;
                        }
                        object = this.this$0.videoView;
                        if (object != null && !object.isPlaying()) {
                            this.this$0.videoView.start();
                            return true;
                        }
                        break block22;
                    }
                    this.this$0.onPlayPauseClick();
                    return true;
                }
                object = this.this$0;
                if (object.isVisible && object.canViewHide && !object.isLoading) {
                    object.hide();
                    return true;
                }
                if (object.controlsParent.getAnimation() != null) {
                    return true;
                }
            }
            return false;
        }
    }

    public class RippleTranslateAnimation
    extends TranslateAnimation
    implements Animation.AnimationListener {
        public static final long DURATION = 250L;
        public final VideoControlsLeanback this$0;
        public int xDelta;

        public RippleTranslateAnimation(VideoControlsLeanback videoControlsLeanback, int n) {
            this.this$0 = videoControlsLeanback;
            super(0.0f, (float)n, 0.0f, 0.0f);
            this.xDelta = n;
            this.setDuration(250L);
            this.setAnimationListener(this);
        }

        public void onAnimationEnd(Animation animation) {
            animation = this.this$0.rippleIndicator;
            animation.setX(animation.getX() + (float)this.xDelta);
            this.this$0.rippleIndicator.clearAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }
}


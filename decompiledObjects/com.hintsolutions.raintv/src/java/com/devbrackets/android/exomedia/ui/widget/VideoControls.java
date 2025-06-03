/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.util.SparseBooleanArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.ColorRes
 *  androidx.annotation.IntRange
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.util.LinkedList
 *  java.util.List
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.R;
import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.listener.VideoControlsVisibilityListener;
import com.devbrackets.android.exomedia.ui.widget.VideoControlsCore;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.devbrackets.android.exomedia.util.Repeater;
import com.devbrackets.android.exomedia.util.ResourceUtil;
import java.util.LinkedList;
import java.util.List;

public abstract class VideoControls
extends RelativeLayout
implements VideoControlsCore {
    public static final long CONTROL_VISIBILITY_ANIMATION_LENGTH = 300L;
    public static final int DEFAULT_CONTROL_HIDE_DELAY = 2000;
    @Nullable
    public VideoControlsButtonListener buttonsListener;
    public boolean canViewHide = true;
    public ViewGroup controlsContainer;
    public TextView currentTimeTextView;
    public TextView descriptionTextView;
    @NonNull
    public SparseBooleanArray enabledViews;
    public TextView endTimeTextView;
    public long hideDelay = 2000L;
    public boolean hideEmptyTextContainer = true;
    @NonNull
    public InternalListener internalListener;
    public boolean isLoading = false;
    public boolean isVisible = true;
    public ProgressBar loadingProgressBar;
    public ImageButton nextButton;
    public Drawable pauseDrawable;
    public Drawable playDrawable;
    public ImageButton playPauseButton;
    public ImageButton previousButton;
    @NonNull
    public Repeater progressPollRepeater;
    @Nullable
    public VideoControlsSeekListener seekListener;
    public TextView subTitleTextView;
    public ViewGroup textContainer;
    public TextView titleTextView;
    @Nullable
    public VideoView videoView;
    @NonNull
    public Handler visibilityHandler = new Handler();
    @Nullable
    public VideoControlsVisibilityListener visibilityListener;

    public VideoControls(Context context) {
        super(context);
        this.progressPollRepeater = new Repeater();
        this.internalListener = new InternalListener(this);
        this.enabledViews = new SparseBooleanArray();
        this.setup(context);
    }

    public VideoControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progressPollRepeater = new Repeater();
        this.internalListener = new InternalListener(this);
        this.enabledViews = new SparseBooleanArray();
        this.setup(context);
    }

    public VideoControls(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.progressPollRepeater = new Repeater();
        this.internalListener = new InternalListener(this);
        this.enabledViews = new SparseBooleanArray();
        this.setup(context);
    }

    @TargetApi(value=21)
    public VideoControls(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.progressPollRepeater = new Repeater();
        this.internalListener = new InternalListener(this);
        this.enabledViews = new SparseBooleanArray();
        this.setup(context);
    }

    public void addExtraView(@NonNull View view) {
    }

    public abstract void animateVisibility(boolean var1);

    @NonNull
    public List<View> getExtraViews() {
        return new LinkedList();
    }

    @LayoutRes
    public abstract int getLayoutResource();

    public void hide() {
        if (this.canViewHide && !this.isLoading) {
            this.visibilityHandler.removeCallbacksAndMessages(null);
            this.clearAnimation();
            this.animateVisibility(false);
        }
    }

    @Override
    public void hide(boolean bl) {
        if (bl) {
            this.hideDelayed();
        } else {
            this.hide();
        }
    }

    public void hideDelayed() {
        this.hideDelayed(this.hideDelay);
    }

    public void hideDelayed(long l) {
        this.hideDelay = l;
        if (l >= 0L && this.canViewHide && !this.isLoading) {
            this.visibilityHandler.postDelayed(new Runnable(this){
                public final VideoControls this$0;
                {
                    this.this$0 = videoControls;
                }

                public void run() {
                    this.this$0.hide();
                }
            }, l);
        }
    }

    public boolean isTextContainerEmpty() {
        if (this.titleTextView.getText() != null && this.titleTextView.getText().length() > 0) {
            return false;
        }
        if (this.subTitleTextView.getText() != null && this.subTitleTextView.getText().length() > 0) {
            return false;
        }
        return this.descriptionTextView.getText() == null || this.descriptionTextView.getText().length() <= 0;
    }

    @Override
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override
    public void onAttachedToView(@NonNull VideoView videoView) {
        videoView.addView((View)this);
        this.setVideoView(videoView);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.progressPollRepeater.setRepeatListener(new Repeater.RepeatListener(this){
            public final VideoControls this$0;
            {
                this.this$0 = videoControls;
            }

            @Override
            public void onRepeat() {
                this.this$0.updateProgress();
            }
        });
        VideoView videoView = this.videoView;
        if (videoView != null && videoView.isPlaying()) {
            this.updatePlaybackState(true);
        }
    }

    @Override
    public void onDetachedFromView(@NonNull VideoView videoView) {
        videoView.removeView((View)this);
        this.setVideoView(null);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.progressPollRepeater.stop();
        this.progressPollRepeater.setRepeatListener(null);
    }

    public void onNextClick() {
        VideoControlsButtonListener videoControlsButtonListener = this.buttonsListener;
        if (videoControlsButtonListener == null || !videoControlsButtonListener.onNextClicked()) {
            this.internalListener.onNextClicked();
        }
    }

    public void onPlayPauseClick() {
        VideoControlsButtonListener videoControlsButtonListener = this.buttonsListener;
        if (videoControlsButtonListener == null || !videoControlsButtonListener.onPlayPauseClicked()) {
            this.internalListener.onPlayPauseClicked();
        }
    }

    public void onPreviousClick() {
        VideoControlsButtonListener videoControlsButtonListener = this.buttonsListener;
        if (videoControlsButtonListener == null || !videoControlsButtonListener.onPreviousClicked()) {
            this.internalListener.onPreviousClicked();
        }
    }

    public void onVisibilityChanged() {
        VideoControlsVisibilityListener videoControlsVisibilityListener = this.visibilityListener;
        if (videoControlsVisibilityListener == null) {
            return;
        }
        if (this.isVisible) {
            videoControlsVisibilityListener.onControlsShown();
        } else {
            videoControlsVisibilityListener.onControlsHidden();
        }
    }

    public void registerListeners() {
        this.playPauseButton.setOnClickListener(new View.OnClickListener(this){
            public final VideoControls this$0;
            {
                this.this$0 = videoControls;
            }

            public void onClick(View view) {
                this.this$0.onPlayPauseClick();
            }
        });
        this.previousButton.setOnClickListener(new View.OnClickListener(this){
            public final VideoControls this$0;
            {
                this.this$0 = videoControls;
            }

            public void onClick(View view) {
                this.this$0.onPreviousClick();
            }
        });
        this.nextButton.setOnClickListener(new View.OnClickListener(this){
            public final VideoControls this$0;
            {
                this.this$0 = videoControls;
            }

            public void onClick(View view) {
                this.this$0.onNextClick();
            }
        });
    }

    public void removeExtraView(@NonNull View view) {
    }

    public void retrieveViews() {
        this.currentTimeTextView = (TextView)this.findViewById(R.id.exomedia_controls_current_time);
        this.endTimeTextView = (TextView)this.findViewById(R.id.exomedia_controls_end_time);
        this.titleTextView = (TextView)this.findViewById(R.id.exomedia_controls_title);
        this.subTitleTextView = (TextView)this.findViewById(R.id.exomedia_controls_sub_title);
        this.descriptionTextView = (TextView)this.findViewById(R.id.exomedia_controls_description);
        this.playPauseButton = (ImageButton)this.findViewById(R.id.exomedia_controls_play_pause_btn);
        this.previousButton = (ImageButton)this.findViewById(R.id.exomedia_controls_previous_btn);
        this.nextButton = (ImageButton)this.findViewById(R.id.exomedia_controls_next_btn);
        this.loadingProgressBar = (ProgressBar)this.findViewById(R.id.exomedia_controls_video_loading);
        this.controlsContainer = (ViewGroup)this.findViewById(R.id.exomedia_controls_interactive_container);
        this.textContainer = (ViewGroup)this.findViewById(R.id.exomedia_controls_text_container);
    }

    public void setButtonListener(@Nullable VideoControlsButtonListener videoControlsButtonListener) {
        this.buttonsListener = videoControlsButtonListener;
    }

    public void setCanHide(boolean bl) {
        this.canViewHide = bl;
    }

    public void setDescription(@Nullable CharSequence charSequence) {
        this.descriptionTextView.setText(charSequence);
        this.updateTextContainerVisibility();
    }

    public void setFastForwardButtonEnabled(boolean bl) {
    }

    public void setFastForwardButtonRemoved(boolean bl) {
    }

    public void setFastForwardDrawable(Drawable drawable2) {
    }

    public void setHideDelay(long l) {
        this.hideDelay = l;
    }

    public void setHideEmptyTextContainer(boolean bl) {
        this.hideEmptyTextContainer = bl;
        this.updateTextContainerVisibility();
    }

    public void setNextButtonEnabled(boolean bl) {
        this.nextButton.setEnabled(bl);
        this.enabledViews.put(R.id.exomedia_controls_next_btn, bl);
    }

    public void setNextButtonRemoved(boolean bl) {
        ImageButton imageButton = this.nextButton;
        int n = bl ? 8 : 0;
        imageButton.setVisibility(n);
    }

    public void setNextDrawable(Drawable drawable2) {
        this.nextButton.setImageDrawable(drawable2);
    }

    public void setPlayPauseDrawables(Drawable object, Drawable drawable2) {
        this.playDrawable = object;
        this.pauseDrawable = drawable2;
        object = this.videoView;
        boolean bl = object != null && object.isPlaying();
        this.updatePlayPauseImage(bl);
    }

    public abstract void setPosition(@IntRange(from=0L) long var1);

    public void setPreviousButtonEnabled(boolean bl) {
        this.previousButton.setEnabled(bl);
        this.enabledViews.put(R.id.exomedia_controls_previous_btn, bl);
    }

    public void setPreviousButtonRemoved(boolean bl) {
        ImageButton imageButton = this.previousButton;
        int n = bl ? 8 : 0;
        imageButton.setVisibility(n);
    }

    public void setPreviousDrawable(Drawable drawable2) {
        this.previousButton.setImageDrawable(drawable2);
    }

    public void setRewindButtonEnabled(boolean bl) {
    }

    public void setRewindButtonRemoved(boolean bl) {
    }

    public void setRewindDrawable(Drawable drawable2) {
    }

    public void setSeekListener(@Nullable VideoControlsSeekListener videoControlsSeekListener) {
        this.seekListener = videoControlsSeekListener;
    }

    public void setSubTitle(@Nullable CharSequence charSequence) {
        this.subTitleTextView.setText(charSequence);
        this.updateTextContainerVisibility();
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.titleTextView.setText(charSequence);
        this.updateTextContainerVisibility();
    }

    @Deprecated
    public void setVideoView(@Nullable VideoView videoView) {
        this.videoView = videoView;
    }

    public void setVisibilityListener(@Nullable VideoControlsVisibilityListener videoControlsVisibilityListener) {
        this.visibilityListener = videoControlsVisibilityListener;
    }

    public void setup(Context context) {
        View.inflate((Context)context, (int)this.getLayoutResource(), (ViewGroup)this);
        this.retrieveViews();
        this.registerListeners();
        this.updateButtonDrawables();
    }

    @Override
    public void show() {
        this.visibilityHandler.removeCallbacksAndMessages(null);
        this.clearAnimation();
        this.animateVisibility(true);
    }

    public void updateButtonDrawables() {
        this.updateButtonDrawables(R.color.exomedia_default_controls_button_selector);
    }

    public void updateButtonDrawables(@ColorRes int n) {
        this.playDrawable = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_play_arrow_white, n);
        this.pauseDrawable = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_pause_white, n);
        this.playPauseButton.setImageDrawable(this.playDrawable);
        Drawable drawable2 = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_skip_previous_white, n);
        this.previousButton.setImageDrawable(drawable2);
        drawable2 = ResourceUtil.tintList(this.getContext(), R.drawable.exomedia_ic_skip_next_white, n);
        this.nextButton.setImageDrawable(drawable2);
    }

    public void updatePlayPauseImage(boolean bl) {
        ImageButton imageButton = this.playPauseButton;
        Drawable drawable2 = bl ? this.pauseDrawable : this.playDrawable;
        imageButton.setImageDrawable(drawable2);
    }

    @Override
    public void updatePlaybackState(boolean bl) {
        this.updatePlayPauseImage(bl);
        this.progressPollRepeater.start();
        if (bl) {
            this.hideDelayed();
        } else {
            this.show();
        }
    }

    public void updateProgress() {
        VideoView videoView = this.videoView;
        if (videoView != null) {
            this.updateProgress(videoView.getCurrentPosition(), this.videoView.getDuration(), this.videoView.getBufferPercentage());
        }
    }

    public abstract void updateProgress(@IntRange(from=0L) long var1, @IntRange(from=0L) long var3, @IntRange(from=0L, to=100L) int var5);

    public abstract void updateTextContainerVisibility();

    public class InternalListener
    implements VideoControlsSeekListener,
    VideoControlsButtonListener {
        public boolean pausedForSeek;
        public final VideoControls this$0;

        public InternalListener(VideoControls videoControls) {
            this.this$0 = videoControls;
            this.pausedForSeek = false;
        }

        @Override
        public boolean onFastForwardClicked() {
            return false;
        }

        @Override
        public boolean onNextClicked() {
            return false;
        }

        @Override
        public boolean onPlayPauseClicked() {
            VideoView videoView = this.this$0.videoView;
            if (videoView == null) {
                return false;
            }
            if (videoView.isPlaying()) {
                this.this$0.videoView.pause();
            } else {
                this.this$0.videoView.start();
            }
            return true;
        }

        @Override
        public boolean onPreviousClicked() {
            return false;
        }

        @Override
        public boolean onRewindClicked() {
            return false;
        }

        @Override
        public boolean onSeekEnded(long l) {
            VideoView videoView = this.this$0.videoView;
            if (videoView == null) {
                return false;
            }
            videoView.seekTo(l);
            if (this.pausedForSeek) {
                this.pausedForSeek = false;
                this.this$0.videoView.start();
                this.this$0.hideDelayed();
            }
            return true;
        }

        @Override
        public boolean onSeekStarted() {
            VideoView videoView = this.this$0.videoView;
            if (videoView == null) {
                return false;
            }
            if (videoView.isPlaying()) {
                this.pausedForSeek = true;
                this.this$0.videoView.pause(true);
            }
            this.this$0.show();
            return true;
        }
    }
}


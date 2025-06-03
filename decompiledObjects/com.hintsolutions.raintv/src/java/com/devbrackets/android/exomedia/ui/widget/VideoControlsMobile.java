/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.animation.Animation
 *  android.widget.LinearLayout
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.util.LinkedList
 *  java.util.List
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.devbrackets.android.exomedia.R;
import com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation;
import com.devbrackets.android.exomedia.ui.animation.TopViewHideShowAnimation;
import com.devbrackets.android.exomedia.ui.widget.VideoControls;
import com.devbrackets.android.exomedia.ui.widget.VideoView;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;
import java.util.LinkedList;
import java.util.List;

public class VideoControlsMobile
extends VideoControls {
    public LinearLayout extraViewsContainer;
    public SeekBar seekBar;
    public boolean userInteracting = false;

    public VideoControlsMobile(Context context) {
        super(context);
    }

    public VideoControlsMobile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoControlsMobile(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
    }

    @TargetApi(value=21)
    public VideoControlsMobile(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
    }

    @Override
    public void addExtraView(@NonNull View view) {
        this.extraViewsContainer.addView(view);
    }

    @Override
    public void animateVisibility(boolean bl) {
        if (this.isVisible == bl) {
            return;
        }
        if (!this.hideEmptyTextContainer || !this.isTextContainerEmpty()) {
            this.textContainer.startAnimation((Animation)new TopViewHideShowAnimation((View)this.textContainer, bl, 300L));
        }
        if (!this.isLoading) {
            this.controlsContainer.startAnimation((Animation)new BottomViewHideShowAnimation((View)this.controlsContainer, bl, 300L));
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
        this.loadingProgressBar.setVisibility(8);
        this.controlsContainer.setVisibility(0);
        this.playPauseButton.setEnabled(true);
        this.previousButton.setEnabled(this.enabledViews.get(R.id.exomedia_controls_previous_btn, true));
        this.nextButton.setEnabled(this.enabledViews.get(R.id.exomedia_controls_next_btn, true));
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

    @Override
    @NonNull
    public List<View> getExtraViews() {
        int n = this.extraViewsContainer.getChildCount();
        if (n <= 0) {
            return super.getExtraViews();
        }
        LinkedList linkedList = new LinkedList();
        for (int j = 0; j < n; ++j) {
            linkedList.add((Object)this.extraViewsContainer.getChildAt(j));
        }
        return linkedList;
    }

    @Override
    public int getLayoutResource() {
        return R.layout.exomedia_default_controls_mobile;
    }

    @Override
    public void hideDelayed(long l) {
        this.hideDelay = l;
        if (l >= 0L && this.canViewHide && !this.isLoading && !this.userInteracting) {
            this.visibilityHandler.postDelayed(new Runnable(this){
                public final VideoControlsMobile this$0;
                {
                    this.this$0 = videoControlsMobile;
                }

                public void run() {
                    this.this$0.animateVisibility(false);
                }
            }, l);
        }
    }

    @Override
    public void registerListeners() {
        super.registerListeners();
        this.seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)new SeekBarChanged(this));
    }

    @Override
    public void removeExtraView(@NonNull View view) {
        this.extraViewsContainer.removeView(view);
    }

    @Override
    public void retrieveViews() {
        super.retrieveViews();
        this.seekBar = (SeekBar)this.findViewById(R.id.exomedia_controls_video_seek);
        this.extraViewsContainer = (LinearLayout)this.findViewById(R.id.exomedia_controls_extra_container);
    }

    @Override
    public void setDuration(@IntRange(from=0L) long l) {
        if (l != (long)this.seekBar.getMax()) {
            this.endTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
            this.seekBar.setMax((int)l);
        }
    }

    @Override
    public void setPosition(@IntRange(from=0L) long l) {
        this.currentTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
        this.seekBar.setProgress((int)l);
    }

    @Override
    public void showLoading(boolean bl) {
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        this.loadingProgressBar.setVisibility(0);
        if (bl) {
            this.controlsContainer.setVisibility(8);
        } else {
            this.playPauseButton.setEnabled(false);
            this.previousButton.setEnabled(false);
            this.nextButton.setEnabled(false);
        }
        this.show();
    }

    @Override
    public void updateProgress(@IntRange(from=0L) long l, @IntRange(from=0L) long l2, @IntRange(from=0L, to=100L) int n) {
        if (!this.userInteracting) {
            SeekBar seekBar = this.seekBar;
            float f2 = seekBar.getMax();
            seekBar.setSecondaryProgress((int)((float)n / 100.0f * f2));
            this.seekBar.setProgress((int)l);
            this.currentTimeTextView.setText((CharSequence)TimeFormatUtil.formatMs(l));
        }
    }

    @Override
    public void updateTextContainerVisibility() {
        if (!this.isVisible) {
            return;
        }
        boolean bl = this.isTextContainerEmpty();
        if (this.hideEmptyTextContainer && bl && this.textContainer.getVisibility() == 0) {
            this.textContainer.clearAnimation();
            this.textContainer.startAnimation((Animation)new TopViewHideShowAnimation((View)this.textContainer, false, 300L));
        } else if (!(this.hideEmptyTextContainer && bl || this.textContainer.getVisibility() == 0)) {
            this.textContainer.clearAnimation();
            this.textContainer.startAnimation((Animation)new TopViewHideShowAnimation((View)this.textContainer, true, 300L));
        }
    }

    public class SeekBarChanged
    implements SeekBar.OnSeekBarChangeListener {
        private long seekToTime;
        public final VideoControlsMobile this$0;

        public SeekBarChanged(VideoControlsMobile videoControlsMobile) {
            this.this$0 = videoControlsMobile;
        }

        public void onProgressChanged(SeekBar seekBar, int n, boolean bl) {
            long l;
            if (!bl) {
                return;
            }
            this.seekToTime = l = (long)n;
            seekBar = this.this$0.currentTimeTextView;
            if (seekBar != null) {
                seekBar.setText((CharSequence)TimeFormatUtil.formatMs(l));
            }
        }

        public void onStartTrackingTouch(SeekBar object) {
            object = this.this$0;
            ((VideoControlsMobile)object).userInteracting = true;
            object = ((VideoControls)object).seekListener;
            if (object == null || !object.onSeekStarted()) {
                this.this$0.internalListener.onSeekStarted();
            }
        }

        public void onStopTrackingTouch(SeekBar object) {
            object = this.this$0;
            ((VideoControlsMobile)object).userInteracting = false;
            object = ((VideoControls)object).seekListener;
            if (object == null || !object.onSeekEnded(this.seekToTime)) {
                this.this$0.internalListener.onSeekEnded(this.seekToTime);
            }
        }
    }
}


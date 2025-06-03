/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.internal.AnimationUtils;
import com.twitter.sdk.android.tweetui.internal.MediaTimeUtils;

public class VideoControlView
extends FrameLayout {
    public static final int FADE_DURATION_MS = 150;
    public static final long PROGRESS_BAR_TICKS = 1000L;
    private static final int SHOW_PROGRESS_MSG = 1001;
    public TextView currentTime;
    public TextView duration;
    @SuppressLint(value={"HandlerLeak"})
    private final Handler handler = new Handler(this){
        public final VideoControlView this$0;
        {
            this.this$0 = videoControlView;
        }

        public void handleMessage(Message object) {
            if (((Message)object).what == 1001) {
                object = this.this$0;
                if (((VideoControlView)((Object)object)).player == null) {
                    return;
                }
                ((VideoControlView)((Object)object)).updateProgress();
                this.this$0.updateStateControl();
                if (this.this$0.isShowing() && this.this$0.player.isPlaying()) {
                    this.sendMessageDelayed(this.obtainMessage(1001), 500L);
                }
            }
        }
    };
    public MediaPlayerControl player;
    public SeekBar seekBar;
    public ImageButton stateControl;

    public VideoControlView(Context context) {
        super(context);
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
    }

    public SeekBar.OnSeekBarChangeListener createProgressChangeListener() {
        return new SeekBar.OnSeekBarChangeListener(this){
            public final VideoControlView this$0;
            {
                this.this$0 = videoControlView;
            }

            public void onProgressChanged(SeekBar object, int n, boolean bl) {
                if (!bl) {
                    return;
                }
                long l2 = (long)(this.this$0.player.getDuration() * n) / 1000L;
                object = this.this$0.player;
                n = (int)l2;
                object.seekTo(n);
                this.this$0.setCurrentTime(n);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                this.this$0.handler.removeMessages(1001);
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                this.this$0.handler.sendEmptyMessage(1001);
            }
        };
    }

    public View.OnClickListener createStateControlClickListener() {
        return new View.OnClickListener(this){
            public final VideoControlView this$0;
            {
                this.this$0 = videoControlView;
            }

            public void onClick(View view) {
                if (this.this$0.player.isPlaying()) {
                    this.this$0.player.pause();
                } else {
                    this.this$0.player.start();
                }
                this.this$0.show();
            }
        };
    }

    public void hide() {
        this.handler.removeMessages(1001);
        AnimationUtils.fadeOut((View)this, 150);
    }

    public void initSubviews() {
        SeekBar seekBar;
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(R.layout.tw__video_control, (ViewGroup)this);
        this.stateControl = (ImageButton)this.findViewById(R.id.tw__state_control);
        this.currentTime = (TextView)this.findViewById(R.id.tw__current_time);
        this.duration = (TextView)this.findViewById(R.id.tw__duration);
        this.seekBar = seekBar = (SeekBar)this.findViewById(R.id.tw__progress);
        seekBar.setMax(1000);
        this.seekBar.setOnSeekBarChangeListener(this.createProgressChangeListener());
        this.stateControl.setOnClickListener(this.createStateControlClickListener());
        this.setDuration(0);
        this.setCurrentTime(0);
        this.setProgress(0, 0, 0);
    }

    public boolean isShowing() {
        boolean bl = this.getVisibility() == 0;
        return bl;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.initSubviews();
    }

    public void setCurrentTime(int n) {
        this.currentTime.setText((CharSequence)MediaTimeUtils.getPlaybackTime(n));
    }

    public void setDuration(int n) {
        this.duration.setText((CharSequence)MediaTimeUtils.getPlaybackTime(n));
    }

    public void setMediaPlayer(MediaPlayerControl mediaPlayerControl) {
        this.player = mediaPlayerControl;
    }

    public void setPauseDrawable() {
        this.stateControl.setImageResource(R.drawable.tw__video_pause_btn);
        this.stateControl.setContentDescription((CharSequence)this.getContext().getString(R.string.tw__pause));
    }

    public void setPlayDrawable() {
        this.stateControl.setImageResource(R.drawable.tw__video_play_btn);
        this.stateControl.setContentDescription((CharSequence)this.getContext().getString(R.string.tw__play));
    }

    public void setProgress(int n, int n3, int n4) {
        long l2 = n3 > 0 ? (long)n * 1000L / (long)n3 : 0L;
        this.seekBar.setProgress((int)l2);
        this.seekBar.setSecondaryProgress(n4 * 10);
    }

    public void setReplayDrawable() {
        this.stateControl.setImageResource(R.drawable.tw__video_replay_btn);
        this.stateControl.setContentDescription((CharSequence)this.getContext().getString(R.string.tw__replay));
    }

    public void show() {
        this.handler.sendEmptyMessage(1001);
        AnimationUtils.fadeIn((View)this, 150);
    }

    public void update() {
        this.handler.sendEmptyMessage(1001);
    }

    public void updateProgress() {
        int n = this.player.getDuration();
        int n3 = this.player.getCurrentPosition();
        int n4 = this.player.getBufferPercentage();
        this.setDuration(n);
        this.setCurrentTime(n3);
        this.setProgress(n3, n, n4);
    }

    public void updateStateControl() {
        if (this.player.isPlaying()) {
            this.setPauseDrawable();
        } else if (this.player.getCurrentPosition() > Math.max((int)(this.player.getDuration() - 500), (int)0)) {
            this.setReplayDrawable();
        } else {
            this.setPlayDrawable();
        }
    }

    public static interface MediaPlayerControl {
        public int getBufferPercentage();

        public int getCurrentPosition();

        public int getDuration();

        public boolean isPlaying();

        public void pause();

        public void seekTo(int var1);

        public void start();
    }
}


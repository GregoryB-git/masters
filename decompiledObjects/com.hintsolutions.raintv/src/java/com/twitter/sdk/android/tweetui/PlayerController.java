/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener
 *  com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener$Callback
 *  com.twitter.sdk.android.tweetui.internal.VideoControlView
 *  com.twitter.sdk.android.tweetui.internal.VideoView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.sdk.android.core.IntentUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;

class PlayerController {
    private static final String TAG = "PlayerController";
    public final TextView callToActionView;
    public final SwipeToDismissTouchListener.Callback callback;
    public boolean isPlaying = true;
    public final View rootView;
    public int seekPosition;
    public final VideoControlView videoControlView;
    public final ProgressBar videoProgressView;
    public final VideoView videoView;

    public PlayerController(View view, SwipeToDismissTouchListener.Callback callback) {
        this.rootView = view;
        this.videoView = (VideoView)view.findViewById(R.id.video_view);
        this.videoControlView = (VideoControlView)view.findViewById(R.id.video_control_view);
        this.videoProgressView = (ProgressBar)view.findViewById(R.id.video_progress_view);
        this.callToActionView = (TextView)view.findViewById(R.id.call_to_action_view);
        this.callback = callback;
    }

    public PlayerController(View view, VideoView videoView, VideoControlView videoControlView, ProgressBar progressBar, TextView textView, SwipeToDismissTouchListener.Callback callback) {
        this.rootView = view;
        this.videoView = videoView;
        this.videoControlView = videoControlView;
        this.videoProgressView = progressBar;
        this.callToActionView = textView;
        this.callback = callback;
    }

    public void onDestroy() {
        this.videoView.stopPlayback();
    }

    public void onPause() {
        this.isPlaying = this.videoView.isPlaying();
        this.seekPosition = this.videoView.getCurrentPosition();
        this.videoView.pause();
    }

    public void onResume() {
        int n = this.seekPosition;
        if (n != 0) {
            this.videoView.seekTo(n);
        }
        if (this.isPlaying) {
            this.videoView.start();
            this.videoControlView.update();
        }
    }

    public void prepare(PlayerActivity.PlayerItem playerItem) {
        try {
            this.setUpCallToAction(playerItem);
            this.setUpMediaControl(playerItem.looping, playerItem.showVideoControls);
            Object object = SwipeToDismissTouchListener.createFromView((View)this.videoView, (SwipeToDismissTouchListener.Callback)this.callback);
            this.videoView.setOnTouchListener((View.OnTouchListener)object);
            VideoView videoView = this.videoView;
            object = new MediaPlayer.OnPreparedListener(this){
                public final PlayerController this$0;
                {
                    this.this$0 = playerController;
                }

                public void onPrepared(MediaPlayer mediaPlayer) {
                    this.this$0.videoProgressView.setVisibility(8);
                }
            };
            videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener)object);
            videoView = this.videoView;
            object = new MediaPlayer.OnInfoListener(this){
                public final PlayerController this$0;
                {
                    this.this$0 = playerController;
                }

                public boolean onInfo(MediaPlayer mediaPlayer, int n, int n2) {
                    if (n == 702) {
                        this.this$0.videoProgressView.setVisibility(8);
                        return true;
                    }
                    if (n == 701) {
                        this.this$0.videoProgressView.setVisibility(0);
                        return true;
                    }
                    return false;
                }
            };
            videoView.setOnInfoListener((MediaPlayer.OnInfoListener)object);
            object = Uri.parse((String)playerItem.url);
            this.videoView.setVideoURI((Uri)object, playerItem.looping);
            this.videoView.requestFocus();
        }
        catch (Exception exception) {
            Twitter.getLogger().e(TAG, "Error occurred during video playback", exception);
        }
    }

    public void setUpCallToAction(PlayerActivity.PlayerItem playerItem) {
        if (playerItem.callToActionText != null && playerItem.callToActionUrl != null) {
            this.callToActionView.setVisibility(0);
            this.callToActionView.setText((CharSequence)playerItem.callToActionText);
            this.setUpCallToActionListener(playerItem.callToActionUrl);
            this.setUpRootViewOnClickListener();
        }
    }

    public void setUpCallToActionListener(String string2) {
        this.callToActionView.setOnClickListener(new View.OnClickListener(this, string2){
            public final PlayerController this$0;
            public final String val$callToActionUrl;
            {
                this.this$0 = playerController;
                this.val$callToActionUrl = string2;
            }

            public void onClick(View view) {
                view = new Intent("android.intent.action.VIEW", Uri.parse((String)this.val$callToActionUrl));
                IntentUtils.safeStartActivity(this.this$0.callToActionView.getContext(), (Intent)view);
            }
        });
    }

    public void setUpLoopControl() {
        this.videoControlView.setVisibility(4);
        this.videoView.setOnClickListener(new View.OnClickListener(this){
            public final PlayerController this$0;
            {
                this.this$0 = playerController;
            }

            public void onClick(View view) {
                if (this.this$0.videoView.isPlaying()) {
                    this.this$0.videoView.pause();
                } else {
                    this.this$0.videoView.start();
                }
            }
        });
    }

    public void setUpMediaControl() {
        this.videoView.setMediaController(this.videoControlView);
    }

    public void setUpMediaControl(boolean bl, boolean bl2) {
        if (bl && !bl2) {
            this.setUpLoopControl();
        } else {
            this.setUpMediaControl();
        }
    }

    public void setUpRootViewOnClickListener() {
        this.rootView.setOnClickListener(new View.OnClickListener(this){
            public final PlayerController this$0;
            {
                this.this$0 = playerController;
            }

            public void onClick(View view) {
                if (this.this$0.callToActionView.getVisibility() == 0) {
                    this.this$0.callToActionView.setVisibility(8);
                } else {
                    this.this$0.callToActionView.setVisibility(0);
                }
            }
        });
    }
}


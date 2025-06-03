/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;

public class VideoView
extends SurfaceView
implements VideoControlView.MediaPlayerControl {
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG = "VideoView";
    private GestureDetector gestureDetector;
    private int mAudioSession;
    private MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    private MediaPlayer.OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState = 0;
    private MediaPlayer.OnErrorListener mErrorListener;
    private MediaPlayer.OnInfoListener mInfoListener;
    private boolean mLooping;
    private VideoControlView mMediaController;
    private MediaPlayer mMediaPlayer = null;
    private MediaPlayer.OnCompletionListener mOnCompletionListener;
    private MediaPlayer.OnErrorListener mOnErrorListener;
    private MediaPlayer.OnInfoListener mOnInfoListener;
    private MediaPlayer.OnPreparedListener mOnPreparedListener;
    public MediaPlayer.OnPreparedListener mPreparedListener;
    public SurfaceHolder.Callback mSHCallback;
    private int mSeekWhenPrepared;
    public MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new MediaPlayer.OnVideoSizeChangedListener(this){
        public final VideoView this$0;
        {
            this.this$0 = videoView;
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int n, int n2) {
            VideoView.access$002(this.this$0, mediaPlayer.getVideoWidth());
            VideoView.access$102(this.this$0, mediaPlayer.getVideoHeight());
            if (VideoView.access$000(this.this$0) != 0 && VideoView.access$100(this.this$0) != 0) {
                this.this$0.getHolder().setFixedSize(VideoView.access$000(this.this$0), VideoView.access$100(this.this$0));
                this.this$0.requestLayout();
            }
        }
    };
    private int mSurfaceHeight;
    private SurfaceHolder mSurfaceHolder = null;
    private int mSurfaceWidth;
    private int mTargetState = 0;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;

    public VideoView(Context context) {
        super(context);
        this.mPreparedListener = new MediaPlayer.OnPreparedListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public void onPrepared(MediaPlayer mediaPlayer) {
                VideoView.access$202(this.this$0, 2);
                if (VideoView.access$300(this.this$0) != null) {
                    VideoView.access$300(this.this$0).onPrepared(VideoView.access$400(this.this$0));
                }
                if (VideoView.access$500(this.this$0) != null) {
                    VideoView.access$500(this.this$0).setEnabled(true);
                }
                VideoView.access$002(this.this$0, mediaPlayer.getVideoWidth());
                VideoView.access$102(this.this$0, mediaPlayer.getVideoHeight());
                int n = VideoView.access$600(this.this$0);
                if (n != 0) {
                    this.this$0.seekTo(n);
                }
                if (VideoView.access$000(this.this$0) != 0 && VideoView.access$100(this.this$0) != 0) {
                    this.this$0.getHolder().setFixedSize(VideoView.access$000(this.this$0), VideoView.access$100(this.this$0));
                    if (VideoView.access$700(this.this$0) == VideoView.access$000(this.this$0) && VideoView.access$800(this.this$0) == VideoView.access$100(this.this$0)) {
                        if (VideoView.access$900(this.this$0) == 3) {
                            this.this$0.start();
                            if (VideoView.access$500(this.this$0) != null) {
                                VideoView.access$500(this.this$0).show();
                            }
                        } else if (!(this.this$0.isPlaying() || n == 0 && this.this$0.getCurrentPosition() <= 0 || VideoView.access$500(this.this$0) == null)) {
                            VideoView.access$500(this.this$0).show();
                        }
                    }
                } else if (VideoView.access$900(this.this$0) == 3) {
                    this.this$0.start();
                }
            }
        };
        this.mCompletionListener = new MediaPlayer.OnCompletionListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                VideoView.access$202(this.this$0, 5);
                VideoView.access$902(this.this$0, 5);
                if (VideoView.access$1000(this.this$0) != null) {
                    VideoView.access$1000(this.this$0).onCompletion(VideoView.access$400(this.this$0));
                }
            }
        };
        this.mInfoListener = new MediaPlayer.OnInfoListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public boolean onInfo(MediaPlayer mediaPlayer, int n, int n2) {
                if (VideoView.access$1100(this.this$0) != null) {
                    VideoView.access$1100(this.this$0).onInfo(mediaPlayer, n, n2);
                }
                return true;
            }
        };
        this.mErrorListener = new MediaPlayer.OnErrorListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public boolean onError(MediaPlayer mediaPlayer, int n, int n2) {
                String string2 = VideoView.access$1200(this.this$0);
                mediaPlayer = new StringBuilder();
                mediaPlayer.append("Error: ");
                mediaPlayer.append(n);
                mediaPlayer.append(",");
                mediaPlayer.append(n2);
                Log.d((String)string2, (String)mediaPlayer.toString());
                VideoView.access$202(this.this$0, -1);
                VideoView.access$902(this.this$0, -1);
                if (VideoView.access$500(this.this$0) != null) {
                    VideoView.access$500(this.this$0).hide();
                }
                if (VideoView.access$1300(this.this$0) != null) {
                    VideoView.access$1300(this.this$0).onError(VideoView.access$400(this.this$0), n, n2);
                }
                return true;
            }
        };
        this.mBufferingUpdateListener = new MediaPlayer.OnBufferingUpdateListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public void onBufferingUpdate(MediaPlayer mediaPlayer, int n) {
                VideoView.access$1402(this.this$0, n);
            }
        };
        this.gestureDetector = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (VideoView.access$1500(this.this$0) && VideoView.access$500(this.this$0) != null) {
                    VideoView.access$1600(this.this$0);
                }
                return false;
            }
        });
        this.mSHCallback = new SurfaceHolder.Callback(this){
            public final VideoView this$0;
            {
                this.this$0 = videoView;
            }

            public void surfaceChanged(SurfaceHolder object, int n, int n2, int n3) {
                VideoView.access$702(this.this$0, n2);
                VideoView.access$802(this.this$0, n3);
                n = VideoView.access$900(this.this$0);
                int n4 = 1;
                n = n == 3 ? 1 : 0;
                n2 = VideoView.access$000(this.this$0) == n2 && VideoView.access$100(this.this$0) == n3 ? n4 : 0;
                if (VideoView.access$400(this.this$0) != null && n != 0 && n2 != 0) {
                    if (VideoView.access$600(this.this$0) != 0) {
                        object = this.this$0;
                        ((VideoView)object).seekTo(VideoView.access$600((VideoView)object));
                    }
                    this.this$0.start();
                    if (VideoView.access$500(this.this$0) != null) {
                        VideoView.access$500(this.this$0).show();
                    }
                }
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoView.access$1702(this.this$0, surfaceHolder);
                VideoView.access$1800(this.this$0);
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoView.access$1702(this.this$0, null);
                if (VideoView.access$500(this.this$0) != null) {
                    VideoView.access$500(this.this$0).hide();
                }
                VideoView.access$1900(this.this$0, true);
            }
        };
        this.initVideoView();
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.mPreparedListener = new /* invalid duplicate definition of identical inner class */;
        this.mCompletionListener = new /* invalid duplicate definition of identical inner class */;
        this.mInfoListener = new /* invalid duplicate definition of identical inner class */;
        this.mErrorListener = new /* invalid duplicate definition of identical inner class */;
        this.mBufferingUpdateListener = new /* invalid duplicate definition of identical inner class */;
        this.gestureDetector = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new /* invalid duplicate definition of identical inner class */);
        this.mSHCallback = new /* invalid duplicate definition of identical inner class */;
        this.initVideoView();
    }

    public static /* synthetic */ int access$000(VideoView videoView) {
        return videoView.mVideoWidth;
    }

    public static /* synthetic */ int access$002(VideoView videoView, int n) {
        videoView.mVideoWidth = n;
        return n;
    }

    public static /* synthetic */ int access$100(VideoView videoView) {
        return videoView.mVideoHeight;
    }

    public static /* synthetic */ MediaPlayer.OnCompletionListener access$1000(VideoView videoView) {
        return videoView.mOnCompletionListener;
    }

    public static /* synthetic */ int access$102(VideoView videoView, int n) {
        videoView.mVideoHeight = n;
        return n;
    }

    public static /* synthetic */ MediaPlayer.OnInfoListener access$1100(VideoView videoView) {
        return videoView.mOnInfoListener;
    }

    public static /* synthetic */ String access$1200(VideoView videoView) {
        return videoView.TAG;
    }

    public static /* synthetic */ MediaPlayer.OnErrorListener access$1300(VideoView videoView) {
        return videoView.mOnErrorListener;
    }

    public static /* synthetic */ int access$1402(VideoView videoView, int n) {
        videoView.mCurrentBufferPercentage = n;
        return n;
    }

    public static /* synthetic */ boolean access$1500(VideoView videoView) {
        return videoView.isInPlaybackState();
    }

    public static /* synthetic */ void access$1600(VideoView videoView) {
        videoView.toggleMediaControlsVisiblity();
    }

    public static /* synthetic */ SurfaceHolder access$1702(VideoView videoView, SurfaceHolder surfaceHolder) {
        videoView.mSurfaceHolder = surfaceHolder;
        return surfaceHolder;
    }

    public static /* synthetic */ void access$1800(VideoView videoView) {
        videoView.openVideo();
    }

    public static /* synthetic */ void access$1900(VideoView videoView, boolean bl) {
        videoView.release(bl);
    }

    public static /* synthetic */ int access$202(VideoView videoView, int n) {
        videoView.mCurrentState = n;
        return n;
    }

    public static /* synthetic */ MediaPlayer.OnPreparedListener access$300(VideoView videoView) {
        return videoView.mOnPreparedListener;
    }

    public static /* synthetic */ MediaPlayer access$400(VideoView videoView) {
        return videoView.mMediaPlayer;
    }

    public static /* synthetic */ VideoControlView access$500(VideoView videoView) {
        return videoView.mMediaController;
    }

    public static /* synthetic */ int access$600(VideoView videoView) {
        return videoView.mSeekWhenPrepared;
    }

    public static /* synthetic */ int access$700(VideoView videoView) {
        return videoView.mSurfaceWidth;
    }

    public static /* synthetic */ int access$702(VideoView videoView, int n) {
        videoView.mSurfaceWidth = n;
        return n;
    }

    public static /* synthetic */ int access$800(VideoView videoView) {
        return videoView.mSurfaceHeight;
    }

    public static /* synthetic */ int access$802(VideoView videoView, int n) {
        videoView.mSurfaceHeight = n;
        return n;
    }

    public static /* synthetic */ int access$900(VideoView videoView) {
        return videoView.mTargetState;
    }

    public static /* synthetic */ int access$902(VideoView videoView, int n) {
        videoView.mTargetState = n;
        return n;
    }

    private void attachMediaController() {
        VideoControlView videoControlView;
        if (this.mMediaPlayer != null && (videoControlView = this.mMediaController) != null) {
            videoControlView.setMediaPlayer(this);
            this.mMediaController.setEnabled(this.isInPlaybackState());
        }
    }

    private void initVideoView() {
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.getHolder().addCallback(this.mSHCallback);
        this.getHolder().setType(3);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setClickable(true);
        this.requestFocus();
        this.mCurrentState = 0;
        this.mTargetState = 0;
    }

    private boolean isInPlaybackState() {
        int n;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        boolean bl = true;
        if (mediaPlayer == null || (n = this.mCurrentState) == -1 || n == 0 || n == 1) {
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void openVideo() {
        if (this.mUri == null) return;
        if (this.mSurfaceHolder == null) {
            return;
        }
        this.release(false);
        try {
            MediaPlayer mediaPlayer;
            this.mMediaPlayer = mediaPlayer = new MediaPlayer();
            int n = this.mAudioSession;
            if (n != 0) {
                mediaPlayer.setAudioSessionId(n);
            } else {
                this.mAudioSession = mediaPlayer.getAudioSessionId();
            }
            this.mMediaPlayer.setOnPreparedListener(this.mPreparedListener);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
            this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
            this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
            this.mMediaPlayer.setOnInfoListener(this.mInfoListener);
            this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
            this.mCurrentBufferPercentage = 0;
            this.mMediaPlayer.setLooping(this.mLooping);
            this.mMediaPlayer.setDataSource(this.getContext(), this.mUri);
            this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            this.mMediaPlayer.prepareAsync();
            this.mCurrentState = 1;
            this.attachMediaController();
            return;
        }
        catch (Exception exception) {
            String string2 = this.TAG;
            StringBuilder stringBuilder = z2.t("Unable to open content: ");
            stringBuilder.append((Object)this.mUri);
            Log.w((String)string2, (String)stringBuilder.toString(), (Throwable)exception);
            this.mCurrentState = -1;
            this.mTargetState = -1;
            this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
        }
    }

    private void release(boolean bl) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            if (bl) {
                this.mTargetState = 0;
            }
        }
    }

    private void toggleMediaControlsVisiblity() {
        if (this.mMediaController.isShowing()) {
            this.mMediaController.hide();
        } else {
            this.mMediaController.show();
        }
    }

    @Override
    public int getBufferPercentage() {
        if (this.mMediaPlayer != null) {
            return this.mCurrentBufferPercentage;
        }
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        if (this.isInPlaybackState()) {
            return this.mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override
    public int getDuration() {
        if (this.isInPlaybackState()) {
            return this.mMediaPlayer.getDuration();
        }
        return -1;
    }

    @Override
    public boolean isPlaying() {
        boolean bl = this.isInPlaybackState() && this.mMediaPlayer.isPlaying();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        boolean bl = n != 4 && n != 24 && n != 25 && n != 82 && n != 5 && n != 6;
        if (!this.isInPlaybackState()) return super.onKeyDown(n, keyEvent);
        if (!bl) return super.onKeyDown(n, keyEvent);
        if (this.mMediaController == null) return super.onKeyDown(n, keyEvent);
        if (n != 79 && n != 85) {
            if (n == 126) {
                if (this.mMediaPlayer.isPlaying()) return true;
                this.start();
                this.mMediaController.hide();
                return true;
            }
            if (n != 86 && n != 127) {
                this.toggleMediaControlsVisiblity();
                return super.onKeyDown(n, keyEvent);
            }
            if (!this.mMediaPlayer.isPlaying()) return true;
            this.pause();
            this.mMediaController.show();
            return true;
        }
        if (this.mMediaPlayer.isPlaying()) {
            this.pause();
            this.mMediaController.show();
            return true;
        }
        this.start();
        this.mMediaController.hide();
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public void onMeasure(int var1_1, int var2_2) {
        block5: {
            block11: {
                block12: {
                    block8: {
                        block10: {
                            block9: {
                                block6: {
                                    block7: {
                                        var5_3 = View.getDefaultSize((int)this.mVideoWidth, (int)var1_1);
                                        var6_4 = View.getDefaultSize((int)this.mVideoHeight, (int)var2_2);
                                        var3_5 = var5_3;
                                        var4_6 = var6_4;
                                        if (this.mVideoWidth <= 0) break block5;
                                        var3_5 = var5_3;
                                        var4_6 = var6_4;
                                        if (this.mVideoHeight <= 0) break block5;
                                        var8_7 = View.MeasureSpec.getMode((int)var1_1);
                                        var5_3 = View.MeasureSpec.getSize((int)var1_1);
                                        var3_5 = View.MeasureSpec.getMode((int)var2_2);
                                        var2_2 = View.MeasureSpec.getSize((int)var2_2);
                                        if (var8_7 != 0x40000000 || var3_5 != 0x40000000) break block6;
                                        var3_5 = this.mVideoWidth;
                                        var1_1 = this.mVideoHeight;
                                        if (var3_5 * var2_2 >= var5_3 * var1_1) break block7;
                                        var1_1 = var3_5 * var2_2 / var1_1;
                                        ** GOTO lbl48
                                    }
                                    if (var3_5 * var2_2 <= var5_3 * var1_1) break block8;
                                    var1_1 = var1_1 * var5_3 / var3_5;
                                    break block9;
                                }
                                if (var8_7 != 0x40000000) break block10;
                                var1_1 = this.mVideoHeight * var5_3 / this.mVideoWidth;
                                if (var3_5 == -2147483648 && var1_1 > var2_2) break block8;
                            }
lbl28:
                            // 2 sources

                            while (true) {
                                var3_5 = var5_3;
                                var4_6 = var1_1;
                                break block5;
                                break;
                            }
                        }
                        if (var3_5 != 0x40000000) break block11;
                        var3_5 = var4_6 = this.mVideoWidth * var2_2 / this.mVideoHeight;
                        var1_1 = var2_2;
                        if (var8_7 != -2147483648) break block12;
                        var3_5 = var4_6;
                        var1_1 = var2_2;
                        if (var4_6 <= var5_3) break block12;
                    }
                    var1_1 = var5_3;
                    ** GOTO lbl48
                }
lbl45:
                // 3 sources

                while (true) {
                    var2_2 = var1_1;
                    var1_1 = var3_5;
lbl48:
                    // 3 sources

                    var3_5 = var1_1;
                    var4_6 = var2_2;
                    break block5;
                    break;
                }
            }
            var6_4 = this.mVideoWidth;
            var7_8 = this.mVideoHeight;
            if (var3_5 == -2147483648 && var7_8 > var2_2) {
                var4_6 = var2_2 * var6_4 / var7_8;
            } else {
                var4_6 = var6_4;
                var2_2 = var7_8;
            }
            var3_5 = var4_6;
            var1_1 = var2_2;
            if (var8_7 != -2147483648) ** GOTO lbl45
            var3_5 = var4_6;
            var1_1 = var2_2;
            if (var4_6 > var5_3) ** break;
            ** while (true)
            var1_1 = var7_8 * var5_3 / var6_4;
            ** while (true)
        }
        this.setMeasuredDimension(var3_5, var4_6);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl = this.gestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        return bl;
    }

    @Override
    public void pause() {
        if (this.isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            this.mCurrentState = 4;
        }
        this.mTargetState = 4;
    }

    @Override
    public void seekTo(int n) {
        if (this.isInPlaybackState()) {
            this.mMediaPlayer.seekTo(n);
            this.mSeekWhenPrepared = 0;
        } else {
            this.mSeekWhenPrepared = n;
        }
    }

    public void setMediaController(VideoControlView videoControlView) {
        VideoControlView videoControlView2 = this.mMediaController;
        if (videoControlView2 != null) {
            videoControlView2.hide();
        }
        this.mMediaController = videoControlView;
        this.attachMediaController();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setVideoURI(Uri uri, boolean bl) {
        this.mUri = uri;
        this.mLooping = bl;
        this.mSeekWhenPrepared = 0;
        this.openVideo();
        this.requestLayout();
        this.invalidate();
    }

    @Override
    public void start() {
        if (this.isInPlaybackState()) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
        }
        this.mTargetState = 3;
    }

    public void stopPlayback() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            this.mTargetState = 0;
        }
    }
}


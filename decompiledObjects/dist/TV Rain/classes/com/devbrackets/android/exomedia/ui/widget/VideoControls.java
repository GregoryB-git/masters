package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.R.color;
import com.devbrackets.android.exomedia.R.drawable;
import com.devbrackets.android.exomedia.R.id;
import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.listener.VideoControlsVisibilityListener;
import com.devbrackets.android.exomedia.util.Repeater;
import com.devbrackets.android.exomedia.util.Repeater.RepeatListener;
import com.devbrackets.android.exomedia.util.ResourceUtil;
import java.util.LinkedList;
import java.util.List;

public abstract class VideoControls
  extends RelativeLayout
  implements VideoControlsCore
{
  public static final long CONTROL_VISIBILITY_ANIMATION_LENGTH = 300L;
  public static final int DEFAULT_CONTROL_HIDE_DELAY = 2000;
  @Nullable
  public VideoControlsButtonListener buttonsListener;
  public boolean canViewHide = true;
  public ViewGroup controlsContainer;
  public TextView currentTimeTextView;
  public TextView descriptionTextView;
  @NonNull
  public SparseBooleanArray enabledViews = new SparseBooleanArray();
  public TextView endTimeTextView;
  public long hideDelay = 2000L;
  public boolean hideEmptyTextContainer = true;
  @NonNull
  public InternalListener internalListener = new InternalListener();
  public boolean isLoading = false;
  public boolean isVisible = true;
  public ProgressBar loadingProgressBar;
  public ImageButton nextButton;
  public Drawable pauseDrawable;
  public Drawable playDrawable;
  public ImageButton playPauseButton;
  public ImageButton previousButton;
  @NonNull
  public Repeater progressPollRepeater = new Repeater();
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
  
  public VideoControls(Context paramContext)
  {
    super(paramContext);
    setup(paramContext);
  }
  
  public VideoControls(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup(paramContext);
  }
  
  public VideoControls(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup(paramContext);
  }
  
  @TargetApi(21)
  public VideoControls(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setup(paramContext);
  }
  
  public void addExtraView(@NonNull View paramView) {}
  
  public abstract void animateVisibility(boolean paramBoolean);
  
  @NonNull
  public List<View> getExtraViews()
  {
    return new LinkedList();
  }
  
  @LayoutRes
  public abstract int getLayoutResource();
  
  public void hide()
  {
    if ((canViewHide) && (!isLoading))
    {
      visibilityHandler.removeCallbacksAndMessages(null);
      clearAnimation();
      animateVisibility(false);
    }
  }
  
  public void hide(boolean paramBoolean)
  {
    if (paramBoolean) {
      hideDelayed();
    } else {
      hide();
    }
  }
  
  public void hideDelayed()
  {
    hideDelayed(hideDelay);
  }
  
  public void hideDelayed(long paramLong)
  {
    hideDelay = paramLong;
    if ((paramLong >= 0L) && (canViewHide) && (!isLoading)) {
      visibilityHandler.postDelayed(new Runnable()
      {
        public void run()
        {
          hide();
        }
      }, paramLong);
    }
  }
  
  public boolean isTextContainerEmpty()
  {
    if ((titleTextView.getText() != null) && (titleTextView.getText().length() > 0)) {
      return false;
    }
    if ((subTitleTextView.getText() != null) && (subTitleTextView.getText().length() > 0)) {
      return false;
    }
    return (descriptionTextView.getText() == null) || (descriptionTextView.getText().length() <= 0);
  }
  
  public boolean isVisible()
  {
    return isVisible;
  }
  
  public void onAttachedToView(@NonNull VideoView paramVideoView)
  {
    paramVideoView.addView(this);
    setVideoView(paramVideoView);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    progressPollRepeater.setRepeatListener(new Repeater.RepeatListener()
    {
      public void onRepeat()
      {
        updateProgress();
      }
    });
    VideoView localVideoView = videoView;
    if ((localVideoView != null) && (localVideoView.isPlaying())) {
      updatePlaybackState(true);
    }
  }
  
  public void onDetachedFromView(@NonNull VideoView paramVideoView)
  {
    paramVideoView.removeView(this);
    setVideoView(null);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    progressPollRepeater.stop();
    progressPollRepeater.setRepeatListener(null);
  }
  
  public void onNextClick()
  {
    VideoControlsButtonListener localVideoControlsButtonListener = buttonsListener;
    if ((localVideoControlsButtonListener == null) || (!localVideoControlsButtonListener.onNextClicked())) {
      internalListener.onNextClicked();
    }
  }
  
  public void onPlayPauseClick()
  {
    VideoControlsButtonListener localVideoControlsButtonListener = buttonsListener;
    if ((localVideoControlsButtonListener == null) || (!localVideoControlsButtonListener.onPlayPauseClicked())) {
      internalListener.onPlayPauseClicked();
    }
  }
  
  public void onPreviousClick()
  {
    VideoControlsButtonListener localVideoControlsButtonListener = buttonsListener;
    if ((localVideoControlsButtonListener == null) || (!localVideoControlsButtonListener.onPreviousClicked())) {
      internalListener.onPreviousClicked();
    }
  }
  
  public void onVisibilityChanged()
  {
    VideoControlsVisibilityListener localVideoControlsVisibilityListener = visibilityListener;
    if (localVideoControlsVisibilityListener == null) {
      return;
    }
    if (isVisible) {
      localVideoControlsVisibilityListener.onControlsShown();
    } else {
      localVideoControlsVisibilityListener.onControlsHidden();
    }
  }
  
  public void registerListeners()
  {
    playPauseButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        onPlayPauseClick();
      }
    });
    previousButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        onPreviousClick();
      }
    });
    nextButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        onNextClick();
      }
    });
  }
  
  public void removeExtraView(@NonNull View paramView) {}
  
  public void retrieveViews()
  {
    currentTimeTextView = ((TextView)findViewById(R.id.exomedia_controls_current_time));
    endTimeTextView = ((TextView)findViewById(R.id.exomedia_controls_end_time));
    titleTextView = ((TextView)findViewById(R.id.exomedia_controls_title));
    subTitleTextView = ((TextView)findViewById(R.id.exomedia_controls_sub_title));
    descriptionTextView = ((TextView)findViewById(R.id.exomedia_controls_description));
    playPauseButton = ((ImageButton)findViewById(R.id.exomedia_controls_play_pause_btn));
    previousButton = ((ImageButton)findViewById(R.id.exomedia_controls_previous_btn));
    nextButton = ((ImageButton)findViewById(R.id.exomedia_controls_next_btn));
    loadingProgressBar = ((ProgressBar)findViewById(R.id.exomedia_controls_video_loading));
    controlsContainer = ((ViewGroup)findViewById(R.id.exomedia_controls_interactive_container));
    textContainer = ((ViewGroup)findViewById(R.id.exomedia_controls_text_container));
  }
  
  public void setButtonListener(@Nullable VideoControlsButtonListener paramVideoControlsButtonListener)
  {
    buttonsListener = paramVideoControlsButtonListener;
  }
  
  public void setCanHide(boolean paramBoolean)
  {
    canViewHide = paramBoolean;
  }
  
  public void setDescription(@Nullable CharSequence paramCharSequence)
  {
    descriptionTextView.setText(paramCharSequence);
    updateTextContainerVisibility();
  }
  
  public void setFastForwardButtonEnabled(boolean paramBoolean) {}
  
  public void setFastForwardButtonRemoved(boolean paramBoolean) {}
  
  public void setFastForwardDrawable(Drawable paramDrawable) {}
  
  public void setHideDelay(long paramLong)
  {
    hideDelay = paramLong;
  }
  
  public void setHideEmptyTextContainer(boolean paramBoolean)
  {
    hideEmptyTextContainer = paramBoolean;
    updateTextContainerVisibility();
  }
  
  public void setNextButtonEnabled(boolean paramBoolean)
  {
    nextButton.setEnabled(paramBoolean);
    enabledViews.put(R.id.exomedia_controls_next_btn, paramBoolean);
  }
  
  public void setNextButtonRemoved(boolean paramBoolean)
  {
    ImageButton localImageButton = nextButton;
    int i;
    if (paramBoolean) {
      i = 8;
    } else {
      i = 0;
    }
    localImageButton.setVisibility(i);
  }
  
  public void setNextDrawable(Drawable paramDrawable)
  {
    nextButton.setImageDrawable(paramDrawable);
  }
  
  public void setPlayPauseDrawables(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    playDrawable = paramDrawable1;
    pauseDrawable = paramDrawable2;
    paramDrawable1 = videoView;
    boolean bool;
    if ((paramDrawable1 != null) && (paramDrawable1.isPlaying())) {
      bool = true;
    } else {
      bool = false;
    }
    updatePlayPauseImage(bool);
  }
  
  public abstract void setPosition(@IntRange(from=0L) long paramLong);
  
  public void setPreviousButtonEnabled(boolean paramBoolean)
  {
    previousButton.setEnabled(paramBoolean);
    enabledViews.put(R.id.exomedia_controls_previous_btn, paramBoolean);
  }
  
  public void setPreviousButtonRemoved(boolean paramBoolean)
  {
    ImageButton localImageButton = previousButton;
    int i;
    if (paramBoolean) {
      i = 8;
    } else {
      i = 0;
    }
    localImageButton.setVisibility(i);
  }
  
  public void setPreviousDrawable(Drawable paramDrawable)
  {
    previousButton.setImageDrawable(paramDrawable);
  }
  
  public void setRewindButtonEnabled(boolean paramBoolean) {}
  
  public void setRewindButtonRemoved(boolean paramBoolean) {}
  
  public void setRewindDrawable(Drawable paramDrawable) {}
  
  public void setSeekListener(@Nullable VideoControlsSeekListener paramVideoControlsSeekListener)
  {
    seekListener = paramVideoControlsSeekListener;
  }
  
  public void setSubTitle(@Nullable CharSequence paramCharSequence)
  {
    subTitleTextView.setText(paramCharSequence);
    updateTextContainerVisibility();
  }
  
  public void setTitle(@Nullable CharSequence paramCharSequence)
  {
    titleTextView.setText(paramCharSequence);
    updateTextContainerVisibility();
  }
  
  @Deprecated
  public void setVideoView(@Nullable VideoView paramVideoView)
  {
    videoView = paramVideoView;
  }
  
  public void setVisibilityListener(@Nullable VideoControlsVisibilityListener paramVideoControlsVisibilityListener)
  {
    visibilityListener = paramVideoControlsVisibilityListener;
  }
  
  public void setup(Context paramContext)
  {
    View.inflate(paramContext, getLayoutResource(), this);
    retrieveViews();
    registerListeners();
    updateButtonDrawables();
  }
  
  public void show()
  {
    visibilityHandler.removeCallbacksAndMessages(null);
    clearAnimation();
    animateVisibility(true);
  }
  
  public void updateButtonDrawables()
  {
    updateButtonDrawables(R.color.exomedia_default_controls_button_selector);
  }
  
  public void updateButtonDrawables(@ColorRes int paramInt)
  {
    playDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_play_arrow_white, paramInt);
    pauseDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_pause_white, paramInt);
    playPauseButton.setImageDrawable(playDrawable);
    Drawable localDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_skip_previous_white, paramInt);
    previousButton.setImageDrawable(localDrawable);
    localDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_skip_next_white, paramInt);
    nextButton.setImageDrawable(localDrawable);
  }
  
  public void updatePlayPauseImage(boolean paramBoolean)
  {
    ImageButton localImageButton = playPauseButton;
    Drawable localDrawable;
    if (paramBoolean) {
      localDrawable = pauseDrawable;
    } else {
      localDrawable = playDrawable;
    }
    localImageButton.setImageDrawable(localDrawable);
  }
  
  public void updatePlaybackState(boolean paramBoolean)
  {
    updatePlayPauseImage(paramBoolean);
    progressPollRepeater.start();
    if (paramBoolean) {
      hideDelayed();
    } else {
      show();
    }
  }
  
  public void updateProgress()
  {
    VideoView localVideoView = videoView;
    if (localVideoView != null) {
      updateProgress(localVideoView.getCurrentPosition(), videoView.getDuration(), videoView.getBufferPercentage());
    }
  }
  
  public abstract void updateProgress(@IntRange(from=0L) long paramLong1, @IntRange(from=0L) long paramLong2, @IntRange(from=0L, to=100L) int paramInt);
  
  public abstract void updateTextContainerVisibility();
  
  public class InternalListener
    implements VideoControlsSeekListener, VideoControlsButtonListener
  {
    public boolean pausedForSeek = false;
    
    public InternalListener() {}
    
    public boolean onFastForwardClicked()
    {
      return false;
    }
    
    public boolean onNextClicked()
    {
      return false;
    }
    
    public boolean onPlayPauseClicked()
    {
      VideoView localVideoView = videoView;
      if (localVideoView == null) {
        return false;
      }
      if (localVideoView.isPlaying()) {
        videoView.pause();
      } else {
        videoView.start();
      }
      return true;
    }
    
    public boolean onPreviousClicked()
    {
      return false;
    }
    
    public boolean onRewindClicked()
    {
      return false;
    }
    
    public boolean onSeekEnded(long paramLong)
    {
      VideoView localVideoView = videoView;
      if (localVideoView == null) {
        return false;
      }
      localVideoView.seekTo(paramLong);
      if (pausedForSeek)
      {
        pausedForSeek = false;
        videoView.start();
        hideDelayed();
      }
      return true;
    }
    
    public boolean onSeekStarted()
    {
      VideoView localVideoView = videoView;
      if (localVideoView == null) {
        return false;
      }
      if (localVideoView.isPlaying())
      {
        pausedForSeek = true;
        videoView.pause(true);
      }
      show();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControls
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
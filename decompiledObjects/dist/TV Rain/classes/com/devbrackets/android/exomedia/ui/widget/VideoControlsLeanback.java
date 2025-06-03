package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.IntRange;
import com.devbrackets.android.exomedia.R.color;
import com.devbrackets.android.exomedia.R.drawable;
import com.devbrackets.android.exomedia.R.id;
import com.devbrackets.android.exomedia.R.layout;
import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation;
import com.devbrackets.android.exomedia.util.ResourceUtil;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;

@TargetApi(21)
public class VideoControlsLeanback
  extends VideoControls
{
  public static final int FAST_FORWARD_REWIND_AMOUNT = 10000;
  public ButtonFocusChangeListener buttonFocusChangeListener = new ButtonFocusChangeListener();
  public ViewGroup controlsParent;
  public View currentFocus;
  public ImageButton fastForwardButton;
  public ProgressBar progressBar;
  public ImageButton rewindButton;
  public ImageView rippleIndicator;
  
  public VideoControlsLeanback(Context paramContext)
  {
    super(paramContext);
  }
  
  public VideoControlsLeanback(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VideoControlsLeanback(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public VideoControlsLeanback(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void animateVisibility(boolean paramBoolean)
  {
    if (isVisible == paramBoolean) {
      return;
    }
    if (!isLoading) {
      controlsParent.startAnimation(new BottomViewHideShowAnimation(controlsParent, paramBoolean, 300L));
    }
    isVisible = paramBoolean;
    onVisibilityChanged();
  }
  
  public void finishLoading()
  {
    if (!isLoading) {
      return;
    }
    boolean bool1 = false;
    isLoading = false;
    controlsContainer.setVisibility(0);
    rippleIndicator.setVisibility(0);
    loadingProgressBar.setVisibility(8);
    VideoView localVideoView = videoView;
    boolean bool2 = bool1;
    if (localVideoView != null)
    {
      bool2 = bool1;
      if (localVideoView.isPlaying()) {
        bool2 = true;
      }
    }
    updatePlaybackState(bool2);
  }
  
  public void focusNext(View paramView)
  {
    int i = paramView.getNextFocusRightId();
    if (i == -1) {
      return;
    }
    paramView = findViewById(i);
    if (paramView.getVisibility() != 0)
    {
      focusNext(paramView);
      return;
    }
    paramView.requestFocus();
    currentFocus = paramView;
    buttonFocusChangeListener.onFocusChange(paramView, true);
  }
  
  public void focusPrevious(View paramView)
  {
    int i = paramView.getNextFocusLeftId();
    if (i == -1) {
      return;
    }
    paramView = findViewById(i);
    if (paramView.getVisibility() != 0)
    {
      focusPrevious(paramView);
      return;
    }
    paramView.requestFocus();
    currentFocus = paramView;
    buttonFocusChangeListener.onFocusChange(paramView, true);
  }
  
  public int getLayoutResource()
  {
    return R.layout.exomedia_default_controls_leanback;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    playPauseButton.requestFocus();
    currentFocus = playPauseButton;
  }
  
  public void onFastForwardClick()
  {
    VideoControlsButtonListener localVideoControlsButtonListener = buttonsListener;
    if ((localVideoControlsButtonListener == null) || (!localVideoControlsButtonListener.onFastForwardClicked())) {
      internalListener.onFastForwardClicked();
    }
  }
  
  public void onRewindClick()
  {
    VideoControlsButtonListener localVideoControlsButtonListener = buttonsListener;
    if ((localVideoControlsButtonListener == null) || (!localVideoControlsButtonListener.onRewindClicked())) {
      internalListener.onRewindClicked();
    }
  }
  
  public void performSeek(long paramLong)
  {
    VideoControlsSeekListener localVideoControlsSeekListener = seekListener;
    if ((localVideoControlsSeekListener == null) || (!localVideoControlsSeekListener.onSeekEnded(paramLong)))
    {
      show();
      internalListener.onSeekEnded(paramLong);
    }
  }
  
  public void registerForInput()
  {
    RemoteKeyListener localRemoteKeyListener = new RemoteKeyListener();
    setOnKeyListener(localRemoteKeyListener);
    playPauseButton.setOnKeyListener(localRemoteKeyListener);
    previousButton.setOnKeyListener(localRemoteKeyListener);
    nextButton.setOnKeyListener(localRemoteKeyListener);
    rewindButton.setOnKeyListener(localRemoteKeyListener);
    fastForwardButton.setOnKeyListener(localRemoteKeyListener);
  }
  
  public void registerListeners()
  {
    super.registerListeners();
    rewindButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        onRewindClick();
      }
    });
    fastForwardButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        onFastForwardClick();
      }
    });
    previousButton.setOnFocusChangeListener(buttonFocusChangeListener);
    rewindButton.setOnFocusChangeListener(buttonFocusChangeListener);
    playPauseButton.setOnFocusChangeListener(buttonFocusChangeListener);
    fastForwardButton.setOnFocusChangeListener(buttonFocusChangeListener);
    nextButton.setOnFocusChangeListener(buttonFocusChangeListener);
  }
  
  public void retrieveViews()
  {
    super.retrieveViews();
    progressBar = ((ProgressBar)findViewById(R.id.exomedia_controls_video_progress));
    rewindButton = ((ImageButton)findViewById(R.id.exomedia_controls_rewind_btn));
    fastForwardButton = ((ImageButton)findViewById(R.id.exomedia_controls_fast_forward_btn));
    rippleIndicator = ((ImageView)findViewById(R.id.exomedia_controls_leanback_ripple));
    controlsParent = ((ViewGroup)findViewById(R.id.exomedia_controls_parent));
  }
  
  public void setDuration(long paramLong)
  {
    if (paramLong != progressBar.getMax())
    {
      endTimeTextView.setText(TimeFormatUtil.formatMs(paramLong));
      progressBar.setMax((int)paramLong);
    }
  }
  
  public void setFastForwardButtonEnabled(boolean paramBoolean)
  {
    ImageButton localImageButton = fastForwardButton;
    if (localImageButton != null)
    {
      localImageButton.setEnabled(paramBoolean);
      enabledViews.put(R.id.exomedia_controls_fast_forward_btn, paramBoolean);
    }
  }
  
  public void setFastForwardButtonRemoved(boolean paramBoolean)
  {
    ImageButton localImageButton = fastForwardButton;
    if (localImageButton != null)
    {
      int i;
      if (paramBoolean) {
        i = 8;
      } else {
        i = 0;
      }
      localImageButton.setVisibility(i);
    }
  }
  
  public void setFastForwardDrawable(Drawable paramDrawable)
  {
    ImageButton localImageButton = fastForwardButton;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setPosition(long paramLong)
  {
    currentTimeTextView.setText(TimeFormatUtil.formatMs(paramLong));
    progressBar.setProgress((int)paramLong);
  }
  
  public void setRewindButtonEnabled(boolean paramBoolean)
  {
    ImageButton localImageButton = rewindButton;
    if (localImageButton != null)
    {
      localImageButton.setEnabled(paramBoolean);
      enabledViews.put(R.id.exomedia_controls_rewind_btn, paramBoolean);
    }
  }
  
  public void setRewindButtonRemoved(boolean paramBoolean)
  {
    ImageButton localImageButton = rewindButton;
    if (localImageButton != null)
    {
      int i;
      if (paramBoolean) {
        i = 8;
      } else {
        i = 0;
      }
      localImageButton.setVisibility(i);
    }
  }
  
  public void setRewindDrawable(Drawable paramDrawable)
  {
    ImageButton localImageButton = rewindButton;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setup(Context paramContext)
  {
    super.setup(paramContext);
    internalListener = new LeanbackInternalListener();
    registerForInput();
    setFocusable(true);
  }
  
  public void showLoading(boolean paramBoolean)
  {
    if (isLoading) {
      return;
    }
    isLoading = true;
    controlsContainer.setVisibility(8);
    rippleIndicator.setVisibility(8);
    loadingProgressBar.setVisibility(0);
    show();
  }
  
  public void showTemporary()
  {
    show();
    VideoView localVideoView = videoView;
    if ((localVideoView != null) && (localVideoView.isPlaying())) {
      hideDelayed();
    }
  }
  
  public void updateButtonDrawables()
  {
    updateButtonDrawables(R.color.exomedia_default_controls_leanback_button_selector);
  }
  
  public void updateButtonDrawables(int paramInt)
  {
    super.updateButtonDrawables(paramInt);
    Drawable localDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_rewind_white, paramInt);
    rewindButton.setImageDrawable(localDrawable);
    localDrawable = ResourceUtil.tintList(getContext(), R.drawable.exomedia_ic_fast_forward_white, paramInt);
    fastForwardButton.setImageDrawable(localDrawable);
  }
  
  public void updateProgress(@IntRange(from=0L) long paramLong1, @IntRange(from=0L) long paramLong2, @IntRange(from=0L, to=100L) int paramInt)
  {
    ProgressBar localProgressBar = progressBar;
    float f = localProgressBar.getMax();
    localProgressBar.setSecondaryProgress((int)(paramInt / 100.0F * f));
    progressBar.setProgress((int)paramLong1);
    currentTimeTextView.setText(TimeFormatUtil.formatMs(paramLong1));
  }
  
  public void updateTextContainerVisibility()
  {
    if (!isVisible) {
      return;
    }
    boolean bool = isTextContainerEmpty();
    if ((hideEmptyTextContainer) && (bool) && (textContainer.getVisibility() == 0))
    {
      textContainer.clearAnimation();
      textContainer.startAnimation(new BottomViewHideShowAnimation(textContainer, false, 300L));
    }
    else if (((!hideEmptyTextContainer) || (!bool)) && (textContainer.getVisibility() != 0))
    {
      textContainer.clearAnimation();
      textContainer.startAnimation(new BottomViewHideShowAnimation(textContainer, true, 300L));
    }
  }
  
  public class ButtonFocusChangeListener
    implements View.OnFocusChangeListener
  {
    public ButtonFocusChangeListener() {}
    
    public int getHorizontalDelta(View paramView)
    {
      int[] arrayOfInt = new int[2];
      paramView.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[0];
      rippleIndicator.getLocationOnScreen(arrayOfInt);
      return i - (rippleIndicator.getWidth() - paramView.getWidth()) / 2 - arrayOfInt[0];
    }
    
    public void onFocusChange(View paramView, boolean paramBoolean)
    {
      if (!paramBoolean) {
        return;
      }
      int i = getHorizontalDelta(paramView);
      rippleIndicator.startAnimation(new VideoControlsLeanback.RippleTranslateAnimation(VideoControlsLeanback.this, i));
    }
  }
  
  public class LeanbackInternalListener
    extends VideoControls.InternalListener
  {
    public LeanbackInternalListener()
    {
      super();
    }
    
    public boolean onFastForwardClicked()
    {
      VideoView localVideoView = videoView;
      if (localVideoView == null) {
        return false;
      }
      long l1 = localVideoView.getCurrentPosition() + 10000L;
      long l2 = l1;
      if (l1 > progressBar.getMax()) {
        l2 = progressBar.getMax();
      }
      performSeek(l2);
      return true;
    }
    
    public boolean onRewindClicked()
    {
      VideoView localVideoView = videoView;
      if (localVideoView == null) {
        return false;
      }
      long l1 = localVideoView.getCurrentPosition() - 10000L;
      long l2 = l1;
      if (l1 < 0L) {
        l2 = 0L;
      }
      performSeek(l2);
      return true;
    }
  }
  
  public class RemoteKeyListener
    implements View.OnKeyListener
  {
    public RemoteKeyListener() {}
    
    public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramKeyEvent.getAction() != 0) {
        return false;
      }
      if (paramInt != 4)
      {
        if (paramInt != 85)
        {
          if (paramInt != 126)
          {
            if (paramInt != 127)
            {
              switch (paramInt)
              {
              default: 
                switch (paramInt)
                {
                default: 
                  break;
                case 90: 
                  onFastForwardClick();
                  return true;
                case 89: 
                  onRewindClick();
                  return true;
                case 88: 
                  onPreviousClick();
                  return true;
                case 87: 
                  onNextClick();
                  return true;
                }
                break;
              case 23: 
                showTemporary();
                currentFocus.callOnClick();
                return true;
              case 22: 
                showTemporary();
                paramView = VideoControlsLeanback.this;
                paramView.focusNext(currentFocus);
                return true;
              case 21: 
                showTemporary();
                paramView = VideoControlsLeanback.this;
                paramView.focusPrevious(currentFocus);
                return true;
              case 20: 
                hide();
                return true;
              case 19: 
                showTemporary();
                return true;
              }
            }
            else
            {
              paramView = videoView;
              if ((paramView != null) && (paramView.isPlaying()))
              {
                videoView.pause();
                return true;
              }
            }
          }
          else
          {
            paramView = videoView;
            if ((paramView != null) && (!paramView.isPlaying()))
            {
              videoView.start();
              return true;
            }
          }
        }
        else
        {
          onPlayPauseClick();
          return true;
        }
      }
      else
      {
        paramView = VideoControlsLeanback.this;
        if ((isVisible) && (canViewHide) && (!isLoading))
        {
          paramView.hide();
          return true;
        }
        if (controlsParent.getAnimation() != null) {
          return true;
        }
      }
      return false;
    }
  }
  
  public class RippleTranslateAnimation
    extends TranslateAnimation
    implements Animation.AnimationListener
  {
    public static final long DURATION = 250L;
    public int xDelta;
    
    public RippleTranslateAnimation(int paramInt)
    {
      super(paramInt, 0.0F, 0.0F);
      xDelta = paramInt;
      setDuration(250L);
      setAnimationListener(this);
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      paramAnimation = rippleIndicator;
      paramAnimation.setX(paramAnimation.getX() + xDelta);
      rippleIndicator.clearAnimation();
    }
    
    public void onAnimationRepeat(Animation paramAnimation) {}
    
    public void onAnimationStart(Animation paramAnimation) {}
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.devbrackets.android.exomedia.R.id;
import com.devbrackets.android.exomedia.R.layout;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation;
import com.devbrackets.android.exomedia.ui.animation.TopViewHideShowAnimation;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;
import java.util.LinkedList;
import java.util.List;

public class VideoControlsMobile
  extends VideoControls
{
  public LinearLayout extraViewsContainer;
  public SeekBar seekBar;
  public boolean userInteracting = false;
  
  public VideoControlsMobile(Context paramContext)
  {
    super(paramContext);
  }
  
  public VideoControlsMobile(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VideoControlsMobile(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public VideoControlsMobile(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void addExtraView(@NonNull View paramView)
  {
    extraViewsContainer.addView(paramView);
  }
  
  public void animateVisibility(boolean paramBoolean)
  {
    if (isVisible == paramBoolean) {
      return;
    }
    if ((!hideEmptyTextContainer) || (!isTextContainerEmpty())) {
      textContainer.startAnimation(new TopViewHideShowAnimation(textContainer, paramBoolean, 300L));
    }
    if (!isLoading) {
      controlsContainer.startAnimation(new BottomViewHideShowAnimation(controlsContainer, paramBoolean, 300L));
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
    loadingProgressBar.setVisibility(8);
    controlsContainer.setVisibility(0);
    playPauseButton.setEnabled(true);
    previousButton.setEnabled(enabledViews.get(R.id.exomedia_controls_previous_btn, true));
    nextButton.setEnabled(enabledViews.get(R.id.exomedia_controls_next_btn, true));
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
  
  @NonNull
  public List<View> getExtraViews()
  {
    int i = extraViewsContainer.getChildCount();
    if (i <= 0) {
      return super.getExtraViews();
    }
    LinkedList localLinkedList = new LinkedList();
    for (int j = 0; j < i; j++) {
      localLinkedList.add(extraViewsContainer.getChildAt(j));
    }
    return localLinkedList;
  }
  
  public int getLayoutResource()
  {
    return R.layout.exomedia_default_controls_mobile;
  }
  
  public void hideDelayed(long paramLong)
  {
    hideDelay = paramLong;
    if ((paramLong >= 0L) && (canViewHide) && (!isLoading) && (!userInteracting)) {
      visibilityHandler.postDelayed(new Runnable()
      {
        public void run()
        {
          animateVisibility(false);
        }
      }, paramLong);
    }
  }
  
  public void registerListeners()
  {
    super.registerListeners();
    seekBar.setOnSeekBarChangeListener(new SeekBarChanged());
  }
  
  public void removeExtraView(@NonNull View paramView)
  {
    extraViewsContainer.removeView(paramView);
  }
  
  public void retrieveViews()
  {
    super.retrieveViews();
    seekBar = ((SeekBar)findViewById(R.id.exomedia_controls_video_seek));
    extraViewsContainer = ((LinearLayout)findViewById(R.id.exomedia_controls_extra_container));
  }
  
  public void setDuration(@IntRange(from=0L) long paramLong)
  {
    if (paramLong != seekBar.getMax())
    {
      endTimeTextView.setText(TimeFormatUtil.formatMs(paramLong));
      seekBar.setMax((int)paramLong);
    }
  }
  
  public void setPosition(@IntRange(from=0L) long paramLong)
  {
    currentTimeTextView.setText(TimeFormatUtil.formatMs(paramLong));
    seekBar.setProgress((int)paramLong);
  }
  
  public void showLoading(boolean paramBoolean)
  {
    if (isLoading) {
      return;
    }
    isLoading = true;
    loadingProgressBar.setVisibility(0);
    if (paramBoolean)
    {
      controlsContainer.setVisibility(8);
    }
    else
    {
      playPauseButton.setEnabled(false);
      previousButton.setEnabled(false);
      nextButton.setEnabled(false);
    }
    show();
  }
  
  public void updateProgress(@IntRange(from=0L) long paramLong1, @IntRange(from=0L) long paramLong2, @IntRange(from=0L, to=100L) int paramInt)
  {
    if (!userInteracting)
    {
      SeekBar localSeekBar = seekBar;
      float f = localSeekBar.getMax();
      localSeekBar.setSecondaryProgress((int)(paramInt / 100.0F * f));
      seekBar.setProgress((int)paramLong1);
      currentTimeTextView.setText(TimeFormatUtil.formatMs(paramLong1));
    }
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
      textContainer.startAnimation(new TopViewHideShowAnimation(textContainer, false, 300L));
    }
    else if (((!hideEmptyTextContainer) || (!bool)) && (textContainer.getVisibility() != 0))
    {
      textContainer.clearAnimation();
      textContainer.startAnimation(new TopViewHideShowAnimation(textContainer, true, 300L));
    }
  }
  
  public class SeekBarChanged
    implements SeekBar.OnSeekBarChangeListener
  {
    private long seekToTime;
    
    public SeekBarChanged() {}
    
    public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
    {
      if (!paramBoolean) {
        return;
      }
      long l = paramInt;
      seekToTime = l;
      paramSeekBar = currentTimeTextView;
      if (paramSeekBar != null) {
        paramSeekBar.setText(TimeFormatUtil.formatMs(l));
      }
    }
    
    public void onStartTrackingTouch(SeekBar paramSeekBar)
    {
      paramSeekBar = VideoControlsMobile.this;
      userInteracting = true;
      paramSeekBar = seekListener;
      if ((paramSeekBar == null) || (!paramSeekBar.onSeekStarted())) {
        internalListener.onSeekStarted();
      }
    }
    
    public void onStopTrackingTouch(SeekBar paramSeekBar)
    {
      paramSeekBar = VideoControlsMobile.this;
      userInteracting = false;
      paramSeekBar = seekListener;
      if ((paramSeekBar == null) || (!paramSeekBar.onSeekEnded(seekToTime))) {
        internalListener.onSeekEnded(seekToTime);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsMobile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.devbrackets.android.exomedia.ui.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public abstract interface VideoControlsCore
{
  public abstract void finishLoading();
  
  public abstract void hide(boolean paramBoolean);
  
  public abstract boolean isVisible();
  
  public abstract void onAttachedToView(@NonNull VideoView paramVideoView);
  
  public abstract void onDetachedFromView(@NonNull VideoView paramVideoView);
  
  public abstract void setDuration(@IntRange(from=0L) long paramLong);
  
  public abstract void show();
  
  public abstract void showLoading(boolean paramBoolean);
  
  public abstract void updatePlaybackState(boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsCore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
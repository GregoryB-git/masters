package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;

@TargetApi(17)
final class VideoFrameReleaseTimeHelper$DefaultDisplayListener
  implements DisplayManager.DisplayListener
{
  private final DisplayManager displayManager;
  
  public VideoFrameReleaseTimeHelper$DefaultDisplayListener(VideoFrameReleaseTimeHelper paramVideoFrameReleaseTimeHelper, DisplayManager paramDisplayManager)
  {
    displayManager = paramDisplayManager;
  }
  
  public void onDisplayAdded(int paramInt) {}
  
  public void onDisplayChanged(int paramInt)
  {
    if (paramInt == 0) {
      VideoFrameReleaseTimeHelper.access$000(this$0);
    }
  }
  
  public void onDisplayRemoved(int paramInt) {}
  
  public void register()
  {
    displayManager.registerDisplayListener(this, null);
  }
  
  public void unregister()
  {
    displayManager.unregisterDisplayListener(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper.DefaultDisplayListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
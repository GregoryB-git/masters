package com.devbrackets.android.exomedia.ui.widget;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

public class VideoView$AudioFocusHelper
  implements AudioManager.OnAudioFocusChangeListener
{
  public int currentFocus = 0;
  public boolean pausedForLoss = false;
  public boolean startRequested = false;
  
  public VideoView$AudioFocusHelper(VideoView paramVideoView) {}
  
  public boolean abandonFocus()
  {
    Object localObject = this$0;
    boolean bool1 = handleAudioFocus;
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    localObject = audioManager;
    if (localObject == null) {
      return false;
    }
    startRequested = false;
    if (1 != ((AudioManager)localObject).abandonAudioFocus(this)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    VideoView localVideoView = this$0;
    if ((handleAudioFocus) && (currentFocus != paramInt))
    {
      currentFocus = paramInt;
      if ((paramInt != -3) && (paramInt != -2))
      {
        if (paramInt != -1)
        {
          if (((paramInt == 1) || (paramInt == 2)) && ((startRequested) || (pausedForLoss)))
          {
            localVideoView.start();
            startRequested = false;
            pausedForLoss = false;
          }
        }
        else if (localVideoView.isPlaying())
        {
          pausedForLoss = true;
          this$0.pause();
        }
      }
      else if (localVideoView.isPlaying())
      {
        pausedForLoss = true;
        this$0.pause(true);
      }
    }
  }
  
  public boolean requestFocus()
  {
    Object localObject = this$0;
    if ((handleAudioFocus) && (currentFocus != 1))
    {
      localObject = audioManager;
      if (localObject == null) {
        return false;
      }
      if (1 == ((AudioManager)localObject).requestAudioFocus(this, 3, 1))
      {
        currentFocus = 1;
        return true;
      }
      startRequested = true;
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoView.AudioFocusHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

public class VideoControlsLeanback$RemoteKeyListener
  implements View.OnKeyListener
{
  public VideoControlsLeanback$RemoteKeyListener(VideoControlsLeanback paramVideoControlsLeanback) {}
  
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
                this$0.onFastForwardClick();
                return true;
              case 89: 
                this$0.onRewindClick();
                return true;
              case 88: 
                this$0.onPreviousClick();
                return true;
              case 87: 
                this$0.onNextClick();
                return true;
              }
              break;
            case 23: 
              this$0.showTemporary();
              this$0.currentFocus.callOnClick();
              return true;
            case 22: 
              this$0.showTemporary();
              paramView = this$0;
              paramView.focusNext(currentFocus);
              return true;
            case 21: 
              this$0.showTemporary();
              paramView = this$0;
              paramView.focusPrevious(currentFocus);
              return true;
            case 20: 
              this$0.hide();
              return true;
            case 19: 
              this$0.showTemporary();
              return true;
            }
          }
          else
          {
            paramView = this$0.videoView;
            if ((paramView != null) && (paramView.isPlaying()))
            {
              this$0.videoView.pause();
              return true;
            }
          }
        }
        else
        {
          paramView = this$0.videoView;
          if ((paramView != null) && (!paramView.isPlaying()))
          {
            this$0.videoView.start();
            return true;
          }
        }
      }
      else
      {
        this$0.onPlayPauseClick();
        return true;
      }
    }
    else
    {
      paramView = this$0;
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

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback.RemoteKeyListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
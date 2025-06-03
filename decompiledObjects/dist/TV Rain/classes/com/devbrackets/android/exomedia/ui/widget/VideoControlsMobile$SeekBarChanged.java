package com.devbrackets.android.exomedia.ui.widget;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;

public class VideoControlsMobile$SeekBarChanged
  implements SeekBar.OnSeekBarChangeListener
{
  private long seekToTime;
  
  public VideoControlsMobile$SeekBarChanged(VideoControlsMobile paramVideoControlsMobile) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    long l = paramInt;
    seekToTime = l;
    paramSeekBar = this$0.currentTimeTextView;
    if (paramSeekBar != null) {
      paramSeekBar.setText(TimeFormatUtil.formatMs(l));
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    paramSeekBar = this$0;
    userInteracting = true;
    paramSeekBar = seekListener;
    if ((paramSeekBar == null) || (!paramSeekBar.onSeekStarted())) {
      this$0.internalListener.onSeekStarted();
    }
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    paramSeekBar = this$0;
    userInteracting = false;
    paramSeekBar = seekListener;
    if ((paramSeekBar == null) || (!paramSeekBar.onSeekEnded(seekToTime))) {
      this$0.internalListener.onSeekEnded(seekToTime);
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsMobile.SeekBarChanged
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
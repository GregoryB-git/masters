package com.google.android.exoplayer2.audio;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.exoplayer2.util.Log;
import z2;

class AudioFocusManager$AudioFocusListener
  implements AudioManager.OnAudioFocusChangeListener
{
  private AudioFocusManager$AudioFocusListener(AudioFocusManager paramAudioFocusManager) {}
  
  public void onAudioFocusChange(int paramInt)
  {
    StringBuilder localStringBuilder;
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt != -1)
        {
          if (paramInt != 1)
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unknown focus change type: ");
            localStringBuilder.append(paramInt);
            Log.w("AudioFocusManager", localStringBuilder.toString());
            return;
          }
          AudioFocusManager.access$102(this$0, 1);
        }
        else
        {
          AudioFocusManager.access$102(this$0, -1);
        }
      }
      else {
        AudioFocusManager.access$102(this$0, 2);
      }
    }
    else if (AudioFocusManager.access$200(this$0)) {
      AudioFocusManager.access$102(this$0, 2);
    } else {
      AudioFocusManager.access$102(this$0, 3);
    }
    paramInt = AudioFocusManager.access$100(this$0);
    if (paramInt != -1)
    {
      if (paramInt != 0) {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              localStringBuilder = z2.t("Unknown audio focus state: ");
              localStringBuilder.append(AudioFocusManager.access$100(this$0));
              throw new IllegalStateException(localStringBuilder.toString());
            }
          }
          else {
            AudioFocusManager.access$300(this$0).executePlayerCommand(0);
          }
        }
        else {
          AudioFocusManager.access$300(this$0).executePlayerCommand(1);
        }
      }
    }
    else
    {
      AudioFocusManager.access$300(this$0).executePlayerCommand(-1);
      AudioFocusManager.access$400(this$0, true);
    }
    float f;
    if (AudioFocusManager.access$100(this$0) == 3) {
      f = 0.2F;
    } else {
      f = 1.0F;
    }
    if (AudioFocusManager.access$500(this$0) != f)
    {
      AudioFocusManager.access$502(this$0, f);
      AudioFocusManager.access$300(this$0).setVolumeMultiplier(f);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioFocusManager.AudioFocusListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
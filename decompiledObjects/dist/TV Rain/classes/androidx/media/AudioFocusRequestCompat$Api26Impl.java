package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class AudioFocusRequestCompat$Api26Impl
{
  @DoNotInline
  public static AudioFocusRequest createInstance(int paramInt, AudioAttributes paramAudioAttributes, boolean paramBoolean, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
  {
    return new AudioFocusRequest.Builder(paramInt).setAudioAttributes(paramAudioAttributes).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, paramHandler).build();
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioFocusRequestCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
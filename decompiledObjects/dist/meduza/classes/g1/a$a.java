package g1;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

public final class a$a
{
  public static AudioFocusRequest a(int paramInt, AudioAttributes paramAudioAttributes, boolean paramBoolean, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
  {
    return new AudioFocusRequest.Builder(paramInt).setAudioAttributes(paramAudioAttributes).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, paramHandler).build();
  }
}

/* Location:
 * Qualified Name:     g1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
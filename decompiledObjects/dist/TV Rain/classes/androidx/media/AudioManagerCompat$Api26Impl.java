package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b;

@RequiresApi(26)
class AudioManagerCompat$Api26Impl
{
  @DoNotInline
  public static int abandonAudioFocusRequest(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
  {
    return b.z(paramAudioManager, paramAudioFocusRequest);
  }
  
  @DoNotInline
  public static int requestAudioFocus(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
  {
    return b.f(paramAudioManager, paramAudioFocusRequest);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioManagerCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
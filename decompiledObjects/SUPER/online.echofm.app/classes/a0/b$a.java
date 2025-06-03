package a0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

public abstract class b$a
{
  public static int a(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
  {
    return paramAudioManager.abandonAudioFocusRequest(paramAudioFocusRequest);
  }
  
  public static int b(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
  {
    return paramAudioManager.requestAudioFocus(paramAudioFocusRequest);
  }
}

/* Location:
 * Qualified Name:     a0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package a0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build.VERSION;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;

public abstract class b
{
  public static int a(AudioManager paramAudioManager, a parama)
  {
    if (paramAudioManager != null)
    {
      if (parama != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return a.a(paramAudioManager, parama.c());
        }
        return paramAudioManager.abandonAudioFocus(parama.e());
      }
      throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
    throw new IllegalArgumentException("AudioManager must not be null");
  }
  
  public static int b(AudioManager paramAudioManager, a parama)
  {
    if (paramAudioManager != null)
    {
      if (parama != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return a.b(paramAudioManager, parama.c());
        }
        return paramAudioManager.requestAudioFocus(parama.e(), parama.b().a(), parama.d());
      }
      throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
    throw new IllegalArgumentException("AudioManager must not be null");
  }
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     a0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
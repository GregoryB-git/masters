package m0;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import d0.b;
import d0.b.d;
import g0.a;
import java.util.List;

public abstract class e$d
{
  public static e a(AudioManager paramAudioManager, b paramb)
  {
    return new e(e.a(h.a(paramAudioManager, aa)), null);
  }
  
  public static j b(AudioManager paramAudioManager, b paramb)
  {
    try
    {
      paramAudioManager = g.a((AudioManager)a.e(paramAudioManager), aa);
      if (paramAudioManager.isEmpty()) {
        return null;
      }
      return new j((AudioDeviceInfo)paramAudioManager.get(0));
    }
    catch (RuntimeException paramAudioManager) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     m0.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
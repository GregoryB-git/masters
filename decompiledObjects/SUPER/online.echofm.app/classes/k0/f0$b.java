package k0;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import g0.M;

public abstract class f0$b
{
  public static boolean a(Context paramContext, AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    if (!M.F0(paramContext)) {
      return true;
    }
    int i = paramArrayOfAudioDeviceInfo.length;
    int j = 0;
    while (j < i)
    {
      paramContext = paramArrayOfAudioDeviceInfo[j];
      if ((paramContext.getType() != 8) && (paramContext.getType() != 5) && (paramContext.getType() != 6) && (paramContext.getType() != 11) && (paramContext.getType() != 4) && (paramContext.getType() != 3))
      {
        int k = M.a;
        if ((k >= 26) && (paramContext.getType() == 22)) {
          return true;
        }
        if ((k >= 28) && (paramContext.getType() == 23)) {
          return true;
        }
        if ((k >= 31) && ((paramContext.getType() == 26) || (paramContext.getType() == 27))) {
          return true;
        }
        if ((k >= 33) && (paramContext.getType() == 30)) {
          return true;
        }
        j++;
      }
      else
      {
        return true;
      }
    }
    return false;
  }
  
  public static void b(AudioManager paramAudioManager, AudioDeviceCallback paramAudioDeviceCallback, Handler paramHandler)
  {
    paramAudioManager.registerAudioDeviceCallback(paramAudioDeviceCallback, paramHandler);
  }
}

/* Location:
 * Qualified Name:     k0.f0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
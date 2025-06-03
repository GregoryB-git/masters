package m0;

import X2.t;
import X2.y;
import X2.y.a;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import g0.M;
import g0.a;

public abstract class e$b
{
  private static y a()
  {
    y.a locala = new y.a().i(new Integer[] { Integer.valueOf(8), Integer.valueOf(7) });
    int i = M.a;
    if (i >= 31) {
      locala.i(new Integer[] { Integer.valueOf(26), Integer.valueOf(27) });
    }
    if (i >= 33) {
      locala.h(Integer.valueOf(30));
    }
    return locala.l();
  }
  
  public static boolean b(AudioManager paramAudioManager, j paramj)
  {
    if (paramj == null) {
      paramAudioManager = ((AudioManager)a.e(paramAudioManager)).getDevices(2);
    } else {
      paramAudioManager = new AudioDeviceInfo[] { a };
    }
    paramj = a();
    int i = paramAudioManager.length;
    for (int j = 0; j < i; j++) {
      if (paramj.contains(Integer.valueOf(paramAudioManager[j].getType()))) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     m0.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
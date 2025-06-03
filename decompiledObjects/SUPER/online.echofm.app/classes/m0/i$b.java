package m0;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import g0.a;

public abstract class i$b
{
  public static void a(Context paramContext, AudioDeviceCallback paramAudioDeviceCallback, Handler paramHandler)
  {
    ((AudioManager)a.e((AudioManager)paramContext.getSystemService("audio"))).registerAudioDeviceCallback(paramAudioDeviceCallback, paramHandler);
  }
  
  public static void b(Context paramContext, AudioDeviceCallback paramAudioDeviceCallback)
  {
    ((AudioManager)a.e((AudioManager)paramContext.getSystemService("audio"))).unregisterAudioDeviceCallback(paramAudioDeviceCallback);
  }
}

/* Location:
 * Qualified Name:     m0.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package k0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

public final class f0$g
  extends AudioDeviceCallback
{
  public f0$g(f0 paramf0) {}
  
  public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    if ((f0.T0(a)) && (U0a).n == 3))
    {
      paramArrayOfAudioDeviceInfo = a;
      f0.V0(paramArrayOfAudioDeviceInfo, U0l, 1, 0);
    }
  }
  
  public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    if (!f0.T0(a))
    {
      paramArrayOfAudioDeviceInfo = a;
      f0.V0(paramArrayOfAudioDeviceInfo, U0l, 1, 3);
    }
  }
}

/* Location:
 * Qualified Name:     k0.f0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
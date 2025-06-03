package m0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import g0.M;

public final class i$c
  extends AudioDeviceCallback
{
  public i$c(i parami) {}
  
  public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    paramArrayOfAudioDeviceInfo = a;
    i.d(paramArrayOfAudioDeviceInfo, e.g(i.e(paramArrayOfAudioDeviceInfo), i.a(a), i.b(a)));
  }
  
  public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    if (M.s(paramArrayOfAudioDeviceInfo, i.b(a))) {
      i.c(a, null);
    }
    paramArrayOfAudioDeviceInfo = a;
    i.d(paramArrayOfAudioDeviceInfo, e.g(i.e(paramArrayOfAudioDeviceInfo), i.a(a), i.b(a)));
  }
}

/* Location:
 * Qualified Name:     m0.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
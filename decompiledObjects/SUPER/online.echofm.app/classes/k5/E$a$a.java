package k5;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

public class E$a$a
  extends AudioDeviceCallback
{
  public E$a$a(E.a parama) {}
  
  public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    a.A("onAudioDevicesAdded", new Object[] { E.d(paramArrayOfAudioDeviceInfo) });
  }
  
  public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    a.A("onAudioDevicesRemoved", new Object[] { E.d(paramArrayOfAudioDeviceInfo) });
  }
}

/* Location:
 * Qualified Name:     k5.E.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
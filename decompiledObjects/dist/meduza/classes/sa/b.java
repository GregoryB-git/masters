package sa;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;

public final class b
  extends AudioDeviceCallback
{
  public b(e.a parama) {}
  
  public final void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    e.a locala = a;
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfAudioDeviceInfo.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(e.a.f(paramArrayOfAudioDeviceInfo[j]));
    }
    locala.g("onAudioDevicesAdded", new Object[] { localArrayList });
  }
  
  public final void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
  {
    e.a locala = a;
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfAudioDeviceInfo.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(e.a.f(paramArrayOfAudioDeviceInfo[j]));
    }
    locala.g("onAudioDevicesRemoved", new Object[] { localArrayList });
  }
}

/* Location:
 * Qualified Name:     sa.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
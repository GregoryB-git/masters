package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import l2.a;

public class DistinctElementSidecarCallback
  implements SidecarInterface.SidecarCallback
{
  public final Object a = new Object();
  public SidecarDeviceState b;
  public final WeakHashMap c = new WeakHashMap();
  public final a d;
  public final SidecarInterface.SidecarCallback e;
  
  public DistinctElementSidecarCallback(a parama, SidecarInterface.SidecarCallback paramSidecarCallback)
  {
    d = parama;
    e = paramSidecarCallback;
  }
  
  public void onDeviceStateChanged(SidecarDeviceState paramSidecarDeviceState)
  {
    if (paramSidecarDeviceState == null) {
      return;
    }
    synchronized (a)
    {
      a locala = d;
      SidecarDeviceState localSidecarDeviceState = b;
      locala.getClass();
      if (a.a(localSidecarDeviceState, paramSidecarDeviceState)) {
        return;
      }
      b = paramSidecarDeviceState;
      e.onDeviceStateChanged(paramSidecarDeviceState);
      return;
    }
  }
  
  public void onWindowLayoutChanged(IBinder paramIBinder, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    synchronized (a)
    {
      SidecarWindowLayoutInfo localSidecarWindowLayoutInfo = (SidecarWindowLayoutInfo)c.get(paramIBinder);
      d.getClass();
      if (a.d(localSidecarWindowLayoutInfo, paramSidecarWindowLayoutInfo)) {
        return;
      }
      c.put(paramIBinder, paramSidecarWindowLayoutInfo);
      e.onWindowLayoutChanged(paramIBinder, paramSidecarWindowLayoutInfo);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
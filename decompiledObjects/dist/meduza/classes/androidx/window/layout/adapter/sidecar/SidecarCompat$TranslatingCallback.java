package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ec.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l2.a;

public final class SidecarCompat$TranslatingCallback
  implements SidecarInterface.SidecarCallback
{
  public void onDeviceStateChanged(SidecarDeviceState paramSidecarDeviceState)
  {
    i.e(paramSidecarDeviceState, "newDeviceState");
    Object localObject = SidecarCompat.f(a).values();
    SidecarCompat localSidecarCompat = a;
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)localIterator.next();
      IBinder localIBinder = SidecarCompat.a.a(localActivity);
      SidecarCompat.b localb = null;
      localObject = localb;
      if (localIBinder != null)
      {
        SidecarInterface localSidecarInterface = localSidecarCompat.g();
        localObject = localb;
        if (localSidecarInterface != null) {
          localObject = localSidecarInterface.getWindowLayoutInfo(localIBinder);
        }
      }
      localb = SidecarCompat.d(localSidecarCompat);
      if (localb != null) {
        localb.a(localActivity, SidecarCompat.e(localSidecarCompat).e((SidecarWindowLayoutInfo)localObject, paramSidecarDeviceState));
      }
    }
  }
  
  public void onWindowLayoutChanged(IBinder paramIBinder, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    i.e(paramIBinder, "windowToken");
    i.e(paramSidecarWindowLayoutInfo, "newLayout");
    Activity localActivity = (Activity)SidecarCompat.f(a).get(paramIBinder);
    if (localActivity == null)
    {
      Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
      return;
    }
    a locala = SidecarCompat.e(a);
    paramIBinder = a.g();
    if (paramIBinder != null)
    {
      SidecarDeviceState localSidecarDeviceState = paramIBinder.getDeviceState();
      paramIBinder = localSidecarDeviceState;
      if (localSidecarDeviceState != null) {}
    }
    else
    {
      paramIBinder = new SidecarDeviceState();
    }
    paramIBinder = locala.e(paramSidecarWindowLayoutInfo, paramIBinder);
    paramSidecarWindowLayoutInfo = SidecarCompat.d(a);
    if (paramSidecarWindowLayoutInfo != null) {
      paramSidecarWindowLayoutInfo.a(localActivity, paramIBinder);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.SidecarCompat.TranslatingCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
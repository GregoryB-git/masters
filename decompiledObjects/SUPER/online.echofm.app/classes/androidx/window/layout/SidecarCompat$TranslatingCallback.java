package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarCompat$TranslatingCallback
  implements SidecarInterface.SidecarCallback
{
  @SuppressLint({"SyntheticAccessor"})
  public void onDeviceStateChanged(@NotNull SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "newDeviceState");
    Object localObject1 = (Iterable)SidecarCompat.access$getWindowListenerRegisteredContexts$p(this$0).values();
    SidecarCompat localSidecarCompat = this$0;
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)localIterator.next();
      IBinder localIBinder = SidecarCompat.Companion.getActivityWindowToken$window_release(localActivity);
      localObject1 = null;
      if (localIBinder != null)
      {
        localObject2 = localSidecarCompat.getSidecar();
        if (localObject2 != null) {
          localObject1 = ((SidecarInterface)localObject2).getWindowLayoutInfo(localIBinder);
        }
      }
      Object localObject2 = SidecarCompat.access$getExtensionCallback$p(localSidecarCompat);
      if (localObject2 != null) {
        ((ExtensionInterfaceCompat.ExtensionCallbackInterface)localObject2).onWindowLayoutChanged(localActivity, SidecarCompat.access$getSidecarAdapter$p(localSidecarCompat).translate((SidecarWindowLayoutInfo)localObject1, paramSidecarDeviceState));
      }
    }
  }
  
  @SuppressLint({"SyntheticAccessor"})
  public void onWindowLayoutChanged(@NotNull IBinder paramIBinder, @NotNull SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramIBinder, "windowToken");
    Intrinsics.checkNotNullParameter(paramSidecarWindowLayoutInfo, "newLayout");
    Activity localActivity = (Activity)SidecarCompat.access$getWindowListenerRegisteredContexts$p(this$0).get(paramIBinder);
    if (localActivity == null)
    {
      Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
      return;
    }
    SidecarAdapter localSidecarAdapter = SidecarCompat.access$getSidecarAdapter$p(this$0);
    paramIBinder = this$0.getSidecar();
    if (paramIBinder == null) {
      paramIBinder = null;
    } else {
      paramIBinder = paramIBinder.getDeviceState();
    }
    Object localObject = paramIBinder;
    if (paramIBinder == null) {
      localObject = new SidecarDeviceState();
    }
    paramSidecarWindowLayoutInfo = localSidecarAdapter.translate(paramSidecarWindowLayoutInfo, (SidecarDeviceState)localObject);
    paramIBinder = SidecarCompat.access$getExtensionCallback$p(this$0);
    if (paramIBinder != null) {
      paramIBinder.onWindowLayoutChanged(localActivity, paramSidecarWindowLayoutInfo);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.TranslatingCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
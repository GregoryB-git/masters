package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
  implements ComponentCallbacks
{
  public SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1(SidecarCompat paramSidecarCompat, Activity paramActivity) {}
  
  public void onConfigurationChanged(@NotNull Configuration paramConfiguration)
  {
    Intrinsics.checkNotNullParameter(paramConfiguration, "newConfig");
    ExtensionInterfaceCompat.ExtensionCallbackInterface localExtensionCallbackInterface = SidecarCompat.access$getExtensionCallback$p(this$0);
    if (localExtensionCallbackInterface != null)
    {
      paramConfiguration = $activity;
      localExtensionCallbackInterface.onWindowLayoutChanged(paramConfiguration, this$0.getWindowLayoutInfo(paramConfiguration));
    }
  }
  
  public void onLowMemory() {}
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
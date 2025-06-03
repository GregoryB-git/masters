package androidx.window.layout;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class SidecarCompat$DistinctElementCallback
  implements ExtensionInterfaceCompat.ExtensionCallbackInterface
{
  @NotNull
  private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
  @NotNull
  private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
  @NotNull
  private final ReentrantLock lock;
  
  public SidecarCompat$DistinctElementCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface paramExtensionCallbackInterface)
  {
    callbackInterface = paramExtensionCallbackInterface;
    lock = new ReentrantLock();
    activityWindowLayoutInfo = new WeakHashMap();
  }
  
  public void onWindowLayoutChanged(@NotNull Activity paramActivity, @NotNull WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "newLayout");
    ReentrantLock localReentrantLock = lock;
    localReentrantLock.lock();
    try
    {
      boolean bool = Intrinsics.a(paramWindowLayoutInfo, (WindowLayoutInfo)activityWindowLayoutInfo.get(paramActivity));
      if (bool) {
        return;
      }
      WindowLayoutInfo localWindowLayoutInfo = (WindowLayoutInfo)activityWindowLayoutInfo.put(paramActivity, paramWindowLayoutInfo);
      localReentrantLock.unlock();
      callbackInterface.onWindowLayoutChanged(paramActivity, paramWindowLayoutInfo);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.DistinctElementCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
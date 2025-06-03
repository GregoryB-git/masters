package androidx.window.layout;

import V5.t;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class SidecarCompat$DistinctSidecarElementCallback
  implements SidecarInterface.SidecarCallback
{
  @NotNull
  private final SidecarInterface.SidecarCallback callbackInterface;
  private SidecarDeviceState lastDeviceState;
  @NotNull
  private final ReentrantLock lock;
  @NotNull
  private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
  @NotNull
  private final SidecarAdapter sidecarAdapter;
  
  public SidecarCompat$DistinctSidecarElementCallback(@NotNull SidecarAdapter paramSidecarAdapter, @NotNull SidecarInterface.SidecarCallback paramSidecarCallback)
  {
    sidecarAdapter = paramSidecarAdapter;
    callbackInterface = paramSidecarCallback;
    lock = new ReentrantLock();
    mActivityWindowLayoutInfo = new WeakHashMap();
  }
  
  public void onDeviceStateChanged(@NotNull SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "newDeviceState");
    ReentrantLock localReentrantLock = lock;
    localReentrantLock.lock();
    try
    {
      boolean bool = sidecarAdapter.isEqualSidecarDeviceState(lastDeviceState, paramSidecarDeviceState);
      if (bool) {
        return;
      }
      lastDeviceState = paramSidecarDeviceState;
      callbackInterface.onDeviceStateChanged(paramSidecarDeviceState);
      paramSidecarDeviceState = t.a;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public void onWindowLayoutChanged(@NotNull IBinder paramIBinder, @NotNull SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramIBinder, "token");
    Intrinsics.checkNotNullParameter(paramSidecarWindowLayoutInfo, "newLayout");
    synchronized (lock)
    {
      SidecarWindowLayoutInfo localSidecarWindowLayoutInfo = (SidecarWindowLayoutInfo)mActivityWindowLayoutInfo.get(paramIBinder);
      boolean bool = sidecarAdapter.isEqualSidecarWindowLayoutInfo(localSidecarWindowLayoutInfo, paramSidecarWindowLayoutInfo);
      if (bool) {
        return;
      }
      localSidecarWindowLayoutInfo = (SidecarWindowLayoutInfo)mActivityWindowLayoutInfo.put(paramIBinder, paramSidecarWindowLayoutInfo);
      callbackInterface.onWindowLayoutChanged(paramIBinder, paramSidecarWindowLayoutInfo);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
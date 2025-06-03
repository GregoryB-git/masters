package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarWindowBackend$ExtensionListenerImpl
  implements ExtensionInterfaceCompat.ExtensionCallbackInterface
{
  @SuppressLint({"SyntheticAccessor"})
  public void onWindowLayoutChanged(@NotNull Activity paramActivity, @NotNull WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "newLayout");
    Iterator localIterator = this$0.getWindowLayoutChangeCallbacks().iterator();
    while (localIterator.hasNext())
    {
      SidecarWindowBackend.WindowLayoutChangeCallbackWrapper localWindowLayoutChangeCallbackWrapper = (SidecarWindowBackend.WindowLayoutChangeCallbackWrapper)localIterator.next();
      if (Intrinsics.a(localWindowLayoutChangeCallbackWrapper.getActivity(), paramActivity)) {
        localWindowLayoutChangeCallbackWrapper.accept(paramWindowLayoutInfo);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend.ExtensionListenerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
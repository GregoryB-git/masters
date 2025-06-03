package androidx.window.layout;

import H.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"NewApi"})
final class ExtensionWindowLayoutInfoBackend$MulticastConsumer
  implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo>
{
  @NotNull
  private final Activity activity;
  private WindowLayoutInfo lastKnownValue;
  @NotNull
  private final ReentrantLock multicastConsumerLock;
  @NotNull
  private final Set<a> registeredListeners;
  
  public ExtensionWindowLayoutInfoBackend$MulticastConsumer(@NotNull Activity paramActivity)
  {
    activity = paramActivity;
    multicastConsumerLock = new ReentrantLock();
    registeredListeners = new LinkedHashSet();
  }
  
  /* Error */
  public void accept(@NotNull androidx.window.extensions.layout.WindowLayoutInfo paramWindowLayoutInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 53
    //   3: invokestatic 33	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 43	androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer:multicastConsumerLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   10: astore_2
    //   11: aload_2
    //   12: invokeinterface 58 1 0
    //   17: aload_0
    //   18: getstatic 64	androidx/window/layout/ExtensionsWindowLayoutInfoAdapter:INSTANCE	Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;
    //   21: aload_0
    //   22: getfield 38	androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer:activity	Landroid/app/Activity;
    //   25: aload_1
    //   26: invokevirtual 68	androidx/window/layout/ExtensionsWindowLayoutInfoAdapter:translate$window_release	(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/WindowLayoutInfo;
    //   29: putfield 70	androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer:lastKnownValue	Landroidx/window/layout/WindowLayoutInfo;
    //   32: aload_0
    //   33: getfield 48	androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer:registeredListeners	Ljava/util/Set;
    //   36: invokeinterface 76 1 0
    //   41: astore_1
    //   42: aload_1
    //   43: invokeinterface 82 1 0
    //   48: ifeq +28 -> 76
    //   51: aload_1
    //   52: invokeinterface 86 1 0
    //   57: checkcast 88	H/a
    //   60: aload_0
    //   61: getfield 70	androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer:lastKnownValue	Landroidx/window/layout/WindowLayoutInfo;
    //   64: invokeinterface 91 2 0
    //   69: goto -27 -> 42
    //   72: astore_1
    //   73: goto +14 -> 87
    //   76: getstatic 97	V5/t:a	LV5/t;
    //   79: astore_1
    //   80: aload_2
    //   81: invokeinterface 100 1 0
    //   86: return
    //   87: aload_2
    //   88: invokeinterface 100 1 0
    //   93: aload_1
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	MulticastConsumer
    //   0	95	1	paramWindowLayoutInfo	androidx.window.extensions.layout.WindowLayoutInfo
    //   10	78	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   17	42	72	finally
    //   42	69	72	finally
    //   76	80	72	finally
  }
  
  public final void addListener(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "listener");
    ReentrantLock localReentrantLock = multicastConsumerLock;
    localReentrantLock.lock();
    try
    {
      WindowLayoutInfo localWindowLayoutInfo = lastKnownValue;
      if (localWindowLayoutInfo != null) {
        parama.accept(localWindowLayoutInfo);
      }
      registeredListeners.add(parama);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final boolean isEmpty()
  {
    return registeredListeners.isEmpty();
  }
  
  public final void removeListener(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "listener");
    ReentrantLock localReentrantLock = multicastConsumerLock;
    localReentrantLock.lock();
    try
    {
      registeredListeners.remove(parama);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
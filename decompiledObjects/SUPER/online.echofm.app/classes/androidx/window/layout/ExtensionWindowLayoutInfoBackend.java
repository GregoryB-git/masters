package androidx.window.layout;

import H.a;
import V5.t;
import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.embedding.g;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionWindowLayoutInfoBackend
  implements WindowBackend
{
  @NotNull
  private final Map<Activity, MulticastConsumer> activityToListeners;
  @NotNull
  private final WindowLayoutComponent component;
  @NotNull
  private final ReentrantLock extensionWindowBackendLock;
  @NotNull
  private final Map<a, Activity> listenerToActivity;
  
  public ExtensionWindowLayoutInfoBackend(@NotNull WindowLayoutComponent paramWindowLayoutComponent)
  {
    component = paramWindowLayoutComponent;
    extensionWindowBackendLock = new ReentrantLock();
    activityToListeners = new LinkedHashMap();
    listenerToActivity = new LinkedHashMap();
  }
  
  public void registerLayoutChangeCallback(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramExecutor, "executor");
    Intrinsics.checkNotNullParameter(parama, "callback");
    ReentrantLock localReentrantLock = extensionWindowBackendLock;
    localReentrantLock.lock();
    try
    {
      paramExecutor = (MulticastConsumer)activityToListeners.get(paramActivity);
      if (paramExecutor == null)
      {
        paramExecutor = null;
      }
      else
      {
        paramExecutor.addListener(parama);
        listenerToActivity.put(parama, paramActivity);
        paramExecutor = t.a;
      }
      if (paramExecutor == null)
      {
        paramExecutor = new androidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;
        paramExecutor.<init>(paramActivity);
        activityToListeners.put(paramActivity, paramExecutor);
        listenerToActivity.put(parama, paramActivity);
        paramExecutor.addListener(parama);
        component.addWindowLayoutInfoListener(paramActivity, g.a(paramExecutor));
      }
    }
    finally
    {
      break label150;
    }
    paramActivity = t.a;
    localReentrantLock.unlock();
    return;
    label150:
    localReentrantLock.unlock();
    throw paramActivity;
  }
  
  public void unregisterLayoutChangeCallback(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "callback");
    ReentrantLock localReentrantLock = extensionWindowBackendLock;
    localReentrantLock.lock();
    try
    {
      Object localObject = (Activity)listenerToActivity.get(parama);
      if (localObject == null)
      {
        localReentrantLock.unlock();
        return;
      }
      localObject = (MulticastConsumer)activityToListeners.get(localObject);
      if (localObject == null)
      {
        localReentrantLock.unlock();
        return;
      }
      ((MulticastConsumer)localObject).removeListener(parama);
      if (((MulticastConsumer)localObject).isEmpty()) {
        component.removeWindowLayoutInfoListener(g.a(localObject));
      }
    }
    finally
    {
      break label110;
    }
    parama = t.a;
    localReentrantLock.unlock();
    return;
    label110:
    localReentrantLock.unlock();
    throw parama;
  }
  
  @Metadata
  @SuppressLint({"NewApi"})
  public static final class MulticastConsumer
    implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo>
  {
    @NotNull
    private final Activity activity;
    private WindowLayoutInfo lastKnownValue;
    @NotNull
    private final ReentrantLock multicastConsumerLock;
    @NotNull
    private final Set<a> registeredListeners;
    
    public MulticastConsumer(@NotNull Activity paramActivity)
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
}

/* Location:
 * Qualified Name:     androidx.window.layout.ExtensionWindowLayoutInfoBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
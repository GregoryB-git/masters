package androidx.window.layout;

import H.a;
import V5.t;
import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarWindowBackend
  implements WindowBackend
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  public static final boolean DEBUG = false;
  @NotNull
  private static final String TAG = "WindowServer";
  private static volatile SidecarWindowBackend globalInstance;
  @NotNull
  private static final ReentrantLock globalLock = new ReentrantLock();
  private ExtensionInterfaceCompat windowExtension;
  @NotNull
  private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks;
  
  public SidecarWindowBackend(ExtensionInterfaceCompat paramExtensionInterfaceCompat)
  {
    windowExtension = paramExtensionInterfaceCompat;
    windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
    paramExtensionInterfaceCompat = windowExtension;
    if (paramExtensionInterfaceCompat != null) {
      paramExtensionInterfaceCompat.setExtensionCallback(new ExtensionListenerImpl());
    }
  }
  
  private final void callbackRemovedForActivity(Activity paramActivity)
  {
    Object localObject = windowLayoutChangeCallbacks;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (Intrinsics.a(((WindowLayoutChangeCallbackWrapper)((Iterator)localObject).next()).getActivity(), paramActivity)) {
          return;
        }
      }
    }
    localObject = windowExtension;
    if (localObject != null) {
      ((ExtensionInterfaceCompat)localObject).onWindowLayoutChangeListenerRemoved(paramActivity);
    }
  }
  
  private final boolean isActivityRegistered(Activity paramActivity)
  {
    Object localObject = windowLayoutChangeCallbacks;
    boolean bool1 = localObject instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (((Collection)localObject).isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!Intrinsics.a(((WindowLayoutChangeCallbackWrapper)((Iterator)localObject).next()).getActivity(), paramActivity));
      bool1 = true;
    }
    return bool1;
  }
  
  public final ExtensionInterfaceCompat getWindowExtension()
  {
    return windowExtension;
  }
  
  @NotNull
  public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks()
  {
    return windowLayoutChangeCallbacks;
  }
  
  public void registerLayoutChangeCallback(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramExecutor, "executor");
    Intrinsics.checkNotNullParameter(parama, "callback");
    ReentrantLock localReentrantLock = globalLock;
    localReentrantLock.lock();
    try
    {
      localObject = getWindowExtension();
      if (localObject == null)
      {
        paramActivity = new androidx/window/layout/WindowLayoutInfo;
        paramActivity.<init>(m.f());
        parama.accept(paramActivity);
        localReentrantLock.unlock();
        return;
      }
    }
    finally
    {
      Object localObject;
      break label214;
      boolean bool = isActivityRegistered(paramActivity);
      WindowLayoutChangeCallbackWrapper localWindowLayoutChangeCallbackWrapper = new androidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;
      localWindowLayoutChangeCallbackWrapper.<init>(paramActivity, paramExecutor, parama);
      getWindowLayoutChangeCallbacks().add(localWindowLayoutChangeCallbackWrapper);
      if (!bool)
      {
        ((ExtensionInterfaceCompat)localObject).onWindowLayoutChangeListenerAdded(paramActivity);
      }
      else
      {
        localObject = getWindowLayoutChangeCallbacks().iterator();
        do
        {
          bool = ((Iterator)localObject).hasNext();
          paramExecutor = null;
          if (!bool) {
            break;
          }
          parama = ((Iterator)localObject).next();
        } while (!Intrinsics.a(paramActivity, ((WindowLayoutChangeCallbackWrapper)parama).getActivity()));
        paramActivity = parama;
        break label173;
        paramActivity = null;
        label173:
        paramActivity = (WindowLayoutChangeCallbackWrapper)paramActivity;
        if (paramActivity == null) {
          paramActivity = paramExecutor;
        } else {
          paramActivity = paramActivity.getLastInfo();
        }
        if (paramActivity != null) {
          localWindowLayoutChangeCallbackWrapper.accept(paramActivity);
        }
      }
      paramActivity = t.a;
      localReentrantLock.unlock();
      return;
      label214:
      localReentrantLock.unlock();
    }
  }
  
  public final void setWindowExtension(ExtensionInterfaceCompat paramExtensionInterfaceCompat)
  {
    windowExtension = paramExtensionInterfaceCompat;
  }
  
  public void unregisterLayoutChangeCallback(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "callback");
    ArrayList localArrayList;
    synchronized (globalLock)
    {
      Object localObject = getWindowExtension();
      if (localObject == null) {
        return;
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = getWindowLayoutChangeCallbacks().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (WindowLayoutChangeCallbackWrapper)localIterator.next();
      } while (((WindowLayoutChangeCallbackWrapper)localObject).getCallback() != parama);
      Intrinsics.checkNotNullExpressionValue(localObject, "callbackWrapper");
      localArrayList.add(localObject);
    }
  }
  
  @Metadata
  public static final class Companion
  {
    @NotNull
    public final SidecarWindowBackend getInstance(@NotNull Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      if (SidecarWindowBackend.access$getGlobalInstance$cp() == null)
      {
        ReentrantLock localReentrantLock = SidecarWindowBackend.access$getGlobalLock$cp();
        localReentrantLock.lock();
        try
        {
          if (SidecarWindowBackend.access$getGlobalInstance$cp() == null)
          {
            paramContext = SidecarWindowBackend.Companion.initAndVerifyExtension(paramContext);
            SidecarWindowBackend localSidecarWindowBackend = new androidx/window/layout/SidecarWindowBackend;
            localSidecarWindowBackend.<init>(paramContext);
            SidecarWindowBackend.access$setGlobalInstance$cp(localSidecarWindowBackend);
          }
        }
        finally
        {
          break label69;
        }
        paramContext = t.a;
        localReentrantLock.unlock();
        break label77;
        label69:
        localReentrantLock.unlock();
        throw paramContext;
      }
      label77:
      paramContext = SidecarWindowBackend.access$getGlobalInstance$cp();
      Intrinsics.b(paramContext);
      return paramContext;
    }
    
    public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      localObject1 = null;
      localObject2 = localObject1;
      try
      {
        if (isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion()))
        {
          localObject2 = new androidx/window/layout/SidecarCompat;
          ((SidecarCompat)localObject2).<init>(paramContext);
          boolean bool = ((SidecarCompat)localObject2).validateExtensionInterface();
          if (!bool) {
            localObject2 = localObject1;
          }
        }
      }
      finally
      {
        for (;;)
        {
          localObject2 = localObject1;
        }
      }
      return (ExtensionInterfaceCompat)localObject2;
    }
    
    public final boolean isSidecarVersionSupported(Version paramVersion)
    {
      boolean bool = false;
      if (paramVersion == null) {
        return false;
      }
      if (paramVersion.compareTo(Version.Companion.getVERSION_0_1()) >= 0) {
        bool = true;
      }
      return bool;
    }
    
    public final void resetInstance()
    {
      SidecarWindowBackend.access$setGlobalInstance$cp(null);
    }
  }
  
  @Metadata
  public final class ExtensionListenerImpl
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
  
  @Metadata
  public static final class WindowLayoutChangeCallbackWrapper
  {
    @NotNull
    private final Activity activity;
    @NotNull
    private final a callback;
    @NotNull
    private final Executor executor;
    private WindowLayoutInfo lastInfo;
    
    public WindowLayoutChangeCallbackWrapper(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
    {
      activity = paramActivity;
      executor = paramExecutor;
      callback = parama;
    }
    
    private static final void accept$lambda-0(WindowLayoutChangeCallbackWrapper paramWindowLayoutChangeCallbackWrapper, WindowLayoutInfo paramWindowLayoutInfo)
    {
      Intrinsics.checkNotNullParameter(paramWindowLayoutChangeCallbackWrapper, "this$0");
      Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "$newLayoutInfo");
      paramWindowLayoutChangeCallbackWrapper.getCallback().accept(paramWindowLayoutInfo);
    }
    
    public final void accept(@NotNull WindowLayoutInfo paramWindowLayoutInfo)
    {
      Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "newLayoutInfo");
      lastInfo = paramWindowLayoutInfo;
      executor.execute(new i(this, paramWindowLayoutInfo));
    }
    
    @NotNull
    public final Activity getActivity()
    {
      return activity;
    }
    
    @NotNull
    public final a getCallback()
    {
      return callback;
    }
    
    public final WindowLayoutInfo getLastInfo()
    {
      return lastInfo;
    }
    
    public final void setLastInfo(WindowLayoutInfo paramWindowLayoutInfo)
    {
      lastInfo = paramWindowLayoutInfo;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.window.layout;

import V5.t;
import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarCompat
  implements ExtensionInterfaceCompat
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private static final String TAG = "SidecarCompat";
  @NotNull
  private final Map<Activity, ComponentCallbacks> componentCallbackMap;
  private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
  private final SidecarInterface sidecar;
  @NotNull
  private final SidecarAdapter sidecarAdapter;
  @NotNull
  private final Map<IBinder, Activity> windowListenerRegisteredContexts;
  
  public SidecarCompat(@NotNull Context paramContext)
  {
    this(SidecarProvider.getSidecarImpl(paramContext.getApplicationContext()), new SidecarAdapter());
  }
  
  public SidecarCompat(SidecarInterface paramSidecarInterface, @NotNull SidecarAdapter paramSidecarAdapter)
  {
    sidecar = paramSidecarInterface;
    sidecarAdapter = paramSidecarAdapter;
    windowListenerRegisteredContexts = new LinkedHashMap();
    componentCallbackMap = new LinkedHashMap();
  }
  
  private final void registerConfigurationChangeListener(final Activity paramActivity)
  {
    if (componentCallbackMap.get(paramActivity) == null)
    {
      ComponentCallbacks local1 = new ComponentCallbacks()
      {
        public void onConfigurationChanged(@NotNull Configuration paramAnonymousConfiguration)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousConfiguration, "newConfig");
          ExtensionInterfaceCompat.ExtensionCallbackInterface localExtensionCallbackInterface = SidecarCompat.access$getExtensionCallback$p(this$0);
          if (localExtensionCallbackInterface != null)
          {
            paramAnonymousConfiguration = paramActivity;
            localExtensionCallbackInterface.onWindowLayoutChanged(paramAnonymousConfiguration, this$0.getWindowLayoutInfo(paramAnonymousConfiguration));
          }
        }
        
        public void onLowMemory() {}
      };
      componentCallbackMap.put(paramActivity, local1);
      paramActivity.registerComponentCallbacks(local1);
    }
  }
  
  private final void unregisterComponentCallback(Activity paramActivity)
  {
    paramActivity.unregisterComponentCallbacks((ComponentCallbacks)componentCallbackMap.get(paramActivity));
    componentCallbackMap.remove(paramActivity);
  }
  
  public final SidecarInterface getSidecar()
  {
    return sidecar;
  }
  
  @NotNull
  public final WindowLayoutInfo getWindowLayoutInfo(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Object localObject1 = Companion.getActivityWindowToken$window_release(paramActivity);
    if (localObject1 == null) {
      return new WindowLayoutInfo(m.f());
    }
    Object localObject2 = sidecar;
    paramActivity = null;
    if (localObject2 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((SidecarInterface)localObject2).getWindowLayoutInfo((IBinder)localObject1);
    }
    SidecarAdapter localSidecarAdapter = sidecarAdapter;
    localObject2 = sidecar;
    if (localObject2 != null) {
      paramActivity = ((SidecarInterface)localObject2).getDeviceState();
    }
    localObject2 = paramActivity;
    if (paramActivity == null) {
      localObject2 = new SidecarDeviceState();
    }
    return localSidecarAdapter.translate((SidecarWindowLayoutInfo)localObject1, (SidecarDeviceState)localObject2);
  }
  
  public void onWindowLayoutChangeListenerAdded(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Object localObject = Companion.getActivityWindowToken$window_release(paramActivity);
    if (localObject != null)
    {
      register((IBinder)localObject, paramActivity);
    }
    else
    {
      localObject = new FirstAttachAdapter(this, paramActivity);
      paramActivity.getWindow().getDecorView().addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject);
    }
  }
  
  public void onWindowLayoutChangeListenerRemoved(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    IBinder localIBinder = Companion.getActivityWindowToken$window_release(paramActivity);
    if (localIBinder == null) {
      return;
    }
    SidecarInterface localSidecarInterface = sidecar;
    if (localSidecarInterface != null) {
      localSidecarInterface.onWindowLayoutChangeListenerRemoved(localIBinder);
    }
    unregisterComponentCallback(paramActivity);
    int i;
    if (windowListenerRegisteredContexts.size() == 1) {
      i = 1;
    } else {
      i = 0;
    }
    windowListenerRegisteredContexts.remove(localIBinder);
    if (i != 0)
    {
      paramActivity = sidecar;
      if (paramActivity != null) {
        paramActivity.onDeviceStateListenersChanged(true);
      }
    }
  }
  
  public final void register(@NotNull IBinder paramIBinder, @NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramIBinder, "windowToken");
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    windowListenerRegisteredContexts.put(paramIBinder, paramActivity);
    SidecarInterface localSidecarInterface = sidecar;
    if (localSidecarInterface != null) {
      localSidecarInterface.onWindowLayoutChangeListenerAdded(paramIBinder);
    }
    if (windowListenerRegisteredContexts.size() == 1)
    {
      paramIBinder = sidecar;
      if (paramIBinder != null) {
        paramIBinder.onDeviceStateListenersChanged(false);
      }
    }
    paramIBinder = extensionCallback;
    if (paramIBinder != null) {
      paramIBinder.onWindowLayoutChanged(paramActivity, getWindowLayoutInfo(paramActivity));
    }
    registerConfigurationChangeListener(paramActivity);
  }
  
  public void setExtensionCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface paramExtensionCallbackInterface)
  {
    Intrinsics.checkNotNullParameter(paramExtensionCallbackInterface, "extensionCallback");
    extensionCallback = new DistinctElementCallback(paramExtensionCallbackInterface);
    paramExtensionCallbackInterface = sidecar;
    if (paramExtensionCallbackInterface != null) {
      paramExtensionCallbackInterface.setSidecarCallback((SidecarInterface.SidecarCallback)new DistinctSidecarElementCallback(sidecarAdapter, (SidecarInterface.SidecarCallback)new TranslatingCallback()));
    }
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  public boolean validateExtensionInterface()
  {
    boolean bool = true;
    try
    {
      Object localObject1 = sidecar;
      Object localObject4 = null;
      if (localObject1 == null) {}
      do
      {
        localObject1 = null;
        break;
        localObject1 = localObject1.getClass();
      } while (localObject1 == null);
      localObject1 = ((Class)localObject1).getMethod("setSidecarCallback", new Class[] { SidecarInterface.SidecarCallback.class });
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = ((Method)localObject1).getReturnType();
      }
      Object localObject5 = Void.TYPE;
      Object localObject2;
      if (Intrinsics.a(localObject1, localObject5))
      {
        localObject1 = sidecar;
        if (localObject1 != null) {
          ((SidecarInterface)localObject1).getDeviceState();
        }
        localObject1 = sidecar;
        if (localObject1 != null) {
          ((SidecarInterface)localObject1).onDeviceStateListenersChanged(true);
        }
        localObject1 = sidecar;
        if (localObject1 == null) {}
        do
        {
          localObject1 = null;
          break;
          localObject1 = localObject1.getClass();
        } while (localObject1 == null);
        localObject1 = ((Class)localObject1).getMethod("getWindowLayoutInfo", new Class[] { IBinder.class });
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = ((Method)localObject1).getReturnType();
        }
        if (Intrinsics.a(localObject1, SidecarWindowLayoutInfo.class))
        {
          localObject1 = sidecar;
          if (localObject1 == null) {}
          do
          {
            localObject1 = null;
            break;
            localObject1 = localObject1.getClass();
          } while (localObject1 == null);
          localObject1 = ((Class)localObject1).getMethod("onWindowLayoutChangeListenerAdded", new Class[] { IBinder.class });
          if (localObject1 == null) {
            localObject1 = null;
          } else {
            localObject1 = ((Method)localObject1).getReturnType();
          }
          if (Intrinsics.a(localObject1, localObject5))
          {
            localObject1 = sidecar;
            if (localObject1 == null) {}
            do
            {
              localObject1 = null;
              break;
              localObject1 = localObject1.getClass();
            } while (localObject1 == null);
            localObject1 = ((Class)localObject1).getMethod("onWindowLayoutChangeListenerRemoved", new Class[] { IBinder.class });
            if (localObject1 == null) {
              localObject1 = localObject4;
            } else {
              localObject1 = ((Method)localObject1).getReturnType();
            }
            if (Intrinsics.a(localObject1, localObject5))
            {
              localObject4 = new androidx/window/sidecar/SidecarDeviceState;
              ((SidecarDeviceState)localObject4).<init>();
              try
              {
                posture = 3;
              }
              catch (NoSuchFieldError localNoSuchFieldError1)
              {
                SidecarDeviceState.class.getMethod("setPosture", new Class[] { Integer.TYPE }).invoke(localObject4, new Object[] { Integer.valueOf(3) });
                localObject2 = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(localObject4, new Object[0]);
                if (localObject2 == null) {
                  break label587;
                }
              }
              if (((Integer)localObject2).intValue() == 3)
              {
                localObject2 = new androidx/window/sidecar/SidecarDisplayFeature;
                ((SidecarDisplayFeature)localObject2).<init>();
                localObject4 = ((SidecarDisplayFeature)localObject2).getRect();
                Intrinsics.checkNotNullExpressionValue(localObject4, "displayFeature.rect");
                ((SidecarDisplayFeature)localObject2).setRect((Rect)localObject4);
                ((SidecarDisplayFeature)localObject2).getType();
                ((SidecarDisplayFeature)localObject2).setType(1);
                localObject4 = new androidx/window/sidecar/SidecarWindowLayoutInfo;
                ((SidecarWindowLayoutInfo)localObject4).<init>();
                try
                {
                  localObject5 = displayFeatures;
                }
                catch (NoSuchFieldError localNoSuchFieldError2)
                {
                  ArrayList localArrayList = new java/util/ArrayList;
                  localArrayList.<init>();
                  localArrayList.add(localObject2);
                  SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[] { List.class }).invoke(localObject4, new Object[] { localArrayList });
                  localObject2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(localObject4, new Object[0]);
                  if (localObject2 != null)
                  {
                    if (Intrinsics.a(localArrayList, (List)localObject2)) {
                      return bool;
                    }
                    localObject2 = new java/lang/Exception;
                    ((Exception)localObject2).<init>("Invalid display feature getter/setter");
                    throw ((Throwable)localObject2);
                  }
                  localObject2 = new java/lang/NullPointerException;
                  ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                  throw ((Throwable)localObject2);
                }
              }
              else
              {
                localObject2 = new java/lang/Exception;
                ((Exception)localObject2).<init>("Invalid device posture getter/setter");
                throw ((Throwable)localObject2);
                label587:
                localObject2 = new java/lang/NullPointerException;
                ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type kotlin.Int");
                throw ((Throwable)localObject2);
              }
            }
            else
            {
              localObject4 = new java/lang/NoSuchMethodException;
              ((NoSuchMethodException)localObject4).<init>(Intrinsics.i("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", localObject2));
              throw ((Throwable)localObject4);
            }
          }
          else
          {
            localObject4 = new java/lang/NoSuchMethodException;
            ((NoSuchMethodException)localObject4).<init>(Intrinsics.i("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", localObject2));
            throw ((Throwable)localObject4);
          }
        }
        else
        {
          localObject4 = new java/lang/NoSuchMethodException;
          ((NoSuchMethodException)localObject4).<init>(Intrinsics.i("Illegal return type for 'getWindowLayoutInfo': ", localObject2));
          throw ((Throwable)localObject4);
        }
      }
      else
      {
        localObject4 = new java/lang/NoSuchMethodException;
        ((NoSuchMethodException)localObject4).<init>(Intrinsics.i("Illegal return type for 'setSidecarCallback': ", localObject2));
        throw ((Throwable)localObject4);
      }
    }
    finally
    {
      bool = false;
    }
    return bool;
  }
  
  @Metadata
  public static final class Companion
  {
    public final IBinder getActivityWindowToken$window_release(Activity paramActivity)
    {
      Object localObject = null;
      if (paramActivity == null)
      {
        paramActivity = (Activity)localObject;
      }
      else
      {
        paramActivity = paramActivity.getWindow();
        if (paramActivity == null)
        {
          paramActivity = (Activity)localObject;
        }
        else
        {
          paramActivity = paramActivity.getAttributes();
          if (paramActivity == null) {
            paramActivity = (Activity)localObject;
          } else {
            paramActivity = token;
          }
        }
      }
      return paramActivity;
    }
    
    public final Version getSidecarVersion()
    {
      localObject1 = null;
      try
      {
        String str = SidecarProvider.getApiVersion();
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(str)) {
          localObject2 = Version.Companion.parse(str);
        }
      }
      catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
      {
        for (;;)
        {
          Object localObject2;
          Object localObject3 = localObject1;
        }
      }
      return (Version)localObject2;
    }
  }
  
  @Metadata
  public static final class DistinctElementCallback
    implements ExtensionInterfaceCompat.ExtensionCallbackInterface
  {
    @NotNull
    private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
    @NotNull
    private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
    @NotNull
    private final ReentrantLock lock;
    
    public DistinctElementCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface paramExtensionCallbackInterface)
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
  
  @Metadata
  public static final class DistinctSidecarElementCallback
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
    
    public DistinctSidecarElementCallback(@NotNull SidecarAdapter paramSidecarAdapter, @NotNull SidecarInterface.SidecarCallback paramSidecarCallback)
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
  
  @Metadata
  public static final class FirstAttachAdapter
    implements View.OnAttachStateChangeListener
  {
    @NotNull
    private final WeakReference<Activity> activityWeakReference;
    @NotNull
    private final SidecarCompat sidecarCompat;
    
    public FirstAttachAdapter(@NotNull SidecarCompat paramSidecarCompat, @NotNull Activity paramActivity)
    {
      sidecarCompat = paramSidecarCompat;
      activityWeakReference = new WeakReference(paramActivity);
    }
    
    public void onViewAttachedToWindow(@NotNull View paramView)
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      paramView.removeOnAttachStateChangeListener(this);
      paramView = (Activity)activityWeakReference.get();
      IBinder localIBinder = SidecarCompat.Companion.getActivityWindowToken$window_release(paramView);
      if (paramView == null) {
        return;
      }
      if (localIBinder == null) {
        return;
      }
      sidecarCompat.register(localIBinder, paramView);
    }
    
    public void onViewDetachedFromWindow(@NotNull View paramView)
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
    }
  }
  
  @Metadata
  public final class TranslatingCallback
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
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
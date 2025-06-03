package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import f2.i.a;
import i2.k;
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
import l2.f;
import rb.h;
import sb.s;
import v.c;

public final class SidecarCompat
  implements a
{
  public final SidecarInterface a;
  public final l2.a b;
  public final LinkedHashMap c;
  public final LinkedHashMap d;
  public b e;
  
  public SidecarCompat(Context paramContext)
  {
    a = paramContext;
    b = locala;
    c = new LinkedHashMap();
    d = new LinkedHashMap();
  }
  
  public final void a(Activity paramActivity)
  {
    Object localObject = a.a(paramActivity);
    if (localObject != null)
    {
      i((IBinder)localObject, paramActivity);
    }
    else
    {
      localObject = new c(this, paramActivity);
      paramActivity.getWindow().getDecorView().addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject);
    }
  }
  
  public final void b(Activity paramActivity)
  {
    ec.i.e(paramActivity, "activity");
    IBinder localIBinder = a.a(paramActivity);
    if (localIBinder == null) {
      return;
    }
    Object localObject = a;
    if (localObject != null) {
      ((SidecarInterface)localObject).onWindowLayoutChangeListenerRemoved(localIBinder);
    }
    localObject = (d0.a)d.get(paramActivity);
    if (localObject != null)
    {
      if ((paramActivity instanceof c)) {
        ((c)paramActivity).removeOnConfigurationChangedListener((d0.a)localObject);
      }
      d.remove(paramActivity);
    }
    localObject = e;
    if (localObject != null) {
      ((b)localObject).b(paramActivity);
    }
    int i;
    if (c.size() == 1) {
      i = 1;
    } else {
      i = 0;
    }
    c.remove(localIBinder);
    if (i != 0)
    {
      paramActivity = a;
      if (paramActivity != null) {
        paramActivity.onDeviceStateListenersChanged(true);
      }
    }
  }
  
  public final void c(b.a parama)
  {
    e = new b(parama);
    parama = a;
    if (parama != null) {
      parama.setSidecarCallback((SidecarInterface.SidecarCallback)new DistinctElementSidecarCallback(b, (SidecarInterface.SidecarCallback)new TranslatingCallback()));
    }
  }
  
  public final SidecarInterface g()
  {
    return a;
  }
  
  public final k h(Activity paramActivity)
  {
    Object localObject = a.a(paramActivity);
    if (localObject == null) {
      return new k(s.a);
    }
    paramActivity = a;
    if (paramActivity != null) {
      paramActivity = paramActivity.getWindowLayoutInfo((IBinder)localObject);
    } else {
      paramActivity = null;
    }
    l2.a locala = b;
    localObject = a;
    if (localObject != null)
    {
      SidecarDeviceState localSidecarDeviceState = ((SidecarInterface)localObject).getDeviceState();
      localObject = localSidecarDeviceState;
      if (localSidecarDeviceState != null) {}
    }
    else
    {
      localObject = new SidecarDeviceState();
    }
    return locala.e(paramActivity, (SidecarDeviceState)localObject);
  }
  
  public final void i(IBinder paramIBinder, Activity paramActivity)
  {
    c.put(paramIBinder, paramActivity);
    SidecarInterface localSidecarInterface = a;
    if (localSidecarInterface != null) {
      localSidecarInterface.onWindowLayoutChangeListenerAdded(paramIBinder);
    }
    if (c.size() == 1)
    {
      paramIBinder = a;
      if (paramIBinder != null) {
        paramIBinder.onDeviceStateListenersChanged(false);
      }
    }
    paramIBinder = e;
    if (paramIBinder != null) {
      paramIBinder.a(paramActivity, h(paramActivity));
    }
    if ((d.get(paramActivity) == null) && ((paramActivity instanceof c)))
    {
      paramIBinder = new f(0, this, paramActivity);
      d.put(paramActivity, paramIBinder);
      ((c)paramActivity).addOnConfigurationChangedListener(paramIBinder);
    }
  }
  
  public final boolean j()
  {
    boolean bool = true;
    try
    {
      Object localObject1 = a;
      List localList = null;
      if (localObject1 != null)
      {
        localObject1 = localObject1.getClass();
        if (localObject1 != null)
        {
          localObject1 = ((Class)localObject1).getMethod("setSidecarCallback", new Class[] { SidecarInterface.SidecarCallback.class });
          break label43;
        }
      }
      localObject1 = null;
      label43:
      if (localObject1 != null) {
        localObject1 = ((Method)localObject1).getReturnType();
      } else {
        localObject1 = null;
      }
      label138:
      label200:
      Object localObject5;
      label265:
      Object localObject2;
      Object localObject4;
      if (ec.i.a(localObject1, Void.TYPE))
      {
        localObject1 = a;
        if (localObject1 != null) {
          ((SidecarInterface)localObject1).getDeviceState();
        }
        localObject1 = a;
        if (localObject1 != null) {
          ((SidecarInterface)localObject1).onDeviceStateListenersChanged(true);
        }
        localObject1 = a;
        if (localObject1 != null)
        {
          localObject1 = localObject1.getClass();
          if (localObject1 != null)
          {
            localObject1 = ((Class)localObject1).getMethod("getWindowLayoutInfo", new Class[] { IBinder.class });
            break label138;
          }
        }
        localObject1 = null;
        if (localObject1 != null) {
          localObject1 = ((Method)localObject1).getReturnType();
        } else {
          localObject1 = null;
        }
        if (ec.i.a(localObject1, SidecarWindowLayoutInfo.class))
        {
          localObject1 = a;
          if (localObject1 != null)
          {
            localObject1 = localObject1.getClass();
            if (localObject1 != null)
            {
              localObject1 = ((Class)localObject1).getMethod("onWindowLayoutChangeListenerAdded", new Class[] { IBinder.class });
              break label200;
            }
          }
          localObject1 = null;
          if (localObject1 != null) {
            localObject1 = ((Method)localObject1).getReturnType();
          } else {
            localObject1 = null;
          }
          if (ec.i.a(localObject1, Void.TYPE))
          {
            localObject1 = a;
            if (localObject1 != null)
            {
              localObject1 = localObject1.getClass();
              if (localObject1 != null)
              {
                localObject5 = ((Class)localObject1).getMethod("onWindowLayoutChangeListenerRemoved", new Class[] { IBinder.class });
                break label265;
              }
            }
            localObject5 = null;
            localObject1 = localList;
            if (localObject5 != null) {
              localObject1 = ((Method)localObject5).getReturnType();
            }
            if (ec.i.a(localObject1, Void.TYPE))
            {
              localObject5 = new androidx/window/sidecar/SidecarDeviceState;
              ((SidecarDeviceState)localObject5).<init>();
              try
              {
                posture = 3;
              }
              catch (NoSuchFieldError localNoSuchFieldError1)
              {
                SidecarDeviceState.class.getMethod("setPosture", new Class[] { Integer.TYPE }).invoke(localObject5, new Object[] { Integer.valueOf(3) });
                localObject2 = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(localObject5, new Object[0]);
                ec.i.c(localObject2, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer)localObject2).intValue() != 3) {
                  break label542;
                }
              }
              localObject2 = new androidx/window/sidecar/SidecarDisplayFeature;
              ((SidecarDisplayFeature)localObject2).<init>();
              localObject5 = ((SidecarDisplayFeature)localObject2).getRect();
              ec.i.d(localObject5, "displayFeature.rect");
              ((SidecarDisplayFeature)localObject2).setRect((Rect)localObject5);
              ((SidecarDisplayFeature)localObject2).getType();
              ((SidecarDisplayFeature)localObject2).setType(1);
              localObject5 = new androidx/window/sidecar/SidecarWindowLayoutInfo;
              ((SidecarWindowLayoutInfo)localObject5).<init>();
              try
              {
                localList = displayFeatures;
              }
              catch (NoSuchFieldError localNoSuchFieldError2)
              {
                localObject4 = new java/util/ArrayList;
                ((ArrayList)localObject4).<init>();
                ((List)localObject4).add(localObject2);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[] { List.class }).invoke(localObject5, new Object[] { localObject4 });
                localObject2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(localObject5, new Object[0]);
                ec.i.c(localObject2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!ec.i.a(localObject4, (List)localObject2)) {
                  break label529;
                }
              }
              return bool;
              label529:
              localObject2 = new java/lang/Exception;
              ((Exception)localObject2).<init>("Invalid display feature getter/setter");
              throw ((Throwable)localObject2);
              label542:
              localObject2 = new java/lang/Exception;
              ((Exception)localObject2).<init>("Invalid device posture getter/setter");
              throw ((Throwable)localObject2);
            }
            else
            {
              localObject4 = new java/lang/NoSuchMethodException;
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              ((StringBuilder)localObject5).append("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ");
              ((StringBuilder)localObject5).append(localObject2);
              ((NoSuchMethodException)localObject4).<init>(((StringBuilder)localObject5).toString());
              throw ((Throwable)localObject4);
            }
          }
          else
          {
            localObject5 = new java/lang/NoSuchMethodException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append("Illegal return type for 'onWindowLayoutChangeListenerAdded': ");
            ((StringBuilder)localObject4).append(localObject2);
            ((NoSuchMethodException)localObject5).<init>(((StringBuilder)localObject4).toString());
            throw ((Throwable)localObject5);
          }
        }
        else
        {
          localObject4 = new java/lang/NoSuchMethodException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          ((StringBuilder)localObject5).append("Illegal return type for 'getWindowLayoutInfo': ");
          ((StringBuilder)localObject5).append(localObject2);
          ((NoSuchMethodException)localObject4).<init>(((StringBuilder)localObject5).toString());
          throw ((Throwable)localObject4);
        }
      }
      else
      {
        localObject5 = new java/lang/NoSuchMethodException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append("Illegal return type for 'setSidecarCallback': ");
        ((StringBuilder)localObject4).append(localObject2);
        ((NoSuchMethodException)localObject5).<init>(((StringBuilder)localObject4).toString());
        throw ((Throwable)localObject5);
      }
    }
    finally
    {
      bool = false;
    }
    return bool;
  }
  
  public final class TranslatingCallback
    implements SidecarInterface.SidecarCallback
  {
    public void onDeviceStateChanged(SidecarDeviceState paramSidecarDeviceState)
    {
      ec.i.e(paramSidecarDeviceState, "newDeviceState");
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
      ec.i.e(paramIBinder, "windowToken");
      ec.i.e(paramSidecarWindowLayoutInfo, "newLayout");
      Activity localActivity = (Activity)SidecarCompat.f(a).get(paramIBinder);
      if (localActivity == null)
      {
        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        return;
      }
      l2.a locala = SidecarCompat.e(a);
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
  
  public static final class a
  {
    public static IBinder a(Activity paramActivity)
    {
      if (paramActivity != null)
      {
        paramActivity = paramActivity.getWindow();
        if (paramActivity != null)
        {
          paramActivity = paramActivity.getAttributes();
          if (paramActivity != null) {
            return token;
          }
        }
      }
      paramActivity = null;
      return paramActivity;
    }
    
    public static SidecarInterface b(Context paramContext)
    {
      ec.i.e(paramContext, "context");
      return SidecarProvider.getSidecarImpl(paramContext.getApplicationContext());
    }
    
    public static f2.i c()
    {
      try
      {
        localObject = SidecarProvider.getApiVersion();
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          f2.i locali = f2.i.f;
          localObject = i.a.a((String)localObject);
        }
      }
      catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
      {
        Object localObject;
        for (;;) {}
      }
      localObject = null;
      return (f2.i)localObject;
    }
  }
  
  public static final class b
    implements a.a
  {
    public final a.a a;
    public final ReentrantLock b;
    public final WeakHashMap<Activity, k> c;
    
    public b(b.a parama)
    {
      a = parama;
      b = new ReentrantLock();
      c = new WeakHashMap();
    }
    
    public final void a(Activity paramActivity, k paramk)
    {
      ec.i.e(paramActivity, "activity");
      ReentrantLock localReentrantLock = b;
      localReentrantLock.lock();
      try
      {
        boolean bool = ec.i.a(paramk, (k)c.get(paramActivity));
        if (bool) {
          return;
        }
        k localk = (k)c.put(paramActivity, paramk);
        localReentrantLock.unlock();
        a.a(paramActivity, paramk);
        return;
      }
      finally
      {
        localReentrantLock.unlock();
      }
    }
    
    public final void b(Activity paramActivity)
    {
      ec.i.e(paramActivity, "activity");
      ReentrantLock localReentrantLock = b;
      localReentrantLock.lock();
      try
      {
        c.put(paramActivity, null);
        paramActivity = h.a;
        return;
      }
      finally
      {
        localReentrantLock.unlock();
      }
    }
  }
  
  public static final class c
    implements View.OnAttachStateChangeListener
  {
    public final SidecarCompat a;
    public final WeakReference<Activity> b;
    
    public c(SidecarCompat paramSidecarCompat, Activity paramActivity)
    {
      a = paramSidecarCompat;
      b = new WeakReference(paramActivity);
    }
    
    public final void onViewAttachedToWindow(View paramView)
    {
      ec.i.e(paramView, "view");
      paramView.removeOnAttachStateChangeListener(this);
      Activity localActivity = (Activity)b.get();
      if (localActivity != null)
      {
        paramView = localActivity.getWindow();
        if (paramView != null)
        {
          paramView = paramView.getAttributes();
          if (paramView != null)
          {
            paramView = token;
            break label54;
          }
        }
      }
      paramView = null;
      label54:
      if (localActivity == null) {
        return;
      }
      if (paramView == null) {
        return;
      }
      a.i(paramView, localActivity);
    }
    
    public final void onViewDetachedFromWindow(View paramView)
    {
      ec.i.e(paramView, "view");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.SidecarCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
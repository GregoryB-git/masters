package io.flutter.embedding.engine;

import android.app.Service;
import b1.k;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding
  implements ServicePluginBinding
{
  private final HiddenLifecycleReference hiddenLifecycleReference;
  private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
  private final Service service;
  
  public FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding(Service paramService, k paramk)
  {
    service = paramService;
    if (paramk != null) {
      paramService = new HiddenLifecycleReference(paramk);
    } else {
      paramService = null;
    }
    hiddenLifecycleReference = paramService;
  }
  
  public void addOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener)
  {
    onModeChangeListeners.add(paramOnModeChangeListener);
  }
  
  public Object getLifecycle()
  {
    return hiddenLifecycleReference;
  }
  
  public Service getService()
  {
    return service;
  }
  
  public void onMoveToBackground()
  {
    Iterator localIterator = onModeChangeListeners.iterator();
    while (localIterator.hasNext()) {
      ((ServiceAware.OnModeChangeListener)localIterator.next()).onMoveToBackground();
    }
  }
  
  public void onMoveToForeground()
  {
    Iterator localIterator = onModeChangeListeners.iterator();
    while (localIterator.hasNext()) {
      ((ServiceAware.OnModeChangeListener)localIterator.next()).onMoveToForeground();
    }
  }
  
  public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener)
  {
    onModeChangeListeners.remove(paramOnModeChangeListener);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineServicePluginBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
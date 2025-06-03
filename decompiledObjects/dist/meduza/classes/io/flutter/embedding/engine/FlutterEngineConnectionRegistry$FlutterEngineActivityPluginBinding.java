package io.flutter.embedding.engine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b1.k;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import io.flutter.plugin.common.PluginRegistry.NewIntentListener;
import io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener;
import io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener;
import io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding
  implements ActivityPluginBinding
{
  private final Activity activity;
  private final HiddenLifecycleReference hiddenLifecycleReference;
  private final Set<PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
  private final Set<PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
  private final Set<PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
  private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();
  private final Set<PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();
  private final Set<PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new HashSet();
  
  public FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding(Activity paramActivity, k paramk)
  {
    activity = paramActivity;
    hiddenLifecycleReference = new HiddenLifecycleReference(paramk);
  }
  
  public void addActivityResultListener(PluginRegistry.ActivityResultListener paramActivityResultListener)
  {
    onActivityResultListeners.add(paramActivityResultListener);
  }
  
  public void addOnNewIntentListener(PluginRegistry.NewIntentListener paramNewIntentListener)
  {
    onNewIntentListeners.add(paramNewIntentListener);
  }
  
  public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener paramOnSaveInstanceStateListener)
  {
    onSaveInstanceStateListeners.add(paramOnSaveInstanceStateListener);
  }
  
  public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener paramUserLeaveHintListener)
  {
    onUserLeaveHintListeners.add(paramUserLeaveHintListener);
  }
  
  public void addOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener paramWindowFocusChangedListener)
  {
    onWindowFocusChangedListeners.add(paramWindowFocusChangedListener);
  }
  
  public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener paramRequestPermissionsResultListener)
  {
    onRequestPermissionsResultListeners.add(paramRequestPermissionsResultListener);
  }
  
  public Activity getActivity()
  {
    return activity;
  }
  
  public Object getLifecycle()
  {
    return hiddenLifecycleReference;
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Iterator localIterator = new HashSet(onActivityResultListeners).iterator();
    for (boolean bool = false;; bool = true)
    {
      if (!localIterator.hasNext()) {
        break label61;
      }
      if ((!((PluginRegistry.ActivityResultListener)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent)) && (!bool)) {
        break;
      }
    }
    label61:
    return bool;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    Iterator localIterator = onNewIntentListeners.iterator();
    while (localIterator.hasNext()) {
      ((PluginRegistry.NewIntentListener)localIterator.next()).onNewIntent(paramIntent);
    }
  }
  
  public boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Iterator localIterator = onRequestPermissionsResultListeners.iterator();
    for (boolean bool = false;; bool = true)
    {
      if (!localIterator.hasNext()) {
        break label56;
      }
      if ((!((PluginRegistry.RequestPermissionsResultListener)localIterator.next()).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt)) && (!bool)) {
        break;
      }
    }
    label56:
    return bool;
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    Iterator localIterator = onSaveInstanceStateListeners.iterator();
    while (localIterator.hasNext()) {
      ((ActivityPluginBinding.OnSaveInstanceStateListener)localIterator.next()).onRestoreInstanceState(paramBundle);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Iterator localIterator = onSaveInstanceStateListeners.iterator();
    while (localIterator.hasNext()) {
      ((ActivityPluginBinding.OnSaveInstanceStateListener)localIterator.next()).onSaveInstanceState(paramBundle);
    }
  }
  
  public void onUserLeaveHint()
  {
    Iterator localIterator = onUserLeaveHintListeners.iterator();
    while (localIterator.hasNext()) {
      ((PluginRegistry.UserLeaveHintListener)localIterator.next()).onUserLeaveHint();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    Iterator localIterator = onWindowFocusChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((PluginRegistry.WindowFocusChangedListener)localIterator.next()).onWindowFocusChanged(paramBoolean);
    }
  }
  
  public void removeActivityResultListener(PluginRegistry.ActivityResultListener paramActivityResultListener)
  {
    onActivityResultListeners.remove(paramActivityResultListener);
  }
  
  public void removeOnNewIntentListener(PluginRegistry.NewIntentListener paramNewIntentListener)
  {
    onNewIntentListeners.remove(paramNewIntentListener);
  }
  
  public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener paramOnSaveInstanceStateListener)
  {
    onSaveInstanceStateListeners.remove(paramOnSaveInstanceStateListener);
  }
  
  public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener paramUserLeaveHintListener)
  {
    onUserLeaveHintListeners.remove(paramUserLeaveHintListener);
  }
  
  public void removeOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener paramWindowFocusChangedListener)
  {
    onWindowFocusChangedListeners.remove(paramWindowFocusChangedListener);
  }
  
  public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener paramRequestPermissionsResultListener)
  {
    onRequestPermissionsResultListeners.remove(paramRequestPermissionsResultListener);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineActivityPluginBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
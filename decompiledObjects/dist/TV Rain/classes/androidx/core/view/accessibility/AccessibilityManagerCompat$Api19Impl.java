package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class AccessibilityManagerCompat$Api19Impl
{
  @DoNotInline
  public static boolean addTouchExplorationStateChangeListenerWrapper(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    return paramAccessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(paramTouchExplorationStateChangeListener));
  }
  
  @DoNotInline
  public static boolean removeTouchExplorationStateChangeListenerWrapper(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    return paramAccessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(paramTouchExplorationStateChangeListener));
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
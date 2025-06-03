package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

class AccessibilityBridge$4
  implements AccessibilityManager.TouchExplorationStateChangeListener
{
  public void onTouchExplorationStateChanged(boolean paramBoolean)
  {
    if (AccessibilityBridge.access$400(this$0)) {
      return;
    }
    if (!paramBoolean)
    {
      AccessibilityBridge.access$700(this$0, false);
      AccessibilityBridge.access$1300(this$0);
    }
    if (AccessibilityBridge.access$800(this$0) != null) {
      AccessibilityBridge.access$800(this$0).onAccessibilityChanged(val$accessibilityManager.isEnabled(), paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
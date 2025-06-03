package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;

class AccessibilityBridge$2
  implements AccessibilityManager.AccessibilityStateChangeListener
{
  public AccessibilityBridge$2(AccessibilityBridge paramAccessibilityBridge) {}
  
  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
    if (AccessibilityBridge.access$400(this$0)) {
      return;
    }
    AccessibilityBridge localAccessibilityBridge = this$0;
    if (paramBoolean)
    {
      AccessibilityBridge.access$600(localAccessibilityBridge).setAccessibilityMessageHandler(AccessibilityBridge.access$500(this$0));
      AccessibilityBridge.access$600(this$0).onAndroidAccessibilityEnabled();
    }
    else
    {
      AccessibilityBridge.access$700(localAccessibilityBridge, false);
      AccessibilityBridge.access$600(this$0).setAccessibilityMessageHandler(null);
      AccessibilityBridge.access$600(this$0).onAndroidAccessibilityDisabled();
    }
    if (AccessibilityBridge.access$800(this$0) != null) {
      AccessibilityBridge.access$800(this$0).onAccessibilityChanged(paramBoolean, AccessibilityBridge.access$900(this$0).isTouchExplorationEnabled());
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
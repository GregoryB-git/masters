package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.AccessibilityBridge;

class AccessibilityEventsDelegate
{
  private AccessibilityBridge accessibilityBridge;
  
  public boolean onAccessibilityHoverEvent(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    AccessibilityBridge localAccessibilityBridge = accessibilityBridge;
    if (localAccessibilityBridge == null) {
      return false;
    }
    return localAccessibilityBridge.onAccessibilityHoverEvent(paramMotionEvent, paramBoolean);
  }
  
  public boolean requestSendAccessibilityEvent(View paramView1, View paramView2, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityBridge localAccessibilityBridge = accessibilityBridge;
    if (localAccessibilityBridge == null) {
      return false;
    }
    return localAccessibilityBridge.externalViewRequestSendAccessibilityEvent(paramView1, paramView2, paramAccessibilityEvent);
  }
  
  public void setAccessibilityBridge(AccessibilityBridge paramAccessibilityBridge)
  {
    accessibilityBridge = paramAccessibilityBridge;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.AccessibilityEventsDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
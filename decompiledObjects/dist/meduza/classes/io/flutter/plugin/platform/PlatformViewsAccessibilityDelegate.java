package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.view.AccessibilityBridge;

public abstract interface PlatformViewsAccessibilityDelegate
{
  public abstract void attachAccessibilityBridge(AccessibilityBridge paramAccessibilityBridge);
  
  public abstract void detachAccessibilityBridge();
  
  public abstract View getPlatformViewById(int paramInt);
  
  public abstract boolean usesVirtualDisplay(int paramInt);
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
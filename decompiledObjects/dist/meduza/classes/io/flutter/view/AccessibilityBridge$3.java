package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.Global;

class AccessibilityBridge$3
  extends ContentObserver
{
  public AccessibilityBridge$3(AccessibilityBridge paramAccessibilityBridge, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    if (AccessibilityBridge.access$400(this$0)) {
      return;
    }
    int i;
    if (Settings.Global.getFloat(AccessibilityBridge.access$1000(this$0), "transition_animation_scale", 1.0F) == 0.0F) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      AccessibilityBridge.access$1176(this$0, DISABLE_ANIMATIONSvalue);
    } else {
      AccessibilityBridge.access$1172(this$0, DISABLE_ANIMATIONSvalue);
    }
    AccessibilityBridge.access$1200(this$0);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
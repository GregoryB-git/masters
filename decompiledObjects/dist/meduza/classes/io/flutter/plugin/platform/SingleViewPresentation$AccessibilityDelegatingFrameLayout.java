package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

class SingleViewPresentation$AccessibilityDelegatingFrameLayout
  extends FrameLayout
{
  private final AccessibilityEventsDelegate accessibilityEventsDelegate;
  private final View embeddedView;
  
  public SingleViewPresentation$AccessibilityDelegatingFrameLayout(Context paramContext, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, View paramView)
  {
    super(paramContext);
    accessibilityEventsDelegate = paramAccessibilityEventsDelegate;
    embeddedView = paramView;
  }
  
  public boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return accessibilityEventsDelegate.requestSendAccessibilityEvent(embeddedView, paramView, paramAccessibilityEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation.AccessibilityDelegatingFrameLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
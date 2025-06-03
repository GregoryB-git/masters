package io.flutter.plugin.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.FlutterImageView.SurfaceKind;

public class PlatformOverlayView
  extends FlutterImageView
{
  private AccessibilityEventsDelegate accessibilityDelegate;
  
  public PlatformOverlayView(Context paramContext)
  {
    this(paramContext, 1, 1, null);
  }
  
  public PlatformOverlayView(Context paramContext, int paramInt1, int paramInt2, AccessibilityEventsDelegate paramAccessibilityEventsDelegate)
  {
    super(paramContext, paramInt1, paramInt2, FlutterImageView.SurfaceKind.overlay);
    accessibilityDelegate = paramAccessibilityEventsDelegate;
  }
  
  public PlatformOverlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, 1, 1, null);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    AccessibilityEventsDelegate localAccessibilityEventsDelegate = accessibilityDelegate;
    if ((localAccessibilityEventsDelegate != null) && (localAccessibilityEventsDelegate.onAccessibilityHoverEvent(paramMotionEvent, true))) {
      return true;
    }
    return super.onHoverEvent(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformOverlayView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
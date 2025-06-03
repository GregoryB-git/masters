package io.flutter.embedding.engine.renderer;

import java.util.ArrayList;
import java.util.List;

public final class FlutterRenderer$ViewportMetrics
{
  public static final int unsetValue = -1;
  public float devicePixelRatio = 1.0F;
  private final List<FlutterRenderer.DisplayFeature> displayCutouts = new ArrayList();
  private final List<FlutterRenderer.DisplayFeature> displayFeatures = new ArrayList();
  public int height = 0;
  public int physicalTouchSlop = -1;
  public int systemGestureInsetBottom = 0;
  public int systemGestureInsetLeft = 0;
  public int systemGestureInsetRight = 0;
  public int systemGestureInsetTop = 0;
  public int viewInsetBottom = 0;
  public int viewInsetLeft = 0;
  public int viewInsetRight = 0;
  public int viewInsetTop = 0;
  public int viewPaddingBottom = 0;
  public int viewPaddingLeft = 0;
  public int viewPaddingRight = 0;
  public int viewPaddingTop = 0;
  public int width = 0;
  
  public List<FlutterRenderer.DisplayFeature> getDisplayCutouts()
  {
    return displayCutouts;
  }
  
  public List<FlutterRenderer.DisplayFeature> getDisplayFeatures()
  {
    return displayFeatures;
  }
  
  public void setDisplayCutouts(List<FlutterRenderer.DisplayFeature> paramList)
  {
    displayCutouts.clear();
    displayCutouts.addAll(paramList);
  }
  
  public void setDisplayFeatures(List<FlutterRenderer.DisplayFeature> paramList)
  {
    displayFeatures.clear();
    displayFeatures.addAll(paramList);
  }
  
  public boolean validate()
  {
    boolean bool;
    if ((width > 0) && (height > 0) && (devicePixelRatio > 0.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
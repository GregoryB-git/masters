package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;

public final class FlutterRenderer$DisplayFeature
{
  public final Rect bounds;
  public final FlutterRenderer.DisplayFeatureState state;
  public final FlutterRenderer.DisplayFeatureType type;
  
  public FlutterRenderer$DisplayFeature(Rect paramRect, FlutterRenderer.DisplayFeatureType paramDisplayFeatureType, FlutterRenderer.DisplayFeatureState paramDisplayFeatureState)
  {
    bounds = paramRect;
    type = paramDisplayFeatureType;
    state = paramDisplayFeatureState;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
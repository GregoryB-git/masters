package io.flutter.embedding.engine.renderer;

public enum FlutterRenderer$DisplayFeatureType
{
  public final int encodedValue;
  
  static
  {
    FOLD = new DisplayFeatureType("FOLD", 1, 1);
    HINGE = new DisplayFeatureType("HINGE", 2, 2);
    CUTOUT = new DisplayFeatureType("CUTOUT", 3, 3);
  }
  
  private FlutterRenderer$DisplayFeatureType(int paramInt)
  {
    encodedValue = paramInt;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
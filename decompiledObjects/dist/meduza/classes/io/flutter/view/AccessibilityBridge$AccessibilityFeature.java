package io.flutter.view;

 enum AccessibilityBridge$AccessibilityFeature
{
  public final int value;
  
  static
  {
    DISABLE_ANIMATIONS = new AccessibilityFeature("DISABLE_ANIMATIONS", 2, 4);
    BOLD_TEXT = new AccessibilityFeature("BOLD_TEXT", 3, 8);
    REDUCE_MOTION = new AccessibilityFeature("REDUCE_MOTION", 4, 16);
    HIGH_CONTRAST = new AccessibilityFeature("HIGH_CONTRAST", 5, 32);
    ON_OFF_SWITCH_LABELS = new AccessibilityFeature("ON_OFF_SWITCH_LABELS", 6, 64);
  }
  
  private AccessibilityBridge$AccessibilityFeature(int paramInt)
  {
    value = paramInt;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.AccessibilityFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
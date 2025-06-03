package io.flutter.view;

 enum AccessibilityBridge$TextDirection
{
  static
  {
    LTR = new TextDirection("LTR", 1);
    RTL = new TextDirection("RTL", 2);
  }
  
  private AccessibilityBridge$TextDirection() {}
  
  public static TextDirection fromInt(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return UNKNOWN;
      }
      return LTR;
    }
    return RTL;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.TextDirection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
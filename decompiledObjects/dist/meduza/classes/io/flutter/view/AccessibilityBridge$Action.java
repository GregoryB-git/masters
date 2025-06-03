package io.flutter.view;

public enum AccessibilityBridge$Action
{
  public final int value;
  
  static
  {
    LONG_PRESS = new Action("LONG_PRESS", 1, 2);
    SCROLL_LEFT = new Action("SCROLL_LEFT", 2, 4);
    SCROLL_RIGHT = new Action("SCROLL_RIGHT", 3, 8);
    SCROLL_UP = new Action("SCROLL_UP", 4, 16);
    SCROLL_DOWN = new Action("SCROLL_DOWN", 5, 32);
    INCREASE = new Action("INCREASE", 6, 64);
    DECREASE = new Action("DECREASE", 7, 128);
    SHOW_ON_SCREEN = new Action("SHOW_ON_SCREEN", 8, 256);
    MOVE_CURSOR_FORWARD_BY_CHARACTER = new Action("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512);
    MOVE_CURSOR_BACKWARD_BY_CHARACTER = new Action("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024);
    SET_SELECTION = new Action("SET_SELECTION", 11, 2048);
    COPY = new Action("COPY", 12, 4096);
    CUT = new Action("CUT", 13, 8192);
    PASTE = new Action("PASTE", 14, 16384);
    DID_GAIN_ACCESSIBILITY_FOCUS = new Action("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768);
    DID_LOSE_ACCESSIBILITY_FOCUS = new Action("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536);
    CUSTOM_ACTION = new Action("CUSTOM_ACTION", 17, 131072);
    DISMISS = new Action("DISMISS", 18, 262144);
    MOVE_CURSOR_FORWARD_BY_WORD = new Action("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288);
    MOVE_CURSOR_BACKWARD_BY_WORD = new Action("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576);
    SET_TEXT = new Action("SET_TEXT", 21, 2097152);
    FOCUS = new Action("FOCUS", 22, 4194304);
    SCROLL_TO_OFFSET = new Action("SCROLL_TO_OFFSET", 23, 8388608);
  }
  
  private AccessibilityBridge$Action(int paramInt)
  {
    value = paramInt;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.Action
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
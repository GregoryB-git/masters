package io.flutter.view;

 enum AccessibilityBridge$Flag
{
  public final int value;
  
  static
  {
    IS_BUTTON = new Flag("IS_BUTTON", 3, 8);
    IS_TEXT_FIELD = new Flag("IS_TEXT_FIELD", 4, 16);
    IS_FOCUSED = new Flag("IS_FOCUSED", 5, 32);
    HAS_ENABLED_STATE = new Flag("HAS_ENABLED_STATE", 6, 64);
    IS_ENABLED = new Flag("IS_ENABLED", 7, 128);
    IS_IN_MUTUALLY_EXCLUSIVE_GROUP = new Flag("IS_IN_MUTUALLY_EXCLUSIVE_GROUP", 8, 256);
    IS_HEADER = new Flag("IS_HEADER", 9, 512);
    IS_OBSCURED = new Flag("IS_OBSCURED", 10, 1024);
    SCOPES_ROUTE = new Flag("SCOPES_ROUTE", 11, 2048);
    NAMES_ROUTE = new Flag("NAMES_ROUTE", 12, 4096);
    IS_HIDDEN = new Flag("IS_HIDDEN", 13, 8192);
    IS_IMAGE = new Flag("IS_IMAGE", 14, 16384);
    IS_LIVE_REGION = new Flag("IS_LIVE_REGION", 15, 32768);
    HAS_TOGGLED_STATE = new Flag("HAS_TOGGLED_STATE", 16, 65536);
    IS_TOGGLED = new Flag("IS_TOGGLED", 17, 131072);
    HAS_IMPLICIT_SCROLLING = new Flag("HAS_IMPLICIT_SCROLLING", 18, 262144);
    IS_MULTILINE = new Flag("IS_MULTILINE", 19, 524288);
    IS_READ_ONLY = new Flag("IS_READ_ONLY", 20, 1048576);
    IS_FOCUSABLE = new Flag("IS_FOCUSABLE", 21, 2097152);
    IS_LINK = new Flag("IS_LINK", 22, 4194304);
    IS_SLIDER = new Flag("IS_SLIDER", 23, 8388608);
    IS_KEYBOARD_KEY = new Flag("IS_KEYBOARD_KEY", 24, 16777216);
    IS_CHECK_STATE_MIXED = new Flag("IS_CHECK_STATE_MIXED", 25, 33554432);
    HAS_EXPANDED_STATE = new Flag("HAS_EXPANDED_STATE", 26, 67108864);
    IS_EXPANDED = new Flag("IS_EXPANDED", 27, 134217728);
    HAS_SELECTED_STATE = new Flag("HAS_SELECTED_STATE", 28, 268435456);
  }
  
  private AccessibilityBridge$Flag(int paramInt)
  {
    value = paramInt;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.Flag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
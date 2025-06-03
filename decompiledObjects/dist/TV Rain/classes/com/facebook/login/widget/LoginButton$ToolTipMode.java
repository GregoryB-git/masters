package com.facebook.login.widget;

public enum LoginButton$ToolTipMode
{
  public static ToolTipMode DEFAULT;
  private int intValue;
  private String stringValue;
  
  static
  {
    ToolTipMode localToolTipMode1 = new ToolTipMode("AUTOMATIC", 0, "automatic", 0);
    AUTOMATIC = localToolTipMode1;
    ToolTipMode localToolTipMode2 = new ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
    DISPLAY_ALWAYS = localToolTipMode2;
    ToolTipMode localToolTipMode3 = new ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
    NEVER_DISPLAY = localToolTipMode3;
    $VALUES = new ToolTipMode[] { localToolTipMode1, localToolTipMode2, localToolTipMode3 };
    DEFAULT = localToolTipMode1;
  }
  
  private LoginButton$ToolTipMode(String paramString, int paramInt)
  {
    stringValue = paramString;
    intValue = paramInt;
  }
  
  public static ToolTipMode fromInt(int paramInt)
  {
    for (ToolTipMode localToolTipMode : ) {
      if (localToolTipMode.getValue() == paramInt) {
        return localToolTipMode;
      }
    }
    return null;
  }
  
  public int getValue()
  {
    return intValue;
  }
  
  public String toString()
  {
    return stringValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton.ToolTipMode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.share.widget;

@Deprecated
public enum LikeView$Style
{
  public static Style DEFAULT;
  private int intValue;
  private String stringValue;
  
  static
  {
    Style localStyle1 = new Style("STANDARD", 0, "standard", 0);
    STANDARD = localStyle1;
    Style localStyle2 = new Style("BUTTON", 1, "button", 1);
    BUTTON = localStyle2;
    Style localStyle3 = new Style("BOX_COUNT", 2, "box_count", 2);
    BOX_COUNT = localStyle3;
    $VALUES = new Style[] { localStyle1, localStyle2, localStyle3 };
    DEFAULT = localStyle1;
  }
  
  private LikeView$Style(String paramString, int paramInt)
  {
    stringValue = paramString;
    intValue = paramInt;
  }
  
  public static Style fromInt(int paramInt)
  {
    for (Style localStyle : ) {
      if (localStyle.getValue() == paramInt) {
        return localStyle;
      }
    }
    return null;
  }
  
  private int getValue()
  {
    return intValue;
  }
  
  public String toString()
  {
    return stringValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.LikeView.Style
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
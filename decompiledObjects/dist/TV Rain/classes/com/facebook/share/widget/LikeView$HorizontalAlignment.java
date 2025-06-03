package com.facebook.share.widget;

@Deprecated
public enum LikeView$HorizontalAlignment
{
  public static HorizontalAlignment DEFAULT;
  private int intValue;
  private String stringValue;
  
  static
  {
    HorizontalAlignment localHorizontalAlignment1 = new HorizontalAlignment("CENTER", 0, "center", 0);
    CENTER = localHorizontalAlignment1;
    HorizontalAlignment localHorizontalAlignment2 = new HorizontalAlignment("LEFT", 1, "left", 1);
    LEFT = localHorizontalAlignment2;
    HorizontalAlignment localHorizontalAlignment3 = new HorizontalAlignment("RIGHT", 2, "right", 2);
    RIGHT = localHorizontalAlignment3;
    $VALUES = new HorizontalAlignment[] { localHorizontalAlignment1, localHorizontalAlignment2, localHorizontalAlignment3 };
    DEFAULT = localHorizontalAlignment1;
  }
  
  private LikeView$HorizontalAlignment(String paramString, int paramInt)
  {
    stringValue = paramString;
    intValue = paramInt;
  }
  
  public static HorizontalAlignment fromInt(int paramInt)
  {
    for (HorizontalAlignment localHorizontalAlignment : ) {
      if (localHorizontalAlignment.getValue() == paramInt) {
        return localHorizontalAlignment;
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
 * Qualified Name:     com.facebook.share.widget.LikeView.HorizontalAlignment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
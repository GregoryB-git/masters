package com.facebook.share.widget;

@Deprecated
public enum LikeView$AuxiliaryViewPosition
{
  public static AuxiliaryViewPosition DEFAULT;
  private int intValue;
  private String stringValue;
  
  static
  {
    AuxiliaryViewPosition localAuxiliaryViewPosition1 = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
    BOTTOM = localAuxiliaryViewPosition1;
    AuxiliaryViewPosition localAuxiliaryViewPosition2 = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
    INLINE = localAuxiliaryViewPosition2;
    AuxiliaryViewPosition localAuxiliaryViewPosition3 = new AuxiliaryViewPosition("TOP", 2, "top", 2);
    TOP = localAuxiliaryViewPosition3;
    $VALUES = new AuxiliaryViewPosition[] { localAuxiliaryViewPosition1, localAuxiliaryViewPosition2, localAuxiliaryViewPosition3 };
    DEFAULT = localAuxiliaryViewPosition1;
  }
  
  private LikeView$AuxiliaryViewPosition(String paramString, int paramInt)
  {
    stringValue = paramString;
    intValue = paramInt;
  }
  
  public static AuxiliaryViewPosition fromInt(int paramInt)
  {
    for (AuxiliaryViewPosition localAuxiliaryViewPosition : ) {
      if (localAuxiliaryViewPosition.getValue() == paramInt) {
        return localAuxiliaryViewPosition;
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
 * Qualified Name:     com.facebook.share.widget.LikeView.AuxiliaryViewPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
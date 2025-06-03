package com.facebook.share.widget;

@Deprecated
public enum LikeView$ObjectType
{
  public static ObjectType DEFAULT;
  private int intValue;
  private String stringValue;
  
  static
  {
    ObjectType localObjectType1 = new ObjectType("UNKNOWN", 0, "unknown", 0);
    UNKNOWN = localObjectType1;
    ObjectType localObjectType2 = new ObjectType("OPEN_GRAPH", 1, "open_graph", 1);
    OPEN_GRAPH = localObjectType2;
    ObjectType localObjectType3 = new ObjectType("PAGE", 2, "page", 2);
    PAGE = localObjectType3;
    $VALUES = new ObjectType[] { localObjectType1, localObjectType2, localObjectType3 };
    DEFAULT = localObjectType1;
  }
  
  private LikeView$ObjectType(String paramString, int paramInt)
  {
    stringValue = paramString;
    intValue = paramInt;
  }
  
  public static ObjectType fromInt(int paramInt)
  {
    for (ObjectType localObjectType : ) {
      if (localObjectType.getValue() == paramInt) {
        return localObjectType;
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
 * Qualified Name:     com.facebook.share.widget.LikeView.ObjectType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.appevents.codeless.internal;

public enum PathComponent$MatchBitmaskType
{
  private final int value;
  
  static
  {
    MatchBitmaskType localMatchBitmaskType1 = new MatchBitmaskType("ID", 0, 1);
    ID = localMatchBitmaskType1;
    MatchBitmaskType localMatchBitmaskType2 = new MatchBitmaskType("TEXT", 1, 2);
    TEXT = localMatchBitmaskType2;
    MatchBitmaskType localMatchBitmaskType3 = new MatchBitmaskType("TAG", 2, 4);
    TAG = localMatchBitmaskType3;
    MatchBitmaskType localMatchBitmaskType4 = new MatchBitmaskType("DESCRIPTION", 3, 8);
    DESCRIPTION = localMatchBitmaskType4;
    MatchBitmaskType localMatchBitmaskType5 = new MatchBitmaskType("HINT", 4, 16);
    HINT = localMatchBitmaskType5;
    $VALUES = new MatchBitmaskType[] { localMatchBitmaskType1, localMatchBitmaskType2, localMatchBitmaskType3, localMatchBitmaskType4, localMatchBitmaskType5 };
  }
  
  private PathComponent$MatchBitmaskType(int paramInt)
  {
    value = paramInt;
  }
  
  public int getValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
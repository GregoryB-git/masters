package com.facebook.share.model;

public enum GameRequestContent$ActionType
{
  static
  {
    ActionType localActionType1 = new ActionType("SEND", 0);
    SEND = localActionType1;
    ActionType localActionType2 = new ActionType("ASKFOR", 1);
    ASKFOR = localActionType2;
    ActionType localActionType3 = new ActionType("TURN", 2);
    TURN = localActionType3;
    $VALUES = new ActionType[] { localActionType1, localActionType2, localActionType3 };
  }
  
  private GameRequestContent$ActionType() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.model.GameRequestContent.ActionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
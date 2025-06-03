package com.facebook.common.util;

import com.facebook.infer.annotation.Functional;

public enum TriState
{
  static
  {
    TriState localTriState1 = new TriState("YES", 0);
    YES = localTriState1;
    TriState localTriState2 = new TriState("NO", 1);
    NO = localTriState2;
    TriState localTriState3 = new TriState("UNSET", 2);
    UNSET = localTriState3;
    $VALUES = new TriState[] { localTriState1, localTriState2, localTriState3 };
  }
  
  private TriState() {}
  
  @Functional
  public static TriState fromDbValue(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return UNSET;
      }
      return NO;
    }
    return YES;
  }
  
  @Functional
  public static TriState valueOf(Boolean paramBoolean)
  {
    if (paramBoolean != null) {
      paramBoolean = valueOf(paramBoolean.booleanValue());
    } else {
      paramBoolean = UNSET;
    }
    return paramBoolean;
  }
  
  @Functional
  public static TriState valueOf(boolean paramBoolean)
  {
    TriState localTriState;
    if (paramBoolean) {
      localTriState = YES;
    } else {
      localTriState = NO;
    }
    return localTriState;
  }
  
  @Functional
  public boolean asBoolean()
  {
    int i = 1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unrecognized TriState value: ");
          localStringBuilder.append(this);
          throw new IllegalStateException(localStringBuilder.toString());
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
      }
      return false;
    }
    return true;
  }
  
  @Functional
  public boolean asBoolean(boolean paramBoolean)
  {
    int i = 1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return paramBoolean;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unrecognized TriState value: ");
        localStringBuilder.append(this);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      return false;
    }
    return true;
  }
  
  @Functional
  public Boolean asBooleanObject()
  {
    int i = 1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return null;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unrecognized TriState value: ");
        localStringBuilder.append(this);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }
  
  @Functional
  public int getDbValue()
  {
    int i = 1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
    int j = 1;
    if (i != 1)
    {
      j = 2;
      if (i != 2) {
        return 3;
      }
    }
    return j;
  }
  
  @Functional
  public boolean isSet()
  {
    boolean bool;
    if (this != UNSET) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.TriState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
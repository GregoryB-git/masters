package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;

public enum UserScriptInjectionTime
{
  private final int value;
  
  static
  {
    AT_DOCUMENT_END = new UserScriptInjectionTime("AT_DOCUMENT_END", 1, 1);
  }
  
  private UserScriptInjectionTime(int paramInt)
  {
    value = paramInt;
  }
  
  public static UserScriptInjectionTime fromValue(int paramInt)
  {
    for (UserScriptInjectionTime localUserScriptInjectionTime : ) {
      if (paramInt == localUserScriptInjectionTime.toValue()) {
        return localUserScriptInjectionTime;
      }
    }
    throw new IllegalArgumentException(f.h("No enum constant: ", paramInt));
  }
  
  public boolean equalsValue(int paramInt)
  {
    boolean bool;
    if (value == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int toValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
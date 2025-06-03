package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;

public enum NavigationActionPolicy
{
  private final int value;
  
  static
  {
    ALLOW = new NavigationActionPolicy("ALLOW", 1, 1);
  }
  
  private NavigationActionPolicy(int paramInt)
  {
    value = paramInt;
  }
  
  public static NavigationActionPolicy fromValue(int paramInt)
  {
    for (NavigationActionPolicy localNavigationActionPolicy : ) {
      if (paramInt == value) {
        return localNavigationActionPolicy;
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
  
  public int rawValue()
  {
    return value;
  }
  
  public String toString()
  {
    return String.valueOf(value);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
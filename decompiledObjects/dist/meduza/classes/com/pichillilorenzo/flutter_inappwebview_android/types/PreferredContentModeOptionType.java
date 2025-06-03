package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;

public enum PreferredContentModeOptionType
{
  private final int value;
  
  static
  {
    MOBILE = new PreferredContentModeOptionType("MOBILE", 1, 1);
    DESKTOP = new PreferredContentModeOptionType("DESKTOP", 2, 2);
  }
  
  private PreferredContentModeOptionType(int paramInt)
  {
    value = paramInt;
  }
  
  public static PreferredContentModeOptionType fromValue(int paramInt)
  {
    for (PreferredContentModeOptionType localPreferredContentModeOptionType : ) {
      if (paramInt == localPreferredContentModeOptionType.toValue()) {
        return localPreferredContentModeOptionType;
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
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
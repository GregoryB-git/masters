package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

public enum GravityEnum
{
  private static final boolean HAS_RTL = true;
  
  static
  {
    GravityEnum localGravityEnum1 = new GravityEnum("START", 0);
    START = localGravityEnum1;
    GravityEnum localGravityEnum2 = new GravityEnum("CENTER", 1);
    CENTER = localGravityEnum2;
    GravityEnum localGravityEnum3 = new GravityEnum("END", 2);
    END = localGravityEnum3;
    $VALUES = new GravityEnum[] { localGravityEnum1, localGravityEnum2, localGravityEnum3 };
  }
  
  private GravityEnum() {}
  
  @SuppressLint({"RtlHardcoded"})
  public int getGravityInt()
  {
    int i = 1.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[ordinal()];
    int j = 3;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          if (HAS_RTL) {
            j = 8388613;
          } else {
            j = 5;
          }
          return j;
        }
        throw new IllegalStateException("Invalid gravity constant");
      }
      return 1;
    }
    if (HAS_RTL) {
      j = 8388611;
    }
    return j;
  }
  
  @TargetApi(17)
  public int getTextAlignment()
  {
    int i = 1.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[ordinal()];
    if (i != 2)
    {
      if (i != 3) {
        return 5;
      }
      return 6;
    }
    return 4;
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.GravityEnum
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
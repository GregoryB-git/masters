package com.google.android.exoplayer2.util;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RepeatModeUtil
{
  public static final int REPEAT_TOGGLE_MODE_ALL = 2;
  public static final int REPEAT_TOGGLE_MODE_NONE = 0;
  public static final int REPEAT_TOGGLE_MODE_ONE = 1;
  
  public static int getNextRepeatMode(int paramInt1, int paramInt2)
  {
    for (int i = 1; i <= 2; i++)
    {
      int j = (paramInt1 + i) % 3;
      if (isRepeatModeEnabled(j, paramInt2)) {
        return j;
      }
    }
    return paramInt1;
  }
  
  public static boolean isRepeatModeEnabled(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2) {
          return false;
        }
        if ((paramInt2 & 0x2) != 0) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
        return bool3;
      }
      if ((paramInt2 & 0x1) != 0) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface RepeatToggleModes {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.RepeatModeUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
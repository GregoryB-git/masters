package androidx.core.view;

import a;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class WindowInsetsCompat$Type
{
  public static final int CAPTION_BAR = 4;
  public static final int DISPLAY_CUTOUT = 128;
  public static final int FIRST = 1;
  public static final int IME = 8;
  public static final int LAST = 256;
  public static final int MANDATORY_SYSTEM_GESTURES = 32;
  public static final int NAVIGATION_BARS = 2;
  public static final int SIZE = 9;
  public static final int STATUS_BARS = 1;
  public static final int SYSTEM_GESTURES = 16;
  public static final int TAPPABLE_ELEMENT = 64;
  public static final int WINDOW_DECOR = 256;
  
  @SuppressLint({"WrongConstant"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static int all()
  {
    return -1;
  }
  
  public static int captionBar()
  {
    return 4;
  }
  
  public static int displayCutout()
  {
    return 128;
  }
  
  public static int ime()
  {
    return 8;
  }
  
  public static int indexOf(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 4)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32)
              {
                if (paramInt != 64)
                {
                  if (paramInt != 128)
                  {
                    if (paramInt == 256) {
                      return 8;
                    }
                    throw new IllegalArgumentException(a.f("type needs to be >= FIRST and <= LAST, type=", paramInt));
                  }
                  return 7;
                }
                return 6;
              }
              return 5;
            }
            return 4;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }
  
  public static int mandatorySystemGestures()
  {
    return 32;
  }
  
  public static int navigationBars()
  {
    return 2;
  }
  
  public static int statusBars()
  {
    return 1;
  }
  
  public static int systemBars()
  {
    return 7;
  }
  
  public static int systemGestures()
  {
    return 16;
  }
  
  public static int tappableElement()
  {
    return 64;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface InsetsType {}
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
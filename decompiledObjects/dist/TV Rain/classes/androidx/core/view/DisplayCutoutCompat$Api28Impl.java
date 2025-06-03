package androidx.core.view;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(28)
class DisplayCutoutCompat$Api28Impl
{
  @DoNotInline
  public static DisplayCutout createDisplayCutout(Rect paramRect, List<Rect> paramList)
  {
    return new DisplayCutout(paramRect, paramList);
  }
  
  @DoNotInline
  public static List<Rect> getBoundingRects(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getBoundingRects();
  }
  
  @DoNotInline
  public static int getSafeInsetBottom(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetBottom();
  }
  
  @DoNotInline
  public static int getSafeInsetLeft(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetLeft();
  }
  
  @DoNotInline
  public static int getSafeInsetRight(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetRight();
  }
  
  @DoNotInline
  public static int getSafeInsetTop(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetTop();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
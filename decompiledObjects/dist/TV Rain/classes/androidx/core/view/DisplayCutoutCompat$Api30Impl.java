package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(30)
class DisplayCutoutCompat$Api30Impl
{
  @DoNotInline
  public static DisplayCutout createDisplayCutout(Insets paramInsets1, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4, Insets paramInsets2)
  {
    return new DisplayCutout(paramInsets1, paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2);
  }
  
  @DoNotInline
  public static Insets getWaterfallInsets(DisplayCutout paramDisplayCutout)
  {
    return d.d(paramDisplayCutout);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
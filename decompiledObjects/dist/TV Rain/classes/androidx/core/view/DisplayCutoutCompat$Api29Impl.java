package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class DisplayCutoutCompat$Api29Impl
{
  @DoNotInline
  public static DisplayCutout createDisplayCutout(Insets paramInsets, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4)
  {
    return new DisplayCutout(paramInsets, paramRect1, paramRect2, paramRect3, paramRect4);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
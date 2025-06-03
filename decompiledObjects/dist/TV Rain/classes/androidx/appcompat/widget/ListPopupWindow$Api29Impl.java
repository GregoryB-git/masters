package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class ListPopupWindow$Api29Impl
{
  @DoNotInline
  public static void setEpicenterBounds(PopupWindow paramPopupWindow, Rect paramRect)
  {
    e.r(paramPopupWindow, paramRect);
  }
  
  @DoNotInline
  public static void setIsClippedToScreen(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    e.s(paramPopupWindow, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
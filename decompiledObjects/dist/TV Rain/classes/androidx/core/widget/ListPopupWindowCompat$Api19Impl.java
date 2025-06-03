package androidx.core.widget;

import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListPopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class ListPopupWindowCompat$Api19Impl
{
  @DoNotInline
  public static View.OnTouchListener createDragToOpenListener(ListPopupWindow paramListPopupWindow, View paramView)
  {
    return paramListPopupWindow.createDragToOpenListener(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.ListPopupWindowCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
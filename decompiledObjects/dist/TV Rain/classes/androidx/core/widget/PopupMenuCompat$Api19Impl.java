package androidx.core.widget;

import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class PopupMenuCompat$Api19Impl
{
  @DoNotInline
  public static View.OnTouchListener getDragToOpenListener(PopupMenu paramPopupMenu)
  {
    return paramPopupMenu.getDragToOpenListener();
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.PopupMenuCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
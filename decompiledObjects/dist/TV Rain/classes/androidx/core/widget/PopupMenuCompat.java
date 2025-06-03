package androidx.core.widget;

import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class PopupMenuCompat
{
  @Nullable
  public static View.OnTouchListener getDragToOpenListener(@NonNull Object paramObject)
  {
    return Api19Impl.getDragToOpenListener((PopupMenu)paramObject);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static View.OnTouchListener getDragToOpenListener(PopupMenu paramPopupMenu)
    {
      return paramPopupMenu.getDragToOpenListener();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.PopupMenuCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
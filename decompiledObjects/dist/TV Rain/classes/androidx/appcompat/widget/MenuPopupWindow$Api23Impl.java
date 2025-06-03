package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MenuPopupWindow$Api23Impl
{
  @DoNotInline
  public static void setEnterTransition(PopupWindow paramPopupWindow, Transition paramTransition)
  {
    paramPopupWindow.setEnterTransition(paramTransition);
  }
  
  @DoNotInline
  public static void setExitTransition(PopupWindow paramPopupWindow, Transition paramTransition)
  {
    paramPopupWindow.setExitTransition(paramTransition);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.MenuPopupWindow.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
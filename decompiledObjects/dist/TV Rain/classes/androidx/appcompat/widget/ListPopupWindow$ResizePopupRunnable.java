package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;

class ListPopupWindow$ResizePopupRunnable
  implements Runnable
{
  public ListPopupWindow$ResizePopupRunnable(ListPopupWindow paramListPopupWindow) {}
  
  public void run()
  {
    Object localObject = this$0.mDropDownList;
    if ((localObject != null) && (ViewCompat.isAttachedToWindow((View)localObject)) && (this$0.mDropDownList.getCount() > this$0.mDropDownList.getChildCount()))
    {
      int i = this$0.mDropDownList.getChildCount();
      localObject = this$0;
      if (i <= mListItemExpandMaximum)
      {
        mPopup.setInputMethodMode(2);
        this$0.show();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
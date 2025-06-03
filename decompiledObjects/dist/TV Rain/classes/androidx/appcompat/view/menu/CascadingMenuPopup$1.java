package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.Iterator;
import java.util.List;

class CascadingMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public CascadingMenuPopup$1(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onGlobalLayout()
  {
    if ((this$0.isShowing()) && (this$0.mShowingMenus.size() > 0) && (!this$0.mShowingMenus.get(0)).window.isModal()))
    {
      Object localObject = this$0.mShownAnchorView;
      if ((localObject != null) && (((View)localObject).isShown())) {
        localObject = this$0.mShowingMenus.iterator();
      }
      while (((Iterator)localObject).hasNext())
      {
        nextwindow.show();
        continue;
        this$0.dismiss();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
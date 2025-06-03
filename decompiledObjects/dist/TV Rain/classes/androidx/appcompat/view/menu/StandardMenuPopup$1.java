package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.appcompat.widget.ListPopupWindow;

class StandardMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public StandardMenuPopup$1(StandardMenuPopup paramStandardMenuPopup) {}
  
  public void onGlobalLayout()
  {
    if ((this$0.isShowing()) && (!this$0.mPopup.isModal()))
    {
      View localView = this$0.mShownAnchorView;
      if ((localView != null) && (localView.isShown())) {
        this$0.mPopup.show();
      } else {
        this$0.dismiss();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.StandardMenuPopup.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
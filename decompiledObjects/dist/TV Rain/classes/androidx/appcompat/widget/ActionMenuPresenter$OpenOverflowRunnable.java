package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

class ActionMenuPresenter$OpenOverflowRunnable
  implements Runnable
{
  private ActionMenuPresenter.OverflowPopup mPopup;
  
  public ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter paramActionMenuPresenter, ActionMenuPresenter.OverflowPopup paramOverflowPopup)
  {
    mPopup = paramOverflowPopup;
  }
  
  public void run()
  {
    if (ActionMenuPresenter.access$400(this$0) != null) {
      ActionMenuPresenter.access$500(this$0).changeMenuMode();
    }
    View localView = (View)ActionMenuPresenter.access$600(this$0);
    if ((localView != null) && (localView.getWindowToken() != null) && (mPopup.tryShow())) {
      this$0.mOverflowPopup = mPopup;
    }
    this$0.mPostedOpenRunnable = null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.core.view.ActionProvider;

class ActivityChooserView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public ActivityChooserView$2(ActivityChooserView paramActivityChooserView) {}
  
  public void onGlobalLayout()
  {
    if (this$0.isShowingPopup()) {
      if (!this$0.isShown())
      {
        this$0.getListPopupWindow().dismiss();
      }
      else
      {
        this$0.getListPopupWindow().show();
        ActionProvider localActionProvider = this$0.mProvider;
        if (localActionProvider != null) {
          localActionProvider.subUiVisibilityChanged(true);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
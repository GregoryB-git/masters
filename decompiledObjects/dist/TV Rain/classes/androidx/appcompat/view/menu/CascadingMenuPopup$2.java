package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

class CascadingMenuPopup$2
  implements View.OnAttachStateChangeListener
{
  public CascadingMenuPopup$2(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = this$0.mTreeObserver;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        this$0.mTreeObserver = paramView.getViewTreeObserver();
      }
      localObject = this$0;
      mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
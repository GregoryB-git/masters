package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ActionBarOverlayLayout$3
  implements Runnable
{
  public ActionBarOverlayLayout$3(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    this$0.haltActionBarHideOffsetAnimations();
    ActionBarOverlayLayout localActionBarOverlayLayout = this$0;
    mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(-this$0.mActionBarTop.getHeight()).setListener(this$0.mTopAnimatorListener);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
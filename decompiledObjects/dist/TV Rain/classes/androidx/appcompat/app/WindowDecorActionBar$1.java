package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class WindowDecorActionBar$1
  extends ViewPropertyAnimatorListenerAdapter
{
  public WindowDecorActionBar$1(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public void onAnimationEnd(View paramView)
  {
    paramView = this$0;
    if (mContentAnimations)
    {
      paramView = mContentView;
      if (paramView != null)
      {
        paramView.setTranslationY(0.0F);
        this$0.mContainerView.setTranslationY(0.0F);
      }
    }
    this$0.mContainerView.setVisibility(8);
    this$0.mContainerView.setTransitioning(false);
    paramView = this$0;
    mCurrentShowAnim = null;
    paramView.completeDeferredDestroyActionMode();
    paramView = this$0.mOverlayLayout;
    if (paramView != null) {
      ViewCompat.requestApplyInsets(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
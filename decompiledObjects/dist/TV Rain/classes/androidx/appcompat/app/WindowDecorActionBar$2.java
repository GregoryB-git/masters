package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class WindowDecorActionBar$2
  extends ViewPropertyAnimatorListenerAdapter
{
  public WindowDecorActionBar$2(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public void onAnimationEnd(View paramView)
  {
    paramView = this$0;
    mCurrentShowAnim = null;
    mContainerView.requestLayout();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
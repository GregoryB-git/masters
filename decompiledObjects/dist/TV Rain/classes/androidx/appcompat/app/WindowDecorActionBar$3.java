package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;

class WindowDecorActionBar$3
  implements ViewPropertyAnimatorUpdateListener
{
  public WindowDecorActionBar$3(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public void onAnimationUpdate(View paramView)
  {
    ((View)this$0.mContainerView.getParent()).invalidate();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
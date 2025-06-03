package androidx.appcompat.view;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;

class ViewPropertyAnimatorCompatSet$1
  extends ViewPropertyAnimatorListenerAdapter
{
  private int mProxyEndCount = 0;
  private boolean mProxyStarted = false;
  
  public ViewPropertyAnimatorCompatSet$1(ViewPropertyAnimatorCompatSet paramViewPropertyAnimatorCompatSet) {}
  
  public void onAnimationEnd(View paramView)
  {
    int i = mProxyEndCount + 1;
    mProxyEndCount = i;
    if (i == this$0.mAnimators.size())
    {
      paramView = this$0.mListener;
      if (paramView != null) {
        paramView.onAnimationEnd(null);
      }
      onEnd();
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    if (mProxyStarted) {
      return;
    }
    mProxyStarted = true;
    paramView = this$0.mListener;
    if (paramView != null) {
      paramView.onAnimationStart(null);
    }
  }
  
  public void onEnd()
  {
    mProxyEndCount = 0;
    mProxyStarted = false;
    this$0.onAnimationsEnded();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
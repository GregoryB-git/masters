package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class AppCompatDelegateImpl$6$1
  extends ViewPropertyAnimatorListenerAdapter
{
  public AppCompatDelegateImpl$6$1(AppCompatDelegateImpl.6 param6) {}
  
  public void onAnimationEnd(View paramView)
  {
    this$1.this$0.mActionModeView.setAlpha(1.0F);
    this$1.this$0.mFadeAnim.setListener(null);
    this$1.this$0.mFadeAnim = null;
  }
  
  public void onAnimationStart(View paramView)
  {
    this$1.this$0.mActionModeView.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.6.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
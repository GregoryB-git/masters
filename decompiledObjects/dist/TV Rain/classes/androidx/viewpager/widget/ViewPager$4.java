package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

class ViewPager$4
  implements OnApplyWindowInsetsListener
{
  private final Rect mTempRect = new Rect();
  
  public ViewPager$4(ViewPager paramViewPager) {}
  
  public WindowInsetsCompat onApplyWindowInsets(View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    paramView = ViewCompat.onApplyWindowInsets(paramView, paramWindowInsetsCompat);
    if (paramView.isConsumed()) {
      return paramView;
    }
    paramWindowInsetsCompat = mTempRect;
    left = paramView.getSystemWindowInsetLeft();
    top = paramView.getSystemWindowInsetTop();
    right = paramView.getSystemWindowInsetRight();
    bottom = paramView.getSystemWindowInsetBottom();
    int i = 0;
    int j = this$0.getChildCount();
    while (i < j)
    {
      WindowInsetsCompat localWindowInsetsCompat = ViewCompat.dispatchApplyWindowInsets(this$0.getChildAt(i), paramView);
      left = Math.min(localWindowInsetsCompat.getSystemWindowInsetLeft(), left);
      top = Math.min(localWindowInsetsCompat.getSystemWindowInsetTop(), top);
      right = Math.min(localWindowInsetsCompat.getSystemWindowInsetRight(), right);
      bottom = Math.min(localWindowInsetsCompat.getSystemWindowInsetBottom(), bottom);
      i++;
    }
    return paramView.replaceSystemWindowInsets(left, top, right, bottom);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
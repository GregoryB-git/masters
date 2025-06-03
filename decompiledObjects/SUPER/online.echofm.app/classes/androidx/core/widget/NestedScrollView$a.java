package androidx.core.widget;

import I.a;
import J.u;
import J.u.a;
import J.w;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ScrollView;

public class NestedScrollView$a
  extends a
{
  public void f(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.f(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    paramAccessibilityEvent.setClassName(ScrollView.class.getName());
    boolean bool;
    if (paramView.getScrollRange() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    paramAccessibilityEvent.setScrollable(bool);
    paramAccessibilityEvent.setScrollX(paramView.getScrollX());
    paramAccessibilityEvent.setScrollY(paramView.getScrollY());
    w.a(paramAccessibilityEvent, paramView.getScrollX());
    w.b(paramAccessibilityEvent, paramView.getScrollRange());
  }
  
  public void g(View paramView, u paramu)
  {
    super.g(paramView, paramu);
    paramView = (NestedScrollView)paramView;
    paramu.I(ScrollView.class.getName());
    if (paramView.isEnabled())
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        paramu.M(true);
        if (paramView.getScrollY() > 0)
        {
          paramu.a(u.a.q);
          paramu.a(u.a.B);
        }
        if (paramView.getScrollY() < i)
        {
          paramu.a(u.a.p);
          paramu.a(u.a.D);
        }
      }
    }
  }
  
  public boolean j(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.j(paramView, paramInt, paramBundle)) {
      return true;
    }
    paramBundle = (NestedScrollView)paramView;
    if (!paramBundle.isEnabled()) {
      return false;
    }
    int i = paramBundle.getHeight();
    paramView = new Rect();
    int j = i;
    if (paramBundle.getMatrix().isIdentity())
    {
      j = i;
      if (paramBundle.getGlobalVisibleRect(paramView)) {
        j = paramView.height();
      }
    }
    if (paramInt != 4096) {
      if ((paramInt != 8192) && (paramInt != 16908344))
      {
        if (paramInt != 16908346) {
          return false;
        }
      }
      else
      {
        paramInt = paramBundle.getPaddingBottom();
        i = paramBundle.getPaddingTop();
        paramInt = Math.max(paramBundle.getScrollY() - (j - paramInt - i), 0);
        if (paramInt != paramBundle.getScrollY())
        {
          paramBundle.V(0, paramInt, true);
          return true;
        }
        return false;
      }
    }
    paramInt = paramBundle.getPaddingBottom();
    i = paramBundle.getPaddingTop();
    paramInt = Math.min(paramBundle.getScrollY() + (j - paramInt - i), paramBundle.getScrollRange());
    if (paramInt != paramBundle.getScrollY())
    {
      paramBundle.V(0, paramInt, true);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
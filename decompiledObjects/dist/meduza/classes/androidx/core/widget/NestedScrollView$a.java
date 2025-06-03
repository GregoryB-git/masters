package androidx.core.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ScrollView;
import e0.a;
import f0.b;
import f0.b.a;

public final class NestedScrollView$a
  extends a
{
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.c(paramView, paramAccessibilityEvent);
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
    paramAccessibilityEvent.setMaxScrollX(paramView.getScrollX());
    paramAccessibilityEvent.setMaxScrollY(paramView.getScrollRange());
  }
  
  public final void d(View paramView, b paramb)
  {
    a.onInitializeAccessibilityNodeInfo(paramView, a);
    paramView = (NestedScrollView)paramView;
    Object localObject = ScrollView.class.getName();
    a.setClassName((CharSequence)localObject);
    if (paramView.isEnabled())
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        a.setScrollable(true);
        if (paramView.getScrollY() > 0)
        {
          localObject = b.a.e;
          a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
          localObject = b.a.f;
          a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
        }
        if (paramView.getScrollY() < i)
        {
          paramView = b.a.d;
          a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
          paramView = b.a.g;
          a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
        }
      }
    }
  }
  
  public final boolean g(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.g(paramView, paramInt, paramBundle)) {
      return true;
    }
    paramView = (NestedScrollView)paramView;
    if (!paramView.isEnabled()) {
      return false;
    }
    int i = paramView.getHeight();
    paramBundle = new Rect();
    int j = i;
    if (paramView.getMatrix().isIdentity())
    {
      j = i;
      if (paramView.getGlobalVisibleRect(paramBundle)) {
        j = paramBundle.height();
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
        paramInt = paramView.getPaddingBottom();
        i = paramView.getPaddingTop();
        paramInt = Math.max(paramView.getScrollY() - (j - paramInt - i), 0);
        if (paramInt != paramView.getScrollY())
        {
          paramView.q(0 - paramView.getScrollX(), paramInt - paramView.getScrollY(), true);
          return true;
        }
        return false;
      }
    }
    i = paramView.getPaddingBottom();
    paramInt = paramView.getPaddingTop();
    paramInt = Math.min(paramView.getScrollY() + (j - i - paramInt), paramView.getScrollRange());
    if (paramInt != paramView.getScrollY())
    {
      paramView.q(0 - paramView.getScrollX(), paramInt - paramView.getScrollY(), true);
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
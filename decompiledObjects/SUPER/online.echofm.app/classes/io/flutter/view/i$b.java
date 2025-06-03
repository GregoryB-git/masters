package io.flutter.view;

import D5.a;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

public class i$b
  implements AccessibilityManager.AccessibilityStateChangeListener
{
  public i$b(i parami) {}
  
  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
    if (i.k(a)) {
      return;
    }
    i locali = a;
    if (paramBoolean)
    {
      i.m(locali).g(i.l(a));
      i.m(a).e();
    }
    else
    {
      i.n(locali, false);
      i.m(a).g(null);
      i.m(a).d();
    }
    if (i.s(a) != null) {
      i.s(a).a(paramBoolean, i.t(a).isTouchExplorationEnabled());
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
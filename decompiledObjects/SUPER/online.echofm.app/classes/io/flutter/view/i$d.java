package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

public class i$d
  implements AccessibilityManager.TouchExplorationStateChangeListener
{
  public i$d(i parami, AccessibilityManager paramAccessibilityManager) {}
  
  public void onTouchExplorationStateChanged(boolean paramBoolean)
  {
    if (i.k(b)) {
      return;
    }
    if (!paramBoolean)
    {
      i.n(b, false);
      i.h(b);
    }
    if (i.s(b) != null) {
      i.s(b).a(a.isEnabled(), paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package I;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

public abstract class a$b
{
  public static AccessibilityNodeProvider a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
  {
    return paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
  }
  
  public static boolean b(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
  {
    return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     I.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
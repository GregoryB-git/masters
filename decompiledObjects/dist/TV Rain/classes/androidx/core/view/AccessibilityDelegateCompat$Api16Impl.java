package androidx.core.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class AccessibilityDelegateCompat$Api16Impl
{
  @DoNotInline
  public static AccessibilityNodeProvider getAccessibilityNodeProvider(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
  {
    return paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
  }
  
  @DoNotInline
  public static boolean performAccessibilityAction(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
  {
    return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
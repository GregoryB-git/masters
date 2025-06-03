package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;

class ViewPager2$BasicAccessibilityProvider
  extends ViewPager2.AccessibilityProvider
{
  public ViewPager2$BasicAccessibilityProvider(ViewPager2 paramViewPager2)
  {
    super(paramViewPager2, null);
  }
  
  public boolean handlesLmPerformAccessibilityAction(int paramInt)
  {
    boolean bool;
    if (((paramInt == 8192) || (paramInt == 4096)) && (!this$0.isUserInputEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean handlesRvGetAccessibilityClassName()
  {
    return true;
  }
  
  public void onLmInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    if (!this$0.isUserInputEnabled())
    {
      paramAccessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
      paramAccessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
      paramAccessibilityNodeInfoCompat.setScrollable(false);
    }
  }
  
  public boolean onLmPerformAccessibilityAction(int paramInt)
  {
    if (handlesLmPerformAccessibilityAction(paramInt)) {
      return false;
    }
    throw new IllegalStateException();
  }
  
  public CharSequence onRvGetAccessibilityClassName()
  {
    if (handlesRvGetAccessibilityClassName()) {
      return "androidx.viewpager.widget.ViewPager";
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.BasicAccessibilityProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
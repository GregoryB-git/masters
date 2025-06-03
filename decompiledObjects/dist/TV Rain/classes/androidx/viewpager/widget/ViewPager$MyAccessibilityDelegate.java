package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ViewPager$MyAccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  public ViewPager$MyAccessibilityDelegate(ViewPager paramViewPager) {}
  
  private boolean canScroll()
  {
    PagerAdapter localPagerAdapter = this$0.mAdapter;
    boolean bool = true;
    if ((localPagerAdapter == null) || (localPagerAdapter.getCount() <= 1)) {
      bool = false;
    }
    return bool;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    paramAccessibilityEvent.setScrollable(canScroll());
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      paramView = this$0.mAdapter;
      if (paramView != null)
      {
        paramAccessibilityEvent.setItemCount(paramView.getCount());
        paramAccessibilityEvent.setFromIndex(this$0.mCurItem);
        paramAccessibilityEvent.setToIndex(this$0.mCurItem);
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    paramAccessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
    paramAccessibilityNodeInfoCompat.setScrollable(canScroll());
    if (this$0.canScrollHorizontally(1)) {
      paramAccessibilityNodeInfoCompat.addAction(4096);
    }
    if (this$0.canScrollHorizontally(-1)) {
      paramAccessibilityNodeInfoCompat.addAction(8192);
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
      return true;
    }
    if (paramInt != 4096)
    {
      if (paramInt != 8192) {
        return false;
      }
      if (this$0.canScrollHorizontally(-1))
      {
        paramView = this$0;
        paramView.setCurrentItem(mCurItem - 1);
        return true;
      }
      return false;
    }
    if (this$0.canScrollHorizontally(1))
    {
      paramView = this$0;
      paramView.setCurrentItem(mCurItem + 1);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.MyAccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

class ViewPager2$RecyclerViewImpl
  extends RecyclerView
{
  public ViewPager2$RecyclerViewImpl(@NonNull ViewPager2 paramViewPager2, Context paramContext)
  {
    super(paramContext);
  }
  
  @RequiresApi(23)
  public CharSequence getAccessibilityClassName()
  {
    if (this$0.mAccessibilityProvider.handlesRvGetAccessibilityClassName()) {
      return this$0.mAccessibilityProvider.onRvGetAccessibilityClassName();
    }
    return super.getAccessibilityClassName();
  }
  
  public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setFromIndex(this$0.mCurrentItem);
    paramAccessibilityEvent.setToIndex(this$0.mCurrentItem);
    this$0.mAccessibilityProvider.onRvInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((this$0.isUserInputEnabled()) && (super.onInterceptTouchEvent(paramMotionEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((this$0.isUserInputEnabled()) && (super.onTouchEvent(paramMotionEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.RecyclerViewImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
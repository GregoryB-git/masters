package androidx.viewpager2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.State;

class ViewPager2$LinearLayoutManagerImpl
  extends LinearLayoutManager
{
  public ViewPager2$LinearLayoutManagerImpl(ViewPager2 paramViewPager2, Context paramContext)
  {
    super(paramContext);
  }
  
  public void calculateExtraLayoutSpace(@NonNull RecyclerView.State paramState, @NonNull int[] paramArrayOfInt)
  {
    int i = this$0.getOffscreenPageLimit();
    if (i == -1)
    {
      super.calculateExtraLayoutSpace(paramState, paramArrayOfInt);
      return;
    }
    i = this$0.getPageSize() * i;
    paramArrayOfInt[0] = i;
    paramArrayOfInt[1] = i;
  }
  
  public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramRecycler, paramState, paramAccessibilityNodeInfoCompat);
    this$0.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfoCompat);
  }
  
  public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, int paramInt, @Nullable Bundle paramBundle)
  {
    if (this$0.mAccessibilityProvider.handlesLmPerformAccessibilityAction(paramInt)) {
      return this$0.mAccessibilityProvider.onLmPerformAccessibilityAction(paramInt);
    }
    return super.performAccessibilityAction(paramRecycler, paramState, paramInt, paramBundle);
  }
  
  public boolean requestChildRectangleOnScreen(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.LinearLayoutManagerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
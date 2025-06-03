package androidx.viewpager2.widget;

import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

abstract class ViewPager2$AccessibilityProvider
{
  private ViewPager2$AccessibilityProvider(ViewPager2 paramViewPager2) {}
  
  public boolean handlesGetAccessibilityClassName()
  {
    return false;
  }
  
  public boolean handlesLmPerformAccessibilityAction(int paramInt)
  {
    return false;
  }
  
  public boolean handlesPerformAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  public boolean handlesRvGetAccessibilityClassName()
  {
    return false;
  }
  
  public void onAttachAdapter(@Nullable RecyclerView.Adapter<?> paramAdapter) {}
  
  public void onDetachAdapter(@Nullable RecyclerView.Adapter<?> paramAdapter) {}
  
  public String onGetAccessibilityClassName()
  {
    throw new IllegalStateException("Not implemented.");
  }
  
  public void onInitialize(@NonNull CompositeOnPageChangeCallback paramCompositeOnPageChangeCallback, @NonNull RecyclerView paramRecyclerView) {}
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {}
  
  public void onLmInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public boolean onLmPerformAccessibilityAction(int paramInt)
  {
    throw new IllegalStateException("Not implemented.");
  }
  
  public boolean onPerformAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    throw new IllegalStateException("Not implemented.");
  }
  
  public void onRestorePendingState() {}
  
  public CharSequence onRvGetAccessibilityClassName()
  {
    throw new IllegalStateException("Not implemented.");
  }
  
  public void onRvInitializeAccessibilityEvent(@NonNull AccessibilityEvent paramAccessibilityEvent) {}
  
  public void onSetLayoutDirection() {}
  
  public void onSetNewCurrentItem() {}
  
  public void onSetOrientation() {}
  
  public void onSetUserInputEnabled() {}
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
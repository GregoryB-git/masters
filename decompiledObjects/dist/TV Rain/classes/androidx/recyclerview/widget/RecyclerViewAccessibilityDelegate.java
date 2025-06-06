package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

public class RecyclerViewAccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  private final ItemDelegate mItemDelegate;
  public final RecyclerView mRecyclerView;
  
  public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView paramRecyclerView)
  {
    mRecyclerView = paramRecyclerView;
    paramRecyclerView = getItemDelegate();
    if ((paramRecyclerView != null) && ((paramRecyclerView instanceof ItemDelegate))) {
      mItemDelegate = ((ItemDelegate)paramRecyclerView);
    } else {
      mItemDelegate = new ItemDelegate(this);
    }
  }
  
  @NonNull
  public AccessibilityDelegateCompat getItemDelegate()
  {
    return mItemDelegate;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    if (((paramView instanceof RecyclerView)) && (!shouldIgnore()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null) {
        paramView.getLayoutManager().onInitializeAccessibilityEvent(paramAccessibilityEvent);
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    if ((!shouldIgnore()) && (mRecyclerView.getLayoutManager() != null)) {
      mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfoCompat);
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!shouldIgnore()) && (mRecyclerView.getLayoutManager() != null)) {
      return mRecyclerView.getLayoutManager().performAccessibilityAction(paramInt, paramBundle);
    }
    return false;
  }
  
  public boolean shouldIgnore()
  {
    return mRecyclerView.hasPendingAdapterUpdates();
  }
  
  public static class ItemDelegate
    extends AccessibilityDelegateCompat
  {
    private Map<View, AccessibilityDelegateCompat> mOriginalItemDelegates = new WeakHashMap();
    public final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;
    
    public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate paramRecyclerViewAccessibilityDelegate)
    {
      mRecyclerViewDelegate = paramRecyclerViewAccessibilityDelegate;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        return localAccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
      }
      return super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    @Nullable
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View paramView)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        return localAccessibilityDelegateCompat.getAccessibilityNodeProvider(paramView);
      }
      return super.getAccessibilityNodeProvider(paramView);
    }
    
    public AccessibilityDelegateCompat getAndRemoveOriginalDelegateForItem(View paramView)
    {
      return (AccessibilityDelegateCompat)mOriginalItemDelegates.remove(paramView);
    }
    
    public void onInitializeAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        localAccessibilityDelegateCompat.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      } else {
        super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      if ((!mRecyclerViewDelegate.shouldIgnore()) && (mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null))
      {
        mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(paramView, paramAccessibilityNodeInfoCompat);
        AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
        if (localAccessibilityDelegateCompat != null) {
          localAccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
        } else {
          super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
        }
      }
      else
      {
        super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      }
    }
    
    public void onPopulateAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        localAccessibilityDelegateCompat.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
      } else {
        super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
      }
    }
    
    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup paramViewGroup, @NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramViewGroup);
      if (localAccessibilityDelegateCompat != null) {
        return localAccessibilityDelegateCompat.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if ((!mRecyclerViewDelegate.shouldIgnore()) && (mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null))
      {
        AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
        if (localAccessibilityDelegateCompat != null)
        {
          if (localAccessibilityDelegateCompat.performAccessibilityAction(paramView, paramInt, paramBundle)) {
            return true;
          }
        }
        else if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
          return true;
        }
        return mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(paramView, paramInt, paramBundle);
      }
      return super.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
    
    public void saveOriginalDelegate(View paramView)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = ViewCompat.getAccessibilityDelegate(paramView);
      if ((localAccessibilityDelegateCompat != null) && (localAccessibilityDelegateCompat != this)) {
        mOriginalItemDelegates.put(paramView, localAccessibilityDelegateCompat);
      }
    }
    
    public void sendAccessibilityEvent(@NonNull View paramView, int paramInt)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        localAccessibilityDelegateCompat.sendAccessibilityEvent(paramView, paramInt);
      } else {
        super.sendAccessibilityEvent(paramView, paramInt);
      }
    }
    
    public void sendAccessibilityEventUnchecked(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      AccessibilityDelegateCompat localAccessibilityDelegateCompat = (AccessibilityDelegateCompat)mOriginalItemDelegates.get(paramView);
      if (localAccessibilityDelegateCompat != null) {
        localAccessibilityDelegateCompat.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
      } else {
        super.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
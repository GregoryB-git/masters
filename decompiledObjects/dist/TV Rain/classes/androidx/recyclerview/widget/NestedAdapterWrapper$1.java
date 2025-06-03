package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

class NestedAdapterWrapper$1
  extends RecyclerView.AdapterDataObserver
{
  public NestedAdapterWrapper$1(NestedAdapterWrapper paramNestedAdapterWrapper) {}
  
  public void onChanged()
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCachedItemCount = adapter.getItemCount();
    localNestedAdapterWrapper = this$0;
    mCallback.onChanged(localNestedAdapterWrapper);
  }
  
  public void onItemRangeChanged(int paramInt1, int paramInt2)
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCallback.onItemRangeChanged(localNestedAdapterWrapper, paramInt1, paramInt2, null);
  }
  
  public void onItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCallback.onItemRangeChanged(localNestedAdapterWrapper, paramInt1, paramInt2, paramObject);
  }
  
  public void onItemRangeInserted(int paramInt1, int paramInt2)
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCachedItemCount += paramInt2;
    mCallback.onItemRangeInserted(localNestedAdapterWrapper, paramInt1, paramInt2);
    localNestedAdapterWrapper = this$0;
    if ((mCachedItemCount > 0) && (adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY))
    {
      localNestedAdapterWrapper = this$0;
      mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
    }
  }
  
  public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    if (paramInt3 != 1) {
      bool = false;
    }
    Preconditions.checkArgument(bool, "moving more than 1 item is not supported in RecyclerView");
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCallback.onItemRangeMoved(localNestedAdapterWrapper, paramInt1, paramInt2);
  }
  
  public void onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCachedItemCount -= paramInt2;
    mCallback.onItemRangeRemoved(localNestedAdapterWrapper, paramInt1, paramInt2);
    localNestedAdapterWrapper = this$0;
    if ((mCachedItemCount < 1) && (adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY))
    {
      localNestedAdapterWrapper = this$0;
      mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
    }
  }
  
  public void onStateRestorationPolicyChanged()
  {
    NestedAdapterWrapper localNestedAdapterWrapper = this$0;
    mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.NestedAdapterWrapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
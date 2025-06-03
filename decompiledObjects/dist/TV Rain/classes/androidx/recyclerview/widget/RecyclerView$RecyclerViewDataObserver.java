package androidx.recyclerview.widget;

import androidx.core.view.ViewCompat;

class RecyclerView$RecyclerViewDataObserver
  extends RecyclerView.AdapterDataObserver
{
  public RecyclerView$RecyclerViewDataObserver(RecyclerView paramRecyclerView) {}
  
  public void onChanged()
  {
    this$0.assertNotInLayoutOrScroll(null);
    RecyclerView localRecyclerView = this$0;
    mState.mStructureChanged = true;
    localRecyclerView.processDataSetCompletelyChanged(true);
    if (!this$0.mAdapterHelper.hasPendingUpdates()) {
      this$0.requestLayout();
    }
  }
  
  public void onItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this$0.assertNotInLayoutOrScroll(null);
    if (this$0.mAdapterHelper.onItemRangeChanged(paramInt1, paramInt2, paramObject)) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeInserted(int paramInt1, int paramInt2)
  {
    this$0.assertNotInLayoutOrScroll(null);
    if (this$0.mAdapterHelper.onItemRangeInserted(paramInt1, paramInt2)) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    this$0.assertNotInLayoutOrScroll(null);
    if (this$0.mAdapterHelper.onItemRangeMoved(paramInt1, paramInt2, paramInt3)) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    this$0.assertNotInLayoutOrScroll(null);
    if (this$0.mAdapterHelper.onItemRangeRemoved(paramInt1, paramInt2)) {
      triggerUpdateProcessor();
    }
  }
  
  public void onStateRestorationPolicyChanged()
  {
    Object localObject = this$0;
    if (mPendingSavedState == null) {
      return;
    }
    localObject = mAdapter;
    if ((localObject != null) && (((RecyclerView.Adapter)localObject).canRestoreState())) {
      this$0.requestLayout();
    }
  }
  
  public void triggerUpdateProcessor()
  {
    if (RecyclerView.POST_UPDATES_ON_ANIMATION)
    {
      localRecyclerView = this$0;
      if ((mHasFixedSize) && (mIsAttached))
      {
        ViewCompat.postOnAnimation(localRecyclerView, mUpdateChildViewsRunnable);
        return;
      }
    }
    RecyclerView localRecyclerView = this$0;
    mAdapterUpdateDuringMeasure = true;
    localRecyclerView.requestLayout();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
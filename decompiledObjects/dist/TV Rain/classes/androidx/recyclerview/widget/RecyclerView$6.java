package androidx.recyclerview.widget;

class RecyclerView$6
  implements AdapterHelper.Callback
{
  public RecyclerView$6(RecyclerView paramRecyclerView) {}
  
  public void dispatchUpdate(AdapterHelper.UpdateOp paramUpdateOp)
  {
    int i = cmd;
    RecyclerView localRecyclerView;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4)
        {
          if (i == 8)
          {
            localRecyclerView = this$0;
            mLayout.onItemsMoved(localRecyclerView, positionStart, itemCount, 1);
          }
        }
        else
        {
          localRecyclerView = this$0;
          mLayout.onItemsUpdated(localRecyclerView, positionStart, itemCount, payload);
        }
      }
      else
      {
        localRecyclerView = this$0;
        mLayout.onItemsRemoved(localRecyclerView, positionStart, itemCount);
      }
    }
    else
    {
      localRecyclerView = this$0;
      mLayout.onItemsAdded(localRecyclerView, positionStart, itemCount);
    }
  }
  
  public RecyclerView.ViewHolder findViewHolder(int paramInt)
  {
    RecyclerView.ViewHolder localViewHolder = this$0.findViewHolderForPosition(paramInt, true);
    if (localViewHolder == null) {
      return null;
    }
    if (this$0.mChildHelper.isHidden(itemView)) {
      return null;
    }
    return localViewHolder;
  }
  
  public void markViewHoldersUpdated(int paramInt1, int paramInt2, Object paramObject)
  {
    this$0.viewRangeUpdate(paramInt1, paramInt2, paramObject);
    this$0.mItemsChanged = true;
  }
  
  public void offsetPositionsForAdd(int paramInt1, int paramInt2)
  {
    this$0.offsetPositionRecordsForInsert(paramInt1, paramInt2);
    this$0.mItemsAddedOrRemoved = true;
  }
  
  public void offsetPositionsForMove(int paramInt1, int paramInt2)
  {
    this$0.offsetPositionRecordsForMove(paramInt1, paramInt2);
    this$0.mItemsAddedOrRemoved = true;
  }
  
  public void offsetPositionsForRemovingInvisible(int paramInt1, int paramInt2)
  {
    this$0.offsetPositionRecordsForRemove(paramInt1, paramInt2, true);
    Object localObject = this$0;
    mItemsAddedOrRemoved = true;
    localObject = mState;
    mDeletedInvisibleItemCountSincePreviousLayout += paramInt2;
  }
  
  public void offsetPositionsForRemovingLaidOutOrNewView(int paramInt1, int paramInt2)
  {
    this$0.offsetPositionRecordsForRemove(paramInt1, paramInt2, false);
    this$0.mItemsAddedOrRemoved = true;
  }
  
  public void onDispatchFirstPass(AdapterHelper.UpdateOp paramUpdateOp)
  {
    dispatchUpdate(paramUpdateOp);
  }
  
  public void onDispatchSecondPass(AdapterHelper.UpdateOp paramUpdateOp)
  {
    dispatchUpdate(paramUpdateOp);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
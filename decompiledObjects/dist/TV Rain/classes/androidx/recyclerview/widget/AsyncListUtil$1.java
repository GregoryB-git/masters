package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseIntArray;
import z2;

class AsyncListUtil$1
  implements ThreadUtil.MainThreadCallback<T>
{
  public AsyncListUtil$1(AsyncListUtil paramAsyncListUtil) {}
  
  private boolean isRequestedGeneration(int paramInt)
  {
    boolean bool;
    if (paramInt == this$0.mRequestedGeneration) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void recycleAllTiles()
  {
    for (int i = 0; i < this$0.mTileList.size(); i++)
    {
      AsyncListUtil localAsyncListUtil = this$0;
      mBackgroundProxy.recycleTile(mTileList.getAtIndex(i));
    }
    this$0.mTileList.clear();
  }
  
  public void addTile(int paramInt, TileList.Tile<T> paramTile)
  {
    if (!isRequestedGeneration(paramInt))
    {
      this$0.mBackgroundProxy.recycleTile(paramTile);
      return;
    }
    TileList.Tile localTile = this$0.mTileList.addOrReplace(paramTile);
    if (localTile != null)
    {
      StringBuilder localStringBuilder = z2.t("duplicate tile @");
      localStringBuilder.append(mStartPosition);
      Log.e("AsyncListUtil", localStringBuilder.toString());
      this$0.mBackgroundProxy.recycleTile(localTile);
    }
    int i = mStartPosition;
    int j = mItemCount;
    paramInt = 0;
    while (paramInt < this$0.mMissingPositions.size())
    {
      int k = this$0.mMissingPositions.keyAt(paramInt);
      if ((mStartPosition <= k) && (k < i + j))
      {
        this$0.mMissingPositions.removeAt(paramInt);
        this$0.mViewCallback.onItemLoaded(k);
      }
      else
      {
        paramInt++;
      }
    }
  }
  
  public void removeTile(int paramInt1, int paramInt2)
  {
    if (!isRequestedGeneration(paramInt1)) {
      return;
    }
    Object localObject = this$0.mTileList.removeAtPos(paramInt2);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("tile not found @");
      ((StringBuilder)localObject).append(paramInt2);
      Log.e("AsyncListUtil", ((StringBuilder)localObject).toString());
      return;
    }
    this$0.mBackgroundProxy.recycleTile((TileList.Tile)localObject);
  }
  
  public void updateItemCount(int paramInt1, int paramInt2)
  {
    if (!isRequestedGeneration(paramInt1)) {
      return;
    }
    AsyncListUtil localAsyncListUtil = this$0;
    mItemCount = paramInt2;
    mViewCallback.onDataRefresh();
    localAsyncListUtil = this$0;
    mDisplayedGeneration = mRequestedGeneration;
    recycleAllTiles();
    localAsyncListUtil = this$0;
    mAllowScrollHints = false;
    localAsyncListUtil.updateRange();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
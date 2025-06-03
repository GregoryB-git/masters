package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import z2;

class AsyncListUtil$2
  implements ThreadUtil.BackgroundCallback<T>
{
  private int mFirstRequiredTileStart;
  private int mGeneration;
  private int mItemCount;
  private int mLastRequiredTileStart;
  public final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
  private TileList.Tile<T> mRecycledRoot;
  
  public AsyncListUtil$2(AsyncListUtil paramAsyncListUtil) {}
  
  private TileList.Tile<T> acquireTile()
  {
    Object localObject = mRecycledRoot;
    if (localObject != null)
    {
      mRecycledRoot = mNext;
      return (TileList.Tile<T>)localObject;
    }
    localObject = this$0;
    return new TileList.Tile(mTClass, mTileSize);
  }
  
  private void addTile(TileList.Tile<T> paramTile)
  {
    mLoadedTiles.put(mStartPosition, true);
    this$0.mMainThreadProxy.addTile(mGeneration, paramTile);
  }
  
  private void flushTileCache(int paramInt)
  {
    int i = this$0.mDataCallback.getMaxCachedTiles();
    while (mLoadedTiles.size() >= i)
    {
      int j = mLoadedTiles.keyAt(0);
      SparseBooleanArray localSparseBooleanArray = mLoadedTiles;
      int k = localSparseBooleanArray.keyAt(localSparseBooleanArray.size() - 1);
      int m = mFirstRequiredTileStart - j;
      int n = k - mLastRequiredTileStart;
      if ((m > 0) && ((m >= n) || (paramInt == 2)))
      {
        removeTile(j);
      }
      else
      {
        if ((n <= 0) || ((m >= n) && (paramInt != 1))) {
          break;
        }
        removeTile(k);
      }
    }
  }
  
  private int getTileStart(int paramInt)
  {
    return paramInt - paramInt % this$0.mTileSize;
  }
  
  private boolean isTileLoaded(int paramInt)
  {
    return mLoadedTiles.get(paramInt);
  }
  
  private void log(String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = z2.t("[BKGR] ");
    localStringBuilder.append(String.format(paramString, paramVarArgs));
    Log.d("AsyncListUtil", localStringBuilder.toString());
  }
  
  private void removeTile(int paramInt)
  {
    mLoadedTiles.delete(paramInt);
    this$0.mMainThreadProxy.removeTile(mGeneration, paramInt);
  }
  
  private void requestTiles(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramInt1;
    while (i <= paramInt2)
    {
      int j;
      if (paramBoolean) {
        j = paramInt2 + paramInt1 - i;
      } else {
        j = i;
      }
      this$0.mBackgroundProxy.loadTile(j, paramInt3);
      i += this$0.mTileSize;
    }
  }
  
  public void loadTile(int paramInt1, int paramInt2)
  {
    if (isTileLoaded(paramInt1)) {
      return;
    }
    TileList.Tile localTile = acquireTile();
    mStartPosition = paramInt1;
    paramInt1 = Math.min(this$0.mTileSize, mItemCount - paramInt1);
    mItemCount = paramInt1;
    this$0.mDataCallback.fillData(mItems, mStartPosition, paramInt1);
    flushTileCache(paramInt2);
    addTile(localTile);
  }
  
  public void recycleTile(TileList.Tile<T> paramTile)
  {
    this$0.mDataCallback.recycleData(mItems, mItemCount);
    mNext = mRecycledRoot;
    mRecycledRoot = paramTile;
  }
  
  public void refresh(int paramInt)
  {
    mGeneration = paramInt;
    mLoadedTiles.clear();
    paramInt = this$0.mDataCallback.refreshData();
    mItemCount = paramInt;
    this$0.mMainThreadProxy.updateItemCount(mGeneration, paramInt);
  }
  
  public void updateRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 > paramInt2) {
      return;
    }
    paramInt1 = getTileStart(paramInt1);
    paramInt2 = getTileStart(paramInt2);
    mFirstRequiredTileStart = getTileStart(paramInt3);
    paramInt3 = getTileStart(paramInt4);
    mLastRequiredTileStart = paramInt3;
    if (paramInt5 == 1)
    {
      requestTiles(mFirstRequiredTileStart, paramInt2, paramInt5, true);
      requestTiles(paramInt2 + this$0.mTileSize, mLastRequiredTileStart, paramInt5, false);
    }
    else
    {
      requestTiles(paramInt1, paramInt3, paramInt5, false);
      requestTiles(mFirstRequiredTileStart, paramInt1 - this$0.mTileSize, paramInt5, true);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
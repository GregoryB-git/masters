package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import z2;

public class AsyncListUtil<T>
{
  public static final boolean DEBUG = false;
  public static final String TAG = "AsyncListUtil";
  public boolean mAllowScrollHints;
  private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
  public final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
  public final DataCallback<T> mDataCallback;
  public int mDisplayedGeneration = 0;
  public int mItemCount = 0;
  private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
  public final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
  public final SparseIntArray mMissingPositions = new SparseIntArray();
  public final int[] mPrevRange = new int[2];
  public int mRequestedGeneration = 0;
  private int mScrollHint = 0;
  public final Class<T> mTClass;
  public final TileList<T> mTileList;
  public final int mTileSize;
  public final int[] mTmpRange = new int[2];
  public final int[] mTmpRangeExtended = new int[2];
  public final ViewCallback mViewCallback;
  
  public AsyncListUtil(@NonNull Class<T> paramClass, int paramInt, @NonNull DataCallback<T> paramDataCallback, @NonNull ViewCallback paramViewCallback)
  {
    ThreadUtil.MainThreadCallback local1 = new ThreadUtil.MainThreadCallback()
    {
      private boolean isRequestedGeneration(int paramAnonymousInt)
      {
        boolean bool;
        if (paramAnonymousInt == mRequestedGeneration) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      private void recycleAllTiles()
      {
        for (int i = 0; i < mTileList.size(); i++)
        {
          AsyncListUtil localAsyncListUtil = AsyncListUtil.this;
          mBackgroundProxy.recycleTile(mTileList.getAtIndex(i));
        }
        mTileList.clear();
      }
      
      public void addTile(int paramAnonymousInt, TileList.Tile<T> paramAnonymousTile)
      {
        if (!isRequestedGeneration(paramAnonymousInt))
        {
          mBackgroundProxy.recycleTile(paramAnonymousTile);
          return;
        }
        TileList.Tile localTile = mTileList.addOrReplace(paramAnonymousTile);
        if (localTile != null)
        {
          StringBuilder localStringBuilder = z2.t("duplicate tile @");
          localStringBuilder.append(mStartPosition);
          Log.e("AsyncListUtil", localStringBuilder.toString());
          mBackgroundProxy.recycleTile(localTile);
        }
        int i = mStartPosition;
        int j = mItemCount;
        paramAnonymousInt = 0;
        while (paramAnonymousInt < mMissingPositions.size())
        {
          int k = mMissingPositions.keyAt(paramAnonymousInt);
          if ((mStartPosition <= k) && (k < i + j))
          {
            mMissingPositions.removeAt(paramAnonymousInt);
            mViewCallback.onItemLoaded(k);
          }
          else
          {
            paramAnonymousInt++;
          }
        }
      }
      
      public void removeTile(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (!isRequestedGeneration(paramAnonymousInt1)) {
          return;
        }
        Object localObject = mTileList.removeAtPos(paramAnonymousInt2);
        if (localObject == null)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("tile not found @");
          ((StringBuilder)localObject).append(paramAnonymousInt2);
          Log.e("AsyncListUtil", ((StringBuilder)localObject).toString());
          return;
        }
        mBackgroundProxy.recycleTile((TileList.Tile)localObject);
      }
      
      public void updateItemCount(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (!isRequestedGeneration(paramAnonymousInt1)) {
          return;
        }
        AsyncListUtil localAsyncListUtil = AsyncListUtil.this;
        mItemCount = paramAnonymousInt2;
        mViewCallback.onDataRefresh();
        localAsyncListUtil = AsyncListUtil.this;
        mDisplayedGeneration = mRequestedGeneration;
        recycleAllTiles();
        localAsyncListUtil = AsyncListUtil.this;
        mAllowScrollHints = false;
        localAsyncListUtil.updateRange();
      }
    };
    mMainThreadCallback = local1;
    ThreadUtil.BackgroundCallback local2 = new ThreadUtil.BackgroundCallback()
    {
      private int mFirstRequiredTileStart;
      private int mGeneration;
      private int mItemCount;
      private int mLastRequiredTileStart;
      public final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
      private TileList.Tile<T> mRecycledRoot;
      
      private TileList.Tile<T> acquireTile()
      {
        Object localObject = mRecycledRoot;
        if (localObject != null)
        {
          mRecycledRoot = mNext;
          return (TileList.Tile<T>)localObject;
        }
        localObject = AsyncListUtil.this;
        return new TileList.Tile(mTClass, mTileSize);
      }
      
      private void addTile(TileList.Tile<T> paramAnonymousTile)
      {
        mLoadedTiles.put(mStartPosition, true);
        mMainThreadProxy.addTile(mGeneration, paramAnonymousTile);
      }
      
      private void flushTileCache(int paramAnonymousInt)
      {
        int i = mDataCallback.getMaxCachedTiles();
        while (mLoadedTiles.size() >= i)
        {
          int j = mLoadedTiles.keyAt(0);
          SparseBooleanArray localSparseBooleanArray = mLoadedTiles;
          int k = localSparseBooleanArray.keyAt(localSparseBooleanArray.size() - 1);
          int m = mFirstRequiredTileStart - j;
          int n = k - mLastRequiredTileStart;
          if ((m > 0) && ((m >= n) || (paramAnonymousInt == 2)))
          {
            removeTile(j);
          }
          else
          {
            if ((n <= 0) || ((m >= n) && (paramAnonymousInt != 1))) {
              break;
            }
            removeTile(k);
          }
        }
      }
      
      private int getTileStart(int paramAnonymousInt)
      {
        return paramAnonymousInt - paramAnonymousInt % mTileSize;
      }
      
      private boolean isTileLoaded(int paramAnonymousInt)
      {
        return mLoadedTiles.get(paramAnonymousInt);
      }
      
      private void log(String paramAnonymousString, Object... paramAnonymousVarArgs)
      {
        StringBuilder localStringBuilder = z2.t("[BKGR] ");
        localStringBuilder.append(String.format(paramAnonymousString, paramAnonymousVarArgs));
        Log.d("AsyncListUtil", localStringBuilder.toString());
      }
      
      private void removeTile(int paramAnonymousInt)
      {
        mLoadedTiles.delete(paramAnonymousInt);
        mMainThreadProxy.removeTile(mGeneration, paramAnonymousInt);
      }
      
      private void requestTiles(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, boolean paramAnonymousBoolean)
      {
        int i = paramAnonymousInt1;
        while (i <= paramAnonymousInt2)
        {
          int j;
          if (paramAnonymousBoolean) {
            j = paramAnonymousInt2 + paramAnonymousInt1 - i;
          } else {
            j = i;
          }
          mBackgroundProxy.loadTile(j, paramAnonymousInt3);
          i += mTileSize;
        }
      }
      
      public void loadTile(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (isTileLoaded(paramAnonymousInt1)) {
          return;
        }
        TileList.Tile localTile = acquireTile();
        mStartPosition = paramAnonymousInt1;
        paramAnonymousInt1 = Math.min(mTileSize, mItemCount - paramAnonymousInt1);
        mItemCount = paramAnonymousInt1;
        mDataCallback.fillData(mItems, mStartPosition, paramAnonymousInt1);
        flushTileCache(paramAnonymousInt2);
        addTile(localTile);
      }
      
      public void recycleTile(TileList.Tile<T> paramAnonymousTile)
      {
        mDataCallback.recycleData(mItems, mItemCount);
        mNext = mRecycledRoot;
        mRecycledRoot = paramAnonymousTile;
      }
      
      public void refresh(int paramAnonymousInt)
      {
        mGeneration = paramAnonymousInt;
        mLoadedTiles.clear();
        paramAnonymousInt = mDataCallback.refreshData();
        mItemCount = paramAnonymousInt;
        mMainThreadProxy.updateItemCount(mGeneration, paramAnonymousInt);
      }
      
      public void updateRange(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5)
      {
        if (paramAnonymousInt1 > paramAnonymousInt2) {
          return;
        }
        paramAnonymousInt1 = getTileStart(paramAnonymousInt1);
        paramAnonymousInt2 = getTileStart(paramAnonymousInt2);
        mFirstRequiredTileStart = getTileStart(paramAnonymousInt3);
        paramAnonymousInt3 = getTileStart(paramAnonymousInt4);
        mLastRequiredTileStart = paramAnonymousInt3;
        if (paramAnonymousInt5 == 1)
        {
          requestTiles(mFirstRequiredTileStart, paramAnonymousInt2, paramAnonymousInt5, true);
          requestTiles(paramAnonymousInt2 + mTileSize, mLastRequiredTileStart, paramAnonymousInt5, false);
        }
        else
        {
          requestTiles(paramAnonymousInt1, paramAnonymousInt3, paramAnonymousInt5, false);
          requestTiles(mFirstRequiredTileStart, paramAnonymousInt1 - mTileSize, paramAnonymousInt5, true);
        }
      }
    };
    mBackgroundCallback = local2;
    mTClass = paramClass;
    mTileSize = paramInt;
    mDataCallback = paramDataCallback;
    mViewCallback = paramViewCallback;
    mTileList = new TileList(paramInt);
    paramClass = new MessageThreadUtil();
    mMainThreadProxy = paramClass.getMainThreadProxy(local1);
    mBackgroundProxy = paramClass.getBackgroundProxy(local2);
    refresh();
  }
  
  private boolean isRefreshPending()
  {
    boolean bool;
    if (mRequestedGeneration != mDisplayedGeneration) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public T getItem(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mItemCount))
    {
      localObject = mTileList.getItemAt(paramInt);
      if ((localObject == null) && (!isRefreshPending())) {
        mMissingPositions.put(paramInt, 0);
      }
      return (T)localObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" is not within 0 and ");
    ((StringBuilder)localObject).append(mItemCount);
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public int getItemCount()
  {
    return mItemCount;
  }
  
  public void log(String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = z2.t("[MAIN] ");
    localStringBuilder.append(String.format(paramString, paramVarArgs));
    Log.d("AsyncListUtil", localStringBuilder.toString());
  }
  
  public void onRangeChanged()
  {
    if (isRefreshPending()) {
      return;
    }
    updateRange();
    mAllowScrollHints = true;
  }
  
  public void refresh()
  {
    mMissingPositions.clear();
    ThreadUtil.BackgroundCallback localBackgroundCallback = mBackgroundProxy;
    int i = mRequestedGeneration + 1;
    mRequestedGeneration = i;
    localBackgroundCallback.refresh(i);
  }
  
  public void updateRange()
  {
    mViewCallback.getItemRangeInto(mTmpRange);
    Object localObject = mTmpRange;
    int i = localObject[0];
    int j = localObject[1];
    if ((i <= j) && (i >= 0))
    {
      if (j >= mItemCount) {
        return;
      }
      if (!mAllowScrollHints)
      {
        mScrollHint = 0;
      }
      else
      {
        arrayOfInt = mPrevRange;
        if (i <= arrayOfInt[1])
        {
          int k = arrayOfInt[0];
          if (k <= j)
          {
            if (i < k)
            {
              mScrollHint = 1;
              break label122;
            }
            if (i <= k) {
              break label122;
            }
            mScrollHint = 2;
            break label122;
          }
        }
        mScrollHint = 0;
      }
      label122:
      int[] arrayOfInt = mPrevRange;
      arrayOfInt[0] = i;
      arrayOfInt[1] = j;
      mViewCallback.extendRangeInto((int[])localObject, mTmpRangeExtended, mScrollHint);
      localObject = mTmpRangeExtended;
      localObject[0] = Math.min(mTmpRange[0], Math.max(localObject[0], 0));
      localObject = mTmpRangeExtended;
      localObject[1] = Math.max(mTmpRange[1], Math.min(localObject[1], mItemCount - 1));
      localObject = mBackgroundProxy;
      arrayOfInt = mTmpRange;
      j = arrayOfInt[0];
      i = arrayOfInt[1];
      arrayOfInt = mTmpRangeExtended;
      ((ThreadUtil.BackgroundCallback)localObject).updateRange(j, i, arrayOfInt[0], arrayOfInt[1], mScrollHint);
    }
  }
  
  public static abstract class DataCallback<T>
  {
    @WorkerThread
    public abstract void fillData(@NonNull T[] paramArrayOfT, int paramInt1, int paramInt2);
    
    @WorkerThread
    public int getMaxCachedTiles()
    {
      return 10;
    }
    
    @WorkerThread
    public void recycleData(@NonNull T[] paramArrayOfT, int paramInt) {}
    
    @WorkerThread
    public abstract int refreshData();
  }
  
  public static abstract class ViewCallback
  {
    public static final int HINT_SCROLL_ASC = 2;
    public static final int HINT_SCROLL_DESC = 1;
    public static final int HINT_SCROLL_NONE = 0;
    
    @UiThread
    public void extendRangeInto(@NonNull int[] paramArrayOfInt1, @NonNull int[] paramArrayOfInt2, int paramInt)
    {
      int i = paramArrayOfInt1[1];
      int j = paramArrayOfInt1[0];
      int k = i - j + 1;
      int m = k / 2;
      int n;
      if (paramInt == 1) {
        n = k;
      } else {
        n = m;
      }
      paramArrayOfInt2[0] = (j - n);
      if (paramInt != 2) {
        k = m;
      }
      paramArrayOfInt2[1] = (i + k);
    }
    
    @UiThread
    public abstract void getItemRangeInto(@NonNull int[] paramArrayOfInt);
    
    @UiThread
    public abstract void onDataRefresh();
    
    @UiThread
    public abstract void onItemLoaded(int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
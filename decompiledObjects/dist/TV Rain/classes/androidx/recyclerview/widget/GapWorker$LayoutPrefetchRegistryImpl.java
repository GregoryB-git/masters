package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.Arrays;

@SuppressLint({"VisibleForTests"})
class GapWorker$LayoutPrefetchRegistryImpl
  implements RecyclerView.LayoutManager.LayoutPrefetchRegistry
{
  public int mCount;
  public int[] mPrefetchArray;
  public int mPrefetchDx;
  public int mPrefetchDy;
  
  public void addPosition(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 >= 0)
      {
        int i = mCount * 2;
        int[] arrayOfInt1 = mPrefetchArray;
        if (arrayOfInt1 == null)
        {
          arrayOfInt2 = new int[4];
          mPrefetchArray = arrayOfInt2;
          Arrays.fill(arrayOfInt2, -1);
        }
        else if (i >= arrayOfInt1.length)
        {
          arrayOfInt2 = new int[i * 2];
          mPrefetchArray = arrayOfInt2;
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        }
        int[] arrayOfInt2 = mPrefetchArray;
        arrayOfInt2[i] = paramInt1;
        arrayOfInt2[(i + 1)] = paramInt2;
        mCount += 1;
        return;
      }
      throw new IllegalArgumentException("Pixel distance must be non-negative");
    }
    throw new IllegalArgumentException("Layout positions must be non-negative");
  }
  
  public void clearPrefetchPositions()
  {
    int[] arrayOfInt = mPrefetchArray;
    if (arrayOfInt != null) {
      Arrays.fill(arrayOfInt, -1);
    }
    mCount = 0;
  }
  
  public void collectPrefetchPositionsFromView(RecyclerView paramRecyclerView, boolean paramBoolean)
  {
    mCount = 0;
    Object localObject = mPrefetchArray;
    if (localObject != null) {
      Arrays.fill((int[])localObject, -1);
    }
    localObject = mLayout;
    if ((mAdapter != null) && (localObject != null) && (((RecyclerView.LayoutManager)localObject).isItemPrefetchEnabled()))
    {
      if (paramBoolean)
      {
        if (!mAdapterHelper.hasPendingUpdates()) {
          ((RecyclerView.LayoutManager)localObject).collectInitialPrefetchPositions(mAdapter.getItemCount(), this);
        }
      }
      else if (!paramRecyclerView.hasPendingAdapterUpdates()) {
        ((RecyclerView.LayoutManager)localObject).collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, mState, this);
      }
      int i = mCount;
      if (i > mPrefetchMaxCountObserved)
      {
        mPrefetchMaxCountObserved = i;
        mPrefetchMaxObservedInInitialPrefetch = paramBoolean;
        mRecycler.updateViewCacheSize();
      }
    }
  }
  
  public boolean lastPrefetchIncludedPosition(int paramInt)
  {
    if (mPrefetchArray != null)
    {
      int i = mCount;
      for (int j = 0; j < i * 2; j += 2) {
        if (mPrefetchArray[j] == paramInt) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void setPrefetchVector(int paramInt1, int paramInt2)
  {
    mPrefetchDx = paramInt1;
    mPrefetchDy = paramInt2;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class GapWorker
  implements Runnable
{
  public static final ThreadLocal<GapWorker> sGapWorker = new ThreadLocal();
  public static Comparator<Task> sTaskComparator = new Comparator()
  {
    public int compare(GapWorker.Task paramAnonymousTask1, GapWorker.Task paramAnonymousTask2)
    {
      RecyclerView localRecyclerView = view;
      int i = 1;
      int j = 1;
      if (localRecyclerView == null) {
        k = 1;
      } else {
        k = 0;
      }
      int m;
      if (view == null) {
        m = 1;
      } else {
        m = 0;
      }
      if (k != m)
      {
        if (localRecyclerView == null) {
          k = j;
        } else {
          k = -1;
        }
        return k;
      }
      boolean bool = immediate;
      if (bool != immediate)
      {
        k = i;
        if (bool) {
          k = -1;
        }
        return k;
      }
      int k = viewVelocity - viewVelocity;
      if (k != 0) {
        return k;
      }
      k = distanceToItem - distanceToItem;
      if (k != 0) {
        return k;
      }
      return 0;
    }
  };
  public long mFrameIntervalNs;
  public long mPostTimeNs;
  public ArrayList<RecyclerView> mRecyclerViews = new ArrayList();
  private ArrayList<Task> mTasks = new ArrayList();
  
  private void buildTaskList()
  {
    int i = mRecyclerViews.size();
    int j = 0;
    Object localObject;
    for (int k = j; j < i; k = m)
    {
      localObject = (RecyclerView)mRecyclerViews.get(j);
      m = k;
      if (((View)localObject).getWindowVisibility() == 0)
      {
        mPrefetchRegistry.collectPrefetchPositionsFromView((RecyclerView)localObject, false);
        m = k + mPrefetchRegistry.mCount;
      }
      j++;
    }
    mTasks.ensureCapacity(k);
    k = 0;
    int n;
    for (int m = k; k < i; m = n)
    {
      RecyclerView localRecyclerView = (RecyclerView)mRecyclerViews.get(k);
      if (localRecyclerView.getWindowVisibility() != 0)
      {
        n = m;
      }
      else
      {
        LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl = mPrefetchRegistry;
        j = Math.abs(mPrefetchDx);
        int i1 = Math.abs(mPrefetchDy) + j;
        for (j = 0;; j += 2)
        {
          n = m;
          if (j >= mCount * 2) {
            break;
          }
          if (m >= mTasks.size())
          {
            localObject = new Task();
            mTasks.add(localObject);
          }
          else
          {
            localObject = (Task)mTasks.get(m);
          }
          int[] arrayOfInt = mPrefetchArray;
          n = arrayOfInt[(j + 1)];
          boolean bool;
          if (n <= i1) {
            bool = true;
          } else {
            bool = false;
          }
          immediate = bool;
          viewVelocity = i1;
          distanceToItem = n;
          view = localRecyclerView;
          position = arrayOfInt[j];
          m++;
        }
      }
      k++;
    }
    Collections.sort(mTasks, sTaskComparator);
  }
  
  private void flushTaskWithDeadline(Task paramTask, long paramLong)
  {
    long l;
    if (immediate) {
      l = Long.MAX_VALUE;
    } else {
      l = paramLong;
    }
    paramTask = prefetchPositionWithDeadline(view, position, l);
    if ((paramTask != null) && (mNestedRecyclerView != null) && (paramTask.isBound()) && (!paramTask.isInvalid())) {
      prefetchInnerRecyclerViewWithDeadline((RecyclerView)mNestedRecyclerView.get(), paramLong);
    }
  }
  
  private void flushTasksWithDeadline(long paramLong)
  {
    for (int i = 0; i < mTasks.size(); i++)
    {
      Task localTask = (Task)mTasks.get(i);
      if (view == null) {
        break;
      }
      flushTaskWithDeadline(localTask, paramLong);
      localTask.clear();
    }
  }
  
  public static boolean isPrefetchPositionAttached(RecyclerView paramRecyclerView, int paramInt)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if ((mPosition == paramInt) && (!localViewHolder.isInvalid())) {
        return true;
      }
    }
    return false;
  }
  
  private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView paramRecyclerView, long paramLong)
  {
    if (paramRecyclerView == null) {
      return;
    }
    if ((mDataSetHasChangedAfterLayout) && (mChildHelper.getUnfilteredChildCount() != 0)) {
      paramRecyclerView.removeAndRecycleViews();
    }
    LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl = mPrefetchRegistry;
    localLayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(paramRecyclerView, true);
    if (mCount != 0) {
      try
      {
        TraceCompat.beginSection("RV Nested Prefetch");
        mState.prepareForNestedPrefetch(mAdapter);
        for (int i = 0; i < mCount * 2; i += 2) {
          prefetchPositionWithDeadline(paramRecyclerView, mPrefetchArray[i], paramLong);
        }
      }
      finally
      {
        TraceCompat.endSection();
      }
    }
  }
  
  private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    if (isPrefetchPositionAttached(paramRecyclerView, paramInt)) {
      return null;
    }
    RecyclerView.Recycler localRecycler = mRecycler;
    try
    {
      paramRecyclerView.onEnterLayoutOrScroll();
      RecyclerView.ViewHolder localViewHolder = localRecycler.tryGetViewHolderForPositionByDeadline(paramInt, false, paramLong);
      if (localViewHolder != null) {
        if ((localViewHolder.isBound()) && (!localViewHolder.isInvalid())) {
          localRecycler.recycleView(itemView);
        } else {
          localRecycler.addViewHolderToRecycledViewPool(localViewHolder, false);
        }
      }
      return localViewHolder;
    }
    finally
    {
      paramRecyclerView.onExitLayoutOrScroll(false);
    }
  }
  
  public void add(RecyclerView paramRecyclerView)
  {
    mRecyclerViews.add(paramRecyclerView);
  }
  
  public void postFromTraversal(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramRecyclerView.isAttachedToWindow()) && (mPostTimeNs == 0L))
    {
      mPostTimeNs = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    }
    mPrefetchRegistry.setPrefetchVector(paramInt1, paramInt2);
  }
  
  public void prefetch(long paramLong)
  {
    buildTaskList();
    flushTasksWithDeadline(paramLong);
  }
  
  public void remove(RecyclerView paramRecyclerView)
  {
    mRecyclerViews.remove(paramRecyclerView);
  }
  
  public void run()
  {
    try
    {
      TraceCompat.beginSection("RV Prefetch");
      boolean bool = mRecyclerViews.isEmpty();
      if (bool) {}
      long l1;
      do
      {
        return;
        int i = mRecyclerViews.size();
        int j = 0;
        long l2;
        for (l1 = 0L; j < i; l1 = l2)
        {
          RecyclerView localRecyclerView = (RecyclerView)mRecyclerViews.get(j);
          l2 = l1;
          if (localRecyclerView.getWindowVisibility() == 0) {
            l2 = Math.max(localRecyclerView.getDrawingTime(), l1);
          }
          j++;
        }
      } while (l1 == 0L);
      prefetch(TimeUnit.MILLISECONDS.toNanos(l1) + mFrameIntervalNs);
      return;
    }
    finally
    {
      mPostTimeNs = 0L;
      TraceCompat.endSection();
    }
  }
  
  @SuppressLint({"VisibleForTests"})
  public static class LayoutPrefetchRegistryImpl
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
  
  public static class Task
  {
    public int distanceToItem;
    public boolean immediate;
    public int position;
    public RecyclerView view;
    public int viewVelocity;
    
    public void clear()
    {
      immediate = false;
      viewVelocity = 0;
      distanceToItem = 0;
      view = null;
      position = 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GapWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;

final class FakeDrag
{
  private int mActualDraggedDistance;
  private long mFakeDragBeginTime;
  private int mMaximumVelocity;
  private final RecyclerView mRecyclerView;
  private float mRequestedDragDistance;
  private final ScrollEventAdapter mScrollEventAdapter;
  private VelocityTracker mVelocityTracker;
  private final ViewPager2 mViewPager;
  
  public FakeDrag(ViewPager2 paramViewPager2, ScrollEventAdapter paramScrollEventAdapter, RecyclerView paramRecyclerView)
  {
    mViewPager = paramViewPager2;
    mScrollEventAdapter = paramScrollEventAdapter;
    mRecyclerView = paramRecyclerView;
  }
  
  private void addFakeMotionEvent(long paramLong, int paramInt, float paramFloat1, float paramFloat2)
  {
    MotionEvent localMotionEvent = MotionEvent.obtain(mFakeDragBeginTime, paramLong, paramInt, paramFloat1, paramFloat2, 0);
    mVelocityTracker.addMovement(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  private void beginFakeVelocityTracker()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker == null)
    {
      mVelocityTracker = VelocityTracker.obtain();
      mMaximumVelocity = ViewConfiguration.get(mViewPager.getContext()).getScaledMaximumFlingVelocity();
    }
    else
    {
      localVelocityTracker.clear();
    }
  }
  
  @UiThread
  public boolean beginFakeDrag()
  {
    if (mScrollEventAdapter.isDragging()) {
      return false;
    }
    mActualDraggedDistance = 0;
    mRequestedDragDistance = 0;
    mFakeDragBeginTime = SystemClock.uptimeMillis();
    beginFakeVelocityTracker();
    mScrollEventAdapter.notifyBeginFakeDrag();
    if (!mScrollEventAdapter.isIdle()) {
      mRecyclerView.stopScroll();
    }
    addFakeMotionEvent(mFakeDragBeginTime, 0, 0.0F, 0.0F);
    return true;
  }
  
  @UiThread
  public boolean endFakeDrag()
  {
    if (!mScrollEventAdapter.isFakeDragging()) {
      return false;
    }
    mScrollEventAdapter.notifyEndFakeDrag();
    VelocityTracker localVelocityTracker = mVelocityTracker;
    localVelocityTracker.computeCurrentVelocity(1000, mMaximumVelocity);
    int i = (int)localVelocityTracker.getXVelocity();
    int j = (int)localVelocityTracker.getYVelocity();
    if (!mRecyclerView.fling(i, j)) {
      mViewPager.snapToPage();
    }
    return true;
  }
  
  @UiThread
  public boolean fakeDragBy(float paramFloat)
  {
    boolean bool = mScrollEventAdapter.isFakeDragging();
    int i = 0;
    if (!bool) {
      return false;
    }
    paramFloat = mRequestedDragDistance - paramFloat;
    mRequestedDragDistance = paramFloat;
    int j = Math.round(paramFloat - mActualDraggedDistance);
    mActualDraggedDistance += j;
    long l = SystemClock.uptimeMillis();
    int k;
    if (mViewPager.getOrientation() == 0) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (k != 0) {
      m = j;
    } else {
      m = 0;
    }
    if (k != 0) {
      j = i;
    }
    float f = 0.0F;
    if (k != 0) {
      paramFloat = mRequestedDragDistance;
    } else {
      paramFloat = 0.0F;
    }
    if (k == 0) {
      f = mRequestedDragDistance;
    }
    mRecyclerView.scrollBy(m, j);
    addFakeMotionEvent(l, 2, paramFloat, f);
    return true;
  }
  
  public boolean isFakeDragging()
  {
    return mScrollEventAdapter.isFakeDragging();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.FakeDrag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class RecyclerView$ViewFlinger
  implements Runnable
{
  private boolean mEatRunOnAnimationRequest;
  public Interpolator mInterpolator;
  private int mLastFlingX;
  private int mLastFlingY;
  public OverScroller mOverScroller;
  private boolean mReSchedulePostAnimationCallback;
  
  public RecyclerView$ViewFlinger(RecyclerView paramRecyclerView)
  {
    Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
    mInterpolator = localInterpolator;
    mEatRunOnAnimationRequest = false;
    mReSchedulePostAnimationCallback = false;
    mOverScroller = new OverScroller(paramRecyclerView.getContext(), localInterpolator);
  }
  
  private int computeScrollDuration(int paramInt1, int paramInt2)
  {
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    if (i > j) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    RecyclerView localRecyclerView = this$0;
    if (paramInt1 != 0) {
      paramInt2 = localRecyclerView.getWidth();
    } else {
      paramInt2 = localRecyclerView.getHeight();
    }
    if (paramInt1 != 0) {
      paramInt1 = i;
    } else {
      paramInt1 = j;
    }
    return Math.min((int)((paramInt1 / paramInt2 + 1.0F) * 300.0F), 2000);
  }
  
  private void internalPostOnAnimation()
  {
    this$0.removeCallbacks(this);
    ViewCompat.postOnAnimation(this$0, this);
  }
  
  public void fling(int paramInt1, int paramInt2)
  {
    this$0.setScrollState(2);
    mLastFlingY = 0;
    mLastFlingX = 0;
    Interpolator localInterpolator1 = mInterpolator;
    Interpolator localInterpolator2 = RecyclerView.sQuinticInterpolator;
    if (localInterpolator1 != localInterpolator2)
    {
      mInterpolator = localInterpolator2;
      mOverScroller = new OverScroller(this$0.getContext(), localInterpolator2);
    }
    mOverScroller.fling(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    postOnAnimation();
  }
  
  public void postOnAnimation()
  {
    if (mEatRunOnAnimationRequest) {
      mReSchedulePostAnimationCallback = true;
    } else {
      internalPostOnAnimation();
    }
  }
  
  public void run()
  {
    Object localObject1 = this$0;
    if (mLayout == null)
    {
      stop();
      return;
    }
    mReSchedulePostAnimationCallback = false;
    mEatRunOnAnimationRequest = true;
    ((RecyclerView)localObject1).consumePendingUpdateOperations();
    localObject1 = mOverScroller;
    if (((OverScroller)localObject1).computeScrollOffset())
    {
      int i = ((OverScroller)localObject1).getCurrX();
      int j = ((OverScroller)localObject1).getCurrY();
      int k = i - mLastFlingX;
      int m = j - mLastFlingY;
      mLastFlingX = i;
      mLastFlingY = j;
      Object localObject2 = this$0;
      Object localObject3 = mReusableIntPair;
      localObject3[0] = 0;
      localObject3[1] = 0;
      j = k;
      i = m;
      if (((RecyclerView)localObject2).dispatchNestedPreScroll(k, m, (int[])localObject3, null, 1))
      {
        localObject2 = this$0.mReusableIntPair;
        j = k - localObject2[0];
        i = m - localObject2[1];
      }
      if (this$0.getOverScrollMode() != 2) {
        this$0.considerReleasingGlowsOnScroll(j, i);
      }
      localObject2 = this$0;
      if (mAdapter != null)
      {
        localObject3 = mReusableIntPair;
        localObject3[0] = 0;
        localObject3[1] = 0;
        ((RecyclerView)localObject2).scrollStep(j, i, (int[])localObject3);
        localObject2 = this$0;
        localObject3 = mReusableIntPair;
        n = localObject3[0];
        i1 = localObject3[1];
        int i2 = j - n;
        int i3 = i - i1;
        localObject2 = mLayout.mSmoothScroller;
        j = i2;
        m = i1;
        i = n;
        k = i3;
        if (localObject2 != null)
        {
          j = i2;
          m = i1;
          i = n;
          k = i3;
          if (!((RecyclerView.SmoothScroller)localObject2).isPendingInitialRun())
          {
            j = i2;
            m = i1;
            i = n;
            k = i3;
            if (((RecyclerView.SmoothScroller)localObject2).isRunning())
            {
              j = this$0.mState.getItemCount();
              if (j == 0)
              {
                ((RecyclerView.SmoothScroller)localObject2).stop();
                j = i2;
                m = i1;
                i = n;
                k = i3;
              }
              else if (((RecyclerView.SmoothScroller)localObject2).getTargetPosition() >= j)
              {
                ((RecyclerView.SmoothScroller)localObject2).setTargetPosition(j - 1);
                ((RecyclerView.SmoothScroller)localObject2).onAnimation(n, i1);
                j = i2;
                m = i1;
                i = n;
                k = i3;
              }
              else
              {
                ((RecyclerView.SmoothScroller)localObject2).onAnimation(n, i1);
                j = i2;
                m = i1;
                i = n;
                k = i3;
              }
            }
          }
        }
      }
      else
      {
        m = 0;
        i1 = m;
        k = i;
        i = i1;
      }
      if (!this$0.mItemDecorations.isEmpty()) {
        this$0.invalidate();
      }
      localObject3 = this$0;
      localObject2 = mReusableIntPair;
      localObject2[0] = 0;
      localObject2[1] = 0;
      ((RecyclerView)localObject3).dispatchNestedScroll(i, m, j, k, null, 1, (int[])localObject2);
      localObject3 = this$0;
      localObject2 = mReusableIntPair;
      int n = j - localObject2[0];
      int i1 = k - localObject2[1];
      if ((i != 0) || (m != 0)) {
        ((RecyclerView)localObject3).dispatchOnScrolled(i, m);
      }
      if (!RecyclerView.access$200(this$0)) {
        this$0.invalidate();
      }
      if (((OverScroller)localObject1).getCurrX() == ((OverScroller)localObject1).getFinalX()) {
        j = 1;
      } else {
        j = 0;
      }
      if (((OverScroller)localObject1).getCurrY() == ((OverScroller)localObject1).getFinalY()) {
        k = 1;
      } else {
        k = 0;
      }
      if ((!((OverScroller)localObject1).isFinished()) && (((j == 0) && (n == 0)) || ((k == 0) && (i1 == 0)))) {
        j = 0;
      } else {
        j = 1;
      }
      localObject2 = this$0.mLayout.mSmoothScroller;
      if ((localObject2 != null) && (((RecyclerView.SmoothScroller)localObject2).isPendingInitialRun())) {
        k = 1;
      } else {
        k = 0;
      }
      if ((k == 0) && (j != 0))
      {
        if (this$0.getOverScrollMode() != 2)
        {
          i = (int)((OverScroller)localObject1).getCurrVelocity();
          if (n < 0) {
            j = -i;
          } else if (n > 0) {
            j = i;
          } else {
            j = 0;
          }
          if (i1 < 0) {
            i = -i;
          } else if (i1 <= 0) {
            i = 0;
          }
          this$0.absorbGlows(j, i);
        }
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
          this$0.mPrefetchRegistry.clearPrefetchPositions();
        }
      }
      else
      {
        postOnAnimation();
        localObject1 = this$0;
        localObject2 = mGapWorker;
        if (localObject2 != null) {
          ((GapWorker)localObject2).postFromTraversal((RecyclerView)localObject1, i, m);
        }
      }
    }
    localObject1 = this$0.mLayout.mSmoothScroller;
    if ((localObject1 != null) && (((RecyclerView.SmoothScroller)localObject1).isPendingInitialRun())) {
      ((RecyclerView.SmoothScroller)localObject1).onAnimation(0, 0);
    }
    mEatRunOnAnimationRequest = false;
    if (mReSchedulePostAnimationCallback)
    {
      internalPostOnAnimation();
    }
    else
    {
      this$0.setScrollState(0);
      this$0.stopNestedScroll(1);
    }
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
  {
    int i = paramInt3;
    if (paramInt3 == Integer.MIN_VALUE) {
      i = computeScrollDuration(paramInt1, paramInt2);
    }
    Interpolator localInterpolator = paramInterpolator;
    if (paramInterpolator == null) {
      localInterpolator = RecyclerView.sQuinticInterpolator;
    }
    if (mInterpolator != localInterpolator)
    {
      mInterpolator = localInterpolator;
      mOverScroller = new OverScroller(this$0.getContext(), localInterpolator);
    }
    mLastFlingY = 0;
    mLastFlingX = 0;
    this$0.setScrollState(2);
    mOverScroller.startScroll(0, 0, paramInt1, paramInt2, i);
    postOnAnimation();
  }
  
  public void stop()
  {
    this$0.removeCallbacks(this);
    mOverScroller.abortAnimation();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ViewFlinger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
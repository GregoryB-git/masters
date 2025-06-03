package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import java.util.Locale;

final class ScrollEventAdapter
  extends RecyclerView.OnScrollListener
{
  private static final int NO_POSITION = -1;
  private static final int STATE_IDLE = 0;
  private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
  private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
  private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
  private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
  private int mAdapterState;
  private ViewPager2.OnPageChangeCallback mCallback;
  private boolean mDataSetChangeHappened;
  private boolean mDispatchSelected;
  private int mDragStartPosition;
  private boolean mFakeDragging;
  @NonNull
  private final LinearLayoutManager mLayoutManager;
  @NonNull
  private final RecyclerView mRecyclerView;
  private boolean mScrollHappened;
  private int mScrollState;
  private ScrollEventValues mScrollValues;
  private int mTarget;
  @NonNull
  private final ViewPager2 mViewPager;
  
  public ScrollEventAdapter(@NonNull ViewPager2 paramViewPager2)
  {
    mViewPager = paramViewPager2;
    paramViewPager2 = mRecyclerView;
    mRecyclerView = paramViewPager2;
    mLayoutManager = ((LinearLayoutManager)paramViewPager2.getLayoutManager());
    mScrollValues = new ScrollEventValues();
    resetState();
  }
  
  private void dispatchScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    ViewPager2.OnPageChangeCallback localOnPageChangeCallback = mCallback;
    if (localOnPageChangeCallback != null) {
      localOnPageChangeCallback.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void dispatchSelected(int paramInt)
  {
    ViewPager2.OnPageChangeCallback localOnPageChangeCallback = mCallback;
    if (localOnPageChangeCallback != null) {
      localOnPageChangeCallback.onPageSelected(paramInt);
    }
  }
  
  private void dispatchStateChanged(int paramInt)
  {
    if ((mAdapterState == 3) && (mScrollState == 0)) {
      return;
    }
    if (mScrollState == paramInt) {
      return;
    }
    mScrollState = paramInt;
    ViewPager2.OnPageChangeCallback localOnPageChangeCallback = mCallback;
    if (localOnPageChangeCallback != null) {
      localOnPageChangeCallback.onPageScrollStateChanged(paramInt);
    }
  }
  
  private int getPosition()
  {
    return mLayoutManager.findFirstVisibleItemPosition();
  }
  
  private boolean isInAnyDraggingState()
  {
    int i = mAdapterState;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 1) {
      if (i == 4) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  private void resetState()
  {
    mAdapterState = 0;
    mScrollState = 0;
    mScrollValues.reset();
    mDragStartPosition = -1;
    mTarget = -1;
    mDispatchSelected = false;
    mScrollHappened = false;
    mFakeDragging = false;
    mDataSetChangeHappened = false;
  }
  
  private void startDrag(boolean paramBoolean)
  {
    mFakeDragging = paramBoolean;
    if (paramBoolean) {
      i = 4;
    } else {
      i = 1;
    }
    mAdapterState = i;
    int i = mTarget;
    if (i != -1)
    {
      mDragStartPosition = i;
      mTarget = -1;
    }
    else if (mDragStartPosition == -1)
    {
      mDragStartPosition = getPosition();
    }
    dispatchStateChanged(1);
  }
  
  private void updateScrollEventValues()
  {
    ScrollEventValues localScrollEventValues = mScrollValues;
    int i = mLayoutManager.findFirstVisibleItemPosition();
    mPosition = i;
    if (i == -1)
    {
      localScrollEventValues.reset();
      return;
    }
    View localView = mLayoutManager.findViewByPosition(i);
    if (localView == null)
    {
      localScrollEventValues.reset();
      return;
    }
    int j = mLayoutManager.getLeftDecorationWidth(localView);
    int k = mLayoutManager.getRightDecorationWidth(localView);
    int m = mLayoutManager.getTopDecorationHeight(localView);
    int n = mLayoutManager.getBottomDecorationHeight(localView);
    Object localObject = localView.getLayoutParams();
    int i1 = j;
    int i2 = k;
    i = m;
    int i3 = n;
    if ((localObject instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      i1 = j + leftMargin;
      i2 = k + rightMargin;
      i = m + topMargin;
      i3 = n + bottomMargin;
    }
    n = localView.getHeight() + i + i3;
    m = localView.getWidth();
    if (mLayoutManager.getOrientation() == 0) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if (i3 != 0)
    {
      i3 = localView.getLeft() - i1 - mRecyclerView.getPaddingLeft();
      i = i3;
      if (mViewPager.isRtl()) {
        i = -i3;
      }
      i1 = m + i1 + i2;
      i2 = i;
      i = i1;
    }
    else
    {
      i2 = localView.getTop() - i - mRecyclerView.getPaddingTop();
      i = n;
    }
    i2 = -i2;
    mOffsetPx = i2;
    if (i2 < 0)
    {
      if (new AnimateLayoutChangeDetector(mLayoutManager).mayHaveInterferingAnimations()) {
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
      }
      throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[] { Integer.valueOf(mOffsetPx) }));
    }
    float f;
    if (i == 0) {
      f = 0.0F;
    } else {
      f = i2 / i;
    }
    mOffset = f;
  }
  
  public double getRelativeScrollPosition()
  {
    updateScrollEventValues();
    ScrollEventValues localScrollEventValues = mScrollValues;
    return mPosition + mOffset;
  }
  
  public int getScrollState()
  {
    return mScrollState;
  }
  
  public boolean isDragging()
  {
    int i = mScrollState;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isFakeDragging()
  {
    return mFakeDragging;
  }
  
  public boolean isIdle()
  {
    boolean bool;
    if (mScrollState == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void notifyBeginFakeDrag()
  {
    mAdapterState = 4;
    startDrag(true);
  }
  
  public void notifyDataSetChangeHappened()
  {
    mDataSetChangeHappened = true;
  }
  
  public void notifyEndFakeDrag()
  {
    if ((isDragging()) && (!mFakeDragging)) {
      return;
    }
    mFakeDragging = false;
    updateScrollEventValues();
    ScrollEventValues localScrollEventValues = mScrollValues;
    if (mOffsetPx == 0)
    {
      int i = mPosition;
      if (i != mDragStartPosition) {
        dispatchSelected(i);
      }
      dispatchStateChanged(0);
      resetState();
    }
    else
    {
      dispatchStateChanged(2);
    }
  }
  
  public void notifyProgrammaticScroll(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      i = 2;
    } else {
      i = 3;
    }
    mAdapterState = i;
    int i = 0;
    mFakeDragging = false;
    if (mTarget != paramInt) {
      i = 1;
    }
    mTarget = paramInt;
    dispatchStateChanged(2);
    if (i != 0) {
      dispatchSelected(paramInt);
    }
  }
  
  public void onScrollStateChanged(@NonNull RecyclerView paramRecyclerView, int paramInt)
  {
    int i = mAdapterState;
    int j = 1;
    if (((i != 1) || (mScrollState != 1)) && (paramInt == 1))
    {
      startDrag(false);
      return;
    }
    if ((isInAnyDraggingState()) && (paramInt == 2))
    {
      if (mScrollHappened)
      {
        dispatchStateChanged(2);
        mDispatchSelected = true;
      }
      return;
    }
    if ((isInAnyDraggingState()) && (paramInt == 0))
    {
      updateScrollEventValues();
      int k;
      if (!mScrollHappened)
      {
        k = mScrollValues.mPosition;
        i = j;
        if (k != -1)
        {
          dispatchScrolled(k, 0.0F, 0);
          i = j;
        }
      }
      else
      {
        paramRecyclerView = mScrollValues;
        if (mOffsetPx == 0)
        {
          k = mDragStartPosition;
          int m = mPosition;
          i = j;
          if (k != m)
          {
            dispatchSelected(m);
            i = j;
          }
        }
        else
        {
          i = 0;
        }
      }
      if (i != 0)
      {
        dispatchStateChanged(0);
        resetState();
      }
    }
    if ((mAdapterState == 2) && (paramInt == 0) && (mDataSetChangeHappened))
    {
      updateScrollEventValues();
      paramRecyclerView = mScrollValues;
      if (mOffsetPx == 0)
      {
        paramInt = mTarget;
        i = mPosition;
        if (paramInt != i)
        {
          paramInt = i;
          if (i == -1) {
            paramInt = 0;
          }
          dispatchSelected(paramInt);
        }
        dispatchStateChanged(0);
        resetState();
      }
    }
  }
  
  public void onScrolled(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    mScrollHappened = true;
    updateScrollEventValues();
    if (mDispatchSelected)
    {
      mDispatchSelected = false;
      if (paramInt2 <= 0) {
        if (paramInt2 == 0)
        {
          int i;
          if (paramInt1 < 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == mViewPager.isRtl()) {}
        }
        else
        {
          paramInt1 = 0;
          break label64;
        }
      }
      paramInt1 = 1;
      label64:
      if (paramInt1 != 0)
      {
        paramRecyclerView = mScrollValues;
        if (mOffsetPx != 0)
        {
          paramInt1 = mPosition + 1;
          break label98;
        }
      }
      paramInt1 = mScrollValues.mPosition;
      label98:
      mTarget = paramInt1;
      if (mDragStartPosition != paramInt1) {
        dispatchSelected(paramInt1);
      }
    }
    else if (mAdapterState == 0)
    {
      paramInt2 = mScrollValues.mPosition;
      paramInt1 = paramInt2;
      if (paramInt2 == -1) {
        paramInt1 = 0;
      }
      dispatchSelected(paramInt1);
    }
    paramRecyclerView = mScrollValues;
    paramInt2 = mPosition;
    paramInt1 = paramInt2;
    if (paramInt2 == -1) {
      paramInt1 = 0;
    }
    dispatchScrolled(paramInt1, mOffset, mOffsetPx);
    paramRecyclerView = mScrollValues;
    paramInt2 = mPosition;
    paramInt1 = mTarget;
    if (((paramInt2 == paramInt1) || (paramInt1 == -1)) && (mOffsetPx == 0) && (mScrollState != 1))
    {
      dispatchStateChanged(0);
      resetState();
    }
  }
  
  public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback paramOnPageChangeCallback)
  {
    mCallback = paramOnPageChangeCallback;
  }
  
  public static final class ScrollEventValues
  {
    public float mOffset;
    public int mOffsetPx;
    public int mPosition;
    
    public void reset()
    {
      mPosition = -1;
      mOffset = 0.0F;
      mOffsetPx = 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ScrollEventAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
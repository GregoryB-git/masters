package androidx.customview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import z2;

public class ViewDragHelper
{
  private static final int BASE_SETTLE_DURATION = 256;
  public static final int DIRECTION_ALL = 3;
  public static final int DIRECTION_HORIZONTAL = 1;
  public static final int DIRECTION_VERTICAL = 2;
  public static final int EDGE_ALL = 15;
  public static final int EDGE_BOTTOM = 8;
  public static final int EDGE_LEFT = 1;
  public static final int EDGE_RIGHT = 2;
  private static final int EDGE_SIZE = 20;
  public static final int EDGE_TOP = 4;
  public static final int INVALID_POINTER = -1;
  private static final int MAX_SETTLE_DURATION = 600;
  public static final int STATE_DRAGGING = 1;
  public static final int STATE_IDLE = 0;
  public static final int STATE_SETTLING = 2;
  private static final String TAG = "ViewDragHelper";
  private static final Interpolator sInterpolator = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
    }
  };
  private int mActivePointerId = -1;
  private final Callback mCallback;
  private View mCapturedView;
  private final int mDefaultEdgeSize;
  private int mDragState;
  private int[] mEdgeDragsInProgress;
  private int[] mEdgeDragsLocked;
  private int mEdgeSize;
  private int[] mInitialEdgesTouched;
  private float[] mInitialMotionX;
  private float[] mInitialMotionY;
  private float[] mLastMotionX;
  private float[] mLastMotionY;
  private float mMaxVelocity;
  private float mMinVelocity;
  private final ViewGroup mParentView;
  private int mPointersDown;
  private boolean mReleaseInProgress;
  private OverScroller mScroller;
  private final Runnable mSetIdleRunnable = new Runnable()
  {
    public void run()
    {
      setDragState(0);
    }
  };
  private int mTouchSlop;
  private int mTrackingEdges;
  private VelocityTracker mVelocityTracker;
  
  private ViewDragHelper(@NonNull Context paramContext, @NonNull ViewGroup paramViewGroup, @NonNull Callback paramCallback)
  {
    if (paramViewGroup != null)
    {
      if (paramCallback != null)
      {
        mParentView = paramViewGroup;
        mCallback = paramCallback;
        paramViewGroup = ViewConfiguration.get(paramContext);
        int i = (int)(getResourcesgetDisplayMetricsdensity * 20.0F + 0.5F);
        mDefaultEdgeSize = i;
        mEdgeSize = i;
        mTouchSlop = paramViewGroup.getScaledTouchSlop();
        mMaxVelocity = paramViewGroup.getScaledMaximumFlingVelocity();
        mMinVelocity = paramViewGroup.getScaledMinimumFlingVelocity();
        mScroller = new OverScroller(paramContext, sInterpolator);
        return;
      }
      throw new IllegalArgumentException("Callback may not be null");
    }
    throw new IllegalArgumentException("Parent view may not be null");
  }
  
  private boolean checkNewEdgeDrag(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    int i = mInitialEdgesTouched[paramInt1];
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((i & paramInt2) == paramInt2)
    {
      bool2 = bool1;
      if ((mTrackingEdges & paramInt2) != 0)
      {
        bool2 = bool1;
        if ((mEdgeDragsLocked[paramInt1] & paramInt2) != paramInt2)
        {
          bool2 = bool1;
          if ((mEdgeDragsInProgress[paramInt1] & paramInt2) != paramInt2)
          {
            i = mTouchSlop;
            if ((paramFloat1 <= i) && (paramFloat2 <= i))
            {
              bool2 = bool1;
            }
            else
            {
              if ((paramFloat1 < paramFloat2 * 0.5F) && (mCallback.onEdgeLock(paramInt2)))
              {
                int[] arrayOfInt = mEdgeDragsLocked;
                arrayOfInt[paramInt1] |= paramInt2;
                return false;
              }
              bool2 = bool1;
              if ((mEdgeDragsInProgress[paramInt1] & paramInt2) == 0)
              {
                bool2 = bool1;
                if (paramFloat1 > mTouchSlop) {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  private boolean checkTouchSlop(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramView == null) {
      return false;
    }
    int i;
    if (mCallback.getViewHorizontalDragRange(paramView) > 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (mCallback.getViewVerticalDragRange(paramView) > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i != 0) && (j != 0))
    {
      i = mTouchSlop;
      if (paramFloat2 * paramFloat2 + paramFloat1 * paramFloat1 > i * i) {
        bool3 = true;
      }
      return bool3;
    }
    if (i != 0)
    {
      bool3 = bool1;
      if (Math.abs(paramFloat1) > mTouchSlop) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if (j != 0)
    {
      bool3 = bool2;
      if (Math.abs(paramFloat2) > mTouchSlop) {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  private float clampMag(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2) {
      return 0.0F;
    }
    if (f > paramFloat3)
    {
      if (paramFloat1 <= 0.0F) {
        paramFloat3 = -paramFloat3;
      }
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  private int clampMag(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      return 0;
    }
    if (i > paramInt3)
    {
      if (paramInt1 <= 0) {
        paramInt3 = -paramInt3;
      }
      return paramInt3;
    }
    return paramInt1;
  }
  
  private void clearMotionHistory()
  {
    float[] arrayOfFloat = mInitialMotionX;
    if (arrayOfFloat == null) {
      return;
    }
    Arrays.fill(arrayOfFloat, 0.0F);
    Arrays.fill(mInitialMotionY, 0.0F);
    Arrays.fill(mLastMotionX, 0.0F);
    Arrays.fill(mLastMotionY, 0.0F);
    Arrays.fill(mInitialEdgesTouched, 0);
    Arrays.fill(mEdgeDragsInProgress, 0);
    Arrays.fill(mEdgeDragsLocked, 0);
    mPointersDown = 0;
  }
  
  private void clearMotionHistory(int paramInt)
  {
    if ((mInitialMotionX != null) && (isPointerDown(paramInt)))
    {
      mInitialMotionX[paramInt] = 0.0F;
      mInitialMotionY[paramInt] = 0.0F;
      mLastMotionX[paramInt] = 0.0F;
      mLastMotionY[paramInt] = 0.0F;
      mInitialEdgesTouched[paramInt] = 0;
      mEdgeDragsInProgress[paramInt] = 0;
      mEdgeDragsLocked[paramInt] = 0;
      mPointersDown = (1 << paramInt & mPointersDown);
    }
  }
  
  private int computeAxisDuration(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i = mParentView.getWidth();
    int j = i / 2;
    float f1 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f2 = j;
    f1 = distanceInfluenceForSnapDuration(f1);
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {
      paramInt1 = Math.round(Math.abs((f1 * f2 + f2) / paramInt2) * 1000.0F) * 4;
    } else {
      paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F);
    }
    return Math.min(paramInt1, 600);
  }
  
  private int computeSettleDuration(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = clampMag(paramInt3, (int)mMinVelocity, (int)mMaxVelocity);
    paramInt3 = clampMag(paramInt4, (int)mMinVelocity, (int)mMaxVelocity);
    int j = Math.abs(paramInt1);
    int k = Math.abs(paramInt2);
    paramInt4 = Math.abs(i);
    int m = Math.abs(paramInt3);
    int n = paramInt4 + m;
    int i1 = j + k;
    if (i != 0)
    {
      f1 = paramInt4;
      f2 = n;
    }
    else
    {
      f1 = j;
      f2 = i1;
    }
    float f3 = f1 / f2;
    if (paramInt3 != 0)
    {
      f1 = m;
      f2 = n;
    }
    else
    {
      f1 = k;
      f2 = i1;
    }
    float f2 = f1 / f2;
    paramInt1 = computeAxisDuration(paramInt1, i, mCallback.getViewHorizontalDragRange(paramView));
    paramInt2 = computeAxisDuration(paramInt2, paramInt3, mCallback.getViewVerticalDragRange(paramView));
    float f1 = paramInt1;
    return (int)(paramInt2 * f2 + f1 * f3);
  }
  
  public static ViewDragHelper create(@NonNull ViewGroup paramViewGroup, float paramFloat, @NonNull Callback paramCallback)
  {
    paramViewGroup = create(paramViewGroup, paramCallback);
    float f = mTouchSlop;
    mTouchSlop = ((int)(1.0F / paramFloat * f));
    return paramViewGroup;
  }
  
  public static ViewDragHelper create(@NonNull ViewGroup paramViewGroup, @NonNull Callback paramCallback)
  {
    return new ViewDragHelper(paramViewGroup.getContext(), paramViewGroup, paramCallback);
  }
  
  private void dispatchViewReleased(float paramFloat1, float paramFloat2)
  {
    mReleaseInProgress = true;
    mCallback.onViewReleased(mCapturedView, paramFloat1, paramFloat2);
    mReleaseInProgress = false;
    if (mDragState == 1) {
      setDragState(0);
    }
  }
  
  private float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  private void dragTo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = mCapturedView.getLeft();
    int j = mCapturedView.getTop();
    int k = paramInt1;
    if (paramInt3 != 0)
    {
      k = mCallback.clampViewPositionHorizontal(mCapturedView, paramInt1, paramInt3);
      ViewCompat.offsetLeftAndRight(mCapturedView, k - i);
    }
    paramInt1 = paramInt2;
    if (paramInt4 != 0)
    {
      paramInt1 = mCallback.clampViewPositionVertical(mCapturedView, paramInt2, paramInt4);
      ViewCompat.offsetTopAndBottom(mCapturedView, paramInt1 - j);
    }
    if ((paramInt3 != 0) || (paramInt4 != 0)) {
      mCallback.onViewPositionChanged(mCapturedView, k, paramInt1, k - i, paramInt1 - j);
    }
  }
  
  private void ensureMotionHistorySizeForId(int paramInt)
  {
    Object localObject = mInitialMotionX;
    if ((localObject == null) || (localObject.length <= paramInt))
    {
      paramInt++;
      float[] arrayOfFloat1 = new float[paramInt];
      float[] arrayOfFloat2 = new float[paramInt];
      float[] arrayOfFloat3 = new float[paramInt];
      float[] arrayOfFloat4 = new float[paramInt];
      int[] arrayOfInt1 = new int[paramInt];
      int[] arrayOfInt2 = new int[paramInt];
      int[] arrayOfInt3 = new int[paramInt];
      if (localObject != null)
      {
        System.arraycopy(localObject, 0, arrayOfFloat1, 0, localObject.length);
        localObject = mInitialMotionY;
        System.arraycopy(localObject, 0, arrayOfFloat2, 0, localObject.length);
        localObject = mLastMotionX;
        System.arraycopy(localObject, 0, arrayOfFloat3, 0, localObject.length);
        localObject = mLastMotionY;
        System.arraycopy(localObject, 0, arrayOfFloat4, 0, localObject.length);
        localObject = mInitialEdgesTouched;
        System.arraycopy(localObject, 0, arrayOfInt1, 0, localObject.length);
        localObject = mEdgeDragsInProgress;
        System.arraycopy(localObject, 0, arrayOfInt2, 0, localObject.length);
        localObject = mEdgeDragsLocked;
        System.arraycopy(localObject, 0, arrayOfInt3, 0, localObject.length);
      }
      mInitialMotionX = arrayOfFloat1;
      mInitialMotionY = arrayOfFloat2;
      mLastMotionX = arrayOfFloat3;
      mLastMotionY = arrayOfFloat4;
      mInitialEdgesTouched = arrayOfInt1;
      mEdgeDragsInProgress = arrayOfInt2;
      mEdgeDragsLocked = arrayOfInt3;
    }
  }
  
  private boolean forceSettleCapturedViewAt(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = mCapturedView.getLeft();
    int j = mCapturedView.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      mScroller.abortAnimation();
      setDragState(0);
      return false;
    }
    paramInt3 = computeSettleDuration(mCapturedView, paramInt1, paramInt2, paramInt3, paramInt4);
    mScroller.startScroll(i, j, paramInt1, paramInt2, paramInt3);
    setDragState(2);
    return true;
  }
  
  private int getEdgesTouched(int paramInt1, int paramInt2)
  {
    if (paramInt1 < mParentView.getLeft() + mEdgeSize) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (paramInt2 < mParentView.getTop() + mEdgeSize) {
      j = i | 0x4;
    }
    int i = j;
    if (paramInt1 > mParentView.getRight() - mEdgeSize) {
      i = j | 0x2;
    }
    paramInt1 = i;
    if (paramInt2 > mParentView.getBottom() - mEdgeSize) {
      paramInt1 = i | 0x8;
    }
    return paramInt1;
  }
  
  private boolean isValidPointerForActionMove(int paramInt)
  {
    if (!isPointerDown(paramInt))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring pointerId=");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
      Log.e("ViewDragHelper", localStringBuilder.toString());
      return false;
    }
    return true;
  }
  
  private void releaseViewForPointerUp()
  {
    mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
    dispatchViewReleased(clampMag(mVelocityTracker.getXVelocity(mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(mVelocityTracker.getYVelocity(mActivePointerId), mMinVelocity, mMaxVelocity));
  }
  
  private void reportNewEdgeDrags(float paramFloat1, float paramFloat2, int paramInt)
  {
    boolean bool1 = checkNewEdgeDrag(paramFloat1, paramFloat2, paramInt, 1);
    boolean bool2 = bool1;
    if (checkNewEdgeDrag(paramFloat2, paramFloat1, paramInt, 4)) {
      j = bool1 | true;
    }
    bool1 = j;
    int i;
    if (checkNewEdgeDrag(paramFloat1, paramFloat2, paramInt, 2)) {
      i = j | 0x2;
    }
    int j = i;
    if (checkNewEdgeDrag(paramFloat2, paramFloat1, paramInt, 8)) {
      j = i | 0x8;
    }
    if (j != 0)
    {
      int[] arrayOfInt = mEdgeDragsInProgress;
      arrayOfInt[paramInt] |= j;
      mCallback.onEdgeDragStarted(j, paramInt);
    }
  }
  
  private void saveInitialMotion(float paramFloat1, float paramFloat2, int paramInt)
  {
    ensureMotionHistorySizeForId(paramInt);
    float[] arrayOfFloat = mInitialMotionX;
    mLastMotionX[paramInt] = paramFloat1;
    arrayOfFloat[paramInt] = paramFloat1;
    arrayOfFloat = mInitialMotionY;
    mLastMotionY[paramInt] = paramFloat2;
    arrayOfFloat[paramInt] = paramFloat2;
    mInitialEdgesTouched[paramInt] = getEdgesTouched((int)paramFloat1, (int)paramFloat2);
    mPointersDown |= 1 << paramInt;
  }
  
  private void saveLastMotion(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getPointerCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramMotionEvent.getPointerId(j);
      if (isValidPointerForActionMove(k))
      {
        float f1 = paramMotionEvent.getX(j);
        float f2 = paramMotionEvent.getY(j);
        mLastMotionX[k] = f1;
        mLastMotionY[k] = f2;
      }
    }
  }
  
  public void abort()
  {
    cancel();
    if (mDragState == 2)
    {
      int i = mScroller.getCurrX();
      int j = mScroller.getCurrY();
      mScroller.abortAnimation();
      int k = mScroller.getCurrX();
      int m = mScroller.getCurrY();
      mCallback.onViewPositionChanged(mCapturedView, k, m, k - i, m - j);
    }
    setDragState(0);
  }
  
  public boolean canScroll(@NonNull View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    boolean bool2 = true;
    if (bool1)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int k = localViewGroup.getChildCount() - 1; k >= 0; k--)
      {
        View localView = localViewGroup.getChildAt(k);
        int m = paramInt3 + i;
        if ((m >= localView.getLeft()) && (m < localView.getRight()))
        {
          int n = paramInt4 + j;
          if ((n >= localView.getTop()) && (n < localView.getBottom()) && (canScroll(localView, true, paramInt1, paramInt2, m - localView.getLeft(), n - localView.getTop()))) {
            return true;
          }
        }
      }
    }
    if (paramBoolean)
    {
      paramBoolean = bool2;
      if (paramView.canScrollHorizontally(-paramInt1)) {
        return paramBoolean;
      }
      if (paramView.canScrollVertically(-paramInt2)) {
        return bool2;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  public void cancel()
  {
    mActivePointerId = -1;
    clearMotionHistory();
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      mVelocityTracker = null;
    }
  }
  
  public void captureChildView(@NonNull View paramView, int paramInt)
  {
    if (paramView.getParent() == mParentView)
    {
      mCapturedView = paramView;
      mActivePointerId = paramInt;
      mCallback.onViewCaptured(paramView, paramInt);
      setDragState(1);
      return;
    }
    paramView = z2.t("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    paramView.append(mParentView);
    paramView.append(")");
    throw new IllegalArgumentException(paramView.toString());
  }
  
  public boolean checkTouchSlop(int paramInt)
  {
    int i = mInitialMotionX.length;
    for (int j = 0; j < i; j++) {
      if (checkTouchSlop(paramInt, j)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean checkTouchSlop(int paramInt1, int paramInt2)
  {
    boolean bool1 = isPointerDown(paramInt2);
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool1) {
      return false;
    }
    int i;
    if ((paramInt1 & 0x1) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramInt1 & 0x2) == 2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    float f1 = mLastMotionX[paramInt2] - mInitialMotionX[paramInt2];
    float f2 = mLastMotionY[paramInt2] - mInitialMotionY[paramInt2];
    if ((i != 0) && (paramInt1 != 0))
    {
      paramInt1 = mTouchSlop;
      if (f2 * f2 + f1 * f1 > paramInt1 * paramInt1) {
        bool4 = true;
      }
      return bool4;
    }
    if (i != 0)
    {
      bool4 = bool2;
      if (Math.abs(f1) > mTouchSlop) {
        bool4 = true;
      }
      return bool4;
    }
    bool4 = bool3;
    if (paramInt1 != 0)
    {
      bool4 = bool3;
      if (Math.abs(f2) > mTouchSlop) {
        bool4 = true;
      }
    }
    return bool4;
  }
  
  public boolean continueSettling(boolean paramBoolean)
  {
    int i = mDragState;
    boolean bool1 = false;
    if (i == 2)
    {
      boolean bool2 = mScroller.computeScrollOffset();
      int j = mScroller.getCurrX();
      int k = mScroller.getCurrY();
      int m = j - mCapturedView.getLeft();
      i = k - mCapturedView.getTop();
      if (m != 0) {
        ViewCompat.offsetLeftAndRight(mCapturedView, m);
      }
      if (i != 0) {
        ViewCompat.offsetTopAndBottom(mCapturedView, i);
      }
      if ((m != 0) || (i != 0)) {
        mCallback.onViewPositionChanged(mCapturedView, j, k, m, i);
      }
      boolean bool3 = bool2;
      if (bool2)
      {
        bool3 = bool2;
        if (j == mScroller.getFinalX())
        {
          bool3 = bool2;
          if (k == mScroller.getFinalY())
          {
            mScroller.abortAnimation();
            bool3 = false;
          }
        }
      }
      if (!bool3) {
        if (paramBoolean) {
          mParentView.post(mSetIdleRunnable);
        } else {
          setDragState(0);
        }
      }
    }
    paramBoolean = bool1;
    if (mDragState == 2) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  @Nullable
  public View findTopChildUnder(int paramInt1, int paramInt2)
  {
    for (int i = mParentView.getChildCount() - 1; i >= 0; i--)
    {
      View localView = mParentView.getChildAt(mCallback.getOrderedChildIndex(i));
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
    }
    return null;
  }
  
  public void flingCapturedView(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (mReleaseInProgress)
    {
      mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId), paramInt1, paramInt3, paramInt2, paramInt4);
      setDragState(2);
      return;
    }
    throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
  }
  
  public int getActivePointerId()
  {
    return mActivePointerId;
  }
  
  @Nullable
  public View getCapturedView()
  {
    return mCapturedView;
  }
  
  @Px
  public int getDefaultEdgeSize()
  {
    return mDefaultEdgeSize;
  }
  
  @Px
  public int getEdgeSize()
  {
    return mEdgeSize;
  }
  
  public float getMinVelocity()
  {
    return mMinVelocity;
  }
  
  @Px
  public int getTouchSlop()
  {
    return mTouchSlop;
  }
  
  public int getViewDragState()
  {
    return mDragState;
  }
  
  public boolean isCapturedViewUnder(int paramInt1, int paramInt2)
  {
    return isViewUnder(mCapturedView, paramInt1, paramInt2);
  }
  
  public boolean isEdgeTouched(int paramInt)
  {
    int i = mInitialEdgesTouched.length;
    for (int j = 0; j < i; j++) {
      if (isEdgeTouched(paramInt, j)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isEdgeTouched(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((isPointerDown(paramInt2)) && ((paramInt1 & mInitialEdgesTouched[paramInt2]) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isPointerDown(int paramInt)
  {
    int i = mPointersDown;
    boolean bool = true;
    if ((1 << paramInt & i) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isViewUnder(@Nullable View paramView, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    if (paramView == null) {
      return false;
    }
    boolean bool2 = bool1;
    if (paramInt1 >= paramView.getLeft())
    {
      bool2 = bool1;
      if (paramInt1 < paramView.getRight())
      {
        bool2 = bool1;
        if (paramInt2 >= paramView.getTop())
        {
          bool2 = bool1;
          if (paramInt2 < paramView.getBottom()) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public void processTouchEvent(@NonNull MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0) {
      cancel();
    }
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
    mVelocityTracker.addMovement(paramMotionEvent);
    int k = 0;
    int m = 0;
    float f1;
    float f2;
    if (i != 0)
    {
      if (i != 1)
      {
        Object localObject;
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 5)
            {
              if (i == 6)
              {
                k = paramMotionEvent.getPointerId(j);
                if ((mDragState == 1) && (k == mActivePointerId))
                {
                  j = paramMotionEvent.getPointerCount();
                  while (m < j)
                  {
                    i = paramMotionEvent.getPointerId(m);
                    if (i != mActivePointerId)
                    {
                      f1 = paramMotionEvent.getX(m);
                      f2 = paramMotionEvent.getY(m);
                      localObject = findTopChildUnder((int)f1, (int)f2);
                      View localView = mCapturedView;
                      if ((localObject == localView) && (tryCaptureViewForDrag(localView, i)))
                      {
                        m = mActivePointerId;
                        break label201;
                      }
                    }
                    m++;
                  }
                  m = -1;
                  label201:
                  if (m == -1) {
                    releaseViewForPointerUp();
                  }
                }
                clearMotionHistory(k);
              }
            }
            else
            {
              m = paramMotionEvent.getPointerId(j);
              f2 = paramMotionEvent.getX(j);
              f1 = paramMotionEvent.getY(j);
              saveInitialMotion(f2, f1, m);
              if (mDragState == 0)
              {
                tryCaptureViewForDrag(findTopChildUnder((int)f2, (int)f1), m);
                j = mInitialEdgesTouched[m];
                k = mTrackingEdges;
                if ((j & k) != 0) {
                  mCallback.onEdgeTouched(j & k, m);
                }
              }
              else if (isCapturedViewUnder((int)f2, (int)f1))
              {
                tryCaptureViewForDrag(mCapturedView, m);
              }
            }
          }
          else
          {
            if (mDragState == 1) {
              dispatchViewReleased(0.0F, 0.0F);
            }
            cancel();
          }
        }
        else if (mDragState == 1)
        {
          if (isValidPointerForActionMove(mActivePointerId))
          {
            m = paramMotionEvent.findPointerIndex(mActivePointerId);
            f2 = paramMotionEvent.getX(m);
            f1 = paramMotionEvent.getY(m);
            localObject = mLastMotionX;
            k = mActivePointerId;
            m = (int)(f2 - localObject[k]);
            k = (int)(f1 - mLastMotionY[k]);
            dragTo(mCapturedView.getLeft() + m, mCapturedView.getTop() + k, m, k);
            saveLastMotion(paramMotionEvent);
          }
        }
        else
        {
          j = paramMotionEvent.getPointerCount();
          for (m = k; m < j; m++)
          {
            k = paramMotionEvent.getPointerId(m);
            if (isValidPointerForActionMove(k))
            {
              float f3 = paramMotionEvent.getX(m);
              f1 = paramMotionEvent.getY(m);
              f2 = f3 - mInitialMotionX[k];
              float f4 = f1 - mInitialMotionY[k];
              reportNewEdgeDrags(f2, f4, k);
              if (mDragState == 1) {
                break;
              }
              localObject = findTopChildUnder((int)f3, (int)f1);
              if ((checkTouchSlop((View)localObject, f2, f4)) && (tryCaptureViewForDrag((View)localObject, k))) {
                break;
              }
            }
          }
          saveLastMotion(paramMotionEvent);
        }
      }
      else
      {
        if (mDragState == 1) {
          releaseViewForPointerUp();
        }
        cancel();
      }
    }
    else
    {
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      m = paramMotionEvent.getPointerId(0);
      paramMotionEvent = findTopChildUnder((int)f2, (int)f1);
      saveInitialMotion(f2, f1, m);
      tryCaptureViewForDrag(paramMotionEvent, m);
      k = mInitialEdgesTouched[m];
      j = mTrackingEdges;
      if ((k & j) != 0) {
        mCallback.onEdgeTouched(k & j, m);
      }
    }
  }
  
  public void setDragState(int paramInt)
  {
    mParentView.removeCallbacks(mSetIdleRunnable);
    if (mDragState != paramInt)
    {
      mDragState = paramInt;
      mCallback.onViewDragStateChanged(paramInt);
      if (mDragState == 0) {
        mCapturedView = null;
      }
    }
  }
  
  public void setEdgeSize(@IntRange(from=0L) @Px int paramInt)
  {
    mEdgeSize = paramInt;
  }
  
  public void setEdgeTrackingEnabled(int paramInt)
  {
    mTrackingEdges = paramInt;
  }
  
  public void setMinVelocity(float paramFloat)
  {
    mMinVelocity = paramFloat;
  }
  
  public boolean settleCapturedViewAt(int paramInt1, int paramInt2)
  {
    if (mReleaseInProgress) {
      return forceSettleCapturedViewAt(paramInt1, paramInt2, (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId));
    }
    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
  }
  
  public boolean shouldInterceptTouchEvent(@NonNull MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0) {
      cancel();
    }
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
    mVelocityTracker.addMovement(paramMotionEvent);
    float f1;
    float f2;
    int k;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i == 3) {
            break label493;
          }
          if (i != 5) {
            if (i != 6) {
              break label593;
            }
          }
        }
      }
      for (;;)
      {
        clearMotionHistory(paramMotionEvent.getPointerId(j));
        continue;
        i = paramMotionEvent.getPointerId(j);
        f1 = paramMotionEvent.getX(j);
        f2 = paramMotionEvent.getY(j);
        saveInitialMotion(f1, f2, i);
        j = mDragState;
        if (j == 0)
        {
          k = mInitialEdgesTouched[i];
          j = mTrackingEdges;
          if ((k & j) != 0) {
            mCallback.onEdgeTouched(k & j, i);
          }
        }
        else if (j == 2)
        {
          paramMotionEvent = findTopChildUnder((int)f1, (int)f2);
          if (paramMotionEvent == mCapturedView)
          {
            tryCaptureViewForDrag(paramMotionEvent, i);
            continue;
            if ((mInitialMotionX != null) && (mInitialMotionY != null))
            {
              k = paramMotionEvent.getPointerCount();
              for (i = 0; i < k; i++)
              {
                int m = paramMotionEvent.getPointerId(i);
                if (isValidPointerForActionMove(m))
                {
                  float f3 = paramMotionEvent.getX(i);
                  float f4 = paramMotionEvent.getY(i);
                  f2 = f3 - mInitialMotionX[m];
                  f1 = f4 - mInitialMotionY[m];
                  View localView = findTopChildUnder((int)f3, (int)f4);
                  if ((localView != null) && (checkTouchSlop(localView, f2, f1))) {
                    j = 1;
                  } else {
                    j = 0;
                  }
                  if (j != 0)
                  {
                    int n = localView.getLeft();
                    int i1 = (int)f2;
                    i1 = mCallback.clampViewPositionHorizontal(localView, n + i1, i1);
                    int i2 = localView.getTop();
                    int i3 = (int)f1;
                    int i4 = mCallback.clampViewPositionVertical(localView, i2 + i3, i3);
                    int i5 = mCallback.getViewHorizontalDragRange(localView);
                    i3 = mCallback.getViewVerticalDragRange(localView);
                    if (((i5 == 0) || ((i5 > 0) && (i1 == n))) && ((i3 == 0) || ((i3 > 0) && (i4 == i2)))) {
                      break;
                    }
                  }
                  else
                  {
                    reportNewEdgeDrags(f2, f1, m);
                    if ((mDragState == 1) || ((j != 0) && (tryCaptureViewForDrag(localView, m)))) {
                      break;
                    }
                  }
                }
              }
              saveLastMotion(paramMotionEvent);
              continue;
              label493:
              cancel();
            }
          }
        }
      }
    }
    else
    {
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      i = paramMotionEvent.getPointerId(0);
      saveInitialMotion(f2, f1, i);
      paramMotionEvent = findTopChildUnder((int)f2, (int)f1);
      if ((paramMotionEvent == mCapturedView) && (mDragState == 2)) {
        tryCaptureViewForDrag(paramMotionEvent, i);
      }
      j = mInitialEdgesTouched[i];
      k = mTrackingEdges;
      if ((j & k) != 0) {
        mCallback.onEdgeTouched(j & k, i);
      }
    }
    label593:
    boolean bool = false;
    if (mDragState == 1) {
      bool = true;
    }
    return bool;
  }
  
  public boolean smoothSlideViewTo(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    mCapturedView = paramView;
    mActivePointerId = -1;
    boolean bool = forceSettleCapturedViewAt(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (mDragState == 0) && (mCapturedView != null)) {
      mCapturedView = null;
    }
    return bool;
  }
  
  public boolean tryCaptureViewForDrag(View paramView, int paramInt)
  {
    if ((paramView == mCapturedView) && (mActivePointerId == paramInt)) {
      return true;
    }
    if ((paramView != null) && (mCallback.tryCaptureView(paramView, paramInt)))
    {
      mActivePointerId = paramInt;
      captureChildView(paramView, paramInt);
      return true;
    }
    return false;
  }
  
  public static abstract class Callback
  {
    public int clampViewPositionHorizontal(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      return 0;
    }
    
    public int clampViewPositionVertical(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      return 0;
    }
    
    public int getOrderedChildIndex(int paramInt)
    {
      return paramInt;
    }
    
    public int getViewHorizontalDragRange(@NonNull View paramView)
    {
      return 0;
    }
    
    public int getViewVerticalDragRange(@NonNull View paramView)
    {
      return 0;
    }
    
    public void onEdgeDragStarted(int paramInt1, int paramInt2) {}
    
    public boolean onEdgeLock(int paramInt)
    {
      return false;
    }
    
    public void onEdgeTouched(int paramInt1, int paramInt2) {}
    
    public void onViewCaptured(@NonNull View paramView, int paramInt) {}
    
    public void onViewDragStateChanged(int paramInt) {}
    
    public void onViewPositionChanged(@NonNull View paramView, int paramInt1, int paramInt2, @Px int paramInt3, @Px int paramInt4) {}
    
    public void onViewReleased(@NonNull View paramView, float paramFloat1, float paramFloat2) {}
    
    public abstract boolean tryCaptureView(@NonNull View paramView, int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.ViewDragHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
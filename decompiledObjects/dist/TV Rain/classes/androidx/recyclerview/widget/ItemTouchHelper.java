package androidx.recyclerview.widget;

import a;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.dimen;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper
  extends RecyclerView.ItemDecoration
  implements RecyclerView.OnChildAttachStateChangeListener
{
  public static final int ACTION_MODE_DRAG_MASK = 16711680;
  private static final int ACTION_MODE_IDLE_MASK = 255;
  public static final int ACTION_MODE_SWIPE_MASK = 65280;
  public static final int ACTION_STATE_DRAG = 2;
  public static final int ACTION_STATE_IDLE = 0;
  public static final int ACTION_STATE_SWIPE = 1;
  private static final int ACTIVE_POINTER_ID_NONE = -1;
  public static final int ANIMATION_TYPE_DRAG = 8;
  public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
  public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
  private static final boolean DEBUG = false;
  public static final int DIRECTION_FLAG_COUNT = 8;
  public static final int DOWN = 2;
  public static final int END = 32;
  public static final int LEFT = 4;
  private static final int PIXELS_PER_SECOND = 1000;
  public static final int RIGHT = 8;
  public static final int START = 16;
  private static final String TAG = "ItemTouchHelper";
  public static final int UP = 1;
  private int mActionState = 0;
  public int mActivePointerId = -1;
  @NonNull
  public Callback mCallback;
  private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
  private List<Integer> mDistances;
  private long mDragScrollStartTimeInMs;
  public float mDx;
  public float mDy;
  public GestureDetectorCompat mGestureDetector;
  public float mInitialTouchX;
  public float mInitialTouchY;
  private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
  private float mMaxSwipeVelocity;
  private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener()
  {
    public boolean onInterceptTouchEvent(@NonNull RecyclerView paramAnonymousRecyclerView, @NonNull MotionEvent paramAnonymousMotionEvent)
    {
      mGestureDetector.onTouchEvent(paramAnonymousMotionEvent);
      int i = paramAnonymousMotionEvent.getActionMasked();
      boolean bool = true;
      if (i == 0)
      {
        mActivePointerId = paramAnonymousMotionEvent.getPointerId(0);
        mInitialTouchX = paramAnonymousMotionEvent.getX();
        mInitialTouchY = paramAnonymousMotionEvent.getY();
        obtainVelocityTracker();
        paramAnonymousRecyclerView = ItemTouchHelper.this;
        if (mSelected == null)
        {
          paramAnonymousRecyclerView = paramAnonymousRecyclerView.findAnimation(paramAnonymousMotionEvent);
          if (paramAnonymousRecyclerView != null)
          {
            ItemTouchHelper localItemTouchHelper = ItemTouchHelper.this;
            mInitialTouchX -= mX;
            mInitialTouchY -= mY;
            localItemTouchHelper.endRecoverAnimation(mViewHolder, true);
            if (mPendingCleanup.remove(mViewHolder.itemView))
            {
              localItemTouchHelper = ItemTouchHelper.this;
              mCallback.clearView(mRecyclerView, mViewHolder);
            }
            select(mViewHolder, mActionState);
            paramAnonymousRecyclerView = ItemTouchHelper.this;
            paramAnonymousRecyclerView.updateDxDy(paramAnonymousMotionEvent, mSelectedFlags, 0);
          }
        }
      }
      else if ((i != 3) && (i != 1))
      {
        int j = mActivePointerId;
        if (j != -1)
        {
          j = paramAnonymousMotionEvent.findPointerIndex(j);
          if (j >= 0) {
            checkSelectForSwipe(i, paramAnonymousMotionEvent, j);
          }
        }
      }
      else
      {
        paramAnonymousRecyclerView = ItemTouchHelper.this;
        mActivePointerId = -1;
        paramAnonymousRecyclerView.select(null, 0);
      }
      paramAnonymousRecyclerView = mVelocityTracker;
      if (paramAnonymousRecyclerView != null) {
        paramAnonymousRecyclerView.addMovement(paramAnonymousMotionEvent);
      }
      if (mSelected == null) {
        bool = false;
      }
      return bool;
    }
    
    public void onRequestDisallowInterceptTouchEvent(boolean paramAnonymousBoolean)
    {
      if (!paramAnonymousBoolean) {
        return;
      }
      select(null, 0);
    }
    
    public void onTouchEvent(@NonNull RecyclerView paramAnonymousRecyclerView, @NonNull MotionEvent paramAnonymousMotionEvent)
    {
      mGestureDetector.onTouchEvent(paramAnonymousMotionEvent);
      paramAnonymousRecyclerView = mVelocityTracker;
      if (paramAnonymousRecyclerView != null) {
        paramAnonymousRecyclerView.addMovement(paramAnonymousMotionEvent);
      }
      if (mActivePointerId == -1) {
        return;
      }
      int i = paramAnonymousMotionEvent.getActionMasked();
      int j = paramAnonymousMotionEvent.findPointerIndex(mActivePointerId);
      if (j >= 0) {
        checkSelectForSwipe(i, paramAnonymousMotionEvent, j);
      }
      paramAnonymousRecyclerView = ItemTouchHelper.this;
      RecyclerView.ViewHolder localViewHolder = mSelected;
      if (localViewHolder == null) {
        return;
      }
      int k = 0;
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 6) {
              return;
            }
            j = paramAnonymousMotionEvent.getActionIndex();
            i = paramAnonymousMotionEvent.getPointerId(j);
            paramAnonymousRecyclerView = ItemTouchHelper.this;
            if (i != mActivePointerId) {
              return;
            }
            if (j == 0) {
              k = 1;
            }
            mActivePointerId = paramAnonymousMotionEvent.getPointerId(k);
            paramAnonymousRecyclerView = ItemTouchHelper.this;
            paramAnonymousRecyclerView.updateDxDy(paramAnonymousMotionEvent, mSelectedFlags, j);
            return;
          }
          paramAnonymousRecyclerView = mVelocityTracker;
          if (paramAnonymousRecyclerView != null) {
            paramAnonymousRecyclerView.clear();
          }
        }
        else
        {
          if (j < 0) {
            return;
          }
          paramAnonymousRecyclerView.updateDxDy(paramAnonymousMotionEvent, mSelectedFlags, j);
          moveIfNecessary(localViewHolder);
          paramAnonymousRecyclerView = ItemTouchHelper.this;
          mRecyclerView.removeCallbacks(mScrollRunnable);
          mScrollRunnable.run();
          mRecyclerView.invalidate();
          return;
        }
      }
      select(null, 0);
      mActivePointerId = -1;
    }
  };
  public View mOverdrawChild = null;
  public int mOverdrawChildPosition = -1;
  public final List<View> mPendingCleanup = new ArrayList();
  @VisibleForTesting
  public List<RecoverAnimation> mRecoverAnimations = new ArrayList();
  public RecyclerView mRecyclerView;
  public final Runnable mScrollRunnable = new Runnable()
  {
    public void run()
    {
      Object localObject = ItemTouchHelper.this;
      if ((mSelected != null) && (((ItemTouchHelper)localObject).scrollIfNecessary()))
      {
        ItemTouchHelper localItemTouchHelper = ItemTouchHelper.this;
        localObject = mSelected;
        if (localObject != null) {
          localItemTouchHelper.moveIfNecessary((RecyclerView.ViewHolder)localObject);
        }
        localObject = ItemTouchHelper.this;
        mRecyclerView.removeCallbacks(mScrollRunnable);
        ViewCompat.postOnAnimation(mRecyclerView, this);
      }
    }
  };
  public RecyclerView.ViewHolder mSelected = null;
  public int mSelectedFlags;
  private float mSelectedStartX;
  private float mSelectedStartY;
  private int mSlop;
  private List<RecyclerView.ViewHolder> mSwapTargets;
  private float mSwipeEscapeVelocity;
  private final float[] mTmpPosition = new float[2];
  private Rect mTmpRect;
  public VelocityTracker mVelocityTracker;
  
  public ItemTouchHelper(@NonNull Callback paramCallback)
  {
    mCallback = paramCallback;
  }
  
  private void addChildDrawingOrderCallback() {}
  
  private int checkHorizontalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if ((paramInt & 0xC) != 0)
    {
      float f1 = mDx;
      int i = 8;
      int j;
      if (f1 > 0.0F) {
        j = 8;
      } else {
        j = 4;
      }
      VelocityTracker localVelocityTracker = mVelocityTracker;
      if ((localVelocityTracker != null) && (mActivePointerId > -1))
      {
        localVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
        f2 = mVelocityTracker.getXVelocity(mActivePointerId);
        f1 = mVelocityTracker.getYVelocity(mActivePointerId);
        if (f2 <= 0.0F) {
          i = 4;
        }
        f2 = Math.abs(f2);
        if (((i & paramInt) != 0) && (j == i) && (f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity)) && (f2 > Math.abs(f1))) {
          return i;
        }
      }
      f1 = mRecyclerView.getWidth();
      float f2 = mCallback.getSwipeThreshold(paramViewHolder);
      if (((paramInt & j) != 0) && (Math.abs(mDx) > f2 * f1)) {
        return j;
      }
    }
    return 0;
  }
  
  private int checkVerticalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if ((paramInt & 0x3) != 0)
    {
      float f1 = mDy;
      int i = 2;
      int j;
      if (f1 > 0.0F) {
        j = 2;
      } else {
        j = 1;
      }
      VelocityTracker localVelocityTracker = mVelocityTracker;
      if ((localVelocityTracker != null) && (mActivePointerId > -1))
      {
        localVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
        f1 = mVelocityTracker.getXVelocity(mActivePointerId);
        f2 = mVelocityTracker.getYVelocity(mActivePointerId);
        if (f2 <= 0.0F) {
          i = 1;
        }
        f2 = Math.abs(f2);
        if (((i & paramInt) != 0) && (i == j) && (f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity)) && (f2 > Math.abs(f1))) {
          return i;
        }
      }
      f1 = mRecyclerView.getHeight();
      float f2 = mCallback.getSwipeThreshold(paramViewHolder);
      if (((paramInt & j) != 0) && (Math.abs(mDy) > f2 * f1)) {
        return j;
      }
    }
    return 0;
  }
  
  private void destroyCallbacks()
  {
    mRecyclerView.removeItemDecoration(this);
    mRecyclerView.removeOnItemTouchListener(mOnItemTouchListener);
    mRecyclerView.removeOnChildAttachStateChangeListener(this);
    for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
    {
      RecoverAnimation localRecoverAnimation = (RecoverAnimation)mRecoverAnimations.get(0);
      localRecoverAnimation.cancel();
      mCallback.clearView(mRecyclerView, mViewHolder);
    }
    mRecoverAnimations.clear();
    mOverdrawChild = null;
    mOverdrawChildPosition = -1;
    releaseVelocityTracker();
    stopGestureDetection();
  }
  
  private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = paramViewHolder;
    Object localObject2 = mSwapTargets;
    if (localObject2 == null)
    {
      mSwapTargets = new ArrayList();
      mDistances = new ArrayList();
    }
    else
    {
      ((List)localObject2).clear();
      mDistances.clear();
    }
    int i = mCallback.getBoundingBoxMargin();
    int j = Math.round(mSelectedStartX + mDx) - i;
    int k = Math.round(mSelectedStartY + mDy) - i;
    int m = itemView.getWidth();
    i *= 2;
    int n = m + j + i;
    int i1 = itemView.getHeight() + k + i;
    int i2 = (j + n) / 2;
    int i3 = (k + i1) / 2;
    localObject1 = mRecyclerView.getLayoutManager();
    int i4 = ((RecyclerView.LayoutManager)localObject1).getChildCount();
    for (m = 0; m < i4; m++)
    {
      View localView = ((RecyclerView.LayoutManager)localObject1).getChildAt(m);
      if ((localView != itemView) && (localView.getBottom() >= k) && (localView.getTop() <= i1) && (localView.getRight() >= j) && (localView.getLeft() <= n))
      {
        localObject2 = mRecyclerView.getChildViewHolder(localView);
        if (mCallback.canDropOver(mRecyclerView, mSelected, (RecyclerView.ViewHolder)localObject2))
        {
          i = localView.getLeft();
          i = Math.abs(i2 - (localView.getRight() + i) / 2);
          int i5 = localView.getTop();
          i5 = Math.abs(i3 - (localView.getBottom() + i5) / 2);
          int i6 = i5 * i5 + i * i;
          int i7 = mSwapTargets.size();
          i = 0;
          i5 = 0;
          while ((i < i7) && (i6 > ((Integer)mDistances.get(i)).intValue()))
          {
            i5++;
            i++;
          }
          mSwapTargets.add(i5, localObject2);
          mDistances.add(i5, Integer.valueOf(i6));
        }
      }
    }
    return mSwapTargets;
  }
  
  private RecyclerView.ViewHolder findSwipedView(MotionEvent paramMotionEvent)
  {
    RecyclerView.LayoutManager localLayoutManager = mRecyclerView.getLayoutManager();
    int i = mActivePointerId;
    if (i == -1) {
      return null;
    }
    i = paramMotionEvent.findPointerIndex(i);
    float f1 = paramMotionEvent.getX(i);
    float f2 = mInitialTouchX;
    float f3 = paramMotionEvent.getY(i);
    float f4 = mInitialTouchY;
    f2 = Math.abs(f1 - f2);
    f3 = Math.abs(f3 - f4);
    i = mSlop;
    if ((f2 < i) && (f3 < i)) {
      return null;
    }
    if ((f2 > f3) && (localLayoutManager.canScrollHorizontally())) {
      return null;
    }
    if ((f3 > f2) && (localLayoutManager.canScrollVertically())) {
      return null;
    }
    paramMotionEvent = findChildView(paramMotionEvent);
    if (paramMotionEvent == null) {
      return null;
    }
    return mRecyclerView.getChildViewHolder(paramMotionEvent);
  }
  
  private void getSelectedDxDy(float[] paramArrayOfFloat)
  {
    if ((mSelectedFlags & 0xC) != 0) {
      paramArrayOfFloat[0] = (mSelectedStartX + mDx - mSelected.itemView.getLeft());
    } else {
      paramArrayOfFloat[0] = mSelected.itemView.getTranslationX();
    }
    if ((mSelectedFlags & 0x3) != 0) {
      paramArrayOfFloat[1] = (mSelectedStartY + mDy - mSelected.itemView.getTop());
    } else {
      paramArrayOfFloat[1] = mSelected.itemView.getTranslationY();
    }
  }
  
  private static boolean hitTest(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool;
    if ((paramFloat1 >= paramFloat3) && (paramFloat1 <= paramFloat3 + paramView.getWidth()) && (paramFloat2 >= paramFloat4) && (paramFloat2 <= paramFloat4 + paramView.getHeight())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void releaseVelocityTracker()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      mVelocityTracker = null;
    }
  }
  
  private void setupCallbacks()
  {
    mSlop = ViewConfiguration.get(mRecyclerView.getContext()).getScaledTouchSlop();
    mRecyclerView.addItemDecoration(this);
    mRecyclerView.addOnItemTouchListener(mOnItemTouchListener);
    mRecyclerView.addOnChildAttachStateChangeListener(this);
    startGestureDetection();
  }
  
  private void startGestureDetection()
  {
    mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
    mGestureDetector = new GestureDetectorCompat(mRecyclerView.getContext(), mItemTouchHelperGestureListener);
  }
  
  private void stopGestureDetection()
  {
    ItemTouchHelperGestureListener localItemTouchHelperGestureListener = mItemTouchHelperGestureListener;
    if (localItemTouchHelperGestureListener != null)
    {
      localItemTouchHelperGestureListener.doNotReactToLongPress();
      mItemTouchHelperGestureListener = null;
    }
    if (mGestureDetector != null) {
      mGestureDetector = null;
    }
  }
  
  private int swipeIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    if (mActionState == 2) {
      return 0;
    }
    int i = mCallback.getMovementFlags(mRecyclerView, paramViewHolder);
    int j = (mCallback.convertToAbsoluteDirection(i, ViewCompat.getLayoutDirection(mRecyclerView)) & 0xFF00) >> 8;
    if (j == 0) {
      return 0;
    }
    int k = (i & 0xFF00) >> 8;
    if (Math.abs(mDx) > Math.abs(mDy))
    {
      i = checkHorizontalSwipe(paramViewHolder, j);
      if (i > 0)
      {
        if ((k & i) == 0) {
          return Callback.convertToRelativeDirection(i, ViewCompat.getLayoutDirection(mRecyclerView));
        }
        return i;
      }
      j = checkVerticalSwipe(paramViewHolder, j);
      if (j > 0) {
        return j;
      }
    }
    else
    {
      i = checkVerticalSwipe(paramViewHolder, j);
      if (i > 0) {
        return i;
      }
      i = checkHorizontalSwipe(paramViewHolder, j);
      if (i > 0)
      {
        j = i;
        if ((k & i) == 0) {
          j = Callback.convertToRelativeDirection(i, ViewCompat.getLayoutDirection(mRecyclerView));
        }
        return j;
      }
    }
    return 0;
  }
  
  public void attachToRecyclerView(@Nullable RecyclerView paramRecyclerView)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView == paramRecyclerView) {
      return;
    }
    if (localRecyclerView != null) {
      destroyCallbacks();
    }
    mRecyclerView = paramRecyclerView;
    if (paramRecyclerView != null)
    {
      paramRecyclerView = paramRecyclerView.getResources();
      mSwipeEscapeVelocity = paramRecyclerView.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
      mMaxSwipeVelocity = paramRecyclerView.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
      setupCallbacks();
    }
  }
  
  public void checkSelectForSwipe(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    if ((mSelected == null) && (paramInt1 == 2) && (mActionState != 2) && (mCallback.isItemViewSwipeEnabled()))
    {
      if (mRecyclerView.getScrollState() == 1) {
        return;
      }
      RecyclerView.ViewHolder localViewHolder = findSwipedView(paramMotionEvent);
      if (localViewHolder == null) {
        return;
      }
      paramInt1 = (mCallback.getAbsoluteMovementFlags(mRecyclerView, localViewHolder) & 0xFF00) >> 8;
      if (paramInt1 == 0) {
        return;
      }
      float f1 = paramMotionEvent.getX(paramInt2);
      float f2 = paramMotionEvent.getY(paramInt2);
      f1 -= mInitialTouchX;
      float f3 = f2 - mInitialTouchY;
      float f4 = Math.abs(f1);
      f2 = Math.abs(f3);
      paramInt2 = mSlop;
      if ((f4 < paramInt2) && (f2 < paramInt2)) {
        return;
      }
      if (f4 > f2)
      {
        if ((f1 < 0.0F) && ((paramInt1 & 0x4) == 0)) {
          return;
        }
        if ((f1 <= 0.0F) || ((paramInt1 & 0x8) != 0)) {}
      }
      else
      {
        if ((f3 < 0.0F) && ((paramInt1 & 0x1) == 0)) {
          return;
        }
        if ((f3 > 0.0F) && ((paramInt1 & 0x2) == 0)) {
          return;
        }
      }
      mDy = 0.0F;
      mDx = 0.0F;
      mActivePointerId = paramMotionEvent.getPointerId(0);
      select(localViewHolder, 1);
    }
  }
  
  public void endRecoverAnimation(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
    {
      RecoverAnimation localRecoverAnimation = (RecoverAnimation)mRecoverAnimations.get(i);
      if (mViewHolder == paramViewHolder)
      {
        mOverridden |= paramBoolean;
        if (!mEnded) {
          localRecoverAnimation.cancel();
        }
        mRecoverAnimations.remove(i);
        return;
      }
    }
  }
  
  public RecoverAnimation findAnimation(MotionEvent paramMotionEvent)
  {
    if (mRecoverAnimations.isEmpty()) {
      return null;
    }
    paramMotionEvent = findChildView(paramMotionEvent);
    for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
    {
      RecoverAnimation localRecoverAnimation = (RecoverAnimation)mRecoverAnimations.get(i);
      if (mViewHolder.itemView == paramMotionEvent) {
        return localRecoverAnimation;
      }
    }
    return null;
  }
  
  public View findChildView(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    paramMotionEvent = mSelected;
    if (paramMotionEvent != null)
    {
      paramMotionEvent = itemView;
      if (hitTest(paramMotionEvent, f1, f2, mSelectedStartX + mDx, mSelectedStartY + mDy)) {
        return paramMotionEvent;
      }
    }
    for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
    {
      RecoverAnimation localRecoverAnimation = (RecoverAnimation)mRecoverAnimations.get(i);
      paramMotionEvent = mViewHolder.itemView;
      if (hitTest(paramMotionEvent, f1, f2, mX, mY)) {
        return paramMotionEvent;
      }
    }
    return mRecyclerView.findChildViewUnder(f1, f2);
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    paramRect.setEmpty();
  }
  
  public boolean hasRunningRecoverAnim()
  {
    int i = mRecoverAnimations.size();
    for (int j = 0; j < i; j++) {
      if (!mRecoverAnimations.get(j)).mEnded) {
        return true;
      }
    }
    return false;
  }
  
  public void moveIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    if (mRecyclerView.isLayoutRequested()) {
      return;
    }
    if (mActionState != 2) {
      return;
    }
    float f = mCallback.getMoveThreshold(paramViewHolder);
    int i = (int)(mSelectedStartX + mDx);
    int j = (int)(mSelectedStartY + mDy);
    if ((Math.abs(j - itemView.getTop()) < itemView.getHeight() * f) && (Math.abs(i - itemView.getLeft()) < itemView.getWidth() * f)) {
      return;
    }
    Object localObject = findSwapTargets(paramViewHolder);
    if (((List)localObject).size() == 0) {
      return;
    }
    localObject = mCallback.chooseDropTarget(paramViewHolder, (List)localObject, i, j);
    if (localObject == null)
    {
      mSwapTargets.clear();
      mDistances.clear();
      return;
    }
    int k = ((RecyclerView.ViewHolder)localObject).getAbsoluteAdapterPosition();
    int m = paramViewHolder.getAbsoluteAdapterPosition();
    if (mCallback.onMove(mRecyclerView, paramViewHolder, (RecyclerView.ViewHolder)localObject)) {
      mCallback.onMoved(mRecyclerView, paramViewHolder, m, (RecyclerView.ViewHolder)localObject, k, i, j);
    }
  }
  
  public void obtainVelocityTracker()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.recycle();
    }
    mVelocityTracker = VelocityTracker.obtain();
  }
  
  public void onChildViewAttachedToWindow(@NonNull View paramView) {}
  
  public void onChildViewDetachedFromWindow(@NonNull View paramView)
  {
    removeChildDrawingOrderCallbackIfNecessary(paramView);
    paramView = mRecyclerView.getChildViewHolder(paramView);
    if (paramView == null) {
      return;
    }
    RecyclerView.ViewHolder localViewHolder = mSelected;
    if ((localViewHolder != null) && (paramView == localViewHolder))
    {
      select(null, 0);
    }
    else
    {
      endRecoverAnimation(paramView, false);
      if (mPendingCleanup.remove(itemView)) {
        mCallback.clearView(mRecyclerView, paramView);
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    mOverdrawChildPosition = -1;
    float f1;
    float f2;
    if (mSelected != null)
    {
      getSelectedDxDy(mTmpPosition);
      paramState = mTmpPosition;
      f1 = paramState[0];
      f2 = paramState[1];
    }
    else
    {
      f1 = 0.0F;
      f2 = f1;
    }
    mCallback.onDraw(paramCanvas, paramRecyclerView, mSelected, mRecoverAnimations, mActionState, f1, f2);
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    float f1;
    float f2;
    if (mSelected != null)
    {
      getSelectedDxDy(mTmpPosition);
      paramState = mTmpPosition;
      f1 = paramState[0];
      f2 = paramState[1];
    }
    else
    {
      f1 = 0.0F;
      f2 = f1;
    }
    mCallback.onDrawOver(paramCanvas, paramRecyclerView, mSelected, mRecoverAnimations, mActionState, f1, f2);
  }
  
  public void postDispatchSwipe(final RecoverAnimation paramRecoverAnimation, final int paramInt)
  {
    mRecyclerView.post(new Runnable()
    {
      public void run()
      {
        Object localObject = mRecyclerView;
        if ((localObject != null) && (((RecyclerView)localObject).isAttachedToWindow()))
        {
          localObject = paramRecoverAnimation;
          if ((!mOverridden) && (mViewHolder.getAbsoluteAdapterPosition() != -1))
          {
            localObject = mRecyclerView.getItemAnimator();
            if (((localObject == null) || (!((RecyclerView.ItemAnimator)localObject).isRunning(null))) && (!hasRunningRecoverAnim())) {
              mCallback.onSwiped(paramRecoverAnimationmViewHolder, paramInt);
            } else {
              mRecyclerView.post(this);
            }
          }
        }
      }
    });
  }
  
  public void removeChildDrawingOrderCallbackIfNecessary(View paramView)
  {
    if (paramView == mOverdrawChild)
    {
      mOverdrawChild = null;
      if (mChildDrawingOrderCallback != null) {
        mRecyclerView.setChildDrawingOrderCallback(null);
      }
    }
  }
  
  public boolean scrollIfNecessary()
  {
    if (mSelected == null)
    {
      mDragScrollStartTimeInMs = Long.MIN_VALUE;
      return false;
    }
    long l1 = System.currentTimeMillis();
    long l2 = mDragScrollStartTimeInMs;
    if (l2 == Long.MIN_VALUE) {
      l2 = 0L;
    } else {
      l2 = l1 - l2;
    }
    RecyclerView.LayoutManager localLayoutManager = mRecyclerView.getLayoutManager();
    if (mTmpRect == null) {
      mTmpRect = new Rect();
    }
    localLayoutManager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
    int j;
    float f;
    if (localLayoutManager.canScrollHorizontally())
    {
      i = (int)(mSelectedStartX + mDx);
      j = i - mTmpRect.left - mRecyclerView.getPaddingLeft();
      f = mDx;
      if ((f >= 0.0F) || (j >= 0)) {
        do
        {
          if (f <= 0.0F) {
            break;
          }
          j = mSelected.itemView.getWidth() + i + mTmpRect.right - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
        } while (j > 0);
      }
    }
    else
    {
      j = 0;
    }
    if (localLayoutManager.canScrollVertically())
    {
      k = (int)(mSelectedStartY + mDy);
      i = k - mTmpRect.top - mRecyclerView.getPaddingTop();
      f = mDy;
      if ((f < 0.0F) && (i < 0)) {}
      do
      {
        k = i;
        break label325;
        if (f <= 0.0F) {
          break;
        }
        i = mSelected.itemView.getHeight() + k + mTmpRect.bottom - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
      } while (i > 0);
    }
    int k = 0;
    label325:
    int i = j;
    if (j != 0) {
      i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), j, mRecyclerView.getWidth(), l2);
    }
    if (k != 0) {
      k = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), k, mRecyclerView.getHeight(), l2);
    }
    if ((i == 0) && (k == 0))
    {
      mDragScrollStartTimeInMs = Long.MIN_VALUE;
      return false;
    }
    if (mDragScrollStartTimeInMs == Long.MIN_VALUE) {
      mDragScrollStartTimeInMs = l1;
    }
    mRecyclerView.scrollBy(i, k);
    return true;
  }
  
  public void select(@Nullable RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if ((paramViewHolder == mSelected) && (paramInt == mActionState)) {
      return;
    }
    mDragScrollStartTimeInMs = Long.MIN_VALUE;
    int i = mActionState;
    endRecoverAnimation(paramViewHolder, true);
    mActionState = paramInt;
    if (paramInt == 2) {
      if (paramViewHolder != null)
      {
        mOverdrawChild = itemView;
        addChildDrawingOrderCallback();
      }
      else
      {
        throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
      }
    }
    final Object localObject = mSelected;
    int k;
    if (localObject != null)
    {
      if (itemView.getParent() != null)
      {
        final int j;
        if (i == 2) {
          j = 0;
        } else {
          j = swipeIfNecessary((RecyclerView.ViewHolder)localObject);
        }
        releaseVelocityTracker();
        float f1;
        float f2;
        if ((j != 1) && (j != 2))
        {
          if ((j != 4) && (j != 8) && (j != 16) && (j != 32))
          {
            f1 = 0.0F;
            f2 = f1;
          }
          else
          {
            f1 = Math.signum(mDx);
            f3 = mRecyclerView.getWidth();
            f2 = 0.0F;
            f1 *= f3;
          }
        }
        else
        {
          f2 = Math.signum(mDy);
          f3 = mRecyclerView.getHeight();
          f1 = 0.0F;
          f2 *= f3;
        }
        if (i == 2) {
          k = 8;
        } else if (j > 0) {
          k = 2;
        } else {
          k = 4;
        }
        getSelectedDxDy(mTmpPosition);
        float[] arrayOfFloat = mTmpPosition;
        float f3 = arrayOfFloat[0];
        float f4 = arrayOfFloat[1];
        localObject = new RecoverAnimation((RecyclerView.ViewHolder)localObject, k, i, f3, f4, f1, f2)
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            super.onAnimationEnd(paramAnonymousAnimator);
            if (mOverridden) {
              return;
            }
            if (j <= 0)
            {
              paramAnonymousAnimator = ItemTouchHelper.this;
              mCallback.clearView(mRecyclerView, localObject);
            }
            else
            {
              mPendingCleanup.add(localObjectitemView);
              mIsPendingCleanup = true;
              int i = j;
              if (i > 0) {
                postDispatchSwipe(this, i);
              }
            }
            paramAnonymousAnimator = ItemTouchHelper.this;
            View localView1 = mOverdrawChild;
            View localView2 = localObjectitemView;
            if (localView1 == localView2) {
              paramAnonymousAnimator.removeChildDrawingOrderCallbackIfNecessary(localView2);
            }
          }
        };
        ((RecoverAnimation)localObject).setDuration(mCallback.getAnimationDuration(mRecyclerView, k, f1 - f3, f2 - f4));
        mRecoverAnimations.add(localObject);
        ((RecoverAnimation)localObject).start();
        k = 1;
      }
      else
      {
        removeChildDrawingOrderCallbackIfNecessary(itemView);
        mCallback.clearView(mRecyclerView, (RecyclerView.ViewHolder)localObject);
        k = 0;
      }
      mSelected = null;
    }
    else
    {
      k = 0;
    }
    if (paramViewHolder != null)
    {
      mSelectedFlags = ((mCallback.getAbsoluteMovementFlags(mRecyclerView, paramViewHolder) & (1 << paramInt * 8 + 8) - 1) >> mActionState * 8);
      mSelectedStartX = itemView.getLeft();
      mSelectedStartY = itemView.getTop();
      mSelected = paramViewHolder;
      if (paramInt == 2) {
        itemView.performHapticFeedback(0);
      }
    }
    paramViewHolder = mRecyclerView.getParent();
    if (paramViewHolder != null)
    {
      boolean bool;
      if (mSelected != null) {
        bool = true;
      } else {
        bool = false;
      }
      paramViewHolder.requestDisallowInterceptTouchEvent(bool);
    }
    if (k == 0) {
      mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
    }
    mCallback.onSelectedChanged(mSelected, mActionState);
    mRecyclerView.invalidate();
  }
  
  public void startDrag(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    if (!mCallback.hasDragFlag(mRecyclerView, paramViewHolder))
    {
      Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
      return;
    }
    if (itemView.getParent() != mRecyclerView)
    {
      Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
      return;
    }
    obtainVelocityTracker();
    mDy = 0.0F;
    mDx = 0.0F;
    select(paramViewHolder, 2);
  }
  
  public void startSwipe(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    if (!mCallback.hasSwipeFlag(mRecyclerView, paramViewHolder))
    {
      Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
      return;
    }
    if (itemView.getParent() != mRecyclerView)
    {
      Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
      return;
    }
    obtainVelocityTracker();
    mDy = 0.0F;
    mDx = 0.0F;
    select(paramViewHolder, 1);
  }
  
  public void updateDxDy(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = paramMotionEvent.getX(paramInt2);
    float f2 = paramMotionEvent.getY(paramInt2);
    f1 -= mInitialTouchX;
    mDx = f1;
    mDy = (f2 - mInitialTouchY);
    if ((paramInt1 & 0x4) == 0) {
      mDx = Math.max(0.0F, f1);
    }
    if ((paramInt1 & 0x8) == 0) {
      mDx = Math.min(0.0F, mDx);
    }
    if ((paramInt1 & 0x1) == 0) {
      mDy = Math.max(0.0F, mDy);
    }
    if ((paramInt1 & 0x2) == 0) {
      mDy = Math.min(0.0F, mDy);
    }
  }
  
  public static abstract class Callback
  {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
    public static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new Interpolator()
    {
      public float getInterpolation(float paramAnonymousFloat)
      {
        return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat;
      }
    };
    private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator()
    {
      public float getInterpolation(float paramAnonymousFloat)
      {
        paramAnonymousFloat -= 1.0F;
        return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
      }
    };
    private int mCachedMaxScrollSpeed = -1;
    
    public static int convertToRelativeDirection(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0xC0C0C;
      if (i == 0) {
        return paramInt1;
      }
      paramInt1 &= i;
      if (paramInt2 == 0) {}
      for (paramInt2 = i << 2;; paramInt2 = (paramInt2 & 0xC0C0C) << 2)
      {
        return paramInt1 | paramInt2;
        paramInt2 = i << 1;
        paramInt1 |= 0xFFF3F3F3 & paramInt2;
      }
    }
    
    @NonNull
    public static ItemTouchUIUtil getDefaultUIUtil()
    {
      return ItemTouchUIUtilImpl.INSTANCE;
    }
    
    private int getMaxDragScroll(RecyclerView paramRecyclerView)
    {
      if (mCachedMaxScrollSpeed == -1) {
        mCachedMaxScrollSpeed = paramRecyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
      }
      return mCachedMaxScrollSpeed;
    }
    
    public static int makeFlag(int paramInt1, int paramInt2)
    {
      return paramInt2 << paramInt1 * 8;
    }
    
    public static int makeMovementFlags(int paramInt1, int paramInt2)
    {
      int i = makeFlag(0, paramInt2 | paramInt1);
      paramInt2 = makeFlag(1, paramInt2);
      return makeFlag(2, paramInt1) | paramInt2 | i;
    }
    
    public boolean canDropOver(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder1, @NonNull RecyclerView.ViewHolder paramViewHolder2)
    {
      return true;
    }
    
    public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull List<RecyclerView.ViewHolder> paramList, int paramInt1, int paramInt2)
    {
      int i = itemView.getWidth();
      int j = itemView.getHeight();
      int k = paramInt1 - itemView.getLeft();
      int m = paramInt2 - itemView.getTop();
      int n = paramList.size();
      Object localObject1 = null;
      int i1 = -1;
      for (int i2 = 0; i2 < n; i2++)
      {
        RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)paramList.get(i2);
        Object localObject2 = localObject1;
        int i3 = i1;
        int i4;
        if (k > 0)
        {
          i4 = itemView.getRight() - (i + paramInt1);
          localObject2 = localObject1;
          i3 = i1;
          if (i4 < 0)
          {
            localObject2 = localObject1;
            i3 = i1;
            if (itemView.getRight() > itemView.getRight())
            {
              i4 = Math.abs(i4);
              localObject2 = localObject1;
              i3 = i1;
              if (i4 > i1)
              {
                localObject2 = localViewHolder;
                i3 = i4;
              }
            }
          }
        }
        localObject1 = localObject2;
        i1 = i3;
        if (k < 0)
        {
          i4 = itemView.getLeft() - paramInt1;
          localObject1 = localObject2;
          i1 = i3;
          if (i4 > 0)
          {
            localObject1 = localObject2;
            i1 = i3;
            if (itemView.getLeft() < itemView.getLeft())
            {
              i4 = Math.abs(i4);
              localObject1 = localObject2;
              i1 = i3;
              if (i4 > i3)
              {
                localObject1 = localViewHolder;
                i1 = i4;
              }
            }
          }
        }
        localObject2 = localObject1;
        i3 = i1;
        if (m < 0)
        {
          i4 = itemView.getTop() - paramInt2;
          localObject2 = localObject1;
          i3 = i1;
          if (i4 > 0)
          {
            localObject2 = localObject1;
            i3 = i1;
            if (itemView.getTop() < itemView.getTop())
            {
              i4 = Math.abs(i4);
              localObject2 = localObject1;
              i3 = i1;
              if (i4 > i1)
              {
                localObject2 = localViewHolder;
                i3 = i4;
              }
            }
          }
        }
        localObject1 = localObject2;
        i1 = i3;
        if (m > 0)
        {
          i4 = itemView.getBottom() - (j + paramInt2);
          localObject1 = localObject2;
          i1 = i3;
          if (i4 < 0)
          {
            localObject1 = localObject2;
            i1 = i3;
            if (itemView.getBottom() > itemView.getBottom())
            {
              i4 = Math.abs(i4);
              localObject1 = localObject2;
              i1 = i3;
              if (i4 > i3)
              {
                i1 = i4;
                localObject1 = localViewHolder;
              }
            }
          }
        }
      }
      return (RecyclerView.ViewHolder)localObject1;
    }
    
    public void clearView(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      ItemTouchUIUtilImpl.INSTANCE.clearView(itemView);
    }
    
    public int convertToAbsoluteDirection(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0x303030;
      if (i == 0) {
        return paramInt1;
      }
      paramInt1 &= i;
      if (paramInt2 == 0) {}
      for (paramInt2 = i >> 2;; paramInt2 = (paramInt2 & 0x303030) >> 2)
      {
        return paramInt1 | paramInt2;
        paramInt2 = i >> 1;
        paramInt1 |= 0xFFCFCFCF & paramInt2;
      }
    }
    
    public final int getAbsoluteMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return convertToAbsoluteDirection(getMovementFlags(paramRecyclerView, paramViewHolder), ViewCompat.getLayoutDirection(paramRecyclerView));
    }
    
    public long getAnimationDuration(@NonNull RecyclerView paramRecyclerView, int paramInt, float paramFloat1, float paramFloat2)
    {
      paramRecyclerView = paramRecyclerView.getItemAnimator();
      long l;
      if (paramRecyclerView == null)
      {
        if (paramInt == 8) {
          l = 200L;
        } else {
          l = 250L;
        }
        return l;
      }
      if (paramInt == 8) {
        l = paramRecyclerView.getMoveDuration();
      } else {
        l = paramRecyclerView.getRemoveDuration();
      }
      return l;
    }
    
    public int getBoundingBoxMargin()
    {
      return 0;
    }
    
    public float getMoveThreshold(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return 0.5F;
    }
    
    public abstract int getMovementFlags(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder);
    
    public float getSwipeEscapeVelocity(float paramFloat)
    {
      return paramFloat;
    }
    
    public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return 0.5F;
    }
    
    public float getSwipeVelocityThreshold(float paramFloat)
    {
      return paramFloat;
    }
    
    public boolean hasDragFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      boolean bool;
      if ((getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder) & 0xFF0000) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean hasSwipeFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      boolean bool;
      if ((getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder) & 0xFF00) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int interpolateOutOfBoundsScroll(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3, long paramLong)
    {
      int i = getMaxDragScroll(paramRecyclerView);
      paramInt3 = Math.abs(paramInt2);
      int j = (int)Math.signum(paramInt2);
      float f1 = paramInt3;
      float f2 = 1.0F;
      f1 = Math.min(1.0F, f1 * 1.0F / paramInt1);
      float f3 = j * i;
      paramInt1 = (int)(sDragViewScrollCapInterpolator.getInterpolation(f1) * f3);
      if (paramLong <= 2000L) {
        f2 = (float)paramLong / 2000.0F;
      }
      f1 = paramInt1;
      paramInt3 = (int)(sDragScrollInterpolator.getInterpolation(f2) * f1);
      paramInt1 = paramInt3;
      if (paramInt3 == 0) {
        if (paramInt2 > 0) {
          paramInt1 = 1;
        } else {
          paramInt1 = -1;
        }
      }
      return paramInt1;
    }
    
    public boolean isItemViewSwipeEnabled()
    {
      return true;
    }
    
    public boolean isLongPressDragEnabled()
    {
      return true;
    }
    
    public void onChildDraw(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      ItemTouchUIUtilImpl.INSTANCE.onDraw(paramCanvas, paramRecyclerView, itemView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
    
    public void onChildDrawOver(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      ItemTouchUIUtilImpl.INSTANCE.onDrawOver(paramCanvas, paramRecyclerView, itemView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
    
    public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List<ItemTouchHelper.RecoverAnimation> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        ItemTouchHelper.RecoverAnimation localRecoverAnimation = (ItemTouchHelper.RecoverAnimation)paramList.get(j);
        localRecoverAnimation.update();
        int k = paramCanvas.save();
        onChildDraw(paramCanvas, paramRecyclerView, mViewHolder, mX, mY, mActionState, false);
        paramCanvas.restoreToCount(k);
      }
      if (paramViewHolder != null)
      {
        j = paramCanvas.save();
        onChildDraw(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(j);
      }
    }
    
    public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List<ItemTouchHelper.RecoverAnimation> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int i = paramList.size();
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        ItemTouchHelper.RecoverAnimation localRecoverAnimation = (ItemTouchHelper.RecoverAnimation)paramList.get(k);
        int m = paramCanvas.save();
        onChildDrawOver(paramCanvas, paramRecyclerView, mViewHolder, mX, mY, mActionState, false);
        paramCanvas.restoreToCount(m);
      }
      if (paramViewHolder != null)
      {
        k = paramCanvas.save();
        onChildDrawOver(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(k);
      }
      paramInt = i - 1;
      k = j;
      while (paramInt >= 0)
      {
        paramCanvas = (ItemTouchHelper.RecoverAnimation)paramList.get(paramInt);
        boolean bool = mEnded;
        if ((bool) && (!mIsPendingCleanup)) {
          paramList.remove(paramInt);
        } else if (!bool) {
          k = 1;
        }
        paramInt--;
      }
      if (k != 0) {
        paramRecyclerView.invalidate();
      }
    }
    
    public abstract boolean onMove(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder1, @NonNull RecyclerView.ViewHolder paramViewHolder2);
    
    public void onMoved(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder1, int paramInt1, @NonNull RecyclerView.ViewHolder paramViewHolder2, int paramInt2, int paramInt3, int paramInt4)
    {
      RecyclerView.LayoutManager localLayoutManager = paramRecyclerView.getLayoutManager();
      if ((localLayoutManager instanceof ItemTouchHelper.ViewDropHandler))
      {
        ((ItemTouchHelper.ViewDropHandler)localLayoutManager).prepareForDrop(itemView, itemView, paramInt3, paramInt4);
        return;
      }
      if (localLayoutManager.canScrollHorizontally())
      {
        if (localLayoutManager.getDecoratedLeft(itemView) <= paramRecyclerView.getPaddingLeft()) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
        if (localLayoutManager.getDecoratedRight(itemView) >= paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight()) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
      }
      if (localLayoutManager.canScrollVertically())
      {
        if (localLayoutManager.getDecoratedTop(itemView) <= paramRecyclerView.getPaddingTop()) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
        if (localLayoutManager.getDecoratedBottom(itemView) >= paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom()) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
      }
    }
    
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder paramViewHolder, int paramInt)
    {
      if (paramViewHolder != null) {
        ItemTouchUIUtilImpl.INSTANCE.onSelected(itemView);
      }
    }
    
    public abstract void onSwiped(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt);
  }
  
  public class ItemTouchHelperGestureListener
    extends GestureDetector.SimpleOnGestureListener
  {
    private boolean mShouldReactToLongPress = true;
    
    public ItemTouchHelperGestureListener() {}
    
    public void doNotReactToLongPress()
    {
      mShouldReactToLongPress = false;
    }
    
    public boolean onDown(MotionEvent paramMotionEvent)
    {
      return true;
    }
    
    public void onLongPress(MotionEvent paramMotionEvent)
    {
      if (!mShouldReactToLongPress) {
        return;
      }
      Object localObject = findChildView(paramMotionEvent);
      if (localObject != null)
      {
        localObject = mRecyclerView.getChildViewHolder((View)localObject);
        if (localObject != null)
        {
          ItemTouchHelper localItemTouchHelper = ItemTouchHelper.this;
          if (!mCallback.hasDragFlag(mRecyclerView, (RecyclerView.ViewHolder)localObject)) {
            return;
          }
          int i = paramMotionEvent.getPointerId(0);
          int j = mActivePointerId;
          if (i == j)
          {
            j = paramMotionEvent.findPointerIndex(j);
            float f1 = paramMotionEvent.getX(j);
            float f2 = paramMotionEvent.getY(j);
            paramMotionEvent = ItemTouchHelper.this;
            mInitialTouchX = f1;
            mInitialTouchY = f2;
            mDy = 0.0F;
            mDx = 0.0F;
            if (mCallback.isLongPressDragEnabled()) {
              select((RecyclerView.ViewHolder)localObject, 2);
            }
          }
        }
      }
    }
  }
  
  @VisibleForTesting
  public static class RecoverAnimation
    implements Animator.AnimatorListener
  {
    public final int mActionState;
    public final int mAnimationType;
    public boolean mEnded = false;
    private float mFraction;
    public boolean mIsPendingCleanup;
    public boolean mOverridden = false;
    public final float mStartDx;
    public final float mStartDy;
    public final float mTargetX;
    public final float mTargetY;
    @VisibleForTesting
    public final ValueAnimator mValueAnimator;
    public final RecyclerView.ViewHolder mViewHolder;
    public float mX;
    public float mY;
    
    public RecoverAnimation(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      mActionState = paramInt2;
      mAnimationType = paramInt1;
      mViewHolder = paramViewHolder;
      mStartDx = paramFloat1;
      mStartDy = paramFloat2;
      mTargetX = paramFloat3;
      mTargetY = paramFloat4;
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      mValueAnimator = localValueAnimator;
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          setFraction(paramAnonymousValueAnimator.getAnimatedFraction());
        }
      });
      localValueAnimator.setTarget(itemView);
      localValueAnimator.addListener(this);
      setFraction(0.0F);
    }
    
    public void cancel()
    {
      mValueAnimator.cancel();
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      setFraction(1.0F);
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (!mEnded) {
        mViewHolder.setIsRecyclable(true);
      }
      mEnded = true;
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationStart(Animator paramAnimator) {}
    
    public void setDuration(long paramLong)
    {
      mValueAnimator.setDuration(paramLong);
    }
    
    public void setFraction(float paramFloat)
    {
      mFraction = paramFloat;
    }
    
    public void start()
    {
      mViewHolder.setIsRecyclable(false);
      mValueAnimator.start();
    }
    
    public void update()
    {
      float f1 = mStartDx;
      float f2 = mTargetX;
      if (f1 == f2) {
        mX = mViewHolder.itemView.getTranslationX();
      } else {
        mX = a.a(f2, f1, mFraction, f1);
      }
      f1 = mStartDy;
      f2 = mTargetY;
      if (f1 == f2) {
        mY = mViewHolder.itemView.getTranslationY();
      } else {
        mY = a.a(f2, f1, mFraction, f1);
      }
    }
  }
  
  public static abstract class SimpleCallback
    extends ItemTouchHelper.Callback
  {
    private int mDefaultDragDirs;
    private int mDefaultSwipeDirs;
    
    public SimpleCallback(int paramInt1, int paramInt2)
    {
      mDefaultSwipeDirs = paramInt2;
      mDefaultDragDirs = paramInt1;
    }
    
    public int getDragDirs(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return mDefaultDragDirs;
    }
    
    public int getMovementFlags(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return ItemTouchHelper.Callback.makeMovementFlags(getDragDirs(paramRecyclerView, paramViewHolder), getSwipeDirs(paramRecyclerView, paramViewHolder));
    }
    
    public int getSwipeDirs(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return mDefaultSwipeDirs;
    }
    
    public void setDefaultDragDirs(int paramInt)
    {
      mDefaultDragDirs = paramInt;
    }
    
    public void setDefaultSwipeDirs(int paramInt)
    {
      mDefaultSwipeDirs = paramInt;
    }
  }
  
  public static abstract interface ViewDropHandler
  {
    public abstract void prepareForDrop(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
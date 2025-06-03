package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;

@VisibleForTesting
class FastScroller
  extends RecyclerView.ItemDecoration
  implements RecyclerView.OnItemTouchListener
{
  private static final int ANIMATION_STATE_FADING_IN = 1;
  private static final int ANIMATION_STATE_FADING_OUT = 3;
  private static final int ANIMATION_STATE_IN = 2;
  private static final int ANIMATION_STATE_OUT = 0;
  private static final int DRAG_NONE = 0;
  private static final int DRAG_X = 1;
  private static final int DRAG_Y = 2;
  private static final int[] EMPTY_STATE_SET = new int[0];
  private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
  private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
  private static final int HIDE_DURATION_MS = 500;
  private static final int[] PRESSED_STATE_SET = { 16842919 };
  private static final int SCROLLBAR_FULL_OPAQUE = 255;
  private static final int SHOW_DURATION_MS = 500;
  private static final int STATE_DRAGGING = 2;
  private static final int STATE_HIDDEN = 0;
  private static final int STATE_VISIBLE = 1;
  public int mAnimationState;
  private int mDragState = 0;
  private final Runnable mHideRunnable;
  @VisibleForTesting
  public float mHorizontalDragX;
  private final int[] mHorizontalRange = new int[2];
  @VisibleForTesting
  public int mHorizontalThumbCenterX;
  private final StateListDrawable mHorizontalThumbDrawable;
  private final int mHorizontalThumbHeight;
  @VisibleForTesting
  public int mHorizontalThumbWidth;
  private final Drawable mHorizontalTrackDrawable;
  private final int mHorizontalTrackHeight;
  private final int mMargin;
  private boolean mNeedHorizontalScrollbar = false;
  private boolean mNeedVerticalScrollbar = false;
  private final RecyclerView.OnScrollListener mOnScrollListener;
  private RecyclerView mRecyclerView;
  private int mRecyclerViewHeight = 0;
  private int mRecyclerViewWidth = 0;
  private final int mScrollbarMinimumRange;
  public final ValueAnimator mShowHideAnimator;
  private int mState = 0;
  @VisibleForTesting
  public float mVerticalDragY;
  private final int[] mVerticalRange = new int[2];
  @VisibleForTesting
  public int mVerticalThumbCenterY;
  public final StateListDrawable mVerticalThumbDrawable;
  @VisibleForTesting
  public int mVerticalThumbHeight;
  private final int mVerticalThumbWidth;
  public final Drawable mVerticalTrackDrawable;
  private final int mVerticalTrackWidth;
  
  public FastScroller(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3)
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    mShowHideAnimator = localValueAnimator;
    mAnimationState = 0;
    mHideRunnable = new Runnable()
    {
      public void run()
      {
        hide(500);
      }
    };
    mOnScrollListener = new RecyclerView.OnScrollListener()
    {
      public void onScrolled(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        updateScrollPosition(paramAnonymousRecyclerView.computeHorizontalScrollOffset(), paramAnonymousRecyclerView.computeVerticalScrollOffset());
      }
    };
    mVerticalThumbDrawable = paramStateListDrawable1;
    mVerticalTrackDrawable = paramDrawable1;
    mHorizontalThumbDrawable = paramStateListDrawable2;
    mHorizontalTrackDrawable = paramDrawable2;
    mVerticalThumbWidth = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    mVerticalTrackWidth = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    mHorizontalThumbHeight = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    mHorizontalTrackHeight = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    mScrollbarMinimumRange = paramInt2;
    mMargin = paramInt3;
    paramStateListDrawable1.setAlpha(255);
    paramDrawable1.setAlpha(255);
    localValueAnimator.addListener(new AnimatorListener());
    localValueAnimator.addUpdateListener(new AnimatorUpdater());
    attachToRecyclerView(paramRecyclerView);
  }
  
  private void cancelHide()
  {
    mRecyclerView.removeCallbacks(mHideRunnable);
  }
  
  private void destroyCallbacks()
  {
    mRecyclerView.removeItemDecoration(this);
    mRecyclerView.removeOnItemTouchListener(this);
    mRecyclerView.removeOnScrollListener(mOnScrollListener);
    cancelHide();
  }
  
  private void drawHorizontalScrollbar(Canvas paramCanvas)
  {
    int i = mRecyclerViewHeight;
    int j = mHorizontalThumbHeight;
    i -= j;
    int k = mHorizontalThumbCenterX;
    int m = mHorizontalThumbWidth;
    k -= m / 2;
    mHorizontalThumbDrawable.setBounds(0, 0, m, j);
    mHorizontalTrackDrawable.setBounds(0, 0, mRecyclerViewWidth, mHorizontalTrackHeight);
    paramCanvas.translate(0.0F, i);
    mHorizontalTrackDrawable.draw(paramCanvas);
    paramCanvas.translate(k, 0.0F);
    mHorizontalThumbDrawable.draw(paramCanvas);
    paramCanvas.translate(-k, -i);
  }
  
  private void drawVerticalScrollbar(Canvas paramCanvas)
  {
    int i = mRecyclerViewWidth;
    int j = mVerticalThumbWidth;
    int k = i - j;
    int m = mVerticalThumbCenterY;
    i = mVerticalThumbHeight;
    m -= i / 2;
    mVerticalThumbDrawable.setBounds(0, 0, j, i);
    mVerticalTrackDrawable.setBounds(0, 0, mVerticalTrackWidth, mRecyclerViewHeight);
    if (isLayoutRTL())
    {
      mVerticalTrackDrawable.draw(paramCanvas);
      paramCanvas.translate(mVerticalThumbWidth, m);
      paramCanvas.scale(-1.0F, 1.0F);
      mVerticalThumbDrawable.draw(paramCanvas);
      paramCanvas.scale(-1.0F, 1.0F);
      paramCanvas.translate(-mVerticalThumbWidth, -m);
    }
    else
    {
      paramCanvas.translate(k, 0.0F);
      mVerticalTrackDrawable.draw(paramCanvas);
      paramCanvas.translate(0.0F, m);
      mVerticalThumbDrawable.draw(paramCanvas);
      paramCanvas.translate(-k, -m);
    }
  }
  
  private int[] getHorizontalRange()
  {
    int[] arrayOfInt = mHorizontalRange;
    int i = mMargin;
    arrayOfInt[0] = i;
    arrayOfInt[1] = (mRecyclerViewWidth - i);
    return arrayOfInt;
  }
  
  private int[] getVerticalRange()
  {
    int[] arrayOfInt = mVerticalRange;
    int i = mMargin;
    arrayOfInt[0] = i;
    arrayOfInt[1] = (mRecyclerViewHeight - i);
    return arrayOfInt;
  }
  
  private void horizontalScrollTo(float paramFloat)
  {
    int[] arrayOfInt = getHorizontalRange();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(mHorizontalThumbCenterX - paramFloat) < 2.0F) {
      return;
    }
    int i = scrollTo(mHorizontalDragX, paramFloat, arrayOfInt, mRecyclerView.computeHorizontalScrollRange(), mRecyclerView.computeHorizontalScrollOffset(), mRecyclerViewWidth);
    if (i != 0) {
      mRecyclerView.scrollBy(i, 0);
    }
    mHorizontalDragX = paramFloat;
  }
  
  private boolean isLayoutRTL()
  {
    int i = ViewCompat.getLayoutDirection(mRecyclerView);
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  private void resetHideDelay(int paramInt)
  {
    cancelHide();
    mRecyclerView.postDelayed(mHideRunnable, paramInt);
  }
  
  private int scrollTo(float paramFloat1, float paramFloat2, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfInt[1] - paramArrayOfInt[0];
    if (i == 0) {
      return 0;
    }
    paramFloat1 = (paramFloat2 - paramFloat1) / i;
    paramInt1 -= paramInt3;
    paramInt3 = (int)(paramFloat1 * paramInt1);
    paramInt2 += paramInt3;
    if ((paramInt2 < paramInt1) && (paramInt2 >= 0)) {
      return paramInt3;
    }
    return 0;
  }
  
  private void setupCallbacks()
  {
    mRecyclerView.addItemDecoration(this);
    mRecyclerView.addOnItemTouchListener(this);
    mRecyclerView.addOnScrollListener(mOnScrollListener);
  }
  
  private void verticalScrollTo(float paramFloat)
  {
    int[] arrayOfInt = getVerticalRange();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(mVerticalThumbCenterY - paramFloat) < 2.0F) {
      return;
    }
    int i = scrollTo(mVerticalDragY, paramFloat, arrayOfInt, mRecyclerView.computeVerticalScrollRange(), mRecyclerView.computeVerticalScrollOffset(), mRecyclerViewHeight);
    if (i != 0) {
      mRecyclerView.scrollBy(0, i);
    }
    mVerticalDragY = paramFloat;
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
    if (paramRecyclerView != null) {
      setupCallbacks();
    }
  }
  
  @VisibleForTesting
  public Drawable getHorizontalThumbDrawable()
  {
    return mHorizontalThumbDrawable;
  }
  
  @VisibleForTesting
  public Drawable getHorizontalTrackDrawable()
  {
    return mHorizontalTrackDrawable;
  }
  
  @VisibleForTesting
  public Drawable getVerticalThumbDrawable()
  {
    return mVerticalThumbDrawable;
  }
  
  @VisibleForTesting
  public Drawable getVerticalTrackDrawable()
  {
    return mVerticalTrackDrawable;
  }
  
  @VisibleForTesting
  public void hide(int paramInt)
  {
    int i = mAnimationState;
    if (i != 1)
    {
      if (i != 2) {
        return;
      }
    }
    else {
      mShowHideAnimator.cancel();
    }
    mAnimationState = 3;
    ValueAnimator localValueAnimator = mShowHideAnimator;
    localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 0.0F });
    mShowHideAnimator.setDuration(paramInt);
    mShowHideAnimator.start();
  }
  
  public boolean isDragging()
  {
    boolean bool;
    if (mState == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @VisibleForTesting
  public boolean isPointInsideHorizontalThumb(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 >= mRecyclerViewHeight - mHorizontalThumbHeight)
    {
      int i = mHorizontalThumbCenterX;
      int j = mHorizontalThumbWidth;
      if ((paramFloat1 >= i - j / 2) && (paramFloat1 <= j / 2 + i))
      {
        bool = true;
        break label59;
      }
    }
    boolean bool = false;
    label59:
    return bool;
  }
  
  @VisibleForTesting
  public boolean isPointInsideVerticalThumb(float paramFloat1, float paramFloat2)
  {
    if (isLayoutRTL() ? paramFloat1 <= mVerticalThumbWidth : paramFloat1 >= mRecyclerViewWidth - mVerticalThumbWidth)
    {
      int i = mVerticalThumbCenterY;
      int j = mVerticalThumbHeight;
      if ((paramFloat2 >= i - j / 2) && (paramFloat2 <= j / 2 + i))
      {
        bool = true;
        break label79;
      }
    }
    boolean bool = false;
    label79:
    return bool;
  }
  
  @VisibleForTesting
  public boolean isVisible()
  {
    int i = mState;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    if ((mRecyclerViewWidth == mRecyclerView.getWidth()) && (mRecyclerViewHeight == mRecyclerView.getHeight()))
    {
      if (mAnimationState != 0)
      {
        if (mNeedVerticalScrollbar) {
          drawVerticalScrollbar(paramCanvas);
        }
        if (mNeedHorizontalScrollbar) {
          drawHorizontalScrollbar(paramCanvas);
        }
      }
      return;
    }
    mRecyclerViewWidth = mRecyclerView.getWidth();
    mRecyclerViewHeight = mRecyclerView.getHeight();
    setState(0);
  }
  
  public boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
  {
    int i = mState;
    boolean bool1 = false;
    if (i == 1)
    {
      boolean bool2 = isPointInsideVerticalThumb(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool3 = isPointInsideHorizontalThumb(paramMotionEvent.getX(), paramMotionEvent.getY());
      bool4 = bool1;
      if (paramMotionEvent.getAction() != 0) {
        break label129;
      }
      if (!bool2)
      {
        bool4 = bool1;
        if (!bool3) {
          break label129;
        }
      }
      if (bool3)
      {
        mDragState = 1;
        mHorizontalDragX = ((int)paramMotionEvent.getX());
      }
      else if (bool2)
      {
        mDragState = 2;
        mVerticalDragY = ((int)paramMotionEvent.getY());
      }
      setState(2);
    }
    else
    {
      bool4 = bool1;
      if (i != 2) {
        break label129;
      }
    }
    boolean bool4 = true;
    label129:
    return bool4;
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean) {}
  
  public void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
  {
    if (mState == 0) {
      return;
    }
    if (paramMotionEvent.getAction() == 0)
    {
      boolean bool1 = isPointInsideVerticalThumb(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = isPointInsideHorizontalThumb(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((bool1) || (bool2))
      {
        if (bool2)
        {
          mDragState = 1;
          mHorizontalDragX = ((int)paramMotionEvent.getX());
        }
        else if (bool1)
        {
          mDragState = 2;
          mVerticalDragY = ((int)paramMotionEvent.getY());
        }
        setState(2);
      }
    }
    else if ((paramMotionEvent.getAction() == 1) && (mState == 2))
    {
      mVerticalDragY = 0.0F;
      mHorizontalDragX = 0.0F;
      setState(1);
      mDragState = 0;
    }
    else if ((paramMotionEvent.getAction() == 2) && (mState == 2))
    {
      show();
      if (mDragState == 1) {
        horizontalScrollTo(paramMotionEvent.getX());
      }
      if (mDragState == 2) {
        verticalScrollTo(paramMotionEvent.getY());
      }
    }
  }
  
  public void requestRedraw()
  {
    mRecyclerView.invalidate();
  }
  
  public void setState(int paramInt)
  {
    if ((paramInt == 2) && (mState != 2))
    {
      mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
      cancelHide();
    }
    if (paramInt == 0) {
      requestRedraw();
    } else {
      show();
    }
    if ((mState == 2) && (paramInt != 2))
    {
      mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
      resetHideDelay(1200);
    }
    else if (paramInt == 1)
    {
      resetHideDelay(1500);
    }
    mState = paramInt;
  }
  
  public void show()
  {
    int i = mAnimationState;
    if (i != 0)
    {
      if (i == 3) {
        mShowHideAnimator.cancel();
      }
    }
    else
    {
      mAnimationState = 1;
      ValueAnimator localValueAnimator = mShowHideAnimator;
      localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 1.0F });
      mShowHideAnimator.setDuration(500L);
      mShowHideAnimator.setStartDelay(0L);
      mShowHideAnimator.start();
    }
  }
  
  public void updateScrollPosition(int paramInt1, int paramInt2)
  {
    int i = mRecyclerView.computeVerticalScrollRange();
    int j = mRecyclerViewHeight;
    boolean bool1;
    if ((i - j > 0) && (j >= mScrollbarMinimumRange)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    mNeedVerticalScrollbar = bool1;
    int k = mRecyclerView.computeHorizontalScrollRange();
    int m = mRecyclerViewWidth;
    if ((k - m > 0) && (m >= mScrollbarMinimumRange)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    mNeedHorizontalScrollbar = bool1;
    boolean bool2 = mNeedVerticalScrollbar;
    if ((!bool2) && (!bool1))
    {
      if (mState != 0) {
        setState(0);
      }
      return;
    }
    float f1;
    float f2;
    if (bool2)
    {
      f1 = paramInt2;
      f2 = j;
      mVerticalThumbCenterY = ((int)((f2 / 2.0F + f1) * f2 / i));
      mVerticalThumbHeight = Math.min(j, j * j / i);
    }
    if (mNeedHorizontalScrollbar)
    {
      f1 = paramInt1;
      f2 = m;
      mHorizontalThumbCenterX = ((int)((f2 / 2.0F + f1) * f2 / k));
      mHorizontalThumbWidth = Math.min(m, m * m / k);
    }
    paramInt1 = mState;
    if ((paramInt1 == 0) || (paramInt1 == 1)) {
      setState(1);
    }
  }
  
  public class AnimatorListener
    extends AnimatorListenerAdapter
  {
    private boolean mCanceled = false;
    
    public AnimatorListener() {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      mCanceled = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (mCanceled)
      {
        mCanceled = false;
        return;
      }
      if (((Float)mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0F)
      {
        paramAnimator = FastScroller.this;
        mAnimationState = 0;
        paramAnimator.setState(0);
      }
      else
      {
        paramAnimator = FastScroller.this;
        mAnimationState = 2;
        paramAnimator.requestRedraw();
      }
    }
  }
  
  public class AnimatorUpdater
    implements ValueAnimator.AnimatorUpdateListener
  {
    public AnimatorUpdater() {}
    
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      mVerticalThumbDrawable.setAlpha(i);
      mVerticalTrackDrawable.setAlpha(i);
      requestRedraw();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.FastScroller
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.dimen;
import java.util.List;

public abstract class ItemTouchHelper$Callback
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

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
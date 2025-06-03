package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class RecyclerView$ItemAnimator
{
  public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
  public static final int FLAG_CHANGED = 2;
  public static final int FLAG_INVALIDATED = 4;
  public static final int FLAG_MOVED = 2048;
  public static final int FLAG_REMOVED = 8;
  private long mAddDuration = 120L;
  private long mChangeDuration = 250L;
  private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList();
  private ItemAnimatorListener mListener = null;
  private long mMoveDuration = 250L;
  private long mRemoveDuration = 120L;
  
  public static int buildAdapterChangeFlagsForAnimations(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = mFlags & 0xE;
    if (paramViewHolder.isInvalid()) {
      return 4;
    }
    int j = i;
    if ((i & 0x4) == 0)
    {
      int k = paramViewHolder.getOldPosition();
      int m = paramViewHolder.getAbsoluteAdapterPosition();
      j = i;
      if (k != -1)
      {
        j = i;
        if (m != -1)
        {
          j = i;
          if (k != m) {
            j = i | 0x800;
          }
        }
      }
    }
    return j;
  }
  
  public abstract boolean animateAppearance(@NonNull RecyclerView.ViewHolder paramViewHolder, @Nullable ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animateChange(@NonNull RecyclerView.ViewHolder paramViewHolder1, @NonNull RecyclerView.ViewHolder paramViewHolder2, @NonNull ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animateDisappearance(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull ItemHolderInfo paramItemHolderInfo1, @Nullable ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animatePersistence(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
  
  public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    return true;
  }
  
  public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull List<Object> paramList)
  {
    return canReuseUpdatedViewHolder(paramViewHolder);
  }
  
  public final void dispatchAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    onAnimationFinished(paramViewHolder);
    ItemAnimatorListener localItemAnimatorListener = mListener;
    if (localItemAnimatorListener != null) {
      localItemAnimatorListener.onAnimationFinished(paramViewHolder);
    }
  }
  
  public final void dispatchAnimationStarted(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    onAnimationStarted(paramViewHolder);
  }
  
  public final void dispatchAnimationsFinished()
  {
    int i = mFinishedListeners.size();
    for (int j = 0; j < i; j++) {
      ((ItemAnimatorFinishedListener)mFinishedListeners.get(j)).onAnimationsFinished();
    }
    mFinishedListeners.clear();
  }
  
  public abstract void endAnimation(@NonNull RecyclerView.ViewHolder paramViewHolder);
  
  public abstract void endAnimations();
  
  public long getAddDuration()
  {
    return mAddDuration;
  }
  
  public long getChangeDuration()
  {
    return mChangeDuration;
  }
  
  public long getMoveDuration()
  {
    return mMoveDuration;
  }
  
  public long getRemoveDuration()
  {
    return mRemoveDuration;
  }
  
  public abstract boolean isRunning();
  
  public final boolean isRunning(@Nullable ItemAnimatorFinishedListener paramItemAnimatorFinishedListener)
  {
    boolean bool = isRunning();
    if (paramItemAnimatorFinishedListener != null) {
      if (!bool) {
        paramItemAnimatorFinishedListener.onAnimationsFinished();
      } else {
        mFinishedListeners.add(paramItemAnimatorFinishedListener);
      }
    }
    return bool;
  }
  
  @NonNull
  public ItemHolderInfo obtainHolderInfo()
  {
    return new ItemHolderInfo();
  }
  
  public void onAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onAnimationStarted(@NonNull RecyclerView.ViewHolder paramViewHolder) {}
  
  @NonNull
  public ItemHolderInfo recordPostLayoutInformation(@NonNull RecyclerView.State paramState, @NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    return obtainHolderInfo().setFrom(paramViewHolder);
  }
  
  @NonNull
  public ItemHolderInfo recordPreLayoutInformation(@NonNull RecyclerView.State paramState, @NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt, @NonNull List<Object> paramList)
  {
    return obtainHolderInfo().setFrom(paramViewHolder);
  }
  
  public abstract void runPendingAnimations();
  
  public void setAddDuration(long paramLong)
  {
    mAddDuration = paramLong;
  }
  
  public void setChangeDuration(long paramLong)
  {
    mChangeDuration = paramLong;
  }
  
  public void setListener(ItemAnimatorListener paramItemAnimatorListener)
  {
    mListener = paramItemAnimatorListener;
  }
  
  public void setMoveDuration(long paramLong)
  {
    mMoveDuration = paramLong;
  }
  
  public void setRemoveDuration(long paramLong)
  {
    mRemoveDuration = paramLong;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AdapterChanges {}
  
  public static abstract interface ItemAnimatorFinishedListener
  {
    public abstract void onAnimationsFinished();
  }
  
  public static abstract interface ItemAnimatorListener
  {
    public abstract void onAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder);
  }
  
  public static class ItemHolderInfo
  {
    public int bottom;
    public int changeFlags;
    public int left;
    public int right;
    public int top;
    
    @NonNull
    public ItemHolderInfo setFrom(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return setFrom(paramViewHolder, 0);
    }
    
    @NonNull
    public ItemHolderInfo setFrom(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
    {
      paramViewHolder = itemView;
      left = paramViewHolder.getLeft();
      top = paramViewHolder.getTop();
      right = paramViewHolder.getRight();
      bottom = paramViewHolder.getBottom();
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ItemAnimator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.recyclerview.widget;

import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import java.util.List;

public abstract class RecyclerView$Adapter<VH extends RecyclerView.ViewHolder>
{
  private boolean mHasStableIds = false;
  private final RecyclerView.AdapterDataObservable mObservable = new RecyclerView.AdapterDataObservable();
  private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;
  
  public final void bindViewHolder(@NonNull VH paramVH, int paramInt)
  {
    int i;
    if (mBindingAdapter == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      mPosition = paramInt;
      if (hasStableIds()) {
        mItemId = getItemId(paramInt);
      }
      paramVH.setFlags(1, 519);
      TraceCompat.beginSection("RV OnBindView");
    }
    mBindingAdapter = this;
    onBindViewHolder(paramVH, paramInt, paramVH.getUnmodifiedPayloads());
    if (i != 0)
    {
      paramVH.clearPayload();
      paramVH = itemView.getLayoutParams();
      if ((paramVH instanceof RecyclerView.LayoutParams)) {
        mInsetsDirty = true;
      }
      TraceCompat.endSection();
    }
  }
  
  public boolean canRestoreState()
  {
    int i = RecyclerView.7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[mStateRestorationPolicy.ordinal()];
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i != 1)
    {
      if (i != 2) {
        return true;
      }
      bool2 = bool1;
      if (getItemCount() > 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  @NonNull
  public final VH createViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    try
    {
      TraceCompat.beginSection("RV CreateView");
      paramViewGroup = onCreateViewHolder(paramViewGroup, paramInt);
      if (itemView.getParent() == null)
      {
        mItemViewType = paramInt;
        return paramViewGroup;
      }
      paramViewGroup = new java/lang/IllegalStateException;
      paramViewGroup.<init>("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
      throw paramViewGroup;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends RecyclerView.ViewHolder> paramAdapter, @NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if (paramAdapter == this) {
      return paramInt;
    }
    return -1;
  }
  
  public abstract int getItemCount();
  
  public long getItemId(int paramInt)
  {
    return -1L;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  @NonNull
  public final StateRestorationPolicy getStateRestorationPolicy()
  {
    return mStateRestorationPolicy;
  }
  
  public final boolean hasObservers()
  {
    return mObservable.hasObservers();
  }
  
  public final boolean hasStableIds()
  {
    return mHasStableIds;
  }
  
  public final void notifyDataSetChanged()
  {
    mObservable.notifyChanged();
  }
  
  public final void notifyItemChanged(int paramInt)
  {
    mObservable.notifyItemRangeChanged(paramInt, 1);
  }
  
  public final void notifyItemChanged(int paramInt, @Nullable Object paramObject)
  {
    mObservable.notifyItemRangeChanged(paramInt, 1, paramObject);
  }
  
  public final void notifyItemInserted(int paramInt)
  {
    mObservable.notifyItemRangeInserted(paramInt, 1);
  }
  
  public final void notifyItemMoved(int paramInt1, int paramInt2)
  {
    mObservable.notifyItemMoved(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    mObservable.notifyItemRangeChanged(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    mObservable.notifyItemRangeChanged(paramInt1, paramInt2, paramObject);
  }
  
  public final void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    mObservable.notifyItemRangeInserted(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    mObservable.notifyItemRangeRemoved(paramInt1, paramInt2);
  }
  
  public final void notifyItemRemoved(int paramInt)
  {
    mObservable.notifyItemRangeRemoved(paramInt, 1);
  }
  
  public void onAttachedToRecyclerView(@NonNull RecyclerView paramRecyclerView) {}
  
  public abstract void onBindViewHolder(@NonNull VH paramVH, int paramInt);
  
  public void onBindViewHolder(@NonNull VH paramVH, int paramInt, @NonNull List<Object> paramList)
  {
    onBindViewHolder(paramVH, paramInt);
  }
  
  @NonNull
  public abstract VH onCreateViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt);
  
  public void onDetachedFromRecyclerView(@NonNull RecyclerView paramRecyclerView) {}
  
  public boolean onFailedToRecycleView(@NonNull VH paramVH)
  {
    return false;
  }
  
  public void onViewAttachedToWindow(@NonNull VH paramVH) {}
  
  public void onViewDetachedFromWindow(@NonNull VH paramVH) {}
  
  public void onViewRecycled(@NonNull VH paramVH) {}
  
  public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    mObservable.registerObserver(paramAdapterDataObserver);
  }
  
  public void setHasStableIds(boolean paramBoolean)
  {
    if (!hasObservers())
    {
      mHasStableIds = paramBoolean;
      return;
    }
    throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
  }
  
  public void setStateRestorationPolicy(@NonNull StateRestorationPolicy paramStateRestorationPolicy)
  {
    mStateRestorationPolicy = paramStateRestorationPolicy;
    mObservable.notifyStateRestorationPolicyChanged();
  }
  
  public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    mObservable.unregisterObserver(paramAdapterDataObserver);
  }
  
  public static enum StateRestorationPolicy
  {
    static
    {
      StateRestorationPolicy localStateRestorationPolicy1 = new StateRestorationPolicy("ALLOW", 0);
      ALLOW = localStateRestorationPolicy1;
      StateRestorationPolicy localStateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
      PREVENT_WHEN_EMPTY = localStateRestorationPolicy2;
      StateRestorationPolicy localStateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
      PREVENT = localStateRestorationPolicy3;
      $VALUES = new StateRestorationPolicy[] { localStateRestorationPolicy1, localStateRestorationPolicy2, localStateRestorationPolicy3 };
    }
    
    private StateRestorationPolicy() {}
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.Adapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
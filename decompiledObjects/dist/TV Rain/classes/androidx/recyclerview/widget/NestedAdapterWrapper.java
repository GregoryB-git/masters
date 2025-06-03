package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

class NestedAdapterWrapper
{
  public final RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
  private RecyclerView.AdapterDataObserver mAdapterObserver = new RecyclerView.AdapterDataObserver()
  {
    public void onChanged()
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCachedItemCount = adapter.getItemCount();
      localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCallback.onChanged(localNestedAdapterWrapper);
    }
    
    public void onItemRangeChanged(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCallback.onItemRangeChanged(localNestedAdapterWrapper, paramAnonymousInt1, paramAnonymousInt2, null);
    }
    
    public void onItemRangeChanged(int paramAnonymousInt1, int paramAnonymousInt2, @Nullable Object paramAnonymousObject)
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCallback.onItemRangeChanged(localNestedAdapterWrapper, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousObject);
    }
    
    public void onItemRangeInserted(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCachedItemCount += paramAnonymousInt2;
      mCallback.onItemRangeInserted(localNestedAdapterWrapper, paramAnonymousInt1, paramAnonymousInt2);
      localNestedAdapterWrapper = NestedAdapterWrapper.this;
      if ((mCachedItemCount > 0) && (adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY))
      {
        localNestedAdapterWrapper = NestedAdapterWrapper.this;
        mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
      }
    }
    
    public void onItemRangeMoved(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      boolean bool = true;
      if (paramAnonymousInt3 != 1) {
        bool = false;
      }
      Preconditions.checkArgument(bool, "moving more than 1 item is not supported in RecyclerView");
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCallback.onItemRangeMoved(localNestedAdapterWrapper, paramAnonymousInt1, paramAnonymousInt2);
    }
    
    public void onItemRangeRemoved(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCachedItemCount -= paramAnonymousInt2;
      mCallback.onItemRangeRemoved(localNestedAdapterWrapper, paramAnonymousInt1, paramAnonymousInt2);
      localNestedAdapterWrapper = NestedAdapterWrapper.this;
      if ((mCachedItemCount < 1) && (adapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY))
      {
        localNestedAdapterWrapper = NestedAdapterWrapper.this;
        mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
      }
    }
    
    public void onStateRestorationPolicyChanged()
    {
      NestedAdapterWrapper localNestedAdapterWrapper = NestedAdapterWrapper.this;
      mCallback.onStateRestorationPolicyChanged(localNestedAdapterWrapper);
    }
  };
  public int mCachedItemCount;
  public final Callback mCallback;
  @NonNull
  private final StableIdStorage.StableIdLookup mStableIdLookup;
  @NonNull
  private final ViewTypeStorage.ViewTypeLookup mViewTypeLookup;
  
  public NestedAdapterWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter, Callback paramCallback, ViewTypeStorage paramViewTypeStorage, StableIdStorage.StableIdLookup paramStableIdLookup)
  {
    adapter = paramAdapter;
    mCallback = paramCallback;
    mViewTypeLookup = paramViewTypeStorage.createViewTypeWrapper(this);
    mStableIdLookup = paramStableIdLookup;
    mCachedItemCount = paramAdapter.getItemCount();
    paramAdapter.registerAdapterDataObserver(mAdapterObserver);
  }
  
  public void dispose()
  {
    adapter.unregisterAdapterDataObserver(mAdapterObserver);
    mViewTypeLookup.dispose();
  }
  
  public int getCachedItemCount()
  {
    return mCachedItemCount;
  }
  
  public long getItemId(int paramInt)
  {
    long l = adapter.getItemId(paramInt);
    return mStableIdLookup.localToGlobal(l);
  }
  
  public int getItemViewType(int paramInt)
  {
    return mViewTypeLookup.localToGlobal(adapter.getItemViewType(paramInt));
  }
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    adapter.bindViewHolder(paramViewHolder, paramInt);
  }
  
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    paramInt = mViewTypeLookup.globalToLocal(paramInt);
    return adapter.onCreateViewHolder(paramViewGroup, paramInt);
  }
  
  public static abstract interface Callback
  {
    public abstract void onChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper);
    
    public abstract void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
    
    public abstract void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2, @Nullable Object paramObject);
    
    public abstract void onItemRangeInserted(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
    
    public abstract void onItemRangeMoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
    
    public abstract void onItemRangeRemoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
    
    public abstract void onStateRestorationPolicyChanged(NestedAdapterWrapper paramNestedAdapterWrapper);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.NestedAdapterWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
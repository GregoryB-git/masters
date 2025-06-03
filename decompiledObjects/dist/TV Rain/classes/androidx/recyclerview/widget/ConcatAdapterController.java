package androidx.recyclerview.widget;

import a;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import z2;

class ConcatAdapterController
  implements NestedAdapterWrapper.Callback
{
  private List<WeakReference<RecyclerView>> mAttachedRecyclerViews = new ArrayList();
  private final IdentityHashMap<RecyclerView.ViewHolder, NestedAdapterWrapper> mBinderLookup = new IdentityHashMap();
  private final ConcatAdapter mConcatAdapter;
  private WrapperAndLocalPosition mReusableHolder = new WrapperAndLocalPosition();
  @NonNull
  private final ConcatAdapter.Config.StableIdMode mStableIdMode;
  private final StableIdStorage mStableIdStorage;
  private final ViewTypeStorage mViewTypeStorage;
  private List<NestedAdapterWrapper> mWrappers = new ArrayList();
  
  public ConcatAdapterController(ConcatAdapter paramConcatAdapter, ConcatAdapter.Config paramConfig)
  {
    mConcatAdapter = paramConcatAdapter;
    if (isolateViewTypes) {
      mViewTypeStorage = new ViewTypeStorage.IsolatedViewTypeStorage();
    } else {
      mViewTypeStorage = new ViewTypeStorage.SharedIdRangeViewTypeStorage();
    }
    paramConcatAdapter = stableIdMode;
    mStableIdMode = paramConcatAdapter;
    if (paramConcatAdapter == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS)
    {
      mStableIdStorage = new StableIdStorage.NoStableIdStorage();
    }
    else if (paramConcatAdapter == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS)
    {
      mStableIdStorage = new StableIdStorage.IsolatedStableIdStorage();
    }
    else
    {
      if (paramConcatAdapter != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
        break label156;
      }
      mStableIdStorage = new StableIdStorage.SharedPoolStableIdStorage();
    }
    return;
    label156:
    throw new IllegalArgumentException("unknown stable id mode");
  }
  
  private void calculateAndUpdateStateRestorationPolicy()
  {
    RecyclerView.Adapter.StateRestorationPolicy localStateRestorationPolicy = computeStateRestorationPolicy();
    if (localStateRestorationPolicy != mConcatAdapter.getStateRestorationPolicy()) {
      mConcatAdapter.internalSetStateRestorationPolicy(localStateRestorationPolicy);
    }
  }
  
  private RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy()
  {
    Iterator localIterator = mWrappers.iterator();
    while (localIterator.hasNext())
    {
      NestedAdapterWrapper localNestedAdapterWrapper = (NestedAdapterWrapper)localIterator.next();
      RecyclerView.Adapter.StateRestorationPolicy localStateRestorationPolicy1 = adapter.getStateRestorationPolicy();
      RecyclerView.Adapter.StateRestorationPolicy localStateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
      if (localStateRestorationPolicy1 == localStateRestorationPolicy2) {
        return localStateRestorationPolicy2;
      }
      if ((localStateRestorationPolicy1 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) && (localNestedAdapterWrapper.getCachedItemCount() == 0)) {
        return localStateRestorationPolicy2;
      }
    }
    return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
  }
  
  private int countItemsBefore(NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    Iterator localIterator = mWrappers.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      NestedAdapterWrapper localNestedAdapterWrapper = (NestedAdapterWrapper)localIterator.next();
      if (localNestedAdapterWrapper == paramNestedAdapterWrapper) {
        break;
      }
      i += localNestedAdapterWrapper.getCachedItemCount();
    }
    return i;
  }
  
  @NonNull
  private WrapperAndLocalPosition findWrapperAndLocalPosition(int paramInt)
  {
    WrapperAndLocalPosition localWrapperAndLocalPosition = mReusableHolder;
    if (mInUse) {
      localWrapperAndLocalPosition = new WrapperAndLocalPosition();
    } else {
      mInUse = true;
    }
    Iterator localIterator = mWrappers.iterator();
    int i = paramInt;
    while (localIterator.hasNext())
    {
      NestedAdapterWrapper localNestedAdapterWrapper = (NestedAdapterWrapper)localIterator.next();
      if (localNestedAdapterWrapper.getCachedItemCount() > i)
      {
        mWrapper = localNestedAdapterWrapper;
        mLocalPosition = i;
        break;
      }
      i -= localNestedAdapterWrapper.getCachedItemCount();
    }
    if (mWrapper != null) {
      return localWrapperAndLocalPosition;
    }
    throw new IllegalArgumentException(a.f("Cannot find wrapper for ", paramInt));
  }
  
  @Nullable
  private NestedAdapterWrapper findWrapperFor(RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter)
  {
    int i = indexOfWrapper(paramAdapter);
    if (i == -1) {
      return null;
    }
    return (NestedAdapterWrapper)mWrappers.get(i);
  }
  
  @NonNull
  private NestedAdapterWrapper getWrapper(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = (NestedAdapterWrapper)mBinderLookup.get(paramViewHolder);
    if (localObject != null) {
      return (NestedAdapterWrapper)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot find wrapper for ");
    ((StringBuilder)localObject).append(paramViewHolder);
    ((StringBuilder)localObject).append(", seems like it is not bound by this adapter: ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  private int indexOfWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter)
  {
    int i = mWrappers.size();
    for (int j = 0; j < i; j++) {
      if (mWrappers.get(j)).adapter == paramAdapter) {
        return j;
      }
    }
    return -1;
  }
  
  private boolean isAttachedTo(RecyclerView paramRecyclerView)
  {
    Iterator localIterator = mAttachedRecyclerViews.iterator();
    while (localIterator.hasNext()) {
      if (((WeakReference)localIterator.next()).get() == paramRecyclerView) {
        return true;
      }
    }
    return false;
  }
  
  private void releaseWrapperAndLocalPosition(WrapperAndLocalPosition paramWrapperAndLocalPosition)
  {
    mInUse = false;
    mWrapper = null;
    mLocalPosition = -1;
    mReusableHolder = paramWrapperAndLocalPosition;
  }
  
  public boolean addAdapter(int paramInt, RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter)
  {
    if ((paramInt >= 0) && (paramInt <= mWrappers.size()))
    {
      if (hasStableIds()) {
        Preconditions.checkArgument(paramAdapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
      } else if (paramAdapter.hasStableIds()) {
        Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
      }
      if (findWrapperFor(paramAdapter) != null) {
        return false;
      }
      NestedAdapterWrapper localNestedAdapterWrapper = new NestedAdapterWrapper(paramAdapter, this, mViewTypeStorage, mStableIdStorage.createStableIdLookup());
      mWrappers.add(paramInt, localNestedAdapterWrapper);
      Iterator localIterator = mAttachedRecyclerViews.iterator();
      while (localIterator.hasNext())
      {
        RecyclerView localRecyclerView = (RecyclerView)((WeakReference)localIterator.next()).get();
        if (localRecyclerView != null) {
          paramAdapter.onAttachedToRecyclerView(localRecyclerView);
        }
      }
      if (localNestedAdapterWrapper.getCachedItemCount() > 0) {
        mConcatAdapter.notifyItemRangeInserted(countItemsBefore(localNestedAdapterWrapper), localNestedAdapterWrapper.getCachedItemCount());
      }
      calculateAndUpdateStateRestorationPolicy();
      return true;
    }
    paramAdapter = z2.t("Index must be between 0 and ");
    paramAdapter.append(mWrappers.size());
    paramAdapter.append(". Given:");
    paramAdapter.append(paramInt);
    throw new IndexOutOfBoundsException(paramAdapter.toString());
  }
  
  public boolean addAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter)
  {
    return addAdapter(mWrappers.size(), paramAdapter);
  }
  
  public boolean canRestoreState()
  {
    Iterator localIterator = mWrappers.iterator();
    while (localIterator.hasNext()) {
      if (!nextadapter.canRestoreState()) {
        return false;
      }
    }
    return true;
  }
  
  @Nullable
  public RecyclerView.Adapter<? extends RecyclerView.ViewHolder> getBoundAdapter(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = (NestedAdapterWrapper)mBinderLookup.get(paramViewHolder);
    if (paramViewHolder == null) {
      return null;
    }
    return adapter;
  }
  
  public List<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getCopyOfAdapters()
  {
    if (mWrappers.isEmpty()) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList(mWrappers.size());
    Iterator localIterator = mWrappers.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(nextadapter);
    }
    return localArrayList;
  }
  
  public long getItemId(int paramInt)
  {
    WrapperAndLocalPosition localWrapperAndLocalPosition = findWrapperAndLocalPosition(paramInt);
    long l = mWrapper.getItemId(mLocalPosition);
    releaseWrapperAndLocalPosition(localWrapperAndLocalPosition);
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    WrapperAndLocalPosition localWrapperAndLocalPosition = findWrapperAndLocalPosition(paramInt);
    paramInt = mWrapper.getItemViewType(mLocalPosition);
    releaseWrapperAndLocalPosition(localWrapperAndLocalPosition);
    return paramInt;
  }
  
  public int getLocalAdapterPosition(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> paramAdapter, RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    Object localObject = (NestedAdapterWrapper)mBinderLookup.get(paramViewHolder);
    if (localObject == null) {
      return -1;
    }
    paramInt -= countItemsBefore((NestedAdapterWrapper)localObject);
    int i = adapter.getItemCount();
    if ((paramInt >= 0) && (paramInt < i)) {
      return adapter.findRelativeAdapterPositionIn(paramAdapter, paramViewHolder, paramInt);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" which is out of bounds for the adapter with size ");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
    ((StringBuilder)localObject).append(paramViewHolder);
    ((StringBuilder)localObject).append("adapter:");
    ((StringBuilder)localObject).append(paramAdapter);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public int getTotalCount()
  {
    Iterator localIterator = mWrappers.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      i += ((NestedAdapterWrapper)localIterator.next()).getCachedItemCount();
    }
    return i;
  }
  
  public boolean hasStableIds()
  {
    boolean bool;
    if (mStableIdMode != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onAttachedToRecyclerView(RecyclerView paramRecyclerView)
  {
    if (isAttachedTo(paramRecyclerView)) {
      return;
    }
    mAttachedRecyclerViews.add(new WeakReference(paramRecyclerView));
    Iterator localIterator = mWrappers.iterator();
    while (localIterator.hasNext()) {
      nextadapter.onAttachedToRecyclerView(paramRecyclerView);
    }
  }
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    WrapperAndLocalPosition localWrapperAndLocalPosition = findWrapperAndLocalPosition(paramInt);
    mBinderLookup.put(paramViewHolder, mWrapper);
    mWrapper.onBindViewHolder(paramViewHolder, mLocalPosition);
    releaseWrapperAndLocalPosition(localWrapperAndLocalPosition);
  }
  
  public void onChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    mConcatAdapter.notifyDataSetChanged();
    calculateAndUpdateStateRestorationPolicy();
  }
  
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return mViewTypeStorage.getWrapperForGlobalType(paramInt).onCreateViewHolder(paramViewGroup, paramInt);
  }
  
  public void onDetachedFromRecyclerView(RecyclerView paramRecyclerView)
  {
    for (int i = mAttachedRecyclerViews.size() - 1; i >= 0; i--)
    {
      localObject = (WeakReference)mAttachedRecyclerViews.get(i);
      if (((Reference)localObject).get() == null)
      {
        mAttachedRecyclerViews.remove(i);
      }
      else if (((Reference)localObject).get() == paramRecyclerView)
      {
        mAttachedRecyclerViews.remove(i);
        break;
      }
    }
    Object localObject = mWrappers.iterator();
    while (((Iterator)localObject).hasNext()) {
      nextadapter.onDetachedFromRecyclerView(paramRecyclerView);
    }
  }
  
  public boolean onFailedToRecycleView(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = (NestedAdapterWrapper)mBinderLookup.get(paramViewHolder);
    if (localObject != null)
    {
      boolean bool = adapter.onFailedToRecycleView(paramViewHolder);
      mBinderLookup.remove(paramViewHolder);
      return bool;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot find wrapper for ");
    ((StringBuilder)localObject).append(paramViewHolder);
    ((StringBuilder)localObject).append(", seems like it is not bound by this adapter: ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2)
  {
    int i = countItemsBefore(paramNestedAdapterWrapper);
    mConcatAdapter.notifyItemRangeChanged(paramInt1 + i, paramInt2);
  }
  
  public void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    int i = countItemsBefore(paramNestedAdapterWrapper);
    mConcatAdapter.notifyItemRangeChanged(paramInt1 + i, paramInt2, paramObject);
  }
  
  public void onItemRangeInserted(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2)
  {
    int i = countItemsBefore(paramNestedAdapterWrapper);
    mConcatAdapter.notifyItemRangeInserted(paramInt1 + i, paramInt2);
  }
  
  public void onItemRangeMoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2)
  {
    int i = countItemsBefore(paramNestedAdapterWrapper);
    mConcatAdapter.notifyItemMoved(paramInt1 + i, paramInt2 + i);
  }
  
  public void onItemRangeRemoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2)
  {
    int i = countItemsBefore(paramNestedAdapterWrapper);
    mConcatAdapter.notifyItemRangeRemoved(paramInt1 + i, paramInt2);
  }
  
  public void onStateRestorationPolicyChanged(NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    calculateAndUpdateStateRestorationPolicy();
  }
  
  public void onViewAttachedToWindow(RecyclerView.ViewHolder paramViewHolder)
  {
    getWrapperadapter.onViewAttachedToWindow(paramViewHolder);
  }
  
  public void onViewDetachedFromWindow(RecyclerView.ViewHolder paramViewHolder)
  {
    getWrapperadapter.onViewDetachedFromWindow(paramViewHolder);
  }
  
  public void onViewRecycled(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = (NestedAdapterWrapper)mBinderLookup.get(paramViewHolder);
    if (localObject != null)
    {
      adapter.onViewRecycled(paramViewHolder);
      mBinderLookup.remove(paramViewHolder);
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot find wrapper for ");
    ((StringBuilder)localObject).append(paramViewHolder);
    ((StringBuilder)localObject).append(", seems like it is not bound by this adapter: ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public boolean removeAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> paramAdapter)
  {
    int i = indexOfWrapper(paramAdapter);
    if (i == -1) {
      return false;
    }
    NestedAdapterWrapper localNestedAdapterWrapper = (NestedAdapterWrapper)mWrappers.get(i);
    int j = countItemsBefore(localNestedAdapterWrapper);
    mWrappers.remove(i);
    mConcatAdapter.notifyItemRangeRemoved(j, localNestedAdapterWrapper.getCachedItemCount());
    Iterator localIterator = mAttachedRecyclerViews.iterator();
    while (localIterator.hasNext())
    {
      RecyclerView localRecyclerView = (RecyclerView)((WeakReference)localIterator.next()).get();
      if (localRecyclerView != null) {
        paramAdapter.onDetachedFromRecyclerView(localRecyclerView);
      }
    }
    localNestedAdapterWrapper.dispose();
    calculateAndUpdateStateRestorationPolicy();
    return true;
  }
  
  public static class WrapperAndLocalPosition
  {
    public boolean mInUse;
    public int mLocalPosition;
    public NestedAdapterWrapper mWrapper;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ConcatAdapterController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
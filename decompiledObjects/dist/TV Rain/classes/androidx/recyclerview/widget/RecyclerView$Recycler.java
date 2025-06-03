package androidx.recyclerview.widget;

import a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2;

public final class RecyclerView$Recycler
{
  public static final int DEFAULT_CACHE_SIZE = 2;
  public final ArrayList<RecyclerView.ViewHolder> mAttachedScrap;
  public final ArrayList<RecyclerView.ViewHolder> mCachedViews;
  public ArrayList<RecyclerView.ViewHolder> mChangedScrap;
  public RecyclerView.RecycledViewPool mRecyclerPool;
  private int mRequestedCacheMax;
  private final List<RecyclerView.ViewHolder> mUnmodifiableAttachedScrap;
  private RecyclerView.ViewCacheExtension mViewCacheExtension;
  public int mViewCacheMax;
  
  public RecyclerView$Recycler(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = new ArrayList();
    mAttachedScrap = paramRecyclerView;
    mChangedScrap = null;
    mCachedViews = new ArrayList();
    mUnmodifiableAttachedScrap = Collections.unmodifiableList(paramRecyclerView);
    mRequestedCacheMax = 2;
    mViewCacheMax = 2;
  }
  
  private void attachAccessibilityDelegateOnBind(RecyclerView.ViewHolder paramViewHolder)
  {
    if (this$0.isAccessibilityEnabled())
    {
      paramViewHolder = itemView;
      if (ViewCompat.getImportantForAccessibility(paramViewHolder) == 0) {
        ViewCompat.setImportantForAccessibility(paramViewHolder, 1);
      }
      Object localObject = this$0.mAccessibilityDelegate;
      if (localObject == null) {
        return;
      }
      localObject = ((RecyclerViewAccessibilityDelegate)localObject).getItemDelegate();
      if ((localObject instanceof RecyclerViewAccessibilityDelegate.ItemDelegate)) {
        ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject).saveOriginalDelegate(paramViewHolder);
      }
      ViewCompat.setAccessibilityDelegate(paramViewHolder, (AccessibilityDelegateCompat)localObject);
    }
  }
  
  private void invalidateDisplayListInt(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = paramViewGroup.getChildCount() - 1; i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        invalidateDisplayListInt((ViewGroup)localView, true);
      }
    }
    if (!paramBoolean) {
      return;
    }
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
    }
    else
    {
      i = paramViewGroup.getVisibility();
      paramViewGroup.setVisibility(4);
      paramViewGroup.setVisibility(i);
    }
  }
  
  private void invalidateDisplayListInt(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = itemView;
    if ((paramViewHolder instanceof ViewGroup)) {
      invalidateDisplayListInt((ViewGroup)paramViewHolder, false);
    }
  }
  
  private boolean tryBindViewHolderByDeadline(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, long paramLong)
  {
    mBindingAdapter = null;
    mOwnerRecyclerView = this$0;
    int i = paramViewHolder.getItemViewType();
    long l = this$0.getNanoTime();
    if ((paramLong != Long.MAX_VALUE) && (!mRecyclerPool.willBindInTime(i, l, paramLong))) {
      return false;
    }
    this$0.mAdapter.bindViewHolder(paramViewHolder, paramInt1);
    paramLong = this$0.getNanoTime();
    mRecyclerPool.factorInBindTime(paramViewHolder.getItemViewType(), paramLong - l);
    attachAccessibilityDelegateOnBind(paramViewHolder);
    if (this$0.mState.isPreLayout()) {
      mPreLayoutPosition = paramInt2;
    }
    return true;
  }
  
  public void addViewHolderToRecycledViewPool(@NonNull RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    RecyclerView.clearNestedRecyclerViewIfNotNested(paramViewHolder);
    View localView = itemView;
    Object localObject = this$0.mAccessibilityDelegate;
    if (localObject != null)
    {
      localObject = ((RecyclerViewAccessibilityDelegate)localObject).getItemDelegate();
      if ((localObject instanceof RecyclerViewAccessibilityDelegate.ItemDelegate)) {
        localObject = ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject).getAndRemoveOriginalDelegateForItem(localView);
      } else {
        localObject = null;
      }
      ViewCompat.setAccessibilityDelegate(localView, (AccessibilityDelegateCompat)localObject);
    }
    if (paramBoolean) {
      dispatchViewRecycled(paramViewHolder);
    }
    mBindingAdapter = null;
    mOwnerRecyclerView = null;
    getRecycledViewPool().putRecycledView(paramViewHolder);
  }
  
  public void bindViewToPosition(@NonNull View paramView, int paramInt)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder != null)
    {
      int i = this$0.mAdapterHelper.findPositionOffset(paramInt);
      if ((i >= 0) && (i < this$0.mAdapter.getItemCount()))
      {
        tryBindViewHolderByDeadline(localViewHolder, i, paramInt, Long.MAX_VALUE);
        paramView = itemView.getLayoutParams();
        if (paramView == null)
        {
          paramView = (RecyclerView.LayoutParams)this$0.generateDefaultLayoutParams();
          itemView.setLayoutParams(paramView);
        }
        else if (!this$0.checkLayoutParams(paramView))
        {
          paramView = (RecyclerView.LayoutParams)this$0.generateLayoutParams(paramView);
          itemView.setLayoutParams(paramView);
        }
        else
        {
          paramView = (RecyclerView.LayoutParams)paramView;
        }
        boolean bool = true;
        mInsetsDirty = true;
        mViewHolder = localViewHolder;
        if (itemView.getParent() != null) {
          bool = false;
        }
        mPendingInvalidate = bool;
        return;
      }
      paramView = new StringBuilder();
      paramView.append("Inconsistency detected. Invalid item position ");
      paramView.append(paramInt);
      paramView.append("(offset:");
      paramView.append(i);
      paramView.append(").state:");
      paramView.append(this$0.mState.getItemCount());
      throw new IndexOutOfBoundsException(z2.m(this$0, paramView));
    }
    paramView = z2.t("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
    throw new IllegalArgumentException(z2.m(this$0, paramView));
  }
  
  public void clear()
  {
    mAttachedScrap.clear();
    recycleAndClearCachedViews();
  }
  
  public void clearOldPositions()
  {
    int i = mCachedViews.size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((RecyclerView.ViewHolder)mCachedViews.get(k)).clearOldPosition();
    }
    i = mAttachedScrap.size();
    for (k = 0; k < i; k++) {
      ((RecyclerView.ViewHolder)mAttachedScrap.get(k)).clearOldPosition();
    }
    ArrayList localArrayList = mChangedScrap;
    if (localArrayList != null)
    {
      i = localArrayList.size();
      for (k = j; k < i; k++) {
        ((RecyclerView.ViewHolder)mChangedScrap.get(k)).clearOldPosition();
      }
    }
  }
  
  public void clearScrap()
  {
    mAttachedScrap.clear();
    ArrayList localArrayList = mChangedScrap;
    if (localArrayList != null) {
      localArrayList.clear();
    }
  }
  
  public int convertPreLayoutPositionToPostLayout(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this$0.mState.getItemCount()))
    {
      if (!this$0.mState.isPreLayout()) {
        return paramInt;
      }
      return this$0.mAdapterHelper.findPositionOffset(paramInt);
    }
    StringBuilder localStringBuilder = a.r("invalid position ", paramInt, ". State item count is ");
    localStringBuilder.append(this$0.mState.getItemCount());
    throw new IndexOutOfBoundsException(z2.m(this$0, localStringBuilder));
  }
  
  public void dispatchViewRecycled(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = this$0.mRecyclerListener;
    if (localObject != null) {
      ((RecyclerView.RecyclerListener)localObject).onViewRecycled(paramViewHolder);
    }
    int i = this$0.mRecyclerListeners.size();
    for (int j = 0; j < i; j++) {
      ((RecyclerView.RecyclerListener)this$0.mRecyclerListeners.get(j)).onViewRecycled(paramViewHolder);
    }
    localObject = this$0.mAdapter;
    if (localObject != null) {
      ((RecyclerView.Adapter)localObject).onViewRecycled(paramViewHolder);
    }
    localObject = this$0;
    if (mState != null) {
      mViewInfoStore.removeViewHolder(paramViewHolder);
    }
  }
  
  public RecyclerView.ViewHolder getChangedScrapViewForPosition(int paramInt)
  {
    Object localObject = mChangedScrap;
    if (localObject != null)
    {
      int i = ((ArrayList)localObject).size();
      if (i != 0)
      {
        int j = 0;
        for (int k = 0; k < i; k++)
        {
          localObject = (RecyclerView.ViewHolder)mChangedScrap.get(k);
          if ((!((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap()) && (((RecyclerView.ViewHolder)localObject).getLayoutPosition() == paramInt))
          {
            ((RecyclerView.ViewHolder)localObject).addFlags(32);
            return (RecyclerView.ViewHolder)localObject;
          }
        }
        if (this$0.mAdapter.hasStableIds())
        {
          paramInt = this$0.mAdapterHelper.findPositionOffset(paramInt);
          if ((paramInt > 0) && (paramInt < this$0.mAdapter.getItemCount()))
          {
            long l = this$0.mAdapter.getItemId(paramInt);
            for (paramInt = j; paramInt < i; paramInt++)
            {
              localObject = (RecyclerView.ViewHolder)mChangedScrap.get(paramInt);
              if ((!((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap()) && (((RecyclerView.ViewHolder)localObject).getItemId() == l))
              {
                ((RecyclerView.ViewHolder)localObject).addFlags(32);
                return (RecyclerView.ViewHolder)localObject;
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public RecyclerView.RecycledViewPool getRecycledViewPool()
  {
    if (mRecyclerPool == null) {
      mRecyclerPool = new RecyclerView.RecycledViewPool();
    }
    return mRecyclerPool;
  }
  
  public int getScrapCount()
  {
    return mAttachedScrap.size();
  }
  
  @NonNull
  public List<RecyclerView.ViewHolder> getScrapList()
  {
    return mUnmodifiableAttachedScrap;
  }
  
  public RecyclerView.ViewHolder getScrapOrCachedViewForId(long paramLong, int paramInt, boolean paramBoolean)
  {
    RecyclerView.ViewHolder localViewHolder;
    for (int i = mAttachedScrap.size() - 1; i >= 0; i--)
    {
      localViewHolder = (RecyclerView.ViewHolder)mAttachedScrap.get(i);
      if ((localViewHolder.getItemId() == paramLong) && (!localViewHolder.wasReturnedFromScrap()))
      {
        if (paramInt == localViewHolder.getItemViewType())
        {
          localViewHolder.addFlags(32);
          if ((localViewHolder.isRemoved()) && (!this$0.mState.isPreLayout())) {
            localViewHolder.setFlags(2, 14);
          }
          return localViewHolder;
        }
        if (!paramBoolean)
        {
          mAttachedScrap.remove(i);
          this$0.removeDetachedView(itemView, false);
          quickRecycleScrapView(itemView);
        }
      }
    }
    for (i = mCachedViews.size() - 1; i >= 0; i--)
    {
      localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
      if ((localViewHolder.getItemId() == paramLong) && (!localViewHolder.isAttachedToTransitionOverlay()))
      {
        if (paramInt == localViewHolder.getItemViewType())
        {
          if (!paramBoolean) {
            mCachedViews.remove(i);
          }
          return localViewHolder;
        }
        if (!paramBoolean)
        {
          recycleCachedViewAt(i);
          return null;
        }
      }
    }
    return null;
  }
  
  public RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int paramInt, boolean paramBoolean)
  {
    int i = mAttachedScrap.size();
    int j = 0;
    RecyclerView.ViewHolder localViewHolder;
    for (int k = 0; k < i; k++)
    {
      localViewHolder = (RecyclerView.ViewHolder)mAttachedScrap.get(k);
      if ((!localViewHolder.wasReturnedFromScrap()) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isInvalid()) && ((this$0.mState.mInPreLayout) || (!localViewHolder.isRemoved())))
      {
        localViewHolder.addFlags(32);
        return localViewHolder;
      }
    }
    if (!paramBoolean)
    {
      Object localObject = this$0.mChildHelper.findHiddenNonRemovedView(paramInt);
      if (localObject != null)
      {
        localViewHolder = RecyclerView.getChildViewHolderInt((View)localObject);
        this$0.mChildHelper.unhide((View)localObject);
        paramInt = this$0.mChildHelper.indexOfChild((View)localObject);
        if (paramInt != -1)
        {
          this$0.mChildHelper.detachViewFromParent(paramInt);
          scrapView((View)localObject);
          localViewHolder.addFlags(8224);
          return localViewHolder;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("layout index should not be -1 after unhiding a view:");
        ((StringBuilder)localObject).append(localViewHolder);
        throw new IllegalStateException(z2.m(this$0, (StringBuilder)localObject));
      }
    }
    i = mCachedViews.size();
    for (k = j; k < i; k++)
    {
      localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(k);
      if ((!localViewHolder.isInvalid()) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isAttachedToTransitionOverlay()))
      {
        if (!paramBoolean) {
          mCachedViews.remove(k);
        }
        return localViewHolder;
      }
    }
    return null;
  }
  
  public View getScrapViewAt(int paramInt)
  {
    return mAttachedScrap.get(paramInt)).itemView;
  }
  
  @NonNull
  public View getViewForPosition(int paramInt)
  {
    return getViewForPosition(paramInt, false);
  }
  
  public View getViewForPosition(int paramInt, boolean paramBoolean)
  {
    return tryGetViewHolderForPositionByDeadlineMAX_VALUEitemView;
  }
  
  public void markItemDecorInsetsDirty()
  {
    int i = mCachedViews.size();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)mCachedViews.get(j)).itemView.getLayoutParams();
      if (localLayoutParams != null) {
        mInsetsDirty = true;
      }
    }
  }
  
  public void markKnownViewsInvalid()
  {
    int i = mCachedViews.size();
    for (int j = 0; j < i; j++)
    {
      localObject = (RecyclerView.ViewHolder)mCachedViews.get(j);
      if (localObject != null)
      {
        ((RecyclerView.ViewHolder)localObject).addFlags(6);
        ((RecyclerView.ViewHolder)localObject).addChangePayload(null);
      }
    }
    Object localObject = this$0.mAdapter;
    if ((localObject == null) || (!((RecyclerView.Adapter)localObject).hasStableIds())) {
      recycleAndClearCachedViews();
    }
  }
  
  public void offsetPositionRecordsForInsert(int paramInt1, int paramInt2)
  {
    int i = mCachedViews.size();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(j);
      if ((localViewHolder != null) && (mPosition >= paramInt1)) {
        localViewHolder.offsetPosition(paramInt2, false);
      }
    }
  }
  
  public void offsetPositionRecordsForMove(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = paramInt1;
      k = paramInt2;
    }
    else
    {
      i = 1;
      k = paramInt1;
      j = paramInt2;
    }
    int m = mCachedViews.size();
    for (int n = 0; n < m; n++)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(n);
      if (localViewHolder != null)
      {
        int i1 = mPosition;
        if ((i1 >= j) && (i1 <= k)) {
          if (i1 == paramInt1) {
            localViewHolder.offsetPosition(paramInt2 - paramInt1, false);
          } else {
            localViewHolder.offsetPosition(i, false);
          }
        }
      }
    }
  }
  
  public void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = mCachedViews.size() - 1; i >= 0; i--)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
      if (localViewHolder != null)
      {
        int j = mPosition;
        if (j >= paramInt1 + paramInt2)
        {
          localViewHolder.offsetPosition(-paramInt2, paramBoolean);
        }
        else if (j >= paramInt1)
        {
          localViewHolder.addFlags(8);
          recycleCachedViewAt(i);
        }
      }
    }
  }
  
  public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    clear();
    getRecycledViewPool().onAdapterChanged(paramAdapter1, paramAdapter2, paramBoolean);
  }
  
  public void quickRecycleScrapView(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    mScrapContainer = null;
    mInChangeScrap = false;
    paramView.clearReturnedFromScrapFlag();
    recycleViewHolderInternal(paramView);
  }
  
  public void recycleAndClearCachedViews()
  {
    for (int i = mCachedViews.size() - 1; i >= 0; i--) {
      recycleCachedViewAt(i);
    }
    mCachedViews.clear();
    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
      this$0.mPrefetchRegistry.clearPrefetchPositions();
    }
  }
  
  public void recycleCachedViewAt(int paramInt)
  {
    addViewHolderToRecycledViewPool((RecyclerView.ViewHolder)mCachedViews.get(paramInt), true);
    mCachedViews.remove(paramInt);
  }
  
  public void recycleView(@NonNull View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder.isTmpDetached()) {
      this$0.removeDetachedView(paramView, false);
    }
    if (localViewHolder.isScrap()) {
      localViewHolder.unScrap();
    } else if (localViewHolder.wasReturnedFromScrap()) {
      localViewHolder.clearReturnedFromScrapFlag();
    }
    recycleViewHolderInternal(localViewHolder);
    if ((this$0.mItemAnimator != null) && (!localViewHolder.isRecyclable())) {
      this$0.mItemAnimator.endAnimation(localViewHolder);
    }
  }
  
  public void recycleViewHolderInternal(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = paramViewHolder.isScrap();
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    if ((!bool1) && (itemView.getParent() == null))
    {
      if (!paramViewHolder.isTmpDetached())
      {
        if (!paramViewHolder.shouldIgnore())
        {
          bool2 = paramViewHolder.doesTransientStatePreventRecycling();
          localObject = this$0.mAdapter;
          int k;
          if ((localObject != null) && (bool2) && (((RecyclerView.Adapter)localObject).onFailedToRecycleView(paramViewHolder))) {
            k = 1;
          } else {
            k = 0;
          }
          if ((k == 0) && (!paramViewHolder.isRecyclable()))
          {
            k = 0;
          }
          else
          {
            if ((mViewCacheMax > 0) && (!paramViewHolder.hasAnyOfTheFlags(526)))
            {
              i = mCachedViews.size();
              k = i;
              if (i >= mViewCacheMax)
              {
                k = i;
                if (i > 0)
                {
                  recycleCachedViewAt(0);
                  k = i - 1;
                }
              }
              i = k;
              if (RecyclerView.ALLOW_THREAD_GAP_WORK)
              {
                i = k;
                if (k > 0)
                {
                  i = k;
                  if (!this$0.mPrefetchRegistry.lastPrefetchIncludedPosition(mPosition))
                  {
                    int m;
                    do
                    {
                      i = k - 1;
                      if (i < 0) {
                        break;
                      }
                      m = mCachedViews.get(i)).mPosition;
                      k = i;
                    } while (this$0.mPrefetchRegistry.lastPrefetchIncludedPosition(m));
                    i++;
                  }
                }
              }
              mCachedViews.add(i, paramViewHolder);
              k = 1;
            }
            else
            {
              k = 0;
            }
            i = j;
            if (k == 0)
            {
              addViewHolderToRecycledViewPool(paramViewHolder, true);
              i = 1;
            }
            j = i;
            i = k;
            k = j;
          }
          this$0.mViewInfoStore.removeViewHolder(paramViewHolder);
          if ((i == 0) && (k == 0) && (bool2))
          {
            mBindingAdapter = null;
            mOwnerRecyclerView = null;
          }
          return;
        }
        paramViewHolder = z2.t("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        throw new IllegalArgumentException(z2.m(this$0, paramViewHolder));
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
      ((StringBuilder)localObject).append(paramViewHolder);
      throw new IllegalArgumentException(z2.m(this$0, (StringBuilder)localObject));
    }
    Object localObject = z2.t("Scrapped or attached views may not be recycled. isScrap:");
    ((StringBuilder)localObject).append(paramViewHolder.isScrap());
    ((StringBuilder)localObject).append(" isAttached:");
    if (itemView.getParent() != null) {
      bool2 = true;
    }
    ((StringBuilder)localObject).append(bool2);
    throw new IllegalArgumentException(z2.m(this$0, (StringBuilder)localObject));
  }
  
  public void scrapView(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    if ((!paramView.hasAnyOfTheFlags(12)) && (paramView.isUpdated()) && (!this$0.canReuseUpdatedViewHolder(paramView)))
    {
      if (mChangedScrap == null) {
        mChangedScrap = new ArrayList();
      }
      paramView.setScrapContainer(this, true);
      mChangedScrap.add(paramView);
    }
    else
    {
      if ((paramView.isInvalid()) && (!paramView.isRemoved()) && (!this$0.mAdapter.hasStableIds()))
      {
        paramView = z2.t("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        throw new IllegalArgumentException(z2.m(this$0, paramView));
      }
      paramView.setScrapContainer(this, false);
      mAttachedScrap.add(paramView);
    }
  }
  
  public void setRecycledViewPool(RecyclerView.RecycledViewPool paramRecycledViewPool)
  {
    RecyclerView.RecycledViewPool localRecycledViewPool = mRecyclerPool;
    if (localRecycledViewPool != null) {
      localRecycledViewPool.detach();
    }
    mRecyclerPool = paramRecycledViewPool;
    if ((paramRecycledViewPool != null) && (this$0.getAdapter() != null)) {
      mRecyclerPool.attach();
    }
  }
  
  public void setViewCacheExtension(RecyclerView.ViewCacheExtension paramViewCacheExtension)
  {
    mViewCacheExtension = paramViewCacheExtension;
  }
  
  public void setViewCacheSize(int paramInt)
  {
    mRequestedCacheMax = paramInt;
    updateViewCacheSize();
  }
  
  @Nullable
  public RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int paramInt, boolean paramBoolean, long paramLong)
  {
    if ((paramInt >= 0) && (paramInt < this$0.mState.getItemCount()))
    {
      boolean bool1 = this$0.mState.isPreLayout();
      boolean bool2 = true;
      if (bool1)
      {
        localObject1 = getChangedScrapViewForPosition(paramInt);
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          i = 1;
          break label70;
        }
      }
      else
      {
        localObject2 = null;
      }
      int i = 0;
      Object localObject1 = localObject2;
      label70:
      localObject2 = localObject1;
      int j = i;
      if (localObject1 == null)
      {
        localObject1 = getScrapOrHiddenOrCachedHolderForPosition(paramInt, paramBoolean);
        localObject2 = localObject1;
        j = i;
        if (localObject1 != null) {
          if (!validateViewHolderForOffsetPosition((RecyclerView.ViewHolder)localObject1))
          {
            if (!paramBoolean)
            {
              ((RecyclerView.ViewHolder)localObject1).addFlags(4);
              if (((RecyclerView.ViewHolder)localObject1).isScrap())
              {
                this$0.removeDetachedView(itemView, false);
                ((RecyclerView.ViewHolder)localObject1).unScrap();
              }
              else if (((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap())
              {
                ((RecyclerView.ViewHolder)localObject1).clearReturnedFromScrapFlag();
              }
              recycleViewHolderInternal((RecyclerView.ViewHolder)localObject1);
            }
            localObject2 = null;
            j = i;
          }
          else
          {
            j = 1;
            localObject2 = localObject1;
          }
        }
      }
      localObject1 = localObject2;
      int k = j;
      if (localObject2 == null)
      {
        k = this$0.mAdapterHelper.findPositionOffset(paramInt);
        if ((k >= 0) && (k < this$0.mAdapter.getItemCount()))
        {
          int m = this$0.mAdapter.getItemViewType(k);
          i = j;
          if (this$0.mAdapter.hasStableIds())
          {
            localObject1 = getScrapOrCachedViewForId(this$0.mAdapter.getItemId(k), m, paramBoolean);
            localObject2 = localObject1;
            i = j;
            if (localObject1 != null)
            {
              mPosition = k;
              i = 1;
              localObject2 = localObject1;
            }
          }
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            Object localObject3 = mViewCacheExtension;
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              localObject3 = ((RecyclerView.ViewCacheExtension)localObject3).getViewForPositionAndType(this, paramInt, m);
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject1 = this$0.getChildViewHolder((View)localObject3);
                if (localObject1 != null)
                {
                  if (((RecyclerView.ViewHolder)localObject1).shouldIgnore())
                  {
                    localObject2 = z2.t("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    throw new IllegalArgumentException(z2.m(this$0, (StringBuilder)localObject2));
                  }
                }
                else
                {
                  localObject2 = z2.t("getViewForPositionAndType returned a view which does not have a ViewHolder");
                  throw new IllegalArgumentException(z2.m(this$0, (StringBuilder)localObject2));
                }
              }
            }
          }
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = getRecycledViewPool().getRecycledView(m);
            if (localObject2 != null)
            {
              ((RecyclerView.ViewHolder)localObject2).resetInternal();
              if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                invalidateDisplayListInt((RecyclerView.ViewHolder)localObject2);
              }
            }
          }
          localObject1 = localObject2;
          k = i;
          if (localObject2 == null)
          {
            long l1 = this$0.getNanoTime();
            if ((paramLong != Long.MAX_VALUE) && (!mRecyclerPool.willCreateInTime(m, l1, paramLong))) {
              return null;
            }
            localObject2 = this$0;
            localObject1 = mAdapter.createViewHolder((ViewGroup)localObject2, m);
            if (RecyclerView.ALLOW_THREAD_GAP_WORK)
            {
              localObject2 = RecyclerView.findNestedRecyclerView(itemView);
              if (localObject2 != null) {
                mNestedRecyclerView = new WeakReference(localObject2);
              }
            }
            long l2 = this$0.getNanoTime();
            mRecyclerPool.factorInCreateTime(m, l2 - l1);
            break label691;
          }
        }
        else
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Inconsistency detected. Invalid item position ");
          ((StringBuilder)localObject2).append(paramInt);
          ((StringBuilder)localObject2).append("(offset:");
          ((StringBuilder)localObject2).append(k);
          ((StringBuilder)localObject2).append(").state:");
          ((StringBuilder)localObject2).append(this$0.mState.getItemCount());
          throw new IndexOutOfBoundsException(z2.m(this$0, (StringBuilder)localObject2));
        }
      }
      i = k;
      label691:
      if ((i != 0) && (!this$0.mState.isPreLayout()) && (((RecyclerView.ViewHolder)localObject1).hasAnyOfTheFlags(8192)))
      {
        ((RecyclerView.ViewHolder)localObject1).setFlags(0, 8192);
        if (this$0.mState.mRunSimpleAnimations)
        {
          j = RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations((RecyclerView.ViewHolder)localObject1);
          localObject2 = this$0;
          localObject2 = mItemAnimator.recordPreLayoutInformation(mState, (RecyclerView.ViewHolder)localObject1, j | 0x1000, ((RecyclerView.ViewHolder)localObject1).getUnmodifiedPayloads());
          this$0.recordAnimationInfoIfBouncedHiddenView((RecyclerView.ViewHolder)localObject1, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject2);
        }
      }
      if ((this$0.mState.isPreLayout()) && (((RecyclerView.ViewHolder)localObject1).isBound())) {
        mPreLayoutPosition = paramInt;
      } else {
        if ((!((RecyclerView.ViewHolder)localObject1).isBound()) || (((RecyclerView.ViewHolder)localObject1).needsUpdate()) || (((RecyclerView.ViewHolder)localObject1).isInvalid())) {
          break label856;
        }
      }
      paramBoolean = false;
      break label876;
      label856:
      paramBoolean = tryBindViewHolderByDeadline((RecyclerView.ViewHolder)localObject1, this$0.mAdapterHelper.findPositionOffset(paramInt), paramInt, paramLong);
      label876:
      localObject2 = itemView.getLayoutParams();
      if (localObject2 == null)
      {
        localObject2 = (RecyclerView.LayoutParams)this$0.generateDefaultLayoutParams();
        itemView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      else if (!this$0.checkLayoutParams((ViewGroup.LayoutParams)localObject2))
      {
        localObject2 = (RecyclerView.LayoutParams)this$0.generateLayoutParams((ViewGroup.LayoutParams)localObject2);
        itemView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      else
      {
        localObject2 = (RecyclerView.LayoutParams)localObject2;
      }
      mViewHolder = ((RecyclerView.ViewHolder)localObject1);
      if ((i != 0) && (paramBoolean)) {
        paramBoolean = bool2;
      } else {
        paramBoolean = false;
      }
      mPendingInvalidate = paramBoolean;
      return (RecyclerView.ViewHolder)localObject1;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Invalid item position ");
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append("(");
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append("). Item count:");
    ((StringBuilder)localObject2).append(this$0.mState.getItemCount());
    throw new IndexOutOfBoundsException(z2.m(this$0, (StringBuilder)localObject2));
  }
  
  public void unscrapView(RecyclerView.ViewHolder paramViewHolder)
  {
    if (mInChangeScrap) {
      mChangedScrap.remove(paramViewHolder);
    } else {
      mAttachedScrap.remove(paramViewHolder);
    }
    mScrapContainer = null;
    mInChangeScrap = false;
    paramViewHolder.clearReturnedFromScrapFlag();
  }
  
  public void updateViewCacheSize()
  {
    RecyclerView.LayoutManager localLayoutManager = this$0.mLayout;
    if (localLayoutManager != null) {
      i = mPrefetchMaxCountObserved;
    } else {
      i = 0;
    }
    mViewCacheMax = (mRequestedCacheMax + i);
    for (int i = mCachedViews.size() - 1; (i >= 0) && (mCachedViews.size() > mViewCacheMax); i--) {
      recycleCachedViewAt(i);
    }
  }
  
  public boolean validateViewHolderForOffsetPosition(RecyclerView.ViewHolder paramViewHolder)
  {
    if (paramViewHolder.isRemoved()) {
      return this$0.mState.isPreLayout();
    }
    int i = mPosition;
    if ((i >= 0) && (i < this$0.mAdapter.getItemCount()))
    {
      boolean bool1 = this$0.mState.isPreLayout();
      boolean bool2 = false;
      if ((!bool1) && (this$0.mAdapter.getItemViewType(mPosition) != paramViewHolder.getItemViewType())) {
        return false;
      }
      if (this$0.mAdapter.hasStableIds())
      {
        if (paramViewHolder.getItemId() == this$0.mAdapter.getItemId(mPosition)) {
          bool2 = true;
        }
        return bool2;
      }
      return true;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
    localStringBuilder.append(paramViewHolder);
    throw new IndexOutOfBoundsException(z2.m(this$0, localStringBuilder));
  }
  
  public void viewRangeUpdate(int paramInt1, int paramInt2)
  {
    for (int i = mCachedViews.size() - 1; i >= 0; i--)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
      if (localViewHolder != null)
      {
        int j = mPosition;
        if ((j >= paramInt1) && (j < paramInt2 + paramInt1))
        {
          localViewHolder.addFlags(2);
          recycleCachedViewAt(i);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.Recycler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
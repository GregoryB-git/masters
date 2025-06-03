package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2;

public abstract class RecyclerView$ViewHolder
{
  public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
  public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
  public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
  public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
  public static final int FLAG_BOUND = 1;
  public static final int FLAG_IGNORE = 128;
  public static final int FLAG_INVALID = 4;
  public static final int FLAG_MOVED = 2048;
  public static final int FLAG_NOT_RECYCLABLE = 16;
  public static final int FLAG_REMOVED = 8;
  public static final int FLAG_RETURNED_FROM_SCRAP = 32;
  public static final int FLAG_TMP_DETACHED = 256;
  public static final int FLAG_UPDATE = 2;
  private static final List<Object> FULLUPDATE_PAYLOADS = ;
  public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
  @NonNull
  public final View itemView;
  public RecyclerView.Adapter<? extends ViewHolder> mBindingAdapter;
  public int mFlags;
  public boolean mInChangeScrap = false;
  private int mIsRecyclableCount = 0;
  public long mItemId = -1L;
  public int mItemViewType = -1;
  public WeakReference<RecyclerView> mNestedRecyclerView;
  public int mOldPosition = -1;
  public RecyclerView mOwnerRecyclerView;
  public List<Object> mPayloads = null;
  @VisibleForTesting
  public int mPendingAccessibilityState = -1;
  public int mPosition = -1;
  public int mPreLayoutPosition = -1;
  public RecyclerView.Recycler mScrapContainer = null;
  public ViewHolder mShadowedHolder = null;
  public ViewHolder mShadowingHolder = null;
  public List<Object> mUnmodifiedPayloads = null;
  private int mWasImportantForAccessibilityBeforeHidden = 0;
  
  public RecyclerView$ViewHolder(@NonNull View paramView)
  {
    if (paramView != null)
    {
      itemView = paramView;
      return;
    }
    throw new IllegalArgumentException("itemView may not be null");
  }
  
  private void createPayloadsIfNeeded()
  {
    if (mPayloads == null)
    {
      ArrayList localArrayList = new ArrayList();
      mPayloads = localArrayList;
      mUnmodifiedPayloads = Collections.unmodifiableList(localArrayList);
    }
  }
  
  public void addChangePayload(Object paramObject)
  {
    if (paramObject == null)
    {
      addFlags(1024);
    }
    else if ((0x400 & mFlags) == 0)
    {
      createPayloadsIfNeeded();
      mPayloads.add(paramObject);
    }
  }
  
  public void addFlags(int paramInt)
  {
    mFlags = (paramInt | mFlags);
  }
  
  public void clearOldPosition()
  {
    mOldPosition = -1;
    mPreLayoutPosition = -1;
  }
  
  public void clearPayload()
  {
    List localList = mPayloads;
    if (localList != null) {
      localList.clear();
    }
    mFlags &= 0xFBFF;
  }
  
  public void clearReturnedFromScrapFlag()
  {
    mFlags &= 0xFFFFFFDF;
  }
  
  public void clearTmpDetachFlag()
  {
    mFlags &= 0xFEFF;
  }
  
  public boolean doesTransientStatePreventRecycling()
  {
    boolean bool;
    if (((mFlags & 0x10) == 0) && (ViewCompat.hasTransientState(itemView))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void flagRemovedAndOffsetPosition(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    addFlags(8);
    offsetPosition(paramInt2, paramBoolean);
    mPosition = paramInt1;
  }
  
  public final int getAbsoluteAdapterPosition()
  {
    RecyclerView localRecyclerView = mOwnerRecyclerView;
    if (localRecyclerView == null) {
      return -1;
    }
    return localRecyclerView.getAdapterPositionInRecyclerView(this);
  }
  
  @Deprecated
  public final int getAdapterPosition()
  {
    return getBindingAdapterPosition();
  }
  
  @Nullable
  public final RecyclerView.Adapter<? extends ViewHolder> getBindingAdapter()
  {
    return mBindingAdapter;
  }
  
  public final int getBindingAdapterPosition()
  {
    if (mBindingAdapter == null) {
      return -1;
    }
    Object localObject = mOwnerRecyclerView;
    if (localObject == null) {
      return -1;
    }
    localObject = ((RecyclerView)localObject).getAdapter();
    if (localObject == null) {
      return -1;
    }
    int i = mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
    if (i == -1) {
      return -1;
    }
    return ((RecyclerView.Adapter)localObject).findRelativeAdapterPositionIn(mBindingAdapter, this, i);
  }
  
  public final long getItemId()
  {
    return mItemId;
  }
  
  public final int getItemViewType()
  {
    return mItemViewType;
  }
  
  public final int getLayoutPosition()
  {
    int i = mPreLayoutPosition;
    int j = i;
    if (i == -1) {
      j = mPosition;
    }
    return j;
  }
  
  public final int getOldPosition()
  {
    return mOldPosition;
  }
  
  @Deprecated
  public final int getPosition()
  {
    int i = mPreLayoutPosition;
    int j = i;
    if (i == -1) {
      j = mPosition;
    }
    return j;
  }
  
  public List<Object> getUnmodifiedPayloads()
  {
    if ((mFlags & 0x400) == 0)
    {
      List localList = mPayloads;
      if ((localList != null) && (localList.size() != 0)) {
        return mUnmodifiedPayloads;
      }
      return FULLUPDATE_PAYLOADS;
    }
    return FULLUPDATE_PAYLOADS;
  }
  
  public boolean hasAnyOfTheFlags(int paramInt)
  {
    boolean bool;
    if ((paramInt & mFlags) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAdapterPositionUnknown()
  {
    boolean bool;
    if (((mFlags & 0x200) == 0) && (!isInvalid())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isAttachedToTransitionOverlay()
  {
    boolean bool;
    if ((itemView.getParent() != null) && (itemView.getParent() != mOwnerRecyclerView)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean isBound()
  {
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isInvalid()
  {
    boolean bool;
    if ((mFlags & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isRecyclable()
  {
    boolean bool;
    if (((mFlags & 0x10) == 0) && (!ViewCompat.hasTransientState(itemView))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isRemoved()
  {
    boolean bool;
    if ((mFlags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isScrap()
  {
    boolean bool;
    if (mScrapContainer != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isTmpDetached()
  {
    boolean bool;
    if ((mFlags & 0x100) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isUpdated()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean needsUpdate()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void offsetPosition(int paramInt, boolean paramBoolean)
  {
    if (mOldPosition == -1) {
      mOldPosition = mPosition;
    }
    if (mPreLayoutPosition == -1) {
      mPreLayoutPosition = mPosition;
    }
    if (paramBoolean) {
      mPreLayoutPosition += paramInt;
    }
    mPosition += paramInt;
    if (itemView.getLayoutParams() != null) {
      itemView.getLayoutParams()).mInsetsDirty = true;
    }
  }
  
  public void onEnteredHiddenState(RecyclerView paramRecyclerView)
  {
    int i = mPendingAccessibilityState;
    if (i != -1) {
      mWasImportantForAccessibilityBeforeHidden = i;
    } else {
      mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(itemView);
    }
    paramRecyclerView.setChildImportantForAccessibilityInternal(this, 4);
  }
  
  public void onLeftHiddenState(RecyclerView paramRecyclerView)
  {
    paramRecyclerView.setChildImportantForAccessibilityInternal(this, mWasImportantForAccessibilityBeforeHidden);
    mWasImportantForAccessibilityBeforeHidden = 0;
  }
  
  public void resetInternal()
  {
    mFlags = 0;
    mPosition = -1;
    mOldPosition = -1;
    mItemId = -1L;
    mPreLayoutPosition = -1;
    mIsRecyclableCount = 0;
    mShadowedHolder = null;
    mShadowingHolder = null;
    clearPayload();
    mWasImportantForAccessibilityBeforeHidden = 0;
    mPendingAccessibilityState = -1;
    RecyclerView.clearNestedRecyclerViewIfNotNested(this);
  }
  
  public void saveOldPosition()
  {
    if (mOldPosition == -1) {
      mOldPosition = mPosition;
    }
  }
  
  public void setFlags(int paramInt1, int paramInt2)
  {
    mFlags = (paramInt1 & paramInt2 | mFlags & paramInt2);
  }
  
  public final void setIsRecyclable(boolean paramBoolean)
  {
    int i = mIsRecyclableCount;
    if (paramBoolean) {
      i--;
    } else {
      i++;
    }
    mIsRecyclableCount = i;
    if (i < 0)
    {
      mIsRecyclableCount = 0;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
      localStringBuilder.append(this);
      Log.e("View", localStringBuilder.toString());
    }
    else if ((!paramBoolean) && (i == 1))
    {
      mFlags |= 0x10;
    }
    else if ((paramBoolean) && (i == 0))
    {
      mFlags &= 0xFFFFFFEF;
    }
  }
  
  public void setScrapContainer(RecyclerView.Recycler paramRecycler, boolean paramBoolean)
  {
    mScrapContainer = paramRecycler;
    mInChangeScrap = paramBoolean;
  }
  
  public boolean shouldBeKeptAsChild()
  {
    boolean bool;
    if ((mFlags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean shouldIgnore()
  {
    boolean bool;
    if ((mFlags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void stopIgnoring()
  {
    mFlags &= 0xFF7F;
  }
  
  public String toString()
  {
    if (getClass().isAnonymousClass()) {
      localObject = "ViewHolder";
    } else {
      localObject = getClass().getSimpleName();
    }
    Object localObject = z2.u((String)localObject, "{");
    ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
    ((StringBuilder)localObject).append(" position=");
    ((StringBuilder)localObject).append(mPosition);
    ((StringBuilder)localObject).append(" id=");
    ((StringBuilder)localObject).append(mItemId);
    ((StringBuilder)localObject).append(", oldPos=");
    ((StringBuilder)localObject).append(mOldPosition);
    ((StringBuilder)localObject).append(", pLpos:");
    ((StringBuilder)localObject).append(mPreLayoutPosition);
    StringBuilder localStringBuilder = new StringBuilder(((StringBuilder)localObject).toString());
    if (isScrap())
    {
      localStringBuilder.append(" scrap ");
      if (mInChangeScrap) {
        localObject = "[changeScrap]";
      } else {
        localObject = "[attachedScrap]";
      }
      localStringBuilder.append((String)localObject);
    }
    if (isInvalid()) {
      localStringBuilder.append(" invalid");
    }
    if (!isBound()) {
      localStringBuilder.append(" unbound");
    }
    if (needsUpdate()) {
      localStringBuilder.append(" update");
    }
    if (isRemoved()) {
      localStringBuilder.append(" removed");
    }
    if (shouldIgnore()) {
      localStringBuilder.append(" ignored");
    }
    if (isTmpDetached()) {
      localStringBuilder.append(" tmpDetached");
    }
    if (!isRecyclable())
    {
      localObject = z2.t(" not recyclable(");
      ((StringBuilder)localObject).append(mIsRecyclableCount);
      ((StringBuilder)localObject).append(")");
      localStringBuilder.append(((StringBuilder)localObject).toString());
    }
    if (isAdapterPositionUnknown()) {
      localStringBuilder.append(" undefined adapter position");
    }
    if (itemView.getParent() == null) {
      localStringBuilder.append(" no parent");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void unScrap()
  {
    mScrapContainer.unscrapView(this);
  }
  
  public boolean wasReturnedFromScrap()
  {
    boolean bool;
    if ((mFlags & 0x20) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */